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
import org.fhir.pojo.Person;
/**
* auto generated from SQL files
*/
public class PersonServiceImpl implements PersonService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final PersonDao dao;

  @Inject
  public PersonServiceImpl(final PersonDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Person find(String id) {
    final Person result = dao.find(id);
    logger.info("find(Person) - exited - return value={} result ");
    return result;
  }

  public List<Person> select(int maxResult) {
      final List<Person> result = dao.select(maxResult);
      logger.info("select(Person) - exited - return value={} result ");

      return result;
  }

  public List<Person> selectAll() {
      final List<Person> results = dao.selectAll();
      logger.info("selectAll(Person) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Person create(Person bean) {
  	requireNonNull(bean);
    logger.info("create(Person={}) - entered bean ");

    final Person result = dao.create(bean);

    logger.info("create(Person) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Person update(Person bean) {
  	requireNonNull(bean);
    logger.info("update(Person={}) - entered bean ");

    final Person result = dao.update(bean);

    logger.info("update(Person) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Person={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Person) - exited - return value={} result ");
  }

  @Override
  public List<Person> findByField(QueryBuilder queryBuilder) {
  	final List<Person> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Person> findByAddress(QueryBuilder queryBuilder) {
  	final List<Person> result = dao.findByAddress(queryBuilder);
    logger.info("findByaddress - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Person> findByManagingOrganization(QueryBuilder queryBuilder) {
  	final List<Person> result = dao.findByManagingOrganization(queryBuilder);
    logger.info("findBymanagingOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Person> findByLink(QueryBuilder queryBuilder) {
  	final List<Person> result = dao.findByLink(queryBuilder);
    logger.info("findBylink - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Person> findByText(QueryBuilder queryBuilder) {
  	final List<Person> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Person> findByMeta(QueryBuilder queryBuilder) {
  	final List<Person> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}