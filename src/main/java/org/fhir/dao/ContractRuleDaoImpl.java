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

import org.fhir.entity.ContractRuleModel;
import org.fhir.pojo.ContractRule;

public class ContractRuleDaoImpl implements ContractRuleDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ContractRuleDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ContractRule find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ContractRuleModel model = em.find(ContractRuleModel.class, id);
    if (null == model) return null;
    return new ContractRule(model);
  }

  @Override
  public List<ContractRule> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractRuleModel a", ContractRuleModel.class).setMaxResults(maxResult);
      List<ContractRuleModel> models = query.getResultList();
      return ContractRule.fromArray(models);
  }

  @Override
  public List<ContractRule> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractRuleModel a", ContractRuleModel.class);
      List<ContractRuleModel> models = query.getResultList();
      return ContractRule.fromArray(models);
  }

  @Override
  @Transactional
  public ContractRule create(ContractRule e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ContractRuleModel(e));
      return e;
  }

  @Transactional
  public ContractRule update(ContractRule e) {
      final EntityManager em = entityManagerProvider.get();
      ContractRuleModel model = em.merge(new ContractRuleModel(e));
      return new ContractRule(model);
  }

  @Override
  @Transactional
  public void delete(ContractRule e) {
      final EntityManager em = entityManagerProvider.get();
      final ContractRuleModel removed = em.find(ContractRuleModel.class, e.getId());
      em.remove(removed);
  }
}