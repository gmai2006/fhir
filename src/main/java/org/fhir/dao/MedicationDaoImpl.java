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

import org.fhir.entity.MedicationModel;
import org.fhir.pojo.Medication;

public class MedicationDaoImpl implements MedicationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Medication find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationModel model = em.find(MedicationModel.class, id);
    if (null == model) return null;
    return new Medication(model);
  }

  @Override
  public List<Medication> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationModel a", MedicationModel.class).setMaxResults(maxResult);
      List<MedicationModel> models = query.getResultList();
      return Medication.fromArray(models);
  }

  @Override
  public List<Medication> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationModel a", MedicationModel.class);
      List<MedicationModel> models = query.getResultList();
      return Medication.fromArray(models);
  }

  @Override
  @Transactional
  public Medication create(Medication e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationModel(e));
      return e;
  }

  @Transactional
  public Medication update(Medication e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationModel model = em.merge(new MedicationModel(e));
      return new Medication(model);
  }

  @Override
  @Transactional
  public void delete(Medication e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationModel removed = em.find(MedicationModel.class, e.getId());
      em.remove(removed);
  }
}