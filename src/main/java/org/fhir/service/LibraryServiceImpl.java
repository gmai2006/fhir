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
import org.fhir.pojo.Library;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class LibraryServiceImpl implements LibraryService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final LibraryDao dao;

  @Inject
  public LibraryServiceImpl(final LibraryDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Library find(String id) {
    final Library result = dao.find(id);
    logger.info("find(Library) - exited - return value={} result ");
    return result;
  }

  public List<Library> select(int maxResult) {
      final List<Library> result = dao.select(maxResult);
      logger.info("select(Library) - exited - return value={} result ");

      return result;
  }

  public List<Library> selectAll() {
      final List<Library> results = dao.selectAll();
      logger.info("selectAll(Library) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Library create(Library bean) {
  	requireNonNull(bean);
    logger.info("create(Library={}) - entered bean ");

    final Library result = dao.create(bean);

    logger.info("create(Library) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Library update(Library bean) {
  	requireNonNull(bean);
    logger.info("update(Library={}) - entered bean ");

    final Library result = dao.update(bean);

    logger.info("update(Library) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Library={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Library) - exited - return value={} result ");
  }

  @Override
  public List<Library> findByField(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Library> findByType(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByUseContext(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByTopic(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByTopic(queryBuilder);
    logger.info("findBytopic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByContributor(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByContributor(queryBuilder);
    logger.info("findBycontributor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByContact(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByRelatedArtifact(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByRelatedArtifact(queryBuilder);
    logger.info("findByrelatedArtifact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByDataRequirement(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByDataRequirement(queryBuilder);
    logger.info("findBydataRequirement - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByText(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Library> findByMeta(QueryBuilder queryBuilder) {
  	final List<Library> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}