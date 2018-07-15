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
import org.fhir.pojo.SupplyRequest;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class SupplyRequestServiceImpl implements SupplyRequestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final SupplyRequestDao dao;

  @Inject
  public SupplyRequestServiceImpl(final SupplyRequestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public SupplyRequest find(String id) {
    final SupplyRequest result = dao.find(id);
    logger.info("find(SupplyRequest) - exited - return value={} result ");
    return result;
  }

  public List<SupplyRequest> select(int maxResult) {
      final List<SupplyRequest> result = dao.select(maxResult);
      logger.info("select(SupplyRequest) - exited - return value={} result ");

      return result;
  }

  public List<SupplyRequest> selectAll() {
      final List<SupplyRequest> results = dao.selectAll();
      logger.info("selectAll(SupplyRequest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public SupplyRequest create(SupplyRequest bean) {
  	requireNonNull(bean);
    logger.info("create(SupplyRequest={}) - entered bean ");

    final SupplyRequest result = dao.create(bean);

    logger.info("create(SupplyRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public SupplyRequest update(SupplyRequest bean) {
  	requireNonNull(bean);
    logger.info("update(SupplyRequest={}) - entered bean ");

    final SupplyRequest result = dao.update(bean);

    logger.info("update(SupplyRequest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(SupplyRequest={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(SupplyRequest) - exited - return value={} result ");
  }

  @Override
  public List<SupplyRequest> findByField(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<SupplyRequest> findByCategory(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findByOrderedItem(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByOrderedItem(queryBuilder);
    logger.info("findByorderedItem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findByRequester(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByRequester(queryBuilder);
    logger.info("findByrequester - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findBySupplier(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findBySupplier(queryBuilder);
    logger.info("findBysupplier - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findByReasonCodeableConcept(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByReasonCodeableConcept(queryBuilder);
    logger.info("findByreasonCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findByDeliverFrom(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByDeliverFrom(queryBuilder);
    logger.info("findBydeliverFrom - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findByDeliverTo(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByDeliverTo(queryBuilder);
    logger.info("findBydeliverTo - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findByText(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyRequest> findByMeta(QueryBuilder queryBuilder) {
  	final List<SupplyRequest> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}