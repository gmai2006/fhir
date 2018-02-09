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

import org.fhir.entity.ImmunizationRecommendationDateCriterionModel;
import org.fhir.pojo.ImmunizationRecommendationDateCriterion;

public class ImmunizationRecommendationDateCriterionDaoImpl implements ImmunizationRecommendationDateCriterionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImmunizationRecommendationDateCriterionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImmunizationRecommendationDateCriterion find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImmunizationRecommendationDateCriterionModel model = em.find(ImmunizationRecommendationDateCriterionModel.class, id);
    if (null == model) return null;
    return new ImmunizationRecommendationDateCriterion(model);
  }

  @Override
  public List<ImmunizationRecommendationDateCriterion> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationRecommendationDateCriterionModel a", ImmunizationRecommendationDateCriterionModel.class).setMaxResults(maxResult);
      List<ImmunizationRecommendationDateCriterionModel> models = query.getResultList();
      return ImmunizationRecommendationDateCriterion.fromArray(models);
  }

  @Override
  public List<ImmunizationRecommendationDateCriterion> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationRecommendationDateCriterionModel a", ImmunizationRecommendationDateCriterionModel.class);
      List<ImmunizationRecommendationDateCriterionModel> models = query.getResultList();
      return ImmunizationRecommendationDateCriterion.fromArray(models);
  }

  @Override
  @Transactional
  public ImmunizationRecommendationDateCriterion create(ImmunizationRecommendationDateCriterion e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImmunizationRecommendationDateCriterionModel(e));
      return e;
  }

  @Transactional
  public ImmunizationRecommendationDateCriterion update(ImmunizationRecommendationDateCriterion e) {
      final EntityManager em = entityManagerProvider.get();
      ImmunizationRecommendationDateCriterionModel model = em.merge(new ImmunizationRecommendationDateCriterionModel(e));
      return new ImmunizationRecommendationDateCriterion(model);
  }

  @Override
  @Transactional
  public void delete(ImmunizationRecommendationDateCriterion e) {
      final EntityManager em = entityManagerProvider.get();
      final ImmunizationRecommendationDateCriterionModel removed = em.find(ImmunizationRecommendationDateCriterionModel.class, e.getId());
      em.remove(removed);
  }
}