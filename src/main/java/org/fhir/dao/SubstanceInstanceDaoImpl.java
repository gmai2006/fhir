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

import org.fhir.entity.SubstanceInstanceModel;
import org.fhir.pojo.SubstanceInstance;

public class SubstanceInstanceDaoImpl implements SubstanceInstanceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SubstanceInstanceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public SubstanceInstance find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SubstanceInstanceModel model = em.find(SubstanceInstanceModel.class, id);
    if (null == model) return null;
    return new SubstanceInstance(model);
  }

  @Override
  public List<SubstanceInstance> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SubstanceInstanceModel a", SubstanceInstanceModel.class).setMaxResults(maxResult);
      List<SubstanceInstanceModel> models = query.getResultList();
      return SubstanceInstance.fromArray(models);
  }

  @Override
  public List<SubstanceInstance> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SubstanceInstanceModel a", SubstanceInstanceModel.class);
      List<SubstanceInstanceModel> models = query.getResultList();
      return SubstanceInstance.fromArray(models);
  }

  @Override
  @Transactional
  public SubstanceInstance create(SubstanceInstance e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SubstanceInstanceModel(e));
      return e;
  }

  @Transactional
  public SubstanceInstance update(SubstanceInstance e) {
      final EntityManager em = entityManagerProvider.get();
      SubstanceInstanceModel model = em.merge(new SubstanceInstanceModel(e));
      return new SubstanceInstance(model);
  }

  @Override
  @Transactional
  public void delete(SubstanceInstance e) {
      final EntityManager em = entityManagerProvider.get();
      final SubstanceInstanceModel removed = em.find(SubstanceInstanceModel.class, e.getId());
      em.remove(removed);
  }
}