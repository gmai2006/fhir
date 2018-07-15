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
import org.fhir.pojo.Schedule;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ScheduleServiceImpl implements ScheduleService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ScheduleDao dao;

  @Inject
  public ScheduleServiceImpl(final ScheduleDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Schedule find(String id) {
    final Schedule result = dao.find(id);
    logger.info("find(Schedule) - exited - return value={} result ");
    return result;
  }

  public List<Schedule> select(int maxResult) {
      final List<Schedule> result = dao.select(maxResult);
      logger.info("select(Schedule) - exited - return value={} result ");

      return result;
  }

  public List<Schedule> selectAll() {
      final List<Schedule> results = dao.selectAll();
      logger.info("selectAll(Schedule) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Schedule create(Schedule bean) {
  	requireNonNull(bean);
    logger.info("create(Schedule={}) - entered bean ");

    final Schedule result = dao.create(bean);

    logger.info("create(Schedule) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Schedule update(Schedule bean) {
  	requireNonNull(bean);
    logger.info("update(Schedule={}) - entered bean ");

    final Schedule result = dao.update(bean);

    logger.info("update(Schedule) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Schedule={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Schedule) - exited - return value={} result ");
  }

  @Override
  public List<Schedule> findByField(QueryBuilder queryBuilder) {
  	final List<Schedule> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Schedule> findByServiceCategory(QueryBuilder queryBuilder) {
  	final List<Schedule> result = dao.findByServiceCategory(queryBuilder);
    logger.info("findByserviceCategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Schedule> findByServiceType(QueryBuilder queryBuilder) {
  	final List<Schedule> result = dao.findByServiceType(queryBuilder);
    logger.info("findByserviceType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Schedule> findBySpecialty(QueryBuilder queryBuilder) {
  	final List<Schedule> result = dao.findBySpecialty(queryBuilder);
    logger.info("findByspecialty - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Schedule> findByActor(QueryBuilder queryBuilder) {
  	final List<Schedule> result = dao.findByActor(queryBuilder);
    logger.info("findByactor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Schedule> findByText(QueryBuilder queryBuilder) {
  	final List<Schedule> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Schedule> findByMeta(QueryBuilder queryBuilder) {
  	final List<Schedule> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}