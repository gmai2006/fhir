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

import org.fhir.entity.EndpointModel;
import org.fhir.pojo.Endpoint;
import org.fhir.pojo.EndpointHelper;
import org.fhir.utils.QueryBuilder;

public class EndpointDaoImpl implements EndpointDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EndpointDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Endpoint find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EndpointModel model = em.find(EndpointModel.class, id);
    if (null == model) return null;
    return new Endpoint(model);
  }

  @Override
  public List<Endpoint> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EndpointModel a", EndpointModel.class).setMaxResults(maxResult);
      List<EndpointModel> models = query.getResultList();
      return EndpointHelper.fromArray2Array(models);
  }

  @Override
  public List<Endpoint> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EndpointModel a", EndpointModel.class);
      List<EndpointModel> models = query.getResultList();
      return EndpointHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Endpoint create(Endpoint e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new EndpointModel(e));
      return e;
  }

  @Transactional
  public Endpoint update(Endpoint e) {
      final EntityManager em = entityManagerProvider.get();
      EndpointModel model = em.merge(new EndpointModel(e));
      return new Endpoint(model);
  }
  @Override
  @Transactional
  public void delete(Endpoint e) {
      final EntityManager em = entityManagerProvider.get();
      final EndpointModel removed = em.find(EndpointModel.class, e.getId());
      em.remove(removed);
  }


  @Override
  public List<Endpoint> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EndpointModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Endpoint> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, EndpointModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<EndpointModel> models = query.getResultList();
    return EndpointHelper.fromArray2Array(models);
  }
}