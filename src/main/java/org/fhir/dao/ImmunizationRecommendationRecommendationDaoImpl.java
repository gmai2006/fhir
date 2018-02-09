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

import org.fhir.entity.ImmunizationRecommendationRecommendationModel;
import org.fhir.pojo.ImmunizationRecommendationRecommendation;

public class ImmunizationRecommendationRecommendationDaoImpl implements ImmunizationRecommendationRecommendationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImmunizationRecommendationRecommendationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImmunizationRecommendationRecommendation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImmunizationRecommendationRecommendationModel model = em.find(ImmunizationRecommendationRecommendationModel.class, id);
    if (null == model) return null;
    return new ImmunizationRecommendationRecommendation(model);
  }

  @Override
  public List<ImmunizationRecommendationRecommendation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationRecommendationRecommendationModel a", ImmunizationRecommendationRecommendationModel.class).setMaxResults(maxResult);
      List<ImmunizationRecommendationRecommendationModel> models = query.getResultList();
      return ImmunizationRecommendationRecommendation.fromArray(models);
  }

  @Override
  public List<ImmunizationRecommendationRecommendation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationRecommendationRecommendationModel a", ImmunizationRecommendationRecommendationModel.class);
      List<ImmunizationRecommendationRecommendationModel> models = query.getResultList();
      return ImmunizationRecommendationRecommendation.fromArray(models);
  }

  @Override
  @Transactional
  public ImmunizationRecommendationRecommendation create(ImmunizationRecommendationRecommendation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImmunizationRecommendationRecommendationModel(e));
      return e;
  }

  @Transactional
  public ImmunizationRecommendationRecommendation update(ImmunizationRecommendationRecommendation e) {
      final EntityManager em = entityManagerProvider.get();
      ImmunizationRecommendationRecommendationModel model = em.merge(new ImmunizationRecommendationRecommendationModel(e));
      return new ImmunizationRecommendationRecommendation(model);
  }

  @Override
  @Transactional
  public void delete(ImmunizationRecommendationRecommendation e) {
      final EntityManager em = entityManagerProvider.get();
      final ImmunizationRecommendationRecommendationModel removed = em.find(ImmunizationRecommendationRecommendationModel.class, e.getId());
      em.remove(removed);
  }
}