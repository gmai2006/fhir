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

import org.fhir.entity.CommunicationPayloadModel;
import org.fhir.pojo.CommunicationPayload;

public class CommunicationPayloadDaoImpl implements CommunicationPayloadDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CommunicationPayloadDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CommunicationPayload find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CommunicationPayloadModel model = em.find(CommunicationPayloadModel.class, id);
    if (null == model) return null;
    return new CommunicationPayload(model);
  }

  @Override
  public List<CommunicationPayload> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CommunicationPayloadModel a", CommunicationPayloadModel.class).setMaxResults(maxResult);
      List<CommunicationPayloadModel> models = query.getResultList();
      return CommunicationPayload.fromArray(models);
  }

  @Override
  public List<CommunicationPayload> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CommunicationPayloadModel a", CommunicationPayloadModel.class);
      List<CommunicationPayloadModel> models = query.getResultList();
      return CommunicationPayload.fromArray(models);
  }

  @Override
  @Transactional
  public CommunicationPayload create(CommunicationPayload e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CommunicationPayloadModel(e));
      return e;
  }

  @Transactional
  public CommunicationPayload update(CommunicationPayload e) {
      final EntityManager em = entityManagerProvider.get();
      CommunicationPayloadModel model = em.merge(new CommunicationPayloadModel(e));
      return new CommunicationPayload(model);
  }

  @Override
  @Transactional
  public void delete(CommunicationPayload e) {
      final EntityManager em = entityManagerProvider.get();
      final CommunicationPayloadModel removed = em.find(CommunicationPayloadModel.class, e.getId());
      em.remove(removed);
  }
}