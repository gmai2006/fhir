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
import org.fhir.pojo.EligibilityRequest;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class EligibilityRequestServiceImpl implements EligibilityRequestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final EligibilityRequestDao dao;

  @Inject
  public EligibilityRequestServiceImpl(final EligibilityRequestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public EligibilityRequest find(String id) {
    final EligibilityRequest result = dao.find(id);
    logger.info("find(EligibilityRequest) - exited - return value={} result ");
    return result;
  }

  public List<EligibilityRequest> select(int maxResult) {
      final List<EligibilityRequest> result = dao.select(maxResult);
      logger.info("select(EligibilityRequest) - exited - return value={} result ");

      return result;
  }

  public List<EligibilityRequest> selectAll() {
      final List<EligibilityRequest> results = dao.selectAll();
      logger.info("selectAll(EligibilityRequest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public EligibilityRequest create(EligibilityRequest bean) {
  	requireNonNull(bean);
    logger.info("create(EligibilityRequest={}) - entered bean ");

    final EligibilityRequest result = dao.create(bean);

    logger.info("create(EligibilityRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public EligibilityRequest update(EligibilityRequest bean) {
  	requireNonNull(bean);
    logger.info("update(EligibilityRequest={}) - entered bean ");

    final EligibilityRequest result = dao.update(bean);

    logger.info("update(EligibilityRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(EligibilityRequest={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(EligibilityRequest) - exited - return value={} result ");
  }

  @Override
  public List<EligibilityRequest> findByField(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<EligibilityRequest> findByPriority(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByPriority(queryBuilder);
    logger.info("findBypriority - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByPatient(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByEnterer(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByEnterer(queryBuilder);
    logger.info("findByenterer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByProvider(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByProvider(queryBuilder);
    logger.info("findByprovider - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByOrganization(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByOrganization(queryBuilder);
    logger.info("findByorganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByInsurer(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByInsurer(queryBuilder);
    logger.info("findByinsurer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByFacility(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByFacility(queryBuilder);
    logger.info("findByfacility - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByCoverage(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByCoverage(queryBuilder);
    logger.info("findBycoverage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByBenefitCategory(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByBenefitCategory(queryBuilder);
    logger.info("findBybenefitCategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByBenefitSubCategory(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByBenefitSubCategory(queryBuilder);
    logger.info("findBybenefitSubCategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByText(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityRequest> findByMeta(QueryBuilder queryBuilder) {
  	final List<EligibilityRequest> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}