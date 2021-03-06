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
import org.fhir.pojo.BodySite;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class BodySiteServiceImpl implements BodySiteService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final BodySiteDao dao;

  @Inject
  public BodySiteServiceImpl(final BodySiteDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public BodySite find(String id) {
    final BodySite result = dao.find(id);
    logger.info("find(BodySite) - exited - return value={} result ");
    return result;
  }

  public List<BodySite> select(int maxResult) {
      final List<BodySite> result = dao.select(maxResult);
      logger.info("select(BodySite) - exited - return value={} result ");

      return result;
  }

  public List<BodySite> selectAll() {
      final List<BodySite> results = dao.selectAll();
      logger.info("selectAll(BodySite) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public BodySite create(BodySite bean) {
  	requireNonNull(bean);
    logger.info("create(BodySite={}) - entered bean ");

    final BodySite result = dao.create(bean);

    logger.info("create(BodySite) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public BodySite update(BodySite bean) {
  	requireNonNull(bean);
    logger.info("update(BodySite={}) - entered bean ");

    final BodySite result = dao.update(bean);

    logger.info("update(BodySite) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(BodySite={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(BodySite) - exited - return value={} result ");
  }

  @Override
  public List<BodySite> findByField(QueryBuilder queryBuilder) {
  	final List<BodySite> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<BodySite> findByCode(QueryBuilder queryBuilder) {
  	final List<BodySite> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<BodySite> findByQualifier(QueryBuilder queryBuilder) {
  	final List<BodySite> result = dao.findByQualifier(queryBuilder);
    logger.info("findByqualifier - exited - return value={} result ");
    return result;
  }
  @Override
  public List<BodySite> findByPatient(QueryBuilder queryBuilder) {
  	final List<BodySite> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<BodySite> findByText(QueryBuilder queryBuilder) {
  	final List<BodySite> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<BodySite> findByMeta(QueryBuilder queryBuilder) {
  	final List<BodySite> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}