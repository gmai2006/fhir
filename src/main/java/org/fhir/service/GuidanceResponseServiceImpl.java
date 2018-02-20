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
import org.fhir.pojo.GuidanceResponse;
/**
* auto generated from SQL files
*/
public class GuidanceResponseServiceImpl implements GuidanceResponseService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final GuidanceResponseDao dao;

  @Inject
  public GuidanceResponseServiceImpl(final GuidanceResponseDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public GuidanceResponse find(String id) {
    final GuidanceResponse result = dao.find(id);
    logger.info("find(GuidanceResponse) - exited - return value={} result ");
    return result;
  }

  public List<GuidanceResponse> select(int maxResult) {
      final List<GuidanceResponse> result = dao.select(maxResult);
      logger.info("select(GuidanceResponse) - exited - return value={} result ");

      return result;
  }

  public List<GuidanceResponse> selectAll() {
      final List<GuidanceResponse> results = dao.selectAll();
      logger.info("selectAll(GuidanceResponse) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public GuidanceResponse create(GuidanceResponse bean) {
  	requireNonNull(bean);
    logger.info("create(GuidanceResponse={}) - entered bean ");

    final GuidanceResponse result = dao.create(bean);

    logger.info("create(GuidanceResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public GuidanceResponse update(GuidanceResponse bean) {
  	requireNonNull(bean);
    logger.info("update(GuidanceResponse={}) - entered bean ");

    final GuidanceResponse result = dao.update(bean);

    logger.info("update(GuidanceResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(GuidanceResponse bean) {
  	requireNonNull(bean);
    logger.info("delete(GuidanceResponse={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(GuidanceResponse) - exited - return value={} result ");
  }

  @Override
  public List<GuidanceResponse> findByField(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<GuidanceResponse> findByModule(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByModule(queryBuilder);
    logger.info("findBymodule - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findBySubject(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByContext(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByPerformer(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByReasonCodeableConcept(queryBuilder);
    logger.info("findByreasonCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByEvaluationMessage(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByEvaluationMessage(queryBuilder);
    logger.info("findByevaluationMessage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByOutputParameters(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByOutputParameters(queryBuilder);
    logger.info("findByoutputParameters - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByResult(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByResult(queryBuilder);
    logger.info("findByresult - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByDataRequirement(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByDataRequirement(queryBuilder);
    logger.info("findBydataRequirement - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByText(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GuidanceResponse> findByMeta(QueryBuilder queryBuilder) {
  	final List<GuidanceResponse> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}