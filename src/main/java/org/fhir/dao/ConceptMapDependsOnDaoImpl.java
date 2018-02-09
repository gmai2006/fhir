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

import org.fhir.entity.ConceptMapDependsOnModel;
import org.fhir.pojo.ConceptMapDependsOn;

public class ConceptMapDependsOnDaoImpl implements ConceptMapDependsOnDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConceptMapDependsOnDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ConceptMapDependsOn find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConceptMapDependsOnModel model = em.find(ConceptMapDependsOnModel.class, id);
    if (null == model) return null;
    return new ConceptMapDependsOn(model);
  }

  @Override
  public List<ConceptMapDependsOn> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConceptMapDependsOnModel a", ConceptMapDependsOnModel.class).setMaxResults(maxResult);
      List<ConceptMapDependsOnModel> models = query.getResultList();
      return ConceptMapDependsOn.fromArray(models);
  }

  @Override
  public List<ConceptMapDependsOn> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConceptMapDependsOnModel a", ConceptMapDependsOnModel.class);
      List<ConceptMapDependsOnModel> models = query.getResultList();
      return ConceptMapDependsOn.fromArray(models);
  }

  @Override
  @Transactional
  public ConceptMapDependsOn create(ConceptMapDependsOn e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConceptMapDependsOnModel(e));
      return e;
  }

  @Transactional
  public ConceptMapDependsOn update(ConceptMapDependsOn e) {
      final EntityManager em = entityManagerProvider.get();
      ConceptMapDependsOnModel model = em.merge(new ConceptMapDependsOnModel(e));
      return new ConceptMapDependsOn(model);
  }

  @Override
  @Transactional
  public void delete(ConceptMapDependsOn e) {
      final EntityManager em = entityManagerProvider.get();
      final ConceptMapDependsOnModel removed = em.find(ConceptMapDependsOnModel.class, e.getId());
      em.remove(removed);
  }
}