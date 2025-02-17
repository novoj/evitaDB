/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2024
 *
 *   Licensed under the Business Source License, Version 1.1 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   https://github.com/FgForrest/evitaDB/blob/master/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.core.file;

import com.google.common.collect.Lists;
import io.evitadb.api.configuration.StorageOptions;
import io.evitadb.api.file.FileForFetch;
import io.evitadb.core.file.ExportFileService.ExportFileHandle;
import io.evitadb.dataType.PaginatedList;
import io.evitadb.test.EvitaTestSupport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * This test verifies behavior of {@link ExportFileService}.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2024
 */
class ExportFileServiceTest implements EvitaTestSupport {
	private static final String SUBDIR_NAME = "exportFileServiceTest";
	private final StorageOptions storageOptions = StorageOptions.builder(
			StorageOptions.temporary()
		)
		.exportDirectory(getPathInTargetDirectory(SUBDIR_NAME))
		.build();
	private final ExportFileService exportFileService = new ExportFileService(storageOptions);

	@BeforeEach
	void setUp() throws IOException {
		cleanTestSubDirectory(SUBDIR_NAME);
	}

	@Test
	void shouldStoreNewFile() throws IOException {
		writeFile("testFile.txt", "A,B");

		// verify the file was written
		final PaginatedList<FileForFetch> files = exportFileService.listFilesToFetch(1, Integer.MAX_VALUE, null);
		assertEquals(1, files.getTotalRecordCount());

		final FileForFetch fileForFetch = files.getData().get(0);
		assertEquals("testFile.txt", fileForFetch.name());
		assertEquals("With description ...", fileForFetch.description());
		assertEquals("text/plain", fileForFetch.contentType());
		assertEquals(15, fileForFetch.totalSizeInBytes());
		assertArrayEquals(new String[] {"A", "B"}, fileForFetch.origin());

		// verify the file content
		assertEquals("testFileContent", Files.readString(fileForFetch.path(storageOptions.exportDirectory()), StandardCharsets.UTF_8));
	}

	@Test
	void shouldListAndFilterFiles() throws IOException {
		final Random rnd = new Random();
		final List<String[]> tags = new ArrayList<>(32);
		for (int i = 0; i < 28; i++) {
			final String[] theTags = Stream.generate(() -> Character.toString((char) ('A' + rnd.nextInt(16))))
				.limit(5)
				.toArray(String[]::new);
			tags.add(theTags);
			writeFile(
				"testFile" + i + ".txt",
				String.join(",", theTags)
			);
		}

		final PaginatedList<FileForFetch> fileForFetches = this.exportFileService.listFilesToFetch(1, 5, null);
		assertArrayEquals(
			new String[] {
				"testFile27.txt", "testFile26.txt", "testFile25.txt", "testFile24.txt", "testFile23.txt"
			},
			fileForFetches.getData().stream().map(FileForFetch::name).toArray(String[]::new)
		);
		assertEquals(28, fileForFetches.getTotalRecordCount());

		assertArrayEquals(
			new String[] {
				"testFile2.txt", "testFile1.txt", "testFile0.txt"
			},
			this.exportFileService.listFilesToFetch(6, 5, null)
				.getData().stream().map(FileForFetch::name).toArray(String[]::new)
		);

		final List<String> filteredNames = new ArrayList<>(32);
		for (int i = 0; i < tags.size(); i++) {
			final String[] tag = tags.get(i);
			if (Arrays.asList(tag).contains("A")) {
				filteredNames.add("testFile" + i + ".txt");
			}
		}

		assertArrayEquals(
			Lists.reverse(filteredNames).stream().limit(10).toArray(String[]::new),
			this.exportFileService.listFilesToFetch(1, 10, "A")
				.getData().stream().map(FileForFetch::name).toArray(String[]::new)
		);
	}

	@Test
	void shouldDeleteFile() throws IOException {
		for (int i = 0; i < 5; i++) {
			writeFile("testFile" + i + ".txt", null);
		}

		assertEquals(
			10, numberOfFiles(storageOptions.exportDirectory())
		);

		final PaginatedList<FileForFetch> filesBeforeDelete = this.exportFileService.listFilesToFetch(1, 20, null);
		assertEquals(5, filesBeforeDelete.getTotalRecordCount());

		this.exportFileService.deleteFile(filesBeforeDelete.getData().get(0).fileId());
		this.exportFileService.deleteFile(filesBeforeDelete.getData().get(3).fileId());

		assertEquals(3, this.exportFileService.listFilesToFetch(1, 20, null).getTotalRecordCount());

		assertEquals(
			6, numberOfFiles(storageOptions.exportDirectory())
		);
	}

	@Test
	void shouldFetchFile() throws IOException {
		final FileForFetch storedFile = writeFile("testFile.txt", "A,B");

		try (final InputStream inputStream = this.exportFileService.fetchFile(storedFile.fileId())) {
			final String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
			assertEquals("testFileContent", content);
		}
	}

	@Nullable
	private FileForFetch writeFile(@Nonnull String fileName, @Nonnull String withOrigin) throws IOException {
		final ExportFileHandle exportFileHandle = exportFileService.storeFile(
			fileName,
			"With description ...",
			"text/plain",
			withOrigin
		);
		try (final OutputStream outputStream = exportFileHandle.outputStream()) {
			outputStream.write("testFileContent".getBytes());
		}
		return exportFileHandle.fileForFetchFuture().getNow(null);
	}

	/**
	 * Method returns number files in target directory.
	 *
	 * @param path path to the catalog directory
	 * @return number of files
	 * @throws IOException when the directory cannot be read
	 */
	private static int numberOfFiles(@Nonnull Path path) throws IOException {
		try (final Stream<Path> list = Files.list(path)) {
			return list
				.mapToInt(it -> 1)
				.sum();
		}
	}

}
