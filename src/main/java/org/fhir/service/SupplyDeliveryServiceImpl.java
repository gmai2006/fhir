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
import org.fhir.pojo.SupplyDelivery;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class SupplyDeliveryServiceImpl implements SupplyDeliveryService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final SupplyDeliveryDao dao;

  @Inject
  public SupplyDeliveryServiceImpl(final SupplyDeliveryDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public SupplyDelivery find(String id) {
    final SupplyDelivery result = dao.find(id);
    logger.info("find(SupplyDelivery) - exited - return value={} result ");
    return result;
  }

  public List<SupplyDelivery> select(int maxResult) {
      final List<SupplyDelivery> result = dao.select(maxResult);
      logger.info("select(SupplyDelivery) - exited - return value={} result ");

      return result;
  }

  public List<SupplyDelivery> selectAll() {
      final List<SupplyDelivery> results = dao.selectAll();
      logger.info("selectAll(SupplyDelivery) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public SupplyDelivery create(SupplyDelivery bean) {
  	requireNonNull(bean);
    logger.info("create(SupplyDelivery={}) - entered bean ");

    final SupplyDelivery result = dao.create(bean);

    logger.info("create(SupplyDelivery) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public SupplyDelivery update(SupplyDelivery bean) {
  	requireNonNull(bean);
    logger.info("update(SupplyDelivery={}) - entered bean ");

    final SupplyDelivery result = dao.update(bean);

    logger.info("update(SupplyDelivery) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(SupplyDelivery={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(SupplyDelivery) - exited - return value={} result ");
  }

  @Override
  public List<SupplyDelivery> findByField(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<SupplyDelivery> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findByPartOf(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByPartOf(queryBuilder);
    logger.info("findBypartOf - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findByPatient(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findByType(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findBySuppliedItem(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findBySuppliedItem(queryBuilder);
    logger.info("findBysuppliedItem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findBySupplier(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findBySupplier(queryBuilder);
    logger.info("findBysupplier - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findByDestination(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByDestination(queryBuilder);
    logger.info("findBydestination - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findByReceiver(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByReceiver(queryBuilder);
    logger.info("findByreceiver - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findByText(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<SupplyDelivery> findByMeta(QueryBuilder queryBuilder) {
  	final List<SupplyDelivery> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}