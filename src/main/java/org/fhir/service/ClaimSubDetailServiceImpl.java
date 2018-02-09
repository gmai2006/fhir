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
import org.fhir.pojo.ClaimSubDetail;
/**
* auto generated from SQL files
*/
public class ClaimSubDetailServiceImpl implements ClaimSubDetailService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ClaimSubDetailDao dao;

  @Inject
  public ClaimSubDetailServiceImpl(final ClaimSubDetailDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ClaimSubDetail find(String id) {
    final ClaimSubDetail result = dao.find(id);
    logger.info("find(ClaimSubDetail) - exited - return value={} result ");
    return result;
  }

  public List<ClaimSubDetail> select(int maxResult) {
      final List<ClaimSubDetail> result = dao.select(maxResult);
      logger.info("select(ClaimSubDetail) - exited - return value={} result ");

      return result;
  }

  public List<ClaimSubDetail> selectAll() {
      final List<ClaimSubDetail> results = dao.selectAll();
      logger.info("selectAll(ClaimSubDetail) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ClaimSubDetail create(ClaimSubDetail bean) {
  	requireNonNull(bean);
    logger.info("create(ClaimSubDetail={}) - entered bean ");

    final ClaimSubDetail result = dao.create(bean);

    logger.info("create(ClaimSubDetail) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ClaimSubDetail update(ClaimSubDetail bean) {
  	requireNonNull(bean);
    logger.info("update(ClaimSubDetail={}) - entered bean ");

    final ClaimSubDetail result = dao.update(bean);

    logger.info("update(ClaimSubDetail) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ClaimSubDetail bean) {
  	requireNonNull(bean);
    logger.info("delete(ClaimSubDetail={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ClaimSubDetail) - exited - return value={} result ");
  }
}