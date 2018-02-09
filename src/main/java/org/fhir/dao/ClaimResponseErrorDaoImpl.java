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

import org.fhir.entity.ClaimResponseErrorModel;
import org.fhir.pojo.ClaimResponseError;

public class ClaimResponseErrorDaoImpl implements ClaimResponseErrorDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimResponseErrorDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimResponseError find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimResponseErrorModel model = em.find(ClaimResponseErrorModel.class, id);
    if (null == model) return null;
    return new ClaimResponseError(model);
  }

  @Override
  public List<ClaimResponseError> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimResponseErrorModel a", ClaimResponseErrorModel.class).setMaxResults(maxResult);
      List<ClaimResponseErrorModel> models = query.getResultList();
      return ClaimResponseError.fromArray(models);
  }

  @Override
  public List<ClaimResponseError> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimResponseErrorModel a", ClaimResponseErrorModel.class);
      List<ClaimResponseErrorModel> models = query.getResultList();
      return ClaimResponseError.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimResponseError create(ClaimResponseError e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimResponseErrorModel(e));
      return e;
  }

  @Transactional
  public ClaimResponseError update(ClaimResponseError e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimResponseErrorModel model = em.merge(new ClaimResponseErrorModel(e));
      return new ClaimResponseError(model);
  }

  @Override
  @Transactional
  public void delete(ClaimResponseError e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimResponseErrorModel removed = em.find(ClaimResponseErrorModel.class, e.getId());
      em.remove(removed);
  }
}