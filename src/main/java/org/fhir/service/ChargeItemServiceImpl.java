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
import org.fhir.pojo.ChargeItem;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ChargeItemServiceImpl implements ChargeItemService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ChargeItemDao dao;

  @Inject
  public ChargeItemServiceImpl(final ChargeItemDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ChargeItem find(String id) {
    final ChargeItem result = dao.find(id);
    logger.info("find(ChargeItem) - exited - return value={} result ");
    return result;
  }

  public List<ChargeItem> select(int maxResult) {
      final List<ChargeItem> result = dao.select(maxResult);
      logger.info("select(ChargeItem) - exited - return value={} result ");

      return result;
  }

  public List<ChargeItem> selectAll() {
      final List<ChargeItem> results = dao.selectAll();
      logger.info("selectAll(ChargeItem) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ChargeItem create(ChargeItem bean) {
  	requireNonNull(bean);
    logger.info("create(ChargeItem={}) - entered bean ");

    final ChargeItem result = dao.create(bean);

    logger.info("create(ChargeItem) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ChargeItem update(ChargeItem bean) {
  	requireNonNull(bean);
    logger.info("update(ChargeItem={}) - entered bean ");

    final ChargeItem result = dao.update(bean);

    logger.info("update(ChargeItem) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ChargeItem={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ChargeItem) - exited - return value={} result ");
  }

  @Override
  public List<ChargeItem> findByField(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ChargeItem> findByPartOf(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByCode(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findBySubject(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByContext(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByParticipant(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByParticipant(queryBuilder);
    logger.info("findByparticipant - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByPerformingOrganization(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByPerformingOrganization(queryBuilder);
    logger.info("findByperformingOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByRequestingOrganization(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByRequestingOrganization(queryBuilder);
    logger.info("findByrequestingOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByQuantity(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByQuantity(queryBuilder);
    logger.info("findByquantity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByBodysite(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByBodysite(queryBuilder);
    logger.info("findBybodysite - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByPriceOverride(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByPriceOverride(queryBuilder);
    logger.info("findBypriceOverride - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByEnterer(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByEnterer(queryBuilder);
    logger.info("findByenterer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByReason(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByReason(queryBuilder);
    logger.info("findByreason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByService(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByService(queryBuilder);
    logger.info("findByservice - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByAccount(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByAccount(queryBuilder);
    logger.info("findByaccount - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findBySupportingInformation(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findBySupportingInformation(queryBuilder);
    logger.info("findBysupportingInformation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByText(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ChargeItem> findByMeta(QueryBuilder queryBuilder) {
  	final List<ChargeItem> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}