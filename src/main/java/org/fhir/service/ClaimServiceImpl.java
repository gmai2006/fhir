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
import org.fhir.pojo.Claim;
/**
* auto generated from SQL files
*/
public class ClaimServiceImpl implements ClaimService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ClaimDao dao;

  @Inject
  public ClaimServiceImpl(final ClaimDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Claim find(String id) {
    final Claim result = dao.find(id);
    logger.info("find(Claim) - exited - return value={} result ");
    return result;
  }

  public List<Claim> select(int maxResult) {
      final List<Claim> result = dao.select(maxResult);
      logger.info("select(Claim) - exited - return value={} result ");

      return result;
  }

  public List<Claim> selectAll() {
      final List<Claim> results = dao.selectAll();
      logger.info("selectAll(Claim) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Claim create(Claim bean) {
  	requireNonNull(bean);
    logger.info("create(Claim={}) - entered bean ");

    final Claim result = dao.create(bean);

    logger.info("create(Claim) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Claim update(Claim bean) {
  	requireNonNull(bean);
    logger.info("update(Claim={}) - entered bean ");

    final Claim result = dao.update(bean);

    logger.info("update(Claim) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Claim bean) {
  	requireNonNull(bean);
    logger.info("delete(Claim={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Claim) - exited - return value={} result ");
  }

  @Override
  public List<Claim> findByField(QueryBuilder queryBuilder) {
  	final List<Claim> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Claim> findByEnterer(QueryBuilder queryBuilder) {
  	final List<Claim> result = dao.findByEnterer(queryBuilder);
    logger.info("findByenterer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Claim> findByFacility(QueryBuilder queryBuilder) {
  	final List<Claim> result = dao.findByFacility(queryBuilder);
    logger.info("findByfacility - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Claim> findByInsurer(QueryBuilder queryBuilder) {
  	final List<Claim> result = dao.findByInsurer(queryBuilder);
    logger.info("findByinsurer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Claim> findByOrganization(QueryBuilder queryBuilder) {
  	final List<Claim> result = dao.findByOrganization(queryBuilder);
    logger.info("findByorganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Claim> findByPatient(QueryBuilder queryBuilder) {
  	final List<Claim> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Claim> findByPayee(QueryBuilder queryBuilder) {
  	final List<Claim> result = dao.findByPayee(queryBuilder);
    logger.info("findBypayee - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Claim> findByProvider(QueryBuilder queryBuilder) {
  	final List<Claim> result = dao.findByProvider(queryBuilder);
    logger.info("findByprovider - exited - return value={} result ");
    return result;
  }
}