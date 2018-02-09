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

import org.fhir.entity.ConceptMapTargetModel;
import org.fhir.pojo.ConceptMapTarget;

public class ConceptMapTargetDaoImpl implements ConceptMapTargetDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConceptMapTargetDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ConceptMapTarget find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConceptMapTargetModel model = em.find(ConceptMapTargetModel.class, id);
    if (null == model) return null;
    return new ConceptMapTarget(model);
  }

  @Override
  public List<ConceptMapTarget> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConceptMapTargetModel a", ConceptMapTargetModel.class).setMaxResults(maxResult);
      List<ConceptMapTargetModel> models = query.getResultList();
      return ConceptMapTarget.fromArray(models);
  }

  @Override
  public List<ConceptMapTarget> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConceptMapTargetModel a", ConceptMapTargetModel.class);
      List<ConceptMapTargetModel> models = query.getResultList();
      return ConceptMapTarget.fromArray(models);
  }

  @Override
  @Transactional
  public ConceptMapTarget create(ConceptMapTarget e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConceptMapTargetModel(e));
      return e;
  }

  @Transactional
  public ConceptMapTarget update(ConceptMapTarget e) {
      final EntityManager em = entityManagerProvider.get();
      ConceptMapTargetModel model = em.merge(new ConceptMapTargetModel(e));
      return new ConceptMapTarget(model);
  }

  @Override
  @Transactional
  public void delete(ConceptMapTarget e) {
      final EntityManager em = entityManagerProvider.get();
      final ConceptMapTargetModel removed = em.find(ConceptMapTargetModel.class, e.getId());
      em.remove(removed);
  }
}