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
import org.fhir.pojo.ClinicalImpression;
/**
* auto generated from SQL files
*/
public class ClinicalImpressionServiceImpl implements ClinicalImpressionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ClinicalImpressionDao dao;

  @Inject
  public ClinicalImpressionServiceImpl(final ClinicalImpressionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ClinicalImpression find(String id) {
    final ClinicalImpression result = dao.find(id);
    logger.info("find(ClinicalImpression) - exited - return value={} result ");
    return result;
  }

  public List<ClinicalImpression> select(int maxResult) {
      final List<ClinicalImpression> result = dao.select(maxResult);
      logger.info("select(ClinicalImpression) - exited - return value={} result ");

      return result;
  }

  public List<ClinicalImpression> selectAll() {
      final List<ClinicalImpression> results = dao.selectAll();
      logger.info("selectAll(ClinicalImpression) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ClinicalImpression create(ClinicalImpression bean) {
  	requireNonNull(bean);
    logger.info("create(ClinicalImpression={}) - entered bean ");

    final ClinicalImpression result = dao.create(bean);

    logger.info("create(ClinicalImpression) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ClinicalImpression update(ClinicalImpression bean) {
  	requireNonNull(bean);
    logger.info("update(ClinicalImpression={}) - entered bean ");

    final ClinicalImpression result = dao.update(bean);

    logger.info("update(ClinicalImpression) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ClinicalImpression={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ClinicalImpression) - exited - return value={} result ");
  }

  @Override
  public List<ClinicalImpression> findByField(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ClinicalImpression> findByCode(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findBySubject(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByContext(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByAssessor(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByAssessor(queryBuilder);
    logger.info("findByassessor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByPrevious(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByPrevious(queryBuilder);
    logger.info("findByprevious - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByProblem(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByProblem(queryBuilder);
    logger.info("findByproblem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByInvestigation(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByInvestigation(queryBuilder);
    logger.info("findByinvestigation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByFinding(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByFinding(queryBuilder);
    logger.info("findByfinding - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByPrognosisCodeableConcept(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByPrognosisCodeableConcept(queryBuilder);
    logger.info("findByprognosisCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByPrognosisReference(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByPrognosisReference(queryBuilder);
    logger.info("findByprognosisReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByAction(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByAction(queryBuilder);
    logger.info("findByaction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByText(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ClinicalImpression> findByMeta(QueryBuilder queryBuilder) {
  	final List<ClinicalImpression> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}