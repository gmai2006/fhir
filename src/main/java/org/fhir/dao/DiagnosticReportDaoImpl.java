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

import org.fhir.entity.DiagnosticReportModel;
import org.fhir.pojo.DiagnosticReport;
import org.fhir.pojo.DiagnosticReportHelper;
import org.fhir.utils.QueryBuilder;

public class DiagnosticReportDaoImpl implements DiagnosticReportDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DiagnosticReportDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DiagnosticReport find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DiagnosticReportModel model = em.find(DiagnosticReportModel.class, id);
    if (null == model) return null;
    return new DiagnosticReport(model);
  }

  @Override
  public List<DiagnosticReport> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DiagnosticReportModel a", DiagnosticReportModel.class).setMaxResults(maxResult);
      List<DiagnosticReportModel> models = query.getResultList();
      return DiagnosticReportHelper.fromArray2Array(models);
  }

  @Override
  public List<DiagnosticReport> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DiagnosticReportModel a", DiagnosticReportModel.class);
      List<DiagnosticReportModel> models = query.getResultList();
      return DiagnosticReportHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public DiagnosticReport create(DiagnosticReport e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DiagnosticReportModel(e));
      return e;
  }

  @Transactional
  public DiagnosticReport update(DiagnosticReport e) {
      final EntityManager em = entityManagerProvider.get();
      DiagnosticReportModel model = em.merge(new DiagnosticReportModel(e));
      return new DiagnosticReport(model);
  }
  @Override
  @Transactional
  public void delete(DiagnosticReport e) {
      final EntityManager em = entityManagerProvider.get();
      final DiagnosticReportModel removed = em.find(DiagnosticReportModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<DiagnosticReport> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DiagnosticReportModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DiagnosticReport> findByImage(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DiagnosticReportModel a, DiagnosticReportImage b where a.image_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DiagnosticReport> findByPerformer(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DiagnosticReportModel a, DiagnosticReportPerformer b where a.performer_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DiagnosticReport> findByResult(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DiagnosticReportModel a, Reference b where a.result_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DiagnosticReport> findBySpecimen(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DiagnosticReportModel a, Reference b where a.specimen_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DiagnosticReport> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DiagnosticReportModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<DiagnosticReport> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DiagnosticReportModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<DiagnosticReport> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, DiagnosticReportModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<DiagnosticReportModel> models = query.getResultList();
    return DiagnosticReportHelper.fromArray2Array(models);
  }
}