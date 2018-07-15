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
import org.fhir.pojo.MedicationAdministration;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class MedicationAdministrationServiceImpl implements MedicationAdministrationService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MedicationAdministrationDao dao;

  @Inject
  public MedicationAdministrationServiceImpl(final MedicationAdministrationDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public MedicationAdministration find(String id) {
    final MedicationAdministration result = dao.find(id);
    logger.info("find(MedicationAdministration) - exited - return value={} result ");
    return result;
  }

  public List<MedicationAdministration> select(int maxResult) {
      final List<MedicationAdministration> result = dao.select(maxResult);
      logger.info("select(MedicationAdministration) - exited - return value={} result ");

      return result;
  }

  public List<MedicationAdministration> selectAll() {
      final List<MedicationAdministration> results = dao.selectAll();
      logger.info("selectAll(MedicationAdministration) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public MedicationAdministration create(MedicationAdministration bean) {
  	requireNonNull(bean);
    logger.info("create(MedicationAdministration={}) - entered bean ");

    final MedicationAdministration result = dao.create(bean);

    logger.info("create(MedicationAdministration) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public MedicationAdministration update(MedicationAdministration bean) {
  	requireNonNull(bean);
    logger.info("update(MedicationAdministration={}) - entered bean ");

    final MedicationAdministration result = dao.update(bean);

    logger.info("update(MedicationAdministration) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(MedicationAdministration={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MedicationAdministration) - exited - return value={} result ");
  }

  @Override
  public List<MedicationAdministration> findByField(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<MedicationAdministration> findByDefinition(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByPartOf(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByCategory(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByMedicationCodeableConcept(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByMedicationCodeableConcept(queryBuilder);
    logger.info("findBymedicationCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByMedicationReference(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByMedicationReference(queryBuilder);
    logger.info("findBymedicationReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findBySubject(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByContext(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findBySupportingInformation(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findBySupportingInformation(queryBuilder);
    logger.info("findBysupportingInformation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByPerformer(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByReasonNotGiven(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByReasonNotGiven(queryBuilder);
    logger.info("findByreasonNotGiven - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByPrescription(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByPrescription(queryBuilder);
    logger.info("findByprescription - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByDevice(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByDevice(queryBuilder);
    logger.info("findBydevice - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByDosage(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByDosage(queryBuilder);
    logger.info("findBydosage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByEventHistory(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByEventHistory(queryBuilder);
    logger.info("findByeventHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByText(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationAdministration> findByMeta(QueryBuilder queryBuilder) {
  	final List<MedicationAdministration> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}