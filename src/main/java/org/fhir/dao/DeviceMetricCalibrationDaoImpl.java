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

import org.fhir.entity.DeviceMetricCalibrationModel;
import org.fhir.pojo.DeviceMetricCalibration;

public class DeviceMetricCalibrationDaoImpl implements DeviceMetricCalibrationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DeviceMetricCalibrationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DeviceMetricCalibration find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DeviceMetricCalibrationModel model = em.find(DeviceMetricCalibrationModel.class, id);
    if (null == model) return null;
    return new DeviceMetricCalibration(model);
  }

  @Override
  public List<DeviceMetricCalibration> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceMetricCalibrationModel a", DeviceMetricCalibrationModel.class).setMaxResults(maxResult);
      List<DeviceMetricCalibrationModel> models = query.getResultList();
      return DeviceMetricCalibration.fromArray(models);
  }

  @Override
  public List<DeviceMetricCalibration> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceMetricCalibrationModel a", DeviceMetricCalibrationModel.class);
      List<DeviceMetricCalibrationModel> models = query.getResultList();
      return DeviceMetricCalibration.fromArray(models);
  }

  @Override
  @Transactional
  public DeviceMetricCalibration create(DeviceMetricCalibration e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DeviceMetricCalibrationModel(e));
      return e;
  }

  @Transactional
  public DeviceMetricCalibration update(DeviceMetricCalibration e) {
      final EntityManager em = entityManagerProvider.get();
      DeviceMetricCalibrationModel model = em.merge(new DeviceMetricCalibrationModel(e));
      return new DeviceMetricCalibration(model);
  }

  @Override
  @Transactional
  public void delete(DeviceMetricCalibration e) {
      final EntityManager em = entityManagerProvider.get();
      final DeviceMetricCalibrationModel removed = em.find(DeviceMetricCalibrationModel.class, e.getId());
      em.remove(removed);
  }
}