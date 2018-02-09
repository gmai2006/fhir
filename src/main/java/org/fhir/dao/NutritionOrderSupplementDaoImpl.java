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

import org.fhir.entity.NutritionOrderSupplementModel;
import org.fhir.pojo.NutritionOrderSupplement;

public class NutritionOrderSupplementDaoImpl implements NutritionOrderSupplementDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public NutritionOrderSupplementDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public NutritionOrderSupplement find(String id) {
    final EntityManager em = entityManagerProvider.get();
    NutritionOrderSupplementModel model = em.find(NutritionOrderSupplementModel.class, id);
    if (null == model) return null;
    return new NutritionOrderSupplement(model);
  }

  @Override
  public List<NutritionOrderSupplement> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderSupplementModel a", NutritionOrderSupplementModel.class).setMaxResults(maxResult);
      List<NutritionOrderSupplementModel> models = query.getResultList();
      return NutritionOrderSupplement.fromArray(models);
  }

  @Override
  public List<NutritionOrderSupplement> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderSupplementModel a", NutritionOrderSupplementModel.class);
      List<NutritionOrderSupplementModel> models = query.getResultList();
      return NutritionOrderSupplement.fromArray(models);
  }

  @Override
  @Transactional
  public NutritionOrderSupplement create(NutritionOrderSupplement e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new NutritionOrderSupplementModel(e));
      return e;
  }

  @Transactional
  public NutritionOrderSupplement update(NutritionOrderSupplement e) {
      final EntityManager em = entityManagerProvider.get();
      NutritionOrderSupplementModel model = em.merge(new NutritionOrderSupplementModel(e));
      return new NutritionOrderSupplement(model);
  }

  @Override
  @Transactional
  public void delete(NutritionOrderSupplement e) {
      final EntityManager em = entityManagerProvider.get();
      final NutritionOrderSupplementModel removed = em.find(NutritionOrderSupplementModel.class, e.getId());
      em.remove(removed);
  }
}