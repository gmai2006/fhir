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

import org.fhir.entity.ChargeItemModel;
import org.fhir.pojo.ChargeItem;

public class ChargeItemDaoImpl implements ChargeItemDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ChargeItemDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ChargeItem find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ChargeItemModel model = em.find(ChargeItemModel.class, id);
    if (null == model) return null;
    return new ChargeItem(model);
  }

  @Override
  public List<ChargeItem> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ChargeItemModel a", ChargeItemModel.class).setMaxResults(maxResult);
      List<ChargeItemModel> models = query.getResultList();
      return ChargeItem.fromArray(models);
  }

  @Override
  public List<ChargeItem> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ChargeItemModel a", ChargeItemModel.class);
      List<ChargeItemModel> models = query.getResultList();
      return ChargeItem.fromArray(models);
  }

  @Override
  @Transactional
  public ChargeItem create(ChargeItem e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ChargeItemModel(e));
      return e;
  }

  @Transactional
  public ChargeItem update(ChargeItem e) {
      final EntityManager em = entityManagerProvider.get();
      ChargeItemModel model = em.merge(new ChargeItemModel(e));
      return new ChargeItem(model);
  }

  @Override
  @Transactional
  public void delete(ChargeItem e) {
      final EntityManager em = entityManagerProvider.get();
      final ChargeItemModel removed = em.find(ChargeItemModel.class, e.getId());
      em.remove(removed);
  }
}