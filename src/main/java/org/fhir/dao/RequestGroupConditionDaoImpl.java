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

import org.fhir.entity.RequestGroupConditionModel;
import org.fhir.pojo.RequestGroupCondition;

public class RequestGroupConditionDaoImpl implements RequestGroupConditionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public RequestGroupConditionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public RequestGroupCondition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    RequestGroupConditionModel model = em.find(RequestGroupConditionModel.class, id);
    if (null == model) return null;
    return new RequestGroupCondition(model);
  }

  @Override
  public List<RequestGroupCondition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RequestGroupConditionModel a", RequestGroupConditionModel.class).setMaxResults(maxResult);
      List<RequestGroupConditionModel> models = query.getResultList();
      return RequestGroupCondition.fromArray(models);
  }

  @Override
  public List<RequestGroupCondition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RequestGroupConditionModel a", RequestGroupConditionModel.class);
      List<RequestGroupConditionModel> models = query.getResultList();
      return RequestGroupCondition.fromArray(models);
  }

  @Override
  @Transactional
  public RequestGroupCondition create(RequestGroupCondition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new RequestGroupConditionModel(e));
      return e;
  }

  @Transactional
  public RequestGroupCondition update(RequestGroupCondition e) {
      final EntityManager em = entityManagerProvider.get();
      RequestGroupConditionModel model = em.merge(new RequestGroupConditionModel(e));
      return new RequestGroupCondition(model);
  }

  @Override
  @Transactional
  public void delete(RequestGroupCondition e) {
      final EntityManager em = entityManagerProvider.get();
      final RequestGroupConditionModel removed = em.find(RequestGroupConditionModel.class, e.getId());
      em.remove(removed);
  }
}