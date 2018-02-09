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
import org.fhir.pojo.ImplementationGuideGlobal;
/**
* auto generated from SQL files
*/
public class ImplementationGuideGlobalServiceImpl implements ImplementationGuideGlobalService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ImplementationGuideGlobalDao dao;

  @Inject
  public ImplementationGuideGlobalServiceImpl(final ImplementationGuideGlobalDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ImplementationGuideGlobal find(String id) {
    final ImplementationGuideGlobal result = dao.find(id);
    logger.info("find(ImplementationGuideGlobal) - exited - return value={} result ");
    return result;
  }

  public List<ImplementationGuideGlobal> select(int maxResult) {
      final List<ImplementationGuideGlobal> result = dao.select(maxResult);
      logger.info("select(ImplementationGuideGlobal) - exited - return value={} result ");

      return result;
  }

  public List<ImplementationGuideGlobal> selectAll() {
      final List<ImplementationGuideGlobal> results = dao.selectAll();
      logger.info("selectAll(ImplementationGuideGlobal) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ImplementationGuideGlobal create(ImplementationGuideGlobal bean) {
  	requireNonNull(bean);
    logger.info("create(ImplementationGuideGlobal={}) - entered bean ");

    final ImplementationGuideGlobal result = dao.create(bean);

    logger.info("create(ImplementationGuideGlobal) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ImplementationGuideGlobal update(ImplementationGuideGlobal bean) {
  	requireNonNull(bean);
    logger.info("update(ImplementationGuideGlobal={}) - entered bean ");

    final ImplementationGuideGlobal result = dao.update(bean);

    logger.info("update(ImplementationGuideGlobal) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ImplementationGuideGlobal bean) {
  	requireNonNull(bean);
    logger.info("delete(ImplementationGuideGlobal={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ImplementationGuideGlobal) - exited - return value={} result ");
  }
}