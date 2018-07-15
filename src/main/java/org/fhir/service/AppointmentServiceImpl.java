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
import org.fhir.pojo.Appointment;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class AppointmentServiceImpl implements AppointmentService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final AppointmentDao dao;

  @Inject
  public AppointmentServiceImpl(final AppointmentDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Appointment find(String id) {
    final Appointment result = dao.find(id);
    logger.info("find(Appointment) - exited - return value={} result ");
    return result;
  }

  public List<Appointment> select(int maxResult) {
      final List<Appointment> result = dao.select(maxResult);
      logger.info("select(Appointment) - exited - return value={} result ");

      return result;
  }

  public List<Appointment> selectAll() {
      final List<Appointment> results = dao.selectAll();
      logger.info("selectAll(Appointment) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Appointment create(Appointment bean) {
  	requireNonNull(bean);
    logger.info("create(Appointment={}) - entered bean ");

    final Appointment result = dao.create(bean);

    logger.info("create(Appointment) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Appointment update(Appointment bean) {
  	requireNonNull(bean);
    logger.info("update(Appointment={}) - entered bean ");

    final Appointment result = dao.update(bean);

    logger.info("update(Appointment) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Appointment={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Appointment) - exited - return value={} result ");
  }

  @Override
  public List<Appointment> findByField(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Appointment> findByServiceCategory(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByServiceCategory(queryBuilder);
    logger.info("findByserviceCategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findByServiceType(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByServiceType(queryBuilder);
    logger.info("findByserviceType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findBySpecialty(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findBySpecialty(queryBuilder);
    logger.info("findByspecialty - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findByAppointmentType(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByAppointmentType(queryBuilder);
    logger.info("findByappointmentType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findByReason(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByReason(queryBuilder);
    logger.info("findByreason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findByIndication(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByIndication(queryBuilder);
    logger.info("findByindication - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findBySupportingInformation(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findBySupportingInformation(queryBuilder);
    logger.info("findBysupportingInformation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findBySlot(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findBySlot(queryBuilder);
    logger.info("findByslot - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findByIncomingReferral(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByIncomingReferral(queryBuilder);
    logger.info("findByincomingReferral - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findByParticipant(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByParticipant(queryBuilder);
    logger.info("findByparticipant - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findByText(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Appointment> findByMeta(QueryBuilder queryBuilder) {
  	final List<Appointment> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}