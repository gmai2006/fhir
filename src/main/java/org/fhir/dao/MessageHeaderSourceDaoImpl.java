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

import org.fhir.entity.MessageHeaderSourceModel;
import org.fhir.pojo.MessageHeaderSource;

public class MessageHeaderSourceDaoImpl implements MessageHeaderSourceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MessageHeaderSourceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MessageHeaderSource find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MessageHeaderSourceModel model = em.find(MessageHeaderSourceModel.class, id);
    if (null == model) return null;
    return new MessageHeaderSource(model);
  }

  @Override
  public List<MessageHeaderSource> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MessageHeaderSourceModel a", MessageHeaderSourceModel.class).setMaxResults(maxResult);
      List<MessageHeaderSourceModel> models = query.getResultList();
      return MessageHeaderSource.fromArray(models);
  }

  @Override
  public List<MessageHeaderSource> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MessageHeaderSourceModel a", MessageHeaderSourceModel.class);
      List<MessageHeaderSourceModel> models = query.getResultList();
      return MessageHeaderSource.fromArray(models);
  }

  @Override
  @Transactional
  public MessageHeaderSource create(MessageHeaderSource e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MessageHeaderSourceModel(e));
      return e;
  }

  @Transactional
  public MessageHeaderSource update(MessageHeaderSource e) {
      final EntityManager em = entityManagerProvider.get();
      MessageHeaderSourceModel model = em.merge(new MessageHeaderSourceModel(e));
      return new MessageHeaderSource(model);
  }

  @Override
  @Transactional
  public void delete(MessageHeaderSource e) {
      final EntityManager em = entityManagerProvider.get();
      final MessageHeaderSourceModel removed = em.find(MessageHeaderSourceModel.class, e.getId());
      em.remove(removed);
  }
}