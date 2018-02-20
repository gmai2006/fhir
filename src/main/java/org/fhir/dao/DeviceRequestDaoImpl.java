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

import org.fhir.entity.DeviceRequestModel;
import org.fhir.pojo.DeviceRequest;
import org.fhir.pojo.DeviceRequestHelper;
import org.fhir.utils.QueryBuilder;

public class DeviceRequestDaoImpl implements DeviceRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DeviceRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DeviceRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DeviceRequestModel model = em.find(DeviceRequestModel.class, id);
    if (null == model) return null;
    return new DeviceRequest(model);
  }

  @Override
  public List<DeviceRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceRequestModel a", DeviceRequestModel.class).setMaxResults(maxResult);
      List<DeviceRequestModel> models = query.getResultList();
      return DeviceRequestHelper.fromArray2Array(models);
  }

  @Override
  public List<DeviceRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceRequestModel a", DeviceRequestModel.class);
      List<DeviceRequestModel> models = query.getResultList();
      return DeviceRequestHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public DeviceRequest create(DeviceRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DeviceRequestModel(e));
      return e;
  }

  @Transactional
  public DeviceRequest update(DeviceRequest e) {
      final EntityManager em = entityManagerProvider.get();
      DeviceRequestModel model = em.merge(new DeviceRequestModel(e));
      return new DeviceRequest(model);
  }
  @Override
  @Transactional
  public void delete(DeviceRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final DeviceRequestModel removed = em.find(DeviceRequestModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<DeviceRequest> findByDefinition(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.definition_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByBasedOn(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.basedOn_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByPriorRequest(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.priorRequest_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByIntent(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, CodeableConcept b where a.intent_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByCodeReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.codeReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByCodeCodeableConcept(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, CodeableConcept b where a.codeCodeableConcept_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByRequester(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, DeviceRequestRequester b where a.requester_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByPerformerType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, CodeableConcept b where a.performerType_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByPerformer(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.performer_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByReasonCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, CodeableConcept b where a.reasonCode_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.reasonReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findBySupportingInfo(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.supportingInfo_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByRelevantHistory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Reference b where a.relevantHistory_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceRequest> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<DeviceRequest> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceRequestModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<DeviceRequest> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, DeviceRequestModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<DeviceRequestModel> models = query.getResultList();
    return DeviceRequestHelper.fromArray2Array(models);
  }
}