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
import org.fhir.pojo.AuditEvent;
/**
* auto generated from SQL files
*/
public class AuditEventServiceImpl implements AuditEventService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final AuditEventDao dao;

  @Inject
  public AuditEventServiceImpl(final AuditEventDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public AuditEvent find(String id) {
    final AuditEvent result = dao.find(id);
    logger.info("find(AuditEvent) - exited - return value={} result ");
    return result;
  }

  public List<AuditEvent> select(int maxResult) {
      final List<AuditEvent> result = dao.select(maxResult);
      logger.info("select(AuditEvent) - exited - return value={} result ");

      return result;
  }

  public List<AuditEvent> selectAll() {
      final List<AuditEvent> results = dao.selectAll();
      logger.info("selectAll(AuditEvent) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public AuditEvent create(AuditEvent bean) {
  	requireNonNull(bean);
    logger.info("create(AuditEvent={}) - entered bean ");

    final AuditEvent result = dao.create(bean);

    logger.info("create(AuditEvent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public AuditEvent update(AuditEvent bean) {
  	requireNonNull(bean);
    logger.info("update(AuditEvent={}) - entered bean ");

    final AuditEvent result = dao.update(bean);

    logger.info("update(AuditEvent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(AuditEvent={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(AuditEvent) - exited - return value={} result ");
  }

  @Override
  public List<AuditEvent> findByField(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<AuditEvent> findByType(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AuditEvent> findBySubtype(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findBySubtype(queryBuilder);
    logger.info("findBysubtype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AuditEvent> findByPurposeOfEvent(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findByPurposeOfEvent(queryBuilder);
    logger.info("findBypurposeOfEvent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AuditEvent> findByAgent(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findByAgent(queryBuilder);
    logger.info("findByagent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AuditEvent> findBySource(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findBySource(queryBuilder);
    logger.info("findBysource - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AuditEvent> findByEntity(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findByEntity(queryBuilder);
    logger.info("findByentity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AuditEvent> findByText(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AuditEvent> findByMeta(QueryBuilder queryBuilder) {
  	final List<AuditEvent> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}