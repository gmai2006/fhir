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
import org.fhir.pojo.Patient;
/**
* auto generated from SQL files
*/
public class PatientServiceImpl implements PatientService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final PatientDao dao;

  @Inject
  public PatientServiceImpl(final PatientDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Patient find(String id) {
    final Patient result = dao.find(id);
    logger.info("find(Patient) - exited - return value={} result ");
    return result;
  }

  public List<Patient> select(int maxResult) {
      final List<Patient> result = dao.select(maxResult);
      logger.info("select(Patient) - exited - return value={} result ");

      return result;
  }

  public List<Patient> selectAll() {
      final List<Patient> results = dao.selectAll();
      logger.info("selectAll(Patient) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Patient create(Patient bean) {
  	requireNonNull(bean);
    logger.info("create(Patient={}) - entered bean ");

    final Patient result = dao.create(bean);

    logger.info("create(Patient) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Patient update(Patient bean) {
  	requireNonNull(bean);
    logger.info("update(Patient={}) - entered bean ");

    final Patient result = dao.update(bean);

    logger.info("update(Patient) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Patient={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Patient) - exited - return value={} result ");
  }

  @Override
  public List<Patient> findByField(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Patient> findByAddress(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByAddress(queryBuilder);
    logger.info("findByaddress - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByMaritalStatus(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByMaritalStatus(queryBuilder);
    logger.info("findBymaritalStatus - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByContact(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByAnimal(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByAnimal(queryBuilder);
    logger.info("findByanimal - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByCommunication(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByCommunication(queryBuilder);
    logger.info("findBycommunication - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByGeneralPractitioner(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByGeneralPractitioner(queryBuilder);
    logger.info("findBygeneralPractitioner - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByManagingOrganization(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByManagingOrganization(queryBuilder);
    logger.info("findBymanagingOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByLink(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByLink(queryBuilder);
    logger.info("findBylink - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByText(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Patient> findByMeta(QueryBuilder queryBuilder) {
  	final List<Patient> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}