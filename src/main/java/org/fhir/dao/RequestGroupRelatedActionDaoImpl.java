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

import org.fhir.entity.RequestGroupRelatedActionModel;
import org.fhir.pojo.RequestGroupRelatedAction;

public class RequestGroupRelatedActionDaoImpl implements RequestGroupRelatedActionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public RequestGroupRelatedActionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public RequestGroupRelatedAction find(String id) {
    final EntityManager em = entityManagerProvider.get();
    RequestGroupRelatedActionModel model = em.find(RequestGroupRelatedActionModel.class, id);
    if (null == model) return null;
    return new RequestGroupRelatedAction(model);
  }

  @Override
  public List<RequestGroupRelatedAction> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RequestGroupRelatedActionModel a", RequestGroupRelatedActionModel.class).setMaxResults(maxResult);
      List<RequestGroupRelatedActionModel> models = query.getResultList();
      return RequestGroupRelatedAction.fromArray(models);
  }

  @Override
  public List<RequestGroupRelatedAction> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RequestGroupRelatedActionModel a", RequestGroupRelatedActionModel.class);
      List<RequestGroupRelatedActionModel> models = query.getResultList();
      return RequestGroupRelatedAction.fromArray(models);
  }

  @Override
  @Transactional
  public RequestGroupRelatedAction create(RequestGroupRelatedAction e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new RequestGroupRelatedActionModel(e));
      return e;
  }

  @Transactional
  public RequestGroupRelatedAction update(RequestGroupRelatedAction e) {
      final EntityManager em = entityManagerProvider.get();
      RequestGroupRelatedActionModel model = em.merge(new RequestGroupRelatedActionModel(e));
      return new RequestGroupRelatedAction(model);
  }

  @Override
  @Transactional
  public void delete(RequestGroupRelatedAction e) {
      final EntityManager em = entityManagerProvider.get();
      final RequestGroupRelatedActionModel removed = em.find(RequestGroupRelatedActionModel.class, e.getId());
      em.remove(removed);
  }
}