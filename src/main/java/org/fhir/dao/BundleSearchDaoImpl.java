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

import org.fhir.entity.BundleSearchModel;
import org.fhir.pojo.BundleSearch;

public class BundleSearchDaoImpl implements BundleSearchDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public BundleSearchDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public BundleSearch find(String id) {
    final EntityManager em = entityManagerProvider.get();
    BundleSearchModel model = em.find(BundleSearchModel.class, id);
    if (null == model) return null;
    return new BundleSearch(model);
  }

  @Override
  public List<BundleSearch> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BundleSearchModel a", BundleSearchModel.class).setMaxResults(maxResult);
      List<BundleSearchModel> models = query.getResultList();
      return BundleSearch.fromArray(models);
  }

  @Override
  public List<BundleSearch> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BundleSearchModel a", BundleSearchModel.class);
      List<BundleSearchModel> models = query.getResultList();
      return BundleSearch.fromArray(models);
  }

  @Override
  @Transactional
  public BundleSearch create(BundleSearch e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new BundleSearchModel(e));
      return e;
  }

  @Transactional
  public BundleSearch update(BundleSearch e) {
      final EntityManager em = entityManagerProvider.get();
      BundleSearchModel model = em.merge(new BundleSearchModel(e));
      return new BundleSearch(model);
  }

  @Override
  @Transactional
  public void delete(BundleSearch e) {
      final EntityManager em = entityManagerProvider.get();
      final BundleSearchModel removed = em.find(BundleSearchModel.class, e.getId());
      em.remove(removed);
  }
}