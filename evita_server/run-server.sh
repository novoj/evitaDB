#!/bin/bash
#
#
#                         _ _        ____  ____
#               _____   _(_) |_ __ _|  _ \| __ )
#              / _ \ \ / / | __/ _` | | | |  _ \
#             |  __/\ V /| | || (_| | |_| | |_) |
#              \___| \_/ |_|\__\__,_|____/|____/
#
#   Copyright (c) 2023-2024
#
#   Licensed under the Business Source License, Version 1.1 (the "License");
#   you may not use this file except in compliance with the License.
#   You may obtain a copy of the License at
#
#   https://github.com/FgForrest/evitaDB/blob/master/LICENSE
#
#   Unless required by applicable law or agreed to in writing, software
#   distributed under the License is distributed on an "AS IS" BASIS,
#   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
#   See the License for the specific language governing permissions and
#   limitations under the License.
#

java \
        -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8005 \
        -javaagent:target/evita-server.jar \
        -jar "target/evita-server.jar" \
        "configDir=../config/" \
        "logback.configurationFile=./logback.xml" \
        "storage.storageDirectory=../data " \
        "api.exposedOn=localhost" \
        "api.accessLog=true" \
        "cache.enabled=false" \
        "api.endpoints.graphQL.tlsMode=FORCE_NO_TLS" \
        "api.endpoints.rest.tlsMode=FORCE_NO_TLS" \
        "api.endpoints.lab.tlsMode=FORCE_NO_TLS" \
        "api.endpoints.gRPC.tlsMode=FORCE_NO_TLS" \
        "api.endpoints.gRPC.exposeDocsService=true"
