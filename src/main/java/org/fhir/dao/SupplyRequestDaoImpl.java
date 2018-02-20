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

import org.fhir.entity.SupplyRequestModel;
import org.fhir.pojo.SupplyRequest;
import org.fhir.pojo.SupplyRequestHelper;
import org.fhir.utils.QueryBuilder;

public class SupplyRequestDaoImpl implements SupplyRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SupplyRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public SupplyRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SupplyRequestModel model = em.find(SupplyRequestModel.class, id);
    if (null == model) return null;
    return new SupplyRequest(model);
  }

  @Override
  public List<SupplyRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SupplyRequestModel a", SupplyRequestModel.class).setMaxResults(maxResult);
      List<SupplyRequestModel> models = query.getResultList();
      return SupplyRequestHelper.fromArray2Array(models);
  }

  @Override
  public List<SupplyRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SupplyRequestModel a", SupplyRequestModel.class);
      List<SupplyRequestModel> models = query.getResultList();
      return SupplyRequestHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public SupplyRequest create(SupplyRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SupplyRequestModel(e));
      return e;
  }

  @Transactional
  public SupplyRequest update(SupplyRequest e) {
      final EntityManager em = entityManagerProvider.get();
      SupplyRequestModel model = em.merge(new SupplyRequestModel(e));
      return new SupplyRequest(model);
  }
  @Override
  @Transactional
  public void delete(SupplyRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final SupplyRequestModel removed = em.find(SupplyRequestModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<SupplyRequest> findByCategory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, CodeableConcept b where a.category_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findByOrderedItem(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, SupplyRequestOrderedItem b where a.orderedItem_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findByRequester(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, SupplyRequestRequester b where a.requester_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findBySupplier(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, Reference b where a.supplier_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findByReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, CodeableConcept b where a.reasonCodeableConcept_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, Reference b where a.reasonReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findByDeliverFrom(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, Reference b where a.deliverFrom_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findByDeliverTo(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, Reference b where a.deliverTo_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<SupplyRequest> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<SupplyRequest> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SupplyRequestModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<SupplyRequest> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, SupplyRequestModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<SupplyRequestModel> models = query.getResultList();
    return SupplyRequestHelper.fromArray2Array(models);
  }
}