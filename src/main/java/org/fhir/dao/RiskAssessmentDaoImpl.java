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

import org.fhir.entity.RiskAssessmentModel;
import org.fhir.pojo.RiskAssessment;

public class RiskAssessmentDaoImpl implements RiskAssessmentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public RiskAssessmentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public RiskAssessment find(String id) {
    final EntityManager em = entityManagerProvider.get();
    RiskAssessmentModel model = em.find(RiskAssessmentModel.class, id);
    if (null == model) return null;
    return new RiskAssessment(model);
  }

  @Override
  public List<RiskAssessment> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RiskAssessmentModel a", RiskAssessmentModel.class).setMaxResults(maxResult);
      List<RiskAssessmentModel> models = query.getResultList();
      return RiskAssessment.fromArray(models);
  }

  @Override
  public List<RiskAssessment> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RiskAssessmentModel a", RiskAssessmentModel.class);
      List<RiskAssessmentModel> models = query.getResultList();
      return RiskAssessment.fromArray(models);
  }

  @Override
  @Transactional
  public RiskAssessment create(RiskAssessment e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new RiskAssessmentModel(e));
      return e;
  }

  @Transactional
  public RiskAssessment update(RiskAssessment e) {
      final EntityManager em = entityManagerProvider.get();
      RiskAssessmentModel model = em.merge(new RiskAssessmentModel(e));
      return new RiskAssessment(model);
  }

  @Override
  @Transactional
  public void delete(RiskAssessment e) {
      final EntityManager em = entityManagerProvider.get();
      final RiskAssessmentModel removed = em.find(RiskAssessmentModel.class, e.getId());
      em.remove(removed);
  }
}