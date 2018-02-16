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
import org.fhir.pojo.DomainResource;
/**
* auto generated from SQL files
*/
public class DomainResourceServiceImpl implements DomainResourceService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DomainResourceDao dao;

  @Inject
  public DomainResourceServiceImpl(final DomainResourceDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DomainResource find(String id) {
    final DomainResource result = dao.find(id);
    logger.info("find(DomainResource) - exited - return value={} result ");
    return result;
  }

  public List<DomainResource> select(int maxResult) {
      final List<DomainResource> result = dao.select(maxResult);
      logger.info("select(DomainResource) - exited - return value={} result ");

      return result;
  }

  public List<DomainResource> selectAll() {
      final List<DomainResource> results = dao.selectAll();
      logger.info("selectAll(DomainResource) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DomainResource create(DomainResource bean) {
  	requireNonNull(bean);
    logger.info("create(DomainResource={}) - entered bean ");

    final DomainResource result = dao.create(bean);

    logger.info("create(DomainResource) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DomainResource update(DomainResource bean) {
  	requireNonNull(bean);
    logger.info("update(DomainResource={}) - entered bean ");

    final DomainResource result = dao.update(bean);

    logger.info("update(DomainResource) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(DomainResource bean) {
  	requireNonNull(bean);
    logger.info("delete(DomainResource={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(DomainResource) - exited - return value={} result ");
  }

  @Override
  public List<DomainResource> findByField(QueryBuilder queryBuilder) {
  	final List<DomainResource> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

}