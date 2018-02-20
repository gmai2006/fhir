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

import org.fhir.entity.ServiceDefinitionModel;
import org.fhir.pojo.ServiceDefinition;
import org.fhir.pojo.ServiceDefinitionHelper;
import org.fhir.utils.QueryBuilder;

public class ServiceDefinitionDaoImpl implements ServiceDefinitionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ServiceDefinitionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ServiceDefinition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ServiceDefinitionModel model = em.find(ServiceDefinitionModel.class, id);
    if (null == model) return null;
    return new ServiceDefinition(model);
  }

  @Override
  public List<ServiceDefinition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ServiceDefinitionModel a", ServiceDefinitionModel.class).setMaxResults(maxResult);
      List<ServiceDefinitionModel> models = query.getResultList();
      return ServiceDefinitionHelper.fromArray2Array(models);
  }

  @Override
  public List<ServiceDefinition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ServiceDefinitionModel a", ServiceDefinitionModel.class);
      List<ServiceDefinitionModel> models = query.getResultList();
      return ServiceDefinitionHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ServiceDefinition create(ServiceDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ServiceDefinitionModel(e));
      return e;
  }

  @Transactional
  public ServiceDefinition update(ServiceDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      ServiceDefinitionModel model = em.merge(new ServiceDefinitionModel(e));
      return new ServiceDefinition(model);
  }
  @Override
  @Transactional
  public void delete(ServiceDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      final ServiceDefinitionModel removed = em.find(ServiceDefinitionModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<ServiceDefinition> findByUseContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, UsageContext b where a.useContext_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByJurisdiction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, CodeableConcept b where a.jurisdiction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByTopic(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, CodeableConcept b where a.topic_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByContributor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, Contributor b where a.contributor_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByContact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, ContactDetail b where a.contact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByRelatedArtifact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, RelatedArtifact b where a.relatedArtifact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByTrigger(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, TriggerDefinition b where a.trigger_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByDataRequirement(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, DataRequirement b where a.dataRequirement_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByOperationDefinition(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, Reference b where a.operationDefinition_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<ServiceDefinition> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<ServiceDefinition> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from ServiceDefinitionModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<ServiceDefinition> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, ServiceDefinitionModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<ServiceDefinitionModel> models = query.getResultList();
    return ServiceDefinitionHelper.fromArray2Array(models);
  }
}