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
import org.fhir.pojo.DetectedIssue;
/**
* auto generated from SQL files
*/
public class DetectedIssueServiceImpl implements DetectedIssueService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DetectedIssueDao dao;

  @Inject
  public DetectedIssueServiceImpl(final DetectedIssueDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DetectedIssue find(String id) {
    final DetectedIssue result = dao.find(id);
    logger.info("find(DetectedIssue) - exited - return value={} result ");
    return result;
  }

  public List<DetectedIssue> select(int maxResult) {
      final List<DetectedIssue> result = dao.select(maxResult);
      logger.info("select(DetectedIssue) - exited - return value={} result ");

      return result;
  }

  public List<DetectedIssue> selectAll() {
      final List<DetectedIssue> results = dao.selectAll();
      logger.info("selectAll(DetectedIssue) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DetectedIssue create(DetectedIssue bean) {
  	requireNonNull(bean);
    logger.info("create(DetectedIssue={}) - entered bean ");

    final DetectedIssue result = dao.create(bean);

    logger.info("create(DetectedIssue) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DetectedIssue update(DetectedIssue bean) {
  	requireNonNull(bean);
    logger.info("update(DetectedIssue={}) - entered bean ");

    final DetectedIssue result = dao.update(bean);

    logger.info("update(DetectedIssue) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(DetectedIssue={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(DetectedIssue) - exited - return value={} result ");
  }

  @Override
  public List<DetectedIssue> findByField(QueryBuilder queryBuilder) {
  	final List<DetectedIssue> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<DetectedIssue> findByCategory(QueryBuilder queryBuilder) {
  	final List<DetectedIssue> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DetectedIssue> findByPatient(QueryBuilder queryBuilder) {
  	final List<DetectedIssue> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DetectedIssue> findByAuthor(QueryBuilder queryBuilder) {
  	final List<DetectedIssue> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DetectedIssue> findByImplicated(QueryBuilder queryBuilder) {
  	final List<DetectedIssue> result = dao.findByImplicated(queryBuilder);
    logger.info("findByimplicated - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DetectedIssue> findByMitigation(QueryBuilder queryBuilder) {
  	final List<DetectedIssue> result = dao.findByMitigation(queryBuilder);
    logger.info("findBymitigation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DetectedIssue> findByText(QueryBuilder queryBuilder) {
  	final List<DetectedIssue> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DetectedIssue> findByMeta(QueryBuilder queryBuilder) {
  	final List<DetectedIssue> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}