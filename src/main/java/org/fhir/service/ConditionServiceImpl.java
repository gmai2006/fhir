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
import org.fhir.pojo.Condition;
/**
* auto generated from SQL files
*/
public class ConditionServiceImpl implements ConditionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ConditionDao dao;

  @Inject
  public ConditionServiceImpl(final ConditionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Condition find(String id) {
    final Condition result = dao.find(id);
    logger.info("find(Condition) - exited - return value={} result ");
    return result;
  }

  public List<Condition> select(int maxResult) {
      final List<Condition> result = dao.select(maxResult);
      logger.info("select(Condition) - exited - return value={} result ");

      return result;
  }

  public List<Condition> selectAll() {
      final List<Condition> results = dao.selectAll();
      logger.info("selectAll(Condition) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Condition create(Condition bean) {
  	requireNonNull(bean);
    logger.info("create(Condition={}) - entered bean ");

    final Condition result = dao.create(bean);

    logger.info("create(Condition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Condition update(Condition bean) {
  	requireNonNull(bean);
    logger.info("update(Condition={}) - entered bean ");

    final Condition result = dao.update(bean);

    logger.info("update(Condition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Condition={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Condition) - exited - return value={} result ");
  }

  @Override
  public List<Condition> findByField(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Condition> findByCategory(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findBySeverity(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findBySeverity(queryBuilder);
    logger.info("findByseverity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findByCode(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findByBodySite(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByBodySite(queryBuilder);
    logger.info("findBybodySite - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findBySubject(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findByContext(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findByAsserter(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByAsserter(queryBuilder);
    logger.info("findByasserter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findByStage(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByStage(queryBuilder);
    logger.info("findBystage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findByEvidence(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByEvidence(queryBuilder);
    logger.info("findByevidence - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findByText(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Condition> findByMeta(QueryBuilder queryBuilder) {
  	final List<Condition> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}