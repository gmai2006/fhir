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

import org.fhir.entity.CommunicationRequestModel;
import org.fhir.pojo.CommunicationRequest;
import org.fhir.pojo.CommunicationRequestHelper;
import org.fhir.utils.QueryBuilder;

public class CommunicationRequestDaoImpl implements CommunicationRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CommunicationRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CommunicationRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CommunicationRequestModel model = em.find(CommunicationRequestModel.class, id);
    if (null == model) return null;
    return new CommunicationRequest(model);
  }

  @Override
  public List<CommunicationRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CommunicationRequestModel a", CommunicationRequestModel.class).setMaxResults(maxResult);
      List<CommunicationRequestModel> models = query.getResultList();
      return CommunicationRequestHelper.fromArray2Array(models);
  }

  @Override
  public List<CommunicationRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CommunicationRequestModel a", CommunicationRequestModel.class);
      List<CommunicationRequestModel> models = query.getResultList();
      return CommunicationRequestHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public CommunicationRequest create(CommunicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CommunicationRequestModel(e));
      return e;
  }

  @Transactional
  public CommunicationRequest update(CommunicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      CommunicationRequestModel model = em.merge(new CommunicationRequestModel(e));
      return new CommunicationRequest(model);
  }
  @Override
  @Transactional
  public void delete(CommunicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final CommunicationRequestModel removed = em.find(CommunicationRequestModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<CommunicationRequest> findByBasedOn(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Reference b where a.basedOn_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByReplaces(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Reference b where a.replaces_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByCategory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, CodeableConcept b where a.category_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByMedium(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, CodeableConcept b where a.medium_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByRecipient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Reference b where a.recipient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByTopic(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Reference b where a.topic_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByPayload(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, CommunicationRequestPayload b where a.payload_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findBySender(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Reference b where a.sender_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByRequester(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, CommunicationRequestRequester b where a.requester_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByReasonCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, CodeableConcept b where a.reasonCode_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Reference b where a.reasonReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CommunicationRequest> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<CommunicationRequest> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CommunicationRequestModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<CommunicationRequest> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, CommunicationRequestModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<CommunicationRequestModel> models = query.getResultList();
    return CommunicationRequestHelper.fromArray2Array(models);
  }
}