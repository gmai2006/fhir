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
import org.fhir.pojo.CapabilityStatement;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class CapabilityStatementServiceImpl implements CapabilityStatementService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CapabilityStatementDao dao;

  @Inject
  public CapabilityStatementServiceImpl(final CapabilityStatementDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public CapabilityStatement find(String id) {
    final CapabilityStatement result = dao.find(id);
    logger.info("find(CapabilityStatement) - exited - return value={} result ");
    return result;
  }

  public List<CapabilityStatement> select(int maxResult) {
      final List<CapabilityStatement> result = dao.select(maxResult);
      logger.info("select(CapabilityStatement) - exited - return value={} result ");

      return result;
  }

  public List<CapabilityStatement> selectAll() {
      final List<CapabilityStatement> results = dao.selectAll();
      logger.info("selectAll(CapabilityStatement) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public CapabilityStatement create(CapabilityStatement bean) {
  	requireNonNull(bean);
    logger.info("create(CapabilityStatement={}) - entered bean ");

    final CapabilityStatement result = dao.create(bean);

    logger.info("create(CapabilityStatement) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public CapabilityStatement update(CapabilityStatement bean) {
  	requireNonNull(bean);
    logger.info("update(CapabilityStatement={}) - entered bean ");

    final CapabilityStatement result = dao.update(bean);

    logger.info("update(CapabilityStatement) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(CapabilityStatement={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(CapabilityStatement) - exited - return value={} result ");
  }

  @Override
  public List<CapabilityStatement> findByField(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<CapabilityStatement> findByContact(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByUseContext(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findBySoftware(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findBySoftware(queryBuilder);
    logger.info("findBysoftware - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByImplementation(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByImplementation(queryBuilder);
    logger.info("findByimplementation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByProfile(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByProfile(queryBuilder);
    logger.info("findByprofile - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByRest(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByRest(queryBuilder);
    logger.info("findByrest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByMessaging(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByMessaging(queryBuilder);
    logger.info("findBymessaging - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByDocument(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByDocument(queryBuilder);
    logger.info("findBydocument - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByText(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CapabilityStatement> findByMeta(QueryBuilder queryBuilder) {
  	final List<CapabilityStatement> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}