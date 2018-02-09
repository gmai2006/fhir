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

import org.fhir.entity.ClaimRelatedModel;
import org.fhir.pojo.ClaimRelated;

public class ClaimRelatedDaoImpl implements ClaimRelatedDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimRelatedDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimRelated find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimRelatedModel model = em.find(ClaimRelatedModel.class, id);
    if (null == model) return null;
    return new ClaimRelated(model);
  }

  @Override
  public List<ClaimRelated> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimRelatedModel a", ClaimRelatedModel.class).setMaxResults(maxResult);
      List<ClaimRelatedModel> models = query.getResultList();
      return ClaimRelated.fromArray(models);
  }

  @Override
  public List<ClaimRelated> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimRelatedModel a", ClaimRelatedModel.class);
      List<ClaimRelatedModel> models = query.getResultList();
      return ClaimRelated.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimRelated create(ClaimRelated e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimRelatedModel(e));
      return e;
  }

  @Transactional
  public ClaimRelated update(ClaimRelated e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimRelatedModel model = em.merge(new ClaimRelatedModel(e));
      return new ClaimRelated(model);
  }

  @Override
  @Transactional
  public void delete(ClaimRelated e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimRelatedModel removed = em.find(ClaimRelatedModel.class, e.getId());
      em.remove(removed);
  }
}