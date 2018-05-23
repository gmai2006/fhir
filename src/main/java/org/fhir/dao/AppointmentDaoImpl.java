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

import org.fhir.entity.AppointmentModel;
import org.fhir.pojo.Appointment;
import org.fhir.pojo.AppointmentHelper;
import org.fhir.utils.QueryBuilder;

public class AppointmentDaoImpl implements AppointmentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AppointmentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Appointment find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AppointmentModel model = em.find(AppointmentModel.class, id);
    if (null == model) return null;
    return new Appointment(model);
  }

  @Override
  public List<Appointment> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AppointmentModel a", AppointmentModel.class).setMaxResults(maxResult);
      List<AppointmentModel> models = query.getResultList();
      return AppointmentHelper.fromArray2Array(models);
  }

  @Override
  public List<Appointment> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AppointmentModel a", AppointmentModel.class);
      List<AppointmentModel> models = query.getResultList();
      return AppointmentHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Appointment create(Appointment e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AppointmentModel(e));
      return e;
  }

  @Transactional
  public Appointment update(Appointment e) {
      final EntityManager em = entityManagerProvider.get();
      AppointmentModel model = em.merge(new AppointmentModel(e));
      return new Appointment(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final AppointmentModel removed = em.find(AppointmentModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<Appointment> findByServiceCategory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, CodeableConcept b where a.serviceCategory_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findByServiceType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, CodeableConcept b where a.serviceType_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findBySpecialty(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, CodeableConcept b where a.specialty_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findByAppointmentType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, CodeableConcept b where a.appointmentType_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findByReason(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, CodeableConcept b where a.reason_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findByIndication(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, Reference b where a.indication_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findBySupportingInformation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, Reference b where a.supportingInformation_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findBySlot(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, Reference b where a.slot_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findByIncomingReferral(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, Reference b where a.incomingReferral_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findByParticipant(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, AppointmentParticipant b where a.participant_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Appointment> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Appointment> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AppointmentModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Appointment> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, AppointmentModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<AppointmentModel> models = query.getResultList();
    return AppointmentHelper.fromArray2Array(models);
  }
}