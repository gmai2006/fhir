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
import java.util.logging.Logger;
import org.fhir.entity.*;
import javax.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.inject.Provider;

import org.fhir.entity.QuestionnaireResponseModel;
import org.fhir.pojo.QuestionnaireResponse;
import org.fhir.pojo.QuestionnaireResponseHelper;
import org.fhir.utils.QueryBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public class QuestionnaireResponseDaoImpl implements QuestionnaireResponseDao {
	private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public QuestionnaireResponseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public QuestionnaireResponse find(String id) {
    final EntityManager em = entityManagerProvider.get();
    QuestionnaireResponseModel model = em.find(QuestionnaireResponseModel.class, id);
    if (null == model) return null;
    return new QuestionnaireResponse(model);
  }

  @Override
  public List<QuestionnaireResponse> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from QuestionnaireResponseModel a", QuestionnaireResponseModel.class).setMaxResults(maxResult);
      List<QuestionnaireResponseModel> models = query.getResultList();
      return QuestionnaireResponseHelper.fromArray2Array(models);
  }

  @Override
  public List<QuestionnaireResponse> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from QuestionnaireResponseModel a", QuestionnaireResponseModel.class);
      List<QuestionnaireResponseModel> models = query.getResultList();
      return QuestionnaireResponseHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public QuestionnaireResponse create(QuestionnaireResponse e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new QuestionnaireResponseModel(e));
      return e;
  }

  @Transactional
  public QuestionnaireResponse update(QuestionnaireResponse e) {
      final EntityManager em = entityManagerProvider.get();
      QuestionnaireResponseModel model = em.merge(new QuestionnaireResponseModel(e));
      return new QuestionnaireResponse(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final QuestionnaireResponseModel removed = em.find(QuestionnaireResponseModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<QuestionnaireResponse> findByBasedOn(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Reference b where a.basedOn_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findByParent(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Reference b where a.parent_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findByQuestionnaire(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Reference b where a.questionnaire_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findByAuthor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Reference b where a.author_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findBySource(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Reference b where a.source_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findByItem(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, QuestionnaireResponseItem b where a.item_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<QuestionnaireResponse> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<QuestionnaireResponse> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from QuestionnaireResponseModel a " + queryBuilder.getWhereClause();
  	logger.info(queryStr);
    return findByQuery(queryBuilder, queryStr);
  }

  private List<QuestionnaireResponse> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, QuestionnaireResponseModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<QuestionnaireResponseModel> models = query.getResultList();
    return QuestionnaireResponseHelper.fromArray2Array(models);
  }
}