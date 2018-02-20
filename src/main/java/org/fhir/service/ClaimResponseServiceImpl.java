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
import org.fhir.pojo.ClaimResponse;
/**
* auto generated from SQL files
*/
public class ClaimResponseServiceImpl implements ClaimResponseService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ClaimResponseDao dao;

  @Inject
  public ClaimResponseServiceImpl(final ClaimResponseDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ClaimResponse find(String id) {
    final ClaimResponse result = dao.find(id);
    logger.info("find(ClaimResponse) - exited - return value={} result ");
    return result;
  }

  public List<ClaimResponse> select(int maxResult) {
      final List<ClaimResponse> result = dao.select(maxResult);
      logger.info("select(ClaimResponse) - exited - return value={} result ");

      return result;
  }

  public List<ClaimResponse> selectAll() {
      final List<ClaimResponse> results = dao.selectAll();
      logger.info("selectAll(ClaimResponse) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ClaimResponse create(ClaimResponse bean) {
  	requireNonNull(bean);
    logger.info("create(ClaimResponse={}) - entered bean ");

    final ClaimResponse result = dao.create(bean);

    logger.info("create(ClaimResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ClaimResponse update(ClaimResponse bean) {
  	requireNonNull(bean);
    logger.info("update(ClaimResponse={}) - entered bean ");

    final ClaimResponse result = dao.update(bean);

    logger.info("update(ClaimResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ClaimResponse bean) {
  	requireNonNull(bean);
    logger.info("delete(ClaimResponse={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ClaimResponse) - exited - return value={} result ");
  }

  @Override
  public List<ClaimResponse> findByField(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ClaimResponse> findByPatient(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByInsurer(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByInsurer(queryBuilder);
    logger.info("findByinsurer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByRequestProvider(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByRequestProvider(queryBuilder);
    logger.info("findByrequestProvider - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByRequestOrganization(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByRequestOrganization(queryBuilder);
    logger.info("findByrequestOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByRequest(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByRequest(queryBuilder);
    logger.info("findByrequest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByOutcome(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByOutcome(queryBuilder);
    logger.info("findByoutcome - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByPayeeType(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByPayeeType(queryBuilder);
    logger.info("findBypayeeType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByItem(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByItem(queryBuilder);
    logger.info("findByitem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByAddItem(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByAddItem(queryBuilder);
    logger.info("findByaddItem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByError(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByError(queryBuilder);
    logger.info("findByerror - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByTotalCost(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByTotalCost(queryBuilder);
    logger.info("findBytotalCost - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByUnallocDeductable(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByUnallocDeductable(queryBuilder);
    logger.info("findByunallocDeductable - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByTotalBenefit(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByTotalBenefit(queryBuilder);
    logger.info("findBytotalBenefit - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByPayment(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByPayment(queryBuilder);
    logger.info("findBypayment - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByReserved(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByReserved(queryBuilder);
    logger.info("findByreserved - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByForm(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByForm(queryBuilder);
    logger.info("findByform - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByProcessNote(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByProcessNote(queryBuilder);
    logger.info("findByprocessNote - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByCommunicationRequest(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByCommunicationRequest(queryBuilder);
    logger.info("findBycommunicationRequest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByInsurance(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByInsurance(queryBuilder);
    logger.info("findByinsurance - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByText(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClaimResponse> findByMeta(QueryBuilder queryBuilder) {
  	final List<ClaimResponse> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}