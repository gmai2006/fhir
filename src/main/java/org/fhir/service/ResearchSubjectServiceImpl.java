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
import org.fhir.pojo.ResearchSubject;
/**
* auto generated from SQL files
*/
public class ResearchSubjectServiceImpl implements ResearchSubjectService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ResearchSubjectDao dao;

  @Inject
  public ResearchSubjectServiceImpl(final ResearchSubjectDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ResearchSubject find(String id) {
    final ResearchSubject result = dao.find(id);
    logger.info("find(ResearchSubject) - exited - return value={} result ");
    return result;
  }

  public List<ResearchSubject> select(int maxResult) {
      final List<ResearchSubject> result = dao.select(maxResult);
      logger.info("select(ResearchSubject) - exited - return value={} result ");

      return result;
  }

  public List<ResearchSubject> selectAll() {
      final List<ResearchSubject> results = dao.selectAll();
      logger.info("selectAll(ResearchSubject) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ResearchSubject create(ResearchSubject bean) {
  	requireNonNull(bean);
    logger.info("create(ResearchSubject={}) - entered bean ");

    final ResearchSubject result = dao.create(bean);

    logger.info("create(ResearchSubject) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ResearchSubject update(ResearchSubject bean) {
  	requireNonNull(bean);
    logger.info("update(ResearchSubject={}) - entered bean ");

    final ResearchSubject result = dao.update(bean);

    logger.info("update(ResearchSubject) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ResearchSubject bean) {
  	requireNonNull(bean);
    logger.info("delete(ResearchSubject={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ResearchSubject) - exited - return value={} result ");
  }

  @Override
  public List<ResearchSubject> findByField(QueryBuilder queryBuilder) {
  	final List<ResearchSubject> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ResearchSubject> findByStudy(QueryBuilder queryBuilder) {
  	final List<ResearchSubject> result = dao.findByStudy(queryBuilder);
    logger.info("findBystudy - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ResearchSubject> findByIndividual(QueryBuilder queryBuilder) {
  	final List<ResearchSubject> result = dao.findByIndividual(queryBuilder);
    logger.info("findByindividual - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ResearchSubject> findByConsent(QueryBuilder queryBuilder) {
  	final List<ResearchSubject> result = dao.findByConsent(queryBuilder);
    logger.info("findByconsent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ResearchSubject> findByText(QueryBuilder queryBuilder) {
  	final List<ResearchSubject> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ResearchSubject> findByMeta(QueryBuilder queryBuilder) {
  	final List<ResearchSubject> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}