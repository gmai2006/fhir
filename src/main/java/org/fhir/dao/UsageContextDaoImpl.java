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

import org.fhir.entity.UsageContextModel;
import org.fhir.pojo.UsageContext;

public class UsageContextDaoImpl implements UsageContextDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public UsageContextDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public UsageContext find(String id) {
    final EntityManager em = entityManagerProvider.get();
    UsageContextModel model = em.find(UsageContextModel.class, id);
    if (null == model) return null;
    return new UsageContext(model);
  }

  @Override
  public List<UsageContext> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from UsageContextModel a", UsageContextModel.class).setMaxResults(maxResult);
      List<UsageContextModel> models = query.getResultList();
      return UsageContext.fromArray(models);
  }

  @Override
  public List<UsageContext> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from UsageContextModel a", UsageContextModel.class);
      List<UsageContextModel> models = query.getResultList();
      return UsageContext.fromArray(models);
  }

  @Override
  @Transactional
  public UsageContext create(UsageContext e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new UsageContextModel(e));
      return e;
  }

  @Transactional
  public UsageContext update(UsageContext e) {
      final EntityManager em = entityManagerProvider.get();
      UsageContextModel model = em.merge(new UsageContextModel(e));
      return new UsageContext(model);
  }

  @Override
  @Transactional
  public void delete(UsageContext e) {
      final EntityManager em = entityManagerProvider.get();
      final UsageContextModel removed = em.find(UsageContextModel.class, e.getId());
      em.remove(removed);
  }
}