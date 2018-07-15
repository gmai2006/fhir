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
import java.util.logging.Logger;
import org.fhir.entity.*;
import javax.inject.Inject;
import com.google.inject.persist.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import com.google.inject.Provider;

import org.fhir.entity.ResearchSubjectModel;
import org.fhir.pojo.ResearchSubject;
import org.fhir.pojo.ResearchSubjectHelper;
import org.fhir.utils.QueryBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public class ResearchSubjectDaoImpl implements ResearchSubjectDao {
	private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ResearchSubjectDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ResearchSubject find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ResearchSubjectModel model = em.find(ResearchSubjectModel.class, id);
    if (null == model) return null;
    return new ResearchSubject(model);
  }

  @Override
  public List<ResearchSubject> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResearchSubjectModel a", ResearchSubjectModel.class).setMaxResults(maxResult);
      List<ResearchSubjectModel> models = query.getResultList();
      return ResearchSubjectHelper.fromArray2Array(models);
  }

  @Override
  public List<ResearchSubject> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResearchSubjectModel a", ResearchSubjectModel.class);
      List<ResearchSubjectModel> models = query.getResultList();
      return ResearchSubjectHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ResearchSubject create(ResearchSubject e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ResearchSubjectModel(e));
      return e;
  }

  @Transactional
  public ResearchSubject update(ResearchSubject e) {
      final EntityManager em = entityManagerProvider.get();
      ResearchSubjectModel model = em.merge(new ResearchSubjectModel(e));
      return new ResearchSubject(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final ResearchSubjectModel removed = em.find(ResearchSubjectModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<ResearchSubject> findByStudy(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchSubjectModel a, Reference b where a.study_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ResearchSubject> findByIndividual(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchSubjectModel a, Reference b where a.individual_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ResearchSubject> findByConsent(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchSubjectModel a, Reference b where a.consent_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ResearchSubject> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchSubjectModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ResearchSubject> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchSubjectModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ResearchSubject> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ResearchSubjectModel a " + queryBuilder.getWhereClause();
  	logger.info(queryStr);
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ResearchSubject> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ResearchSubjectModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ResearchSubjectModel> models = query.getResultList();
    return ResearchSubjectHelper.fromArray2Array(models);
  }
}