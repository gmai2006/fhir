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
import org.fhir.pojo.PaymentReconciliation;
/**
* auto generated from SQL files
*/
public class PaymentReconciliationServiceImpl implements PaymentReconciliationService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final PaymentReconciliationDao dao;

  @Inject
  public PaymentReconciliationServiceImpl(final PaymentReconciliationDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public PaymentReconciliation find(String id) {
    final PaymentReconciliation result = dao.find(id);
    logger.info("find(PaymentReconciliation) - exited - return value={} result ");
    return result;
  }

  public List<PaymentReconciliation> select(int maxResult) {
      final List<PaymentReconciliation> result = dao.select(maxResult);
      logger.info("select(PaymentReconciliation) - exited - return value={} result ");

      return result;
  }

  public List<PaymentReconciliation> selectAll() {
      final List<PaymentReconciliation> results = dao.selectAll();
      logger.info("selectAll(PaymentReconciliation) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public PaymentReconciliation create(PaymentReconciliation bean) {
  	requireNonNull(bean);
    logger.info("create(PaymentReconciliation={}) - entered bean ");

    final PaymentReconciliation result = dao.create(bean);

    logger.info("create(PaymentReconciliation) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public PaymentReconciliation update(PaymentReconciliation bean) {
  	requireNonNull(bean);
    logger.info("update(PaymentReconciliation={}) - entered bean ");

    final PaymentReconciliation result = dao.update(bean);

    logger.info("update(PaymentReconciliation) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(PaymentReconciliation bean) {
  	requireNonNull(bean);
    logger.info("delete(PaymentReconciliation={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(PaymentReconciliation) - exited - return value={} result ");
  }

  @Override
  public List<PaymentReconciliation> findByField(QueryBuilder queryBuilder) {
  	final List<PaymentReconciliation> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<PaymentReconciliation> findByOrganization(QueryBuilder queryBuilder) {
  	final List<PaymentReconciliation> result = dao.findByOrganization(queryBuilder);
    logger.info("findByorganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<PaymentReconciliation> findByRequest(QueryBuilder queryBuilder) {
  	final List<PaymentReconciliation> result = dao.findByRequest(queryBuilder);
    logger.info("findByrequest - exited - return value={} result ");
    return result;
  }
}