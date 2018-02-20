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
import org.fhir.pojo.Bundle;
/**
* auto generated from SQL files
*/
public class BundleServiceImpl implements BundleService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final BundleDao dao;

  @Inject
  public BundleServiceImpl(final BundleDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Bundle find(String id) {
    final Bundle result = dao.find(id);
    logger.info("find(Bundle) - exited - return value={} result ");
    return result;
  }

  public List<Bundle> select(int maxResult) {
      final List<Bundle> result = dao.select(maxResult);
      logger.info("select(Bundle) - exited - return value={} result ");

      return result;
  }

  public List<Bundle> selectAll() {
      final List<Bundle> results = dao.selectAll();
      logger.info("selectAll(Bundle) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Bundle create(Bundle bean) {
  	requireNonNull(bean);
    logger.info("create(Bundle={}) - entered bean ");

    final Bundle result = dao.create(bean);

    logger.info("create(Bundle) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Bundle update(Bundle bean) {
  	requireNonNull(bean);
    logger.info("update(Bundle={}) - entered bean ");

    final Bundle result = dao.update(bean);

    logger.info("update(Bundle) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Bundle bean) {
  	requireNonNull(bean);
    logger.info("delete(Bundle={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Bundle) - exited - return value={} result ");
  }

  @Override
  public List<Bundle> findByField(QueryBuilder queryBuilder) {
  	final List<Bundle> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Bundle> findByLink(QueryBuilder queryBuilder) {
  	final List<Bundle> result = dao.findByLink(queryBuilder);
    logger.info("findBylink - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Bundle> findByEntry(QueryBuilder queryBuilder) {
  	final List<Bundle> result = dao.findByEntry(queryBuilder);
    logger.info("findByentry - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Bundle> findByMeta(QueryBuilder queryBuilder) {
  	final List<Bundle> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}