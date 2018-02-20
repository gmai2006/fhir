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

import org.fhir.entity.BundleModel;
import org.fhir.pojo.Bundle;
import org.fhir.pojo.BundleHelper;
import org.fhir.utils.QueryBuilder;

public class BundleDaoImpl implements BundleDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public BundleDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Bundle find(String id) {
    final EntityManager em = entityManagerProvider.get();
    BundleModel model = em.find(BundleModel.class, id);
    if (null == model) return null;
    return new Bundle(model);
  }

  @Override
  public List<Bundle> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BundleModel a", BundleModel.class).setMaxResults(maxResult);
      List<BundleModel> models = query.getResultList();
      return BundleHelper.fromArray2Array(models);
  }

  @Override
  public List<Bundle> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BundleModel a", BundleModel.class);
      List<BundleModel> models = query.getResultList();
      return BundleHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Bundle create(Bundle e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new BundleModel(e));
      return e;
  }

  @Transactional
  public Bundle update(Bundle e) {
      final EntityManager em = entityManagerProvider.get();
      BundleModel model = em.merge(new BundleModel(e));
      return new Bundle(model);
  }
  @Override
  @Transactional
  public void delete(Bundle e) {
      final EntityManager em = entityManagerProvider.get();
      final BundleModel removed = em.find(BundleModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Bundle> findByLink(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BundleModel a, BundleLink b where a.link_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Bundle> findByEntry(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BundleModel a, BundleEntry b where a.entry_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Bundle> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BundleModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Bundle> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BundleModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Bundle> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, BundleModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<BundleModel> models = query.getResultList();
    return BundleHelper.fromArray2Array(models);
  }
}