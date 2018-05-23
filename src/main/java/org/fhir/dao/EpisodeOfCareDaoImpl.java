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
import org.fhir.entity.*;
import javax.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.inject.Provider;

import org.fhir.entity.EpisodeOfCareModel;
import org.fhir.pojo.EpisodeOfCare;
import org.fhir.pojo.EpisodeOfCareHelper;
import org.fhir.utils.QueryBuilder;

public class EpisodeOfCareDaoImpl implements EpisodeOfCareDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EpisodeOfCareDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public EpisodeOfCare find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EpisodeOfCareModel model = em.find(EpisodeOfCareModel.class, id);
    if (null == model) return null;
    return new EpisodeOfCare(model);
  }

  @Override
  public List<EpisodeOfCare> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EpisodeOfCareModel a", EpisodeOfCareModel.class).setMaxResults(maxResult);
      List<EpisodeOfCareModel> models = query.getResultList();
      return EpisodeOfCareHelper.fromArray2Array(models);
  }

  @Override
  public List<EpisodeOfCare> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EpisodeOfCareModel a", EpisodeOfCareModel.class);
      List<EpisodeOfCareModel> models = query.getResultList();
      return EpisodeOfCareHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public EpisodeOfCare create(EpisodeOfCare e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new EpisodeOfCareModel(e));
      return e;
  }

  @Transactional
  public EpisodeOfCare update(EpisodeOfCare e) {
      final EntityManager em = entityManagerProvider.get();
      EpisodeOfCareModel model = em.merge(new EpisodeOfCareModel(e));
      return new EpisodeOfCare(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final EpisodeOfCareModel removed = em.find(EpisodeOfCareModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<EpisodeOfCare> findByStatusHistory(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, EpisodeOfCareStatusHistory b where a.statusHistory_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByDiagnosis(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, EpisodeOfCareDiagnosis b where a.diagnosis_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByManagingOrganization(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, Reference b where a.managingOrganization_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByReferralRequest(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, Reference b where a.referralRequest_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByCareManager(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, Reference b where a.careManager_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByTeam(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, Reference b where a.team_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByAccount(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, Reference b where a.account_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EpisodeOfCare> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<EpisodeOfCare> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EpisodeOfCareModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<EpisodeOfCare> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, EpisodeOfCareModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<EpisodeOfCareModel> models = query.getResultList();
    return EpisodeOfCareHelper.fromArray2Array(models);
  }
}