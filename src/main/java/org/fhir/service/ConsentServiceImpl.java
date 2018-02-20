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
import org.fhir.pojo.Consent;
/**
* auto generated from SQL files
*/
public class ConsentServiceImpl implements ConsentService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ConsentDao dao;

  @Inject
  public ConsentServiceImpl(final ConsentDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Consent find(String id) {
    final Consent result = dao.find(id);
    logger.info("find(Consent) - exited - return value={} result ");
    return result;
  }

  public List<Consent> select(int maxResult) {
      final List<Consent> result = dao.select(maxResult);
      logger.info("select(Consent) - exited - return value={} result ");

      return result;
  }

  public List<Consent> selectAll() {
      final List<Consent> results = dao.selectAll();
      logger.info("selectAll(Consent) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Consent create(Consent bean) {
  	requireNonNull(bean);
    logger.info("create(Consent={}) - entered bean ");

    final Consent result = dao.create(bean);

    logger.info("create(Consent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Consent update(Consent bean) {
  	requireNonNull(bean);
    logger.info("update(Consent={}) - entered bean ");

    final Consent result = dao.update(bean);

    logger.info("update(Consent) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Consent bean) {
  	requireNonNull(bean);
    logger.info("delete(Consent={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Consent) - exited - return value={} result ");
  }

  @Override
  public List<Consent> findByField(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Consent> findByCategory(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByPatient(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByConsentingParty(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByConsentingParty(queryBuilder);
    logger.info("findByconsentingParty - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByActor(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByActor(queryBuilder);
    logger.info("findByactor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByAction(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByAction(queryBuilder);
    logger.info("findByaction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByOrganization(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByOrganization(queryBuilder);
    logger.info("findByorganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findBySourceReference(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findBySourceReference(queryBuilder);
    logger.info("findBysourceReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByPolicy(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByPolicy(queryBuilder);
    logger.info("findBypolicy - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findBySecurityLabel(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findBySecurityLabel(queryBuilder);
    logger.info("findBysecurityLabel - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByPurpose(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByPurpose(queryBuilder);
    logger.info("findBypurpose - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByData(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByData(queryBuilder);
    logger.info("findBydata - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByExcept(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByExcept(queryBuilder);
    logger.info("findByexcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByText(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Consent> findByMeta(QueryBuilder queryBuilder) {
  	final List<Consent> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}