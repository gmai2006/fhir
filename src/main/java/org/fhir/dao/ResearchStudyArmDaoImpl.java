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

import org.fhir.entity.ResearchStudyArmModel;
import org.fhir.pojo.ResearchStudyArm;

public class ResearchStudyArmDaoImpl implements ResearchStudyArmDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ResearchStudyArmDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ResearchStudyArm find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ResearchStudyArmModel model = em.find(ResearchStudyArmModel.class, id);
    if (null == model) return null;
    return new ResearchStudyArm(model);
  }

  @Override
  public List<ResearchStudyArm> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResearchStudyArmModel a", ResearchStudyArmModel.class).setMaxResults(maxResult);
      List<ResearchStudyArmModel> models = query.getResultList();
      return ResearchStudyArm.fromArray(models);
  }

  @Override
  public List<ResearchStudyArm> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResearchStudyArmModel a", ResearchStudyArmModel.class);
      List<ResearchStudyArmModel> models = query.getResultList();
      return ResearchStudyArm.fromArray(models);
  }

  @Override
  @Transactional
  public ResearchStudyArm create(ResearchStudyArm e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ResearchStudyArmModel(e));
      return e;
  }

  @Transactional
  public ResearchStudyArm update(ResearchStudyArm e) {
      final EntityManager em = entityManagerProvider.get();
      ResearchStudyArmModel model = em.merge(new ResearchStudyArmModel(e));
      return new ResearchStudyArm(model);
  }

  @Override
  @Transactional
  public void delete(ResearchStudyArm e) {
      final EntityManager em = entityManagerProvider.get();
      final ResearchStudyArmModel removed = em.find(ResearchStudyArmModel.class, e.getId());
      em.remove(removed);
  }
}