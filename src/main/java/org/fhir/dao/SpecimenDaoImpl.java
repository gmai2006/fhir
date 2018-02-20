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

import org.fhir.entity.SpecimenModel;
import org.fhir.pojo.Specimen;
import org.fhir.pojo.SpecimenHelper;
import org.fhir.utils.QueryBuilder;

public class SpecimenDaoImpl implements SpecimenDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SpecimenDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Specimen find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SpecimenModel model = em.find(SpecimenModel.class, id);
    if (null == model) return null;
    return new Specimen(model);
  }

  @Override
  public List<Specimen> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SpecimenModel a", SpecimenModel.class).setMaxResults(maxResult);
      List<SpecimenModel> models = query.getResultList();
      return SpecimenHelper.fromArray2Array(models);
  }

  @Override
  public List<Specimen> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SpecimenModel a", SpecimenModel.class);
      List<SpecimenModel> models = query.getResultList();
      return SpecimenHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Specimen create(Specimen e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SpecimenModel(e));
      return e;
  }

  @Transactional
  public Specimen update(Specimen e) {
      final EntityManager em = entityManagerProvider.get();
      SpecimenModel model = em.merge(new SpecimenModel(e));
      return new Specimen(model);
  }
  @Override
  @Transactional
  public void delete(Specimen e) {
      final EntityManager em = entityManagerProvider.get();
      final SpecimenModel removed = em.find(SpecimenModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Specimen> findByType(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, CodeableConcept b where a.type_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Specimen> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Specimen> findByParent(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, Reference b where a.parent_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Specimen> findByRequest(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, Reference b where a.request_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Specimen> findByCollection(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, SpecimenCollection b where a.collection_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Specimen> findByProcessing(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, SpecimenProcessing b where a.processing_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Specimen> findByContainer(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, SpecimenContainer b where a.container_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Specimen> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Specimen> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Specimen> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SpecimenModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Specimen> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, SpecimenModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<SpecimenModel> models = query.getResultList();
    return SpecimenHelper.fromArray2Array(models);
  }
}