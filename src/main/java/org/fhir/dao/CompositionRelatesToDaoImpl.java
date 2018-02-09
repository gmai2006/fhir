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

import org.fhir.entity.CompositionRelatesToModel;
import org.fhir.pojo.CompositionRelatesTo;

public class CompositionRelatesToDaoImpl implements CompositionRelatesToDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CompositionRelatesToDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CompositionRelatesTo find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CompositionRelatesToModel model = em.find(CompositionRelatesToModel.class, id);
    if (null == model) return null;
    return new CompositionRelatesTo(model);
  }

  @Override
  public List<CompositionRelatesTo> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompositionRelatesToModel a", CompositionRelatesToModel.class).setMaxResults(maxResult);
      List<CompositionRelatesToModel> models = query.getResultList();
      return CompositionRelatesTo.fromArray(models);
  }

  @Override
  public List<CompositionRelatesTo> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompositionRelatesToModel a", CompositionRelatesToModel.class);
      List<CompositionRelatesToModel> models = query.getResultList();
      return CompositionRelatesTo.fromArray(models);
  }

  @Override
  @Transactional
  public CompositionRelatesTo create(CompositionRelatesTo e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CompositionRelatesToModel(e));
      return e;
  }

  @Transactional
  public CompositionRelatesTo update(CompositionRelatesTo e) {
      final EntityManager em = entityManagerProvider.get();
      CompositionRelatesToModel model = em.merge(new CompositionRelatesToModel(e));
      return new CompositionRelatesTo(model);
  }

  @Override
  @Transactional
  public void delete(CompositionRelatesTo e) {
      final EntityManager em = entityManagerProvider.get();
      final CompositionRelatesToModel removed = em.find(CompositionRelatesToModel.class, e.getId());
      em.remove(removed);
  }
}