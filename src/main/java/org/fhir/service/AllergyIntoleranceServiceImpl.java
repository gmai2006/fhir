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
import org.fhir.pojo.AllergyIntolerance;
/**
* auto generated from SQL files
*/
public class AllergyIntoleranceServiceImpl implements AllergyIntoleranceService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final AllergyIntoleranceDao dao;

  @Inject
  public AllergyIntoleranceServiceImpl(final AllergyIntoleranceDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public AllergyIntolerance find(String id) {
    final AllergyIntolerance result = dao.find(id);
    logger.info("find(AllergyIntolerance) - exited - return value={} result ");
    return result;
  }

  public List<AllergyIntolerance> select(int maxResult) {
      final List<AllergyIntolerance> result = dao.select(maxResult);
      logger.info("select(AllergyIntolerance) - exited - return value={} result ");

      return result;
  }

  public List<AllergyIntolerance> selectAll() {
      final List<AllergyIntolerance> results = dao.selectAll();
      logger.info("selectAll(AllergyIntolerance) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public AllergyIntolerance create(AllergyIntolerance bean) {
  	requireNonNull(bean);
    logger.info("create(AllergyIntolerance={}) - entered bean ");

    final AllergyIntolerance result = dao.create(bean);

    logger.info("create(AllergyIntolerance) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public AllergyIntolerance update(AllergyIntolerance bean) {
  	requireNonNull(bean);
    logger.info("update(AllergyIntolerance={}) - entered bean ");

    final AllergyIntolerance result = dao.update(bean);

    logger.info("update(AllergyIntolerance) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(AllergyIntolerance={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(AllergyIntolerance) - exited - return value={} result ");
  }

  @Override
  public List<AllergyIntolerance> findByField(QueryBuilder queryBuilder) {
  	final List<AllergyIntolerance> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<AllergyIntolerance> findByCode(QueryBuilder queryBuilder) {
  	final List<AllergyIntolerance> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AllergyIntolerance> findByPatient(QueryBuilder queryBuilder) {
  	final List<AllergyIntolerance> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AllergyIntolerance> findByRecorder(QueryBuilder queryBuilder) {
  	final List<AllergyIntolerance> result = dao.findByRecorder(queryBuilder);
    logger.info("findByrecorder - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AllergyIntolerance> findByAsserter(QueryBuilder queryBuilder) {
  	final List<AllergyIntolerance> result = dao.findByAsserter(queryBuilder);
    logger.info("findByasserter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AllergyIntolerance> findByReaction(QueryBuilder queryBuilder) {
  	final List<AllergyIntolerance> result = dao.findByReaction(queryBuilder);
    logger.info("findByreaction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AllergyIntolerance> findByText(QueryBuilder queryBuilder) {
  	final List<AllergyIntolerance> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AllergyIntolerance> findByMeta(QueryBuilder queryBuilder) {
  	final List<AllergyIntolerance> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}