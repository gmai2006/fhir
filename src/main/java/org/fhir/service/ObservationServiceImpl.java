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
import org.fhir.pojo.Observation;
/**
* auto generated from SQL files
*/
public class ObservationServiceImpl implements ObservationService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ObservationDao dao;

  @Inject
  public ObservationServiceImpl(final ObservationDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Observation find(String id) {
    final Observation result = dao.find(id);
    logger.info("find(Observation) - exited - return value={} result ");
    return result;
  }

  public List<Observation> select(int maxResult) {
      final List<Observation> result = dao.select(maxResult);
      logger.info("select(Observation) - exited - return value={} result ");

      return result;
  }

  public List<Observation> selectAll() {
      final List<Observation> results = dao.selectAll();
      logger.info("selectAll(Observation) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Observation create(Observation bean) {
  	requireNonNull(bean);
    logger.info("create(Observation={}) - entered bean ");

    final Observation result = dao.create(bean);

    logger.info("create(Observation) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Observation update(Observation bean) {
  	requireNonNull(bean);
    logger.info("update(Observation={}) - entered bean ");

    final Observation result = dao.update(bean);

    logger.info("update(Observation) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Observation bean) {
  	requireNonNull(bean);
    logger.info("delete(Observation={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Observation) - exited - return value={} result ");
  }

  @Override
  public List<Observation> findByField(QueryBuilder queryBuilder) {
  	final List<Observation> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Observation> findByContext(QueryBuilder queryBuilder) {
  	final List<Observation> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Observation> findByDevice(QueryBuilder queryBuilder) {
  	final List<Observation> result = dao.findByDevice(queryBuilder);
    logger.info("findBydevice - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Observation> findByPerformer(QueryBuilder queryBuilder) {
  	final List<Observation> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Observation> findByRelated(QueryBuilder queryBuilder) {
  	final List<Observation> result = dao.findByRelated(queryBuilder);
    logger.info("findByrelated - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Observation> findBySpecimen(QueryBuilder queryBuilder) {
  	final List<Observation> result = dao.findBySpecimen(queryBuilder);
    logger.info("findByspecimen - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Observation> findBySubject(QueryBuilder queryBuilder) {
  	final List<Observation> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
}