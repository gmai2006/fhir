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

import org.fhir.entity.AuditEventAgentModel;
import org.fhir.pojo.AuditEventAgent;

public class AuditEventAgentDaoImpl implements AuditEventAgentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AuditEventAgentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public AuditEventAgent find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AuditEventAgentModel model = em.find(AuditEventAgentModel.class, id);
    if (null == model) return null;
    return new AuditEventAgent(model);
  }

  @Override
  public List<AuditEventAgent> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AuditEventAgentModel a", AuditEventAgentModel.class).setMaxResults(maxResult);
      List<AuditEventAgentModel> models = query.getResultList();
      return AuditEventAgent.fromArray(models);
  }

  @Override
  public List<AuditEventAgent> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AuditEventAgentModel a", AuditEventAgentModel.class);
      List<AuditEventAgentModel> models = query.getResultList();
      return AuditEventAgent.fromArray(models);
  }

  @Override
  @Transactional
  public AuditEventAgent create(AuditEventAgent e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AuditEventAgentModel(e));
      return e;
  }

  @Transactional
  public AuditEventAgent update(AuditEventAgent e) {
      final EntityManager em = entityManagerProvider.get();
      AuditEventAgentModel model = em.merge(new AuditEventAgentModel(e));
      return new AuditEventAgent(model);
  }

  @Override
  @Transactional
  public void delete(AuditEventAgent e) {
      final EntityManager em = entityManagerProvider.get();
      final AuditEventAgentModel removed = em.find(AuditEventAgentModel.class, e.getId());
      em.remove(removed);
  }
}