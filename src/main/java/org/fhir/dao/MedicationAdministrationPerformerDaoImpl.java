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

import org.fhir.entity.MedicationAdministrationPerformerModel;
import org.fhir.pojo.MedicationAdministrationPerformer;

public class MedicationAdministrationPerformerDaoImpl implements MedicationAdministrationPerformerDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationAdministrationPerformerDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationAdministrationPerformer find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationAdministrationPerformerModel model = em.find(MedicationAdministrationPerformerModel.class, id);
    if (null == model) return null;
    return new MedicationAdministrationPerformer(model);
  }

  @Override
  public List<MedicationAdministrationPerformer> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationAdministrationPerformerModel a", MedicationAdministrationPerformerModel.class).setMaxResults(maxResult);
      List<MedicationAdministrationPerformerModel> models = query.getResultList();
      return MedicationAdministrationPerformer.fromArray(models);
  }

  @Override
  public List<MedicationAdministrationPerformer> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationAdministrationPerformerModel a", MedicationAdministrationPerformerModel.class);
      List<MedicationAdministrationPerformerModel> models = query.getResultList();
      return MedicationAdministrationPerformer.fromArray(models);
  }

  @Override
  @Transactional
  public MedicationAdministrationPerformer create(MedicationAdministrationPerformer e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationAdministrationPerformerModel(e));
      return e;
  }

  @Transactional
  public MedicationAdministrationPerformer update(MedicationAdministrationPerformer e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationAdministrationPerformerModel model = em.merge(new MedicationAdministrationPerformerModel(e));
      return new MedicationAdministrationPerformer(model);
  }

  @Override
  @Transactional
  public void delete(MedicationAdministrationPerformer e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationAdministrationPerformerModel removed = em.find(MedicationAdministrationPerformerModel.class, e.getId());
      em.remove(removed);
  }
}