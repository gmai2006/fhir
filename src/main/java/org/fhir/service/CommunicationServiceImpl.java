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
import org.fhir.pojo.Communication;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class CommunicationServiceImpl implements CommunicationService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CommunicationDao dao;

  @Inject
  public CommunicationServiceImpl(final CommunicationDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Communication find(String id) {
    final Communication result = dao.find(id);
    logger.info("find(Communication) - exited - return value={} result ");
    return result;
  }

  public List<Communication> select(int maxResult) {
      final List<Communication> result = dao.select(maxResult);
      logger.info("select(Communication) - exited - return value={} result ");

      return result;
  }

  public List<Communication> selectAll() {
      final List<Communication> results = dao.selectAll();
      logger.info("selectAll(Communication) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Communication create(Communication bean) {
  	requireNonNull(bean);
    logger.info("create(Communication={}) - entered bean ");

    final Communication result = dao.create(bean);

    logger.info("create(Communication) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Communication update(Communication bean) {
  	requireNonNull(bean);
    logger.info("update(Communication={}) - entered bean ");

    final Communication result = dao.update(bean);

    logger.info("update(Communication) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Communication={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Communication) - exited - return value={} result ");
  }

  @Override
  public List<Communication> findByField(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Communication> findByDefinition(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByPartOf(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByNotDoneReason(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByNotDoneReason(queryBuilder);
    logger.info("findBynotDoneReason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByCategory(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByMedium(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByMedium(queryBuilder);
    logger.info("findBymedium - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findBySubject(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByRecipient(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByRecipient(queryBuilder);
    logger.info("findByrecipient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByTopic(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByTopic(queryBuilder);
    logger.info("findBytopic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByContext(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findBySender(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findBySender(queryBuilder);
    logger.info("findBysender - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByPayload(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByPayload(queryBuilder);
    logger.info("findBypayload - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByText(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Communication> findByMeta(QueryBuilder queryBuilder) {
  	final List<Communication> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}