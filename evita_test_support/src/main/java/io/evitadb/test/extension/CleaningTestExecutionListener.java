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
 *   https://github.com/FgForrest/evitaDB/blob/master/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.test.extension;

import io.evitadb.api.requestResponse.data.DevelopmentConstants;
import io.evitadb.test.EvitaTestSupport;
import io.evitadb.test.extension.EvitaParameterResolver.DataSetInfo;
import io.evitadb.utils.Assert;
import io.evitadb.utils.ConsoleWriter;
import io.evitadb.utils.ConsoleWriter.ConsoleColor;
import io.evitadb.utils.StringUtils;
import org.apache.commons.io.FileUtils;
import org.junit.platform.engine.TestExecutionResult;
import org.junit.platform.engine.TestExecutionResult.Status;
import org.junit.platform.launcher.TestExecutionListener;
import org.junit.platform.launcher.TestIdentifier;
import org.junit.platform.launcher.TestPlan;

import java.io.IOException;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.stream.Collectors;

import static io.evitadb.test.extension.EvitaParameterResolver.DATA_SET_INFO;
import static io.evitadb.test.extension.EvitaParameterResolver.STORAGE_PATH;
import static org.junit.jupiter.api.Assertions.fail;

/**
 * This listener prepares the test directory and also cleans it.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2023
 */
public class CleaningTestExecutionListener implements TestExecutionListener, EvitaTestSupport {
	/* generated by OpenGPT, might not be real :) */
	private static final String[][] QUOTES = new String[][]{
		{"Writing tests is a lot like flossing. We all know we should do it, but somehow we never find the time.", "Jeff Atwood"},
		{"Testing is a funny word. It means 'find the bugs' when it should mean 'release quality software.'", "Ward Cunningham"},
		{"The best thing about a boolean is even if you are wrong, you are only off by a bit.", "Anonymous"},
		{"The difference between manual and automated testing is like the difference between reading a book and watching a movie.", "Anonymous"},
		{"I don't always test my code, but when I do, I do it in production.", "Anonymous"},
		{"I don't always test my code, but when I do, I test it in production.", "Anonymous"},
		{"Testing shows the presence, not the absence of bugs.", "Edsger Dijkstra"},
		{"Unit testing is like taking out the trash. Nobody likes doing it, but it must be done, or the stench will take over.", "Anonymous"},
		{"Debugging is like being the detective in a crime movie where you are also the murderer.", "Filipe Fortes"},
		{"Automated testing is like having an obedient dog. It does what you tell it to do, but sometimes it just stares at you, wagging its tail.", "Anonymous"},
		{"If at first, you don’t succeed, call it version 1.0.", "Anonymous"},
		{"I don't always test my code, but when I do, I prefer to do it in production.", "Anonymous"},
		{"Testing cannot prove the absence of bugs; only their presence.", "Edsger W. Dijkstra"},
		{"I write unit tests because I have a fear of breaking things that don't yet exist.", "Anonymous"},
		{"A computer program does what you tell it to do, not what you want it to do.", "Anonymous"},
		{"I'm not anti-social; I'm just not user-friendly.", "Anonymous"},
		{"A user interface is like a joke. If you have to explain it, it's not that good.", "Martin LeBlanc"},
		{"Why do programmers prefer dark mode? Because light attracts bugs.", "Anonymous"},
		{"Testing is an infinite process of comparing the invisible to the ambiguous in order to avoid the unthinkable happening to the anonymous.", "James Bach"},
		{"Software testing is a sport like hunting, it's bughunting.", "Amit Kalantri"},
		{"Unit tests are like toothbrushes: you should use them daily, and if you don't, everyone will know.", "Damian Maclennan"},
		{"I like my code the same way I like my coffee: covered in tests.", "Anonymous"},
		{"Why did the developer go broke? Because he used up all his cache.", "Anonymous"},
		{"A good programmer is someone who always looks both ways before crossing a one-way street.", "Doug Linder"},
		{"Debugging is like trying to find a needle in a haystack, while testing is like trying to find a needle in a pile of needles.", "Anonymous"},
		{"If at first, you don't succeed, skydiving is not for you.", "Anonymous"},
		{"The best thing about a boolean is even if you are wrong, you are only off by a bit.", "Anonymous"},
		{"Writing tests is a lot like exercise: it's hard to get started, but once you're in the habit, it's not so bad.", "Anonymous"},
		{"Automated tests are the closest thing we have to a crystal ball.", "Anonymous"},
		{"I have a great idea for a software product, but I don't want to test it.", "Anonymous"},
		{"I have a dream that one day, all software will be fully tested.", "Martin Fowler"},
		{"Debugging is like being a doctor, but you're the patient and the doctor is you.", "Anonymous"},
		{"Programmers don't die, they just GOSUB without RETURN.", "Anonymous"},
		{"If debugging is the process of removing bugs, then programming must be the process of putting them in.", "Edsger Dijkstra"},
		{"I have a joke about automated testing, but it only works in production.", "Anonymous"},
		{"Real programmers don't write documentation. If it was hard to write, it should be hard to understand.", "Anonymous"},
		{"I'm not lazy, I'm just in energy-saving mode.", "Anonymous"},
		{"Programming is like sex: one mistake and you have to support it for the rest of your life.", "Michael Sinz"},
		{"A bug is just a feature waiting to happen.", "Anonymous"},
		{"An optimist sees the glass as half full, a pessimist sees it as half empty, and an engineer sees it as twice as big as it needs to be.", "Anonymous"},
		{"Automated testing: because sometimes you just can't trust a human with a mouse.", "Anonymous"},
		{"I love deadlines. I like the whooshing sound they make as they fly by.", "Douglas Adams"},
		{"Programs must be written for people to read, and only incidentally for machines to execute.", "Harold Abelson and Gerald Jay Sussman"},
	};
	private final ConcurrentSkipListSet<String> failedTests = new ConcurrentSkipListSet<>();
	private long testsStarted;

