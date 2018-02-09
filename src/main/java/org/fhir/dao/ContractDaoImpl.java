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

import org.fhir.entity.ContractModel;
import org.fhir.pojo.Contract;

public class ContractDaoImpl implements ContractDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ContractDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Contract find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ContractModel model = em.find(ContractModel.class, id);
    if (null == model) return null;
    return new Contract(model);
  }

  @Override
  public List<Contract> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractModel a", ContractModel.class).setMaxResults(maxResult);
      List<ContractModel> models = query.getResultList();
      return Contract.fromArray(models);
  }

  @Override
  public List<Contract> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractModel a", ContractModel.class);
      List<ContractModel> models = query.getResultList();
      return Contract.fromArray(models);
  }

  @Override
  @Transactional
  public Contract create(Contract e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ContractModel(e));
      return e;
  }

  @Transactional
  public Contract update(Contract e) {
      final EntityManager em = entityManagerProvider.get();
      ContractModel model = em.merge(new ContractModel(e));
      return new Contract(model);
  }

  @Override
  @Transactional
  public void delete(Contract e) {
      final EntityManager em = entityManagerProvider.get();
      final ContractModel removed = em.find(ContractModel.class, e.getId());
      em.remove(removed);
  }
}