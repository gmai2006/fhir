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
import org.fhir.pojo.Slot;
/**
* auto generated from SQL files
*/
public class SlotServiceImpl implements SlotService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final SlotDao dao;

  @Inject
  public SlotServiceImpl(final SlotDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Slot find(String id) {
    final Slot result = dao.find(id);
    logger.info("find(Slot) - exited - return value={} result ");
    return result;
  }

  public List<Slot> select(int maxResult) {
      final List<Slot> result = dao.select(maxResult);
      logger.info("select(Slot) - exited - return value={} result ");

      return result;
  }

  public List<Slot> selectAll() {
      final List<Slot> results = dao.selectAll();
      logger.info("selectAll(Slot) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Slot create(Slot bean) {
  	requireNonNull(bean);
    logger.info("create(Slot={}) - entered bean ");

    final Slot result = dao.create(bean);

    logger.info("create(Slot) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Slot update(Slot bean) {
  	requireNonNull(bean);
    logger.info("update(Slot={}) - entered bean ");

    final Slot result = dao.update(bean);

    logger.info("update(Slot) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Slot bean) {
  	requireNonNull(bean);
    logger.info("delete(Slot={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Slot) - exited - return value={} result ");
  }

  @Override
  public List<Slot> findByField(QueryBuilder queryBuilder) {
  	final List<Slot> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Slot> findBySchedule(QueryBuilder queryBuilder) {
  	final List<Slot> result = dao.findBySchedule(queryBuilder);
    logger.info("findByschedule - exited - return value={} result ");
    return result;
  }
}