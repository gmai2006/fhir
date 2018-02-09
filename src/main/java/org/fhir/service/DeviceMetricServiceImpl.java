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
import org.fhir.pojo.DeviceMetric;
/**
* auto generated from SQL files
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
  public void delete(DeviceMetric bean) {
  	requireNonNull(bean);
    logger.info("delete(DeviceMetric={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(DeviceMetric) - exited - return value={} result ");
  }
}