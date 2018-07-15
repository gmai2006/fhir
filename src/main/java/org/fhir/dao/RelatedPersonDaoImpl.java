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

import org.fhir.entity.RelatedPersonModel;
import org.fhir.pojo.RelatedPerson;
import org.fhir.pojo.RelatedPersonHelper;
import org.fhir.utils.QueryBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public class RelatedPersonDaoImpl implements RelatedPersonDao {
	private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public RelatedPersonDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public RelatedPerson find(String id) {
    final EntityManager em = entityManagerProvider.get();
    RelatedPersonModel model = em.find(RelatedPersonModel.class, id);
    if (null == model) return null;
    return new RelatedPerson(model);
  }

  @Override
  public List<RelatedPerson> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RelatedPersonModel a", RelatedPersonModel.class).setMaxResults(maxResult);
      List<RelatedPersonModel> models = query.getResultList();
      return RelatedPersonHelper.fromArray2Array(models);
  }

  @Override
  public List<RelatedPerson> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from RelatedPersonModel a", RelatedPersonModel.class);
      List<RelatedPersonModel> models = query.getResultList();
      return RelatedPersonHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public RelatedPerson create(RelatedPerson e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new RelatedPersonModel(e));
      return e;
  }

  @Transactional
  public RelatedPerson update(RelatedPerson e) {
      final EntityManager em = entityManagerProvider.get();
      RelatedPersonModel model = em.merge(new RelatedPersonModel(e));
      return new RelatedPerson(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final RelatedPersonModel removed = em.find(RelatedPersonModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<RelatedPerson> findByPatient(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RelatedPersonModel a, Reference b where a.patient_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RelatedPerson> findByRelationship(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RelatedPersonModel a, CodeableConcept b where a.relationship_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RelatedPerson> findByAddress(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RelatedPersonModel a, Address b where a.address_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RelatedPerson> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RelatedPersonModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<RelatedPerson> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RelatedPersonModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<RelatedPerson> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from RelatedPersonModel a " + queryBuilder.getWhereClause();
  	logger.info(queryStr);
    return findByQuery(queryBuilder, queryStr);
  }

  private List<RelatedPerson> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, RelatedPersonModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<RelatedPersonModel> models = query.getResultList();
    return RelatedPersonHelper.fromArray2Array(models);
  }
}