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

import org.fhir.entity.CapabilityStatementDocumentModel;
import org.fhir.pojo.CapabilityStatementDocument;

public class CapabilityStatementDocumentDaoImpl implements CapabilityStatementDocumentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CapabilityStatementDocumentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CapabilityStatementDocument find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CapabilityStatementDocumentModel model = em.find(CapabilityStatementDocumentModel.class, id);
    if (null == model) return null;
    return new CapabilityStatementDocument(model);
  }

  @Override
  public List<CapabilityStatementDocument> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementDocumentModel a", CapabilityStatementDocumentModel.class).setMaxResults(maxResult);
      List<CapabilityStatementDocumentModel> models = query.getResultList();
      return CapabilityStatementDocument.fromArray(models);
  }

  @Override
  public List<CapabilityStatementDocument> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementDocumentModel a", CapabilityStatementDocumentModel.class);
      List<CapabilityStatementDocumentModel> models = query.getResultList();
      return CapabilityStatementDocument.fromArray(models);
  }

  @Override
  @Transactional
  public CapabilityStatementDocument create(CapabilityStatementDocument e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CapabilityStatementDocumentModel(e));
      return e;
  }

  @Transactional
  public CapabilityStatementDocument update(CapabilityStatementDocument e) {
      final EntityManager em = entityManagerProvider.get();
      CapabilityStatementDocumentModel model = em.merge(new CapabilityStatementDocumentModel(e));
      return new CapabilityStatementDocument(model);
  }

  @Override
  @Transactional
  public void delete(CapabilityStatementDocument e) {
      final EntityManager em = entityManagerProvider.get();
      final CapabilityStatementDocumentModel removed = em.find(CapabilityStatementDocumentModel.class, e.getId());
      em.remove(removed);
  }
}