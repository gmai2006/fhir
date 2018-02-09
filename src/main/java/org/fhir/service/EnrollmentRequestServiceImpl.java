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
import org.fhir.pojo.EnrollmentRequest;
/**
* auto generated from SQL files
*/
public class EnrollmentRequestServiceImpl implements EnrollmentRequestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final EnrollmentRequestDao dao;

  @Inject
  public EnrollmentRequestServiceImpl(final EnrollmentRequestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public EnrollmentRequest find(String id) {
    final EnrollmentRequest result = dao.find(id);
    logger.info("find(EnrollmentRequest) - exited - return value={} result ");
    return result;
  }

  public List<EnrollmentRequest> select(int maxResult) {
      final List<EnrollmentRequest> result = dao.select(maxResult);
      logger.info("select(EnrollmentRequest) - exited - return value={} result ");

      return result;
  }

  public List<EnrollmentRequest> selectAll() {
      final List<EnrollmentRequest> results = dao.selectAll();
      logger.info("selectAll(EnrollmentRequest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public EnrollmentRequest create(EnrollmentRequest bean) {
  	requireNonNull(bean);
    logger.info("create(EnrollmentRequest={}) - entered bean ");

    final EnrollmentRequest result = dao.create(bean);

    logger.info("create(EnrollmentRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public EnrollmentRequest update(EnrollmentRequest bean) {
  	requireNonNull(bean);
    logger.info("update(EnrollmentRequest={}) - entered bean ");

    final EnrollmentRequest result = dao.update(bean);

    logger.info("update(EnrollmentRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(EnrollmentRequest bean) {
  	requireNonNull(bean);
    logger.info("delete(EnrollmentRequest={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(EnrollmentRequest) - exited - return value={} result ");
  }
}