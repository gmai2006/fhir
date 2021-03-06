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
import org.fhir.pojo.ProcedureRequest;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ProcedureRequestServiceImpl implements ProcedureRequestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ProcedureRequestDao dao;

  @Inject
  public ProcedureRequestServiceImpl(final ProcedureRequestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ProcedureRequest find(String id) {
    final ProcedureRequest result = dao.find(id);
    logger.info("find(ProcedureRequest) - exited - return value={} result ");
    return result;
  }

  public List<ProcedureRequest> select(int maxResult) {
      final List<ProcedureRequest> result = dao.select(maxResult);
      logger.info("select(ProcedureRequest) - exited - return value={} result ");

      return result;
  }

  public List<ProcedureRequest> selectAll() {
      final List<ProcedureRequest> results = dao.selectAll();
      logger.info("selectAll(ProcedureRequest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ProcedureRequest create(ProcedureRequest bean) {
  	requireNonNull(bean);
    logger.info("create(ProcedureRequest={}) - entered bean ");

    final ProcedureRequest result = dao.create(bean);

    logger.info("create(ProcedureRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ProcedureRequest update(ProcedureRequest bean) {
  	requireNonNull(bean);
    logger.info("update(ProcedureRequest={}) - entered bean ");

    final ProcedureRequest result = dao.update(bean);

    logger.info("update(ProcedureRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ProcedureRequest={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ProcedureRequest) - exited - return value={} result ");
  }

  @Override
  public List<ProcedureRequest> findByField(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ProcedureRequest> findByDefinition(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByReplaces(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByReplaces(queryBuilder);
    logger.info("findByreplaces - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByCategory(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByCode(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findBySubject(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByContext(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByAsNeededCodeableConcept(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByAsNeededCodeableConcept(queryBuilder);
    logger.info("findByasNeededCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByRequester(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByRequester(queryBuilder);
    logger.info("findByrequester - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByPerformerType(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByPerformerType(queryBuilder);
    logger.info("findByperformerType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByPerformer(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findBySupportingInfo(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findBySupportingInfo(queryBuilder);
    logger.info("findBysupportingInfo - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findBySpecimen(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findBySpecimen(queryBuilder);
    logger.info("findByspecimen - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByBodySite(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByBodySite(queryBuilder);
    logger.info("findBybodySite - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByRelevantHistory(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByRelevantHistory(queryBuilder);
    logger.info("findByrelevantHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByText(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcedureRequest> findByMeta(QueryBuilder queryBuilder) {
  	final List<ProcedureRequest> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}