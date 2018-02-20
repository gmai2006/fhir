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
import org.fhir.pojo.Device;
/**
* auto generated from SQL files
*/
public class DeviceServiceImpl implements DeviceService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DeviceDao dao;

  @Inject
  public DeviceServiceImpl(final DeviceDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Device find(String id) {
    final Device result = dao.find(id);
    logger.info("find(Device) - exited - return value={} result ");
    return result;
  }

  public List<Device> select(int maxResult) {
      final List<Device> result = dao.select(maxResult);
      logger.info("select(Device) - exited - return value={} result ");

      return result;
  }

  public List<Device> selectAll() {
      final List<Device> results = dao.selectAll();
      logger.info("selectAll(Device) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Device create(Device bean) {
  	requireNonNull(bean);
    logger.info("create(Device={}) - entered bean ");

    final Device result = dao.create(bean);

    logger.info("create(Device) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Device update(Device bean) {
  	requireNonNull(bean);
    logger.info("update(Device={}) - entered bean ");

    final Device result = dao.update(bean);

    logger.info("update(Device) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Device bean) {
  	requireNonNull(bean);
    logger.info("delete(Device={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Device) - exited - return value={} result ");
  }

  @Override
  public List<Device> findByField(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Device> findByUdi(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findByUdi(queryBuilder);
    logger.info("findByudi - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Device> findByType(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Device> findByPatient(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Device> findByOwner(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findByOwner(queryBuilder);
    logger.info("findByowner - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Device> findByLocation(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findByLocation(queryBuilder);
    logger.info("findBylocation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Device> findBySafety(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findBySafety(queryBuilder);
    logger.info("findBysafety - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Device> findByText(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Device> findByMeta(QueryBuilder queryBuilder) {
  	final List<Device> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}