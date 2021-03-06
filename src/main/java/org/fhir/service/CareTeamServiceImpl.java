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
import org.fhir.pojo.CareTeam;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class CareTeamServiceImpl implements CareTeamService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final CareTeamDao dao;

  @Inject
  public CareTeamServiceImpl(final CareTeamDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public CareTeam find(String id) {
    final CareTeam result = dao.find(id);
    logger.info("find(CareTeam) - exited - return value={} result ");
    return result;
  }

  public List<CareTeam> select(int maxResult) {
      final List<CareTeam> result = dao.select(maxResult);
      logger.info("select(CareTeam) - exited - return value={} result ");

      return result;
  }

  public List<CareTeam> selectAll() {
      final List<CareTeam> results = dao.selectAll();
      logger.info("selectAll(CareTeam) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public CareTeam create(CareTeam bean) {
  	requireNonNull(bean);
    logger.info("create(CareTeam={}) - entered bean ");

    final CareTeam result = dao.create(bean);

    logger.info("create(CareTeam) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public CareTeam update(CareTeam bean) {
  	requireNonNull(bean);
    logger.info("update(CareTeam={}) - entered bean ");

    final CareTeam result = dao.update(bean);

    logger.info("update(CareTeam) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(CareTeam={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(CareTeam) - exited - return value={} result ");
  }

  @Override
  public List<CareTeam> findByField(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<CareTeam> findByCategory(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByCategory(queryBuilder);
    logger.info("findBycategory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CareTeam> findBySubject(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findBySubject(queryBuilder);
    logger.info("findBysubject - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CareTeam> findByContext(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByContext(queryBuilder);
    logger.info("findBycontext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CareTeam> findByParticipant(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByParticipant(queryBuilder);
    logger.info("findByparticipant - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CareTeam> findByReasonCode(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByReasonCode(queryBuilder);
    logger.info("findByreasonCode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CareTeam> findByReasonReference(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByReasonReference(queryBuilder);
    logger.info("findByreasonReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CareTeam> findByManagingOrganization(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByManagingOrganization(queryBuilder);
    logger.info("findBymanagingOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CareTeam> findByText(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<CareTeam> findByMeta(QueryBuilder queryBuilder) {
  	final List<CareTeam> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}