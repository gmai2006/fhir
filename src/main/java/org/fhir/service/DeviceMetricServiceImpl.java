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
import org.fhir.pojo.DeviceMetric;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class DeviceMetricServiceImpl implements DeviceMetricService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DeviceMetricDao dao;

  @Inject
  public DeviceMetricServiceImpl(final DeviceMetricDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DeviceMetric find(String id) {
    final DeviceMetric result = dao.find(id);
    logger.info("find(DeviceMetric) - exited - return value={} result ");
    return result;
  }

  public List<DeviceMetric> select(int maxResult) {
      final List<DeviceMetric> result = dao.select(maxResult);
      logger.info("select(DeviceMetric) - exited - return value={} result ");

      return result;
  }

  public List<DeviceMetric> selectAll() {
      final List<DeviceMetric> results = dao.selectAll();
      logger.info("selectAll(DeviceMetric) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DeviceMetric create(DeviceMetric bean) {
  	requireNonNull(bean);
    logger.info("create(DeviceMetric={}) - entered bean ");

    final DeviceMetric result = dao.create(bean);

    logger.info("create(DeviceMetric) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DeviceMetric update(DeviceMetric bean) {
  	requireNonNull(bean);
    logger.info("update(DeviceMetric={}) - entered bean ");

    final DeviceMetric result = dao.update(bean);

    logger.info("update(DeviceMetric) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(DeviceMetric={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(DeviceMetric) - exited - return value={} result ");
  }

  @Override
  public List<DeviceMetric> findByField(QueryBuilder queryBuilder) {
  	final List<DeviceMetric> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<DeviceMetric> findByType(QueryBuilder queryBuilder) {
  	final List<DeviceMetric> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceMetric> findByUnit(QueryBuilder queryBuilder) {
  	final List<DeviceMetric> result = dao.findByUnit(queryBuilder);
    logger.info("findByunit - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceMetric> findBySource(QueryBuilder queryBuilder) {
  	final List<DeviceMetric> result = dao.findBySource(queryBuilder);
    logger.info("findBysource - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceMetric> findByParent(QueryBuilder queryBuilder) {
  	final List<DeviceMetric> result = dao.findByParent(queryBuilder);
    logger.info("findByparent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceMetric> findByCalibration(QueryBuilder queryBuilder) {
  	final List<DeviceMetric> result = dao.findByCalibration(queryBuilder);
    logger.info("findBycalibration - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceMetric> findByText(QueryBuilder queryBuilder) {
  	final List<DeviceMetric> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceMetric> findByMeta(QueryBuilder queryBuilder) {
  	final List<DeviceMetric> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}