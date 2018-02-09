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

import org.fhir.entity.ExplanationOfBenefitAccidentModel;
import org.fhir.pojo.ExplanationOfBenefitAccident;

public class ExplanationOfBenefitAccidentDaoImpl implements ExplanationOfBenefitAccidentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExplanationOfBenefitAccidentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExplanationOfBenefitAccident find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExplanationOfBenefitAccidentModel model = em.find(ExplanationOfBenefitAccidentModel.class, id);
    if (null == model) return null;
    return new ExplanationOfBenefitAccident(model);
  }

  @Override
  public List<ExplanationOfBenefitAccident> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitAccidentModel a", ExplanationOfBenefitAccidentModel.class).setMaxResults(maxResult);
      List<ExplanationOfBenefitAccidentModel> models = query.getResultList();
      return ExplanationOfBenefitAccident.fromArray(models);
  }

  @Override
  public List<ExplanationOfBenefitAccident> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitAccidentModel a", ExplanationOfBenefitAccidentModel.class);
      List<ExplanationOfBenefitAccidentModel> models = query.getResultList();
      return ExplanationOfBenefitAccident.fromArray(models);
  }

  @Override
  @Transactional
  public ExplanationOfBenefitAccident create(ExplanationOfBenefitAccident e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExplanationOfBenefitAccidentModel(e));
      return e;
  }

  @Transactional
  public ExplanationOfBenefitAccident update(ExplanationOfBenefitAccident e) {
      final EntityManager em = entityManagerProvider.get();
      ExplanationOfBenefitAccidentModel model = em.merge(new ExplanationOfBenefitAccidentModel(e));
      return new ExplanationOfBenefitAccident(model);
  }

  @Override
  @Transactional
  public void delete(ExplanationOfBenefitAccident e) {
      final EntityManager em = entityManagerProvider.get();
      final ExplanationOfBenefitAccidentModel removed = em.find(ExplanationOfBenefitAccidentModel.class, e.getId());
      em.remove(removed);
  }
}