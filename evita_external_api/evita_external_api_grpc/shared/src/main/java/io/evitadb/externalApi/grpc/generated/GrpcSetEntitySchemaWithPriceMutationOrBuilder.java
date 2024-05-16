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

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GrpcEntitySchemaMutations.proto

package io.evitadb.externalApi.grpc.generated;

public interface GrpcSetEntitySchemaWithPriceMutationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:io.evitadb.externalApi.grpc.generated.GrpcSetEntitySchemaWithPriceMutation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether entities of this type holds price information.
   * Prices are specific to a very few entities, but because correct price computation is very complex in e-commerce
   * systems and highly affects performance of the entities filtering and sorting, they deserve first class support
   * in entity model. It is pretty common in B2B systems single product has assigned dozens of prices for the different
   * customers.
   * Specifying prices on entity allows usage of `priceValidIn`, `priceInCurrency`
   * `priceBetween`, and `priceInPriceLists` filtering constraints and also price
   * ordering of the entities. Additional requirements
   * `priceHistogram` and `priceType` can be used in query as well.
   * </pre>
   *
   * <code>bool withPrice = 1;</code>
   * @return The withPrice.
   */
  boolean getWithPrice();

  /**
   * <pre>
   * Determines how many fractional places are important when entities are compared during filtering or sorting. It is
   * important to know that all prices will be converted to `Integer`, so any of the price values
   * (either with or without tax) must not ever exceed maximum limits of `Integer` type when scaling
   * the number by the power of ten using `indexedPricePlaces` as exponent.
   * </pre>
   *
   * <code>int32 indexedPricePlaces = 2;</code>
   * @return The indexedPricePlaces.
   */
  int getIndexedPricePlaces();
}
