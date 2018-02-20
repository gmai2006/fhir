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
import org.fhir.pojo.TestScript;
/**
* auto generated from SQL files
*/
public class TestScriptServiceImpl implements TestScriptService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final TestScriptDao dao;

  @Inject
  public TestScriptServiceImpl(final TestScriptDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public TestScript find(String id) {
    final TestScript result = dao.find(id);
    logger.info("find(TestScript) - exited - return value={} result ");
    return result;
  }

  public List<TestScript> select(int maxResult) {
      final List<TestScript> result = dao.select(maxResult);
      logger.info("select(TestScript) - exited - return value={} result ");

      return result;
  }

  public List<TestScript> selectAll() {
      final List<TestScript> results = dao.selectAll();
      logger.info("selectAll(TestScript) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public TestScript create(TestScript bean) {
  	requireNonNull(bean);
    logger.info("create(TestScript={}) - entered bean ");

    final TestScript result = dao.create(bean);

    logger.info("create(TestScript) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public TestScript update(TestScript bean) {
  	requireNonNull(bean);
    logger.info("update(TestScript={}) - entered bean ");

    final TestScript result = dao.update(bean);

    logger.info("update(TestScript) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(TestScript bean) {
  	requireNonNull(bean);
    logger.info("delete(TestScript={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(TestScript) - exited - return value={} result ");
  }

  @Override
  public List<TestScript> findByField(QueryBuilder queryBuilder) {
  	final List<TestScript> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<TestScript> findByContact(QueryBuilder queryBuilder) {
  	final List<TestScript> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestScript> findByUseContext(QueryBuilder queryBuilder) {
  	final List<TestScript> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestScript> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<TestScript> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestScript> findByProfile(QueryBuilder queryBuilder) {
  	final List<TestScript> result = dao.findByProfile(queryBuilder);
    logger.info("findByprofile - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestScript> findByText(QueryBuilder queryBuilder) {
  	final List<TestScript> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<TestScript> findByMeta(QueryBuilder queryBuilder) {
  	final List<TestScript> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}