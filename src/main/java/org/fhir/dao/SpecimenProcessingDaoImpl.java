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

import org.fhir.entity.SpecimenProcessingModel;
import org.fhir.pojo.SpecimenProcessing;

public class SpecimenProcessingDaoImpl implements SpecimenProcessingDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SpecimenProcessingDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public SpecimenProcessing find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SpecimenProcessingModel model = em.find(SpecimenProcessingModel.class, id);
    if (null == model) return null;
    return new SpecimenProcessing(model);
  }

  @Override
  public List<SpecimenProcessing> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SpecimenProcessingModel a", SpecimenProcessingModel.class).setMaxResults(maxResult);
      List<SpecimenProcessingModel> models = query.getResultList();
      return SpecimenProcessing.fromArray(models);
  }

  @Override
  public List<SpecimenProcessing> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SpecimenProcessingModel a", SpecimenProcessingModel.class);
      List<SpecimenProcessingModel> models = query.getResultList();
      return SpecimenProcessing.fromArray(models);
  }

  @Override
  @Transactional
  public SpecimenProcessing create(SpecimenProcessing e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SpecimenProcessingModel(e));
      return e;
  }

  @Transactional
  public SpecimenProcessing update(SpecimenProcessing e) {
      final EntityManager em = entityManagerProvider.get();
      SpecimenProcessingModel model = em.merge(new SpecimenProcessingModel(e));
      return new SpecimenProcessing(model);
  }

  @Override
  @Transactional
  public void delete(SpecimenProcessing e) {
      final EntityManager em = entityManagerProvider.get();
      final SpecimenProcessingModel removed = em.find(SpecimenProcessingModel.class, e.getId());
      em.remove(removed);
  }
}