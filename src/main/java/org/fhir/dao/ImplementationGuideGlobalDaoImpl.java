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

import org.fhir.entity.ImplementationGuideGlobalModel;
import org.fhir.pojo.ImplementationGuideGlobal;

public class ImplementationGuideGlobalDaoImpl implements ImplementationGuideGlobalDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImplementationGuideGlobalDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImplementationGuideGlobal find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImplementationGuideGlobalModel model = em.find(ImplementationGuideGlobalModel.class, id);
    if (null == model) return null;
    return new ImplementationGuideGlobal(model);
  }

  @Override
  public List<ImplementationGuideGlobal> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImplementationGuideGlobalModel a", ImplementationGuideGlobalModel.class).setMaxResults(maxResult);
      List<ImplementationGuideGlobalModel> models = query.getResultList();
      return ImplementationGuideGlobal.fromArray(models);
  }

  @Override
  public List<ImplementationGuideGlobal> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImplementationGuideGlobalModel a", ImplementationGuideGlobalModel.class);
      List<ImplementationGuideGlobalModel> models = query.getResultList();
      return ImplementationGuideGlobal.fromArray(models);
  }

  @Override
  @Transactional
  public ImplementationGuideGlobal create(ImplementationGuideGlobal e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImplementationGuideGlobalModel(e));
      return e;
  }

  @Transactional
  public ImplementationGuideGlobal update(ImplementationGuideGlobal e) {
      final EntityManager em = entityManagerProvider.get();
      ImplementationGuideGlobalModel model = em.merge(new ImplementationGuideGlobalModel(e));
      return new ImplementationGuideGlobal(model);
  }

  @Override
  @Transactional
  public void delete(ImplementationGuideGlobal e) {
      final EntityManager em = entityManagerProvider.get();
      final ImplementationGuideGlobalModel removed = em.find(ImplementationGuideGlobalModel.class, e.getId());
      em.remove(removed);
  }
}