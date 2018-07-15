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
import org.fhir.pojo.Location;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class LocationServiceImpl implements LocationService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final LocationDao dao;

  @Inject
  public LocationServiceImpl(final LocationDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Location find(String id) {
    final Location result = dao.find(id);
    logger.info("find(Location) - exited - return value={} result ");
    return result;
  }

  public List<Location> select(int maxResult) {
      final List<Location> result = dao.select(maxResult);
      logger.info("select(Location) - exited - return value={} result ");

      return result;
  }

  public List<Location> selectAll() {
      final List<Location> results = dao.selectAll();
      logger.info("selectAll(Location) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Location create(Location bean) {
  	requireNonNull(bean);
    logger.info("create(Location={}) - entered bean ");

    final Location result = dao.create(bean);

    logger.info("create(Location) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Location update(Location bean) {
  	requireNonNull(bean);
    logger.info("update(Location={}) - entered bean ");

    final Location result = dao.update(bean);

    logger.info("update(Location) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Location={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Location) - exited - return value={} result ");
  }

  @Override
  public List<Location> findByField(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Location> findByOperationalStatus(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByOperationalStatus(queryBuilder);
    logger.info("findByoperationalStatus - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByType(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByAddress(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByAddress(queryBuilder);
    logger.info("findByaddress - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByPhysicalType(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByPhysicalType(queryBuilder);
    logger.info("findByphysicalType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByPosition(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByPosition(queryBuilder);
    logger.info("findByposition - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByManagingOrganization(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByManagingOrganization(queryBuilder);
    logger.info("findBymanagingOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByPartOf(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByEndpoint(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByEndpoint(queryBuilder);
    logger.info("findByendpoint - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByText(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Location> findByMeta(QueryBuilder queryBuilder) {
  	final List<Location> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}