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
import org.fhir.pojo.Measure;
/**
* auto generated from SQL files
*/
public class MeasureServiceImpl implements MeasureService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MeasureDao dao;

  @Inject
  public MeasureServiceImpl(final MeasureDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Measure find(String id) {
    final Measure result = dao.find(id);
    logger.info("find(Measure) - exited - return value={} result ");
    return result;
  }

  public List<Measure> select(int maxResult) {
      final List<Measure> result = dao.select(maxResult);
      logger.info("select(Measure) - exited - return value={} result ");

      return result;
  }

  public List<Measure> selectAll() {
      final List<Measure> results = dao.selectAll();
      logger.info("selectAll(Measure) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Measure create(Measure bean) {
  	requireNonNull(bean);
    logger.info("create(Measure={}) - entered bean ");

    final Measure result = dao.create(bean);

    logger.info("create(Measure) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Measure update(Measure bean) {
  	requireNonNull(bean);
    logger.info("update(Measure={}) - entered bean ");

    final Measure result = dao.update(bean);

    logger.info("update(Measure) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Measure bean) {
  	requireNonNull(bean);
    logger.info("delete(Measure={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Measure) - exited - return value={} result ");
  }

  @Override
  public List<Measure> findByField(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Measure> findByUseContext(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByTopic(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByTopic(queryBuilder);
    logger.info("findBytopic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByContributor(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByContributor(queryBuilder);
    logger.info("findBycontributor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByContact(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByRelatedArtifact(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByRelatedArtifact(queryBuilder);
    logger.info("findByrelatedArtifact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByLibrary(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByLibrary(queryBuilder);
    logger.info("findBylibrary - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByScoring(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByScoring(queryBuilder);
    logger.info("findByscoring - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByCompositeScoring(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByCompositeScoring(queryBuilder);
    logger.info("findBycompositeScoring - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByType(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByGroup(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByGroup(queryBuilder);
    logger.info("findBygroup - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findBySupplementalData(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findBySupplementalData(queryBuilder);
    logger.info("findBysupplementalData - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByText(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Measure> findByMeta(QueryBuilder queryBuilder) {
  	final List<Measure> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}