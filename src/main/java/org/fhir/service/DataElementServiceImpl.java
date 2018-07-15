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
import org.fhir.pojo.DataElement;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class DataElementServiceImpl implements DataElementService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DataElementDao dao;

  @Inject
  public DataElementServiceImpl(final DataElementDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DataElement find(String id) {
    final DataElement result = dao.find(id);
    logger.info("find(DataElement) - exited - return value={} result ");
    return result;
  }

  public List<DataElement> select(int maxResult) {
      final List<DataElement> result = dao.select(maxResult);
      logger.info("select(DataElement) - exited - return value={} result ");

      return result;
  }

  public List<DataElement> selectAll() {
      final List<DataElement> results = dao.selectAll();
      logger.info("selectAll(DataElement) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DataElement create(DataElement bean) {
  	requireNonNull(bean);
    logger.info("create(DataElement={}) - entered bean ");

    final DataElement result = dao.create(bean);

    logger.info("create(DataElement) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DataElement update(DataElement bean) {
  	requireNonNull(bean);
    logger.info("update(DataElement={}) - entered bean ");

    final DataElement result = dao.update(bean);

    logger.info("update(DataElement) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(DataElement={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(DataElement) - exited - return value={} result ");
  }

  @Override
  public List<DataElement> findByField(QueryBuilder queryBuilder) {
  	final List<DataElement> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<DataElement> findByContact(QueryBuilder queryBuilder) {
  	final List<DataElement> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DataElement> findByUseContext(QueryBuilder queryBuilder) {
  	final List<DataElement> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DataElement> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<DataElement> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DataElement> findByMapping(QueryBuilder queryBuilder) {
  	final List<DataElement> result = dao.findByMapping(queryBuilder);
    logger.info("findBymapping - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DataElement> findByText(QueryBuilder queryBuilder) {
  	final List<DataElement> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DataElement> findByMeta(QueryBuilder queryBuilder) {
  	final List<DataElement> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}