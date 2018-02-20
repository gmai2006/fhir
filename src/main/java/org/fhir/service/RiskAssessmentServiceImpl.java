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
import org.fhir.pojo.RiskAssessment;
/**
* auto generated from SQL files
*/
public class RiskAssessmentServiceImpl implements RiskAssessmentService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final RiskAssessmentDao dao;

  @Inject
  public RiskAssessmentServiceImpl(final RiskAssessmentDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public RiskAssessment find(String id) {
    final RiskAssessment result = dao.find(id);
    logger.info("find(RiskAssessment) - exited - return value={} result ");
    return result;
  }

  public List<RiskAssessment> select(int maxResult) {
      final List<RiskAssessment> result = dao.select(maxResult);
      logger.info("select(RiskAssessment) - exited - return value={} result ");

      return result;
  }

  public List<RiskAssessment> selectAll() {
      final List<RiskAssessment> results = dao.selectAll();
      logger.info("selectAll(RiskAssessment) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public RiskAssessment create(RiskAssessment bean) {
  	requireNonNull(bean);
    logger.info("create(RiskAssessment={}) - entered bean ");

    final RiskAssessment result = dao.create(bean);

    logger.info("create(RiskAssessment) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public RiskAssessment update(RiskAssessment bean) {
  	requireNonNull(bean);
    logger.info("update(RiskAssessment={}) - entered bean ");

    final RiskAssessment result = dao.update(bean);

    logger.info("update(RiskAssessment) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(RiskAssessment bean) {
  	requireNonNull(bean);
    logger.info("delete(RiskAssessment={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(RiskAssessment) - exited - return value={} result ");
  }

  @Override
  public List<RiskAssessment> findByField(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<RiskAssessment> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByParent(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByParent(queryBuilder);
    logger.info("findByparent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByMethod(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByMethod(queryBuilder);
    logger.info("findBymethod - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByCode(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findBySubject(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByContext(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByCondition(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByCondition(queryBuilder);
    logger.info("findBycondition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByPerformer(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByReasonCodeableConcept(queryBuilder);
    logger.info("findByreasonCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByBasis(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByBasis(queryBuilder);
    logger.info("findBybasis - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByPrediction(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByPrediction(queryBuilder);
    logger.info("findByprediction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByText(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<RiskAssessment> findByMeta(QueryBuilder queryBuilder) {
  	final List<RiskAssessment> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}