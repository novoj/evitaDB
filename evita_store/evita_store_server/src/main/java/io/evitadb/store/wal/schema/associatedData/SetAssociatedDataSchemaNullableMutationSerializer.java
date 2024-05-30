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

package io.evitadb.store.wal.schema.associatedData;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryo.Serializer;
import com.esotericsoftware.kryo.io.Input;
import com.esotericsoftware.kryo.io.Output;
import io.evitadb.api.requestResponse.schema.mutation.associatedData.SetAssociatedDataSchemaNullableMutation;

/**
 * Serializer for {@link SetAssociatedDataSchemaNullableMutation}.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2023
 */
public class SetAssociatedDataSchemaNullableMutationSerializer extends Serializer<SetAssociatedDataSchemaNullableMutation> {

	@Override
	public void write(Kryo kryo, Output output, SetAssociatedDataSchemaNullableMutation mutation) {
		output.writeString(mutation.getName());
		output.writeBoolean(mutation.isNullable());
	}

	@Override
	public SetAssociatedDataSchemaNullableMutation read(Kryo kryo, Input input, Class<? extends SetAssociatedDataSchemaNullableMutation> type) {
		return new SetAssociatedDataSchemaNullableMutation(
			input.readString(),
			input.readBoolean()
		);
	}
}
