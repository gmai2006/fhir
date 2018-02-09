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

import org.fhir.entity.PractitionerQualificationModel;
import org.fhir.pojo.PractitionerQualification;

public class PractitionerQualificationDaoImpl implements PractitionerQualificationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PractitionerQualificationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PractitionerQualification find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PractitionerQualificationModel model = em.find(PractitionerQualificationModel.class, id);
    if (null == model) return null;
    return new PractitionerQualification(model);
  }

  @Override
  public List<PractitionerQualification> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PractitionerQualificationModel a", PractitionerQualificationModel.class).setMaxResults(maxResult);
      List<PractitionerQualificationModel> models = query.getResultList();
      return PractitionerQualification.fromArray(models);
  }

  @Override
  public List<PractitionerQualification> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PractitionerQualificationModel a", PractitionerQualificationModel.class);
      List<PractitionerQualificationModel> models = query.getResultList();
      return PractitionerQualification.fromArray(models);
  }

  @Override
  @Transactional
  public PractitionerQualification create(PractitionerQualification e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PractitionerQualificationModel(e));
      return e;
  }

  @Transactional
  public PractitionerQualification update(PractitionerQualification e) {
      final EntityManager em = entityManagerProvider.get();
      PractitionerQualificationModel model = em.merge(new PractitionerQualificationModel(e));
      return new PractitionerQualification(model);
  }

  @Override
  @Transactional
  public void delete(PractitionerQualification e) {
      final EntityManager em = entityManagerProvider.get();
      final PractitionerQualificationModel removed = em.find(PractitionerQualificationModel.class, e.getId());
      em.remove(removed);
  }
}