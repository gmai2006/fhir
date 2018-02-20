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

import org.fhir.entity.ReferralRequestModel;
import org.fhir.pojo.ReferralRequest;
import org.fhir.pojo.ReferralRequestHelper;
import org.fhir.utils.QueryBuilder;

public class ReferralRequestDaoImpl implements ReferralRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ReferralRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ReferralRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ReferralRequestModel model = em.find(ReferralRequestModel.class, id);
    if (null == model) return null;
    return new ReferralRequest(model);
  }

  @Override
  public List<ReferralRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ReferralRequestModel a", ReferralRequestModel.class).setMaxResults(maxResult);
      List<ReferralRequestModel> models = query.getResultList();
      return ReferralRequestHelper.fromArray2Array(models);
  }

  @Override
  public List<ReferralRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ReferralRequestModel a", ReferralRequestModel.class);
      List<ReferralRequestModel> models = query.getResultList();
      return ReferralRequestHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ReferralRequest create(ReferralRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ReferralRequestModel(e));
      return e;
  }

  @Transactional
  public ReferralRequest update(ReferralRequest e) {
      final EntityManager em = entityManagerProvider.get();
      ReferralRequestModel model = em.merge(new ReferralRequestModel(e));
      return new ReferralRequest(model);
  }
  @Override
  @Transactional
  public void delete(ReferralRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final ReferralRequestModel removed = em.find(ReferralRequestModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<ReferralRequest> findByDefinition(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.definition_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByBasedOn(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.basedOn_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByReplaces(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.replaces_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByServiceRequested(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, CodeableConcept b where a.serviceRequested_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByRequester(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, ReferralRequestRequester b where a.requester_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findBySpecialty(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, CodeableConcept b where a.specialty_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByRecipient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.recipient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByReasonCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, CodeableConcept b where a.reasonCode_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.reasonReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findBySupportingInfo(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.supportingInfo_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByRelevantHistory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Reference b where a.relevantHistory_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ReferralRequest> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ReferralRequest> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ReferralRequestModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ReferralRequest> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ReferralRequestModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ReferralRequestModel> models = query.getResultList();
    return ReferralRequestHelper.fromArray2Array(models);
  }
}