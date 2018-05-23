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

import org.fhir.entity.BinaryModel;
import org.fhir.pojo.Binary;
import org.fhir.pojo.BinaryHelper;
import org.fhir.utils.QueryBuilder;

public class BinaryDaoImpl implements BinaryDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public BinaryDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Binary find(String id) {
    final EntityManager em = entityManagerProvider.get();
    BinaryModel model = em.find(BinaryModel.class, id);
    if (null == model) return null;
    return new Binary(model);
  }

  @Override
  public List<Binary> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BinaryModel a", BinaryModel.class).setMaxResults(maxResult);
      List<BinaryModel> models = query.getResultList();
      return BinaryHelper.fromArray2Array(models);
  }

  @Override
  public List<Binary> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BinaryModel a", BinaryModel.class);
      List<BinaryModel> models = query.getResultList();
      return BinaryHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Binary create(Binary e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new BinaryModel(e));
      return e;
  }

  @Transactional
  public Binary update(Binary e) {
      final EntityManager em = entityManagerProvider.get();
      BinaryModel model = em.merge(new BinaryModel(e));
      return new Binary(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final BinaryModel removed = em.find(BinaryModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<Binary> findBySecurityContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BinaryModel a, Reference b where a.securityContext_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Binary> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BinaryModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Binary> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BinaryModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Binary> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, BinaryModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<BinaryModel> models = query.getResultList();
    return BinaryHelper.fromArray2Array(models);
  }
}