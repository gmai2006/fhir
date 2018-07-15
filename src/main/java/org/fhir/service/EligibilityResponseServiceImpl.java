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
import org.fhir.pojo.EligibilityResponse;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class EligibilityResponseServiceImpl implements EligibilityResponseService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final EligibilityResponseDao dao;

  @Inject
  public EligibilityResponseServiceImpl(final EligibilityResponseDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public EligibilityResponse find(String id) {
    final EligibilityResponse result = dao.find(id);
    logger.info("find(EligibilityResponse) - exited - return value={} result ");
    return result;
  }

  public List<EligibilityResponse> select(int maxResult) {
      final List<EligibilityResponse> result = dao.select(maxResult);
      logger.info("select(EligibilityResponse) - exited - return value={} result ");

      return result;
  }

  public List<EligibilityResponse> selectAll() {
      final List<EligibilityResponse> results = dao.selectAll();
      logger.info("selectAll(EligibilityResponse) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public EligibilityResponse create(EligibilityResponse bean) {
  	requireNonNull(bean);
    logger.info("create(EligibilityResponse={}) - entered bean ");

    final EligibilityResponse result = dao.create(bean);

    logger.info("create(EligibilityResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public EligibilityResponse update(EligibilityResponse bean) {
  	requireNonNull(bean);
    logger.info("update(EligibilityResponse={}) - entered bean ");

    final EligibilityResponse result = dao.update(bean);

    logger.info("update(EligibilityResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(EligibilityResponse={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(EligibilityResponse) - exited - return value={} result ");
  }

  @Override
  public List<EligibilityResponse> findByField(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<EligibilityResponse> findByRequestProvider(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByRequestProvider(queryBuilder);
    logger.info("findByrequestProvider - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByRequestOrganization(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByRequestOrganization(queryBuilder);
    logger.info("findByrequestOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByRequest(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByRequest(queryBuilder);
    logger.info("findByrequest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByOutcome(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByOutcome(queryBuilder);
    logger.info("findByoutcome - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByInsurer(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByInsurer(queryBuilder);
    logger.info("findByinsurer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByInsurance(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByInsurance(queryBuilder);
    logger.info("findByinsurance - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByForm(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByForm(queryBuilder);
    logger.info("findByform - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByError(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByError(queryBuilder);
    logger.info("findByerror - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByText(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EligibilityResponse> findByMeta(QueryBuilder queryBuilder) {
  	final List<EligibilityResponse> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}