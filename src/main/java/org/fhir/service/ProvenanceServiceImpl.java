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
import org.fhir.pojo.Provenance;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ProvenanceServiceImpl implements ProvenanceService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ProvenanceDao dao;

  @Inject
  public ProvenanceServiceImpl(final ProvenanceDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Provenance find(String id) {
    final Provenance result = dao.find(id);
    logger.info("find(Provenance) - exited - return value={} result ");
    return result;
  }

  public List<Provenance> select(int maxResult) {
      final List<Provenance> result = dao.select(maxResult);
      logger.info("select(Provenance) - exited - return value={} result ");

      return result;
  }

  public List<Provenance> selectAll() {
      final List<Provenance> results = dao.selectAll();
      logger.info("selectAll(Provenance) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Provenance create(Provenance bean) {
  	requireNonNull(bean);
    logger.info("create(Provenance={}) - entered bean ");

    final Provenance result = dao.create(bean);

    logger.info("create(Provenance) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Provenance update(Provenance bean) {
  	requireNonNull(bean);
    logger.info("update(Provenance={}) - entered bean ");

    final Provenance result = dao.update(bean);

    logger.info("update(Provenance) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Provenance={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Provenance) - exited - return value={} result ");
  }

  @Override
  public List<Provenance> findByField(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Provenance> findByTarget(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByTarget(queryBuilder);
    logger.info("findBytarget - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Provenance> findByLocation(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByLocation(queryBuilder);
    logger.info("findBylocation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Provenance> findByReason(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByReason(queryBuilder);
    logger.info("findByreason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Provenance> findByActivity(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByActivity(queryBuilder);
    logger.info("findByactivity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Provenance> findByAgent(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByAgent(queryBuilder);
    logger.info("findByagent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Provenance> findByEntity(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByEntity(queryBuilder);
    logger.info("findByentity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Provenance> findByText(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Provenance> findByMeta(QueryBuilder queryBuilder) {
  	final List<Provenance> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}