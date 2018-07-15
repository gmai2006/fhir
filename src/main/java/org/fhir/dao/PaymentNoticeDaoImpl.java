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

import org.fhir.entity.PaymentNoticeModel;
import org.fhir.pojo.PaymentNotice;
import org.fhir.pojo.PaymentNoticeHelper;
import org.fhir.utils.QueryBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public class PaymentNoticeDaoImpl implements PaymentNoticeDao {
	private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PaymentNoticeDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PaymentNotice find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PaymentNoticeModel model = em.find(PaymentNoticeModel.class, id);
    if (null == model) return null;
    return new PaymentNotice(model);
  }

  @Override
  public List<PaymentNotice> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PaymentNoticeModel a", PaymentNoticeModel.class).setMaxResults(maxResult);
      List<PaymentNoticeModel> models = query.getResultList();
      return PaymentNoticeHelper.fromArray2Array(models);
  }

  @Override
  public List<PaymentNotice> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PaymentNoticeModel a", PaymentNoticeModel.class);
      List<PaymentNoticeModel> models = query.getResultList();
      return PaymentNoticeHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public PaymentNotice create(PaymentNotice e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PaymentNoticeModel(e));
      return e;
  }

  @Transactional
  public PaymentNotice update(PaymentNotice e) {
      final EntityManager em = entityManagerProvider.get();
      PaymentNoticeModel model = em.merge(new PaymentNoticeModel(e));
      return new PaymentNotice(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final PaymentNoticeModel removed = em.find(PaymentNoticeModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<PaymentNotice> findByRequest(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a, Reference b where a.request_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentNotice> findByResponse(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a, Reference b where a.response_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentNotice> findByTarget(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a, Reference b where a.target_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentNotice> findByProvider(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a, Reference b where a.provider_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentNotice> findByOrganization(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a, Reference b where a.organization_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentNotice> findByPaymentStatus(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a, CodeableConcept b where a.paymentStatus_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentNotice> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<PaymentNotice> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<PaymentNotice> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from PaymentNoticeModel a " + queryBuilder.getWhereClause();
  	logger.info(queryStr);
    return findByQuery(queryBuilder, queryStr);
  }

  private List<PaymentNotice> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, PaymentNoticeModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<PaymentNoticeModel> models = query.getResultList();
    return PaymentNoticeHelper.fromArray2Array(models);
  }
}