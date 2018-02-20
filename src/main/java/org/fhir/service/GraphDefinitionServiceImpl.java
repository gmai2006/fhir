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
import org.fhir.pojo.GraphDefinition;
/**
* auto generated from SQL files
*/
public class GraphDefinitionServiceImpl implements GraphDefinitionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final GraphDefinitionDao dao;

  @Inject
  public GraphDefinitionServiceImpl(final GraphDefinitionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public GraphDefinition find(String id) {
    final GraphDefinition result = dao.find(id);
    logger.info("find(GraphDefinition) - exited - return value={} result ");
    return result;
  }

  public List<GraphDefinition> select(int maxResult) {
      final List<GraphDefinition> result = dao.select(maxResult);
      logger.info("select(GraphDefinition) - exited - return value={} result ");

      return result;
  }

  public List<GraphDefinition> selectAll() {
      final List<GraphDefinition> results = dao.selectAll();
      logger.info("selectAll(GraphDefinition) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public GraphDefinition create(GraphDefinition bean) {
  	requireNonNull(bean);
    logger.info("create(GraphDefinition={}) - entered bean ");

    final GraphDefinition result = dao.create(bean);

    logger.info("create(GraphDefinition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public GraphDefinition update(GraphDefinition bean) {
  	requireNonNull(bean);
    logger.info("update(GraphDefinition={}) - entered bean ");

    final GraphDefinition result = dao.update(bean);

    logger.info("update(GraphDefinition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(GraphDefinition bean) {
  	requireNonNull(bean);
    logger.info("delete(GraphDefinition={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(GraphDefinition) - exited - return value={} result ");
  }

  @Override
  public List<GraphDefinition> findByField(QueryBuilder queryBuilder) {
  	final List<GraphDefinition> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<GraphDefinition> findByContact(QueryBuilder queryBuilder) {
  	final List<GraphDefinition> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GraphDefinition> findByUseContext(QueryBuilder queryBuilder) {
  	final List<GraphDefinition> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GraphDefinition> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<GraphDefinition> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GraphDefinition> findByLink(QueryBuilder queryBuilder) {
  	final List<GraphDefinition> result = dao.findByLink(queryBuilder);
    logger.info("findBylink - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GraphDefinition> findByText(QueryBuilder queryBuilder) {
  	final List<GraphDefinition> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<GraphDefinition> findByMeta(QueryBuilder queryBuilder) {
  	final List<GraphDefinition> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}