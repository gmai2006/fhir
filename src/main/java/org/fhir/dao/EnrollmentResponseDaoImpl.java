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

import org.fhir.entity.EnrollmentResponseModel;
import org.fhir.pojo.EnrollmentResponse;
import org.fhir.pojo.EnrollmentResponseHelper;
import org.fhir.utils.QueryBuilder;

public class EnrollmentResponseDaoImpl implements EnrollmentResponseDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EnrollmentResponseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public EnrollmentResponse find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EnrollmentResponseModel model = em.find(EnrollmentResponseModel.class, id);
    if (null == model) return null;
    return new EnrollmentResponse(model);
  }

  @Override
  public List<EnrollmentResponse> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EnrollmentResponseModel a", EnrollmentResponseModel.class).setMaxResults(maxResult);
      List<EnrollmentResponseModel> models = query.getResultList();
      return EnrollmentResponseHelper.fromArray2Array(models);
  }

  @Override
  public List<EnrollmentResponse> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EnrollmentResponseModel a", EnrollmentResponseModel.class);
      List<EnrollmentResponseModel> models = query.getResultList();
      return EnrollmentResponseHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public EnrollmentResponse create(EnrollmentResponse e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new EnrollmentResponseModel(e));
      return e;
  }

  @Transactional
  public EnrollmentResponse update(EnrollmentResponse e) {
      final EntityManager em = entityManagerProvider.get();
      EnrollmentResponseModel model = em.merge(new EnrollmentResponseModel(e));
      return new EnrollmentResponse(model);
  }
  @Override
  @Transactional
  public void delete(EnrollmentResponse e) {
      final EntityManager em = entityManagerProvider.get();
      final EnrollmentResponseModel removed = em.find(EnrollmentResponseModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<EnrollmentResponse> findByOrganization(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EnrollmentResponseModel a, Reference b where a.organization_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<EnrollmentResponse> findByRequest(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EnrollmentResponseModel a, Reference b where a.request_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<EnrollmentResponse> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from EnrollmentResponseModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<EnrollmentResponse> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, EnrollmentResponseModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<EnrollmentResponseModel> models = query.getResultList();
    return EnrollmentResponseHelper.fromArray2Array(models);
  }
}