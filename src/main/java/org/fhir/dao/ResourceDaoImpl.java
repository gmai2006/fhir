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

import org.fhir.entity.ResourceModel;
import org.fhir.pojo.Resource;
import org.fhir.pojo.ResourceHelper;
import org.fhir.utils.QueryBuilder;

public class ResourceDaoImpl implements ResourceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ResourceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Resource find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ResourceModel model = em.find(ResourceModel.class, id);
    if (null == model) return null;
    return new Resource(model);
  }

  @Override
  public List<Resource> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResourceModel a", ResourceModel.class).setMaxResults(maxResult);
      List<ResourceModel> models = query.getResultList();
      return ResourceHelper.fromArray2Array(models);
  }

  @Override
  public List<Resource> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResourceModel a", ResourceModel.class);
      List<ResourceModel> models = query.getResultList();
      return ResourceHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Resource create(Resource e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ResourceModel(e));
      return e;
  }

  @Transactional
  public Resource update(Resource e) {
      final EntityManager em = entityManagerProvider.get();
      ResourceModel model = em.merge(new ResourceModel(e));
      return new Resource(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final ResourceModel removed = em.find(ResourceModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<Resource> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResourceModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Resource> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResourceModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Resource> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ResourceModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ResourceModel> models = query.getResultList();
    return ResourceHelper.fromArray2Array(models);
  }
}