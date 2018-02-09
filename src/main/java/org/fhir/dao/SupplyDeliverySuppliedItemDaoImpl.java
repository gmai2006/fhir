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

import org.fhir.entity.SupplyDeliverySuppliedItemModel;
import org.fhir.pojo.SupplyDeliverySuppliedItem;

public class SupplyDeliverySuppliedItemDaoImpl implements SupplyDeliverySuppliedItemDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SupplyDeliverySuppliedItemDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public SupplyDeliverySuppliedItem find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SupplyDeliverySuppliedItemModel model = em.find(SupplyDeliverySuppliedItemModel.class, id);
    if (null == model) return null;
    return new SupplyDeliverySuppliedItem(model);
  }

  @Override
  public List<SupplyDeliverySuppliedItem> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SupplyDeliverySuppliedItemModel a", SupplyDeliverySuppliedItemModel.class).setMaxResults(maxResult);
      List<SupplyDeliverySuppliedItemModel> models = query.getResultList();
      return SupplyDeliverySuppliedItem.fromArray(models);
  }

  @Override
  public List<SupplyDeliverySuppliedItem> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SupplyDeliverySuppliedItemModel a", SupplyDeliverySuppliedItemModel.class);
      List<SupplyDeliverySuppliedItemModel> models = query.getResultList();
      return SupplyDeliverySuppliedItem.fromArray(models);
  }

  @Override
  @Transactional
  public SupplyDeliverySuppliedItem create(SupplyDeliverySuppliedItem e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SupplyDeliverySuppliedItemModel(e));
      return e;
  }

  @Transactional
  public SupplyDeliverySuppliedItem update(SupplyDeliverySuppliedItem e) {
      final EntityManager em = entityManagerProvider.get();
      SupplyDeliverySuppliedItemModel model = em.merge(new SupplyDeliverySuppliedItemModel(e));
      return new SupplyDeliverySuppliedItem(model);
  }

  @Override
  @Transactional
  public void delete(SupplyDeliverySuppliedItem e) {
      final EntityManager em = entityManagerProvider.get();
      final SupplyDeliverySuppliedItemModel removed = em.find(SupplyDeliverySuppliedItemModel.class, e.getId());
      em.remove(removed);
  }
}