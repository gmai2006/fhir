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
import org.fhir.pojo.Linkage;
/**
* auto generated from SQL files
*/
public class LinkageServiceImpl implements LinkageService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final LinkageDao dao;

  @Inject
  public LinkageServiceImpl(final LinkageDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Linkage find(String id) {
    final Linkage result = dao.find(id);
    logger.info("find(Linkage) - exited - return value={} result ");
    return result;
  }

  public List<Linkage> select(int maxResult) {
      final List<Linkage> result = dao.select(maxResult);
      logger.info("select(Linkage) - exited - return value={} result ");

      return result;
  }

  public List<Linkage> selectAll() {
      final List<Linkage> results = dao.selectAll();
      logger.info("selectAll(Linkage) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Linkage create(Linkage bean) {
  	requireNonNull(bean);
    logger.info("create(Linkage={}) - entered bean ");

    final Linkage result = dao.create(bean);

    logger.info("create(Linkage) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Linkage update(Linkage bean) {
  	requireNonNull(bean);
    logger.info("update(Linkage={}) - entered bean ");

    final Linkage result = dao.update(bean);

    logger.info("update(Linkage) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Linkage={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Linkage) - exited - return value={} result ");
  }

  @Override
  public List<Linkage> findByField(QueryBuilder queryBuilder) {
  	final List<Linkage> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Linkage> findByAuthor(QueryBuilder queryBuilder) {
  	final List<Linkage> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Linkage> findByItem(QueryBuilder queryBuilder) {
  	final List<Linkage> result = dao.findByItem(queryBuilder);
    logger.info("findByitem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Linkage> findByText(QueryBuilder queryBuilder) {
  	final List<Linkage> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Linkage> findByMeta(QueryBuilder queryBuilder) {
  	final List<Linkage> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}