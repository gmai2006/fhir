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

import org.fhir.entity.ExpansionProfileModel;
import org.fhir.pojo.ExpansionProfile;
import org.fhir.pojo.ExpansionProfileHelper;
import org.fhir.utils.QueryBuilder;

public class ExpansionProfileDaoImpl implements ExpansionProfileDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExpansionProfileDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExpansionProfile find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExpansionProfileModel model = em.find(ExpansionProfileModel.class, id);
    if (null == model) return null;
    return new ExpansionProfile(model);
  }

  @Override
  public List<ExpansionProfile> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExpansionProfileModel a", ExpansionProfileModel.class).setMaxResults(maxResult);
      List<ExpansionProfileModel> models = query.getResultList();
      return ExpansionProfileHelper.fromArray2Array(models);
  }

  @Override
  public List<ExpansionProfile> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExpansionProfileModel a", ExpansionProfileModel.class);
      List<ExpansionProfileModel> models = query.getResultList();
      return ExpansionProfileHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ExpansionProfile create(ExpansionProfile e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExpansionProfileModel(e));
      return e;
  }

  @Transactional
  public ExpansionProfile update(ExpansionProfile e) {
      final EntityManager em = entityManagerProvider.get();
      ExpansionProfileModel model = em.merge(new ExpansionProfileModel(e));
      return new ExpansionProfile(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final ExpansionProfileModel removed = em.find(ExpansionProfileModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<ExpansionProfile> findByContact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a, ContactDetail b where a.contact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExpansionProfile> findByUseContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a, UsageContext b where a.useContext_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExpansionProfile> findByJurisdiction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a, CodeableConcept b where a.jurisdiction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExpansionProfile> findByFixedVersion(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a, ExpansionProfileFixedVersion b where a.fixedVersion_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExpansionProfile> findByExcludedSystem(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a, ExpansionProfileExcludedSystem b where a.excludedSystem_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExpansionProfile> findByDesignation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a, ExpansionProfileDesignation b where a.designation_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExpansionProfile> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ExpansionProfile> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ExpansionProfile> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ExpansionProfileModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ExpansionProfile> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ExpansionProfileModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ExpansionProfileModel> models = query.getResultList();
    return ExpansionProfileHelper.fromArray2Array(models);
  }
}