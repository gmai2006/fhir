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

import org.fhir.entity.EncounterParticipantModel;
import org.fhir.pojo.EncounterParticipant;

public class EncounterParticipantDaoImpl implements EncounterParticipantDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EncounterParticipantDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public EncounterParticipant find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EncounterParticipantModel model = em.find(EncounterParticipantModel.class, id);
    if (null == model) return null;
    return new EncounterParticipant(model);
  }

  @Override
  public List<EncounterParticipant> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EncounterParticipantModel a", EncounterParticipantModel.class).setMaxResults(maxResult);
      List<EncounterParticipantModel> models = query.getResultList();
      return EncounterParticipant.fromArray(models);
  }

  @Override
  public List<EncounterParticipant> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EncounterParticipantModel a", EncounterParticipantModel.class);
      List<EncounterParticipantModel> models = query.getResultList();
      return EncounterParticipant.fromArray(models);
  }

  @Override
  @Transactional
  public EncounterParticipant create(EncounterParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new EncounterParticipantModel(e));
      return e;
  }

  @Transactional
  public EncounterParticipant update(EncounterParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      EncounterParticipantModel model = em.merge(new EncounterParticipantModel(e));
      return new EncounterParticipant(model);
  }

  @Override
  @Transactional
  public void delete(EncounterParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      final EncounterParticipantModel removed = em.find(EncounterParticipantModel.class, e.getId());
      em.remove(removed);
  }
}