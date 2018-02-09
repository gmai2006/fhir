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

import org.fhir.entity.NutritionOrderEnteralFormulaModel;
import org.fhir.pojo.NutritionOrderEnteralFormula;

public class NutritionOrderEnteralFormulaDaoImpl implements NutritionOrderEnteralFormulaDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public NutritionOrderEnteralFormulaDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public NutritionOrderEnteralFormula find(String id) {
    final EntityManager em = entityManagerProvider.get();
    NutritionOrderEnteralFormulaModel model = em.find(NutritionOrderEnteralFormulaModel.class, id);
    if (null == model) return null;
    return new NutritionOrderEnteralFormula(model);
  }

  @Override
  public List<NutritionOrderEnteralFormula> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderEnteralFormulaModel a", NutritionOrderEnteralFormulaModel.class).setMaxResults(maxResult);
      List<NutritionOrderEnteralFormulaModel> models = query.getResultList();
      return NutritionOrderEnteralFormula.fromArray(models);
  }

  @Override
  public List<NutritionOrderEnteralFormula> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderEnteralFormulaModel a", NutritionOrderEnteralFormulaModel.class);
      List<NutritionOrderEnteralFormulaModel> models = query.getResultList();
      return NutritionOrderEnteralFormula.fromArray(models);
  }

  @Override
  @Transactional
  public NutritionOrderEnteralFormula create(NutritionOrderEnteralFormula e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new NutritionOrderEnteralFormulaModel(e));
      return e;
  }

  @Transactional
  public NutritionOrderEnteralFormula update(NutritionOrderEnteralFormula e) {
      final EntityManager em = entityManagerProvider.get();
      NutritionOrderEnteralFormulaModel model = em.merge(new NutritionOrderEnteralFormulaModel(e));
      return new NutritionOrderEnteralFormula(model);
  }

  @Override
  @Transactional
  public void delete(NutritionOrderEnteralFormula e) {
      final EntityManager em = entityManagerProvider.get();
      final NutritionOrderEnteralFormulaModel removed = em.find(NutritionOrderEnteralFormulaModel.class, e.getId());
      em.remove(removed);
  }
}