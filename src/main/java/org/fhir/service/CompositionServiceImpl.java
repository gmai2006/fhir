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
import org.fhir.pojo.Composition;
/**
* auto generated from SQL files
*/
public class CompositionServiceImpl implements CompositionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CompositionDao dao;

  @Inject
  public CompositionServiceImpl(final CompositionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Composition find(String id) {
    final Composition result = dao.find(id);
    logger.info("find(Composition) - exited - return value={} result ");
    return result;
  }

  public List<Composition> select(int maxResult) {
      final List<Composition> result = dao.select(maxResult);
      logger.info("select(Composition) - exited - return value={} result ");

      return result;
  }

  public List<Composition> selectAll() {
      final List<Composition> results = dao.selectAll();
      logger.info("selectAll(Composition) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Composition create(Composition bean) {
  	requireNonNull(bean);
    logger.info("create(Composition={}) - entered bean ");

    final Composition result = dao.create(bean);

    logger.info("create(Composition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Composition update(Composition bean) {
  	requireNonNull(bean);
    logger.info("update(Composition={}) - entered bean ");

    final Composition result = dao.update(bean);

    logger.info("update(Composition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Composition bean) {
  	requireNonNull(bean);
    logger.info("delete(Composition={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Composition) - exited - return value={} result ");
  }

  @Override
  public List<Composition> findByField(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Composition> findByType(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByFHIRclass(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByFHIRclass(queryBuilder);
    logger.info("findByFHIRclass - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findBySubject(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByEncounter(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByEncounter(queryBuilder);
    logger.info("findByencounter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByAuthor(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByAttester(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByAttester(queryBuilder);
    logger.info("findByattester - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByCustodian(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByCustodian(queryBuilder);
    logger.info("findBycustodian - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByRelatesTo(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByRelatesTo(queryBuilder);
    logger.info("findByrelatesTo - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByEvent(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByEvent(queryBuilder);
    logger.info("findByevent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findBySection(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findBySection(queryBuilder);
    logger.info("findBysection - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByText(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Composition> findByMeta(QueryBuilder queryBuilder) {
  	final List<Composition> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}