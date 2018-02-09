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

import org.fhir.entity.HealthcareServiceModel;
import org.fhir.pojo.HealthcareService;

public class HealthcareServiceDaoImpl implements HealthcareServiceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public HealthcareServiceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public HealthcareService find(String id) {
    final EntityManager em = entityManagerProvider.get();
    HealthcareServiceModel model = em.find(HealthcareServiceModel.class, id);
    if (null == model) return null;
    return new HealthcareService(model);
  }

  @Override
  public List<HealthcareService> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from HealthcareServiceModel a", HealthcareServiceModel.class).setMaxResults(maxResult);
      List<HealthcareServiceModel> models = query.getResultList();
      return HealthcareService.fromArray(models);
  }

  @Override
  public List<HealthcareService> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from HealthcareServiceModel a", HealthcareServiceModel.class);
      List<HealthcareServiceModel> models = query.getResultList();
      return HealthcareService.fromArray(models);
  }

  @Override
  @Transactional
  public HealthcareService create(HealthcareService e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new HealthcareServiceModel(e));
      return e;
  }

  @Transactional
  public HealthcareService update(HealthcareService e) {
      final EntityManager em = entityManagerProvider.get();
      HealthcareServiceModel model = em.merge(new HealthcareServiceModel(e));
      return new HealthcareService(model);
  }

  @Override
  @Transactional
  public void delete(HealthcareService e) {
      final EntityManager em = entityManagerProvider.get();
      final HealthcareServiceModel removed = em.find(HealthcareServiceModel.class, e.getId());
      em.remove(removed);
  }
}