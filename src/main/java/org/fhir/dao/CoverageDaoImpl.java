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

import org.fhir.entity.CoverageModel;
import org.fhir.pojo.Coverage;
import org.fhir.pojo.CoverageHelper;
import org.fhir.utils.QueryBuilder;

public class CoverageDaoImpl implements CoverageDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CoverageDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Coverage find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CoverageModel model = em.find(CoverageModel.class, id);
    if (null == model) return null;
    return new Coverage(model);
  }

  @Override
  public List<Coverage> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CoverageModel a", CoverageModel.class).setMaxResults(maxResult);
      List<CoverageModel> models = query.getResultList();
      return CoverageHelper.fromArray2Array(models);
  }

  @Override
  public List<Coverage> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CoverageModel a", CoverageModel.class);
      List<CoverageModel> models = query.getResultList();
      return CoverageHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Coverage create(Coverage e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CoverageModel(e));
      return e;
  }

  @Transactional
  public Coverage update(Coverage e) {
      final EntityManager em = entityManagerProvider.get();
      CoverageModel model = em.merge(new CoverageModel(e));
      return new Coverage(model);
  }
  @Override
  @Transactional
  public void delete(Coverage e) {
      final EntityManager em = entityManagerProvider.get();
      final CoverageModel removed = em.find(CoverageModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Coverage> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findByPolicyHolder(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, Reference b where a.policyHolder_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findBySubscriber(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, Reference b where a.subscriber_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findByBeneficiary(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, Reference b where a.beneficiary_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findByRelationship(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, CodeableConcept b where a.relationship_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findByPayor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, Reference b where a.payor_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findByGrouping(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, CoverageGrouping b where a.grouping_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findByContract(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, Reference b where a.contract_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Coverage> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Coverage> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CoverageModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Coverage> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, CoverageModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<CoverageModel> models = query.getResultList();
    return CoverageHelper.fromArray2Array(models);
  }
}