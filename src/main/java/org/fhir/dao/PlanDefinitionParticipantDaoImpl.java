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

import org.fhir.entity.PlanDefinitionParticipantModel;
import org.fhir.pojo.PlanDefinitionParticipant;

public class PlanDefinitionParticipantDaoImpl implements PlanDefinitionParticipantDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PlanDefinitionParticipantDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PlanDefinitionParticipant find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PlanDefinitionParticipantModel model = em.find(PlanDefinitionParticipantModel.class, id);
    if (null == model) return null;
    return new PlanDefinitionParticipant(model);
  }

  @Override
  public List<PlanDefinitionParticipant> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PlanDefinitionParticipantModel a", PlanDefinitionParticipantModel.class).setMaxResults(maxResult);
      List<PlanDefinitionParticipantModel> models = query.getResultList();
      return PlanDefinitionParticipant.fromArray(models);
  }

  @Override
  public List<PlanDefinitionParticipant> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PlanDefinitionParticipantModel a", PlanDefinitionParticipantModel.class);
      List<PlanDefinitionParticipantModel> models = query.getResultList();
      return PlanDefinitionParticipant.fromArray(models);
  }

  @Override
  @Transactional
  public PlanDefinitionParticipant create(PlanDefinitionParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PlanDefinitionParticipantModel(e));
      return e;
  }

  @Transactional
  public PlanDefinitionParticipant update(PlanDefinitionParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      PlanDefinitionParticipantModel model = em.merge(new PlanDefinitionParticipantModel(e));
      return new PlanDefinitionParticipant(model);
  }

  @Override
  @Transactional
  public void delete(PlanDefinitionParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      final PlanDefinitionParticipantModel removed = em.find(PlanDefinitionParticipantModel.class, e.getId());
      em.remove(removed);
  }
}