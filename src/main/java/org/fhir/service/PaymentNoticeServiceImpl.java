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
import org.fhir.pojo.PaymentNotice;
/**
* auto generated from SQL files
*/
public class PaymentNoticeServiceImpl implements PaymentNoticeService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final PaymentNoticeDao dao;

  @Inject
  public PaymentNoticeServiceImpl(final PaymentNoticeDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public PaymentNotice find(String id) {
    final PaymentNotice result = dao.find(id);
    logger.info("find(PaymentNotice) - exited - return value={} result ");
    return result;
  }

  public List<PaymentNotice> select(int maxResult) {
      final List<PaymentNotice> result = dao.select(maxResult);
      logger.info("select(PaymentNotice) - exited - return value={} result ");

      return result;
  }

  public List<PaymentNotice> selectAll() {
      final List<PaymentNotice> results = dao.selectAll();
      logger.info("selectAll(PaymentNotice) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public PaymentNotice create(PaymentNotice bean) {
  	requireNonNull(bean);
    logger.info("create(PaymentNotice={}) - entered bean ");

    final PaymentNotice result = dao.create(bean);

    logger.info("create(PaymentNotice) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public PaymentNotice update(PaymentNotice bean) {
  	requireNonNull(bean);
    logger.info("update(PaymentNotice={}) - entered bean ");

    final PaymentNotice result = dao.update(bean);

    logger.info("update(PaymentNotice) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(PaymentNotice bean) {
  	requireNonNull(bean);
    logger.info("delete(PaymentNotice={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(PaymentNotice) - exited - return value={} result ");
  }

  @Override
  public List<PaymentNotice> findByField(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<PaymentNotice> findByRequest(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByRequest(queryBuilder);
    logger.info("findByrequest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PaymentNotice> findByResponse(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByResponse(queryBuilder);
    logger.info("findByresponse - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PaymentNotice> findByTarget(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByTarget(queryBuilder);
    logger.info("findBytarget - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PaymentNotice> findByProvider(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByProvider(queryBuilder);
    logger.info("findByprovider - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PaymentNotice> findByOrganization(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByOrganization(queryBuilder);
    logger.info("findByorganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PaymentNotice> findByPaymentStatus(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByPaymentStatus(queryBuilder);
    logger.info("findBypaymentStatus - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PaymentNotice> findByText(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PaymentNotice> findByMeta(QueryBuilder queryBuilder) {
  	final List<PaymentNotice> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}