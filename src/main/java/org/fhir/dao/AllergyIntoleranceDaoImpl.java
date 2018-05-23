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

import org.fhir.entity.AllergyIntoleranceModel;
import org.fhir.pojo.AllergyIntolerance;
import org.fhir.pojo.AllergyIntoleranceHelper;
import org.fhir.utils.QueryBuilder;

public class AllergyIntoleranceDaoImpl implements AllergyIntoleranceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AllergyIntoleranceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public AllergyIntolerance find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AllergyIntoleranceModel model = em.find(AllergyIntoleranceModel.class, id);
    if (null == model) return null;
    return new AllergyIntolerance(model);
  }

  @Override
  public List<AllergyIntolerance> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AllergyIntoleranceModel a", AllergyIntoleranceModel.class).setMaxResults(maxResult);
      List<AllergyIntoleranceModel> models = query.getResultList();
      return AllergyIntoleranceHelper.fromArray2Array(models);
  }

  @Override
  public List<AllergyIntolerance> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AllergyIntoleranceModel a", AllergyIntoleranceModel.class);
      List<AllergyIntoleranceModel> models = query.getResultList();
      return AllergyIntoleranceHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public AllergyIntolerance create(AllergyIntolerance e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AllergyIntoleranceModel(e));
      return e;
  }

  @Transactional
  public AllergyIntolerance update(AllergyIntolerance e) {
      final EntityManager em = entityManagerProvider.get();
      AllergyIntoleranceModel model = em.merge(new AllergyIntoleranceModel(e));
      return new AllergyIntolerance(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final AllergyIntoleranceModel removed = em.find(AllergyIntoleranceModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<AllergyIntolerance> findByCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AllergyIntoleranceModel a, CodeableConcept b where a.code_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<AllergyIntolerance> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AllergyIntoleranceModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<AllergyIntolerance> findByRecorder(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AllergyIntoleranceModel a, Reference b where a.recorder_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<AllergyIntolerance> findByAsserter(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AllergyIntoleranceModel a, Reference b where a.asserter_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<AllergyIntolerance> findByReaction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AllergyIntoleranceModel a, AllergyIntoleranceReaction b where a.reaction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<AllergyIntolerance> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AllergyIntoleranceModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<AllergyIntolerance> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AllergyIntoleranceModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<AllergyIntolerance> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AllergyIntoleranceModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<AllergyIntolerance> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, AllergyIntoleranceModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<AllergyIntoleranceModel> models = query.getResultList();
    return AllergyIntoleranceHelper.fromArray2Array(models);
  }
}