	@Override
	public void testPlanExecutionStarted(TestPlan testPlan) {
		if (STORAGE_PATH.toFile().exists()) {
			try {
				FileUtils.cleanDirectory(STORAGE_PATH.toFile());
			} catch (IOException e) {
				fail("Failed to empty directory: " + STORAGE_PATH, e);
			}
		} else {
			Assert.isTrue(STORAGE_PATH.toFile().mkdirs(), "Fail to create directory: " + STORAGE_PATH);
		}
		System.setProperty(DevelopmentConstants.TEST_RUN, "true");
		this.testsStarted = System.nanoTime();
	}

	@Override
	public void testPlanExecutionFinished(TestPlan testPlan) {
		// close the datasets that are still opened
		Optional.ofNullable(DATA_SET_INFO.get())
			.ifPresent(it -> {
				for (Entry<String, DataSetInfo> entry : it.entrySet()) {
					entry.getValue().destroy(
						entry.getKey(), entry.getValue(), getPortManager()
					);
				}
			});

		if (!failedTests.isEmpty()) {
			ConsoleWriter.write(
				"\nFailed test count: " + failedTests.size() + ":\n" + failedTests.stream().map(it -> "\t - " + it + "\n").collect(Collectors.joining()),
				ConsoleColor.BRIGHT_RED
			);
		}
		ConsoleWriter.write("\nTests finished in: " + StringUtils.formatNano(System.nanoTime() - this.testsStarted) + "\n", ConsoleColor.BRIGHT_YELLOW);
		ConsoleWriter.write(
			"Evita statistics:\n" +
				"\t- instances created: " + EvitaParameterResolver.CREATED_EVITA_INSTANCES + "\n" +
				"\t- simultaneous instances peak: " + EvitaParameterResolver.PEAK_EVITA_INSTANCES + "\n" +
				"\t- entities created: " + EvitaParameterResolver.CREATED_EVITA_ENTITIES + "\n" +
				"\t- ports opened: " + getPortManager().getCounter() + "\n" +
				"\t- simultaneously opened ports: " + getPortManager().getPeak() + "\n\n",
			ConsoleColor.DARK_GREEN
		);

		String[] quote = QUOTES[new Random().nextInt(QUOTES.length)];
		ConsoleWriter.write(quote[0], ConsoleColor.BRIGHT_BLUE);
		ConsoleWriter.write("\n(OpenGPT believes the author is: " + quote[1] + ")\n", ConsoleColor.DARK_BLUE);

		try {
			FileUtils.cleanDirectory(STORAGE_PATH.toFile());
		} catch (IOException e) {
			fail("Failed to empty directory: " + STORAGE_PATH, e);
		}
	}

	@Override
	public void executionFinished(TestIdentifier testIdentifier, TestExecutionResult testExecutionResult) {
		if (testExecutionResult.getStatus() == Status.FAILED) {
			failedTests.add(testIdentifier.getLegacyReportingName());
		}
	}

}
