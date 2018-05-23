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
import org.fhir.pojo.MedicationStatement;
/**
* auto generated from SQL files
*/
public class MedicationStatementServiceImpl implements MedicationStatementService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MedicationStatementDao dao;

  @Inject
  public MedicationStatementServiceImpl(final MedicationStatementDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public MedicationStatement find(String id) {
    final MedicationStatement result = dao.find(id);
    logger.info("find(MedicationStatement) - exited - return value={} result ");
    return result;
  }

  public List<MedicationStatement> select(int maxResult) {
      final List<MedicationStatement> result = dao.select(maxResult);
      logger.info("select(MedicationStatement) - exited - return value={} result ");

      return result;
  }

  public List<MedicationStatement> selectAll() {
      final List<MedicationStatement> results = dao.selectAll();
      logger.info("selectAll(MedicationStatement) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public MedicationStatement create(MedicationStatement bean) {
  	requireNonNull(bean);
    logger.info("create(MedicationStatement={}) - entered bean ");

    final MedicationStatement result = dao.create(bean);

    logger.info("create(MedicationStatement) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public MedicationStatement update(MedicationStatement bean) {
  	requireNonNull(bean);
    logger.info("update(MedicationStatement={}) - entered bean ");

    final MedicationStatement result = dao.update(bean);

    logger.info("update(MedicationStatement) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(MedicationStatement={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(MedicationStatement) - exited - return value={} result ");
  }

  @Override
  public List<MedicationStatement> findByField(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<MedicationStatement> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByPartOf(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByContext(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByCategory(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByMedicationCodeableConcept(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByMedicationCodeableConcept(queryBuilder);
    logger.info("findBymedicationCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByMedicationReference(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByMedicationReference(queryBuilder);
    logger.info("findBymedicationReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByInformationSource(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByInformationSource(queryBuilder);
    logger.info("findByinformationSource - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findBySubject(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByDerivedFrom(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByDerivedFrom(queryBuilder);
    logger.info("findByderivedFrom - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByReasonNotTaken(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByReasonNotTaken(queryBuilder);
    logger.info("findByreasonNotTaken - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByDosage(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByDosage(queryBuilder);
    logger.info("findBydosage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByText(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<MedicationStatement> findByMeta(QueryBuilder queryBuilder) {
  	final List<MedicationStatement> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}