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

import org.fhir.entity.GroupCharacteristicModel;
import org.fhir.pojo.GroupCharacteristic;

public class GroupCharacteristicDaoImpl implements GroupCharacteristicDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public GroupCharacteristicDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public GroupCharacteristic find(String id) {
    final EntityManager em = entityManagerProvider.get();
    GroupCharacteristicModel model = em.find(GroupCharacteristicModel.class, id);
    if (null == model) return null;
    return new GroupCharacteristic(model);
  }

  @Override
  public List<GroupCharacteristic> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GroupCharacteristicModel a", GroupCharacteristicModel.class).setMaxResults(maxResult);
      List<GroupCharacteristicModel> models = query.getResultList();
      return GroupCharacteristic.fromArray(models);
  }

  @Override
  public List<GroupCharacteristic> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GroupCharacteristicModel a", GroupCharacteristicModel.class);
      List<GroupCharacteristicModel> models = query.getResultList();
      return GroupCharacteristic.fromArray(models);
  }

  @Override
  @Transactional
  public GroupCharacteristic create(GroupCharacteristic e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new GroupCharacteristicModel(e));
      return e;
  }

  @Transactional
  public GroupCharacteristic update(GroupCharacteristic e) {
      final EntityManager em = entityManagerProvider.get();
      GroupCharacteristicModel model = em.merge(new GroupCharacteristicModel(e));
      return new GroupCharacteristic(model);
  }

  @Override
  @Transactional
  public void delete(GroupCharacteristic e) {
      final EntityManager em = entityManagerProvider.get();
      final GroupCharacteristicModel removed = em.find(GroupCharacteristicModel.class, e.getId());
      em.remove(removed);
  }
}