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
import org.fhir.pojo.AppointmentResponse;
/**
* auto generated from SQL files
*/
public class AppointmentResponseServiceImpl implements AppointmentResponseService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final AppointmentResponseDao dao;

  @Inject
  public AppointmentResponseServiceImpl(final AppointmentResponseDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public AppointmentResponse find(String id) {
    final AppointmentResponse result = dao.find(id);
    logger.info("find(AppointmentResponse) - exited - return value={} result ");
    return result;
  }

  public List<AppointmentResponse> select(int maxResult) {
      final List<AppointmentResponse> result = dao.select(maxResult);
      logger.info("select(AppointmentResponse) - exited - return value={} result ");

      return result;
  }

  public List<AppointmentResponse> selectAll() {
      final List<AppointmentResponse> results = dao.selectAll();
      logger.info("selectAll(AppointmentResponse) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public AppointmentResponse create(AppointmentResponse bean) {
  	requireNonNull(bean);
    logger.info("create(AppointmentResponse={}) - entered bean ");

    final AppointmentResponse result = dao.create(bean);

    logger.info("create(AppointmentResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public AppointmentResponse update(AppointmentResponse bean) {
  	requireNonNull(bean);
    logger.info("update(AppointmentResponse={}) - entered bean ");

    final AppointmentResponse result = dao.update(bean);

    logger.info("update(AppointmentResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(AppointmentResponse bean) {
  	requireNonNull(bean);
    logger.info("delete(AppointmentResponse={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(AppointmentResponse) - exited - return value={} result ");
  }

  @Override
  public List<AppointmentResponse> findByField(QueryBuilder queryBuilder) {
  	final List<AppointmentResponse> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<AppointmentResponse> findByAppointment(QueryBuilder queryBuilder) {
  	final List<AppointmentResponse> result = dao.findByAppointment(queryBuilder);
    logger.info("findByappointment - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AppointmentResponse> findByParticipantType(QueryBuilder queryBuilder) {
  	final List<AppointmentResponse> result = dao.findByParticipantType(queryBuilder);
    logger.info("findByparticipantType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AppointmentResponse> findByActor(QueryBuilder queryBuilder) {
  	final List<AppointmentResponse> result = dao.findByActor(queryBuilder);
    logger.info("findByactor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AppointmentResponse> findByText(QueryBuilder queryBuilder) {
  	final List<AppointmentResponse> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AppointmentResponse> findByMeta(QueryBuilder queryBuilder) {
  	final List<AppointmentResponse> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}