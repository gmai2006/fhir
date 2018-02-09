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
import org.fhir.pojo.CodeSystemProperty1;
/**
* auto generated from SQL files
*/
public class CodeSystemProperty1ServiceImpl implements CodeSystemProperty1Service {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CodeSystemProperty1Dao dao;

  @Inject
  public CodeSystemProperty1ServiceImpl(final CodeSystemProperty1Dao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public CodeSystemProperty1 find(String id) {
    final CodeSystemProperty1 result = dao.find(id);
    logger.info("find(CodeSystemProperty1) - exited - return value={} result ");
    return result;
  }

  public List<CodeSystemProperty1> select(int maxResult) {
      final List<CodeSystemProperty1> result = dao.select(maxResult);
      logger.info("select(CodeSystemProperty1) - exited - return value={} result ");

      return result;
  }

  public List<CodeSystemProperty1> selectAll() {
      final List<CodeSystemProperty1> results = dao.selectAll();
      logger.info("selectAll(CodeSystemProperty1) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public CodeSystemProperty1 create(CodeSystemProperty1 bean) {
  	requireNonNull(bean);
    logger.info("create(CodeSystemProperty1={}) - entered bean ");

    final CodeSystemProperty1 result = dao.create(bean);

    logger.info("create(CodeSystemProperty1) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public CodeSystemProperty1 update(CodeSystemProperty1 bean) {
  	requireNonNull(bean);
    logger.info("update(CodeSystemProperty1={}) - entered bean ");

    final CodeSystemProperty1 result = dao.update(bean);

    logger.info("update(CodeSystemProperty1) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(CodeSystemProperty1 bean) {
  	requireNonNull(bean);
    logger.info("delete(CodeSystemProperty1={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(CodeSystemProperty1) - exited - return value={} result ");
  }
}