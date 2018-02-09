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

import org.fhir.entity.OperationOutcomeModel;
import org.fhir.pojo.OperationOutcome;

public class OperationOutcomeDaoImpl implements OperationOutcomeDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public OperationOutcomeDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public OperationOutcome find(String id) {
    final EntityManager em = entityManagerProvider.get();
    OperationOutcomeModel model = em.find(OperationOutcomeModel.class, id);
    if (null == model) return null;
    return new OperationOutcome(model);
  }

  @Override
  public List<OperationOutcome> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OperationOutcomeModel a", OperationOutcomeModel.class).setMaxResults(maxResult);
      List<OperationOutcomeModel> models = query.getResultList();
      return OperationOutcome.fromArray(models);
  }

  @Override
  public List<OperationOutcome> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OperationOutcomeModel a", OperationOutcomeModel.class);
      List<OperationOutcomeModel> models = query.getResultList();
      return OperationOutcome.fromArray(models);
  }

  @Override
  @Transactional
  public OperationOutcome create(OperationOutcome e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new OperationOutcomeModel(e));
      return e;
  }

  @Transactional
  public OperationOutcome update(OperationOutcome e) {
      final EntityManager em = entityManagerProvider.get();
      OperationOutcomeModel model = em.merge(new OperationOutcomeModel(e));
      return new OperationOutcome(model);
  }

  @Override
  @Transactional
  public void delete(OperationOutcome e) {
      final EntityManager em = entityManagerProvider.get();
      final OperationOutcomeModel removed = em.find(OperationOutcomeModel.class, e.getId());
      em.remove(removed);
  }
}