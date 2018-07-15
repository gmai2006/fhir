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
import org.fhir.pojo.Coverage;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class CoverageServiceImpl implements CoverageService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CoverageDao dao;

  @Inject
  public CoverageServiceImpl(final CoverageDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Coverage find(String id) {
    final Coverage result = dao.find(id);
    logger.info("find(Coverage) - exited - return value={} result ");
    return result;
  }

  public List<Coverage> select(int maxResult) {
      final List<Coverage> result = dao.select(maxResult);
      logger.info("select(Coverage) - exited - return value={} result ");

      return result;
  }

  public List<Coverage> selectAll() {
      final List<Coverage> results = dao.selectAll();
      logger.info("selectAll(Coverage) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Coverage create(Coverage bean) {
  	requireNonNull(bean);
    logger.info("create(Coverage={}) - entered bean ");

    final Coverage result = dao.create(bean);

    logger.info("create(Coverage) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Coverage update(Coverage bean) {
  	requireNonNull(bean);
    logger.info("update(Coverage={}) - entered bean ");

    final Coverage result = dao.update(bean);

    logger.info("update(Coverage) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Coverage={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Coverage) - exited - return value={} result ");
  }

  @Override
  public List<Coverage> findByField(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Coverage> findByType(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findByPolicyHolder(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByPolicyHolder(queryBuilder);
    logger.info("findBypolicyHolder - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findBySubscriber(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findBySubscriber(queryBuilder);
    logger.info("findBysubscriber - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findByBeneficiary(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByBeneficiary(queryBuilder);
    logger.info("findBybeneficiary - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findByRelationship(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByRelationship(queryBuilder);
    logger.info("findByrelationship - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findByPayor(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByPayor(queryBuilder);
    logger.info("findBypayor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findByGrouping(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByGrouping(queryBuilder);
    logger.info("findBygrouping - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findByContract(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByContract(queryBuilder);
    logger.info("findBycontract - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findByText(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Coverage> findByMeta(QueryBuilder queryBuilder) {
  	final List<Coverage> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}