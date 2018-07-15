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
import org.fhir.pojo.MessageHeader;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class MessageHeaderServiceImpl implements MessageHeaderService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MessageHeaderDao dao;

  @Inject
  public MessageHeaderServiceImpl(final MessageHeaderDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public MessageHeader find(String id) {
    final MessageHeader result = dao.find(id);
    logger.info("find(MessageHeader) - exited - return value={} result ");
    return result;
  }

  public List<MessageHeader> select(int maxResult) {
      final List<MessageHeader> result = dao.select(maxResult);
      logger.info("select(MessageHeader) - exited - return value={} result ");

      return result;
  }

  public List<MessageHeader> selectAll() {
      final List<MessageHeader> results = dao.selectAll();
      logger.info("selectAll(MessageHeader) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public MessageHeader create(MessageHeader bean) {
  	requireNonNull(bean);
    logger.info("create(MessageHeader={}) - entered bean ");

    final MessageHeader result = dao.create(bean);

    logger.info("create(MessageHeader) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public MessageHeader update(MessageHeader bean) {
  	requireNonNull(bean);
    logger.info("update(MessageHeader={}) - entered bean ");

    final MessageHeader result = dao.update(bean);

    logger.info("update(MessageHeader) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(MessageHeader={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MessageHeader) - exited - return value={} result ");
  }

  @Override
  public List<MessageHeader> findByField(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<MessageHeader> findByEvent(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByEvent(queryBuilder);
    logger.info("findByevent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByDestination(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByDestination(queryBuilder);
    logger.info("findBydestination - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByReceiver(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByReceiver(queryBuilder);
    logger.info("findByreceiver - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findBySender(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findBySender(queryBuilder);
    logger.info("findBysender - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByEnterer(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByEnterer(queryBuilder);
    logger.info("findByenterer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByAuthor(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findBySource(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findBySource(queryBuilder);
    logger.info("findBysource - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByResponsible(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByResponsible(queryBuilder);
    logger.info("findByresponsible - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByReason(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByReason(queryBuilder);
    logger.info("findByreason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByResponse(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByResponse(queryBuilder);
    logger.info("findByresponse - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByFocus(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByFocus(queryBuilder);
    logger.info("findByfocus - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByText(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MessageHeader> findByMeta(QueryBuilder queryBuilder) {
  	final List<MessageHeader> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}