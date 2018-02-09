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

import org.fhir.entity.BasicModel;
import org.fhir.pojo.Basic;

public class BasicDaoImpl implements BasicDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public BasicDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Basic find(String id) {
    final EntityManager em = entityManagerProvider.get();
    BasicModel model = em.find(BasicModel.class, id);
    if (null == model) return null;
    return new Basic(model);
  }

  @Override
  public List<Basic> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BasicModel a", BasicModel.class).setMaxResults(maxResult);
      List<BasicModel> models = query.getResultList();
      return Basic.fromArray(models);
  }

  @Override
  public List<Basic> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BasicModel a", BasicModel.class);
      List<BasicModel> models = query.getResultList();
      return Basic.fromArray(models);
  }

  @Override
  @Transactional
  public Basic create(Basic e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new BasicModel(e));
      return e;
  }

  @Transactional
  public Basic update(Basic e) {
      final EntityManager em = entityManagerProvider.get();
      BasicModel model = em.merge(new BasicModel(e));
      return new Basic(model);
  }

  @Override
  @Transactional
  public void delete(Basic e) {
      final EntityManager em = entityManagerProvider.get();
      final BasicModel removed = em.find(BasicModel.class, e.getId());
      em.remove(removed);
  }
}