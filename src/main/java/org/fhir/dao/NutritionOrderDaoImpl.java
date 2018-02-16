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

import org.fhir.entity.NutritionOrderModel;
import org.fhir.pojo.NutritionOrder;
import org.fhir.pojo.NutritionOrderHelper;
import org.fhir.utils.QueryBuilder;

public class NutritionOrderDaoImpl implements NutritionOrderDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public NutritionOrderDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public NutritionOrder find(String id) {
    final EntityManager em = entityManagerProvider.get();
    NutritionOrderModel model = em.find(NutritionOrderModel.class, id);
    if (null == model) return null;
    return new NutritionOrder(model);
  }

  @Override
  public List<NutritionOrder> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderModel a", NutritionOrderModel.class).setMaxResults(maxResult);
      List<NutritionOrderModel> models = query.getResultList();
      return NutritionOrderHelper.fromArray2Array(models);
  }

  @Override
  public List<NutritionOrder> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderModel a", NutritionOrderModel.class);
      List<NutritionOrderModel> models = query.getResultList();
      return NutritionOrderHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public NutritionOrder create(NutritionOrder e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new NutritionOrderModel(e));
      return e;
  }

  @Transactional
  public NutritionOrder update(NutritionOrder e) {
      final EntityManager em = entityManagerProvider.get();
      NutritionOrderModel model = em.merge(new NutritionOrderModel(e));
      return new NutritionOrder(model);
  }
  @Override
  @Transactional
  public void delete(NutritionOrder e) {
      final EntityManager em = entityManagerProvider.get();
      final NutritionOrderModel removed = em.find(NutritionOrderModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<NutritionOrder> findBySupplement(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from NutritionOrderModel a, NutritionOrderSupplement b where a.supplement_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<NutritionOrder> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from NutritionOrderModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<NutritionOrder> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, NutritionOrderModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<NutritionOrderModel> models = query.getResultList();
    return NutritionOrderHelper.fromArray2Array(models);
  }
}