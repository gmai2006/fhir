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
import org.fhir.pojo.Encounter;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class EncounterServiceImpl implements EncounterService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final EncounterDao dao;

  @Inject
  public EncounterServiceImpl(final EncounterDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Encounter find(String id) {
    final Encounter result = dao.find(id);
    logger.info("find(Encounter) - exited - return value={} result ");
    return result;
  }

  public List<Encounter> select(int maxResult) {
      final List<Encounter> result = dao.select(maxResult);
      logger.info("select(Encounter) - exited - return value={} result ");

      return result;
  }

  public List<Encounter> selectAll() {
      final List<Encounter> results = dao.selectAll();
      logger.info("selectAll(Encounter) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Encounter create(Encounter bean) {
  	requireNonNull(bean);
    logger.info("create(Encounter={}) - entered bean ");

    final Encounter result = dao.create(bean);

    logger.info("create(Encounter) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Encounter update(Encounter bean) {
  	requireNonNull(bean);
    logger.info("update(Encounter={}) - entered bean ");

    final Encounter result = dao.update(bean);

    logger.info("update(Encounter) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Encounter={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Encounter) - exited - return value={} result ");
  }

  @Override
  public List<Encounter> findByField(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Encounter> findByStatusHistory(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByStatusHistory(queryBuilder);
    logger.info("findBystatusHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByFHIRclass(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByFHIRclass(queryBuilder);
    logger.info("findByFHIRclass - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByClassHistory(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByClassHistory(queryBuilder);
    logger.info("findByclassHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByType(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByPriority(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByPriority(queryBuilder);
    logger.info("findBypriority - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findBySubject(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByEpisodeOfCare(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByEpisodeOfCare(queryBuilder);
    logger.info("findByepisodeOfCare - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByIncomingReferral(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByIncomingReferral(queryBuilder);
    logger.info("findByincomingReferral - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByParticipant(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByParticipant(queryBuilder);
    logger.info("findByparticipant - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByAppointment(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByAppointment(queryBuilder);
    logger.info("findByappointment - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByReason(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByReason(queryBuilder);
    logger.info("findByreason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByDiagnosis(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByDiagnosis(queryBuilder);
    logger.info("findBydiagnosis - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByAccount(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByAccount(queryBuilder);
    logger.info("findByaccount - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByHospitalization(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByHospitalization(queryBuilder);
    logger.info("findByhospitalization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByLocation(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByLocation(queryBuilder);
    logger.info("findBylocation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByServiceProvider(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByServiceProvider(queryBuilder);
    logger.info("findByserviceProvider - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByPartOf(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByText(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Encounter> findByMeta(QueryBuilder queryBuilder) {
  	final List<Encounter> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}