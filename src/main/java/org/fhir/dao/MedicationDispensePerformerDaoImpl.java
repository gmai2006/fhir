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

import org.fhir.entity.MedicationDispensePerformerModel;
import org.fhir.pojo.MedicationDispensePerformer;

public class MedicationDispensePerformerDaoImpl implements MedicationDispensePerformerDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationDispensePerformerDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationDispensePerformer find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationDispensePerformerModel model = em.find(MedicationDispensePerformerModel.class, id);
    if (null == model) return null;
    return new MedicationDispensePerformer(model);
  }

  @Override
  public List<MedicationDispensePerformer> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationDispensePerformerModel a", MedicationDispensePerformerModel.class).setMaxResults(maxResult);
      List<MedicationDispensePerformerModel> models = query.getResultList();
      return MedicationDispensePerformer.fromArray(models);
  }

  @Override
  public List<MedicationDispensePerformer> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationDispensePerformerModel a", MedicationDispensePerformerModel.class);
      List<MedicationDispensePerformerModel> models = query.getResultList();
      return MedicationDispensePerformer.fromArray(models);
  }

  @Override
  @Transactional
  public MedicationDispensePerformer create(MedicationDispensePerformer e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationDispensePerformerModel(e));
      return e;
  }

  @Transactional
  public MedicationDispensePerformer update(MedicationDispensePerformer e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationDispensePerformerModel model = em.merge(new MedicationDispensePerformerModel(e));
      return new MedicationDispensePerformer(model);
  }

  @Override
  @Transactional
  public void delete(MedicationDispensePerformer e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationDispensePerformerModel removed = em.find(MedicationDispensePerformerModel.class, e.getId());
      em.remove(removed);
  }
}