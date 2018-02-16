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
import org.fhir.pojo.SearchParameter;
/**
* auto generated from SQL files
*/
public class SearchParameterServiceImpl implements SearchParameterService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final SearchParameterDao dao;

  @Inject
  public SearchParameterServiceImpl(final SearchParameterDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public SearchParameter find(String id) {
    final SearchParameter result = dao.find(id);
    logger.info("find(SearchParameter) - exited - return value={} result ");
    return result;
  }

  public List<SearchParameter> select(int maxResult) {
      final List<SearchParameter> result = dao.select(maxResult);
      logger.info("select(SearchParameter) - exited - return value={} result ");

      return result;
  }

  public List<SearchParameter> selectAll() {
      final List<SearchParameter> results = dao.selectAll();
      logger.info("selectAll(SearchParameter) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public SearchParameter create(SearchParameter bean) {
  	requireNonNull(bean);
    logger.info("create(SearchParameter={}) - entered bean ");

    final SearchParameter result = dao.create(bean);

    logger.info("create(SearchParameter) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public SearchParameter update(SearchParameter bean) {
  	requireNonNull(bean);
    logger.info("update(SearchParameter={}) - entered bean ");

    final SearchParameter result = dao.update(bean);

    logger.info("update(SearchParameter) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(SearchParameter bean) {
  	requireNonNull(bean);
    logger.info("delete(SearchParameter={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(SearchParameter) - exited - return value={} result ");
  }

  @Override
  public List<SearchParameter> findByField(QueryBuilder queryBuilder) {
  	final List<SearchParameter> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<SearchParameter> findByComponent(QueryBuilder queryBuilder) {
  	final List<SearchParameter> result = dao.findByComponent(queryBuilder);
    logger.info("findBycomponent - exited - return value={} result ");
    return result;
  }
}