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

import org.fhir.entity.DeviceUdiModel;
import org.fhir.pojo.DeviceUdi;

public class DeviceUdiDaoImpl implements DeviceUdiDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DeviceUdiDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DeviceUdi find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DeviceUdiModel model = em.find(DeviceUdiModel.class, id);
    if (null == model) return null;
    return new DeviceUdi(model);
  }

  @Override
  public List<DeviceUdi> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceUdiModel a", DeviceUdiModel.class).setMaxResults(maxResult);
      List<DeviceUdiModel> models = query.getResultList();
      return DeviceUdi.fromArray(models);
  }

  @Override
  public List<DeviceUdi> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceUdiModel a", DeviceUdiModel.class);
      List<DeviceUdiModel> models = query.getResultList();
      return DeviceUdi.fromArray(models);
  }

  @Override
  @Transactional
  public DeviceUdi create(DeviceUdi e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DeviceUdiModel(e));
      return e;
  }

  @Transactional
  public DeviceUdi update(DeviceUdi e) {
      final EntityManager em = entityManagerProvider.get();
      DeviceUdiModel model = em.merge(new DeviceUdiModel(e));
      return new DeviceUdi(model);
  }

  @Override
  @Transactional
  public void delete(DeviceUdi e) {
      final EntityManager em = entityManagerProvider.get();
      final DeviceUdiModel removed = em.find(DeviceUdiModel.class, e.getId());
      em.remove(removed);
  }
}