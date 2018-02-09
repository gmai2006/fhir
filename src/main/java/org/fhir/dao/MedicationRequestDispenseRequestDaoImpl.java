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

import org.fhir.entity.MedicationRequestDispenseRequestModel;
import org.fhir.pojo.MedicationRequestDispenseRequest;

public class MedicationRequestDispenseRequestDaoImpl implements MedicationRequestDispenseRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationRequestDispenseRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationRequestDispenseRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationRequestDispenseRequestModel model = em.find(MedicationRequestDispenseRequestModel.class, id);
    if (null == model) return null;
    return new MedicationRequestDispenseRequest(model);
  }

  @Override
  public List<MedicationRequestDispenseRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationRequestDispenseRequestModel a", MedicationRequestDispenseRequestModel.class).setMaxResults(maxResult);
      List<MedicationRequestDispenseRequestModel> models = query.getResultList();
      return MedicationRequestDispenseRequest.fromArray(models);
  }

  @Override
  public List<MedicationRequestDispenseRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationRequestDispenseRequestModel a", MedicationRequestDispenseRequestModel.class);
      List<MedicationRequestDispenseRequestModel> models = query.getResultList();
      return MedicationRequestDispenseRequest.fromArray(models);
  }

  @Override
  @Transactional
  public MedicationRequestDispenseRequest create(MedicationRequestDispenseRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationRequestDispenseRequestModel(e));
      return e;
  }

  @Transactional
  public MedicationRequestDispenseRequest update(MedicationRequestDispenseRequest e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationRequestDispenseRequestModel model = em.merge(new MedicationRequestDispenseRequestModel(e));
      return new MedicationRequestDispenseRequest(model);
  }

  @Override
  @Transactional
  public void delete(MedicationRequestDispenseRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationRequestDispenseRequestModel removed = em.find(MedicationRequestDispenseRequestModel.class, e.getId());
      em.remove(removed);
  }
}