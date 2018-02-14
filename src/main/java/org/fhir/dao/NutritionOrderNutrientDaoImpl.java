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

import org.fhir.entity.NutritionOrderNutrientModel;
import org.fhir.pojo.NutritionOrderNutrient;
import org.fhir.pojo.NutritionOrderNutrientHelper;

public class NutritionOrderNutrientDaoImpl implements NutritionOrderNutrientDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public NutritionOrderNutrientDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public NutritionOrderNutrient find(String id) {
    final EntityManager em = entityManagerProvider.get();
    NutritionOrderNutrientModel model = em.find(NutritionOrderNutrientModel.class, id);
    if (null == model) return null;
    return new NutritionOrderNutrient(model);
  }

  @Override
  public List<NutritionOrderNutrient> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderNutrientModel a", NutritionOrderNutrientModel.class).setMaxResults(maxResult);
      List<NutritionOrderNutrientModel> models = query.getResultList();
      return NutritionOrderNutrientHelper.fromArray2Array(models);
  }

  @Override
  public List<NutritionOrderNutrient> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderNutrientModel a", NutritionOrderNutrientModel.class);
      List<NutritionOrderNutrientModel> models = query.getResultList();
      return NutritionOrderNutrientHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(NutritionOrderNutrient e) {
      final EntityManager em = entityManagerProvider.get();
      final NutritionOrderNutrientModel removed = em.find(NutritionOrderNutrientModel.class, e.getId());
      em.remove(removed);
  }
}