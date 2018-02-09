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

import org.fhir.entity.TaskRestrictionModel;
import org.fhir.pojo.TaskRestriction;

public class TaskRestrictionDaoImpl implements TaskRestrictionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public TaskRestrictionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public TaskRestriction find(String id) {
    final EntityManager em = entityManagerProvider.get();
    TaskRestrictionModel model = em.find(TaskRestrictionModel.class, id);
    if (null == model) return null;
    return new TaskRestriction(model);
  }

  @Override
  public List<TaskRestriction> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from TaskRestrictionModel a", TaskRestrictionModel.class).setMaxResults(maxResult);
      List<TaskRestrictionModel> models = query.getResultList();
      return TaskRestriction.fromArray(models);
  }

  @Override
  public List<TaskRestriction> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from TaskRestrictionModel a", TaskRestrictionModel.class);
      List<TaskRestrictionModel> models = query.getResultList();
      return TaskRestriction.fromArray(models);
  }

  @Override
  @Transactional
  public TaskRestriction create(TaskRestriction e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new TaskRestrictionModel(e));
      return e;
  }

  @Transactional
  public TaskRestriction update(TaskRestriction e) {
      final EntityManager em = entityManagerProvider.get();
      TaskRestrictionModel model = em.merge(new TaskRestrictionModel(e));
      return new TaskRestriction(model);
  }

  @Override
  @Transactional
  public void delete(TaskRestriction e) {
      final EntityManager em = entityManagerProvider.get();
      final TaskRestrictionModel removed = em.find(TaskRestrictionModel.class, e.getId());
      em.remove(removed);
  }
}