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
import org.fhir.pojo.Contract;
/**
* auto generated from SQL files
*/
public class ContractServiceImpl implements ContractService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ContractDao dao;

  @Inject
  public ContractServiceImpl(final ContractDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public Contract find(String id) {
    final Contract result = dao.find(id);
    logger.info("find(Contract) - exited - return value={} result ");
    return result;
  }

  public List<Contract> select(int maxResult) {
      final List<Contract> result = dao.select(maxResult);
      logger.info("select(Contract) - exited - return value={} result ");

      return result;
  }

  public List<Contract> selectAll() {
      final List<Contract> results = dao.selectAll();
      logger.info("selectAll(Contract) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public Contract create(Contract bean) {
  	requireNonNull(bean);
    logger.info("create(Contract={}) - entered bean ");

    final Contract result = dao.create(bean);

    logger.info("create(Contract) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public Contract update(Contract bean) {
  	requireNonNull(bean);
    logger.info("update(Contract={}) - entered bean ");

    final Contract result = dao.update(bean);

    logger.info("update(Contract) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(Contract bean) {
  	requireNonNull(bean);
    logger.info("delete(Contract={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(Contract) - exited - return value={} result ");
  }

  @Override
  public List<Contract> findByField(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<Contract> findBySubject(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByTopic(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByTopic(queryBuilder);
    logger.info("findBytopic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByAuthority(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByAuthority(queryBuilder);
    logger.info("findByauthority - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByDomain(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByDomain(queryBuilder);
    logger.info("findBydomain - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByType(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findBySubType(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findBySubType(queryBuilder);
    logger.info("findBysubType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByAction(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByAction(queryBuilder);
    logger.info("findByaction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByActionReason(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByActionReason(queryBuilder);
    logger.info("findByactionReason - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByDecisionType(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByDecisionType(queryBuilder);
    logger.info("findBydecisionType - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByContentDerivative(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByContentDerivative(queryBuilder);
    logger.info("findBycontentDerivative - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findBySecurityLabel(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findBySecurityLabel(queryBuilder);
    logger.info("findBysecurityLabel - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByAgent(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByAgent(queryBuilder);
    logger.info("findByagent - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findBySigner(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findBySigner(queryBuilder);
    logger.info("findBysigner - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByValuedItem(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByValuedItem(queryBuilder);
    logger.info("findByvaluedItem - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByTerm(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByTerm(queryBuilder);
    logger.info("findByterm - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByBindingReference(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByBindingReference(queryBuilder);
    logger.info("findBybindingReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByFriendly(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByFriendly(queryBuilder);
    logger.info("findByfriendly - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByLegal(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByLegal(queryBuilder);
    logger.info("findBylegal - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByRule(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByRule(queryBuilder);
    logger.info("findByrule - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByText(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<Contract> findByMeta(QueryBuilder queryBuilder) {
  	final List<Contract> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}