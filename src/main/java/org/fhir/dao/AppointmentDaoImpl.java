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

import org.fhir.entity.AppointmentModel;
import org.fhir.pojo.Appointment;
import org.fhir.pojo.AppointmentHelper;

public class AppointmentDaoImpl implements AppointmentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AppointmentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Appointment find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AppointmentModel model = em.find(AppointmentModel.class, id);
    if (null == model) return null;
    return new Appointment(model);
  }

  @Override
  public List<Appointment> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AppointmentModel a", AppointmentModel.class).setMaxResults(maxResult);
      List<AppointmentModel> models = query.getResultList();
      return AppointmentHelper.fromArray2Array(models);
  }

  @Override
  public List<Appointment> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AppointmentModel a", AppointmentModel.class);
      List<AppointmentModel> models = query.getResultList();
      return AppointmentHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Appointment create(Appointment e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AppointmentModel(e));
      return e;
  }

  @Transactional
  public Appointment update(Appointment e) {
      final EntityManager em = entityManagerProvider.get();
      AppointmentModel model = em.merge(new AppointmentModel(e));
      return new Appointment(model);
  }
  @Override
  @Transactional
  public void delete(Appointment e) {
      final EntityManager em = entityManagerProvider.get();
      final AppointmentModel removed = em.find(AppointmentModel.class, e.getId());
      em.remove(removed);
  }
}