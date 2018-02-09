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
import org.fhir.pojo.DocumentManifest;
/**
* auto generated from SQL files
*/
public class DocumentManifestServiceImpl implements DocumentManifestService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final DocumentManifestDao dao;

  @Inject
  public DocumentManifestServiceImpl(final DocumentManifestDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public DocumentManifest find(String id) {
    final DocumentManifest result = dao.find(id);
    logger.info("find(DocumentManifest) - exited - return value={} result ");
    return result;
  }

  public List<DocumentManifest> select(int maxResult) {
      final List<DocumentManifest> result = dao.select(maxResult);
      logger.info("select(DocumentManifest) - exited - return value={} result ");

      return result;
  }

  public List<DocumentManifest> selectAll() {
      final List<DocumentManifest> results = dao.selectAll();
      logger.info("selectAll(DocumentManifest) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public DocumentManifest create(DocumentManifest bean) {
  	requireNonNull(bean);
    logger.info("create(DocumentManifest={}) - entered bean ");

    final DocumentManifest result = dao.create(bean);

    logger.info("create(DocumentManifest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public DocumentManifest update(DocumentManifest bean) {
  	requireNonNull(bean);
    logger.info("update(DocumentManifest={}) - entered bean ");

    final DocumentManifest result = dao.update(bean);

    logger.info("update(DocumentManifest) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(DocumentManifest bean) {
  	requireNonNull(bean);
    logger.info("delete(DocumentManifest={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(DocumentManifest) - exited - return value={} result ");
  }
}