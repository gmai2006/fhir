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
import org.fhir.pojo.StructureMap;
/**
* auto generated from SQL files
*/
public class StructureMapServiceImpl implements StructureMapService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final StructureMapDao dao;

  @Inject
  public StructureMapServiceImpl(final StructureMapDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public StructureMap find(String id) {
    final StructureMap result = dao.find(id);
    logger.info("find(StructureMap) - exited - return value={} result ");
    return result;
  }

  public List<StructureMap> select(int maxResult) {
      final List<StructureMap> result = dao.select(maxResult);
      logger.info("select(StructureMap) - exited - return value={} result ");

      return result;
  }

  public List<StructureMap> selectAll() {
      final List<StructureMap> results = dao.selectAll();
      logger.info("selectAll(StructureMap) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public StructureMap create(StructureMap bean) {
  	requireNonNull(bean);
    logger.info("create(StructureMap={}) - entered bean ");

    final StructureMap result = dao.create(bean);

    logger.info("create(StructureMap) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public StructureMap update(StructureMap bean) {
  	requireNonNull(bean);
    logger.info("update(StructureMap={}) - entered bean ");

    final StructureMap result = dao.update(bean);

    logger.info("update(StructureMap) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(StructureMap bean) {
  	requireNonNull(bean);
    logger.info("delete(StructureMap={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(StructureMap) - exited - return value={} result ");
  }

  @Override
  public List<StructureMap> findByField(QueryBuilder queryBuilder) {
  	final List<StructureMap> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<StructureMap> findByContact(QueryBuilder queryBuilder) {
  	final List<StructureMap> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<StructureMap> findByUseContext(QueryBuilder queryBuilder) {
  	final List<StructureMap> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<StructureMap> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<StructureMap> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<StructureMap> findByStructure(QueryBuilder queryBuilder) {
  	final List<StructureMap> result = dao.findByStructure(queryBuilder);
    logger.info("findBystructure - exited - return value={} result ");
    return result;
  }
  @Override
  public List<StructureMap> findByGroup(QueryBuilder queryBuilder) {
  	final List<StructureMap> result = dao.findByGroup(queryBuilder);
    logger.info("findBygroup - exited - return value={} result ");
    return result;
  }
  @Override
  public List<StructureMap> findByText(QueryBuilder queryBuilder) {
  	final List<StructureMap> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<StructureMap> findByMeta(QueryBuilder queryBuilder) {
  	final List<StructureMap> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}