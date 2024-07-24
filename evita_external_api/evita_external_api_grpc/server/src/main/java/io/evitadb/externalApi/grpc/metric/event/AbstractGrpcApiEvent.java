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

package io.evitadb.externalApi.grpc.metric.event;

import io.evitadb.api.observability.annotation.EventGroup;
import io.evitadb.core.metric.event.CustomMetricsExecutionEvent;
import jdk.jfr.Category;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * This event is base class for all gRPC API related events.
 */
@EventGroup(
	value = AbstractGrpcApiEvent.PACKAGE_NAME,
	name = "evitaDB - gRPC Request",
	description = "evitaDB events relating to gRPC request processing."
)
@Category({"evitaDB", "API", "gRPC"})
@RequiredArgsConstructor
@Getter
abstract class AbstractGrpcApiEvent extends CustomMetricsExecutionEvent {
	protected static final String PACKAGE_NAME = "io.evitadb.api.grpc";

}
