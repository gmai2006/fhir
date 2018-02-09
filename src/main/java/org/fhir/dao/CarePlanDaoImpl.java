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

import org.fhir.entity.CarePlanModel;
import org.fhir.pojo.CarePlan;

public class CarePlanDaoImpl implements CarePlanDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CarePlanDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CarePlan find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CarePlanModel model = em.find(CarePlanModel.class, id);
    if (null == model) return null;
    return new CarePlan(model);
  }

  @Override
  public List<CarePlan> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CarePlanModel a", CarePlanModel.class).setMaxResults(maxResult);
      List<CarePlanModel> models = query.getResultList();
      return CarePlan.fromArray(models);
  }

  @Override
  public List<CarePlan> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CarePlanModel a", CarePlanModel.class);
      List<CarePlanModel> models = query.getResultList();
      return CarePlan.fromArray(models);
  }

  @Override
  @Transactional
  public CarePlan create(CarePlan e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CarePlanModel(e));
      return e;
  }

  @Transactional
  public CarePlan update(CarePlan e) {
      final EntityManager em = entityManagerProvider.get();
      CarePlanModel model = em.merge(new CarePlanModel(e));
      return new CarePlan(model);
  }

  @Override
  @Transactional
  public void delete(CarePlan e) {
      final EntityManager em = entityManagerProvider.get();
      final CarePlanModel removed = em.find(CarePlanModel.class, e.getId());
      em.remove(removed);
  }
}