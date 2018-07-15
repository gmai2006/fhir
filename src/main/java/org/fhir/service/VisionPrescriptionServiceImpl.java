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
import org.fhir.pojo.VisionPrescription;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class VisionPrescriptionServiceImpl implements VisionPrescriptionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final VisionPrescriptionDao dao;

  @Inject
  public VisionPrescriptionServiceImpl(final VisionPrescriptionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public VisionPrescription find(String id) {
    final VisionPrescription result = dao.find(id);
    logger.info("find(VisionPrescription) - exited - return value={} result ");
    return result;
  }

  public List<VisionPrescription> select(int maxResult) {
      final List<VisionPrescription> result = dao.select(maxResult);
      logger.info("select(VisionPrescription) - exited - return value={} result ");

      return result;
  }

  public List<VisionPrescription> selectAll() {
      final List<VisionPrescription> results = dao.selectAll();
      logger.info("selectAll(VisionPrescription) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public VisionPrescription create(VisionPrescription bean) {
  	requireNonNull(bean);
    logger.info("create(VisionPrescription={}) - entered bean ");

    final VisionPrescription result = dao.create(bean);

    logger.info("create(VisionPrescription) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public VisionPrescription update(VisionPrescription bean) {
  	requireNonNull(bean);
    logger.info("update(VisionPrescription={}) - entered bean ");

    final VisionPrescription result = dao.update(bean);

    logger.info("update(VisionPrescription) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(VisionPrescription={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(VisionPrescription) - exited - return value={} result ");
  }

  @Override
  public List<VisionPrescription> findByField(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<VisionPrescription> findByPatient(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<VisionPrescription> findByEncounter(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByEncounter(queryBuilder);
    logger.info("findByencounter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<VisionPrescription> findByPrescriber(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByPrescriber(queryBuilder);
    logger.info("findByprescriber - exited - return value={} result ");
    return result;
  }
  @Override
  public List<VisionPrescription> findByReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByReasonCodeableConcept(queryBuilder);
    logger.info("findByreasonCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<VisionPrescription> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<VisionPrescription> findByDispense(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByDispense(queryBuilder);
    logger.info("findBydispense - exited - return value={} result ");
    return result;
  }
  @Override
  public List<VisionPrescription> findByText(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<VisionPrescription> findByMeta(QueryBuilder queryBuilder) {
  	final List<VisionPrescription> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}