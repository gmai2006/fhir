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
import org.fhir.pojo.TestReport;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class TestReportServiceImpl implements TestReportService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final TestReportDao dao;

  @Inject
  public TestReportServiceImpl(final TestReportDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public TestReport find(String id) {
    final TestReport result = dao.find(id);
    logger.info("find(TestReport) - exited - return value={} result ");
    return result;
  }

  public List<TestReport> select(int maxResult) {
      final List<TestReport> result = dao.select(maxResult);
      logger.info("select(TestReport) - exited - return value={} result ");

      return result;
  }

  public List<TestReport> selectAll() {
      final List<TestReport> results = dao.selectAll();
      logger.info("selectAll(TestReport) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public TestReport create(TestReport bean) {
  	requireNonNull(bean);
    logger.info("create(TestReport={}) - entered bean ");

    final TestReport result = dao.create(bean);

    logger.info("create(TestReport) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public TestReport update(TestReport bean) {
  	requireNonNull(bean);
    logger.info("update(TestReport={}) - entered bean ");

    final TestReport result = dao.update(bean);

    logger.info("update(TestReport) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(TestReport={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(TestReport) - exited - return value={} result ");
  }

  @Override
  public List<TestReport> findByField(QueryBuilder queryBuilder) {
  	final List<TestReport> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<TestReport> findByTestScript(QueryBuilder queryBuilder) {
  	final List<TestReport> result = dao.findByTestScript(queryBuilder);
    logger.info("findBytestScript - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestReport> findByParticipant(QueryBuilder queryBuilder) {
  	final List<TestReport> result = dao.findByParticipant(queryBuilder);
    logger.info("findByparticipant - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestReport> findBySetup(QueryBuilder queryBuilder) {
  	final List<TestReport> result = dao.findBySetup(queryBuilder);
    logger.info("findBysetup - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestReport> findByTest(QueryBuilder queryBuilder) {
  	final List<TestReport> result = dao.findByTest(queryBuilder);
    logger.info("findBytest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestReport> findByTeardown(QueryBuilder queryBuilder) {
  	final List<TestReport> result = dao.findByTeardown(queryBuilder);
    logger.info("findByteardown - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestReport> findByText(QueryBuilder queryBuilder) {
  	final List<TestReport> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestReport> findByMeta(QueryBuilder queryBuilder) {
  	final List<TestReport> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}