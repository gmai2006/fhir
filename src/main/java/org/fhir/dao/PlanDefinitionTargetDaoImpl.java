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

import org.fhir.entity.PlanDefinitionTargetModel;
import org.fhir.pojo.PlanDefinitionTarget;

public class PlanDefinitionTargetDaoImpl implements PlanDefinitionTargetDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PlanDefinitionTargetDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PlanDefinitionTarget find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PlanDefinitionTargetModel model = em.find(PlanDefinitionTargetModel.class, id);
    if (null == model) return null;
    return new PlanDefinitionTarget(model);
  }

  @Override
  public List<PlanDefinitionTarget> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PlanDefinitionTargetModel a", PlanDefinitionTargetModel.class).setMaxResults(maxResult);
      List<PlanDefinitionTargetModel> models = query.getResultList();
      return PlanDefinitionTarget.fromArray(models);
  }

  @Override
  public List<PlanDefinitionTarget> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PlanDefinitionTargetModel a", PlanDefinitionTargetModel.class);
      List<PlanDefinitionTargetModel> models = query.getResultList();
      return PlanDefinitionTarget.fromArray(models);
  }

  @Override
  @Transactional
  public PlanDefinitionTarget create(PlanDefinitionTarget e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PlanDefinitionTargetModel(e));
      return e;
  }

  @Transactional
  public PlanDefinitionTarget update(PlanDefinitionTarget e) {
      final EntityManager em = entityManagerProvider.get();
      PlanDefinitionTargetModel model = em.merge(new PlanDefinitionTargetModel(e));
      return new PlanDefinitionTarget(model);
  }

  @Override
  @Transactional
  public void delete(PlanDefinitionTarget e) {
      final EntityManager em = entityManagerProvider.get();
      final PlanDefinitionTargetModel removed = em.find(PlanDefinitionTargetModel.class, e.getId());
      em.remove(removed);
  }
}