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
import org.fhir.pojo.ClaimAccident;
/**
* auto generated from SQL files
*/
public class ClaimAccidentServiceImpl implements ClaimAccidentService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ClaimAccidentDao dao;

  @Inject
  public ClaimAccidentServiceImpl(final ClaimAccidentDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ClaimAccident find(String id) {
    final ClaimAccident result = dao.find(id);
    logger.info("find(ClaimAccident) - exited - return value={} result ");
    return result;
  }

  public List<ClaimAccident> select(int maxResult) {
      final List<ClaimAccident> result = dao.select(maxResult);
      logger.info("select(ClaimAccident) - exited - return value={} result ");

      return result;
  }

  public List<ClaimAccident> selectAll() {
      final List<ClaimAccident> results = dao.selectAll();
      logger.info("selectAll(ClaimAccident) - exited - return value={} result ");
      return results;
  }


  @Override
  @Transactional
  public void delete(ClaimAccident bean) {
  	requireNonNull(bean);
    logger.info("delete(ClaimAccident={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ClaimAccident) - exited - return value={} result ");
  }
}