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
import org.fhir.pojo.DocumentReference;
/**
* auto generated from SQL files
*/
public class DocumentReferenceServiceImpl implements DocumentReferenceService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DocumentReferenceDao dao;

  @Inject
  public DocumentReferenceServiceImpl(final DocumentReferenceDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DocumentReference find(String id) {
    final DocumentReference result = dao.find(id);
    logger.info("find(DocumentReference) - exited - return value={} result ");
    return result;
  }

  public List<DocumentReference> select(int maxResult) {
      final List<DocumentReference> result = dao.select(maxResult);
      logger.info("select(DocumentReference) - exited - return value={} result ");

      return result;
  }

  public List<DocumentReference> selectAll() {
      final List<DocumentReference> results = dao.selectAll();
      logger.info("selectAll(DocumentReference) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DocumentReference create(DocumentReference bean) {
  	requireNonNull(bean);
    logger.info("create(DocumentReference={}) - entered bean ");

    final DocumentReference result = dao.create(bean);

    logger.info("create(DocumentReference) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DocumentReference update(DocumentReference bean) {
  	requireNonNull(bean);
    logger.info("update(DocumentReference={}) - entered bean ");

    final DocumentReference result = dao.update(bean);

    logger.info("update(DocumentReference) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(DocumentReference bean) {
  	requireNonNull(bean);
    logger.info("delete(DocumentReference={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(DocumentReference) - exited - return value={} result ");
  }

  @Override
  public List<DocumentReference> findByField(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<DocumentReference> findByType(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByFHIRclass(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByFHIRclass(queryBuilder);
    logger.info("findByFHIRclass - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findBySubject(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByAuthor(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByAuthenticator(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByAuthenticator(queryBuilder);
    logger.info("findByauthenticator - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByCustodian(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByCustodian(queryBuilder);
    logger.info("findBycustodian - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByRelatesTo(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByRelatesTo(queryBuilder);
    logger.info("findByrelatesTo - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findBySecurityLabel(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findBySecurityLabel(queryBuilder);
    logger.info("findBysecurityLabel - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByContent(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByContent(queryBuilder);
    logger.info("findBycontent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByContext(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByText(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<DocumentReference> findByMeta(QueryBuilder queryBuilder) {
  	final List<DocumentReference> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}