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

import org.fhir.entity.ImplementationGuideResourceModel;
import org.fhir.pojo.ImplementationGuideResource;

public class ImplementationGuideResourceDaoImpl implements ImplementationGuideResourceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImplementationGuideResourceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImplementationGuideResource find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImplementationGuideResourceModel model = em.find(ImplementationGuideResourceModel.class, id);
    if (null == model) return null;
    return new ImplementationGuideResource(model);
  }

  @Override
  public List<ImplementationGuideResource> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImplementationGuideResourceModel a", ImplementationGuideResourceModel.class).setMaxResults(maxResult);
      List<ImplementationGuideResourceModel> models = query.getResultList();
      return ImplementationGuideResource.fromArray(models);
  }

  @Override
  public List<ImplementationGuideResource> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImplementationGuideResourceModel a", ImplementationGuideResourceModel.class);
      List<ImplementationGuideResourceModel> models = query.getResultList();
      return ImplementationGuideResource.fromArray(models);
  }

  @Override
  @Transactional
  public ImplementationGuideResource create(ImplementationGuideResource e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImplementationGuideResourceModel(e));
      return e;
  }

  @Transactional
  public ImplementationGuideResource update(ImplementationGuideResource e) {
      final EntityManager em = entityManagerProvider.get();
      ImplementationGuideResourceModel model = em.merge(new ImplementationGuideResourceModel(e));
      return new ImplementationGuideResource(model);
  }

  @Override
  @Transactional
  public void delete(ImplementationGuideResource e) {
      final EntityManager em = entityManagerProvider.get();
      final ImplementationGuideResourceModel removed = em.find(ImplementationGuideResourceModel.class, e.getId());
      em.remove(removed);
  }
}