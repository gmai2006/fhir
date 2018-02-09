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

import org.fhir.entity.AppointmentResponseModel;
import org.fhir.pojo.AppointmentResponse;

public class AppointmentResponseDaoImpl implements AppointmentResponseDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AppointmentResponseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public AppointmentResponse find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AppointmentResponseModel model = em.find(AppointmentResponseModel.class, id);
    if (null == model) return null;
    return new AppointmentResponse(model);
  }

  @Override
  public List<AppointmentResponse> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AppointmentResponseModel a", AppointmentResponseModel.class).setMaxResults(maxResult);
      List<AppointmentResponseModel> models = query.getResultList();
      return AppointmentResponse.fromArray(models);
  }

  @Override
  public List<AppointmentResponse> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AppointmentResponseModel a", AppointmentResponseModel.class);
      List<AppointmentResponseModel> models = query.getResultList();
      return AppointmentResponse.fromArray(models);
  }

  @Override
  @Transactional
  public AppointmentResponse create(AppointmentResponse e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AppointmentResponseModel(e));
      return e;
  }

  @Transactional
  public AppointmentResponse update(AppointmentResponse e) {
      final EntityManager em = entityManagerProvider.get();
      AppointmentResponseModel model = em.merge(new AppointmentResponseModel(e));
      return new AppointmentResponse(model);
  }

  @Override
  @Transactional
  public void delete(AppointmentResponse e) {
      final EntityManager em = entityManagerProvider.get();
      final AppointmentResponseModel removed = em.find(AppointmentResponseModel.class, e.getId());
      em.remove(removed);
  }
}