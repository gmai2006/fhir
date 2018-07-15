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
import org.fhir.pojo.RequestGroup;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class RequestGroupServiceImpl implements RequestGroupService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final RequestGroupDao dao;

  @Inject
  public RequestGroupServiceImpl(final RequestGroupDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public RequestGroup find(String id) {
    final RequestGroup result = dao.find(id);
    logger.info("find(RequestGroup) - exited - return value={} result ");
    return result;
  }

  public List<RequestGroup> select(int maxResult) {
      final List<RequestGroup> result = dao.select(maxResult);
      logger.info("select(RequestGroup) - exited - return value={} result ");

      return result;
  }

  public List<RequestGroup> selectAll() {
      final List<RequestGroup> results = dao.selectAll();
      logger.info("selectAll(RequestGroup) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public RequestGroup create(RequestGroup bean) {
  	requireNonNull(bean);
    logger.info("create(RequestGroup={}) - entered bean ");

    final RequestGroup result = dao.create(bean);

    logger.info("create(RequestGroup) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public RequestGroup update(RequestGroup bean) {
  	requireNonNull(bean);
    logger.info("update(RequestGroup={}) - entered bean ");

    final RequestGroup result = dao.update(bean);

    logger.info("update(RequestGroup) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(RequestGroup={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(RequestGroup) - exited - return value={} result ");
  }

  @Override
  public List<RequestGroup> findByField(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<RequestGroup> findByDefinition(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByReplaces(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByReplaces(queryBuilder);
    logger.info("findByreplaces - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findBySubject(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByContext(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByAuthor(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByReasonCodeableConcept(queryBuilder);
    logger.info("findByreasonCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByAction(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByAction(queryBuilder);
    logger.info("findByaction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByText(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RequestGroup> findByMeta(QueryBuilder queryBuilder) {
  	final List<RequestGroup> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}