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
import org.fhir.pojo.ResearchStudy;
/**
* auto generated from SQL files
*/
public class ResearchStudyServiceImpl implements ResearchStudyService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ResearchStudyDao dao;

  @Inject
  public ResearchStudyServiceImpl(final ResearchStudyDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ResearchStudy find(String id) {
    final ResearchStudy result = dao.find(id);
    logger.info("find(ResearchStudy) - exited - return value={} result ");
    return result;
  }

  public List<ResearchStudy> select(int maxResult) {
      final List<ResearchStudy> result = dao.select(maxResult);
      logger.info("select(ResearchStudy) - exited - return value={} result ");

      return result;
  }

  public List<ResearchStudy> selectAll() {
      final List<ResearchStudy> results = dao.selectAll();
      logger.info("selectAll(ResearchStudy) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ResearchStudy create(ResearchStudy bean) {
  	requireNonNull(bean);
    logger.info("create(ResearchStudy={}) - entered bean ");

    final ResearchStudy result = dao.create(bean);

    logger.info("create(ResearchStudy) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ResearchStudy update(ResearchStudy bean) {
  	requireNonNull(bean);
    logger.info("update(ResearchStudy={}) - entered bean ");

    final ResearchStudy result = dao.update(bean);

    logger.info("update(ResearchStudy) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ResearchStudy bean) {
  	requireNonNull(bean);
    logger.info("delete(ResearchStudy={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ResearchStudy) - exited - return value={} result ");
  }

  @Override
  public List<ResearchStudy> findByField(QueryBuilder queryBuilder) {
  	final List<ResearchStudy> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ResearchStudy> findByProtocol(QueryBuilder queryBuilder) {
  	final List<ResearchStudy> result = dao.findByProtocol(queryBuilder);
    logger.info("findByprotocol - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ResearchStudy> findBySite(QueryBuilder queryBuilder) {
  	final List<ResearchStudy> result = dao.findBySite(queryBuilder);
    logger.info("findBysite - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ResearchStudy> findBySponsor(QueryBuilder queryBuilder) {
  	final List<ResearchStudy> result = dao.findBySponsor(queryBuilder);
    logger.info("findBysponsor - exited - return value={} result ");
    return result;
  }
}