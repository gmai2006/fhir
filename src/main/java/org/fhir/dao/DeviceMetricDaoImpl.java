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

import org.fhir.entity.DeviceMetricModel;
import org.fhir.pojo.DeviceMetric;
import org.fhir.pojo.DeviceMetricHelper;
import org.fhir.utils.QueryBuilder;

public class DeviceMetricDaoImpl implements DeviceMetricDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DeviceMetricDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DeviceMetric find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DeviceMetricModel model = em.find(DeviceMetricModel.class, id);
    if (null == model) return null;
    return new DeviceMetric(model);
  }

  @Override
  public List<DeviceMetric> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceMetricModel a", DeviceMetricModel.class).setMaxResults(maxResult);
      List<DeviceMetricModel> models = query.getResultList();
      return DeviceMetricHelper.fromArray2Array(models);
  }

  @Override
  public List<DeviceMetric> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceMetricModel a", DeviceMetricModel.class);
      List<DeviceMetricModel> models = query.getResultList();
      return DeviceMetricHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public DeviceMetric create(DeviceMetric e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DeviceMetricModel(e));
      return e;
  }

  @Transactional
  public DeviceMetric update(DeviceMetric e) {
      final EntityManager em = entityManagerProvider.get();
      DeviceMetricModel model = em.merge(new DeviceMetricModel(e));
      return new DeviceMetric(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final DeviceMetricModel removed = em.find(DeviceMetricModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<DeviceMetric> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceMetricModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceMetric> findByUnit(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceMetricModel a, CodeableConcept b where a.unit_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceMetric> findBySource(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceMetricModel a, Reference b where a.source_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceMetric> findByParent(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceMetricModel a, Reference b where a.parent_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceMetric> findByCalibration(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceMetricModel a, DeviceMetricCalibration b where a.calibration_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceMetric> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceMetricModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DeviceMetric> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceMetricModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<DeviceMetric> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceMetricModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<DeviceMetric> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, DeviceMetricModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<DeviceMetricModel> models = query.getResultList();
    return DeviceMetricHelper.fromArray2Array(models);
  }
}