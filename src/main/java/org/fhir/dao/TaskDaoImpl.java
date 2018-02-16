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

import org.fhir.entity.TaskModel;
import org.fhir.pojo.Task;
import org.fhir.pojo.TaskHelper;
import org.fhir.utils.QueryBuilder;

public class TaskDaoImpl implements TaskDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public TaskDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Task find(String id) {
    final EntityManager em = entityManagerProvider.get();
    TaskModel model = em.find(TaskModel.class, id);
    if (null == model) return null;
    return new Task(model);
  }

  @Override
  public List<Task> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from TaskModel a", TaskModel.class).setMaxResults(maxResult);
      List<TaskModel> models = query.getResultList();
      return TaskHelper.fromArray2Array(models);
  }

  @Override
  public List<Task> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from TaskModel a", TaskModel.class);
      List<TaskModel> models = query.getResultList();
      return TaskHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Task create(Task e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new TaskModel(e));
      return e;
  }

  @Transactional
  public Task update(Task e) {
      final EntityManager em = entityManagerProvider.get();
      TaskModel model = em.merge(new TaskModel(e));
      return new Task(model);
  }
  @Override
  @Transactional
  public void delete(Task e) {
      final EntityManager em = entityManagerProvider.get();
      final TaskModel removed = em.find(TaskModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Task> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TaskModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Task> findByFocus(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TaskModel a, Reference b where a.focus_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Task> findByOwner(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TaskModel a, Reference b where a.owner_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Task> findByRequester(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TaskModel a, TaskRequester b where a.requester_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Task> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TaskModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Task> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, TaskModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<TaskModel> models = query.getResultList();
    return TaskHelper.fromArray2Array(models);
  }
}