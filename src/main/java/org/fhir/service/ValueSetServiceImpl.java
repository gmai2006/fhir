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
import org.fhir.pojo.ValueSet;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ValueSetServiceImpl implements ValueSetService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ValueSetDao dao;

  @Inject
  public ValueSetServiceImpl(final ValueSetDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ValueSet find(String id) {
    final ValueSet result = dao.find(id);
    logger.info("find(ValueSet) - exited - return value={} result ");
    return result;
  }

  public List<ValueSet> select(int maxResult) {
      final List<ValueSet> result = dao.select(maxResult);
      logger.info("select(ValueSet) - exited - return value={} result ");

      return result;
  }

  public List<ValueSet> selectAll() {
      final List<ValueSet> results = dao.selectAll();
      logger.info("selectAll(ValueSet) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ValueSet create(ValueSet bean) {
  	requireNonNull(bean);
    logger.info("create(ValueSet={}) - entered bean ");

    final ValueSet result = dao.create(bean);

    logger.info("create(ValueSet) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ValueSet update(ValueSet bean) {
  	requireNonNull(bean);
    logger.info("update(ValueSet={}) - entered bean ");

    final ValueSet result = dao.update(bean);

    logger.info("update(ValueSet) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ValueSet={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ValueSet) - exited - return value={} result ");
  }

  @Override
  public List<ValueSet> findByField(QueryBuilder queryBuilder) {
  	final List<ValueSet> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ValueSet> findByContact(QueryBuilder queryBuilder) {
  	final List<ValueSet> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ValueSet> findByUseContext(QueryBuilder queryBuilder) {
  	final List<ValueSet> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ValueSet> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<ValueSet> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ValueSet> findByCompose(QueryBuilder queryBuilder) {
  	final List<ValueSet> result = dao.findByCompose(queryBuilder);
    logger.info("findBycompose - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ValueSet> findByExpansion(QueryBuilder queryBuilder) {
  	final List<ValueSet> result = dao.findByExpansion(queryBuilder);
    logger.info("findByexpansion - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ValueSet> findByText(QueryBuilder queryBuilder) {
  	final List<ValueSet> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ValueSet> findByMeta(QueryBuilder queryBuilder) {
  	final List<ValueSet> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}