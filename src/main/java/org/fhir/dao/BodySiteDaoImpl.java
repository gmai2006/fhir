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

import org.fhir.entity.BodySiteModel;
import org.fhir.pojo.BodySite;
import org.fhir.pojo.BodySiteHelper;
import org.fhir.utils.QueryBuilder;

public class BodySiteDaoImpl implements BodySiteDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public BodySiteDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public BodySite find(String id) {
    final EntityManager em = entityManagerProvider.get();
    BodySiteModel model = em.find(BodySiteModel.class, id);
    if (null == model) return null;
    return new BodySite(model);
  }

  @Override
  public List<BodySite> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BodySiteModel a", BodySiteModel.class).setMaxResults(maxResult);
      List<BodySiteModel> models = query.getResultList();
      return BodySiteHelper.fromArray2Array(models);
  }

  @Override
  public List<BodySite> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BodySiteModel a", BodySiteModel.class);
      List<BodySiteModel> models = query.getResultList();
      return BodySiteHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public BodySite create(BodySite e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new BodySiteModel(e));
      return e;
  }

  @Transactional
  public BodySite update(BodySite e) {
      final EntityManager em = entityManagerProvider.get();
      BodySiteModel model = em.merge(new BodySiteModel(e));
      return new BodySite(model);
  }
  @Override
  @Transactional
  public void delete(BodySite e) {
      final EntityManager em = entityManagerProvider.get();
      final BodySiteModel removed = em.find(BodySiteModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<BodySite> findByCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BodySiteModel a, CodeableConcept b where a.code_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<BodySite> findByQualifier(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BodySiteModel a, CodeableConcept b where a.qualifier_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<BodySite> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BodySiteModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<BodySite> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BodySiteModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<BodySite> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BodySiteModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<BodySite> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from BodySiteModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<BodySite> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, BodySiteModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<BodySiteModel> models = query.getResultList();
    return BodySiteHelper.fromArray2Array(models);
  }
}