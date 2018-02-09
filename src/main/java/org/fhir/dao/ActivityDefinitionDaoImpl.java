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

import org.fhir.entity.ActivityDefinitionModel;
import org.fhir.pojo.ActivityDefinition;

public class ActivityDefinitionDaoImpl implements ActivityDefinitionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ActivityDefinitionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ActivityDefinition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ActivityDefinitionModel model = em.find(ActivityDefinitionModel.class, id);
    if (null == model) return null;
    return new ActivityDefinition(model);
  }

  @Override
  public List<ActivityDefinition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ActivityDefinitionModel a", ActivityDefinitionModel.class).setMaxResults(maxResult);
      List<ActivityDefinitionModel> models = query.getResultList();
      return ActivityDefinition.fromArray(models);
  }

  @Override
  public List<ActivityDefinition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ActivityDefinitionModel a", ActivityDefinitionModel.class);
      List<ActivityDefinitionModel> models = query.getResultList();
      return ActivityDefinition.fromArray(models);
  }

  @Override
  @Transactional
  public ActivityDefinition create(ActivityDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ActivityDefinitionModel(e));
      return e;
  }

  @Transactional
  public ActivityDefinition update(ActivityDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      ActivityDefinitionModel model = em.merge(new ActivityDefinitionModel(e));
      return new ActivityDefinition(model);
  }

  @Override
  @Transactional
  public void delete(ActivityDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      final ActivityDefinitionModel removed = em.find(ActivityDefinitionModel.class, e.getId());
      em.remove(removed);
  }
}