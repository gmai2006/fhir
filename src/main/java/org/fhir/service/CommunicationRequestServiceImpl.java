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
import org.fhir.pojo.CommunicationRequest;
/**
* auto generated from SQL files
*/
public class CommunicationRequestServiceImpl implements CommunicationRequestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CommunicationRequestDao dao;

  @Inject
  public CommunicationRequestServiceImpl(final CommunicationRequestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public CommunicationRequest find(String id) {
    final CommunicationRequest result = dao.find(id);
    logger.info("find(CommunicationRequest) - exited - return value={} result ");
    return result;
  }

  public List<CommunicationRequest> select(int maxResult) {
      final List<CommunicationRequest> result = dao.select(maxResult);
      logger.info("select(CommunicationRequest) - exited - return value={} result ");

      return result;
  }

  public List<CommunicationRequest> selectAll() {
      final List<CommunicationRequest> results = dao.selectAll();
      logger.info("selectAll(CommunicationRequest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public CommunicationRequest create(CommunicationRequest bean) {
  	requireNonNull(bean);
    logger.info("create(CommunicationRequest={}) - entered bean ");

    final CommunicationRequest result = dao.create(bean);

    logger.info("create(CommunicationRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public CommunicationRequest update(CommunicationRequest bean) {
  	requireNonNull(bean);
    logger.info("update(CommunicationRequest={}) - entered bean ");

    final CommunicationRequest result = dao.update(bean);

    logger.info("update(CommunicationRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(CommunicationRequest bean) {
  	requireNonNull(bean);
    logger.info("delete(CommunicationRequest={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(CommunicationRequest) - exited - return value={} result ");
  }

  @Override
  public List<CommunicationRequest> findByField(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<CommunicationRequest> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByReplaces(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByReplaces(queryBuilder);
    logger.info("findByreplaces - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByCategory(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByMedium(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByMedium(queryBuilder);
    logger.info("findBymedium - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findBySubject(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByRecipient(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByRecipient(queryBuilder);
    logger.info("findByrecipient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByTopic(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByTopic(queryBuilder);
    logger.info("findBytopic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByContext(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByPayload(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByPayload(queryBuilder);
    logger.info("findBypayload - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findBySender(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findBySender(queryBuilder);
    logger.info("findBysender - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByRequester(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByRequester(queryBuilder);
    logger.info("findByrequester - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByText(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CommunicationRequest> findByMeta(QueryBuilder queryBuilder) {
  	final List<CommunicationRequest> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}