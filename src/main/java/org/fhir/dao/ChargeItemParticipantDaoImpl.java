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

import org.fhir.entity.ChargeItemParticipantModel;
import org.fhir.pojo.ChargeItemParticipant;

public class ChargeItemParticipantDaoImpl implements ChargeItemParticipantDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ChargeItemParticipantDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ChargeItemParticipant find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ChargeItemParticipantModel model = em.find(ChargeItemParticipantModel.class, id);
    if (null == model) return null;
    return new ChargeItemParticipant(model);
  }

  @Override
  public List<ChargeItemParticipant> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ChargeItemParticipantModel a", ChargeItemParticipantModel.class).setMaxResults(maxResult);
      List<ChargeItemParticipantModel> models = query.getResultList();
      return ChargeItemParticipant.fromArray(models);
  }

  @Override
  public List<ChargeItemParticipant> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ChargeItemParticipantModel a", ChargeItemParticipantModel.class);
      List<ChargeItemParticipantModel> models = query.getResultList();
      return ChargeItemParticipant.fromArray(models);
  }

  @Override
  @Transactional
  public ChargeItemParticipant create(ChargeItemParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ChargeItemParticipantModel(e));
      return e;
  }

  @Transactional
  public ChargeItemParticipant update(ChargeItemParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      ChargeItemParticipantModel model = em.merge(new ChargeItemParticipantModel(e));
      return new ChargeItemParticipant(model);
  }

  @Override
  @Transactional
  public void delete(ChargeItemParticipant e) {
      final EntityManager em = entityManagerProvider.get();
      final ChargeItemParticipantModel removed = em.find(ChargeItemParticipantModel.class, e.getId());
      em.remove(removed);
  }
}