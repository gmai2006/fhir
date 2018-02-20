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
import org.fhir.pojo.OperationDefinition;
/**
* auto generated from SQL files
*/
public class OperationDefinitionServiceImpl implements OperationDefinitionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OperationDefinitionDao dao;

  @Inject
  public OperationDefinitionServiceImpl(final OperationDefinitionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public OperationDefinition find(String id) {
    final OperationDefinition result = dao.find(id);
    logger.info("find(OperationDefinition) - exited - return value={} result ");
    return result;
  }

  public List<OperationDefinition> select(int maxResult) {
      final List<OperationDefinition> result = dao.select(maxResult);
      logger.info("select(OperationDefinition) - exited - return value={} result ");

      return result;
  }

  public List<OperationDefinition> selectAll() {
      final List<OperationDefinition> results = dao.selectAll();
      logger.info("selectAll(OperationDefinition) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public OperationDefinition create(OperationDefinition bean) {
  	requireNonNull(bean);
    logger.info("create(OperationDefinition={}) - entered bean ");

    final OperationDefinition result = dao.create(bean);

    logger.info("create(OperationDefinition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public OperationDefinition update(OperationDefinition bean) {
  	requireNonNull(bean);
    logger.info("update(OperationDefinition={}) - entered bean ");

    final OperationDefinition result = dao.update(bean);

    logger.info("update(OperationDefinition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(OperationDefinition bean) {
  	requireNonNull(bean);
    logger.info("delete(OperationDefinition={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(OperationDefinition) - exited - return value={} result ");
  }

  @Override
  public List<OperationDefinition> findByField(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<OperationDefinition> findByContact(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<OperationDefinition> findByUseContext(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<OperationDefinition> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<OperationDefinition> findByBase(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByBase(queryBuilder);
    logger.info("findBybase - exited - return value={} result ");
    return result;
  }
  @Override
  public List<OperationDefinition> findByParameter(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByParameter(queryBuilder);
    logger.info("findByparameter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<OperationDefinition> findByOverload(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByOverload(queryBuilder);
    logger.info("findByoverload - exited - return value={} result ");
    return result;
  }
  @Override
  public List<OperationDefinition> findByText(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<OperationDefinition> findByMeta(QueryBuilder queryBuilder) {
  	final List<OperationDefinition> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}