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
import org.fhir.pojo.Group;
/**
* auto generated from SQL files
*/
public class GroupServiceImpl implements GroupService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final GroupDao dao;

  @Inject
  public GroupServiceImpl(final GroupDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Group find(String id) {
    final Group result = dao.find(id);
    logger.info("find(Group) - exited - return value={} result ");
    return result;
  }

  public List<Group> select(int maxResult) {
      final List<Group> result = dao.select(maxResult);
      logger.info("select(Group) - exited - return value={} result ");

      return result;
  }

  public List<Group> selectAll() {
      final List<Group> results = dao.selectAll();
      logger.info("selectAll(Group) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Group create(Group bean) {
  	requireNonNull(bean);
    logger.info("create(Group={}) - entered bean ");

    final Group result = dao.create(bean);

    logger.info("create(Group) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Group update(Group bean) {
  	requireNonNull(bean);
    logger.info("update(Group={}) - entered bean ");

    final Group result = dao.update(bean);

    logger.info("update(Group) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Group={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Group) - exited - return value={} result ");
  }

  @Override
  public List<Group> findByField(QueryBuilder queryBuilder) {
  	final List<Group> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Group> findByCode(QueryBuilder queryBuilder) {
  	final List<Group> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Group> findByCharacteristic(QueryBuilder queryBuilder) {
  	final List<Group> result = dao.findByCharacteristic(queryBuilder);
    logger.info("findBycharacteristic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Group> findByMember(QueryBuilder queryBuilder) {
  	final List<Group> result = dao.findByMember(queryBuilder);
    logger.info("findBymember - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Group> findByText(QueryBuilder queryBuilder) {
  	final List<Group> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Group> findByMeta(QueryBuilder queryBuilder) {
  	final List<Group> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}