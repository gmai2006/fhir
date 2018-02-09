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

import org.fhir.entity.MessageDefinitionAllowedResponseModel;
import org.fhir.pojo.MessageDefinitionAllowedResponse;

public class MessageDefinitionAllowedResponseDaoImpl implements MessageDefinitionAllowedResponseDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MessageDefinitionAllowedResponseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MessageDefinitionAllowedResponse find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MessageDefinitionAllowedResponseModel model = em.find(MessageDefinitionAllowedResponseModel.class, id);
    if (null == model) return null;
    return new MessageDefinitionAllowedResponse(model);
  }

  @Override
  public List<MessageDefinitionAllowedResponse> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MessageDefinitionAllowedResponseModel a", MessageDefinitionAllowedResponseModel.class).setMaxResults(maxResult);
      List<MessageDefinitionAllowedResponseModel> models = query.getResultList();
      return MessageDefinitionAllowedResponse.fromArray(models);
  }

  @Override
  public List<MessageDefinitionAllowedResponse> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MessageDefinitionAllowedResponseModel a", MessageDefinitionAllowedResponseModel.class);
      List<MessageDefinitionAllowedResponseModel> models = query.getResultList();
      return MessageDefinitionAllowedResponse.fromArray(models);
  }

  @Override
  @Transactional
  public MessageDefinitionAllowedResponse create(MessageDefinitionAllowedResponse e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MessageDefinitionAllowedResponseModel(e));
      return e;
  }

  @Transactional
  public MessageDefinitionAllowedResponse update(MessageDefinitionAllowedResponse e) {
      final EntityManager em = entityManagerProvider.get();
      MessageDefinitionAllowedResponseModel model = em.merge(new MessageDefinitionAllowedResponseModel(e));
      return new MessageDefinitionAllowedResponse(model);
  }

  @Override
  @Transactional
  public void delete(MessageDefinitionAllowedResponse e) {
      final EntityManager em = entityManagerProvider.get();
      final MessageDefinitionAllowedResponseModel removed = em.find(MessageDefinitionAllowedResponseModel.class, e.getId());
      em.remove(removed);
  }
}