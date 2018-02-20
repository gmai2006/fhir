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

import org.fhir.entity.DataElementModel;
import org.fhir.pojo.DataElement;
import org.fhir.pojo.DataElementHelper;
import org.fhir.utils.QueryBuilder;

public class DataElementDaoImpl implements DataElementDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DataElementDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DataElement find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DataElementModel model = em.find(DataElementModel.class, id);
    if (null == model) return null;
    return new DataElement(model);
  }

  @Override
  public List<DataElement> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DataElementModel a", DataElementModel.class).setMaxResults(maxResult);
      List<DataElementModel> models = query.getResultList();
      return DataElementHelper.fromArray2Array(models);
  }

  @Override
  public List<DataElement> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DataElementModel a", DataElementModel.class);
      List<DataElementModel> models = query.getResultList();
      return DataElementHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public DataElement create(DataElement e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DataElementModel(e));
      return e;
  }

  @Transactional
  public DataElement update(DataElement e) {
      final EntityManager em = entityManagerProvider.get();
      DataElementModel model = em.merge(new DataElementModel(e));
      return new DataElement(model);
  }
  @Override
  @Transactional
  public void delete(DataElement e) {
      final EntityManager em = entityManagerProvider.get();
      final DataElementModel removed = em.find(DataElementModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<DataElement> findByContact(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DataElementModel a, ContactDetail b where a.contact_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DataElement> findByUseContext(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DataElementModel a, UsageContext b where a.useContext_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DataElement> findByJurisdiction(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DataElementModel a, CodeableConcept b where a.jurisdiction_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DataElement> findByMapping(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DataElementModel a, DataElementMapping b where a.mapping_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DataElement> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DataElementModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<DataElement> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DataElementModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<DataElement> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from DataElementModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<DataElement> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, DataElementModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<DataElementModel> models = query.getResultList();
    return DataElementHelper.fromArray2Array(models);
  }
}