/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2023
 *
 *   Licensed under the Business Source License, Version 1.1 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   https://github.com/FgForrest/evitaDB/blob/main/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.store.catalog;

import com.esotericsoftware.kryo.io.ByteBufferOutput;
import com.esotericsoftware.kryo.io.Input;
import io.evitadb.store.model.PersistentStorageDescriptor;
import io.evitadb.store.model.StoragePart;
import io.evitadb.store.offsetIndex.OffsetIndex;
import io.evitadb.store.service.KeyCompressor;
import io.evitadb.store.spi.StoragePartPersistenceService;
import io.evitadb.store.spi.exception.PersistenceServiceClosed;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Objects;
import java.util.stream.Stream;

/**
 * This implementation of {@link StoragePartPersistenceService} stores the parts into {@link OffsetIndex}, that is
 * mapped to a single file on disk.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2023
 */
public class OffsetIndexStoragePartPersistenceService implements StoragePartPersistenceService {

	/**
	 * Memory key-value store for entities.
	 */
	private final OffsetIndex offsetIndex;

	public OffsetIndexStoragePartPersistenceService(@Nonnull OffsetIndex offsetIndex) {
		this.offsetIndex = offsetIndex;
	}

	@Override
	public <T extends StoragePart> T getStoragePart(long storagePartPk, @Nonnull Class<T> containerType) {
		if (offsetIndex.isOperative()) {
			return this.offsetIndex.get(storagePartPk, containerType);
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Nullable
	@Override
	public <T extends StoragePart> byte[] getStoragePartAsBinary(long storagePartPk, @Nonnull Class<T> containerType) {
		if (offsetIndex.isOperative()) {
			return this.offsetIndex.getBinary(storagePartPk, containerType);
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Override
	public <T extends StoragePart> long putStoragePart(long storagePartPk, @Nonnull T container) {
		if (offsetIndex.isOperative()) {
			return this.offsetIndex.put(storagePartPk, container);
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Override
	public <T extends StoragePart> boolean removeStoragePart(long storagePartPk, @Nonnull Class<T> containerType) {
		if (offsetIndex.isOperative()) {
			return offsetIndex.remove(storagePartPk, containerType);
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Override
	public <T extends StoragePart> boolean containsStoragePart(long primaryKey, @Nonnull Class<T> containerType) {
		if (offsetIndex.isOperative()) {
			return offsetIndex.contains(primaryKey, containerType);
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Nonnull
	@Override
	public <T extends StoragePart> Stream<T> getEntryStream(@Nonnull Class<T> containerType) {
		if (offsetIndex.isOperative()) {
			final byte recType = offsetIndex.getIdForRecordType(containerType);
			return offsetIndex
				.getEntries()
				.stream()
				.filter(it -> it.getKey().recordType() == recType)
				.map(it -> offsetIndex.get(it.getValue(), containerType))
				.filter(Objects::nonNull);
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Override
	public <T extends StoragePart> int countStorageParts(@Nonnull Class<T> containerType) {
		if (offsetIndex.isOperative()) {
			return this.offsetIndex.count(containerType);
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Nonnull
	@Override
	public <T extends StoragePart> byte[] serializeStoragePart(@Nonnull T storagePart) {
		return offsetIndex.executeWithKryo(
			kryo -> {
				final ByteBufferOutput output = new ByteBufferOutput(8192, -1);
				kryo.writeObject(output, storagePart);
				return output.toBytes();
			}
		);
	}

	@Nonnull
	@Override
	public <T extends StoragePart> T deserializeStoragePart(@Nonnull byte[] storagePart, @Nonnull Class<T> containerType) {
		return offsetIndex.executeWithKryo(
			kryo -> kryo.readObject(
				new Input(storagePart), containerType
			)
		);
	}

	@Nonnull
	@Override
	public KeyCompressor getReadOnlyKeyCompressor() {
		if (offsetIndex.isOperative()) {
			return this.offsetIndex.getReadOnlyKeyCompressor();
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Override
	public long getVersion() {
		if (offsetIndex.isOperative()) {
			return offsetIndex.getVersion();
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Nonnull
	@Override
	public PersistentStorageDescriptor flush(long catalogVersion) {
		if (offsetIndex.isOperative()) {
			return this.offsetIndex.flush(catalogVersion);
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Override
	public boolean isNew() {
		if (offsetIndex.isOperative()) {
			return this.offsetIndex.getFileOffsetIndexLocation() == null;
		} else {
			throw new PersistenceServiceClosed();
		}
	}

	@Override
	public boolean isClosed() {
		return !this.offsetIndex.isOperative();
	}

	@Override
	public void close() {
		if (this.offsetIndex.isOperative()) {
			this.offsetIndex.close();
		}
	}

}
