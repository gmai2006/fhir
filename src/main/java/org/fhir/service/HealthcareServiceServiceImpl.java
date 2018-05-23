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
import org.fhir.pojo.HealthcareService;
/**
* auto generated from SQL files
*/
public class HealthcareServiceServiceImpl implements HealthcareServiceService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final HealthcareServiceDao dao;

  @Inject
  public HealthcareServiceServiceImpl(final HealthcareServiceDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public HealthcareService find(String id) {
    final HealthcareService result = dao.find(id);
    logger.info("find(HealthcareService) - exited - return value={} result ");
    return result;
  }

  public List<HealthcareService> select(int maxResult) {
      final List<HealthcareService> result = dao.select(maxResult);
      logger.info("select(HealthcareService) - exited - return value={} result ");

      return result;
  }

  public List<HealthcareService> selectAll() {
      final List<HealthcareService> results = dao.selectAll();
      logger.info("selectAll(HealthcareService) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public HealthcareService create(HealthcareService bean) {
  	requireNonNull(bean);
    logger.info("create(HealthcareService={}) - entered bean ");

    final HealthcareService result = dao.create(bean);

    logger.info("create(HealthcareService) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public HealthcareService update(HealthcareService bean) {
  	requireNonNull(bean);
    logger.info("update(HealthcareService={}) - entered bean ");

    final HealthcareService result = dao.update(bean);

    logger.info("update(HealthcareService) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(HealthcareService={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(HealthcareService) - exited - return value={} result ");
  }

  @Override
  public List<HealthcareService> findByField(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<HealthcareService> findByProvidedBy(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByProvidedBy(queryBuilder);
    logger.info("findByprovidedBy - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByCategory(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByType(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findBySpecialty(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findBySpecialty(queryBuilder);
    logger.info("findByspecialty - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByLocation(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByLocation(queryBuilder);
    logger.info("findBylocation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByCoverageArea(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByCoverageArea(queryBuilder);
    logger.info("findBycoverageArea - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByServiceProvisionCode(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByServiceProvisionCode(queryBuilder);
    logger.info("findByserviceProvisionCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByEligibility(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByEligibility(queryBuilder);
    logger.info("findByeligibility - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByCharacteristic(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByCharacteristic(queryBuilder);
    logger.info("findBycharacteristic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByReferralMethod(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByReferralMethod(queryBuilder);
    logger.info("findByreferralMethod - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByAvailableTime(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByAvailableTime(queryBuilder);
    logger.info("findByavailableTime - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByNotAvailable(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByNotAvailable(queryBuilder);
    logger.info("findBynotAvailable - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByEndpoint(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByEndpoint(queryBuilder);
    logger.info("findByendpoint - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByText(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<HealthcareService> findByMeta(QueryBuilder queryBuilder) {
  	final List<HealthcareService> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}