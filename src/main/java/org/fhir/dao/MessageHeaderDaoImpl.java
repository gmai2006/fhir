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

import org.fhir.entity.MessageHeaderModel;
import org.fhir.pojo.MessageHeader;
import org.fhir.pojo.MessageHeaderHelper;
import org.fhir.utils.QueryBuilder;

public class MessageHeaderDaoImpl implements MessageHeaderDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MessageHeaderDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MessageHeader find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MessageHeaderModel model = em.find(MessageHeaderModel.class, id);
    if (null == model) return null;
    return new MessageHeader(model);
  }

  @Override
  public List<MessageHeader> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MessageHeaderModel a", MessageHeaderModel.class).setMaxResults(maxResult);
      List<MessageHeaderModel> models = query.getResultList();
      return MessageHeaderHelper.fromArray2Array(models);
  }

  @Override
  public List<MessageHeader> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MessageHeaderModel a", MessageHeaderModel.class);
      List<MessageHeaderModel> models = query.getResultList();
      return MessageHeaderHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public MessageHeader create(MessageHeader e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MessageHeaderModel(e));
      return e;
  }

  @Transactional
  public MessageHeader update(MessageHeader e) {
      final EntityManager em = entityManagerProvider.get();
      MessageHeaderModel model = em.merge(new MessageHeaderModel(e));
      return new MessageHeader(model);
  }
  @Override
  @Transactional
  public void delete(MessageHeader e) {
      final EntityManager em = entityManagerProvider.get();
      final MessageHeaderModel removed = em.find(MessageHeaderModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<MessageHeader> findByEvent(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Coding b where a.event_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByDestination(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, MessageHeaderDestination b where a.destination_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByReceiver(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Reference b where a.receiver_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findBySender(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Reference b where a.sender_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByEnterer(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Reference b where a.enterer_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByAuthor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Reference b where a.author_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findBySource(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, MessageHeaderSource b where a.source_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByResponsible(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Reference b where a.responsible_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByReason(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, CodeableConcept b where a.reason_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByResponse(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, MessageHeaderResponse b where a.response_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByFocus(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Reference b where a.focus_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MessageHeader> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<MessageHeader> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MessageHeaderModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<MessageHeader> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, MessageHeaderModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<MessageHeaderModel> models = query.getResultList();
    return MessageHeaderHelper.fromArray2Array(models);
  }
}