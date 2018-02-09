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

import org.fhir.entity.CapabilityStatementModel;
import org.fhir.pojo.CapabilityStatement;

public class CapabilityStatementDaoImpl implements CapabilityStatementDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CapabilityStatementDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CapabilityStatement find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CapabilityStatementModel model = em.find(CapabilityStatementModel.class, id);
    if (null == model) return null;
    return new CapabilityStatement(model);
  }

  @Override
  public List<CapabilityStatement> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementModel a", CapabilityStatementModel.class).setMaxResults(maxResult);
      List<CapabilityStatementModel> models = query.getResultList();
      return CapabilityStatement.fromArray(models);
  }

  @Override
  public List<CapabilityStatement> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementModel a", CapabilityStatementModel.class);
      List<CapabilityStatementModel> models = query.getResultList();
      return CapabilityStatement.fromArray(models);
  }

  @Override
  @Transactional
  public CapabilityStatement create(CapabilityStatement e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CapabilityStatementModel(e));
      return e;
  }

  @Transactional
  public CapabilityStatement update(CapabilityStatement e) {
      final EntityManager em = entityManagerProvider.get();
      CapabilityStatementModel model = em.merge(new CapabilityStatementModel(e));
      return new CapabilityStatement(model);
  }

  @Override
  @Transactional
  public void delete(CapabilityStatement e) {
      final EntityManager em = entityManagerProvider.get();
      final CapabilityStatementModel removed = em.find(CapabilityStatementModel.class, e.getId());
      em.remove(removed);
  }
}