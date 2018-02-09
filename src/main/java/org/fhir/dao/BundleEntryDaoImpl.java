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

import org.fhir.entity.BundleEntryModel;
import org.fhir.pojo.BundleEntry;

public class BundleEntryDaoImpl implements BundleEntryDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public BundleEntryDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public BundleEntry find(String id) {
    final EntityManager em = entityManagerProvider.get();
    BundleEntryModel model = em.find(BundleEntryModel.class, id);
    if (null == model) return null;
    return new BundleEntry(model);
  }

  @Override
  public List<BundleEntry> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BundleEntryModel a", BundleEntryModel.class).setMaxResults(maxResult);
      List<BundleEntryModel> models = query.getResultList();
      return BundleEntry.fromArray(models);
  }

  @Override
  public List<BundleEntry> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BundleEntryModel a", BundleEntryModel.class);
      List<BundleEntryModel> models = query.getResultList();
      return BundleEntry.fromArray(models);
  }

  @Override
  @Transactional
  public BundleEntry create(BundleEntry e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new BundleEntryModel(e));
      return e;
  }

  @Transactional
  public BundleEntry update(BundleEntry e) {
      final EntityManager em = entityManagerProvider.get();
      BundleEntryModel model = em.merge(new BundleEntryModel(e));
      return new BundleEntry(model);
  }

  @Override
  @Transactional
  public void delete(BundleEntry e) {
      final EntityManager em = entityManagerProvider.get();
      final BundleEntryModel removed = em.find(BundleEntryModel.class, e.getId());
      em.remove(removed);
  }
}