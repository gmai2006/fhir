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

import org.fhir.entity.ClinicalImpressionModel;
import org.fhir.pojo.ClinicalImpression;
import org.fhir.pojo.ClinicalImpressionHelper;
import org.fhir.utils.QueryBuilder;

public class ClinicalImpressionDaoImpl implements ClinicalImpressionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClinicalImpressionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClinicalImpression find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClinicalImpressionModel model = em.find(ClinicalImpressionModel.class, id);
    if (null == model) return null;
    return new ClinicalImpression(model);
  }

  @Override
  public List<ClinicalImpression> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClinicalImpressionModel a", ClinicalImpressionModel.class).setMaxResults(maxResult);
      List<ClinicalImpressionModel> models = query.getResultList();
      return ClinicalImpressionHelper.fromArray2Array(models);
  }

  @Override
  public List<ClinicalImpression> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClinicalImpressionModel a", ClinicalImpressionModel.class);
      List<ClinicalImpressionModel> models = query.getResultList();
      return ClinicalImpressionHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ClinicalImpression create(ClinicalImpression e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClinicalImpressionModel(e));
      return e;
  }

  @Transactional
  public ClinicalImpression update(ClinicalImpression e) {
      final EntityManager em = entityManagerProvider.get();
      ClinicalImpressionModel model = em.merge(new ClinicalImpressionModel(e));
      return new ClinicalImpression(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final ClinicalImpressionModel removed = em.find(ClinicalImpressionModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<ClinicalImpression> findByCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, CodeableConcept b where a.code_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByAssessor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Reference b where a.assessor_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByPrevious(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Reference b where a.previous_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByProblem(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Reference b where a.problem_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByInvestigation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, ClinicalImpressionInvestigation b where a.investigation_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByFinding(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, ClinicalImpressionFinding b where a.finding_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByPrognosisCodeableConcept(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, CodeableConcept b where a.prognosisCodeableConcept_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByPrognosisReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Reference b where a.prognosisReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByAction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Reference b where a.action_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ClinicalImpression> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ClinicalImpression> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ClinicalImpressionModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ClinicalImpression> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ClinicalImpressionModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ClinicalImpressionModel> models = query.getResultList();
    return ClinicalImpressionHelper.fromArray2Array(models);
  }
}