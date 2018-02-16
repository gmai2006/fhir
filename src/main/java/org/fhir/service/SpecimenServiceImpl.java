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
import org.fhir.pojo.Specimen;
/**
* auto generated from SQL files
*/
public class SpecimenServiceImpl implements SpecimenService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final SpecimenDao dao;

  @Inject
  public SpecimenServiceImpl(final SpecimenDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Specimen find(String id) {
    final Specimen result = dao.find(id);
    logger.info("find(Specimen) - exited - return value={} result ");
    return result;
  }

  public List<Specimen> select(int maxResult) {
      final List<Specimen> result = dao.select(maxResult);
      logger.info("select(Specimen) - exited - return value={} result ");

      return result;
  }

  public List<Specimen> selectAll() {
      final List<Specimen> results = dao.selectAll();
      logger.info("selectAll(Specimen) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Specimen create(Specimen bean) {
  	requireNonNull(bean);
    logger.info("create(Specimen={}) - entered bean ");

    final Specimen result = dao.create(bean);

    logger.info("create(Specimen) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Specimen update(Specimen bean) {
  	requireNonNull(bean);
    logger.info("update(Specimen={}) - entered bean ");

    final Specimen result = dao.update(bean);

    logger.info("update(Specimen) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Specimen bean) {
  	requireNonNull(bean);
    logger.info("delete(Specimen={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Specimen) - exited - return value={} result ");
  }

  @Override
  public List<Specimen> findByField(QueryBuilder queryBuilder) {
  	final List<Specimen> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Specimen> findByContainer(QueryBuilder queryBuilder) {
  	final List<Specimen> result = dao.findByContainer(queryBuilder);
    logger.info("findBycontainer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Specimen> findByParent(QueryBuilder queryBuilder) {
  	final List<Specimen> result = dao.findByParent(queryBuilder);
    logger.info("findByparent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Specimen> findBySubject(QueryBuilder queryBuilder) {
  	final List<Specimen> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
}