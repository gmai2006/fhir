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
import org.fhir.pojo.CodeSystem;
/**
* auto generated from SQL files
*/
public class CodeSystemServiceImpl implements CodeSystemService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CodeSystemDao dao;

  @Inject
  public CodeSystemServiceImpl(final CodeSystemDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public CodeSystem find(String id) {
    final CodeSystem result = dao.find(id);
    logger.info("find(CodeSystem) - exited - return value={} result ");
    return result;
  }

  public List<CodeSystem> select(int maxResult) {
      final List<CodeSystem> result = dao.select(maxResult);
      logger.info("select(CodeSystem) - exited - return value={} result ");

      return result;
  }

  public List<CodeSystem> selectAll() {
      final List<CodeSystem> results = dao.selectAll();
      logger.info("selectAll(CodeSystem) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public CodeSystem create(CodeSystem bean) {
  	requireNonNull(bean);
    logger.info("create(CodeSystem={}) - entered bean ");

    final CodeSystem result = dao.create(bean);

    logger.info("create(CodeSystem) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public CodeSystem update(CodeSystem bean) {
  	requireNonNull(bean);
    logger.info("update(CodeSystem={}) - entered bean ");

    final CodeSystem result = dao.update(bean);

    logger.info("update(CodeSystem) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(CodeSystem bean) {
  	requireNonNull(bean);
    logger.info("delete(CodeSystem={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(CodeSystem) - exited - return value={} result ");
  }
}