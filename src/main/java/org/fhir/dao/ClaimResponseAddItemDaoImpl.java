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

import org.fhir.entity.ClaimResponseAddItemModel;
import org.fhir.pojo.ClaimResponseAddItem;

public class ClaimResponseAddItemDaoImpl implements ClaimResponseAddItemDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimResponseAddItemDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimResponseAddItem find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimResponseAddItemModel model = em.find(ClaimResponseAddItemModel.class, id);
    if (null == model) return null;
    return new ClaimResponseAddItem(model);
  }

  @Override
  public List<ClaimResponseAddItem> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimResponseAddItemModel a", ClaimResponseAddItemModel.class).setMaxResults(maxResult);
      List<ClaimResponseAddItemModel> models = query.getResultList();
      return ClaimResponseAddItem.fromArray(models);
  }

  @Override
  public List<ClaimResponseAddItem> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimResponseAddItemModel a", ClaimResponseAddItemModel.class);
      List<ClaimResponseAddItemModel> models = query.getResultList();
      return ClaimResponseAddItem.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimResponseAddItem create(ClaimResponseAddItem e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimResponseAddItemModel(e));
      return e;
  }

  @Transactional
  public ClaimResponseAddItem update(ClaimResponseAddItem e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimResponseAddItemModel model = em.merge(new ClaimResponseAddItemModel(e));
      return new ClaimResponseAddItem(model);
  }

  @Override
  @Transactional
  public void delete(ClaimResponseAddItem e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimResponseAddItemModel removed = em.find(ClaimResponseAddItemModel.class, e.getId());
      em.remove(removed);
  }
}