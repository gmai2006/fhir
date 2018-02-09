/*
 * #%L
 * FHIR Implementation
 * %%
 * Copyright (C) 2018 DataScience 9 LLC
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
 
/**
 * This code is 100% AUTO generated. Please do not modify it DIRECTLY
 * If you need new features or function or changes please update the templates
 * then submit the template through our web interface.  
 */

package org.fhir.dao;

import static java.util.Objects.requireNonNull;
import java.util.List;
import org.fhir.entity.*;
import javax.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.inject.Provider;

import org.fhir.entity.GraphDefinitionTargetModel;
import org.fhir.pojo.GraphDefinitionTarget;

public class GraphDefinitionTargetDaoImpl implements GraphDefinitionTargetDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public GraphDefinitionTargetDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public GraphDefinitionTarget find(String id) {
    final EntityManager em = entityManagerProvider.get();
    GraphDefinitionTargetModel model = em.find(GraphDefinitionTargetModel.class, id);
    if (null == model) return null;
    return new GraphDefinitionTarget(model);
  }

  @Override
  public List<GraphDefinitionTarget> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GraphDefinitionTargetModel a", GraphDefinitionTargetModel.class).setMaxResults(maxResult);
      List<GraphDefinitionTargetModel> models = query.getResultList();
      return GraphDefinitionTarget.fromArray(models);
  }

  @Override
  public List<GraphDefinitionTarget> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GraphDefinitionTargetModel a", GraphDefinitionTargetModel.class);
      List<GraphDefinitionTargetModel> models = query.getResultList();
      return GraphDefinitionTarget.fromArray(models);
  }

  @Override
  @Transactional
  public GraphDefinitionTarget create(GraphDefinitionTarget e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new GraphDefinitionTargetModel(e));
      return e;
  }

  @Transactional
  public GraphDefinitionTarget update(GraphDefinitionTarget e) {
      final EntityManager em = entityManagerProvider.get();
      GraphDefinitionTargetModel model = em.merge(new GraphDefinitionTargetModel(e));
      return new GraphDefinitionTarget(model);
  }

  @Override
  @Transactional
  public void delete(GraphDefinitionTarget e) {
      final EntityManager em = entityManagerProvider.get();
      final GraphDefinitionTargetModel removed = em.find(GraphDefinitionTargetModel.class, e.getId());
      em.remove(removed);
  }
}