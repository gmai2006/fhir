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

import org.fhir.entity.CapabilityStatementImplementationModel;
import org.fhir.pojo.CapabilityStatementImplementation;

public class CapabilityStatementImplementationDaoImpl implements CapabilityStatementImplementationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CapabilityStatementImplementationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CapabilityStatementImplementation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CapabilityStatementImplementationModel model = em.find(CapabilityStatementImplementationModel.class, id);
    if (null == model) return null;
    return new CapabilityStatementImplementation(model);
  }

  @Override
  public List<CapabilityStatementImplementation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementImplementationModel a", CapabilityStatementImplementationModel.class).setMaxResults(maxResult);
      List<CapabilityStatementImplementationModel> models = query.getResultList();
      return CapabilityStatementImplementation.fromArray(models);
  }

  @Override
  public List<CapabilityStatementImplementation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementImplementationModel a", CapabilityStatementImplementationModel.class);
      List<CapabilityStatementImplementationModel> models = query.getResultList();
      return CapabilityStatementImplementation.fromArray(models);
  }

  @Override
  @Transactional
  public CapabilityStatementImplementation create(CapabilityStatementImplementation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CapabilityStatementImplementationModel(e));
      return e;
  }

  @Transactional
  public CapabilityStatementImplementation update(CapabilityStatementImplementation e) {
      final EntityManager em = entityManagerProvider.get();
      CapabilityStatementImplementationModel model = em.merge(new CapabilityStatementImplementationModel(e));
      return new CapabilityStatementImplementation(model);
  }

  @Override
  @Transactional
  public void delete(CapabilityStatementImplementation e) {
      final EntityManager em = entityManagerProvider.get();
      final CapabilityStatementImplementationModel removed = em.find(CapabilityStatementImplementationModel.class, e.getId());
      em.remove(removed);
  }
}