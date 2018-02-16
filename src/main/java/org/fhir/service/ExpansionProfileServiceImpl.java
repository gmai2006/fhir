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
import org.fhir.pojo.ExpansionProfile;
/**
* auto generated from SQL files
*/
public class ExpansionProfileServiceImpl implements ExpansionProfileService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ExpansionProfileDao dao;

  @Inject
  public ExpansionProfileServiceImpl(final ExpansionProfileDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ExpansionProfile find(String id) {
    final ExpansionProfile result = dao.find(id);
    logger.info("find(ExpansionProfile) - exited - return value={} result ");
    return result;
  }

  public List<ExpansionProfile> select(int maxResult) {
      final List<ExpansionProfile> result = dao.select(maxResult);
      logger.info("select(ExpansionProfile) - exited - return value={} result ");

      return result;
  }

  public List<ExpansionProfile> selectAll() {
      final List<ExpansionProfile> results = dao.selectAll();
      logger.info("selectAll(ExpansionProfile) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ExpansionProfile create(ExpansionProfile bean) {
  	requireNonNull(bean);
    logger.info("create(ExpansionProfile={}) - entered bean ");

    final ExpansionProfile result = dao.create(bean);

    logger.info("create(ExpansionProfile) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ExpansionProfile update(ExpansionProfile bean) {
  	requireNonNull(bean);
    logger.info("update(ExpansionProfile={}) - entered bean ");

    final ExpansionProfile result = dao.update(bean);

    logger.info("update(ExpansionProfile) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ExpansionProfile bean) {
  	requireNonNull(bean);
    logger.info("delete(ExpansionProfile={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ExpansionProfile) - exited - return value={} result ");
  }

  @Override
  public List<ExpansionProfile> findByField(QueryBuilder queryBuilder) {
  	final List<ExpansionProfile> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

}