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
import org.fhir.pojo.EpisodeOfCare;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class EpisodeOfCareServiceImpl implements EpisodeOfCareService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final EpisodeOfCareDao dao;

  @Inject
  public EpisodeOfCareServiceImpl(final EpisodeOfCareDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public EpisodeOfCare find(String id) {
    final EpisodeOfCare result = dao.find(id);
    logger.info("find(EpisodeOfCare) - exited - return value={} result ");
    return result;
  }

  public List<EpisodeOfCare> select(int maxResult) {
      final List<EpisodeOfCare> result = dao.select(maxResult);
      logger.info("select(EpisodeOfCare) - exited - return value={} result ");

      return result;
  }

  public List<EpisodeOfCare> selectAll() {
      final List<EpisodeOfCare> results = dao.selectAll();
      logger.info("selectAll(EpisodeOfCare) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public EpisodeOfCare create(EpisodeOfCare bean) {
  	requireNonNull(bean);
    logger.info("create(EpisodeOfCare={}) - entered bean ");

    final EpisodeOfCare result = dao.create(bean);

    logger.info("create(EpisodeOfCare) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public EpisodeOfCare update(EpisodeOfCare bean) {
  	requireNonNull(bean);
    logger.info("update(EpisodeOfCare={}) - entered bean ");

    final EpisodeOfCare result = dao.update(bean);

    logger.info("update(EpisodeOfCare) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(EpisodeOfCare={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(EpisodeOfCare) - exited - return value={} result ");
  }

  @Override
  public List<EpisodeOfCare> findByField(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<EpisodeOfCare> findByStatusHistory(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByStatusHistory(queryBuilder);
    logger.info("findBystatusHistory - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByType(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByType(queryBuilder);
    logger.info("findBytype - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByDiagnosis(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByDiagnosis(queryBuilder);
    logger.info("findBydiagnosis - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByPatient(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByManagingOrganization(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByManagingOrganization(queryBuilder);
    logger.info("findBymanagingOrganization - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByReferralRequest(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByReferralRequest(queryBuilder);
    logger.info("findByreferralRequest - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByCareManager(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByCareManager(queryBuilder);
    logger.info("findBycareManager - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByTeam(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByTeam(queryBuilder);
    logger.info("findByteam - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByAccount(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByAccount(queryBuilder);
    logger.info("findByaccount - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByText(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<EpisodeOfCare> findByMeta(QueryBuilder queryBuilder) {
  	final List<EpisodeOfCare> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}