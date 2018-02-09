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

import org.fhir.entity.DocumentReferenceRelatedModel;
import org.fhir.pojo.DocumentReferenceRelated;

public class DocumentReferenceRelatedDaoImpl implements DocumentReferenceRelatedDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DocumentReferenceRelatedDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DocumentReferenceRelated find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DocumentReferenceRelatedModel model = em.find(DocumentReferenceRelatedModel.class, id);
    if (null == model) return null;
    return new DocumentReferenceRelated(model);
  }

  @Override
  public List<DocumentReferenceRelated> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DocumentReferenceRelatedModel a", DocumentReferenceRelatedModel.class).setMaxResults(maxResult);
      List<DocumentReferenceRelatedModel> models = query.getResultList();
      return DocumentReferenceRelated.fromArray(models);
  }

  @Override
  public List<DocumentReferenceRelated> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DocumentReferenceRelatedModel a", DocumentReferenceRelatedModel.class);
      List<DocumentReferenceRelatedModel> models = query.getResultList();
      return DocumentReferenceRelated.fromArray(models);
  }

  @Override
  @Transactional
  public DocumentReferenceRelated create(DocumentReferenceRelated e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DocumentReferenceRelatedModel(e));
      return e;
  }

  @Transactional
  public DocumentReferenceRelated update(DocumentReferenceRelated e) {
      final EntityManager em = entityManagerProvider.get();
      DocumentReferenceRelatedModel model = em.merge(new DocumentReferenceRelatedModel(e));
      return new DocumentReferenceRelated(model);
  }

  @Override
  @Transactional
  public void delete(DocumentReferenceRelated e) {
      final EntityManager em = entityManagerProvider.get();
      final DocumentReferenceRelatedModel removed = em.find(DocumentReferenceRelatedModel.class, e.getId());
      em.remove(removed);
  }
}