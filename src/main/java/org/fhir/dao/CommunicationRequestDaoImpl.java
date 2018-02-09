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

import org.fhir.entity.CommunicationRequestModel;
import org.fhir.pojo.CommunicationRequest;

public class CommunicationRequestDaoImpl implements CommunicationRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CommunicationRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CommunicationRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CommunicationRequestModel model = em.find(CommunicationRequestModel.class, id);
    if (null == model) return null;
    return new CommunicationRequest(model);
  }

  @Override
  public List<CommunicationRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CommunicationRequestModel a", CommunicationRequestModel.class).setMaxResults(maxResult);
      List<CommunicationRequestModel> models = query.getResultList();
      return CommunicationRequest.fromArray(models);
  }

  @Override
  public List<CommunicationRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CommunicationRequestModel a", CommunicationRequestModel.class);
      List<CommunicationRequestModel> models = query.getResultList();
      return CommunicationRequest.fromArray(models);
  }

  @Override
  @Transactional
  public CommunicationRequest create(CommunicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CommunicationRequestModel(e));
      return e;
  }

  @Transactional
  public CommunicationRequest update(CommunicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      CommunicationRequestModel model = em.merge(new CommunicationRequestModel(e));
      return new CommunicationRequest(model);
  }

  @Override
  @Transactional
  public void delete(CommunicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final CommunicationRequestModel removed = em.find(CommunicationRequestModel.class, e.getId());
      em.remove(removed);
  }
}