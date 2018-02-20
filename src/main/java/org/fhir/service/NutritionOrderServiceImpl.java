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
import org.fhir.pojo.NutritionOrder;
/**
* auto generated from SQL files
*/
public class NutritionOrderServiceImpl implements NutritionOrderService {
private final Logger logger = Logger.getLogger(this.getClass().getName());

  private final NutritionOrderDao dao;

  @Inject
  public NutritionOrderServiceImpl(final NutritionOrderDao dao) {
      requireNonNull(dao);
      this.dao = dao;
  }

  public NutritionOrder find(String id) {
    final NutritionOrder result = dao.find(id);
    logger.info("find(NutritionOrder) - exited - return value={} result ");
    return result;
  }

  public List<NutritionOrder> select(int maxResult) {
      final List<NutritionOrder> result = dao.select(maxResult);
      logger.info("select(NutritionOrder) - exited - return value={} result ");

      return result;
  }

  public List<NutritionOrder> selectAll() {
      final List<NutritionOrder> results = dao.selectAll();
      logger.info("selectAll(NutritionOrder) - exited - return value={} result ");
      return results;
  }

  @Override
  @Transactional
  public NutritionOrder create(NutritionOrder bean) {
  	requireNonNull(bean);
    logger.info("create(NutritionOrder={}) - entered bean ");

    final NutritionOrder result = dao.create(bean);

    logger.info("create(NutritionOrder) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public NutritionOrder update(NutritionOrder bean) {
  	requireNonNull(bean);
    logger.info("update(NutritionOrder={}) - entered bean ");

    final NutritionOrder result = dao.update(bean);

    logger.info("update(NutritionOrder) - exited - return value={} result ");
    return result;
  }

  @Override
  @Transactional
  public void delete(NutritionOrder bean) {
  	requireNonNull(bean);
    logger.info("delete(NutritionOrder={}) - entered bean");

    dao.delete(bean);

    logger.info("delete(NutritionOrder) - exited - return value={} result ");
  }

  @Override
  public List<NutritionOrder> findByField(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByField(queryBuilder);
    logger.info("findByField- exited - return value={} result ");
    return result;
  }

  @Override
  public List<NutritionOrder> findByPatient(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByPatient(queryBuilder);
    logger.info("findBypatient - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByEncounter(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByEncounter(queryBuilder);
    logger.info("findByencounter - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByOrderer(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByOrderer(queryBuilder);
    logger.info("findByorderer - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByAllergyIntolerance(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByAllergyIntolerance(queryBuilder);
    logger.info("findByallergyIntolerance - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByFoodPreferenceModifier(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByFoodPreferenceModifier(queryBuilder);
    logger.info("findByfoodPreferenceModifier - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByExcludeFoodModifier(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByExcludeFoodModifier(queryBuilder);
    logger.info("findByexcludeFoodModifier - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByOralDiet(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByOralDiet(queryBuilder);
    logger.info("findByoralDiet - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findBySupplement(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findBySupplement(queryBuilder);
    logger.info("findBysupplement - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByEnteralFormula(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByEnteralFormula(queryBuilder);
    logger.info("findByenteralFormula - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByText(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByText(queryBuilder);
    logger.info("findBytext - exited - return value={} result ");
    return result;
  }
  @Override
  public List<NutritionOrder> findByMeta(QueryBuilder queryBuilder) {
  	final List<NutritionOrder> result = dao.findByMeta(queryBuilder);
    logger.info("findBymeta - exited - return value={} result ");
    return result;
  }
}