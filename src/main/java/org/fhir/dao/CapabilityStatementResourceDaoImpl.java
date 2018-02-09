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

import org.fhir.entity.CapabilityStatementResourceModel;
import org.fhir.pojo.CapabilityStatementResource;

public class CapabilityStatementResourceDaoImpl implements CapabilityStatementResourceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CapabilityStatementResourceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CapabilityStatementResource find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CapabilityStatementResourceModel model = em.find(CapabilityStatementResourceModel.class, id);
    if (null == model) return null;
    return new CapabilityStatementResource(model);
  }

  @Override
  public List<CapabilityStatementResource> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementResourceModel a", CapabilityStatementResourceModel.class).setMaxResults(maxResult);
      List<CapabilityStatementResourceModel> models = query.getResultList();
      return CapabilityStatementResource.fromArray(models);
  }

  @Override
  public List<CapabilityStatementResource> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementResourceModel a", CapabilityStatementResourceModel.class);
      List<CapabilityStatementResourceModel> models = query.getResultList();
      return CapabilityStatementResource.fromArray(models);
  }

  @Override
  @Transactional
  public CapabilityStatementResource create(CapabilityStatementResource e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CapabilityStatementResourceModel(e));
      return e;
  }

  @Transactional
  public CapabilityStatementResource update(CapabilityStatementResource e) {
      final EntityManager em = entityManagerProvider.get();
      CapabilityStatementResourceModel model = em.merge(new CapabilityStatementResourceModel(e));
      return new CapabilityStatementResource(model);
  }

  @Override
  @Transactional
  public void delete(CapabilityStatementResource e) {
      final EntityManager em = entityManagerProvider.get();
      final CapabilityStatementResourceModel removed = em.find(CapabilityStatementResourceModel.class, e.getId());
      em.remove(removed);
  }
}