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

import org.fhir.entity.CompartmentDefinitionResourceModel;
import org.fhir.pojo.CompartmentDefinitionResource;

public class CompartmentDefinitionResourceDaoImpl implements CompartmentDefinitionResourceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CompartmentDefinitionResourceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CompartmentDefinitionResource find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CompartmentDefinitionResourceModel model = em.find(CompartmentDefinitionResourceModel.class, id);
    if (null == model) return null;
    return new CompartmentDefinitionResource(model);
  }

  @Override
  public List<CompartmentDefinitionResource> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompartmentDefinitionResourceModel a", CompartmentDefinitionResourceModel.class).setMaxResults(maxResult);
      List<CompartmentDefinitionResourceModel> models = query.getResultList();
      return CompartmentDefinitionResource.fromArray(models);
  }

  @Override
  public List<CompartmentDefinitionResource> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompartmentDefinitionResourceModel a", CompartmentDefinitionResourceModel.class);
      List<CompartmentDefinitionResourceModel> models = query.getResultList();
      return CompartmentDefinitionResource.fromArray(models);
  }

  @Override
  @Transactional
  public CompartmentDefinitionResource create(CompartmentDefinitionResource e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CompartmentDefinitionResourceModel(e));
      return e;
  }

  @Transactional
  public CompartmentDefinitionResource update(CompartmentDefinitionResource e) {
      final EntityManager em = entityManagerProvider.get();
      CompartmentDefinitionResourceModel model = em.merge(new CompartmentDefinitionResourceModel(e));
      return new CompartmentDefinitionResource(model);
  }

  @Override
  @Transactional
  public void delete(CompartmentDefinitionResource e) {
      final EntityManager em = entityManagerProvider.get();
      final CompartmentDefinitionResourceModel removed = em.find(CompartmentDefinitionResourceModel.class, e.getId());
      em.remove(removed);
  }
}