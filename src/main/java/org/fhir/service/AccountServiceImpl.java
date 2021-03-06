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
import org.fhir.pojo.Account;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class AccountServiceImpl implements AccountService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final AccountDao dao;

  @Inject
  public AccountServiceImpl(final AccountDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Account find(String id) {
    final Account result = dao.find(id);
    logger.info("find(Account) - exited - return value={} result ");
    return result;
  }

  public List<Account> select(int maxResult) {
      final List<Account> result = dao.select(maxResult);
      logger.info("select(Account) - exited - return value={} result ");

      return result;
  }

  public List<Account> selectAll() {
      final List<Account> results = dao.selectAll();
      logger.info("selectAll(Account) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Account create(Account bean) {
  	requireNonNull(bean);
    logger.info("create(Account={}) - entered bean ");

    final Account result = dao.create(bean);

    logger.info("create(Account) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Account update(Account bean) {
  	requireNonNull(bean);
    logger.info("update(Account={}) - entered bean ");

    final Account result = dao.update(bean);

    logger.info("update(Account) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(Account={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(Account) - exited - return value={} result ");
  }

  @Override
  public List<Account> findByField(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Account> findByType(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Account> findBySubject(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Account> findByBalance(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findByBalance(queryBuilder);
    logger.info("findBybalance - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Account> findByCoverage(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findByCoverage(queryBuilder);
    logger.info("findBycoverage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Account> findByOwner(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findByOwner(queryBuilder);
    logger.info("findByowner - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Account> findByGuarantor(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findByGuarantor(queryBuilder);
    logger.info("findByguarantor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Account> findByText(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Account> findByMeta(QueryBuilder queryBuilder) {
  	final List<Account> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}