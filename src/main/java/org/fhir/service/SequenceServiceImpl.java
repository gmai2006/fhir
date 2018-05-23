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
import org.fhir.pojo.Sequence;
/**
* auto generated from SQL files
*/
public class SequenceServiceImpl implements SequenceService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final SequenceDao dao;

  @Inject
  public SequenceServiceImpl(final SequenceDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Sequence find(String id) {
    final Sequence result = dao.find(id);
    logger.info("find(Sequence) - exited - return value={} result ");
    return result;
  }

  public List<Sequence> select(int maxResult) {
      final List<Sequence> result = dao.select(maxResult);
      logger.info("select(Sequence) - exited - return value={} result ");

      return result;
  }

  public List<Sequence> selectAll() {
      final List<Sequence> results = dao.selectAll();
      logger.info("selectAll(Sequence) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Sequence create(Sequence bean) {
  	requireNonNull(bean);
    logger.info("create(Sequence={}) - entered bean ");

    final Sequence result = dao.create(bean);

    logger.info("create(Sequence) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Sequence update(Sequence bean) {
  	requireNonNull(bean);
    logger.info("update(Sequence={}) - entered bean ");

    final Sequence result = dao.update(bean);

    logger.info("update(Sequence) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Sequence={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Sequence) - exited - return value={} result ");
  }

  @Override
  public List<Sequence> findByField(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Sequence> findByPatient(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findBySpecimen(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findBySpecimen(queryBuilder);
    logger.info("findByspecimen - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByDevice(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByDevice(queryBuilder);
    logger.info("findBydevice - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByPerformer(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByPerformer(queryBuilder);
    logger.info("findByperformer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByQuantity(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByQuantity(queryBuilder);
    logger.info("findByquantity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByReferenceSeq(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByReferenceSeq(queryBuilder);
    logger.info("findByreferenceSeq - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByVariant(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByVariant(queryBuilder);
    logger.info("findByvariant - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByQuality(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByQuality(queryBuilder);
    logger.info("findByquality - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByRepository(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByRepository(queryBuilder);
    logger.info("findByrepository - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByPointer(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByPointer(queryBuilder);
    logger.info("findBypointer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByText(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Sequence> findByMeta(QueryBuilder queryBuilder) {
  	final List<Sequence> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}