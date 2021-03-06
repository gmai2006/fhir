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
import org.fhir.pojo.ImplementationGuide;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ImplementationGuideServiceImpl implements ImplementationGuideService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ImplementationGuideDao dao;

  @Inject
  public ImplementationGuideServiceImpl(final ImplementationGuideDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ImplementationGuide find(String id) {
    final ImplementationGuide result = dao.find(id);
    logger.info("find(ImplementationGuide) - exited - return value={} result ");
    return result;
  }

  public List<ImplementationGuide> select(int maxResult) {
      final List<ImplementationGuide> result = dao.select(maxResult);
      logger.info("select(ImplementationGuide) - exited - return value={} result ");

      return result;
  }

  public List<ImplementationGuide> selectAll() {
      final List<ImplementationGuide> results = dao.selectAll();
      logger.info("selectAll(ImplementationGuide) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ImplementationGuide create(ImplementationGuide bean) {
  	requireNonNull(bean);
    logger.info("create(ImplementationGuide={}) - entered bean ");

    final ImplementationGuide result = dao.create(bean);

    logger.info("create(ImplementationGuide) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ImplementationGuide update(ImplementationGuide bean) {
  	requireNonNull(bean);
    logger.info("update(ImplementationGuide={}) - entered bean ");

    final ImplementationGuide result = dao.update(bean);

    logger.info("update(ImplementationGuide) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ImplementationGuide={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ImplementationGuide) - exited - return value={} result ");
  }

  @Override
  public List<ImplementationGuide> findByField(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ImplementationGuide> findByContact(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImplementationGuide> findByUseContext(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImplementationGuide> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImplementationGuide> findByDependency(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByDependency(queryBuilder);
    logger.info("findBydependency - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImplementationGuide> findByFHIRpackage(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByFHIRpackage(queryBuilder);
    logger.info("findByFHIRpackage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImplementationGuide> findByGlobal(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByGlobal(queryBuilder);
    logger.info("findByglobal - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImplementationGuide> findByText(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImplementationGuide> findByMeta(QueryBuilder queryBuilder) {
  	final List<ImplementationGuide> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}