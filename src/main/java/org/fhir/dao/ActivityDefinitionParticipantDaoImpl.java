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

import org.fhir.entity.ActivityDefinitionParticipantModel;
import org.fhir.pojo.ActivityDefinitionParticipant;

public class ActivityDefinitionParticipantDaoImpl implements ActivityDefinitionParticipantDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ActivityDefinitionParticipantDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ActivityDefinitionParticipant find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ActivityDefinitionParticipantModel model = em.find(ActivityDefinitionParticipantModel.class, id);
    if (null == model) return null;
    return new ActivityDefinitionParticipant(model);
  }

  @Override
  public List<ActivityDefinitionParticipant> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ActivityDefinitionParticipantModel a", ActivityDefinitionParticipantModel.class).setMaxResults(maxResult);
      List<ActivityDefinitionParticipantModel> models = query.getResultList();
      return ActivityDefinitionParticipant.fromArray(models);
  }

  @Override
  public List<ActivityDefinitionParticipant> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ActivityDefinitionParticipantModel a", ActivityDefinitionParticipantModel.class);
      List<ActivityDefinitionParticipantModel> models = query.getResultList();
      return ActivityDefinitionParticipant.fromArray(models);
  }

  @Override
  @Transactional
  public ActivityDefinitionParticipant create(ActivityDefinitionParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ActivityDefinitionParticipantModel(e));
      return e;
  }

  @Transactional
  public ActivityDefinitionParticipant update(ActivityDefinitionParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      ActivityDefinitionParticipantModel model = em.merge(new ActivityDefinitionParticipantModel(e));
      return new ActivityDefinitionParticipant(model);
  }

  @Override
  @Transactional
  public void delete(ActivityDefinitionParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      final ActivityDefinitionParticipantModel removed = em.find(ActivityDefinitionParticipantModel.class, e.getId());
      em.remove(removed);
  }
}