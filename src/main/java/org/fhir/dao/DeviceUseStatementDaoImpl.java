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

import org.fhir.entity.DeviceUseStatementModel;
import org.fhir.pojo.DeviceUseStatement;
import org.fhir.pojo.DeviceUseStatementHelper;
import org.fhir.utils.QueryBuilder;

public class DeviceUseStatementDaoImpl implements DeviceUseStatementDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DeviceUseStatementDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DeviceUseStatement find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DeviceUseStatementModel model = em.find(DeviceUseStatementModel.class, id);
    if (null == model) return null;
    return new DeviceUseStatement(model);
  }

  @Override
  public List<DeviceUseStatement> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceUseStatementModel a", DeviceUseStatementModel.class).setMaxResults(maxResult);
      List<DeviceUseStatementModel> models = query.getResultList();
      return DeviceUseStatementHelper.fromArray2Array(models);
  }

  @Override
  public List<DeviceUseStatement> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceUseStatementModel a", DeviceUseStatementModel.class);
      List<DeviceUseStatementModel> models = query.getResultList();
      return DeviceUseStatementHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public DeviceUseStatement create(DeviceUseStatement e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DeviceUseStatementModel(e));
      return e;
  }

  @Transactional
  public DeviceUseStatement update(DeviceUseStatement e) {
      final EntityManager em = entityManagerProvider.get();
      DeviceUseStatementModel model = em.merge(new DeviceUseStatementModel(e));
      return new DeviceUseStatement(model);
  }
  @Override
  @Transactional
  public void delete(DeviceUseStatement e) {
      final EntityManager em = entityManagerProvider.get();
      final DeviceUseStatementModel removed = em.find(DeviceUseStatementModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<DeviceUseStatement> findByDevice(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceUseStatementModel a, Reference b where a.device_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceUseStatement> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceUseStatementModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<DeviceUseStatement> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceUseStatementModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<DeviceUseStatement> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, DeviceUseStatementModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<DeviceUseStatementModel> models = query.getResultList();
    return DeviceUseStatementHelper.fromArray2Array(models);
  }
}