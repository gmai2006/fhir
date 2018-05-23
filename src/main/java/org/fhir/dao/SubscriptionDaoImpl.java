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

import org.fhir.entity.SubscriptionModel;
import org.fhir.pojo.Subscription;
import org.fhir.pojo.SubscriptionHelper;
import org.fhir.utils.QueryBuilder;

public class SubscriptionDaoImpl implements SubscriptionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SubscriptionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Subscription find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SubscriptionModel model = em.find(SubscriptionModel.class, id);
    if (null == model) return null;
    return new Subscription(model);
  }

  @Override
  public List<Subscription> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SubscriptionModel a", SubscriptionModel.class).setMaxResults(maxResult);
      List<SubscriptionModel> models = query.getResultList();
      return SubscriptionHelper.fromArray2Array(models);
  }

  @Override
  public List<Subscription> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SubscriptionModel a", SubscriptionModel.class);
      List<SubscriptionModel> models = query.getResultList();
      return SubscriptionHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Subscription create(Subscription e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SubscriptionModel(e));
      return e;
  }

  @Transactional
  public Subscription update(Subscription e) {
      final EntityManager em = entityManagerProvider.get();
      SubscriptionModel model = em.merge(new SubscriptionModel(e));
      return new Subscription(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final SubscriptionModel removed = em.find(SubscriptionModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<Subscription> findByChannel(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SubscriptionModel a, SubscriptionChannel b where a.channel_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Subscription> findByTag(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SubscriptionModel a, Coding b where a.tag_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Subscription> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SubscriptionModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Subscription> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SubscriptionModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Subscription> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SubscriptionModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Subscription> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, SubscriptionModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<SubscriptionModel> models = query.getResultList();
    return SubscriptionHelper.fromArray2Array(models);
  }
}