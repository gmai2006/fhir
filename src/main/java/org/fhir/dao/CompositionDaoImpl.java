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

import org.fhir.entity.CompositionModel;
import org.fhir.pojo.Composition;

public class CompositionDaoImpl implements CompositionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CompositionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Composition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CompositionModel model = em.find(CompositionModel.class, id);
    if (null == model) return null;
    return new Composition(model);
  }

  @Override
  public List<Composition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompositionModel a", CompositionModel.class).setMaxResults(maxResult);
      List<CompositionModel> models = query.getResultList();
      return Composition.fromArray(models);
  }

  @Override
  public List<Composition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompositionModel a", CompositionModel.class);
      List<CompositionModel> models = query.getResultList();
      return Composition.fromArray(models);
  }

  @Override
  @Transactional
  public Composition create(Composition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CompositionModel(e));
      return e;
  }

  @Transactional
  public Composition update(Composition e) {
      final EntityManager em = entityManagerProvider.get();
      CompositionModel model = em.merge(new CompositionModel(e));
      return new Composition(model);
  }

  @Override
  @Transactional
  public void delete(Composition e) {
      final EntityManager em = entityManagerProvider.get();
      final CompositionModel removed = em.find(CompositionModel.class, e.getId());
      em.remove(removed);
  }
}