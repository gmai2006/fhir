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

import org.fhir.entity.SupplyRequestOrderedItemModel;
import org.fhir.pojo.SupplyRequestOrderedItem;

public class SupplyRequestOrderedItemDaoImpl implements SupplyRequestOrderedItemDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SupplyRequestOrderedItemDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public SupplyRequestOrderedItem find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SupplyRequestOrderedItemModel model = em.find(SupplyRequestOrderedItemModel.class, id);
    if (null == model) return null;
    return new SupplyRequestOrderedItem(model);
  }

  @Override
  public List<SupplyRequestOrderedItem> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SupplyRequestOrderedItemModel a", SupplyRequestOrderedItemModel.class).setMaxResults(maxResult);
      List<SupplyRequestOrderedItemModel> models = query.getResultList();
      return SupplyRequestOrderedItem.fromArray(models);
  }

  @Override
  public List<SupplyRequestOrderedItem> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SupplyRequestOrderedItemModel a", SupplyRequestOrderedItemModel.class);
      List<SupplyRequestOrderedItemModel> models = query.getResultList();
      return SupplyRequestOrderedItem.fromArray(models);
  }

  @Override
  @Transactional
  public SupplyRequestOrderedItem create(SupplyRequestOrderedItem e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SupplyRequestOrderedItemModel(e));
      return e;
  }

  @Transactional
  public SupplyRequestOrderedItem update(SupplyRequestOrderedItem e) {
      final EntityManager em = entityManagerProvider.get();
      SupplyRequestOrderedItemModel model = em.merge(new SupplyRequestOrderedItemModel(e));
      return new SupplyRequestOrderedItem(model);
  }

  @Override
  @Transactional
  public void delete(SupplyRequestOrderedItem e) {
      final EntityManager em = entityManagerProvider.get();
      final SupplyRequestOrderedItemModel removed = em.find(SupplyRequestOrderedItemModel.class, e.getId());
      em.remove(removed);
  }
}