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

import org.fhir.entity.ConceptMapUnmappedModel;
import org.fhir.pojo.ConceptMapUnmapped;

public class ConceptMapUnmappedDaoImpl implements ConceptMapUnmappedDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConceptMapUnmappedDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ConceptMapUnmapped find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConceptMapUnmappedModel model = em.find(ConceptMapUnmappedModel.class, id);
    if (null == model) return null;
    return new ConceptMapUnmapped(model);
  }

  @Override
  public List<ConceptMapUnmapped> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConceptMapUnmappedModel a", ConceptMapUnmappedModel.class).setMaxResults(maxResult);
      List<ConceptMapUnmappedModel> models = query.getResultList();
      return ConceptMapUnmapped.fromArray(models);
  }

  @Override
  public List<ConceptMapUnmapped> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConceptMapUnmappedModel a", ConceptMapUnmappedModel.class);
      List<ConceptMapUnmappedModel> models = query.getResultList();
      return ConceptMapUnmapped.fromArray(models);
  }

  @Override
  @Transactional
  public ConceptMapUnmapped create(ConceptMapUnmapped e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConceptMapUnmappedModel(e));
      return e;
  }

  @Transactional
  public ConceptMapUnmapped update(ConceptMapUnmapped e) {
      final EntityManager em = entityManagerProvider.get();
      ConceptMapUnmappedModel model = em.merge(new ConceptMapUnmappedModel(e));
      return new ConceptMapUnmapped(model);
  }

  @Override
  @Transactional
  public void delete(ConceptMapUnmapped e) {
      final EntityManager em = entityManagerProvider.get();
      final ConceptMapUnmappedModel removed = em.find(ConceptMapUnmappedModel.class, e.getId());
      em.remove(removed);
  }
}