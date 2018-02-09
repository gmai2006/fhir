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

import org.fhir.entity.ValueSetDesignationModel;
import org.fhir.pojo.ValueSetDesignation;

public class ValueSetDesignationDaoImpl implements ValueSetDesignationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ValueSetDesignationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ValueSetDesignation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ValueSetDesignationModel model = em.find(ValueSetDesignationModel.class, id);
    if (null == model) return null;
    return new ValueSetDesignation(model);
  }

  @Override
  public List<ValueSetDesignation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ValueSetDesignationModel a", ValueSetDesignationModel.class).setMaxResults(maxResult);
      List<ValueSetDesignationModel> models = query.getResultList();
      return ValueSetDesignation.fromArray(models);
  }

  @Override
  public List<ValueSetDesignation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ValueSetDesignationModel a", ValueSetDesignationModel.class);
      List<ValueSetDesignationModel> models = query.getResultList();
      return ValueSetDesignation.fromArray(models);
  }

  @Override
  @Transactional
  public ValueSetDesignation create(ValueSetDesignation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ValueSetDesignationModel(e));
      return e;
  }

  @Transactional
  public ValueSetDesignation update(ValueSetDesignation e) {
      final EntityManager em = entityManagerProvider.get();
      ValueSetDesignationModel model = em.merge(new ValueSetDesignationModel(e));
      return new ValueSetDesignation(model);
  }

  @Override
  @Transactional
  public void delete(ValueSetDesignation e) {
      final EntityManager em = entityManagerProvider.get();
      final ValueSetDesignationModel removed = em.find(ValueSetDesignationModel.class, e.getId());
      em.remove(removed);
  }
}