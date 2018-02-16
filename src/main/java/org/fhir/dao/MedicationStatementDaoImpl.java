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

import org.fhir.entity.MedicationStatementModel;
import org.fhir.pojo.MedicationStatement;
import org.fhir.pojo.MedicationStatementHelper;
import org.fhir.utils.QueryBuilder;

public class MedicationStatementDaoImpl implements MedicationStatementDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationStatementDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationStatement find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationStatementModel model = em.find(MedicationStatementModel.class, id);
    if (null == model) return null;
    return new MedicationStatement(model);
  }

  @Override
  public List<MedicationStatement> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationStatementModel a", MedicationStatementModel.class).setMaxResults(maxResult);
      List<MedicationStatementModel> models = query.getResultList();
      return MedicationStatementHelper.fromArray2Array(models);
  }

  @Override
  public List<MedicationStatement> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationStatementModel a", MedicationStatementModel.class);
      List<MedicationStatementModel> models = query.getResultList();
      return MedicationStatementHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public MedicationStatement create(MedicationStatement e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationStatementModel(e));
      return e;
  }

  @Transactional
  public MedicationStatement update(MedicationStatement e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationStatementModel model = em.merge(new MedicationStatementModel(e));
      return new MedicationStatement(model);
  }
  @Override
  @Transactional
  public void delete(MedicationStatement e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationStatementModel removed = em.find(MedicationStatementModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<MedicationStatement> findByContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationStatementModel a, Reference b where a.context_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<MedicationStatement> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationStatementModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<MedicationStatement> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from MedicationStatementModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<MedicationStatement> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, MedicationStatementModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<MedicationStatementModel> models = query.getResultList();
    return MedicationStatementHelper.fromArray2Array(models);
  }
}