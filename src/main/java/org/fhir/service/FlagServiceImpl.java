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
import org.fhir.pojo.Flag;
/**
* auto generated from SQL files
*/
public class FlagServiceImpl implements FlagService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final FlagDao dao;

  @Inject
  public FlagServiceImpl(final FlagDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Flag find(String id) {
    final Flag result = dao.find(id);
    logger.info("find(Flag) - exited - return value={} result ");
    return result;
  }

  public List<Flag> select(int maxResult) {
      final List<Flag> result = dao.select(maxResult);
      logger.info("select(Flag) - exited - return value={} result ");

      return result;
  }

  public List<Flag> selectAll() {
      final List<Flag> results = dao.selectAll();
      logger.info("selectAll(Flag) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Flag create(Flag bean) {
  	requireNonNull(bean);
    logger.info("create(Flag={}) - entered bean ");

    final Flag result = dao.create(bean);

    logger.info("create(Flag) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Flag update(Flag bean) {
  	requireNonNull(bean);
    logger.info("update(Flag={}) - entered bean ");

    final Flag result = dao.update(bean);

    logger.info("update(Flag) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Flag={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Flag) - exited - return value={} result ");
  }

  @Override
  public List<Flag> findByField(QueryBuilder queryBuilder) {
  	final List<Flag> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Flag> findByCategory(QueryBuilder queryBuilder) {
  	final List<Flag> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Flag> findByCode(QueryBuilder queryBuilder) {
  	final List<Flag> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Flag> findBySubject(QueryBuilder queryBuilder) {
  	final List<Flag> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Flag> findByEncounter(QueryBuilder queryBuilder) {
  	final List<Flag> result = dao.findByEncounter(queryBuilder);
    logger.info("findByencounter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Flag> findByAuthor(QueryBuilder queryBuilder) {
  	final List<Flag> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Flag> findByText(QueryBuilder queryBuilder) {
  	final List<Flag> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Flag> findByMeta(QueryBuilder queryBuilder) {
  	final List<Flag> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}