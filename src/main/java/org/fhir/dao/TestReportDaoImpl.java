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

import org.fhir.entity.TestReportModel;
import org.fhir.pojo.TestReport;
import org.fhir.pojo.TestReportHelper;
import org.fhir.utils.QueryBuilder;

public class TestReportDaoImpl implements TestReportDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public TestReportDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public TestReport find(String id) {
    final EntityManager em = entityManagerProvider.get();
    TestReportModel model = em.find(TestReportModel.class, id);
    if (null == model) return null;
    return new TestReport(model);
  }

  @Override
  public List<TestReport> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from TestReportModel a", TestReportModel.class).setMaxResults(maxResult);
      List<TestReportModel> models = query.getResultList();
      return TestReportHelper.fromArray2Array(models);
  }

  @Override
  public List<TestReport> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from TestReportModel a", TestReportModel.class);
      List<TestReportModel> models = query.getResultList();
      return TestReportHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public TestReport create(TestReport e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new TestReportModel(e));
      return e;
  }

  @Transactional
  public TestReport update(TestReport e) {
      final EntityManager em = entityManagerProvider.get();
      TestReportModel model = em.merge(new TestReportModel(e));
      return new TestReport(model);
  }
  @Override
  @Transactional
  public void delete(TestReport e) {
      final EntityManager em = entityManagerProvider.get();
      final TestReportModel removed = em.find(TestReportModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<TestReport> findByParticipant(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestReportModel a, TestReportParticipant b where a.participant_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<TestReport> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from TestReportModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<TestReport> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, TestReportModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<TestReportModel> models = query.getResultList();
    return TestReportHelper.fromArray2Array(models);
  }
}