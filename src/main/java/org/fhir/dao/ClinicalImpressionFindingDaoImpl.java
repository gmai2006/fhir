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

import org.fhir.entity.ClinicalImpressionFindingModel;
import org.fhir.pojo.ClinicalImpressionFinding;

public class ClinicalImpressionFindingDaoImpl implements ClinicalImpressionFindingDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClinicalImpressionFindingDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClinicalImpressionFinding find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClinicalImpressionFindingModel model = em.find(ClinicalImpressionFindingModel.class, id);
    if (null == model) return null;
    return new ClinicalImpressionFinding(model);
  }

  @Override
  public List<ClinicalImpressionFinding> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClinicalImpressionFindingModel a", ClinicalImpressionFindingModel.class).setMaxResults(maxResult);
      List<ClinicalImpressionFindingModel> models = query.getResultList();
      return ClinicalImpressionFinding.fromArray(models);
  }

  @Override
  public List<ClinicalImpressionFinding> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClinicalImpressionFindingModel a", ClinicalImpressionFindingModel.class);
      List<ClinicalImpressionFindingModel> models = query.getResultList();
      return ClinicalImpressionFinding.fromArray(models);
  }

  @Override
  @Transactional
  public ClinicalImpressionFinding create(ClinicalImpressionFinding e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClinicalImpressionFindingModel(e));
      return e;
  }

  @Transactional
  public ClinicalImpressionFinding update(ClinicalImpressionFinding e) {
      final EntityManager em = entityManagerProvider.get();
      ClinicalImpressionFindingModel model = em.merge(new ClinicalImpressionFindingModel(e));
      return new ClinicalImpressionFinding(model);
  }

  @Override
  @Transactional
  public void delete(ClinicalImpressionFinding e) {
      final EntityManager em = entityManagerProvider.get();
      final ClinicalImpressionFindingModel removed = em.find(ClinicalImpressionFindingModel.class, e.getId());
      em.remove(removed);
  }
}