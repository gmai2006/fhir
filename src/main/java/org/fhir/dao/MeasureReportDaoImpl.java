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
import java.util.logging.Logger;
import org.fhir.entity.*;
import javax.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.inject.Provider;

import org.fhir.entity.MeasureReportModel;
import org.fhir.pojo.MeasureReport;
import org.fhir.pojo.MeasureReportHelper;
import org.fhir.utils.QueryBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public class MeasureReportDaoImpl implements MeasureReportDao {
	private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MeasureReportDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MeasureReport find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MeasureReportModel model = em.find(MeasureReportModel.class, id);
    if (null == model) return null;
    return new MeasureReport(model);
  }

  @Override
  public List<MeasureReport> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasureReportModel a", MeasureReportModel.class).setMaxResults(maxResult);
      List<MeasureReportModel> models = query.getResultList();
      return MeasureReportHelper.fromArray2Array(models);
  }

  @Override
  public List<MeasureReport> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasureReportModel a", MeasureReportModel.class);
      List<MeasureReportModel> models = query.getResultList();
      return MeasureReportHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public MeasureReport create(MeasureReport e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MeasureReportModel(e));
      return e;
  }

  @Transactional
  public MeasureReport update(MeasureReport e) {
      final EntityManager em = entityManagerProvider.get();
      MeasureReportModel model = em.merge(new MeasureReportModel(e));
      return new MeasureReport(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final MeasureReportModel removed = em.find(MeasureReportModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<MeasureReport> findByMeasure(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MeasureReportModel a, Reference b where a.measure_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MeasureReport> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MeasureReportModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MeasureReport> findByReportingOrganization(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MeasureReportModel a, Reference b where a.reportingOrganization_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MeasureReport> findByGroup(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MeasureReportModel a, MeasureReportGroup b where a.group_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MeasureReport> findByEvaluatedResources(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MeasureReportModel a, Reference b where a.evaluatedResources_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MeasureReport> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MeasureReportModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MeasureReport> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MeasureReportModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<MeasureReport> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MeasureReportModel a " + queryBuilder.getWhereClause();
  	logger.info(queryStr);
    return findByQuery(queryBuilder, queryStr);
  }

  private List<MeasureReport> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, MeasureReportModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<MeasureReportModel> models = query.getResultList();
    return MeasureReportHelper.fromArray2Array(models);
  }
}