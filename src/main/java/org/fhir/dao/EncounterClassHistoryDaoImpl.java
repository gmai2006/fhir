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

import org.fhir.entity.EncounterClassHistoryModel;
import org.fhir.pojo.EncounterClassHistory;

public class EncounterClassHistoryDaoImpl implements EncounterClassHistoryDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EncounterClassHistoryDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public EncounterClassHistory find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EncounterClassHistoryModel model = em.find(EncounterClassHistoryModel.class, id);
    if (null == model) return null;
    return new EncounterClassHistory(model);
  }

  @Override
  public List<EncounterClassHistory> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EncounterClassHistoryModel a", EncounterClassHistoryModel.class).setMaxResults(maxResult);
      List<EncounterClassHistoryModel> models = query.getResultList();
      return EncounterClassHistory.fromArray(models);
  }

  @Override
  public List<EncounterClassHistory> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EncounterClassHistoryModel a", EncounterClassHistoryModel.class);
      List<EncounterClassHistoryModel> models = query.getResultList();
      return EncounterClassHistory.fromArray(models);
  }

  @Override
  @Transactional
  public EncounterClassHistory create(EncounterClassHistory e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new EncounterClassHistoryModel(e));
      return e;
  }

  @Transactional
  public EncounterClassHistory update(EncounterClassHistory e) {
      final EntityManager em = entityManagerProvider.get();
      EncounterClassHistoryModel model = em.merge(new EncounterClassHistoryModel(e));
      return new EncounterClassHistory(model);
  }

  @Override
  @Transactional
  public void delete(EncounterClassHistory e) {
      final EntityManager em = entityManagerProvider.get();
      final EncounterClassHistoryModel removed = em.find(EncounterClassHistoryModel.class, e.getId());
      em.remove(removed);
  }
}