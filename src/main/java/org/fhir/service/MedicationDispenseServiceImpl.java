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
import org.fhir.pojo.MedicationDispense;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class MedicationDispenseServiceImpl implements MedicationDispenseService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MedicationDispenseDao dao;

  @Inject
  public MedicationDispenseServiceImpl(final MedicationDispenseDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public MedicationDispense find(String id) {
    final MedicationDispense result = dao.find(id);
    logger.info("find(MedicationDispense) - exited - return value={} result ");
    return result;
  }

  public List<MedicationDispense> select(int maxResult) {
      final List<MedicationDispense> result = dao.select(maxResult);
      logger.info("select(MedicationDispense) - exited - return value={} result ");

      return result;
  }

  public List<MedicationDispense> selectAll() {
      final List<MedicationDispense> results = dao.selectAll();
      logger.info("selectAll(MedicationDispense) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public MedicationDispense create(MedicationDispense bean) {
  	requireNonNull(bean);
    logger.info("create(MedicationDispense={}) - entered bean ");

    final MedicationDispense result = dao.create(bean);

    logger.info("create(MedicationDispense) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public MedicationDispense update(MedicationDispense bean) {
  	requireNonNull(bean);
    logger.info("update(MedicationDispense={}) - entered bean ");

    final MedicationDispense result = dao.update(bean);

    logger.info("update(MedicationDispense) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(MedicationDispense={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MedicationDispense) - exited - return value={} result ");
  }

  @Override
  public List<MedicationDispense> findByField(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<MedicationDispense> findByPartOf(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByCategory(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByMedicationCodeableConcept(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByMedicationCodeableConcept(queryBuilder);
    logger.info("findBymedicationCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByMedicationReference(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByMedicationReference(queryBuilder);
    logger.info("findBymedicationReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findBySubject(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByContext(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findBySupportingInformation(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findBySupportingInformation(queryBuilder);
    logger.info("findBysupportingInformation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByPerformer(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByAuthorizingPrescription(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByAuthorizingPrescription(queryBuilder);
    logger.info("findByauthorizingPrescription - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByType(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByQuantity(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByQuantity(queryBuilder);
    logger.info("findByquantity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByDaysSupply(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByDaysSupply(queryBuilder);
    logger.info("findBydaysSupply - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByDestination(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByDestination(queryBuilder);
    logger.info("findBydestination - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByReceiver(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByReceiver(queryBuilder);
    logger.info("findByreceiver - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByDosageInstruction(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByDosageInstruction(queryBuilder);
    logger.info("findBydosageInstruction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findBySubstitution(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findBySubstitution(queryBuilder);
    logger.info("findBysubstitution - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByDetectedIssue(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByDetectedIssue(queryBuilder);
    logger.info("findBydetectedIssue - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByNotDoneReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByNotDoneReasonCodeableConcept(queryBuilder);
    logger.info("findBynotDoneReasonCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByNotDoneReasonReference(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByNotDoneReasonReference(queryBuilder);
    logger.info("findBynotDoneReasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByEventHistory(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByEventHistory(queryBuilder);
    logger.info("findByeventHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByText(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationDispense> findByMeta(QueryBuilder queryBuilder) {
  	final List<MedicationDispense> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}