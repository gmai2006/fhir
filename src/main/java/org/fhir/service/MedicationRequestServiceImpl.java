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
import org.fhir.pojo.MedicationRequest;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class MedicationRequestServiceImpl implements MedicationRequestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MedicationRequestDao dao;

  @Inject
  public MedicationRequestServiceImpl(final MedicationRequestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public MedicationRequest find(String id) {
    final MedicationRequest result = dao.find(id);
    logger.info("find(MedicationRequest) - exited - return value={} result ");
    return result;
  }

  public List<MedicationRequest> select(int maxResult) {
      final List<MedicationRequest> result = dao.select(maxResult);
      logger.info("select(MedicationRequest) - exited - return value={} result ");

      return result;
  }

  public List<MedicationRequest> selectAll() {
      final List<MedicationRequest> results = dao.selectAll();
      logger.info("selectAll(MedicationRequest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public MedicationRequest create(MedicationRequest bean) {
  	requireNonNull(bean);
    logger.info("create(MedicationRequest={}) - entered bean ");

    final MedicationRequest result = dao.create(bean);

    logger.info("create(MedicationRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public MedicationRequest update(MedicationRequest bean) {
  	requireNonNull(bean);
    logger.info("update(MedicationRequest={}) - entered bean ");

    final MedicationRequest result = dao.update(bean);

    logger.info("update(MedicationRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(MedicationRequest={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MedicationRequest) - exited - return value={} result ");
  }

  @Override
  public List<MedicationRequest> findByField(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<MedicationRequest> findByDefinition(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByCategory(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByMedicationCodeableConcept(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByMedicationCodeableConcept(queryBuilder);
    logger.info("findBymedicationCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByMedicationReference(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByMedicationReference(queryBuilder);
    logger.info("findBymedicationReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findBySubject(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByContext(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findBySupportingInformation(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findBySupportingInformation(queryBuilder);
    logger.info("findBysupportingInformation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByRequester(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByRequester(queryBuilder);
    logger.info("findByrequester - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByRecorder(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByRecorder(queryBuilder);
    logger.info("findByrecorder - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByDosageInstruction(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByDosageInstruction(queryBuilder);
    logger.info("findBydosageInstruction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByDispenseRequest(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByDispenseRequest(queryBuilder);
    logger.info("findBydispenseRequest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findBySubstitution(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findBySubstitution(queryBuilder);
    logger.info("findBysubstitution - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByPriorPrescription(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByPriorPrescription(queryBuilder);
    logger.info("findBypriorPrescription - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByDetectedIssue(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByDetectedIssue(queryBuilder);
    logger.info("findBydetectedIssue - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByEventHistory(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByEventHistory(queryBuilder);
    logger.info("findByeventHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByText(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationRequest> findByMeta(QueryBuilder queryBuilder) {
  	final List<MedicationRequest> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}