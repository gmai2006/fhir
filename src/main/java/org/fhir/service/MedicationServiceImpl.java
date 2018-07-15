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
import org.fhir.pojo.Medication;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class MedicationServiceImpl implements MedicationService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MedicationDao dao;

  @Inject
  public MedicationServiceImpl(final MedicationDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Medication find(String id) {
    final Medication result = dao.find(id);
    logger.info("find(Medication) - exited - return value={} result ");
    return result;
  }

  public List<Medication> select(int maxResult) {
      final List<Medication> result = dao.select(maxResult);
      logger.info("select(Medication) - exited - return value={} result ");

      return result;
  }

  public List<Medication> selectAll() {
      final List<Medication> results = dao.selectAll();
      logger.info("selectAll(Medication) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Medication create(Medication bean) {
  	requireNonNull(bean);
    logger.info("create(Medication={}) - entered bean ");

    final Medication result = dao.create(bean);

    logger.info("create(Medication) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Medication update(Medication bean) {
  	requireNonNull(bean);
    logger.info("update(Medication={}) - entered bean ");

    final Medication result = dao.update(bean);

    logger.info("update(Medication) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Medication={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Medication) - exited - return value={} result ");
  }

  @Override
  public List<Medication> findByField(QueryBuilder queryBuilder) {
  	final List<Medication> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Medication> findByCode(QueryBuilder queryBuilder) {
  	final List<Medication> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Medication> findByManufacturer(QueryBuilder queryBuilder) {
  	final List<Medication> result = dao.findByManufacturer(queryBuilder);
    logger.info("findBymanufacturer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Medication> findByForm(QueryBuilder queryBuilder) {
  	final List<Medication> result = dao.findByForm(queryBuilder);
    logger.info("findByform - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Medication> findByIngredient(QueryBuilder queryBuilder) {
  	final List<Medication> result = dao.findByIngredient(queryBuilder);
    logger.info("findByingredient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Medication> findByFHIRpackage(QueryBuilder queryBuilder) {
  	final List<Medication> result = dao.findByFHIRpackage(queryBuilder);
    logger.info("findByFHIRpackage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Medication> findByText(QueryBuilder queryBuilder) {
  	final List<Medication> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Medication> findByMeta(QueryBuilder queryBuilder) {
  	final List<Medication> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}