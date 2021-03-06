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
import org.fhir.pojo.CarePlan;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class CarePlanServiceImpl implements CarePlanService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CarePlanDao dao;

  @Inject
  public CarePlanServiceImpl(final CarePlanDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public CarePlan find(String id) {
    final CarePlan result = dao.find(id);
    logger.info("find(CarePlan) - exited - return value={} result ");
    return result;
  }

  public List<CarePlan> select(int maxResult) {
      final List<CarePlan> result = dao.select(maxResult);
      logger.info("select(CarePlan) - exited - return value={} result ");

      return result;
  }

  public List<CarePlan> selectAll() {
      final List<CarePlan> results = dao.selectAll();
      logger.info("selectAll(CarePlan) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public CarePlan create(CarePlan bean) {
  	requireNonNull(bean);
    logger.info("create(CarePlan={}) - entered bean ");

    final CarePlan result = dao.create(bean);

    logger.info("create(CarePlan) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public CarePlan update(CarePlan bean) {
  	requireNonNull(bean);
    logger.info("update(CarePlan={}) - entered bean ");

    final CarePlan result = dao.update(bean);

    logger.info("update(CarePlan) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(CarePlan={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(CarePlan) - exited - return value={} result ");
  }

  @Override
  public List<CarePlan> findByField(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<CarePlan> findByDefinition(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByDefinition(queryBuilder);
    logger.info("findBydefinition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByReplaces(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByReplaces(queryBuilder);
    logger.info("findByreplaces - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByPartOf(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByCategory(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findBySubject(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByContext(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByAuthor(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByCareTeam(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByCareTeam(queryBuilder);
    logger.info("findBycareTeam - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByAddresses(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByAddresses(queryBuilder);
    logger.info("findByaddresses - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findBySupportingInfo(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findBySupportingInfo(queryBuilder);
    logger.info("findBysupportingInfo - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByGoal(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByGoal(queryBuilder);
    logger.info("findBygoal - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByActivity(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByActivity(queryBuilder);
    logger.info("findByactivity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByText(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CarePlan> findByMeta(QueryBuilder queryBuilder) {
  	final List<CarePlan> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}