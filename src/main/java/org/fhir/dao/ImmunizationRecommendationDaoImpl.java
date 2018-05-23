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

import org.fhir.entity.ImmunizationRecommendationModel;
import org.fhir.pojo.ImmunizationRecommendation;
import org.fhir.pojo.ImmunizationRecommendationHelper;
import org.fhir.utils.QueryBuilder;

public class ImmunizationRecommendationDaoImpl implements ImmunizationRecommendationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImmunizationRecommendationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImmunizationRecommendation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImmunizationRecommendationModel model = em.find(ImmunizationRecommendationModel.class, id);
    if (null == model) return null;
    return new ImmunizationRecommendation(model);
  }

  @Override
  public List<ImmunizationRecommendation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationRecommendationModel a", ImmunizationRecommendationModel.class).setMaxResults(maxResult);
      List<ImmunizationRecommendationModel> models = query.getResultList();
      return ImmunizationRecommendationHelper.fromArray2Array(models);
  }

  @Override
  public List<ImmunizationRecommendation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationRecommendationModel a", ImmunizationRecommendationModel.class);
      List<ImmunizationRecommendationModel> models = query.getResultList();
      return ImmunizationRecommendationHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ImmunizationRecommendation create(ImmunizationRecommendation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImmunizationRecommendationModel(e));
      return e;
  }

  @Transactional
  public ImmunizationRecommendation update(ImmunizationRecommendation e) {
      final EntityManager em = entityManagerProvider.get();
      ImmunizationRecommendationModel model = em.merge(new ImmunizationRecommendationModel(e));
      return new ImmunizationRecommendation(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final ImmunizationRecommendationModel removed = em.find(ImmunizationRecommendationModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<ImmunizationRecommendation> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ImmunizationRecommendationModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ImmunizationRecommendation> findByRecommendation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ImmunizationRecommendationModel a, ImmunizationRecommendationRecommendation b where a.recommendation_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ImmunizationRecommendation> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ImmunizationRecommendationModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ImmunizationRecommendation> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ImmunizationRecommendationModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ImmunizationRecommendation> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ImmunizationRecommendationModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ImmunizationRecommendation> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ImmunizationRecommendationModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ImmunizationRecommendationModel> models = query.getResultList();
    return ImmunizationRecommendationHelper.fromArray2Array(models);
  }
}