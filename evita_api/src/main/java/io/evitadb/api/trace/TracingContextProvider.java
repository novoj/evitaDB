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
 *   https://github.com/FgForrest/evitaDB/blob/main/LICENSE
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package io.evitadb.api.trace;

import io.evitadb.exception.EvitaInternalError;

import java.util.List;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;

/**
 * Provider for fetching registered and used {@link TracingContext} implementation that are fetched via {@link ServiceLoader}.
 *
 * @author Tomáš Pozler, FG Forrest a.s. (c) 2024
 */
public class TracingContextProvider {
	private static TracingContext context;

	/**
	 * Fetches and caches the {@link TracingContext} implementation. After the first call, the cached instance
	 * is always returned.
	 */
	public static TracingContext getContext() {
		if (context == null) {
			context = loadContext();
		}
		return context;
	}

	private static TracingContext loadContext() {
		final List<TracingContext> collectedContexts = ServiceLoader.load(TracingContext.class)
			.stream()
			.map(Provider::get)
			.toList();
		if (collectedContexts.size() > 1) {
			throw new EvitaInternalError("There are multiple registered implementations of TracingContext.");
		}
		if (collectedContexts.size() == 1) {
			return collectedContexts.stream().findFirst().get();
		}
		return new DefaultTracingContext();
	}
}
