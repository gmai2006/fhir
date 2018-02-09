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

import org.fhir.entity.ValueSetContainsModel;
import org.fhir.pojo.ValueSetContains;

public class ValueSetContainsDaoImpl implements ValueSetContainsDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ValueSetContainsDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ValueSetContains find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ValueSetContainsModel model = em.find(ValueSetContainsModel.class, id);
    if (null == model) return null;
    return new ValueSetContains(model);
  }

  @Override
  public List<ValueSetContains> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ValueSetContainsModel a", ValueSetContainsModel.class).setMaxResults(maxResult);
      List<ValueSetContainsModel> models = query.getResultList();
      return ValueSetContains.fromArray(models);
  }

  @Override
  public List<ValueSetContains> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ValueSetContainsModel a", ValueSetContainsModel.class);
      List<ValueSetContainsModel> models = query.getResultList();
      return ValueSetContains.fromArray(models);
  }

  @Override
  @Transactional
  public ValueSetContains create(ValueSetContains e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ValueSetContainsModel(e));
      return e;
  }

  @Transactional
  public ValueSetContains update(ValueSetContains e) {
      final EntityManager em = entityManagerProvider.get();
      ValueSetContainsModel model = em.merge(new ValueSetContainsModel(e));
      return new ValueSetContains(model);
  }

  @Override
  @Transactional
  public void delete(ValueSetContains e) {
      final EntityManager em = entityManagerProvider.get();
      final ValueSetContainsModel removed = em.find(ValueSetContainsModel.class, e.getId());
      em.remove(removed);
  }
}