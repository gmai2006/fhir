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
import org.fhir.pojo.Subscription;
/**
* auto generated from SQL files
*/
public class SubscriptionServiceImpl implements SubscriptionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final SubscriptionDao dao;

  @Inject
  public SubscriptionServiceImpl(final SubscriptionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Subscription find(String id) {
    final Subscription result = dao.find(id);
    logger.info("find(Subscription) - exited - return value={} result ");
    return result;
  }

  public List<Subscription> select(int maxResult) {
      final List<Subscription> result = dao.select(maxResult);
      logger.info("select(Subscription) - exited - return value={} result ");

      return result;
  }

  public List<Subscription> selectAll() {
      final List<Subscription> results = dao.selectAll();
      logger.info("selectAll(Subscription) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Subscription create(Subscription bean) {
  	requireNonNull(bean);
    logger.info("create(Subscription={}) - entered bean ");

    final Subscription result = dao.create(bean);

    logger.info("create(Subscription) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Subscription update(Subscription bean) {
  	requireNonNull(bean);
    logger.info("update(Subscription={}) - entered bean ");

    final Subscription result = dao.update(bean);

    logger.info("update(Subscription) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Subscription bean) {
  	requireNonNull(bean);
    logger.info("delete(Subscription={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Subscription) - exited - return value={} result ");
  }

  @Override
  public List<Subscription> findByField(QueryBuilder queryBuilder) {
  	final List<Subscription> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Subscription> findByChannel(QueryBuilder queryBuilder) {
  	final List<Subscription> result = dao.findByChannel(queryBuilder);
    logger.info("findBychannel - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Subscription> findByTag(QueryBuilder queryBuilder) {
  	final List<Subscription> result = dao.findByTag(queryBuilder);
    logger.info("findBytag - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Subscription> findByText(QueryBuilder queryBuilder) {
  	final List<Subscription> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Subscription> findByMeta(QueryBuilder queryBuilder) {
  	final List<Subscription> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}