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

import org.fhir.entity.PlanDefinitionModel;
import org.fhir.pojo.PlanDefinition;

public class PlanDefinitionDaoImpl implements PlanDefinitionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PlanDefinitionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PlanDefinition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PlanDefinitionModel model = em.find(PlanDefinitionModel.class, id);
    if (null == model) return null;
    return new PlanDefinition(model);
  }

  @Override
  public List<PlanDefinition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PlanDefinitionModel a", PlanDefinitionModel.class).setMaxResults(maxResult);
      List<PlanDefinitionModel> models = query.getResultList();
      return PlanDefinition.fromArray(models);
  }

  @Override
  public List<PlanDefinition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PlanDefinitionModel a", PlanDefinitionModel.class);
      List<PlanDefinitionModel> models = query.getResultList();
      return PlanDefinition.fromArray(models);
  }

  @Override
  @Transactional
  public PlanDefinition create(PlanDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PlanDefinitionModel(e));
      return e;
  }

  @Transactional
  public PlanDefinition update(PlanDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      PlanDefinitionModel model = em.merge(new PlanDefinitionModel(e));
      return new PlanDefinition(model);
  }

  @Override
  @Transactional
  public void delete(PlanDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      final PlanDefinitionModel removed = em.find(PlanDefinitionModel.class, e.getId());
      em.remove(removed);
  }
}