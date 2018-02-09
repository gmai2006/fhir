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

import org.fhir.entity.ExpansionProfileExcludedSystemModel;
import org.fhir.pojo.ExpansionProfileExcludedSystem;

public class ExpansionProfileExcludedSystemDaoImpl implements ExpansionProfileExcludedSystemDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExpansionProfileExcludedSystemDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExpansionProfileExcludedSystem find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExpansionProfileExcludedSystemModel model = em.find(ExpansionProfileExcludedSystemModel.class, id);
    if (null == model) return null;
    return new ExpansionProfileExcludedSystem(model);
  }

  @Override
  public List<ExpansionProfileExcludedSystem> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExpansionProfileExcludedSystemModel a", ExpansionProfileExcludedSystemModel.class).setMaxResults(maxResult);
      List<ExpansionProfileExcludedSystemModel> models = query.getResultList();
      return ExpansionProfileExcludedSystem.fromArray(models);
  }

  @Override
  public List<ExpansionProfileExcludedSystem> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExpansionProfileExcludedSystemModel a", ExpansionProfileExcludedSystemModel.class);
      List<ExpansionProfileExcludedSystemModel> models = query.getResultList();
      return ExpansionProfileExcludedSystem.fromArray(models);
  }

  @Override
  @Transactional
  public ExpansionProfileExcludedSystem create(ExpansionProfileExcludedSystem e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExpansionProfileExcludedSystemModel(e));
      return e;
  }

  @Transactional
  public ExpansionProfileExcludedSystem update(ExpansionProfileExcludedSystem e) {
      final EntityManager em = entityManagerProvider.get();
      ExpansionProfileExcludedSystemModel model = em.merge(new ExpansionProfileExcludedSystemModel(e));
      return new ExpansionProfileExcludedSystem(model);
  }

  @Override
  @Transactional
  public void delete(ExpansionProfileExcludedSystem e) {
      final EntityManager em = entityManagerProvider.get();
      final ExpansionProfileExcludedSystemModel removed = em.find(ExpansionProfileExcludedSystemModel.class, e.getId());
      em.remove(removed);
  }
}