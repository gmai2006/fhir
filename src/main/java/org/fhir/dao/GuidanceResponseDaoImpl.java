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

import org.fhir.entity.GuidanceResponseModel;
import org.fhir.pojo.GuidanceResponse;
import org.fhir.pojo.GuidanceResponseHelper;
import org.fhir.utils.QueryBuilder;

public class GuidanceResponseDaoImpl implements GuidanceResponseDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public GuidanceResponseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public GuidanceResponse find(String id) {
    final EntityManager em = entityManagerProvider.get();
    GuidanceResponseModel model = em.find(GuidanceResponseModel.class, id);
    if (null == model) return null;
    return new GuidanceResponse(model);
  }

  @Override
  public List<GuidanceResponse> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GuidanceResponseModel a", GuidanceResponseModel.class).setMaxResults(maxResult);
      List<GuidanceResponseModel> models = query.getResultList();
      return GuidanceResponseHelper.fromArray2Array(models);
  }

  @Override
  public List<GuidanceResponse> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GuidanceResponseModel a", GuidanceResponseModel.class);
      List<GuidanceResponseModel> models = query.getResultList();
      return GuidanceResponseHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public GuidanceResponse create(GuidanceResponse e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new GuidanceResponseModel(e));
      return e;
  }

  @Transactional
  public GuidanceResponse update(GuidanceResponse e) {
      final EntityManager em = entityManagerProvider.get();
      GuidanceResponseModel model = em.merge(new GuidanceResponseModel(e));
      return new GuidanceResponse(model);
  }
  @Override
  @Transactional
  public void delete(GuidanceResponse e) {
      final EntityManager em = entityManagerProvider.get();
      final GuidanceResponseModel removed = em.find(GuidanceResponseModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<GuidanceResponse> findByModule(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Reference b where a.module_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByPerformer(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Reference b where a.performer_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, CodeableConcept b where a.reasonCodeableConcept_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByReasonReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Reference b where a.reasonReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByEvaluationMessage(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Reference b where a.evaluationMessage_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByOutputParameters(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Reference b where a.outputParameters_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByResult(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Reference b where a.result_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByDataRequirement(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, DataRequirement b where a.dataRequirement_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<GuidanceResponse> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<GuidanceResponse> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GuidanceResponseModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<GuidanceResponse> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, GuidanceResponseModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<GuidanceResponseModel> models = query.getResultList();
    return GuidanceResponseHelper.fromArray2Array(models);
  }
}