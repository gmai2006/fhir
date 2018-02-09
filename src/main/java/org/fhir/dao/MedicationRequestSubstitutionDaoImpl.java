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

import org.fhir.entity.MedicationRequestSubstitutionModel;
import org.fhir.pojo.MedicationRequestSubstitution;

public class MedicationRequestSubstitutionDaoImpl implements MedicationRequestSubstitutionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationRequestSubstitutionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationRequestSubstitution find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationRequestSubstitutionModel model = em.find(MedicationRequestSubstitutionModel.class, id);
    if (null == model) return null;
    return new MedicationRequestSubstitution(model);
  }

  @Override
  public List<MedicationRequestSubstitution> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationRequestSubstitutionModel a", MedicationRequestSubstitutionModel.class).setMaxResults(maxResult);
      List<MedicationRequestSubstitutionModel> models = query.getResultList();
      return MedicationRequestSubstitution.fromArray(models);
  }

  @Override
  public List<MedicationRequestSubstitution> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationRequestSubstitutionModel a", MedicationRequestSubstitutionModel.class);
      List<MedicationRequestSubstitutionModel> models = query.getResultList();
      return MedicationRequestSubstitution.fromArray(models);
  }

  @Override
  @Transactional
  public MedicationRequestSubstitution create(MedicationRequestSubstitution e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationRequestSubstitutionModel(e));
      return e;
  }

  @Transactional
  public MedicationRequestSubstitution update(MedicationRequestSubstitution e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationRequestSubstitutionModel model = em.merge(new MedicationRequestSubstitutionModel(e));
      return new MedicationRequestSubstitution(model);
  }

  @Override
  @Transactional
  public void delete(MedicationRequestSubstitution e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationRequestSubstitutionModel removed = em.find(MedicationRequestSubstitutionModel.class, e.getId());
      em.remove(removed);
  }
}