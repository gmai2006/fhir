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

import org.fhir.entity.ScheduleModel;
import org.fhir.pojo.Schedule;
import org.fhir.pojo.ScheduleHelper;
import org.fhir.utils.QueryBuilder;

public class ScheduleDaoImpl implements ScheduleDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ScheduleDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Schedule find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ScheduleModel model = em.find(ScheduleModel.class, id);
    if (null == model) return null;
    return new Schedule(model);
  }

  @Override
  public List<Schedule> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ScheduleModel a", ScheduleModel.class).setMaxResults(maxResult);
      List<ScheduleModel> models = query.getResultList();
      return ScheduleHelper.fromArray2Array(models);
  }

  @Override
  public List<Schedule> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ScheduleModel a", ScheduleModel.class);
      List<ScheduleModel> models = query.getResultList();
      return ScheduleHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Schedule create(Schedule e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ScheduleModel(e));
      return e;
  }

  @Transactional
  public Schedule update(Schedule e) {
      final EntityManager em = entityManagerProvider.get();
      ScheduleModel model = em.merge(new ScheduleModel(e));
      return new Schedule(model);
  }
  @Override
  @Transactional
  public void delete(Schedule e) {
      final EntityManager em = entityManagerProvider.get();
      final ScheduleModel removed = em.find(ScheduleModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Schedule> findByServiceCategory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ScheduleModel a, CodeableConcept b where a.serviceCategory_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Schedule> findByServiceType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ScheduleModel a, CodeableConcept b where a.serviceType_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Schedule> findBySpecialty(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ScheduleModel a, CodeableConcept b where a.specialty_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Schedule> findByActor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ScheduleModel a, Reference b where a.actor_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Schedule> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ScheduleModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Schedule> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ScheduleModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Schedule> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ScheduleModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Schedule> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ScheduleModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ScheduleModel> models = query.getResultList();
    return ScheduleHelper.fromArray2Array(models);
  }
}