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

import org.fhir.entity.LinkageModel;
import org.fhir.pojo.Linkage;
import org.fhir.pojo.LinkageHelper;
import org.fhir.utils.QueryBuilder;

public class LinkageDaoImpl implements LinkageDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public LinkageDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Linkage find(String id) {
    final EntityManager em = entityManagerProvider.get();
    LinkageModel model = em.find(LinkageModel.class, id);
    if (null == model) return null;
    return new Linkage(model);
  }

  @Override
  public List<Linkage> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from LinkageModel a", LinkageModel.class).setMaxResults(maxResult);
      List<LinkageModel> models = query.getResultList();
      return LinkageHelper.fromArray2Array(models);
  }

  @Override
  public List<Linkage> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from LinkageModel a", LinkageModel.class);
      List<LinkageModel> models = query.getResultList();
      return LinkageHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Linkage create(Linkage e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new LinkageModel(e));
      return e;
  }

  @Transactional
  public Linkage update(Linkage e) {
      final EntityManager em = entityManagerProvider.get();
      LinkageModel model = em.merge(new LinkageModel(e));
      return new Linkage(model);
  }
  @Override
  @Transactional
  public void delete(Linkage e) {
      final EntityManager em = entityManagerProvider.get();
      final LinkageModel removed = em.find(LinkageModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Linkage> findByAuthor(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from LinkageModel a, Reference b where a.author_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Linkage> findByItem(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from LinkageModel a, LinkageItem b where a.item_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Linkage> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from LinkageModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Linkage> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from LinkageModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Linkage> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from LinkageModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Linkage> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, LinkageModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<LinkageModel> models = query.getResultList();
    return LinkageHelper.fromArray2Array(models);
  }
}