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

import org.fhir.entity.MedicationRequestModel;
import org.fhir.pojo.MedicationRequest;
import org.fhir.pojo.MedicationRequestHelper;
import org.fhir.utils.QueryBuilder;

public class MedicationRequestDaoImpl implements MedicationRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationRequestModel model = em.find(MedicationRequestModel.class, id);
    if (null == model) return null;
    return new MedicationRequest(model);
  }

  @Override
  public List<MedicationRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationRequestModel a", MedicationRequestModel.class).setMaxResults(maxResult);
      List<MedicationRequestModel> models = query.getResultList();
      return MedicationRequestHelper.fromArray2Array(models);
  }

  @Override
  public List<MedicationRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationRequestModel a", MedicationRequestModel.class);
      List<MedicationRequestModel> models = query.getResultList();
      return MedicationRequestHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public MedicationRequest create(MedicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationRequestModel(e));
      return e;
  }

  @Transactional
  public MedicationRequest update(MedicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationRequestModel model = em.merge(new MedicationRequestModel(e));
      return new MedicationRequest(model);
  }
  @Override
  @Transactional
  public void delete(MedicationRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationRequestModel removed = em.find(MedicationRequestModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<MedicationRequest> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationRequestModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationRequest> findByRequester(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationRequestModel a, MedicationRequestRequester b where a.requester_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationRequest> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationRequestModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<MedicationRequest> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationRequestModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<MedicationRequest> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, MedicationRequestModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<MedicationRequestModel> models = query.getResultList();
    return MedicationRequestHelper.fromArray2Array(models);
  }
}