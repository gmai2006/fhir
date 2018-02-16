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

import org.fhir.entity.StructureMapModel;
import org.fhir.pojo.StructureMap;
import org.fhir.pojo.StructureMapHelper;
import org.fhir.utils.QueryBuilder;

public class StructureMapDaoImpl implements StructureMapDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public StructureMapDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public StructureMap find(String id) {
    final EntityManager em = entityManagerProvider.get();
    StructureMapModel model = em.find(StructureMapModel.class, id);
    if (null == model) return null;
    return new StructureMap(model);
  }

  @Override
  public List<StructureMap> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from StructureMapModel a", StructureMapModel.class).setMaxResults(maxResult);
      List<StructureMapModel> models = query.getResultList();
      return StructureMapHelper.fromArray2Array(models);
  }

  @Override
  public List<StructureMap> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from StructureMapModel a", StructureMapModel.class);
      List<StructureMapModel> models = query.getResultList();
      return StructureMapHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public StructureMap create(StructureMap e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new StructureMapModel(e));
      return e;
  }

  @Transactional
  public StructureMap update(StructureMap e) {
      final EntityManager em = entityManagerProvider.get();
      StructureMapModel model = em.merge(new StructureMapModel(e));
      return new StructureMap(model);
  }
  @Override
  @Transactional
  public void delete(StructureMap e) {
      final EntityManager em = entityManagerProvider.get();
      final StructureMapModel removed = em.find(StructureMapModel.class, e.getId());
      em.remove(removed);
  }


  @Override
  public List<StructureMap> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from StructureMapModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<StructureMap> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, StructureMapModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<StructureMapModel> models = query.getResultList();
    return StructureMapHelper.fromArray2Array(models);
  }
}