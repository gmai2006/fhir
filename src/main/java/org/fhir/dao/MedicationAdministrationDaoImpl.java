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

import org.fhir.entity.MedicationAdministrationModel;
import org.fhir.pojo.MedicationAdministration;
import org.fhir.pojo.MedicationAdministrationHelper;

public class MedicationAdministrationDaoImpl implements MedicationAdministrationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationAdministrationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationAdministration find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationAdministrationModel model = em.find(MedicationAdministrationModel.class, id);
    if (null == model) return null;
    return new MedicationAdministration(model);
  }

  @Override
  public List<MedicationAdministration> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationAdministrationModel a", MedicationAdministrationModel.class).setMaxResults(maxResult);
      List<MedicationAdministrationModel> models = query.getResultList();
      return MedicationAdministrationHelper.fromArray2Array(models);
  }

  @Override
  public List<MedicationAdministration> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationAdministrationModel a", MedicationAdministrationModel.class);
      List<MedicationAdministrationModel> models = query.getResultList();
      return MedicationAdministrationHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public MedicationAdministration create(MedicationAdministration e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationAdministrationModel(e));
      return e;
  }

  @Transactional
  public MedicationAdministration update(MedicationAdministration e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationAdministrationModel model = em.merge(new MedicationAdministrationModel(e));
      return new MedicationAdministration(model);
  }
  @Override
  @Transactional
  public void delete(MedicationAdministration e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationAdministrationModel removed = em.find(MedicationAdministrationModel.class, e.getId());
      em.remove(removed);
  }
}