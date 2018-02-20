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
import org.fhir.pojo.MeasureReport;
/**
* auto generated from SQL files
*/
public class MeasureReportServiceImpl implements MeasureReportService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MeasureReportDao dao;

  @Inject
  public MeasureReportServiceImpl(final MeasureReportDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public MeasureReport find(String id) {
    final MeasureReport result = dao.find(id);
    logger.info("find(MeasureReport) - exited - return value={} result ");
    return result;
  }

  public List<MeasureReport> select(int maxResult) {
      final List<MeasureReport> result = dao.select(maxResult);
      logger.info("select(MeasureReport) - exited - return value={} result ");

      return result;
  }

  public List<MeasureReport> selectAll() {
      final List<MeasureReport> results = dao.selectAll();
      logger.info("selectAll(MeasureReport) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public MeasureReport create(MeasureReport bean) {
  	requireNonNull(bean);
    logger.info("create(MeasureReport={}) - entered bean ");

    final MeasureReport result = dao.create(bean);

    logger.info("create(MeasureReport) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public MeasureReport update(MeasureReport bean) {
  	requireNonNull(bean);
    logger.info("update(MeasureReport={}) - entered bean ");

    final MeasureReport result = dao.update(bean);

    logger.info("update(MeasureReport) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(MeasureReport bean) {
  	requireNonNull(bean);
    logger.info("delete(MeasureReport={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(MeasureReport) - exited - return value={} result ");
  }

  @Override
  public List<MeasureReport> findByField(QueryBuilder queryBuilder) {
  	final List<MeasureReport> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<MeasureReport> findByMeasure(QueryBuilder queryBuilder) {
  	final List<MeasureReport> result = dao.findByMeasure(queryBuilder);
    logger.info("findBymeasure - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MeasureReport> findByPatient(QueryBuilder queryBuilder) {
  	final List<MeasureReport> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MeasureReport> findByReportingOrganization(QueryBuilder queryBuilder) {
  	final List<MeasureReport> result = dao.findByReportingOrganization(queryBuilder);
    logger.info("findByreportingOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MeasureReport> findByGroup(QueryBuilder queryBuilder) {
  	final List<MeasureReport> result = dao.findByGroup(queryBuilder);
    logger.info("findBygroup - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MeasureReport> findByEvaluatedResources(QueryBuilder queryBuilder) {
  	final List<MeasureReport> result = dao.findByEvaluatedResources(queryBuilder);
    logger.info("findByevaluatedResources - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MeasureReport> findByText(QueryBuilder queryBuilder) {
  	final List<MeasureReport> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MeasureReport> findByMeta(QueryBuilder queryBuilder) {
  	final List<MeasureReport> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}