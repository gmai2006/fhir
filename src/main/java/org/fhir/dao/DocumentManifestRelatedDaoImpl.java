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

import org.fhir.entity.DocumentManifestRelatedModel;
import org.fhir.pojo.DocumentManifestRelated;

public class DocumentManifestRelatedDaoImpl implements DocumentManifestRelatedDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DocumentManifestRelatedDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DocumentManifestRelated find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DocumentManifestRelatedModel model = em.find(DocumentManifestRelatedModel.class, id);
    if (null == model) return null;
    return new DocumentManifestRelated(model);
  }

  @Override
  public List<DocumentManifestRelated> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DocumentManifestRelatedModel a", DocumentManifestRelatedModel.class).setMaxResults(maxResult);
      List<DocumentManifestRelatedModel> models = query.getResultList();
      return DocumentManifestRelated.fromArray(models);
  }

  @Override
  public List<DocumentManifestRelated> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DocumentManifestRelatedModel a", DocumentManifestRelatedModel.class);
      List<DocumentManifestRelatedModel> models = query.getResultList();
      return DocumentManifestRelated.fromArray(models);
  }

  @Override
  @Transactional
  public DocumentManifestRelated create(DocumentManifestRelated e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DocumentManifestRelatedModel(e));
      return e;
  }

  @Transactional
  public DocumentManifestRelated update(DocumentManifestRelated e) {
      final EntityManager em = entityManagerProvider.get();
      DocumentManifestRelatedModel model = em.merge(new DocumentManifestRelatedModel(e));
      return new DocumentManifestRelated(model);
  }

  @Override
  @Transactional
  public void delete(DocumentManifestRelated e) {
      final EntityManager em = entityManagerProvider.get();
      final DocumentManifestRelatedModel removed = em.find(DocumentManifestRelatedModel.class, e.getId());
      em.remove(removed);
  }
}