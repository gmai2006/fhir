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

import org.fhir.entity.BundleRequestModel;
import org.fhir.pojo.BundleRequest;

public class BundleRequestDaoImpl implements BundleRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public BundleRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public BundleRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    BundleRequestModel model = em.find(BundleRequestModel.class, id);
    if (null == model) return null;
    return new BundleRequest(model);
  }

  @Override
  public List<BundleRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BundleRequestModel a", BundleRequestModel.class).setMaxResults(maxResult);
      List<BundleRequestModel> models = query.getResultList();
      return BundleRequest.fromArray(models);
  }

  @Override
  public List<BundleRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BundleRequestModel a", BundleRequestModel.class);
      List<BundleRequestModel> models = query.getResultList();
      return BundleRequest.fromArray(models);
  }

  @Override
  @Transactional
  public BundleRequest create(BundleRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new BundleRequestModel(e));
      return e;
  }

  @Transactional
  public BundleRequest update(BundleRequest e) {
      final EntityManager em = entityManagerProvider.get();
      BundleRequestModel model = em.merge(new BundleRequestModel(e));
      return new BundleRequest(model);
  }

  @Override
  @Transactional
  public void delete(BundleRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final BundleRequestModel removed = em.find(BundleRequestModel.class, e.getId());
      em.remove(removed);
  }
}