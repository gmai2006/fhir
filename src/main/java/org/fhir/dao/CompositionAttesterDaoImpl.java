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

import org.fhir.entity.CompositionAttesterModel;
import org.fhir.pojo.CompositionAttester;

public class CompositionAttesterDaoImpl implements CompositionAttesterDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CompositionAttesterDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CompositionAttester find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CompositionAttesterModel model = em.find(CompositionAttesterModel.class, id);
    if (null == model) return null;
    return new CompositionAttester(model);
  }

  @Override
  public List<CompositionAttester> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompositionAttesterModel a", CompositionAttesterModel.class).setMaxResults(maxResult);
      List<CompositionAttesterModel> models = query.getResultList();
      return CompositionAttester.fromArray(models);
  }

  @Override
  public List<CompositionAttester> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompositionAttesterModel a", CompositionAttesterModel.class);
      List<CompositionAttesterModel> models = query.getResultList();
      return CompositionAttester.fromArray(models);
  }

  @Override
  @Transactional
  public CompositionAttester create(CompositionAttester e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CompositionAttesterModel(e));
      return e;
  }

  @Transactional
  public CompositionAttester update(CompositionAttester e) {
      final EntityManager em = entityManagerProvider.get();
      CompositionAttesterModel model = em.merge(new CompositionAttesterModel(e));
      return new CompositionAttester(model);
  }

  @Override
  @Transactional
  public void delete(CompositionAttester e) {
      final EntityManager em = entityManagerProvider.get();
      final CompositionAttesterModel removed = em.find(CompositionAttesterModel.class, e.getId());
      em.remove(removed);
  }
}