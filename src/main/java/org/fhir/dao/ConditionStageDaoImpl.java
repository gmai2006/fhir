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

import org.fhir.entity.ConditionStageModel;
import org.fhir.pojo.ConditionStage;

public class ConditionStageDaoImpl implements ConditionStageDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConditionStageDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ConditionStage find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConditionStageModel model = em.find(ConditionStageModel.class, id);
    if (null == model) return null;
    return new ConditionStage(model);
  }

  @Override
  public List<ConditionStage> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConditionStageModel a", ConditionStageModel.class).setMaxResults(maxResult);
      List<ConditionStageModel> models = query.getResultList();
      return ConditionStage.fromArray(models);
  }

  @Override
  public List<ConditionStage> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConditionStageModel a", ConditionStageModel.class);
      List<ConditionStageModel> models = query.getResultList();
      return ConditionStage.fromArray(models);
  }

  @Override
  @Transactional
  public ConditionStage create(ConditionStage e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConditionStageModel(e));
      return e;
  }

  @Transactional
  public ConditionStage update(ConditionStage e) {
      final EntityManager em = entityManagerProvider.get();
      ConditionStageModel model = em.merge(new ConditionStageModel(e));
      return new ConditionStage(model);
  }

  @Override
  @Transactional
  public void delete(ConditionStage e) {
      final EntityManager em = entityManagerProvider.get();
      final ConditionStageModel removed = em.find(ConditionStageModel.class, e.getId());
      em.remove(removed);
  }
}