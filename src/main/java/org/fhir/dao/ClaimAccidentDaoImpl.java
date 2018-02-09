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

import org.fhir.entity.ClaimAccidentModel;
import org.fhir.pojo.ClaimAccident;

public class ClaimAccidentDaoImpl implements ClaimAccidentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimAccidentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimAccident find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimAccidentModel model = em.find(ClaimAccidentModel.class, id);
    if (null == model) return null;
    return new ClaimAccident(model);
  }

  @Override
  public List<ClaimAccident> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimAccidentModel a", ClaimAccidentModel.class).setMaxResults(maxResult);
      List<ClaimAccidentModel> models = query.getResultList();
      return ClaimAccident.fromArray(models);
  }

  @Override
  public List<ClaimAccident> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimAccidentModel a", ClaimAccidentModel.class);
      List<ClaimAccidentModel> models = query.getResultList();
      return ClaimAccident.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimAccident create(ClaimAccident e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimAccidentModel(e));
      return e;
  }

  @Transactional
  public ClaimAccident update(ClaimAccident e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimAccidentModel model = em.merge(new ClaimAccidentModel(e));
      return new ClaimAccident(model);
  }

  @Override
  @Transactional
  public void delete(ClaimAccident e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimAccidentModel removed = em.find(ClaimAccidentModel.class, e.getId());
      em.remove(removed);
  }
}