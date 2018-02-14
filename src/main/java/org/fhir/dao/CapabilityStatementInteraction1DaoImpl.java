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

import org.fhir.entity.CapabilityStatementInteraction1Model;
import org.fhir.pojo.CapabilityStatementInteraction1;
import org.fhir.pojo.CapabilityStatementInteraction1Helper;

public class CapabilityStatementInteraction1DaoImpl implements CapabilityStatementInteraction1Dao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CapabilityStatementInteraction1DaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CapabilityStatementInteraction1 find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CapabilityStatementInteraction1Model model = em.find(CapabilityStatementInteraction1Model.class, id);
    if (null == model) return null;
    return new CapabilityStatementInteraction1(model);
  }

  @Override
  public List<CapabilityStatementInteraction1> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementInteraction1Model a", CapabilityStatementInteraction1Model.class).setMaxResults(maxResult);
      List<CapabilityStatementInteraction1Model> models = query.getResultList();
      return CapabilityStatementInteraction1Helper.fromArray2Array(models);
  }

  @Override
  public List<CapabilityStatementInteraction1> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementInteraction1Model a", CapabilityStatementInteraction1Model.class);
      List<CapabilityStatementInteraction1Model> models = query.getResultList();
      return CapabilityStatementInteraction1Helper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(CapabilityStatementInteraction1 e) {
      final EntityManager em = entityManagerProvider.get();
      final CapabilityStatementInteraction1Model removed = em.find(CapabilityStatementInteraction1Model.class, e.getId());
      em.remove(removed);
  }
}