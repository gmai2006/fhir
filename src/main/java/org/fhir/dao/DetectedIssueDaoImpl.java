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

import org.fhir.entity.DetectedIssueModel;
import org.fhir.pojo.DetectedIssue;
import org.fhir.pojo.DetectedIssueHelper;
import org.fhir.utils.QueryBuilder;

public class DetectedIssueDaoImpl implements DetectedIssueDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DetectedIssueDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DetectedIssue find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DetectedIssueModel model = em.find(DetectedIssueModel.class, id);
    if (null == model) return null;
    return new DetectedIssue(model);
  }

  @Override
  public List<DetectedIssue> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DetectedIssueModel a", DetectedIssueModel.class).setMaxResults(maxResult);
      List<DetectedIssueModel> models = query.getResultList();
      return DetectedIssueHelper.fromArray2Array(models);
  }

  @Override
  public List<DetectedIssue> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DetectedIssueModel a", DetectedIssueModel.class);
      List<DetectedIssueModel> models = query.getResultList();
      return DetectedIssueHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public DetectedIssue create(DetectedIssue e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DetectedIssueModel(e));
      return e;
  }

  @Transactional
  public DetectedIssue update(DetectedIssue e) {
      final EntityManager em = entityManagerProvider.get();
      DetectedIssueModel model = em.merge(new DetectedIssueModel(e));
      return new DetectedIssue(model);
  }
  @Override
  @Transactional
  public void delete(DetectedIssue e) {
      final EntityManager em = entityManagerProvider.get();
      final DetectedIssueModel removed = em.find(DetectedIssueModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<DetectedIssue> findByAuthor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DetectedIssueModel a, Reference b where a.author_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DetectedIssue> findByImplicated(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DetectedIssueModel a, Reference b where a.implicated_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<DetectedIssue> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DetectedIssueModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<DetectedIssue> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, DetectedIssueModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<DetectedIssueModel> models = query.getResultList();
    return DetectedIssueHelper.fromArray2Array(models);
  }
}