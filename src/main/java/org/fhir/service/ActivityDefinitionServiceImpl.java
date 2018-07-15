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
import org.fhir.pojo.ActivityDefinition;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public class ActivityDefinitionServiceImpl implements ActivityDefinitionService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final ActivityDefinitionDao dao;

  @Inject
  public ActivityDefinitionServiceImpl(final ActivityDefinitionDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public ActivityDefinition find(String id) {
    final ActivityDefinition result = dao.find(id);
    logger.info("find(ActivityDefinition) - exited - return value={} result ");
    return result;
  }

  public List<ActivityDefinition> select(int maxResult) {
      final List<ActivityDefinition> result = dao.select(maxResult);
      logger.info("select(ActivityDefinition) - exited - return value={} result ");

      return result;
  }

  public List<ActivityDefinition> selectAll() {
      final List<ActivityDefinition> results = dao.selectAll();
      logger.info("selectAll(ActivityDefinition) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public ActivityDefinition create(ActivityDefinition bean) {
  	requireNonNull(bean);
    logger.info("create(ActivityDefinition={}) - entered bean ");

    final ActivityDefinition result = dao.create(bean);

    logger.info("create(ActivityDefinition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public ActivityDefinition update(ActivityDefinition bean) {
  	requireNonNull(bean);
    logger.info("update(ActivityDefinition={}) - entered bean ");

    final ActivityDefinition result = dao.update(bean);

    logger.info("update(ActivityDefinition) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(String id) {
    logger.info("delete(ActivityDefinition={}) - entered id " + id);
    dao.delete(id);
    logger.info("delete(ActivityDefinition) - exited - return value={} result ");
  }

  @Override
  public List<ActivityDefinition> findByField(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<ActivityDefinition> findByUseContext(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByUseContext(queryBuilder);
    logger.info("findByuseContext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByJurisdiction(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByJurisdiction(queryBuilder);
    logger.info("findByjurisdiction - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByTopic(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByTopic(queryBuilder);
    logger.info("findBytopic - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByContributor(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByContributor(queryBuilder);
    logger.info("findBycontributor - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByContact(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByContact(queryBuilder);
    logger.info("findBycontact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByRelatedArtifact(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByRelatedArtifact(queryBuilder);
    logger.info("findByrelatedArtifact - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByLibrary(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByLibrary(queryBuilder);
    logger.info("findBylibrary - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByCode(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByCode(queryBuilder);
    logger.info("findBycode - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByLocation(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByLocation(queryBuilder);
    logger.info("findBylocation - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByParticipant(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByParticipant(queryBuilder);
    logger.info("findByparticipant - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByProductReference(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByProductReference(queryBuilder);
    logger.info("findByproductReference - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByProductCodeableConcept(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByProductCodeableConcept(queryBuilder);
    logger.info("findByproductCodeableConcept - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByQuantity(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByQuantity(queryBuilder);
    logger.info("findByquantity - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByDosage(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByDosage(queryBuilder);
    logger.info("findBydosage - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByBodySite(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByBodySite(queryBuilder);
    logger.info("findBybodySite - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByTransform(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByTransform(queryBuilder);
    logger.info("findBytransform - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByDynamicValue(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByDynamicValue(queryBuilder);
    logger.info("findBydynamicValue - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByText(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<ActivityDefinition> findByMeta(QueryBuilder queryBuilder) {
  	final List<ActivityDefinition> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}