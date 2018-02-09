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

import org.fhir.entity.MedicationAdministrationDosageModel;
import org.fhir.pojo.MedicationAdministrationDosage;

public class MedicationAdministrationDosageDaoImpl implements MedicationAdministrationDosageDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationAdministrationDosageDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationAdministrationDosage find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationAdministrationDosageModel model = em.find(MedicationAdministrationDosageModel.class, id);
    if (null == model) return null;
    return new MedicationAdministrationDosage(model);
  }

  @Override
  public List<MedicationAdministrationDosage> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationAdministrationDosageModel a", MedicationAdministrationDosageModel.class).setMaxResults(maxResult);
      List<MedicationAdministrationDosageModel> models = query.getResultList();
      return MedicationAdministrationDosage.fromArray(models);
  }

  @Override
  public List<MedicationAdministrationDosage> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationAdministrationDosageModel a", MedicationAdministrationDosageModel.class);
      List<MedicationAdministrationDosageModel> models = query.getResultList();
      return MedicationAdministrationDosage.fromArray(models);
  }

  @Override
  @Transactional
  public MedicationAdministrationDosage create(MedicationAdministrationDosage e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationAdministrationDosageModel(e));
      return e;
  }

  @Transactional
  public MedicationAdministrationDosage update(MedicationAdministrationDosage e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationAdministrationDosageModel model = em.merge(new MedicationAdministrationDosageModel(e));
      return new MedicationAdministrationDosage(model);
  }

  @Override
  @Transactional
  public void delete(MedicationAdministrationDosage e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationAdministrationDosageModel removed = em.find(MedicationAdministrationDosageModel.class, e.getId());
      em.remove(removed);
  }
}