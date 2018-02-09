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

import org.fhir.entity.ExplanationOfBenefitInformationModel;
import org.fhir.pojo.ExplanationOfBenefitInformation;

public class ExplanationOfBenefitInformationDaoImpl implements ExplanationOfBenefitInformationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExplanationOfBenefitInformationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExplanationOfBenefitInformation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExplanationOfBenefitInformationModel model = em.find(ExplanationOfBenefitInformationModel.class, id);
    if (null == model) return null;
    return new ExplanationOfBenefitInformation(model);
  }

  @Override
  public List<ExplanationOfBenefitInformation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitInformationModel a", ExplanationOfBenefitInformationModel.class).setMaxResults(maxResult);
      List<ExplanationOfBenefitInformationModel> models = query.getResultList();
      return ExplanationOfBenefitInformation.fromArray(models);
  }

  @Override
  public List<ExplanationOfBenefitInformation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitInformationModel a", ExplanationOfBenefitInformationModel.class);
      List<ExplanationOfBenefitInformationModel> models = query.getResultList();
      return ExplanationOfBenefitInformation.fromArray(models);
  }

  @Override
  @Transactional
  public ExplanationOfBenefitInformation create(ExplanationOfBenefitInformation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExplanationOfBenefitInformationModel(e));
      return e;
  }

  @Transactional
  public ExplanationOfBenefitInformation update(ExplanationOfBenefitInformation e) {
      final EntityManager em = entityManagerProvider.get();
      ExplanationOfBenefitInformationModel model = em.merge(new ExplanationOfBenefitInformationModel(e));
      return new ExplanationOfBenefitInformation(model);
  }

  @Override
  @Transactional
  public void delete(ExplanationOfBenefitInformation e) {
      final EntityManager em = entityManagerProvider.get();
      final ExplanationOfBenefitInformationModel removed = em.find(ExplanationOfBenefitInformationModel.class, e.getId());
      em.remove(removed);
  }
}