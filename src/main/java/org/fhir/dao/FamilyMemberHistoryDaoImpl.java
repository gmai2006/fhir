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

package org.fhir.dao;

import static java.util.Objects.requireNonNull;
import java.util.List;
import java.util.logging.Logger;
import org.fhir.entity.*;
import javax.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.inject.Provider;

import org.fhir.entity.FamilyMemberHistoryModel;
import org.fhir.pojo.FamilyMemberHistory;
import org.fhir.pojo.FamilyMemberHistoryHelper;
import org.fhir.utils.QueryBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public class FamilyMemberHistoryDaoImpl implements FamilyMemberHistoryDao {
	private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public FamilyMemberHistoryDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public FamilyMemberHistory find(String id) {
    final EntityManager em = entityManagerProvider.get();
    FamilyMemberHistoryModel model = em.find(FamilyMemberHistoryModel.class, id);
    if (null == model) return null;
    return new FamilyMemberHistory(model);
  }

  @Override
  public List<FamilyMemberHistory> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from FamilyMemberHistoryModel a", FamilyMemberHistoryModel.class).setMaxResults(maxResult);
      List<FamilyMemberHistoryModel> models = query.getResultList();
      return FamilyMemberHistoryHelper.fromArray2Array(models);
  }

  @Override
  public List<FamilyMemberHistory> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from FamilyMemberHistoryModel a", FamilyMemberHistoryModel.class);
      List<FamilyMemberHistoryModel> models = query.getResultList();
      return FamilyMemberHistoryHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public FamilyMemberHistory create(FamilyMemberHistory e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new FamilyMemberHistoryModel(e));
      return e;
  }

  @Transactional
  public FamilyMemberHistory update(FamilyMemberHistory e) {
      final EntityManager em = entityManagerProvider.get();
      FamilyMemberHistoryModel model = em.merge(new FamilyMemberHistoryModel(e));
      return new FamilyMemberHistory(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final FamilyMemberHistoryModel removed = em.find(FamilyMemberHistoryModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<FamilyMemberHistory> findByDefinition(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, Reference b where a.definition_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<FamilyMemberHistory> findByNotDoneReason(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, CodeableConcept b where a.notDoneReason_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<FamilyMemberHistory> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<FamilyMemberHistory> findByRelationship(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, CodeableConcept b where a.relationship_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<FamilyMemberHistory> findByReasonCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, CodeableConcept b where a.reasonCode_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<FamilyMemberHistory> findByReasonReference(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, Reference b where a.reasonReference_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<FamilyMemberHistory> findByCondition(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, FamilyMemberHistoryCondition b where a.condition_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<FamilyMemberHistory> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<FamilyMemberHistory> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<FamilyMemberHistory> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from FamilyMemberHistoryModel a " + queryBuilder.getWhereClause();
  	logger.info(queryStr);
    return findByQuery(queryBuilder, queryStr);
  }

  private List<FamilyMemberHistory> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, FamilyMemberHistoryModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<FamilyMemberHistoryModel> models = query.getResultList();
    return FamilyMemberHistoryHelper.fromArray2Array(models);
  }
}