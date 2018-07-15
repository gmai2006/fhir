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
import org.fhir.pojo.Organization;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class OrganizationServiceImpl implements OrganizationService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final OrganizationDao dao;

  @Inject
  public OrganizationServiceImpl(final OrganizationDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Organization find(String id) {
    final Organization result = dao.find(id);
    logger.info("find(Organization) - exited - return value={} result ");
    return result;
  }

  public List<Organization> select(int maxResult) {
      final List<Organization> result = dao.select(maxResult);
      logger.info("select(Organization) - exited - return value={} result ");

      return result;
  }

  public List<Organization> selectAll() {
      final List<Organization> results = dao.selectAll();
      logger.info("selectAll(Organization) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Organization create(Organization bean) {
  	requireNonNull(bean);
    logger.info("create(Organization={}) - entered bean ");

    final Organization result = dao.create(bean);

    logger.info("create(Organization) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Organization update(Organization bean) {
  	requireNonNull(bean);
    logger.info("update(Organization={}) - entered bean ");

    final Organization result = dao.update(bean);

    logger.info("update(Organization) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Organization={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Organization) - exited - return value={} result ");
  }

  @Override
  public List<Organization> findByField(QueryBuilder queryBuilder) {
  	final List<Organization> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Organization> findByType(QueryBuilder queryBuilder) {
  	final List<Organization> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Organization> findByAddress(QueryBuilder queryBuilder) {
  	final List<Organization> result = dao.findByAddress(queryBuilder);
    logger.info("findByaddress - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Organization> findByPartOf(QueryBuilder queryBuilder) {
  	final List<Organization> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Organization> findByContact(QueryBuilder queryBuilder) {
  	final List<Organization> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Organization> findByEndpoint(QueryBuilder queryBuilder) {
  	final List<Organization> result = dao.findByEndpoint(queryBuilder);
    logger.info("findByendpoint - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Organization> findByText(QueryBuilder queryBuilder) {
  	final List<Organization> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Organization> findByMeta(QueryBuilder queryBuilder) {
  	final List<Organization> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}