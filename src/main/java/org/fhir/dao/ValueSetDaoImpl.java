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

import org.fhir.entity.ValueSetModel;
import org.fhir.pojo.ValueSet;
import org.fhir.pojo.ValueSetHelper;
import org.fhir.utils.QueryBuilder;

public class ValueSetDaoImpl implements ValueSetDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ValueSetDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ValueSet find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ValueSetModel model = em.find(ValueSetModel.class, id);
    if (null == model) return null;
    return new ValueSet(model);
  }

  @Override
  public List<ValueSet> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ValueSetModel a", ValueSetModel.class).setMaxResults(maxResult);
      List<ValueSetModel> models = query.getResultList();
      return ValueSetHelper.fromArray2Array(models);
  }

  @Override
  public List<ValueSet> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ValueSetModel a", ValueSetModel.class);
      List<ValueSetModel> models = query.getResultList();
      return ValueSetHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ValueSet create(ValueSet e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ValueSetModel(e));
      return e;
  }

  @Transactional
  public ValueSet update(ValueSet e) {
      final EntityManager em = entityManagerProvider.get();
      ValueSetModel model = em.merge(new ValueSetModel(e));
      return new ValueSet(model);
  }
  @Override
  @Transactional
  public void delete(ValueSet e) {
      final EntityManager em = entityManagerProvider.get();
      final ValueSetModel removed = em.find(ValueSetModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<ValueSet> findByContact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ValueSetModel a, ContactDetail b where a.contact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ValueSet> findByUseContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ValueSetModel a, UsageContext b where a.useContext_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ValueSet> findByJurisdiction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ValueSetModel a, CodeableConcept b where a.jurisdiction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ValueSet> findByCompose(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ValueSetModel a, ValueSetCompose b where a.compose_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ValueSet> findByExpansion(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ValueSetModel a, ValueSetExpansion b where a.expansion_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ValueSet> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ValueSetModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ValueSet> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ValueSetModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ValueSet> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ValueSetModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ValueSet> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ValueSetModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ValueSetModel> models = query.getResultList();
    return ValueSetHelper.fromArray2Array(models);
  }
}