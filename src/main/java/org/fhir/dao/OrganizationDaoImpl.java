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

import org.fhir.entity.OrganizationModel;
import org.fhir.pojo.Organization;
import org.fhir.pojo.OrganizationHelper;
import org.fhir.utils.QueryBuilder;

public class OrganizationDaoImpl implements OrganizationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public OrganizationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Organization find(String id) {
    final EntityManager em = entityManagerProvider.get();
    OrganizationModel model = em.find(OrganizationModel.class, id);
    if (null == model) return null;
    return new Organization(model);
  }

  @Override
  public List<Organization> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OrganizationModel a", OrganizationModel.class).setMaxResults(maxResult);
      List<OrganizationModel> models = query.getResultList();
      return OrganizationHelper.fromArray2Array(models);
  }

  @Override
  public List<Organization> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OrganizationModel a", OrganizationModel.class);
      List<OrganizationModel> models = query.getResultList();
      return OrganizationHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Organization create(Organization e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new OrganizationModel(e));
      return e;
  }

  @Transactional
  public Organization update(Organization e) {
      final EntityManager em = entityManagerProvider.get();
      OrganizationModel model = em.merge(new OrganizationModel(e));
      return new Organization(model);
  }
  @Override
  @Transactional
  public void delete(Organization e) {
      final EntityManager em = entityManagerProvider.get();
      final OrganizationModel removed = em.find(OrganizationModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Organization> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from OrganizationModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Organization> findByAddress(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from OrganizationModel a, Address b where a.address_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Organization> findByPartOf(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from OrganizationModel a, Reference b where a.partOf_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Organization> findByContact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from OrganizationModel a, OrganizationContact b where a.contact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Organization> findByEndpoint(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from OrganizationModel a, Reference b where a.endpoint_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Organization> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from OrganizationModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Organization> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from OrganizationModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Organization> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from OrganizationModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Organization> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, OrganizationModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<OrganizationModel> models = query.getResultList();
    return OrganizationHelper.fromArray2Array(models);
  }
}