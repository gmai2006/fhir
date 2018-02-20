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

import org.fhir.entity.ProvenanceModel;
import org.fhir.pojo.Provenance;
import org.fhir.pojo.ProvenanceHelper;
import org.fhir.utils.QueryBuilder;

public class ProvenanceDaoImpl implements ProvenanceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ProvenanceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Provenance find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ProvenanceModel model = em.find(ProvenanceModel.class, id);
    if (null == model) return null;
    return new Provenance(model);
  }

  @Override
  public List<Provenance> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProvenanceModel a", ProvenanceModel.class).setMaxResults(maxResult);
      List<ProvenanceModel> models = query.getResultList();
      return ProvenanceHelper.fromArray2Array(models);
  }

  @Override
  public List<Provenance> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProvenanceModel a", ProvenanceModel.class);
      List<ProvenanceModel> models = query.getResultList();
      return ProvenanceHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Provenance create(Provenance e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ProvenanceModel(e));
      return e;
  }

  @Transactional
  public Provenance update(Provenance e) {
      final EntityManager em = entityManagerProvider.get();
      ProvenanceModel model = em.merge(new ProvenanceModel(e));
      return new Provenance(model);
  }
  @Override
  @Transactional
  public void delete(Provenance e) {
      final EntityManager em = entityManagerProvider.get();
      final ProvenanceModel removed = em.find(ProvenanceModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Provenance> findByTarget(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a, Reference b where a.target_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Provenance> findByLocation(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a, Reference b where a.location_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Provenance> findByReason(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a, Coding b where a.reason_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Provenance> findByActivity(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a, Coding b where a.activity_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Provenance> findByAgent(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a, ProvenanceAgent b where a.agent_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Provenance> findByEntity(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a, ProvenanceEntity b where a.entity_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Provenance> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Provenance> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Provenance> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ProvenanceModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Provenance> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ProvenanceModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ProvenanceModel> models = query.getResultList();
    return ProvenanceHelper.fromArray2Array(models);
  }
}