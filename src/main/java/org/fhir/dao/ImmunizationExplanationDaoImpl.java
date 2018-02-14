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

import org.fhir.entity.ImmunizationExplanationModel;
import org.fhir.pojo.ImmunizationExplanation;
import org.fhir.pojo.ImmunizationExplanationHelper;

public class ImmunizationExplanationDaoImpl implements ImmunizationExplanationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImmunizationExplanationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImmunizationExplanation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImmunizationExplanationModel model = em.find(ImmunizationExplanationModel.class, id);
    if (null == model) return null;
    return new ImmunizationExplanation(model);
  }

  @Override
  public List<ImmunizationExplanation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationExplanationModel a", ImmunizationExplanationModel.class).setMaxResults(maxResult);
      List<ImmunizationExplanationModel> models = query.getResultList();
      return ImmunizationExplanationHelper.fromArray2Array(models);
  }

  @Override
  public List<ImmunizationExplanation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationExplanationModel a", ImmunizationExplanationModel.class);
      List<ImmunizationExplanationModel> models = query.getResultList();
      return ImmunizationExplanationHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(ImmunizationExplanation e) {
      final EntityManager em = entityManagerProvider.get();
      final ImmunizationExplanationModel removed = em.find(ImmunizationExplanationModel.class, e.getId());
      em.remove(removed);
  }
}