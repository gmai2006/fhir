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

import org.fhir.entity.CareTeamParticipantModel;
import org.fhir.pojo.CareTeamParticipant;

public class CareTeamParticipantDaoImpl implements CareTeamParticipantDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CareTeamParticipantDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CareTeamParticipant find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CareTeamParticipantModel model = em.find(CareTeamParticipantModel.class, id);
    if (null == model) return null;
    return new CareTeamParticipant(model);
  }

  @Override
  public List<CareTeamParticipant> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CareTeamParticipantModel a", CareTeamParticipantModel.class).setMaxResults(maxResult);
      List<CareTeamParticipantModel> models = query.getResultList();
      return CareTeamParticipant.fromArray(models);
  }

  @Override
  public List<CareTeamParticipant> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CareTeamParticipantModel a", CareTeamParticipantModel.class);
      List<CareTeamParticipantModel> models = query.getResultList();
      return CareTeamParticipant.fromArray(models);
  }

  @Override
  @Transactional
  public CareTeamParticipant create(CareTeamParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CareTeamParticipantModel(e));
      return e;
  }

  @Transactional
  public CareTeamParticipant update(CareTeamParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      CareTeamParticipantModel model = em.merge(new CareTeamParticipantModel(e));
      return new CareTeamParticipant(model);
  }

  @Override
  @Transactional
  public void delete(CareTeamParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      final CareTeamParticipantModel removed = em.find(CareTeamParticipantModel.class, e.getId());
      em.remove(removed);
  }
}