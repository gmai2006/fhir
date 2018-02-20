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

import org.fhir.entity.DeviceModel;
import org.fhir.pojo.Device;
import org.fhir.pojo.DeviceHelper;
import org.fhir.utils.QueryBuilder;

public class DeviceDaoImpl implements DeviceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DeviceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Device find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DeviceModel model = em.find(DeviceModel.class, id);
    if (null == model) return null;
    return new Device(model);
  }

  @Override
  public List<Device> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceModel a", DeviceModel.class).setMaxResults(maxResult);
      List<DeviceModel> models = query.getResultList();
      return DeviceHelper.fromArray2Array(models);
  }

  @Override
  public List<Device> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceModel a", DeviceModel.class);
      List<DeviceModel> models = query.getResultList();
      return DeviceHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Device create(Device e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DeviceModel(e));
      return e;
  }

  @Transactional
  public Device update(Device e) {
      final EntityManager em = entityManagerProvider.get();
      DeviceModel model = em.merge(new DeviceModel(e));
      return new Device(model);
  }
  @Override
  @Transactional
  public void delete(Device e) {
      final EntityManager em = entityManagerProvider.get();
      final DeviceModel removed = em.find(DeviceModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Device> findByUdi(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a, DeviceUdi b where a.udi_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Device> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Device> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Device> findByOwner(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a, Reference b where a.owner_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Device> findByLocation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a, Reference b where a.location_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Device> findBySafety(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a, CodeableConcept b where a.safety_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Device> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Device> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Device> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DeviceModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Device> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, DeviceModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<DeviceModel> models = query.getResultList();
    return DeviceHelper.fromArray2Array(models);
  }
}