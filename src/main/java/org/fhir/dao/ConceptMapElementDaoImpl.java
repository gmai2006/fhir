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

import org.fhir.entity.ConceptMapElementModel;
import org.fhir.pojo.ConceptMapElement;

public class ConceptMapElementDaoImpl implements ConceptMapElementDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConceptMapElementDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ConceptMapElement find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConceptMapElementModel model = em.find(ConceptMapElementModel.class, id);
    if (null == model) return null;
    return new ConceptMapElement(model);
  }

  @Override
  public List<ConceptMapElement> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConceptMapElementModel a", ConceptMapElementModel.class).setMaxResults(maxResult);
      List<ConceptMapElementModel> models = query.getResultList();
      return ConceptMapElement.fromArray(models);
  }

  @Override
  public List<ConceptMapElement> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConceptMapElementModel a", ConceptMapElementModel.class);
      List<ConceptMapElementModel> models = query.getResultList();
      return ConceptMapElement.fromArray(models);
  }

  @Override
  @Transactional
  public ConceptMapElement create(ConceptMapElement e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConceptMapElementModel(e));
      return e;
  }

  @Transactional
  public ConceptMapElement update(ConceptMapElement e) {
      final EntityManager em = entityManagerProvider.get();
      ConceptMapElementModel model = em.merge(new ConceptMapElementModel(e));
      return new ConceptMapElement(model);
  }

  @Override
  @Transactional
  public void delete(ConceptMapElement e) {
      final EntityManager em = entityManagerProvider.get();
      final ConceptMapElementModel removed = em.find(ConceptMapElementModel.class, e.getId());
      em.remove(removed);
  }
}