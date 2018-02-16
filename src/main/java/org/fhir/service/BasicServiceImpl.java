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
import org.fhir.pojo.Basic;
/**
* auto generated from SQL files
*/
public class BasicServiceImpl implements BasicService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final BasicDao dao;

  @Inject
  public BasicServiceImpl(final BasicDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Basic find(String id) {
    final Basic result = dao.find(id);
    logger.info("find(Basic) - exited - return value={} result ");
    return result;
  }

  public List<Basic> select(int maxResult) {
      final List<Basic> result = dao.select(maxResult);
      logger.info("select(Basic) - exited - return value={} result ");

      return result;
  }

  public List<Basic> selectAll() {
      final List<Basic> results = dao.selectAll();
      logger.info("selectAll(Basic) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Basic create(Basic bean) {
  	requireNonNull(bean);
    logger.info("create(Basic={}) - entered bean ");

    final Basic result = dao.create(bean);

    logger.info("create(Basic) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Basic update(Basic bean) {
  	requireNonNull(bean);
    logger.info("update(Basic={}) - entered bean ");

    final Basic result = dao.update(bean);

    logger.info("update(Basic) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Basic bean) {
  	requireNonNull(bean);
    logger.info("delete(Basic={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Basic) - exited - return value={} result ");
  }

  @Override
  public List<Basic> findByField(QueryBuilder queryBuilder) {
  	final List<Basic> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Basic> findByAuthor(QueryBuilder queryBuilder) {
  	final List<Basic> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Basic> findBySubject(QueryBuilder queryBuilder) {
  	final List<Basic> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
}