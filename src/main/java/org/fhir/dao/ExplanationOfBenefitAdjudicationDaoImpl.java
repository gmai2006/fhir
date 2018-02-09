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

import org.fhir.entity.ExplanationOfBenefitAdjudicationModel;
import org.fhir.pojo.ExplanationOfBenefitAdjudication;

public class ExplanationOfBenefitAdjudicationDaoImpl implements ExplanationOfBenefitAdjudicationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExplanationOfBenefitAdjudicationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExplanationOfBenefitAdjudication find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExplanationOfBenefitAdjudicationModel model = em.find(ExplanationOfBenefitAdjudicationModel.class, id);
    if (null == model) return null;
    return new ExplanationOfBenefitAdjudication(model);
  }

  @Override
  public List<ExplanationOfBenefitAdjudication> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitAdjudicationModel a", ExplanationOfBenefitAdjudicationModel.class).setMaxResults(maxResult);
      List<ExplanationOfBenefitAdjudicationModel> models = query.getResultList();
      return ExplanationOfBenefitAdjudication.fromArray(models);
  }

  @Override
  public List<ExplanationOfBenefitAdjudication> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitAdjudicationModel a", ExplanationOfBenefitAdjudicationModel.class);
      List<ExplanationOfBenefitAdjudicationModel> models = query.getResultList();
      return ExplanationOfBenefitAdjudication.fromArray(models);
  }

  @Override
  @Transactional
  public ExplanationOfBenefitAdjudication create(ExplanationOfBenefitAdjudication e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExplanationOfBenefitAdjudicationModel(e));
      return e;
  }

  @Transactional
  public ExplanationOfBenefitAdjudication update(ExplanationOfBenefitAdjudication e) {
      final EntityManager em = entityManagerProvider.get();
      ExplanationOfBenefitAdjudicationModel model = em.merge(new ExplanationOfBenefitAdjudicationModel(e));
      return new ExplanationOfBenefitAdjudication(model);
  }

  @Override
  @Transactional
  public void delete(ExplanationOfBenefitAdjudication e) {
      final EntityManager em = entityManagerProvider.get();
      final ExplanationOfBenefitAdjudicationModel removed = em.find(ExplanationOfBenefitAdjudicationModel.class, e.getId());
      em.remove(removed);
  }
}