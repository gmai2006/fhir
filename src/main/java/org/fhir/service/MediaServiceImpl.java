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
import org.fhir.pojo.Media;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class MediaServiceImpl implements MediaService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final MediaDao dao;

  @Inject
  public MediaServiceImpl(final MediaDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Media find(String id) {
    final Media result = dao.find(id);
    logger.info("find(Media) - exited - return value={} result ");
    return result;
  }

  public List<Media> select(int maxResult) {
      final List<Media> result = dao.select(maxResult);
      logger.info("select(Media) - exited - return value={} result ");

      return result;
  }

  public List<Media> selectAll() {
      final List<Media> results = dao.selectAll();
      logger.info("selectAll(Media) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Media create(Media bean) {
  	requireNonNull(bean);
    logger.info("create(Media={}) - entered bean ");

    final Media result = dao.create(bean);

    logger.info("create(Media) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Media update(Media bean) {
  	requireNonNull(bean);
    logger.info("update(Media={}) - entered bean ");

    final Media result = dao.update(bean);

    logger.info("update(Media) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Media={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Media) - exited - return value={} result ");
  }

  @Override
  public List<Media> findByField(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Media> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findBySubtype(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findBySubtype(queryBuilder);
    logger.info("findBysubtype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findByView(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByView(queryBuilder);
    logger.info("findByview - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findBySubject(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findByContext(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findByOperator(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByOperator(queryBuilder);
    logger.info("findByoperator - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findByBodySite(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByBodySite(queryBuilder);
    logger.info("findBybodySite - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findByDevice(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByDevice(queryBuilder);
    logger.info("findBydevice - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findByText(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Media> findByMeta(QueryBuilder queryBuilder) {
  	final List<Media> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}