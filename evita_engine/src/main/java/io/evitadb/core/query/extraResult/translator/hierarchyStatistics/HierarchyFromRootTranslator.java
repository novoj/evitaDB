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

package io.evitadb.core.query.extraResult.translator.hierarchyStatistics;

import io.evitadb.api.query.require.HierarchyFromRoot;
import io.evitadb.api.query.require.HierarchyStatistics;
import io.evitadb.api.query.require.StatisticsType;
import io.evitadb.core.query.common.translator.SelfTraversingTranslator;
import io.evitadb.core.query.extraResult.ExtraResultPlanningVisitor;
import io.evitadb.core.query.extraResult.ExtraResultProducer;
import io.evitadb.core.query.extraResult.translator.RequireConstraintTranslator;
import io.evitadb.core.query.extraResult.translator.hierarchyStatistics.producer.HierarchyProducerContext;
import io.evitadb.core.query.extraResult.translator.hierarchyStatistics.producer.HierarchyStatisticsProducer;
import io.evitadb.core.query.extraResult.translator.hierarchyStatistics.producer.RootStatisticsComputer;
import io.evitadb.index.hierarchy.predicate.HierarchyTraversalPredicate;

import java.util.EnumSet;
import java.util.List;
import java.util.Optional;

/**
 * This implementation of {@link RequireConstraintTranslator} converts {@link HierarchyFromRoot} to
 * {@link RootStatisticsComputer} registered inside {@link HierarchyStatisticsProducer}. The computer instance has
 * all pointer necessary to compute result.
 * All operations in this translator are relatively cheap comparing to final result computation, that is deferred to
 * {@link HierarchyStatisticsProducer#fabricate(List)} method.
 *
 * @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2022
 */
public class HierarchyFromRootTranslator
	extends AbstractHierarchyTranslator
	implements RequireConstraintTranslator<HierarchyFromRoot>, SelfTraversingTranslator {

	@Override
	public ExtraResultProducer apply(HierarchyFromRoot fromRoot, ExtraResultPlanningVisitor extraResultPlanningVisitor) {
		final HierarchyStatisticsProducer producer = getHierarchyStatisticsProducer(extraResultPlanningVisitor);
		final Optional<HierarchyStatistics> statistics = fromRoot.getStatistics();
		final HierarchyProducerContext context = producer.getContext(fromRoot.getName());
		final HierarchyTraversalPredicate scopePredicate = fromRoot.getStopAt()
			.map(it -> stopAtConstraintToPredicate(context, it))
			.orElse(HierarchyTraversalPredicate.NEVER_STOP_PREDICATE);
		producer.addComputer(
			fromRoot.getName(),
			fromRoot.getOutputName(),
			new RootStatisticsComputer(
				context,
				createEntityFetcher(
					fromRoot.getEntityFetch().orElse(null),
					producer.getContext(fromRoot.getName())
				),
				context.hierarchyFilterPredicateProducer(),
				extraResultPlanningVisitor.getQueryContext().getHierarchyExclusionPredicate(),
				scopePredicate,
				statistics.map(HierarchyStatistics::getStatisticsBase).orElse(null),
				statistics.map(HierarchyStatistics::getStatisticsType).orElseGet(() -> EnumSet.noneOf(StatisticsType.class))
			)
		);
		return producer;
	}
}
