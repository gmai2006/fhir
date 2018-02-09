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
import org.fhir.pojo.CapabilityStatementSoftware;
/**
* auto generated from SQL files
*/
public class CapabilityStatementSoftwareServiceImpl implements CapabilityStatementSoftwareService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CapabilityStatementSoftwareDao dao;

  @Inject
  public CapabilityStatementSoftwareServiceImpl(final CapabilityStatementSoftwareDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public CapabilityStatementSoftware find(String id) {
    final CapabilityStatementSoftware result = dao.find(id);
    logger.info("find(CapabilityStatementSoftware) - exited - return value={} result ");
    return result;
  }

  public List<CapabilityStatementSoftware> select(int maxResult) {
      final List<CapabilityStatementSoftware> result = dao.select(maxResult);
      logger.info("select(CapabilityStatementSoftware) - exited - return value={} result ");

      return result;
  }

  public List<CapabilityStatementSoftware> selectAll() {
      final List<CapabilityStatementSoftware> results = dao.selectAll();
      logger.info("selectAll(CapabilityStatementSoftware) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public CapabilityStatementSoftware create(CapabilityStatementSoftware bean) {
  	requireNonNull(bean);
    logger.info("create(CapabilityStatementSoftware={}) - entered bean ");

    final CapabilityStatementSoftware result = dao.create(bean);

    logger.info("create(CapabilityStatementSoftware) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public CapabilityStatementSoftware update(CapabilityStatementSoftware bean) {
  	requireNonNull(bean);
    logger.info("update(CapabilityStatementSoftware={}) - entered bean ");

    final CapabilityStatementSoftware result = dao.update(bean);

    logger.info("update(CapabilityStatementSoftware) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(CapabilityStatementSoftware bean) {
  	requireNonNull(bean);
    logger.info("delete(CapabilityStatementSoftware={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(CapabilityStatementSoftware) - exited - return value={} result ");
  }
}