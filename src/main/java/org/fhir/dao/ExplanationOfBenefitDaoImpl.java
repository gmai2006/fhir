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

import org.fhir.entity.ExplanationOfBenefitModel;
import org.fhir.pojo.ExplanationOfBenefit;
import org.fhir.pojo.ExplanationOfBenefitHelper;
import org.fhir.utils.QueryBuilder;

public class ExplanationOfBenefitDaoImpl implements ExplanationOfBenefitDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExplanationOfBenefitDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExplanationOfBenefit find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExplanationOfBenefitModel model = em.find(ExplanationOfBenefitModel.class, id);
    if (null == model) return null;
    return new ExplanationOfBenefit(model);
  }

  @Override
  public List<ExplanationOfBenefit> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitModel a", ExplanationOfBenefitModel.class).setMaxResults(maxResult);
      List<ExplanationOfBenefitModel> models = query.getResultList();
      return ExplanationOfBenefitHelper.fromArray2Array(models);
  }

  @Override
  public List<ExplanationOfBenefit> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitModel a", ExplanationOfBenefitModel.class);
      List<ExplanationOfBenefitModel> models = query.getResultList();
      return ExplanationOfBenefitHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ExplanationOfBenefit create(ExplanationOfBenefit e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExplanationOfBenefitModel(e));
      return e;
  }

  @Transactional
  public ExplanationOfBenefit update(ExplanationOfBenefit e) {
      final EntityManager em = entityManagerProvider.get();
      ExplanationOfBenefitModel model = em.merge(new ExplanationOfBenefitModel(e));
      return new ExplanationOfBenefit(model);
  }
  @Override
  @Transactional
  public void delete(ExplanationOfBenefit e) {
      final EntityManager em = entityManagerProvider.get();
      final ExplanationOfBenefitModel removed = em.find(ExplanationOfBenefitModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<ExplanationOfBenefit> findByClaim(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExplanationOfBenefitModel a, Reference b where a.claim_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExplanationOfBenefit> findByEnterer(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExplanationOfBenefitModel a, Reference b where a.enterer_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExplanationOfBenefit> findByFacility(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExplanationOfBenefitModel a, Reference b where a.facility_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExplanationOfBenefit> findByOrganization(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExplanationOfBenefitModel a, Reference b where a.organization_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExplanationOfBenefit> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExplanationOfBenefitModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExplanationOfBenefit> findByPayee(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExplanationOfBenefitModel a, ExplanationOfBenefitPayee b where a.payee_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExplanationOfBenefit> findByProvider(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExplanationOfBenefitModel a, Reference b where a.provider_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ExplanationOfBenefit> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExplanationOfBenefitModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ExplanationOfBenefit> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ExplanationOfBenefitModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ExplanationOfBenefitModel> models = query.getResultList();
    return ExplanationOfBenefitHelper.fromArray2Array(models);
  }
}