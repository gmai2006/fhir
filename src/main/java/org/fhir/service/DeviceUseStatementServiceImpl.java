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
import org.fhir.pojo.DeviceUseStatement;
/**
* auto generated from SQL files
*/
public class DeviceUseStatementServiceImpl implements DeviceUseStatementService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DeviceUseStatementDao dao;

  @Inject
  public DeviceUseStatementServiceImpl(final DeviceUseStatementDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DeviceUseStatement find(String id) {
    final DeviceUseStatement result = dao.find(id);
    logger.info("find(DeviceUseStatement) - exited - return value={} result ");
    return result;
  }

  public List<DeviceUseStatement> select(int maxResult) {
      final List<DeviceUseStatement> result = dao.select(maxResult);
      logger.info("select(DeviceUseStatement) - exited - return value={} result ");

      return result;
  }

  public List<DeviceUseStatement> selectAll() {
      final List<DeviceUseStatement> results = dao.selectAll();
      logger.info("selectAll(DeviceUseStatement) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DeviceUseStatement create(DeviceUseStatement bean) {
  	requireNonNull(bean);
    logger.info("create(DeviceUseStatement={}) - entered bean ");

    final DeviceUseStatement result = dao.create(bean);

    logger.info("create(DeviceUseStatement) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DeviceUseStatement update(DeviceUseStatement bean) {
  	requireNonNull(bean);
    logger.info("update(DeviceUseStatement={}) - entered bean ");

    final DeviceUseStatement result = dao.update(bean);

    logger.info("update(DeviceUseStatement) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(DeviceUseStatement bean) {
  	requireNonNull(bean);
    logger.info("delete(DeviceUseStatement={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(DeviceUseStatement) - exited - return value={} result ");
  }

  @Override
  public List<DeviceUseStatement> findByField(QueryBuilder queryBuilder) {
  	final List<DeviceUseStatement> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<DeviceUseStatement> findBySubject(QueryBuilder queryBuilder) {
  	final List<DeviceUseStatement> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceUseStatement> findBySource(QueryBuilder queryBuilder) {
  	final List<DeviceUseStatement> result = dao.findBySource(queryBuilder);
    logger.info("findBysource - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceUseStatement> findByDevice(QueryBuilder queryBuilder) {
  	final List<DeviceUseStatement> result = dao.findByDevice(queryBuilder);
    logger.info("findBydevice - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceUseStatement> findByIndication(QueryBuilder queryBuilder) {
  	final List<DeviceUseStatement> result = dao.findByIndication(queryBuilder);
    logger.info("findByindication - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceUseStatement> findByBodySite(QueryBuilder queryBuilder) {
  	final List<DeviceUseStatement> result = dao.findByBodySite(queryBuilder);
    logger.info("findBybodySite - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceUseStatement> findByText(QueryBuilder queryBuilder) {
  	final List<DeviceUseStatement> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceUseStatement> findByMeta(QueryBuilder queryBuilder) {
  	final List<DeviceUseStatement> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}