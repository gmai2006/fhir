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

import org.fhir.entity.ExpansionProfileDesignation2Model;
import org.fhir.pojo.ExpansionProfileDesignation2;

public class ExpansionProfileDesignation2DaoImpl implements ExpansionProfileDesignation2Dao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExpansionProfileDesignation2DaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExpansionProfileDesignation2 find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExpansionProfileDesignation2Model model = em.find(ExpansionProfileDesignation2Model.class, id);
    if (null == model) return null;
    return new ExpansionProfileDesignation2(model);
  }

  @Override
  public List<ExpansionProfileDesignation2> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExpansionProfileDesignation2Model a", ExpansionProfileDesignation2Model.class).setMaxResults(maxResult);
      List<ExpansionProfileDesignation2Model> models = query.getResultList();
      return ExpansionProfileDesignation2.fromArray(models);
  }

  @Override
  public List<ExpansionProfileDesignation2> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExpansionProfileDesignation2Model a", ExpansionProfileDesignation2Model.class);
      List<ExpansionProfileDesignation2Model> models = query.getResultList();
      return ExpansionProfileDesignation2.fromArray(models);
  }

  @Override
  @Transactional
  public ExpansionProfileDesignation2 create(ExpansionProfileDesignation2 e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExpansionProfileDesignation2Model(e));
      return e;
  }

  @Transactional
  public ExpansionProfileDesignation2 update(ExpansionProfileDesignation2 e) {
      final EntityManager em = entityManagerProvider.get();
      ExpansionProfileDesignation2Model model = em.merge(new ExpansionProfileDesignation2Model(e));
      return new ExpansionProfileDesignation2(model);
  }

  @Override
  @Transactional
  public void delete(ExpansionProfileDesignation2 e) {
      final EntityManager em = entityManagerProvider.get();
      final ExpansionProfileDesignation2Model removed = em.find(ExpansionProfileDesignation2Model.class, e.getId());
      em.remove(removed);
  }
}