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
import org.fhir.pojo.FamilyMemberHistory;
/**
* auto generated from SQL files
*/
public class FamilyMemberHistoryServiceImpl implements FamilyMemberHistoryService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final FamilyMemberHistoryDao dao;

  @Inject
  public FamilyMemberHistoryServiceImpl(final FamilyMemberHistoryDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public FamilyMemberHistory find(String id) {
    final FamilyMemberHistory result = dao.find(id);
    logger.info("find(FamilyMemberHistory) - exited - return value={} result ");
    return result;
  }

  public List<FamilyMemberHistory> select(int maxResult) {
      final List<FamilyMemberHistory> result = dao.select(maxResult);
      logger.info("select(FamilyMemberHistory) - exited - return value={} result ");

      return result;
  }

  public List<FamilyMemberHistory> selectAll() {
      final List<FamilyMemberHistory> results = dao.selectAll();
      logger.info("selectAll(FamilyMemberHistory) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public FamilyMemberHistory create(FamilyMemberHistory bean) {
  	requireNonNull(bean);
    logger.info("create(FamilyMemberHistory={}) - entered bean ");

    final FamilyMemberHistory result = dao.create(bean);

    logger.info("create(FamilyMemberHistory) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public FamilyMemberHistory update(FamilyMemberHistory bean) {
  	requireNonNull(bean);
    logger.info("update(FamilyMemberHistory={}) - entered bean ");

    final FamilyMemberHistory result = dao.update(bean);

    logger.info("update(FamilyMemberHistory) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(FamilyMemberHistory={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(FamilyMemberHistory) - exited - return value={} result ");
  }

  @Override
  public List<FamilyMemberHistory> findByField(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<FamilyMemberHistory> findByDefinition(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FamilyMemberHistory> findByNotDoneReason(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByNotDoneReason(queryBuilder);
    logger.info("findBynotDoneReason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FamilyMemberHistory> findByPatient(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FamilyMemberHistory> findByRelationship(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByRelationship(queryBuilder);
    logger.info("findByrelationship - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FamilyMemberHistory> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FamilyMemberHistory> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FamilyMemberHistory> findByCondition(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByCondition(queryBuilder);
    logger.info("findBycondition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FamilyMemberHistory> findByText(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FamilyMemberHistory> findByMeta(QueryBuilder queryBuilder) {
  	final List<FamilyMemberHistory> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}