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
import org.fhir.pojo.Procedure;
/**
* auto generated from SQL files
*/
public class ProcedureServiceImpl implements ProcedureService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ProcedureDao dao;

  @Inject
  public ProcedureServiceImpl(final ProcedureDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Procedure find(String id) {
    final Procedure result = dao.find(id);
    logger.info("find(Procedure) - exited - return value={} result ");
    return result;
  }

  public List<Procedure> select(int maxResult) {
      final List<Procedure> result = dao.select(maxResult);
      logger.info("select(Procedure) - exited - return value={} result ");

      return result;
  }

  public List<Procedure> selectAll() {
      final List<Procedure> results = dao.selectAll();
      logger.info("selectAll(Procedure) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Procedure create(Procedure bean) {
  	requireNonNull(bean);
    logger.info("create(Procedure={}) - entered bean ");

    final Procedure result = dao.create(bean);

    logger.info("create(Procedure) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Procedure update(Procedure bean) {
  	requireNonNull(bean);
    logger.info("update(Procedure={}) - entered bean ");

    final Procedure result = dao.update(bean);

    logger.info("update(Procedure) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Procedure={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Procedure) - exited - return value={} result ");
  }

  @Override
  public List<Procedure> findByField(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Procedure> findByDefinition(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByPartOf(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByNotDoneReason(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByNotDoneReason(queryBuilder);
    logger.info("findBynotDoneReason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByCategory(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByCode(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findBySubject(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByContext(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByPerformer(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByLocation(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByLocation(queryBuilder);
    logger.info("findBylocation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByBodySite(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByBodySite(queryBuilder);
    logger.info("findBybodySite - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByOutcome(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByOutcome(queryBuilder);
    logger.info("findByoutcome - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByReport(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByReport(queryBuilder);
    logger.info("findByreport - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByComplication(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByComplication(queryBuilder);
    logger.info("findBycomplication - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByComplicationDetail(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByComplicationDetail(queryBuilder);
    logger.info("findBycomplicationDetail - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByFollowUp(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByFollowUp(queryBuilder);
    logger.info("findByfollowUp - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByFocalDevice(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByFocalDevice(queryBuilder);
    logger.info("findByfocalDevice - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByUsedReference(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByUsedReference(queryBuilder);
    logger.info("findByusedReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByUsedCode(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByUsedCode(queryBuilder);
    logger.info("findByusedCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByText(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Procedure> findByMeta(QueryBuilder queryBuilder) {
  	final List<Procedure> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}