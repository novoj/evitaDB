/*
 *
 *                         _ _        ____  ____
 *               _____   _(_) |_ __ _|  _ \| __ )
 *              / _ \ \ / / | __/ _` | | | |  _ \
 *             |  __/\ V /| | || (_| | |_| | |_) |
 *              \___| \_/ |_|\__\__,_|____/|____/
 *
 *   Copyright (c) 2023-2024
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

package io.evitadb.externalApi.lab;

import com.linecorp.armeria.server.HttpService;
import io.evitadb.externalApi.http.ExternalApiProvider;
import io.evitadb.externalApi.lab.configuration.LabConfig;
import io.evitadb.utils.NetworkUtils;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.function.Predicate;

/**
 * Descriptor of provider of lab API and GUI.
 *
 * @author Lukáš Hornych, FG Forrest a.s. (c) 2023
 */
@Slf4j
@RequiredArgsConstructor
public class LabProvider implements ExternalApiProvider<LabConfig> {

	public static final String CODE = "lab";

	@Nonnull
	@Getter
	private final LabConfig configuration;

	@Nonnull
	@Getter
	private final HttpService apiHandler;

	/**
	 * Contains url that was at least once found reachable.
	 */
	private String reachableUrl;

	@Nonnull
	@Override
	public String getCode() {
		return CODE;
	}

	@Nonnull
	@Override
	public HttpServiceDefinition[] getHttpServiceDefinitions() {
		return new HttpServiceDefinition[]{
			new HttpServiceDefinition(apiHandler, PathHandlingMode.DYNAMIC_PATH_HANDLING)
		};
	}

	@Override
	public boolean isReady() {
		final Predicate<String> isReady = url -> NetworkUtils.fetchContent(
				url, null, "text/html", null,
				error -> log.error("Error while checking readiness of Lab API: {}", error)
			)
			.map(content -> content.contains("evitaLab app"))
			.orElse(false);
		final String[] baseUrls = this.configuration.getBaseUrls(configuration.getExposedHost());
		if (this.reachableUrl == null) {
			for (String baseUrl : baseUrls) {
				if (isReady.test(baseUrl)) {
					this.reachableUrl = baseUrl;
					return true;
				}
			}
			return false;
		} else {
			return isReady.test(this.reachableUrl);
		}
	}

}
