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

import org.fhir.entity.SearchParameterModel;
import org.fhir.pojo.SearchParameter;
import org.fhir.pojo.SearchParameterHelper;
import org.fhir.utils.QueryBuilder;

public class SearchParameterDaoImpl implements SearchParameterDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SearchParameterDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public SearchParameter find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SearchParameterModel model = em.find(SearchParameterModel.class, id);
    if (null == model) return null;
    return new SearchParameter(model);
  }

  @Override
  public List<SearchParameter> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SearchParameterModel a", SearchParameterModel.class).setMaxResults(maxResult);
      List<SearchParameterModel> models = query.getResultList();
      return SearchParameterHelper.fromArray2Array(models);
  }

  @Override
  public List<SearchParameter> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SearchParameterModel a", SearchParameterModel.class);
      List<SearchParameterModel> models = query.getResultList();
      return SearchParameterHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public SearchParameter create(SearchParameter e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SearchParameterModel(e));
      return e;
  }

  @Transactional
  public SearchParameter update(SearchParameter e) {
      final EntityManager em = entityManagerProvider.get();
      SearchParameterModel model = em.merge(new SearchParameterModel(e));
      return new SearchParameter(model);
  }
  @Override
  @Transactional
  public void delete(SearchParameter e) {
      final EntityManager em = entityManagerProvider.get();
      final SearchParameterModel removed = em.find(SearchParameterModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<SearchParameter> findByComponent(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SearchParameterModel a, SearchParameterComponent b where a.component_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<SearchParameter> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from SearchParameterModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<SearchParameter> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, SearchParameterModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<SearchParameterModel> models = query.getResultList();
    return SearchParameterHelper.fromArray2Array(models);
  }
}