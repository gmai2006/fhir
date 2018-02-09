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

import org.fhir.entity.HealthcareServiceAvailableTimeModel;
import org.fhir.pojo.HealthcareServiceAvailableTime;

public class HealthcareServiceAvailableTimeDaoImpl implements HealthcareServiceAvailableTimeDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public HealthcareServiceAvailableTimeDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public HealthcareServiceAvailableTime find(String id) {
    final EntityManager em = entityManagerProvider.get();
    HealthcareServiceAvailableTimeModel model = em.find(HealthcareServiceAvailableTimeModel.class, id);
    if (null == model) return null;
    return new HealthcareServiceAvailableTime(model);
  }

  @Override
  public List<HealthcareServiceAvailableTime> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from HealthcareServiceAvailableTimeModel a", HealthcareServiceAvailableTimeModel.class).setMaxResults(maxResult);
      List<HealthcareServiceAvailableTimeModel> models = query.getResultList();
      return HealthcareServiceAvailableTime.fromArray(models);
  }

  @Override
  public List<HealthcareServiceAvailableTime> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from HealthcareServiceAvailableTimeModel a", HealthcareServiceAvailableTimeModel.class);
      List<HealthcareServiceAvailableTimeModel> models = query.getResultList();
      return HealthcareServiceAvailableTime.fromArray(models);
  }

  @Override
  @Transactional
  public HealthcareServiceAvailableTime create(HealthcareServiceAvailableTime e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new HealthcareServiceAvailableTimeModel(e));
      return e;
  }

  @Transactional
  public HealthcareServiceAvailableTime update(HealthcareServiceAvailableTime e) {
      final EntityManager em = entityManagerProvider.get();
      HealthcareServiceAvailableTimeModel model = em.merge(new HealthcareServiceAvailableTimeModel(e));
      return new HealthcareServiceAvailableTime(model);
  }

  @Override
  @Transactional
  public void delete(HealthcareServiceAvailableTime e) {
      final EntityManager em = entityManagerProvider.get();
      final HealthcareServiceAvailableTimeModel removed = em.find(HealthcareServiceAvailableTimeModel.class, e.getId());
      em.remove(removed);
  }
}