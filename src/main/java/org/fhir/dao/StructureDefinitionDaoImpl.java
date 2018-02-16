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

import org.fhir.entity.StructureDefinitionModel;
import org.fhir.pojo.StructureDefinition;
import org.fhir.pojo.StructureDefinitionHelper;
import org.fhir.utils.QueryBuilder;

public class StructureDefinitionDaoImpl implements StructureDefinitionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public StructureDefinitionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public StructureDefinition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    StructureDefinitionModel model = em.find(StructureDefinitionModel.class, id);
    if (null == model) return null;
    return new StructureDefinition(model);
  }

  @Override
  public List<StructureDefinition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from StructureDefinitionModel a", StructureDefinitionModel.class).setMaxResults(maxResult);
      List<StructureDefinitionModel> models = query.getResultList();
      return StructureDefinitionHelper.fromArray2Array(models);
  }

  @Override
  public List<StructureDefinition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from StructureDefinitionModel a", StructureDefinitionModel.class);
      List<StructureDefinitionModel> models = query.getResultList();
      return StructureDefinitionHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public StructureDefinition create(StructureDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new StructureDefinitionModel(e));
      return e;
  }

  @Transactional
  public StructureDefinition update(StructureDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      StructureDefinitionModel model = em.merge(new StructureDefinitionModel(e));
      return new StructureDefinition(model);
  }
  @Override
  @Transactional
  public void delete(StructureDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      final StructureDefinitionModel removed = em.find(StructureDefinitionModel.class, e.getId());
      em.remove(removed);
  }


  @Override
  public List<StructureDefinition> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from StructureDefinitionModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<StructureDefinition> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, StructureDefinitionModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<StructureDefinitionModel> models = query.getResultList();
    return StructureDefinitionHelper.fromArray2Array(models);
  }
}