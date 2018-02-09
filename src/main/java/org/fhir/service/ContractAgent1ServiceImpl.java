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
import org.fhir.pojo.ContractAgent1;
/**
* auto generated from SQL files
*/
public class ContractAgent1ServiceImpl implements ContractAgent1Service {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ContractAgent1Dao dao;

  @Inject
  public ContractAgent1ServiceImpl(final ContractAgent1Dao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ContractAgent1 find(String id) {
    final ContractAgent1 result = dao.find(id);
    logger.info("find(ContractAgent1) - exited - return value={} result ");
    return result;
  }

  public List<ContractAgent1> select(int maxResult) {
      final List<ContractAgent1> result = dao.select(maxResult);
      logger.info("select(ContractAgent1) - exited - return value={} result ");

      return result;
  }

  public List<ContractAgent1> selectAll() {
      final List<ContractAgent1> results = dao.selectAll();
      logger.info("selectAll(ContractAgent1) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ContractAgent1 create(ContractAgent1 bean) {
  	requireNonNull(bean);
    logger.info("create(ContractAgent1={}) - entered bean ");

    final ContractAgent1 result = dao.create(bean);

    logger.info("create(ContractAgent1) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ContractAgent1 update(ContractAgent1 bean) {
  	requireNonNull(bean);
    logger.info("update(ContractAgent1={}) - entered bean ");

    final ContractAgent1 result = dao.update(bean);

    logger.info("update(ContractAgent1) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ContractAgent1 bean) {
  	requireNonNull(bean);
    logger.info("delete(ContractAgent1={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ContractAgent1) - exited - return value={} result ");
  }
}