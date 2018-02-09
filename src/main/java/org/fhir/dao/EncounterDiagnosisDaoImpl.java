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

import org.fhir.entity.EncounterDiagnosisModel;
import org.fhir.pojo.EncounterDiagnosis;

public class EncounterDiagnosisDaoImpl implements EncounterDiagnosisDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EncounterDiagnosisDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public EncounterDiagnosis find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EncounterDiagnosisModel model = em.find(EncounterDiagnosisModel.class, id);
    if (null == model) return null;
    return new EncounterDiagnosis(model);
  }

  @Override
  public List<EncounterDiagnosis> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EncounterDiagnosisModel a", EncounterDiagnosisModel.class).setMaxResults(maxResult);
      List<EncounterDiagnosisModel> models = query.getResultList();
      return EncounterDiagnosis.fromArray(models);
  }

  @Override
  public List<EncounterDiagnosis> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EncounterDiagnosisModel a", EncounterDiagnosisModel.class);
      List<EncounterDiagnosisModel> models = query.getResultList();
      return EncounterDiagnosis.fromArray(models);
  }

  @Override
  @Transactional
  public EncounterDiagnosis create(EncounterDiagnosis e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new EncounterDiagnosisModel(e));
      return e;
  }

  @Transactional
  public EncounterDiagnosis update(EncounterDiagnosis e) {
      final EntityManager em = entityManagerProvider.get();
      EncounterDiagnosisModel model = em.merge(new EncounterDiagnosisModel(e));
      return new EncounterDiagnosis(model);
  }

  @Override
  @Transactional
  public void delete(EncounterDiagnosis e) {
      final EntityManager em = entityManagerProvider.get();
      final EncounterDiagnosisModel removed = em.find(EncounterDiagnosisModel.class, e.getId());
      em.remove(removed);
  }
}