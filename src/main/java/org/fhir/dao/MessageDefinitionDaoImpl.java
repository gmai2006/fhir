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

import org.fhir.entity.MessageDefinitionModel;
import org.fhir.pojo.MessageDefinition;
import org.fhir.pojo.MessageDefinitionHelper;

public class MessageDefinitionDaoImpl implements MessageDefinitionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MessageDefinitionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MessageDefinition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MessageDefinitionModel model = em.find(MessageDefinitionModel.class, id);
    if (null == model) return null;
    return new MessageDefinition(model);
  }

  @Override
  public List<MessageDefinition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MessageDefinitionModel a", MessageDefinitionModel.class).setMaxResults(maxResult);
      List<MessageDefinitionModel> models = query.getResultList();
      return MessageDefinitionHelper.fromArray2Array(models);
  }

  @Override
  public List<MessageDefinition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MessageDefinitionModel a", MessageDefinitionModel.class);
      List<MessageDefinitionModel> models = query.getResultList();
      return MessageDefinitionHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public MessageDefinition create(MessageDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MessageDefinitionModel(e));
      return e;
  }

  @Transactional
  public MessageDefinition update(MessageDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      MessageDefinitionModel model = em.merge(new MessageDefinitionModel(e));
      return new MessageDefinition(model);
  }
  @Override
  @Transactional
  public void delete(MessageDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      final MessageDefinitionModel removed = em.find(MessageDefinitionModel.class, e.getId());
      em.remove(removed);
  }
}