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
import org.fhir.pojo.ImagingStudy;
/**
* auto generated from SQL files
*/
public class ImagingStudyServiceImpl implements ImagingStudyService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ImagingStudyDao dao;

  @Inject
  public ImagingStudyServiceImpl(final ImagingStudyDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ImagingStudy find(String id) {
    final ImagingStudy result = dao.find(id);
    logger.info("find(ImagingStudy) - exited - return value={} result ");
    return result;
  }

  public List<ImagingStudy> select(int maxResult) {
      final List<ImagingStudy> result = dao.select(maxResult);
      logger.info("select(ImagingStudy) - exited - return value={} result ");

      return result;
  }

  public List<ImagingStudy> selectAll() {
      final List<ImagingStudy> results = dao.selectAll();
      logger.info("selectAll(ImagingStudy) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ImagingStudy create(ImagingStudy bean) {
  	requireNonNull(bean);
    logger.info("create(ImagingStudy={}) - entered bean ");

    final ImagingStudy result = dao.create(bean);

    logger.info("create(ImagingStudy) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ImagingStudy update(ImagingStudy bean) {
  	requireNonNull(bean);
    logger.info("update(ImagingStudy={}) - entered bean ");

    final ImagingStudy result = dao.update(bean);

    logger.info("update(ImagingStudy) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ImagingStudy={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ImagingStudy) - exited - return value={} result ");
  }

  @Override
  public List<ImagingStudy> findByField(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ImagingStudy> findByModalityList(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByModalityList(queryBuilder);
    logger.info("findBymodalityList - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByPatient(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByContext(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByReferrer(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByReferrer(queryBuilder);
    logger.info("findByreferrer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByInterpreter(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByInterpreter(queryBuilder);
    logger.info("findByinterpreter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByEndpoint(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByEndpoint(queryBuilder);
    logger.info("findByendpoint - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByProcedureReference(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByProcedureReference(queryBuilder);
    logger.info("findByprocedureReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByProcedureCode(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByProcedureCode(queryBuilder);
    logger.info("findByprocedureCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByReason(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByReason(queryBuilder);
    logger.info("findByreason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findBySeries(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findBySeries(queryBuilder);
    logger.info("findByseries - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByText(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ImagingStudy> findByMeta(QueryBuilder queryBuilder) {
  	final List<ImagingStudy> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}