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
import org.fhir.pojo.Substance;
/**
* auto generated from SQL files
*/
public class SubstanceServiceImpl implements SubstanceService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final SubstanceDao dao;

  @Inject
  public SubstanceServiceImpl(final SubstanceDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Substance find(String id) {
    final Substance result = dao.find(id);
    logger.info("find(Substance) - exited - return value={} result ");
    return result;
  }

  public List<Substance> select(int maxResult) {
      final List<Substance> result = dao.select(maxResult);
      logger.info("select(Substance) - exited - return value={} result ");

      return result;
  }

  public List<Substance> selectAll() {
      final List<Substance> results = dao.selectAll();
      logger.info("selectAll(Substance) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Substance create(Substance bean) {
  	requireNonNull(bean);
    logger.info("create(Substance={}) - entered bean ");

    final Substance result = dao.create(bean);

    logger.info("create(Substance) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Substance update(Substance bean) {
  	requireNonNull(bean);
    logger.info("update(Substance={}) - entered bean ");

    final Substance result = dao.update(bean);

    logger.info("update(Substance) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Substance bean) {
  	requireNonNull(bean);
    logger.info("delete(Substance={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Substance) - exited - return value={} result ");
  }

  @Override
  public List<Substance> findByField(QueryBuilder queryBuilder) {
  	final List<Substance> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Substance> findByCategory(QueryBuilder queryBuilder) {
  	final List<Substance> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Substance> findByCode(QueryBuilder queryBuilder) {
  	final List<Substance> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Substance> findByInstance(QueryBuilder queryBuilder) {
  	final List<Substance> result = dao.findByInstance(queryBuilder);
    logger.info("findByinstance - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Substance> findByIngredient(QueryBuilder queryBuilder) {
  	final List<Substance> result = dao.findByIngredient(queryBuilder);
    logger.info("findByingredient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Substance> findByText(QueryBuilder queryBuilder) {
  	final List<Substance> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Substance> findByMeta(QueryBuilder queryBuilder) {
  	final List<Substance> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}