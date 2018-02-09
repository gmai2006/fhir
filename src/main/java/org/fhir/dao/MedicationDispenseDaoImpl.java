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

import org.fhir.entity.MedicationDispenseModel;
import org.fhir.pojo.MedicationDispense;

public class MedicationDispenseDaoImpl implements MedicationDispenseDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationDispenseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationDispense find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationDispenseModel model = em.find(MedicationDispenseModel.class, id);
    if (null == model) return null;
    return new MedicationDispense(model);
  }

  @Override
  public List<MedicationDispense> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationDispenseModel a", MedicationDispenseModel.class).setMaxResults(maxResult);
      List<MedicationDispenseModel> models = query.getResultList();
      return MedicationDispense.fromArray(models);
  }

  @Override
  public List<MedicationDispense> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationDispenseModel a", MedicationDispenseModel.class);
      List<MedicationDispenseModel> models = query.getResultList();
      return MedicationDispense.fromArray(models);
  }

  @Override
  @Transactional
  public MedicationDispense create(MedicationDispense e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationDispenseModel(e));
      return e;
  }

  @Transactional
  public MedicationDispense update(MedicationDispense e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationDispenseModel model = em.merge(new MedicationDispenseModel(e));
      return new MedicationDispense(model);
  }

  @Override
  @Transactional
  public void delete(MedicationDispense e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationDispenseModel removed = em.find(MedicationDispenseModel.class, e.getId());
      em.remove(removed);
  }
}