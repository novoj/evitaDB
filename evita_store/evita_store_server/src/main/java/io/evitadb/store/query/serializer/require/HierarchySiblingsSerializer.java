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

package io.evitadb.store.query.serializer.require;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import io.evitadb.api.query.filter.FilterBy;
import io.evitadb.api.query.require.EntityFetch;
import io.evitadb.api.query.require.HierarchySiblings;
import io.evitadb.api.query.require.HierarchyStatistics;
import io.evitadb.api.query.require.StatisticsBase;
import lombok.RequiredArgsConstructor;

/**
 * This {@link Serializer} implementation reads/writes {@link HierarchySiblings} from/to binary format.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2022
 */
@RequiredArgsConstructor
public class HierarchySiblingsSerializer extends Serializer<HierarchySiblings> {

	@Override
	public void write(Kryo kryo, Output output, HierarchySiblings object) {
		output.writeString(object.getOutputName());
		kryo.writeObjectOrNull(output, object.getFilterBy(), FilterBy.class);
		kryo.writeObjectOrNull(output, object.getEntityFetch(), EntityFetch.class);
		// TODO JNO - handle enum
		output.writeBoolean(object.isStatisticRequired());
	}

	@Override
	public HierarchySiblings read(Kryo kryo, Input input, Class<? extends HierarchySiblings> type) {
		final String outputName = input.readString();
		final FilterBy filterBy = kryo.readObjectOrNull(input, FilterBy.class);
		final EntityFetch entityFetch = kryo.readObjectOrNull(input, EntityFetch.class);
		final HierarchyStatistics statistics = input.readBoolean() ? new HierarchyStatistics(StatisticsBase.COMPLETE_FILTER) : null;
		return new HierarchySiblings(outputName, filterBy, entityFetch, statistics);
	}

}
