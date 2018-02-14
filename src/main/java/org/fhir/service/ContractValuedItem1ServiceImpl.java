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
import org.fhir.pojo.ContractValuedItem1;
/**
* auto generated from SQL files
*/
public class ContractValuedItem1ServiceImpl implements ContractValuedItem1Service {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ContractValuedItem1Dao dao;

  @Inject
  public ContractValuedItem1ServiceImpl(final ContractValuedItem1Dao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ContractValuedItem1 find(String id) {
    final ContractValuedItem1 result = dao.find(id);
    logger.info("find(ContractValuedItem1) - exited - return value={} result ");
    return result;
  }

  public List<ContractValuedItem1> select(int maxResult) {
      final List<ContractValuedItem1> result = dao.select(maxResult);
      logger.info("select(ContractValuedItem1) - exited - return value={} result ");

      return result;
  }

  public List<ContractValuedItem1> selectAll() {
      final List<ContractValuedItem1> results = dao.selectAll();
      logger.info("selectAll(ContractValuedItem1) - exited - return value={} result ");
      return results;
  }


  @Override
  @Transactional
  public void delete(ContractValuedItem1 bean) {
  	requireNonNull(bean);
    logger.info("delete(ContractValuedItem1={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ContractValuedItem1) - exited - return value={} result ");
  }
}