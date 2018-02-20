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

import org.fhir.entity.GroupModel;
import org.fhir.pojo.Group;
import org.fhir.pojo.GroupHelper;
import org.fhir.utils.QueryBuilder;

public class GroupDaoImpl implements GroupDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public GroupDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Group find(String id) {
    final EntityManager em = entityManagerProvider.get();
    GroupModel model = em.find(GroupModel.class, id);
    if (null == model) return null;
    return new Group(model);
  }

  @Override
  public List<Group> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GroupModel a", GroupModel.class).setMaxResults(maxResult);
      List<GroupModel> models = query.getResultList();
      return GroupHelper.fromArray2Array(models);
  }

  @Override
  public List<Group> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GroupModel a", GroupModel.class);
      List<GroupModel> models = query.getResultList();
      return GroupHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Group create(Group e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new GroupModel(e));
      return e;
  }

  @Transactional
  public Group update(Group e) {
      final EntityManager em = entityManagerProvider.get();
      GroupModel model = em.merge(new GroupModel(e));
      return new Group(model);
  }
  @Override
  @Transactional
  public void delete(Group e) {
      final EntityManager em = entityManagerProvider.get();
      final GroupModel removed = em.find(GroupModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Group> findByCode(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GroupModel a, CodeableConcept b where a.code_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Group> findByCharacteristic(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GroupModel a, GroupCharacteristic b where a.characteristic_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Group> findByMember(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GroupModel a, GroupMember b where a.member_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Group> findByText(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GroupModel a, Narrative b where a.text_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Group> findByMeta(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GroupModel a, Meta b where a.meta_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Group> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from GroupModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Group> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, GroupModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<GroupModel> models = query.getResultList();
    return GroupHelper.fromArray2Array(models);
  }
}