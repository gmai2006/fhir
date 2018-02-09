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

import org.fhir.entity.DeviceRequestRequesterModel;
import org.fhir.pojo.DeviceRequestRequester;

public class DeviceRequestRequesterDaoImpl implements DeviceRequestRequesterDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DeviceRequestRequesterDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DeviceRequestRequester find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DeviceRequestRequesterModel model = em.find(DeviceRequestRequesterModel.class, id);
    if (null == model) return null;
    return new DeviceRequestRequester(model);
  }

  @Override
  public List<DeviceRequestRequester> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceRequestRequesterModel a", DeviceRequestRequesterModel.class).setMaxResults(maxResult);
      List<DeviceRequestRequesterModel> models = query.getResultList();
      return DeviceRequestRequester.fromArray(models);
  }

  @Override
  public List<DeviceRequestRequester> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DeviceRequestRequesterModel a", DeviceRequestRequesterModel.class);
      List<DeviceRequestRequesterModel> models = query.getResultList();
      return DeviceRequestRequester.fromArray(models);
  }

  @Override
  @Transactional
  public DeviceRequestRequester create(DeviceRequestRequester e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DeviceRequestRequesterModel(e));
      return e;
  }

  @Transactional
  public DeviceRequestRequester update(DeviceRequestRequester e) {
      final EntityManager em = entityManagerProvider.get();
      DeviceRequestRequesterModel model = em.merge(new DeviceRequestRequesterModel(e));
      return new DeviceRequestRequester(model);
  }

  @Override
  @Transactional
  public void delete(DeviceRequestRequester e) {
      final EntityManager em = entityManagerProvider.get();
      final DeviceRequestRequesterModel removed = em.find(DeviceRequestRequesterModel.class, e.getId());
      em.remove(removed);
  }
}