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
import org.fhir.pojo.ContactDetail;
/**
* auto generated from SQL files
*/
public class ContactDetailServiceImpl implements ContactDetailService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ContactDetailDao dao;

  @Inject
  public ContactDetailServiceImpl(final ContactDetailDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ContactDetail find(String id) {
    final ContactDetail result = dao.find(id);
    logger.info("find(ContactDetail) - exited - return value={} result ");
    return result;
  }

  public List<ContactDetail> select(int maxResult) {
      final List<ContactDetail> result = dao.select(maxResult);
      logger.info("select(ContactDetail) - exited - return value={} result ");

      return result;
  }

  public List<ContactDetail> selectAll() {
      final List<ContactDetail> results = dao.selectAll();
      logger.info("selectAll(ContactDetail) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ContactDetail create(ContactDetail bean) {
  	requireNonNull(bean);
    logger.info("create(ContactDetail={}) - entered bean ");

    final ContactDetail result = dao.create(bean);

    logger.info("create(ContactDetail) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ContactDetail update(ContactDetail bean) {
  	requireNonNull(bean);
    logger.info("update(ContactDetail={}) - entered bean ");

    final ContactDetail result = dao.update(bean);

    logger.info("update(ContactDetail) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(ContactDetail bean) {
  	requireNonNull(bean);
    logger.info("delete(ContactDetail={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(ContactDetail) - exited - return value={} result ");
  }
}