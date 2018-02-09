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

import org.fhir.entity.AccountGuarantorModel;
import org.fhir.pojo.AccountGuarantor;

public class AccountGuarantorDaoImpl implements AccountGuarantorDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AccountGuarantorDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public AccountGuarantor find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AccountGuarantorModel model = em.find(AccountGuarantorModel.class, id);
    if (null == model) return null;
    return new AccountGuarantor(model);
  }

  @Override
  public List<AccountGuarantor> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AccountGuarantorModel a", AccountGuarantorModel.class).setMaxResults(maxResult);
      List<AccountGuarantorModel> models = query.getResultList();
      return AccountGuarantor.fromArray(models);
  }

  @Override
  public List<AccountGuarantor> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AccountGuarantorModel a", AccountGuarantorModel.class);
      List<AccountGuarantorModel> models = query.getResultList();
      return AccountGuarantor.fromArray(models);
  }

  @Override
  @Transactional
  public AccountGuarantor create(AccountGuarantor e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AccountGuarantorModel(e));
      return e;
  }

  @Transactional
  public AccountGuarantor update(AccountGuarantor e) {
      final EntityManager em = entityManagerProvider.get();
      AccountGuarantorModel model = em.merge(new AccountGuarantorModel(e));
      return new AccountGuarantor(model);
  }

  @Override
  @Transactional
  public void delete(AccountGuarantor e) {
      final EntityManager em = entityManagerProvider.get();
      final AccountGuarantorModel removed = em.find(AccountGuarantorModel.class, e.getId());
      em.remove(removed);
  }
}