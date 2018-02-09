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

import org.fhir.entity.ExplanationOfBenefitCareTeamModel;
import org.fhir.pojo.ExplanationOfBenefitCareTeam;

public class ExplanationOfBenefitCareTeamDaoImpl implements ExplanationOfBenefitCareTeamDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExplanationOfBenefitCareTeamDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExplanationOfBenefitCareTeam find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExplanationOfBenefitCareTeamModel model = em.find(ExplanationOfBenefitCareTeamModel.class, id);
    if (null == model) return null;
    return new ExplanationOfBenefitCareTeam(model);
  }

  @Override
  public List<ExplanationOfBenefitCareTeam> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitCareTeamModel a", ExplanationOfBenefitCareTeamModel.class).setMaxResults(maxResult);
      List<ExplanationOfBenefitCareTeamModel> models = query.getResultList();
      return ExplanationOfBenefitCareTeam.fromArray(models);
  }

  @Override
  public List<ExplanationOfBenefitCareTeam> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitCareTeamModel a", ExplanationOfBenefitCareTeamModel.class);
      List<ExplanationOfBenefitCareTeamModel> models = query.getResultList();
      return ExplanationOfBenefitCareTeam.fromArray(models);
  }

  @Override
  @Transactional
  public ExplanationOfBenefitCareTeam create(ExplanationOfBenefitCareTeam e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExplanationOfBenefitCareTeamModel(e));
      return e;
  }

  @Transactional
  public ExplanationOfBenefitCareTeam update(ExplanationOfBenefitCareTeam e) {
      final EntityManager em = entityManagerProvider.get();
      ExplanationOfBenefitCareTeamModel model = em.merge(new ExplanationOfBenefitCareTeamModel(e));
      return new ExplanationOfBenefitCareTeam(model);
  }

  @Override
  @Transactional
  public void delete(ExplanationOfBenefitCareTeam e) {
      final EntityManager em = entityManagerProvider.get();
      final ExplanationOfBenefitCareTeamModel removed = em.find(ExplanationOfBenefitCareTeamModel.class, e.getId());
      em.remove(removed);
  }
}