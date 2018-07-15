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

package org.fhir.service;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import static java.util.Objects.requireNonNull;

import com.google.inject.Inject;
import com.google.inject.persist.Transactional;

import org.fhir.dao.*;
import org.fhir.entity.*;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.DiagnosticReport;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class DiagnosticReportServiceImpl implements DiagnosticReportService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DiagnosticReportDao dao;

  @Inject
  public DiagnosticReportServiceImpl(final DiagnosticReportDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DiagnosticReport find(String id) {
    final DiagnosticReport result = dao.find(id);
    logger.info("find(DiagnosticReport) - exited - return value={} result ");
    return result;
  }

  public List<DiagnosticReport> select(int maxResult) {
      final List<DiagnosticReport> result = dao.select(maxResult);
      logger.info("select(DiagnosticReport) - exited - return value={} result ");

      return result;
  }

  public List<DiagnosticReport> selectAll() {
      final List<DiagnosticReport> results = dao.selectAll();
      logger.info("selectAll(DiagnosticReport) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DiagnosticReport create(DiagnosticReport bean) {
  	requireNonNull(bean);
    logger.info("create(DiagnosticReport={}) - entered bean ");

    final DiagnosticReport result = dao.create(bean);

    logger.info("create(DiagnosticReport) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DiagnosticReport update(DiagnosticReport bean) {
  	requireNonNull(bean);
    logger.info("update(DiagnosticReport={}) - entered bean ");

    final DiagnosticReport result = dao.update(bean);

    logger.info("update(DiagnosticReport) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(DiagnosticReport={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(DiagnosticReport) - exited - return value={} result ");
  }

  @Override
  public List<DiagnosticReport> findByField(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<DiagnosticReport> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByCategory(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByCode(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findBySubject(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByContext(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByPerformer(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findBySpecimen(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findBySpecimen(queryBuilder);
    logger.info("findByspecimen - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByResult(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByResult(queryBuilder);
    logger.info("findByresult - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByImagingStudy(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByImagingStudy(queryBuilder);
    logger.info("findByimagingStudy - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByImage(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByImage(queryBuilder);
    logger.info("findByimage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByCodedDiagnosis(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByCodedDiagnosis(queryBuilder);
    logger.info("findBycodedDiagnosis - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByText(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DiagnosticReport> findByMeta(QueryBuilder queryBuilder) {
  	final List<DiagnosticReport> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}