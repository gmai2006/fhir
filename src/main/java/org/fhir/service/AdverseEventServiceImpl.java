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
import org.fhir.pojo.AdverseEvent;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class AdverseEventServiceImpl implements AdverseEventService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final AdverseEventDao dao;

  @Inject
  public AdverseEventServiceImpl(final AdverseEventDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public AdverseEvent find(String id) {
    final AdverseEvent result = dao.find(id);
    logger.info("find(AdverseEvent) - exited - return value={} result ");
    return result;
  }

  public List<AdverseEvent> select(int maxResult) {
      final List<AdverseEvent> result = dao.select(maxResult);
      logger.info("select(AdverseEvent) - exited - return value={} result ");

      return result;
  }

  public List<AdverseEvent> selectAll() {
      final List<AdverseEvent> results = dao.selectAll();
      logger.info("selectAll(AdverseEvent) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public AdverseEvent create(AdverseEvent bean) {
  	requireNonNull(bean);
    logger.info("create(AdverseEvent={}) - entered bean ");

    final AdverseEvent result = dao.create(bean);

    logger.info("create(AdverseEvent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public AdverseEvent update(AdverseEvent bean) {
  	requireNonNull(bean);
    logger.info("update(AdverseEvent={}) - entered bean ");

    final AdverseEvent result = dao.update(bean);

    logger.info("update(AdverseEvent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(AdverseEvent={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(AdverseEvent) - exited - return value={} result ");
  }

  @Override
  public List<AdverseEvent> findByField(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<AdverseEvent> findByType(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findBySubject(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByReaction(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByReaction(queryBuilder);
    logger.info("findByreaction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByLocation(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByLocation(queryBuilder);
    logger.info("findBylocation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findBySeriousness(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findBySeriousness(queryBuilder);
    logger.info("findByseriousness - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByOutcome(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByOutcome(queryBuilder);
    logger.info("findByoutcome - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByRecorder(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByRecorder(queryBuilder);
    logger.info("findByrecorder - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByEventParticipant(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByEventParticipant(queryBuilder);
    logger.info("findByeventParticipant - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findBySuspectEntity(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findBySuspectEntity(queryBuilder);
    logger.info("findBysuspectEntity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findBySubjectMedicalHistory(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findBySubjectMedicalHistory(queryBuilder);
    logger.info("findBysubjectMedicalHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByReferenceDocument(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByReferenceDocument(queryBuilder);
    logger.info("findByreferenceDocument - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByStudy(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByStudy(queryBuilder);
    logger.info("findBystudy - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByText(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<AdverseEvent> findByMeta(QueryBuilder queryBuilder) {
  	final List<AdverseEvent> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}