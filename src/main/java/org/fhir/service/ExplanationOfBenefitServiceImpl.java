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
  public void delete(ExplanationOfBenefit bean) {
  	requireNonNull(bean);
    logger.info("delete(ExplanationOfBenefit={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ExplanationOfBenefit) - exited - return value={} result ");
  }

  @Override
  public List<ExplanationOfBenefit> findByField(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ExplanationOfBenefit> findByClaim(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByClaim(queryBuilder);
    logger.info("findByclaim - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByEnterer(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByEnterer(queryBuilder);
    logger.info("findByenterer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByFacility(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByFacility(queryBuilder);
    logger.info("findByfacility - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByOrganization(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByOrganization(queryBuilder);
    logger.info("findByorganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByPatient(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByPayee(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByPayee(queryBuilder);
    logger.info("findBypayee - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ExplanationOfBenefit> findByProvider(QueryBuilder queryBuilder) {
  	final List<ExplanationOfBenefit> result = dao.findByProvider(queryBuilder);
    logger.info("findByprovider - exited - return value={} result ");
    return result;
  }
}