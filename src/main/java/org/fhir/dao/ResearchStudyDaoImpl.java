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

import org.fhir.entity.ResearchStudyModel;
import org.fhir.pojo.ResearchStudy;
import org.fhir.pojo.ResearchStudyHelper;
import org.fhir.utils.QueryBuilder;

public class ResearchStudyDaoImpl implements ResearchStudyDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ResearchStudyDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ResearchStudy find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ResearchStudyModel model = em.find(ResearchStudyModel.class, id);
    if (null == model) return null;
    return new ResearchStudy(model);
  }

  @Override
  public List<ResearchStudy> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResearchStudyModel a", ResearchStudyModel.class).setMaxResults(maxResult);
      List<ResearchStudyModel> models = query.getResultList();
      return ResearchStudyHelper.fromArray2Array(models);
  }

  @Override
  public List<ResearchStudy> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResearchStudyModel a", ResearchStudyModel.class);
      List<ResearchStudyModel> models = query.getResultList();
      return ResearchStudyHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ResearchStudy create(ResearchStudy e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ResearchStudyModel(e));
      return e;
  }

  @Transactional
  public ResearchStudy update(ResearchStudy e) {
      final EntityManager em = entityManagerProvider.get();
      ResearchStudyModel model = em.merge(new ResearchStudyModel(e));
      return new ResearchStudy(model);
  }
  @Override
  @Transactional
  public void delete(ResearchStudy e) {
      final EntityManager em = entityManagerProvider.get();
      final ResearchStudyModel removed = em.find(ResearchStudyModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<ResearchStudy> findByProtocol(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchStudyModel a, Reference b where a.protocol_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ResearchStudy> findBySite(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchStudyModel a, Reference b where a.site_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ResearchStudy> findBySponsor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchStudyModel a, Reference b where a.sponsor_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ResearchStudy> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchStudyModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ResearchStudy> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ResearchStudyModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ResearchStudyModel> models = query.getResultList();
    return ResearchStudyHelper.fromArray2Array(models);
  }
}