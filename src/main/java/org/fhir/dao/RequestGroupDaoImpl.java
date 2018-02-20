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

import org.fhir.entity.RequestGroupModel;
import org.fhir.pojo.RequestGroup;
import org.fhir.pojo.RequestGroupHelper;
import org.fhir.utils.QueryBuilder;

public class RequestGroupDaoImpl implements RequestGroupDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public RequestGroupDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public RequestGroup find(String id) {
    final EntityManager em = entityManagerProvider.get();
    RequestGroupModel model = em.find(RequestGroupModel.class, id);
    if (null == model) return null;
    return new RequestGroup(model);
  }

  @Override
  public List<RequestGroup> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RequestGroupModel a", RequestGroupModel.class).setMaxResults(maxResult);
      List<RequestGroupModel> models = query.getResultList();
      return RequestGroupHelper.fromArray2Array(models);
  }

  @Override
  public List<RequestGroup> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RequestGroupModel a", RequestGroupModel.class);
      List<RequestGroupModel> models = query.getResultList();
      return RequestGroupHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public RequestGroup create(RequestGroup e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new RequestGroupModel(e));
      return e;
  }

  @Transactional
  public RequestGroup update(RequestGroup e) {
      final EntityManager em = entityManagerProvider.get();
      RequestGroupModel model = em.merge(new RequestGroupModel(e));
      return new RequestGroup(model);
  }
  @Override
  @Transactional
  public void delete(RequestGroup e) {
      final EntityManager em = entityManagerProvider.get();
      final RequestGroupModel removed = em.find(RequestGroupModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<RequestGroup> findByDefinition(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Reference b where a.definition_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByBasedOn(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Reference b where a.basedOn_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByReplaces(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Reference b where a.replaces_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByAuthor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Reference b where a.author_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, CodeableConcept b where a.reasonCodeableConcept_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByReasonReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Reference b where a.reasonReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByAction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, RequestGroupAction b where a.action_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RequestGroup> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<RequestGroup> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RequestGroupModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<RequestGroup> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, RequestGroupModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<RequestGroupModel> models = query.getResultList();
    return RequestGroupHelper.fromArray2Array(models);
  }
}