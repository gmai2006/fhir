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

import org.fhir.entity.TestScriptModel;
import org.fhir.pojo.TestScript;
import org.fhir.pojo.TestScriptHelper;
import org.fhir.utils.QueryBuilder;

public class TestScriptDaoImpl implements TestScriptDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public TestScriptDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public TestScript find(String id) {
    final EntityManager em = entityManagerProvider.get();
    TestScriptModel model = em.find(TestScriptModel.class, id);
    if (null == model) return null;
    return new TestScript(model);
  }

  @Override
  public List<TestScript> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from TestScriptModel a", TestScriptModel.class).setMaxResults(maxResult);
      List<TestScriptModel> models = query.getResultList();
      return TestScriptHelper.fromArray2Array(models);
  }

  @Override
  public List<TestScript> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from TestScriptModel a", TestScriptModel.class);
      List<TestScriptModel> models = query.getResultList();
      return TestScriptHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public TestScript create(TestScript e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new TestScriptModel(e));
      return e;
  }

  @Transactional
  public TestScript update(TestScript e) {
      final EntityManager em = entityManagerProvider.get();
      TestScriptModel model = em.merge(new TestScriptModel(e));
      return new TestScript(model);
  }
  @Override
  @Transactional
  public void delete(TestScript e) {
      final EntityManager em = entityManagerProvider.get();
      final TestScriptModel removed = em.find(TestScriptModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<TestScript> findByContact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestScriptModel a, ContactDetail b where a.contact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<TestScript> findByUseContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestScriptModel a, UsageContext b where a.useContext_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<TestScript> findByJurisdiction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestScriptModel a, CodeableConcept b where a.jurisdiction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<TestScript> findByProfile(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestScriptModel a, Reference b where a.profile_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<TestScript> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestScriptModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<TestScript> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestScriptModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<TestScript> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestScriptModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<TestScript> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, TestScriptModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<TestScriptModel> models = query.getResultList();
    return TestScriptHelper.fromArray2Array(models);
  }
}