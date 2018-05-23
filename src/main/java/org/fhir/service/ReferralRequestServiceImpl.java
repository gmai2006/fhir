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
import org.fhir.pojo.ReferralRequest;
/**
* auto generated from SQL files
*/
public class ReferralRequestServiceImpl implements ReferralRequestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ReferralRequestDao dao;

  @Inject
  public ReferralRequestServiceImpl(final ReferralRequestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ReferralRequest find(String id) {
    final ReferralRequest result = dao.find(id);
    logger.info("find(ReferralRequest) - exited - return value={} result ");
    return result;
  }

  public List<ReferralRequest> select(int maxResult) {
      final List<ReferralRequest> result = dao.select(maxResult);
      logger.info("select(ReferralRequest) - exited - return value={} result ");

      return result;
  }

  public List<ReferralRequest> selectAll() {
      final List<ReferralRequest> results = dao.selectAll();
      logger.info("selectAll(ReferralRequest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ReferralRequest create(ReferralRequest bean) {
  	requireNonNull(bean);
    logger.info("create(ReferralRequest={}) - entered bean ");

    final ReferralRequest result = dao.create(bean);

    logger.info("create(ReferralRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ReferralRequest update(ReferralRequest bean) {
  	requireNonNull(bean);
    logger.info("update(ReferralRequest={}) - entered bean ");

    final ReferralRequest result = dao.update(bean);

    logger.info("update(ReferralRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ReferralRequest={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ReferralRequest) - exited - return value={} result ");
  }

  @Override
  public List<ReferralRequest> findByField(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ReferralRequest> findByDefinition(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByReplaces(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByReplaces(queryBuilder);
    logger.info("findByreplaces - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByType(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByServiceRequested(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByServiceRequested(queryBuilder);
    logger.info("findByserviceRequested - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findBySubject(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByContext(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByRequester(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByRequester(queryBuilder);
    logger.info("findByrequester - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findBySpecialty(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findBySpecialty(queryBuilder);
    logger.info("findByspecialty - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByRecipient(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByRecipient(queryBuilder);
    logger.info("findByrecipient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findBySupportingInfo(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findBySupportingInfo(queryBuilder);
    logger.info("findBysupportingInfo - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByRelevantHistory(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByRelevantHistory(queryBuilder);
    logger.info("findByrelevantHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByText(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ReferralRequest> findByMeta(QueryBuilder queryBuilder) {
  	final List<ReferralRequest> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}