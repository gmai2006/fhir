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

import org.fhir.entity.DocumentReferenceContextModel;
import org.fhir.pojo.DocumentReferenceContext;

public class DocumentReferenceContextDaoImpl implements DocumentReferenceContextDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DocumentReferenceContextDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DocumentReferenceContext find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DocumentReferenceContextModel model = em.find(DocumentReferenceContextModel.class, id);
    if (null == model) return null;
    return new DocumentReferenceContext(model);
  }

  @Override
  public List<DocumentReferenceContext> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DocumentReferenceContextModel a", DocumentReferenceContextModel.class).setMaxResults(maxResult);
      List<DocumentReferenceContextModel> models = query.getResultList();
      return DocumentReferenceContext.fromArray(models);
  }

  @Override
  public List<DocumentReferenceContext> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DocumentReferenceContextModel a", DocumentReferenceContextModel.class);
      List<DocumentReferenceContextModel> models = query.getResultList();
      return DocumentReferenceContext.fromArray(models);
  }

  @Override
  @Transactional
  public DocumentReferenceContext create(DocumentReferenceContext e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DocumentReferenceContextModel(e));
      return e;
  }

  @Transactional
  public DocumentReferenceContext update(DocumentReferenceContext e) {
      final EntityManager em = entityManagerProvider.get();
      DocumentReferenceContextModel model = em.merge(new DocumentReferenceContextModel(e));
      return new DocumentReferenceContext(model);
  }

  @Override
  @Transactional
  public void delete(DocumentReferenceContext e) {
      final EntityManager em = entityManagerProvider.get();
      final DocumentReferenceContextModel removed = em.find(DocumentReferenceContextModel.class, e.getId());
      em.remove(removed);
  }
}