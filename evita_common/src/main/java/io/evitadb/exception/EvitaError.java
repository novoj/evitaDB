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

package io.evitadb.exception;

import javax.annotation.Nonnull;

/**
 * This interface provides standardized access to the information from the exceptions that are generated by the Evita.
 * All exceptions in evitaDB should extend either from {@link EvitaInvalidUsageException} or {@link EvitaInternalError}
 * that both implement this interface.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2022
 */
public interface EvitaError {

	/**
	 * Returns unique error code in the form of `a7bc7497b48ee475:a7ff9c271bf702a6:16` that identifies the place where
	 * the error originated. The code consist of MD5 hash of class name, method name and
	 * finally line of code where the exception was thrown.
	 *
	 * The code is unique, can be safely passed to the client while it still doesn't leak any sensitive information such
	 * as original stack trace data. With a limited effort it should be possible to track the exact position of
	 * the place where was the exception thrown from this code.
	 */
	@Nonnull
	String getErrorCode();

	/**
	 * Returns error message that is targeted for the internal use of the evitaDB - such as logging facility or
	 * error reporting. The message may contain sensitive information - such as file placement, configuration details
	 * and so on. This information should stay safe on the evitaDB side (and the logs) and should not be passed
	 * on the client.
	 */
	@Nonnull
	String getPrivateMessage();

	/**
	 * Returns error message that is targeted for client. The message never contains any sensitive information but
	 * still tries to provide as much detail about the problematic situation as possible.
	 */
	@Nonnull
	String getPublicMessage();

}
