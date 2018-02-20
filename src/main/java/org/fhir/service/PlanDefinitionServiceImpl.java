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
import org.fhir.pojo.PlanDefinition;
/**
* auto generated from SQL files
*/
public class PlanDefinitionServiceImpl implements PlanDefinitionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final PlanDefinitionDao dao;

  @Inject
  public PlanDefinitionServiceImpl(final PlanDefinitionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public PlanDefinition find(String id) {
    final PlanDefinition result = dao.find(id);
    logger.info("find(PlanDefinition) - exited - return value={} result ");
    return result;
  }

  public List<PlanDefinition> select(int maxResult) {
      final List<PlanDefinition> result = dao.select(maxResult);
      logger.info("select(PlanDefinition) - exited - return value={} result ");

      return result;
  }

  public List<PlanDefinition> selectAll() {
      final List<PlanDefinition> results = dao.selectAll();
      logger.info("selectAll(PlanDefinition) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public PlanDefinition create(PlanDefinition bean) {
  	requireNonNull(bean);
    logger.info("create(PlanDefinition={}) - entered bean ");

    final PlanDefinition result = dao.create(bean);

    logger.info("create(PlanDefinition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public PlanDefinition update(PlanDefinition bean) {
  	requireNonNull(bean);
    logger.info("update(PlanDefinition={}) - entered bean ");

    final PlanDefinition result = dao.update(bean);

    logger.info("update(PlanDefinition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(PlanDefinition bean) {
  	requireNonNull(bean);
    logger.info("delete(PlanDefinition={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(PlanDefinition) - exited - return value={} result ");
  }

  @Override
  public List<PlanDefinition> findByField(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<PlanDefinition> findByType(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByUseContext(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByTopic(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByTopic(queryBuilder);
    logger.info("findBytopic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByContributor(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByContributor(queryBuilder);
    logger.info("findBycontributor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByContact(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByRelatedArtifact(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByRelatedArtifact(queryBuilder);
    logger.info("findByrelatedArtifact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByLibrary(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByLibrary(queryBuilder);
    logger.info("findBylibrary - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByGoal(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByGoal(queryBuilder);
    logger.info("findBygoal - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByAction(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByAction(queryBuilder);
    logger.info("findByaction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByText(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PlanDefinition> findByMeta(QueryBuilder queryBuilder) {
  	final List<PlanDefinition> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}