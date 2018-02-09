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
      return Device.fromArray(models);
  }

  @Override
  public List<Device> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceModel a", DeviceModel.class);
      List<DeviceModel> models = query.getResultList();
      return Device.fromArray(models);
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
}