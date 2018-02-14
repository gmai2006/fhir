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

import org.fhir.entity.ConditionModel;
import org.fhir.pojo.Condition;
import org.fhir.pojo.ConditionHelper;

public class ConditionDaoImpl implements ConditionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConditionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Condition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConditionModel model = em.find(ConditionModel.class, id);
    if (null == model) return null;
    return new Condition(model);
  }

  @Override
  public List<Condition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConditionModel a", ConditionModel.class).setMaxResults(maxResult);
      List<ConditionModel> models = query.getResultList();
      return ConditionHelper.fromArray2Array(models);
  }

  @Override
  public List<Condition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConditionModel a", ConditionModel.class);
      List<ConditionModel> models = query.getResultList();
      return ConditionHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Condition create(Condition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConditionModel(e));
      return e;
  }

  @Transactional
  public Condition update(Condition e) {
      final EntityManager em = entityManagerProvider.get();
      ConditionModel model = em.merge(new ConditionModel(e));
      return new Condition(model);
  }
  @Override
  @Transactional
  public void delete(Condition e) {
      final EntityManager em = entityManagerProvider.get();
      final ConditionModel removed = em.find(ConditionModel.class, e.getId());
      em.remove(removed);
  }
}