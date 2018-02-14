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

import org.fhir.entity.ContractAgent1Model;
import org.fhir.pojo.ContractAgent1;
import org.fhir.pojo.ContractAgent1Helper;

public class ContractAgent1DaoImpl implements ContractAgent1Dao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ContractAgent1DaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ContractAgent1 find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ContractAgent1Model model = em.find(ContractAgent1Model.class, id);
    if (null == model) return null;
    return new ContractAgent1(model);
  }

  @Override
  public List<ContractAgent1> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractAgent1Model a", ContractAgent1Model.class).setMaxResults(maxResult);
      List<ContractAgent1Model> models = query.getResultList();
      return ContractAgent1Helper.fromArray2Array(models);
  }

  @Override
  public List<ContractAgent1> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContractAgent1Model a", ContractAgent1Model.class);
      List<ContractAgent1Model> models = query.getResultList();
      return ContractAgent1Helper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(ContractAgent1 e) {
      final EntityManager em = entityManagerProvider.get();
      final ContractAgent1Model removed = em.find(ContractAgent1Model.class, e.getId());
      em.remove(removed);
  }
}