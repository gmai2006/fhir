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

import org.fhir.entity.SlotModel;
import org.fhir.pojo.Slot;
import org.fhir.pojo.SlotHelper;
import org.fhir.utils.QueryBuilder;

public class SlotDaoImpl implements SlotDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SlotDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Slot find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SlotModel model = em.find(SlotModel.class, id);
    if (null == model) return null;
    return new Slot(model);
  }

  @Override
  public List<Slot> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SlotModel a", SlotModel.class).setMaxResults(maxResult);
      List<SlotModel> models = query.getResultList();
      return SlotHelper.fromArray2Array(models);
  }

  @Override
  public List<Slot> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SlotModel a", SlotModel.class);
      List<SlotModel> models = query.getResultList();
      return SlotHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Slot create(Slot e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SlotModel(e));
      return e;
  }

  @Transactional
  public Slot update(Slot e) {
      final EntityManager em = entityManagerProvider.get();
      SlotModel model = em.merge(new SlotModel(e));
      return new Slot(model);
  }
  @Override
  @Transactional
  public void delete(Slot e) {
      final EntityManager em = entityManagerProvider.get();
      final SlotModel removed = em.find(SlotModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Slot> findByServiceCategory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SlotModel a, CodeableConcept b where a.serviceCategory_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Slot> findByServiceType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SlotModel a, CodeableConcept b where a.serviceType_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Slot> findBySpecialty(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SlotModel a, CodeableConcept b where a.specialty_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Slot> findByAppointmentType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SlotModel a, CodeableConcept b where a.appointmentType_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Slot> findBySchedule(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SlotModel a, Reference b where a.schedule_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Slot> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SlotModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Slot> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SlotModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Slot> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SlotModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Slot> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, SlotModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<SlotModel> models = query.getResultList();
    return SlotHelper.fromArray2Array(models);
  }
}