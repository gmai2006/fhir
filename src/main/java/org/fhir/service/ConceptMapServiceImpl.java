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
import org.fhir.pojo.ConceptMap;
/**
* auto generated from SQL files
*/
public class ConceptMapServiceImpl implements ConceptMapService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ConceptMapDao dao;

  @Inject
  public ConceptMapServiceImpl(final ConceptMapDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ConceptMap find(String id) {
    final ConceptMap result = dao.find(id);
    logger.info("find(ConceptMap) - exited - return value={} result ");
    return result;
  }

  public List<ConceptMap> select(int maxResult) {
      final List<ConceptMap> result = dao.select(maxResult);
      logger.info("select(ConceptMap) - exited - return value={} result ");

      return result;
  }

  public List<ConceptMap> selectAll() {
      final List<ConceptMap> results = dao.selectAll();
      logger.info("selectAll(ConceptMap) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ConceptMap create(ConceptMap bean) {
  	requireNonNull(bean);
    logger.info("create(ConceptMap={}) - entered bean ");

    final ConceptMap result = dao.create(bean);

    logger.info("create(ConceptMap) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ConceptMap update(ConceptMap bean) {
  	requireNonNull(bean);
    logger.info("update(ConceptMap={}) - entered bean ");

    final ConceptMap result = dao.update(bean);

    logger.info("update(ConceptMap) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ConceptMap={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ConceptMap) - exited - return value={} result ");
  }

  @Override
  public List<ConceptMap> findByField(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ConceptMap> findByContact(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ConceptMap> findByUseContext(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ConceptMap> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ConceptMap> findBySourceReference(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findBySourceReference(queryBuilder);
    logger.info("findBysourceReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ConceptMap> findByTargetReference(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findByTargetReference(queryBuilder);
    logger.info("findBytargetReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ConceptMap> findByGroup(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findByGroup(queryBuilder);
    logger.info("findBygroup - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ConceptMap> findByText(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ConceptMap> findByMeta(QueryBuilder queryBuilder) {
  	final List<ConceptMap> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}