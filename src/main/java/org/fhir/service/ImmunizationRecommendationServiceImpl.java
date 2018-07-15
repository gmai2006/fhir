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
import org.fhir.pojo.ImmunizationRecommendation;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ImmunizationRecommendationServiceImpl implements ImmunizationRecommendationService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ImmunizationRecommendationDao dao;

  @Inject
  public ImmunizationRecommendationServiceImpl(final ImmunizationRecommendationDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ImmunizationRecommendation find(String id) {
    final ImmunizationRecommendation result = dao.find(id);
    logger.info("find(ImmunizationRecommendation) - exited - return value={} result ");
    return result;
  }

  public List<ImmunizationRecommendation> select(int maxResult) {
      final List<ImmunizationRecommendation> result = dao.select(maxResult);
      logger.info("select(ImmunizationRecommendation) - exited - return value={} result ");

      return result;
  }

  public List<ImmunizationRecommendation> selectAll() {
      final List<ImmunizationRecommendation> results = dao.selectAll();
      logger.info("selectAll(ImmunizationRecommendation) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ImmunizationRecommendation create(ImmunizationRecommendation bean) {
  	requireNonNull(bean);
    logger.info("create(ImmunizationRecommendation={}) - entered bean ");

    final ImmunizationRecommendation result = dao.create(bean);

    logger.info("create(ImmunizationRecommendation) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ImmunizationRecommendation update(ImmunizationRecommendation bean) {
  	requireNonNull(bean);
    logger.info("update(ImmunizationRecommendation={}) - entered bean ");

    final ImmunizationRecommendation result = dao.update(bean);

    logger.info("update(ImmunizationRecommendation) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ImmunizationRecommendation={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ImmunizationRecommendation) - exited - return value={} result ");
  }

  @Override
  public List<ImmunizationRecommendation> findByField(QueryBuilder queryBuilder) {
  	final List<ImmunizationRecommendation> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ImmunizationRecommendation> findByPatient(QueryBuilder queryBuilder) {
  	final List<ImmunizationRecommendation> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImmunizationRecommendation> findByRecommendation(QueryBuilder queryBuilder) {
  	final List<ImmunizationRecommendation> result = dao.findByRecommendation(queryBuilder);
    logger.info("findByrecommendation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImmunizationRecommendation> findByText(QueryBuilder queryBuilder) {
  	final List<ImmunizationRecommendation> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImmunizationRecommendation> findByMeta(QueryBuilder queryBuilder) {
  	final List<ImmunizationRecommendation> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}