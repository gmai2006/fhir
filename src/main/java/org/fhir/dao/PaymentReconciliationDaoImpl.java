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

import org.fhir.entity.PaymentReconciliationModel;
import org.fhir.pojo.PaymentReconciliation;
import org.fhir.pojo.PaymentReconciliationHelper;
import org.fhir.utils.QueryBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public class PaymentReconciliationDaoImpl implements PaymentReconciliationDao {
	private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PaymentReconciliationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PaymentReconciliation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PaymentReconciliationModel model = em.find(PaymentReconciliationModel.class, id);
    if (null == model) return null;
    return new PaymentReconciliation(model);
  }

  @Override
  public List<PaymentReconciliation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PaymentReconciliationModel a", PaymentReconciliationModel.class).setMaxResults(maxResult);
      List<PaymentReconciliationModel> models = query.getResultList();
      return PaymentReconciliationHelper.fromArray2Array(models);
  }

  @Override
  public List<PaymentReconciliation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PaymentReconciliationModel a", PaymentReconciliationModel.class);
      List<PaymentReconciliationModel> models = query.getResultList();
      return PaymentReconciliationHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public PaymentReconciliation create(PaymentReconciliation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PaymentReconciliationModel(e));
      return e;
  }

  @Transactional
  public PaymentReconciliation update(PaymentReconciliation e) {
      final EntityManager em = entityManagerProvider.get();
      PaymentReconciliationModel model = em.merge(new PaymentReconciliationModel(e));
      return new PaymentReconciliation(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final PaymentReconciliationModel removed = em.find(PaymentReconciliationModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<PaymentReconciliation> findByOrganization(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, Reference b where a.organization_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByRequest(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, Reference b where a.request_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByOutcome(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, CodeableConcept b where a.outcome_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByRequestProvider(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, Reference b where a.requestProvider_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByRequestOrganization(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, Reference b where a.requestOrganization_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByDetail(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, PaymentReconciliationDetail b where a.detail_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByForm(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, CodeableConcept b where a.form_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByTotal(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, Money b where a.total_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByProcessNote(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, PaymentReconciliationProcessNote b where a.processNote_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentReconciliation> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<PaymentReconciliation> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentReconciliationModel a " + queryBuilder.getWhereClause();
  	logger.info(queryStr);
    return findByQuery(queryBuilder, queryStr);
  }

  private List<PaymentReconciliation> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, PaymentReconciliationModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<PaymentReconciliationModel> models = query.getResultList();
    return PaymentReconciliationHelper.fromArray2Array(models);
  }
}