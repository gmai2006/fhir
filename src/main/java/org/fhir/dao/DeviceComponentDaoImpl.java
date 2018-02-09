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

import org.fhir.entity.DeviceComponentModel;
import org.fhir.pojo.DeviceComponent;

public class DeviceComponentDaoImpl implements DeviceComponentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DeviceComponentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DeviceComponent find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DeviceComponentModel model = em.find(DeviceComponentModel.class, id);
    if (null == model) return null;
    return new DeviceComponent(model);
  }

  @Override
  public List<DeviceComponent> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceComponentModel a", DeviceComponentModel.class).setMaxResults(maxResult);
      List<DeviceComponentModel> models = query.getResultList();
      return DeviceComponent.fromArray(models);
  }

  @Override
  public List<DeviceComponent> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceComponentModel a", DeviceComponentModel.class);
      List<DeviceComponentModel> models = query.getResultList();
      return DeviceComponent.fromArray(models);
  }

  @Override
  @Transactional
  public DeviceComponent create(DeviceComponent e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DeviceComponentModel(e));
      return e;
  }

  @Transactional
  public DeviceComponent update(DeviceComponent e) {
      final EntityManager em = entityManagerProvider.get();
      DeviceComponentModel model = em.merge(new DeviceComponentModel(e));
      return new DeviceComponent(model);
  }

  @Override
  @Transactional
  public void delete(DeviceComponent e) {
      final EntityManager em = entityManagerProvider.get();
      final DeviceComponentModel removed = em.find(DeviceComponentModel.class, e.getId());
      em.remove(removed);
  }
}