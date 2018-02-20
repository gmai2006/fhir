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
import org.fhir.pojo.Practitioner;
/**
* auto generated from SQL files
*/
public class PractitionerServiceImpl implements PractitionerService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final PractitionerDao dao;

  @Inject
  public PractitionerServiceImpl(final PractitionerDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Practitioner find(String id) {
    final Practitioner result = dao.find(id);
    logger.info("find(Practitioner) - exited - return value={} result ");
    return result;
  }

  public List<Practitioner> select(int maxResult) {
      final List<Practitioner> result = dao.select(maxResult);
      logger.info("select(Practitioner) - exited - return value={} result ");

      return result;
  }

  public List<Practitioner> selectAll() {
      final List<Practitioner> results = dao.selectAll();
      logger.info("selectAll(Practitioner) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Practitioner create(Practitioner bean) {
  	requireNonNull(bean);
    logger.info("create(Practitioner={}) - entered bean ");

    final Practitioner result = dao.create(bean);

    logger.info("create(Practitioner) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Practitioner update(Practitioner bean) {
  	requireNonNull(bean);
    logger.info("update(Practitioner={}) - entered bean ");

    final Practitioner result = dao.update(bean);

    logger.info("update(Practitioner) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Practitioner bean) {
  	requireNonNull(bean);
    logger.info("delete(Practitioner={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Practitioner) - exited - return value={} result ");
  }

  @Override
  public List<Practitioner> findByField(QueryBuilder queryBuilder) {
  	final List<Practitioner> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Practitioner> findByAddress(QueryBuilder queryBuilder) {
  	final List<Practitioner> result = dao.findByAddress(queryBuilder);
    logger.info("findByaddress - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Practitioner> findByQualification(QueryBuilder queryBuilder) {
  	final List<Practitioner> result = dao.findByQualification(queryBuilder);
    logger.info("findByqualification - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Practitioner> findByCommunication(QueryBuilder queryBuilder) {
  	final List<Practitioner> result = dao.findByCommunication(queryBuilder);
    logger.info("findBycommunication - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Practitioner> findByText(QueryBuilder queryBuilder) {
  	final List<Practitioner> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Practitioner> findByMeta(QueryBuilder queryBuilder) {
  	final List<Practitioner> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}