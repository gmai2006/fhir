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

import org.fhir.entity.ExplanationOfBenefitModel;
import org.fhir.pojo.ExplanationOfBenefit;

public class ExplanationOfBenefitDaoImpl implements ExplanationOfBenefitDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExplanationOfBenefitDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExplanationOfBenefit find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExplanationOfBenefitModel model = em.find(ExplanationOfBenefitModel.class, id);
    if (null == model) return null;
    return new ExplanationOfBenefit(model);
  }

  @Override
  public List<ExplanationOfBenefit> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitModel a", ExplanationOfBenefitModel.class).setMaxResults(maxResult);
      List<ExplanationOfBenefitModel> models = query.getResultList();
      return ExplanationOfBenefit.fromArray(models);
  }

  @Override
  public List<ExplanationOfBenefit> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitModel a", ExplanationOfBenefitModel.class);
      List<ExplanationOfBenefitModel> models = query.getResultList();
      return ExplanationOfBenefit.fromArray(models);
  }

  @Override
  @Transactional
  public ExplanationOfBenefit create(ExplanationOfBenefit e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExplanationOfBenefitModel(e));
      return e;
  }

  @Transactional
  public ExplanationOfBenefit update(ExplanationOfBenefit e) {
      final EntityManager em = entityManagerProvider.get();
      ExplanationOfBenefitModel model = em.merge(new ExplanationOfBenefitModel(e));
      return new ExplanationOfBenefit(model);
  }

  @Override
  @Transactional
  public void delete(ExplanationOfBenefit e) {
      final EntityManager em = entityManagerProvider.get();
      final ExplanationOfBenefitModel removed = em.find(ExplanationOfBenefitModel.class, e.getId());
      em.remove(removed);
  }
}