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
import org.fhir.pojo.DeviceComponent;
/**
* auto generated from SQL files
*/
public class DeviceComponentServiceImpl implements DeviceComponentService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DeviceComponentDao dao;

  @Inject
  public DeviceComponentServiceImpl(final DeviceComponentDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DeviceComponent find(String id) {
    final DeviceComponent result = dao.find(id);
    logger.info("find(DeviceComponent) - exited - return value={} result ");
    return result;
  }

  public List<DeviceComponent> select(int maxResult) {
      final List<DeviceComponent> result = dao.select(maxResult);
      logger.info("select(DeviceComponent) - exited - return value={} result ");

      return result;
  }

  public List<DeviceComponent> selectAll() {
      final List<DeviceComponent> results = dao.selectAll();
      logger.info("selectAll(DeviceComponent) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DeviceComponent create(DeviceComponent bean) {
  	requireNonNull(bean);
    logger.info("create(DeviceComponent={}) - entered bean ");

    final DeviceComponent result = dao.create(bean);

    logger.info("create(DeviceComponent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DeviceComponent update(DeviceComponent bean) {
  	requireNonNull(bean);
    logger.info("update(DeviceComponent={}) - entered bean ");

    final DeviceComponent result = dao.update(bean);

    logger.info("update(DeviceComponent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(DeviceComponent bean) {
  	requireNonNull(bean);
    logger.info("delete(DeviceComponent={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(DeviceComponent) - exited - return value={} result ");
  }

  @Override
  public List<DeviceComponent> findByField(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<DeviceComponent> findByType(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceComponent> findBySource(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findBySource(queryBuilder);
    logger.info("findBysource - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceComponent> findByParent(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByParent(queryBuilder);
    logger.info("findByparent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceComponent> findByOperationalStatus(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByOperationalStatus(queryBuilder);
    logger.info("findByoperationalStatus - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceComponent> findByParameterGroup(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByParameterGroup(queryBuilder);
    logger.info("findByparameterGroup - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceComponent> findByProductionSpecification(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByProductionSpecification(queryBuilder);
    logger.info("findByproductionSpecification - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceComponent> findByLanguageCode(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByLanguageCode(queryBuilder);
    logger.info("findBylanguageCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceComponent> findByText(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DeviceComponent> findByMeta(QueryBuilder queryBuilder) {
  	final List<DeviceComponent> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}