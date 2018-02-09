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

import org.fhir.entity.AllergyIntoleranceReactionModel;
import org.fhir.pojo.AllergyIntoleranceReaction;

public class AllergyIntoleranceReactionDaoImpl implements AllergyIntoleranceReactionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AllergyIntoleranceReactionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public AllergyIntoleranceReaction find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AllergyIntoleranceReactionModel model = em.find(AllergyIntoleranceReactionModel.class, id);
    if (null == model) return null;
    return new AllergyIntoleranceReaction(model);
  }

  @Override
  public List<AllergyIntoleranceReaction> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AllergyIntoleranceReactionModel a", AllergyIntoleranceReactionModel.class).setMaxResults(maxResult);
      List<AllergyIntoleranceReactionModel> models = query.getResultList();
      return AllergyIntoleranceReaction.fromArray(models);
  }

  @Override
  public List<AllergyIntoleranceReaction> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AllergyIntoleranceReactionModel a", AllergyIntoleranceReactionModel.class);
      List<AllergyIntoleranceReactionModel> models = query.getResultList();
      return AllergyIntoleranceReaction.fromArray(models);
  }

  @Override
  @Transactional
  public AllergyIntoleranceReaction create(AllergyIntoleranceReaction e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AllergyIntoleranceReactionModel(e));
      return e;
  }

  @Transactional
  public AllergyIntoleranceReaction update(AllergyIntoleranceReaction e) {
      final EntityManager em = entityManagerProvider.get();
      AllergyIntoleranceReactionModel model = em.merge(new AllergyIntoleranceReactionModel(e));
      return new AllergyIntoleranceReaction(model);
  }

  @Override
  @Transactional
  public void delete(AllergyIntoleranceReaction e) {
      final EntityManager em = entityManagerProvider.get();
      final AllergyIntoleranceReactionModel removed = em.find(AllergyIntoleranceReactionModel.class, e.getId());
      em.remove(removed);
  }
}