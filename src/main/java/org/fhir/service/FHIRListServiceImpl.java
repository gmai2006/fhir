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
import org.fhir.pojo.FHIRList;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class FHIRListServiceImpl implements FHIRListService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final FHIRListDao dao;

  @Inject
  public FHIRListServiceImpl(final FHIRListDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public FHIRList find(String id) {
    final FHIRList result = dao.find(id);
    logger.info("find(FHIRList) - exited - return value={} result ");
    return result;
  }

  public List<FHIRList> select(int maxResult) {
      final List<FHIRList> result = dao.select(maxResult);
      logger.info("select(FHIRList) - exited - return value={} result ");

      return result;
  }

  public List<FHIRList> selectAll() {
      final List<FHIRList> results = dao.selectAll();
      logger.info("selectAll(FHIRList) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public FHIRList create(FHIRList bean) {
  	requireNonNull(bean);
    logger.info("create(FHIRList={}) - entered bean ");

    final FHIRList result = dao.create(bean);

    logger.info("create(FHIRList) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public FHIRList update(FHIRList bean) {
  	requireNonNull(bean);
    logger.info("update(FHIRList={}) - entered bean ");

    final FHIRList result = dao.update(bean);

    logger.info("update(FHIRList) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(FHIRList={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(FHIRList) - exited - return value={} result ");
  }

  @Override
  public List<FHIRList> findByField(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<FHIRList> findByCode(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FHIRList> findBySubject(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FHIRList> findByEncounter(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findByEncounter(queryBuilder);
    logger.info("findByencounter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FHIRList> findBySource(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findBySource(queryBuilder);
    logger.info("findBysource - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FHIRList> findByOrderedBy(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findByOrderedBy(queryBuilder);
    logger.info("findByorderedBy - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FHIRList> findByEntry(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findByEntry(queryBuilder);
    logger.info("findByentry - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FHIRList> findByEmptyReason(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findByEmptyReason(queryBuilder);
    logger.info("findByemptyReason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FHIRList> findByText(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<FHIRList> findByMeta(QueryBuilder queryBuilder) {
  	final List<FHIRList> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}