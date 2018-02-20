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
import org.fhir.pojo.Task;
/**
* auto generated from SQL files
*/
public class TaskServiceImpl implements TaskService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final TaskDao dao;

  @Inject
  public TaskServiceImpl(final TaskDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Task find(String id) {
    final Task result = dao.find(id);
    logger.info("find(Task) - exited - return value={} result ");
    return result;
  }

  public List<Task> select(int maxResult) {
      final List<Task> result = dao.select(maxResult);
      logger.info("select(Task) - exited - return value={} result ");

      return result;
  }

  public List<Task> selectAll() {
      final List<Task> results = dao.selectAll();
      logger.info("selectAll(Task) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Task create(Task bean) {
  	requireNonNull(bean);
    logger.info("create(Task={}) - entered bean ");

    final Task result = dao.create(bean);

    logger.info("create(Task) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Task update(Task bean) {
  	requireNonNull(bean);
    logger.info("update(Task={}) - entered bean ");

    final Task result = dao.update(bean);

    logger.info("update(Task) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Task bean) {
  	requireNonNull(bean);
    logger.info("delete(Task={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Task) - exited - return value={} result ");
  }

  @Override
  public List<Task> findByField(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Task> findByDefinitionReference(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByDefinitionReference(queryBuilder);
    logger.info("findBydefinitionReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByPartOf(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByStatusReason(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByStatusReason(queryBuilder);
    logger.info("findBystatusReason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByBusinessStatus(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByBusinessStatus(queryBuilder);
    logger.info("findBybusinessStatus - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByCode(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByFocus(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByFocus(queryBuilder);
    logger.info("findByfocus - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByFHIRfor(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByFHIRfor(queryBuilder);
    logger.info("findByFHIRfor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByContext(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByRequester(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByRequester(queryBuilder);
    logger.info("findByrequester - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByPerformerType(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByPerformerType(queryBuilder);
    logger.info("findByperformerType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByOwner(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByOwner(queryBuilder);
    logger.info("findByowner - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByReason(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByReason(queryBuilder);
    logger.info("findByreason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByRelevantHistory(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByRelevantHistory(queryBuilder);
    logger.info("findByrelevantHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByRestriction(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByRestriction(queryBuilder);
    logger.info("findByrestriction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByOutput(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByOutput(queryBuilder);
    logger.info("findByoutput - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByText(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Task> findByMeta(QueryBuilder queryBuilder) {
  	final List<Task> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}