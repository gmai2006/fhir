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

import org.fhir.entity.ContractValuedItemModel;
import org.fhir.pojo.ContractValuedItem;

public class ContractValuedItemDaoImpl implements ContractValuedItemDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ContractValuedItemDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ContractValuedItem find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ContractValuedItemModel model = em.find(ContractValuedItemModel.class, id);
    if (null == model) return null;
    return new ContractValuedItem(model);
  }

  @Override
  public List<ContractValuedItem> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractValuedItemModel a", ContractValuedItemModel.class).setMaxResults(maxResult);
      List<ContractValuedItemModel> models = query.getResultList();
      return ContractValuedItem.fromArray(models);
  }

  @Override
  public List<ContractValuedItem> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractValuedItemModel a", ContractValuedItemModel.class);
      List<ContractValuedItemModel> models = query.getResultList();
      return ContractValuedItem.fromArray(models);
  }

  @Override
  @Transactional
  public ContractValuedItem create(ContractValuedItem e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ContractValuedItemModel(e));
      return e;
  }

  @Transactional
  public ContractValuedItem update(ContractValuedItem e) {
      final EntityManager em = entityManagerProvider.get();
      ContractValuedItemModel model = em.merge(new ContractValuedItemModel(e));
      return new ContractValuedItem(model);
  }

  @Override
  @Transactional
  public void delete(ContractValuedItem e) {
      final EntityManager em = entityManagerProvider.get();
      final ContractValuedItemModel removed = em.find(ContractValuedItemModel.class, e.getId());
      em.remove(removed);
  }
}