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

import org.fhir.entity.CapabilityStatementModel;
import org.fhir.pojo.CapabilityStatement;
import org.fhir.pojo.CapabilityStatementHelper;
import org.fhir.utils.QueryBuilder;

public class CapabilityStatementDaoImpl implements CapabilityStatementDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CapabilityStatementDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CapabilityStatement find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CapabilityStatementModel model = em.find(CapabilityStatementModel.class, id);
    if (null == model) return null;
    return new CapabilityStatement(model);
  }

  @Override
  public List<CapabilityStatement> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementModel a", CapabilityStatementModel.class).setMaxResults(maxResult);
      List<CapabilityStatementModel> models = query.getResultList();
      return CapabilityStatementHelper.fromArray2Array(models);
  }

  @Override
  public List<CapabilityStatement> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementModel a", CapabilityStatementModel.class);
      List<CapabilityStatementModel> models = query.getResultList();
      return CapabilityStatementHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public CapabilityStatement create(CapabilityStatement e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CapabilityStatementModel(e));
      return e;
  }

  @Transactional
  public CapabilityStatement update(CapabilityStatement e) {
      final EntityManager em = entityManagerProvider.get();
      CapabilityStatementModel model = em.merge(new CapabilityStatementModel(e));
      return new CapabilityStatement(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final CapabilityStatementModel removed = em.find(CapabilityStatementModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<CapabilityStatement> findByContact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, ContactDetail b where a.contact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByUseContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, UsageContext b where a.useContext_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByJurisdiction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, CodeableConcept b where a.jurisdiction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findBySoftware(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, CapabilityStatementSoftware b where a.software_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByImplementation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, CapabilityStatementImplementation b where a.implementation_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByProfile(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, Reference b where a.profile_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByRest(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, CapabilityStatementRest b where a.rest_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByMessaging(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, CapabilityStatementMessaging b where a.messaging_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByDocument(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, CapabilityStatementDocument b where a.document_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CapabilityStatement> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<CapabilityStatement> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CapabilityStatementModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<CapabilityStatement> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, CapabilityStatementModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<CapabilityStatementModel> models = query.getResultList();
    return CapabilityStatementHelper.fromArray2Array(models);
  }
}