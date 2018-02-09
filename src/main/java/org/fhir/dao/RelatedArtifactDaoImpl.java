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

import org.fhir.entity.RelatedArtifactModel;
import org.fhir.pojo.RelatedArtifact;

public class RelatedArtifactDaoImpl implements RelatedArtifactDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public RelatedArtifactDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public RelatedArtifact find(String id) {
    final EntityManager em = entityManagerProvider.get();
    RelatedArtifactModel model = em.find(RelatedArtifactModel.class, id);
    if (null == model) return null;
    return new RelatedArtifact(model);
  }

  @Override
  public List<RelatedArtifact> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RelatedArtifactModel a", RelatedArtifactModel.class).setMaxResults(maxResult);
      List<RelatedArtifactModel> models = query.getResultList();
      return RelatedArtifact.fromArray(models);
  }

  @Override
  public List<RelatedArtifact> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RelatedArtifactModel a", RelatedArtifactModel.class);
      List<RelatedArtifactModel> models = query.getResultList();
      return RelatedArtifact.fromArray(models);
  }

  @Override
  @Transactional
  public RelatedArtifact create(RelatedArtifact e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new RelatedArtifactModel(e));
      return e;
  }

  @Transactional
  public RelatedArtifact update(RelatedArtifact e) {
      final EntityManager em = entityManagerProvider.get();
      RelatedArtifactModel model = em.merge(new RelatedArtifactModel(e));
      return new RelatedArtifact(model);
  }

  @Override
  @Transactional
  public void delete(RelatedArtifact e) {
      final EntityManager em = entityManagerProvider.get();
      final RelatedArtifactModel removed = em.find(RelatedArtifactModel.class, e.getId());
      em.remove(removed);
  }
}