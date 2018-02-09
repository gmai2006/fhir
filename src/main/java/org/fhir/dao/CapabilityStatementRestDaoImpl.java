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

import org.fhir.entity.CapabilityStatementRestModel;
import org.fhir.pojo.CapabilityStatementRest;

public class CapabilityStatementRestDaoImpl implements CapabilityStatementRestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CapabilityStatementRestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CapabilityStatementRest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CapabilityStatementRestModel model = em.find(CapabilityStatementRestModel.class, id);
    if (null == model) return null;
    return new CapabilityStatementRest(model);
  }

  @Override
  public List<CapabilityStatementRest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementRestModel a", CapabilityStatementRestModel.class).setMaxResults(maxResult);
      List<CapabilityStatementRestModel> models = query.getResultList();
      return CapabilityStatementRest.fromArray(models);
  }

  @Override
  public List<CapabilityStatementRest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementRestModel a", CapabilityStatementRestModel.class);
      List<CapabilityStatementRestModel> models = query.getResultList();
      return CapabilityStatementRest.fromArray(models);
  }

  @Override
  @Transactional
  public CapabilityStatementRest create(CapabilityStatementRest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CapabilityStatementRestModel(e));
      return e;
  }

  @Transactional
  public CapabilityStatementRest update(CapabilityStatementRest e) {
      final EntityManager em = entityManagerProvider.get();
      CapabilityStatementRestModel model = em.merge(new CapabilityStatementRestModel(e));
      return new CapabilityStatementRest(model);
  }

  @Override
  @Transactional
  public void delete(CapabilityStatementRest e) {
      final EntityManager em = entityManagerProvider.get();
      final CapabilityStatementRestModel removed = em.find(CapabilityStatementRestModel.class, e.getId());
      em.remove(removed);
  }
}