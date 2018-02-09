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
import org.fhir.pojo.PaymentReconciliationDetail;
/**
* auto generated from SQL files
*/
public class PaymentReconciliationDetailServiceImpl implements PaymentReconciliationDetailService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final PaymentReconciliationDetailDao dao;

  @Inject
  public PaymentReconciliationDetailServiceImpl(final PaymentReconciliationDetailDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public PaymentReconciliationDetail find(String id) {
    final PaymentReconciliationDetail result = dao.find(id);
    logger.info("find(PaymentReconciliationDetail) - exited - return value={} result ");
    return result;
  }

  public List<PaymentReconciliationDetail> select(int maxResult) {
      final List<PaymentReconciliationDetail> result = dao.select(maxResult);
      logger.info("select(PaymentReconciliationDetail) - exited - return value={} result ");

      return result;
  }

  public List<PaymentReconciliationDetail> selectAll() {
      final List<PaymentReconciliationDetail> results = dao.selectAll();
      logger.info("selectAll(PaymentReconciliationDetail) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public PaymentReconciliationDetail create(PaymentReconciliationDetail bean) {
  	requireNonNull(bean);
    logger.info("create(PaymentReconciliationDetail={}) - entered bean ");

    final PaymentReconciliationDetail result = dao.create(bean);

    logger.info("create(PaymentReconciliationDetail) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public PaymentReconciliationDetail update(PaymentReconciliationDetail bean) {
  	requireNonNull(bean);
    logger.info("update(PaymentReconciliationDetail={}) - entered bean ");

    final PaymentReconciliationDetail result = dao.update(bean);

    logger.info("update(PaymentReconciliationDetail) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(PaymentReconciliationDetail bean) {
  	requireNonNull(bean);
    logger.info("delete(PaymentReconciliationDetail={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(PaymentReconciliationDetail) - exited - return value={} result ");
  }
}