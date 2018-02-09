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

import org.fhir.entity.AuditEventSourceModel;
import org.fhir.pojo.AuditEventSource;

public class AuditEventSourceDaoImpl implements AuditEventSourceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AuditEventSourceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public AuditEventSource find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AuditEventSourceModel model = em.find(AuditEventSourceModel.class, id);
    if (null == model) return null;
    return new AuditEventSource(model);
  }

  @Override
  public List<AuditEventSource> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AuditEventSourceModel a", AuditEventSourceModel.class).setMaxResults(maxResult);
      List<AuditEventSourceModel> models = query.getResultList();
      return AuditEventSource.fromArray(models);
  }

  @Override
  public List<AuditEventSource> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AuditEventSourceModel a", AuditEventSourceModel.class);
      List<AuditEventSourceModel> models = query.getResultList();
      return AuditEventSource.fromArray(models);
  }

  @Override
  @Transactional
  public AuditEventSource create(AuditEventSource e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AuditEventSourceModel(e));
      return e;
  }

  @Transactional
  public AuditEventSource update(AuditEventSource e) {
      final EntityManager em = entityManagerProvider.get();
      AuditEventSourceModel model = em.merge(new AuditEventSourceModel(e));
      return new AuditEventSource(model);
  }

  @Override
  @Transactional
  public void delete(AuditEventSource e) {
      final EntityManager em = entityManagerProvider.get();
      final AuditEventSourceModel removed = em.find(AuditEventSourceModel.class, e.getId());
      em.remove(removed);
  }
}