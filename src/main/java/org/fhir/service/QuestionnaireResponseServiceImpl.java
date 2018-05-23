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
import org.fhir.pojo.QuestionnaireResponse;
/**
* auto generated from SQL files
*/
public class QuestionnaireResponseServiceImpl implements QuestionnaireResponseService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final QuestionnaireResponseDao dao;

  @Inject
  public QuestionnaireResponseServiceImpl(final QuestionnaireResponseDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public QuestionnaireResponse find(String id) {
    final QuestionnaireResponse result = dao.find(id);
    logger.info("find(QuestionnaireResponse) - exited - return value={} result ");
    return result;
  }

  public List<QuestionnaireResponse> select(int maxResult) {
      final List<QuestionnaireResponse> result = dao.select(maxResult);
      logger.info("select(QuestionnaireResponse) - exited - return value={} result ");

      return result;
  }

  public List<QuestionnaireResponse> selectAll() {
      final List<QuestionnaireResponse> results = dao.selectAll();
      logger.info("selectAll(QuestionnaireResponse) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public QuestionnaireResponse create(QuestionnaireResponse bean) {
  	requireNonNull(bean);
    logger.info("create(QuestionnaireResponse={}) - entered bean ");

    final QuestionnaireResponse result = dao.create(bean);

    logger.info("create(QuestionnaireResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public QuestionnaireResponse update(QuestionnaireResponse bean) {
  	requireNonNull(bean);
    logger.info("update(QuestionnaireResponse={}) - entered bean ");

    final QuestionnaireResponse result = dao.update(bean);

    logger.info("update(QuestionnaireResponse) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(QuestionnaireResponse={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(QuestionnaireResponse) - exited - return value={} result ");
  }

  @Override
  public List<QuestionnaireResponse> findByField(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<QuestionnaireResponse> findByBasedOn(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByBasedOn(queryBuilder);
    logger.info("findBybasedOn - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findByParent(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByParent(queryBuilder);
    logger.info("findByparent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findByQuestionnaire(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByQuestionnaire(queryBuilder);
    logger.info("findByquestionnaire - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findBySubject(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findByContext(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findByAuthor(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByAuthor(queryBuilder);
    logger.info("findByauthor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findBySource(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findBySource(queryBuilder);
    logger.info("findBysource - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findByItem(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByItem(queryBuilder);
    logger.info("findByitem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findByText(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<QuestionnaireResponse> findByMeta(QueryBuilder queryBuilder) {
  	final List<QuestionnaireResponse> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}