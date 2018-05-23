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

import org.fhir.entity.HealthcareServiceModel;
import org.fhir.pojo.HealthcareService;
import org.fhir.pojo.HealthcareServiceHelper;
import org.fhir.utils.QueryBuilder;

public class HealthcareServiceDaoImpl implements HealthcareServiceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public HealthcareServiceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public HealthcareService find(String id) {
    final EntityManager em = entityManagerProvider.get();
    HealthcareServiceModel model = em.find(HealthcareServiceModel.class, id);
    if (null == model) return null;
    return new HealthcareService(model);
  }

  @Override
  public List<HealthcareService> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from HealthcareServiceModel a", HealthcareServiceModel.class).setMaxResults(maxResult);
      List<HealthcareServiceModel> models = query.getResultList();
      return HealthcareServiceHelper.fromArray2Array(models);
  }

  @Override
  public List<HealthcareService> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from HealthcareServiceModel a", HealthcareServiceModel.class);
      List<HealthcareServiceModel> models = query.getResultList();
      return HealthcareServiceHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public HealthcareService create(HealthcareService e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new HealthcareServiceModel(e));
      return e;
  }

  @Transactional
  public HealthcareService update(HealthcareService e) {
      final EntityManager em = entityManagerProvider.get();
      HealthcareServiceModel model = em.merge(new HealthcareServiceModel(e));
      return new HealthcareService(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final HealthcareServiceModel removed = em.find(HealthcareServiceModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<HealthcareService> findByProvidedBy(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, Reference b where a.providedBy_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByCategory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, CodeableConcept b where a.category_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findBySpecialty(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, CodeableConcept b where a.specialty_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByLocation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, Reference b where a.location_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByCoverageArea(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, Reference b where a.coverageArea_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByServiceProvisionCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, CodeableConcept b where a.serviceProvisionCode_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByEligibility(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, CodeableConcept b where a.eligibility_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByCharacteristic(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, CodeableConcept b where a.characteristic_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByReferralMethod(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, CodeableConcept b where a.referralMethod_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByAvailableTime(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, HealthcareServiceAvailableTime b where a.availableTime_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByNotAvailable(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, HealthcareServiceNotAvailable b where a.notAvailable_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByEndpoint(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, Reference b where a.endpoint_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<HealthcareService> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<HealthcareService> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from HealthcareServiceModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<HealthcareService> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, HealthcareServiceModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<HealthcareServiceModel> models = query.getResultList();
    return HealthcareServiceHelper.fromArray2Array(models);
  }
}