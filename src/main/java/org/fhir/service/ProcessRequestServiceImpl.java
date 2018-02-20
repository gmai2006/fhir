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
import org.fhir.pojo.ProcessRequest;
/**
* auto generated from SQL files
*/
public class ProcessRequestServiceImpl implements ProcessRequestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ProcessRequestDao dao;

  @Inject
  public ProcessRequestServiceImpl(final ProcessRequestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ProcessRequest find(String id) {
    final ProcessRequest result = dao.find(id);
    logger.info("find(ProcessRequest) - exited - return value={} result ");
    return result;
  }

  public List<ProcessRequest> select(int maxResult) {
      final List<ProcessRequest> result = dao.select(maxResult);
      logger.info("select(ProcessRequest) - exited - return value={} result ");

      return result;
  }

  public List<ProcessRequest> selectAll() {
      final List<ProcessRequest> results = dao.selectAll();
      logger.info("selectAll(ProcessRequest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ProcessRequest create(ProcessRequest bean) {
  	requireNonNull(bean);
    logger.info("create(ProcessRequest={}) - entered bean ");

    final ProcessRequest result = dao.create(bean);

    logger.info("create(ProcessRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ProcessRequest update(ProcessRequest bean) {
  	requireNonNull(bean);
    logger.info("update(ProcessRequest={}) - entered bean ");

    final ProcessRequest result = dao.update(bean);

    logger.info("update(ProcessRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ProcessRequest bean) {
  	requireNonNull(bean);
    logger.info("delete(ProcessRequest={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ProcessRequest) - exited - return value={} result ");
  }

  @Override
  public List<ProcessRequest> findByField(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ProcessRequest> findByTarget(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByTarget(queryBuilder);
    logger.info("findBytarget - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcessRequest> findByProvider(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByProvider(queryBuilder);
    logger.info("findByprovider - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcessRequest> findByOrganization(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByOrganization(queryBuilder);
    logger.info("findByorganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcessRequest> findByRequest(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByRequest(queryBuilder);
    logger.info("findByrequest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcessRequest> findByResponse(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByResponse(queryBuilder);
    logger.info("findByresponse - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcessRequest> findByItem(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByItem(queryBuilder);
    logger.info("findByitem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcessRequest> findByText(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ProcessRequest> findByMeta(QueryBuilder queryBuilder) {
  	final List<ProcessRequest> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}