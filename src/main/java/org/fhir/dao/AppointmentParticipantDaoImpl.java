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

import org.fhir.entity.AppointmentParticipantModel;
import org.fhir.pojo.AppointmentParticipant;

public class AppointmentParticipantDaoImpl implements AppointmentParticipantDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AppointmentParticipantDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public AppointmentParticipant find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AppointmentParticipantModel model = em.find(AppointmentParticipantModel.class, id);
    if (null == model) return null;
    return new AppointmentParticipant(model);
  }

  @Override
  public List<AppointmentParticipant> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AppointmentParticipantModel a", AppointmentParticipantModel.class).setMaxResults(maxResult);
      List<AppointmentParticipantModel> models = query.getResultList();
      return AppointmentParticipant.fromArray(models);
  }

  @Override
  public List<AppointmentParticipant> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AppointmentParticipantModel a", AppointmentParticipantModel.class);
      List<AppointmentParticipantModel> models = query.getResultList();
      return AppointmentParticipant.fromArray(models);
  }

  @Override
  @Transactional
  public AppointmentParticipant create(AppointmentParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AppointmentParticipantModel(e));
      return e;
  }

  @Transactional
  public AppointmentParticipant update(AppointmentParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      AppointmentParticipantModel model = em.merge(new AppointmentParticipantModel(e));
      return new AppointmentParticipant(model);
  }

  @Override
  @Transactional
  public void delete(AppointmentParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      final AppointmentParticipantModel removed = em.find(AppointmentParticipantModel.class, e.getId());
      em.remove(removed);
  }
}