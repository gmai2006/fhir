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

import org.fhir.entity.CompartmentDefinitionModel;
import org.fhir.pojo.CompartmentDefinition;
import org.fhir.pojo.CompartmentDefinitionHelper;
import org.fhir.utils.QueryBuilder;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public class CompartmentDefinitionDaoImpl implements CompartmentDefinitionDao {
	private final Logger logger = Logger.getLogger(this.getClass().getName());
  private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CompartmentDefinitionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CompartmentDefinition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CompartmentDefinitionModel model = em.find(CompartmentDefinitionModel.class, id);
    if (null == model) return null;
    return new CompartmentDefinition(model);
  }

  @Override
  public List<CompartmentDefinition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompartmentDefinitionModel a", CompartmentDefinitionModel.class).setMaxResults(maxResult);
      List<CompartmentDefinitionModel> models = query.getResultList();
      return CompartmentDefinitionHelper.fromArray2Array(models);
  }

  @Override
  public List<CompartmentDefinition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CompartmentDefinitionModel a", CompartmentDefinitionModel.class);
      List<CompartmentDefinitionModel> models = query.getResultList();
      return CompartmentDefinitionHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public CompartmentDefinition create(CompartmentDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CompartmentDefinitionModel(e));
      return e;
  }

  @Transactional
  public CompartmentDefinition update(CompartmentDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      CompartmentDefinitionModel model = em.merge(new CompartmentDefinitionModel(e));
      return new CompartmentDefinition(model);
  }
  @Override
  @Transactional
  public void delete(String id) {
      final EntityManager em = entityManagerProvider.get();
      final CompartmentDefinitionModel removed = em.find(CompartmentDefinitionModel.class, id);
      em.remove(removed);
  }

  @Override
  public List<CompartmentDefinition> findByContact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CompartmentDefinitionModel a, ContactDetail b where a.contact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CompartmentDefinition> findByUseContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CompartmentDefinitionModel a, UsageContext b where a.useContext_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CompartmentDefinition> findByJurisdiction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CompartmentDefinitionModel a, CodeableConcept b where a.jurisdiction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CompartmentDefinition> findByResource(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CompartmentDefinitionModel a, CompartmentDefinitionResource b where a.resource_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CompartmentDefinition> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CompartmentDefinitionModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<CompartmentDefinition> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CompartmentDefinitionModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<CompartmentDefinition> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from CompartmentDefinitionModel a " + queryBuilder.getWhereClause();
  	logger.info(queryStr);
    return findByQuery(queryBuilder, queryStr);
  }

  private List<CompartmentDefinition> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, CompartmentDefinitionModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<CompartmentDefinitionModel> models = query.getResultList();
    return CompartmentDefinitionHelper.fromArray2Array(models);
  }
}