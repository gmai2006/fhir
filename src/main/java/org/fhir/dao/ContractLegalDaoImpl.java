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

import org.fhir.entity.ContractLegalModel;
import org.fhir.pojo.ContractLegal;

public class ContractLegalDaoImpl implements ContractLegalDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ContractLegalDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ContractLegal find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ContractLegalModel model = em.find(ContractLegalModel.class, id);
    if (null == model) return null;
    return new ContractLegal(model);
  }

  @Override
  public List<ContractLegal> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractLegalModel a", ContractLegalModel.class).setMaxResults(maxResult);
      List<ContractLegalModel> models = query.getResultList();
      return ContractLegal.fromArray(models);
  }

  @Override
  public List<ContractLegal> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractLegalModel a", ContractLegalModel.class);
      List<ContractLegalModel> models = query.getResultList();
      return ContractLegal.fromArray(models);
  }

  @Override
  @Transactional
  public ContractLegal create(ContractLegal e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ContractLegalModel(e));
      return e;
  }

  @Transactional
  public ContractLegal update(ContractLegal e) {
      final EntityManager em = entityManagerProvider.get();
      ContractLegalModel model = em.merge(new ContractLegalModel(e));
      return new ContractLegal(model);
  }

  @Override
  @Transactional
  public void delete(ContractLegal e) {
      final EntityManager em = entityManagerProvider.get();
      final ContractLegalModel removed = em.find(ContractLegalModel.class, e.getId());
      em.remove(removed);
  }
}