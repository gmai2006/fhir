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

import org.fhir.entity.PractitionerRoleModel;
import org.fhir.pojo.PractitionerRole;
import org.fhir.pojo.PractitionerRoleHelper;
import org.fhir.utils.QueryBuilder;

public class PractitionerRoleDaoImpl implements PractitionerRoleDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PractitionerRoleDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PractitionerRole find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PractitionerRoleModel model = em.find(PractitionerRoleModel.class, id);
    if (null == model) return null;
    return new PractitionerRole(model);
  }

  @Override
  public List<PractitionerRole> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PractitionerRoleModel a", PractitionerRoleModel.class).setMaxResults(maxResult);
      List<PractitionerRoleModel> models = query.getResultList();
      return PractitionerRoleHelper.fromArray2Array(models);
  }

  @Override
  public List<PractitionerRole> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PractitionerRoleModel a", PractitionerRoleModel.class);
      List<PractitionerRoleModel> models = query.getResultList();
      return PractitionerRoleHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public PractitionerRole create(PractitionerRole e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PractitionerRoleModel(e));
      return e;
  }

  @Transactional
  public PractitionerRole update(PractitionerRole e) {
      final EntityManager em = entityManagerProvider.get();
      PractitionerRoleModel model = em.merge(new PractitionerRoleModel(e));
      return new PractitionerRole(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final PractitionerRoleModel removed = em.find(PractitionerRoleModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<PractitionerRole> findByPractitioner(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, Reference b where a.practitioner_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByOrganization(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, Reference b where a.organization_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, CodeableConcept b where a.code_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findBySpecialty(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, CodeableConcept b where a.specialty_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByLocation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, Reference b where a.location_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByHealthcareService(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, Reference b where a.healthcareService_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByAvailableTime(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, PractitionerRoleAvailableTime b where a.availableTime_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByNotAvailable(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, PractitionerRoleNotAvailable b where a.notAvailable_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByEndpoint(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, Reference b where a.endpoint_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PractitionerRole> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<PractitionerRole> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PractitionerRoleModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<PractitionerRole> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, PractitionerRoleModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<PractitionerRoleModel> models = query.getResultList();
    return PractitionerRoleHelper.fromArray2Array(models);
  }
}