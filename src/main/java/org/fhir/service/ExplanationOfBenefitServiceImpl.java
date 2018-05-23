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
import org.fhir.pojo.ExplanationOfBenefit;
/**
* auto generated from SQL files
*/
public class ExplanationOfBenefitServiceImpl implements ExplanationOfBenefitService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ExplanationOfBenefitDao dao;

  @Inject
  public ExplanationOfBenefitServiceImpl(final ExplanationOfBenefitDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ExplanationOfBenefit find(String id) {
    final ExplanationOfBenefit result = dao.find(id);
    logger.info("find(ExplanationOfBenefit) - exited - return value={} result ");
    return result;
  }

  public List<ExplanationOfBenefit> select(int maxResult) {
      final List<ExplanationOfBenefit> result = dao.select(maxResult);
      logger.info("select(ExplanationOfBenefit) - exited - return value={} result ");

      return result;
  }

  public List<ExplanationOfBenefit> selectAll() {
      final List<ExplanationOfBenefit> results = dao.selectAll();
      logger.info("selectAll(ExplanationOfBenefit) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ExplanationOfBenefit create(ExplanationOfBenefit bean) {
  	requireNonNull(bean);
    logger.info("create(ExplanationOfBenefit={}) - entered bean ");

    final ExplanationOfBenefit result = dao.create(bean);

    logger.info("create(ExplanationOfBenefit) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ExplanationOfBenefit update(ExplanationOfBenefit bean) {
  	requireNonNull(bean);
    logger.info("update(ExplanationOfBenefit={}) - entered bean ");

    final ExplanationOfBenefit result = dao.update(bean);

    logger.info("update(ExplanationOfBenefit) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ExplanationOfBenefit={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ExplanationOfBenefit) - exited - return value={} result ");
  }

  @Override
  public List<ExplanationOfBenefit> findByField(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ExplanationOfBenefit> findByType(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findBySubType(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findBySubType(queryBuilder);
    logger.info("findBysubType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByPatient(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByEnterer(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByEnterer(queryBuilder);
    logger.info("findByenterer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByInsurer(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByInsurer(queryBuilder);
    logger.info("findByinsurer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByProvider(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByProvider(queryBuilder);
    logger.info("findByprovider - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByOrganization(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByOrganization(queryBuilder);
    logger.info("findByorganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByReferral(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByReferral(queryBuilder);
    logger.info("findByreferral - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByFacility(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByFacility(queryBuilder);
    logger.info("findByfacility - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByClaim(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByClaim(queryBuilder);
    logger.info("findByclaim - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByClaimResponse(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByClaimResponse(queryBuilder);
    logger.info("findByclaimResponse - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByOutcome(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByOutcome(queryBuilder);
    logger.info("findByoutcome - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByRelated(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByRelated(queryBuilder);
    logger.info("findByrelated - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByPrescription(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByPrescription(queryBuilder);
    logger.info("findByprescription - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByOriginalPrescription(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByOriginalPrescription(queryBuilder);
    logger.info("findByoriginalPrescription - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByPayee(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByPayee(queryBuilder);
    logger.info("findBypayee - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByInformation(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByInformation(queryBuilder);
    logger.info("findByinformation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByCareTeam(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByCareTeam(queryBuilder);
    logger.info("findBycareTeam - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByDiagnosis(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByDiagnosis(queryBuilder);
    logger.info("findBydiagnosis - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByProcedure(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByProcedure(queryBuilder);
    logger.info("findByprocedure - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByInsurance(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByInsurance(queryBuilder);
    logger.info("findByinsurance - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByAccident(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByAccident(queryBuilder);
    logger.info("findByaccident - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByItem(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByItem(queryBuilder);
    logger.info("findByitem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByAddItem(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByAddItem(queryBuilder);
    logger.info("findByaddItem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByTotalCost(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByTotalCost(queryBuilder);
    logger.info("findBytotalCost - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByUnallocDeductable(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByUnallocDeductable(queryBuilder);
    logger.info("findByunallocDeductable - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByTotalBenefit(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByTotalBenefit(queryBuilder);
    logger.info("findBytotalBenefit - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByPayment(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByPayment(queryBuilder);
    logger.info("findBypayment - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByForm(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByForm(queryBuilder);
    logger.info("findByform - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByProcessNote(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByProcessNote(queryBuilder);
    logger.info("findByprocessNote - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByBenefitBalance(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByBenefitBalance(queryBuilder);
    logger.info("findBybenefitBalance - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByText(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByMeta(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}