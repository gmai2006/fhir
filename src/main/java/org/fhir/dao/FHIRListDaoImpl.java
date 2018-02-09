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

import org.fhir.entity.FHIRListModel;
import org.fhir.pojo.FHIRList;

public class FHIRListDaoImpl implements FHIRListDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public FHIRListDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public FHIRList find(String id) {
    final EntityManager em = entityManagerProvider.get();
    FHIRListModel model = em.find(FHIRListModel.class, id);
    if (null == model) return null;
    return new FHIRList(model);
  }

  @Override
  public List<FHIRList> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from FHIRListModel a", FHIRListModel.class).setMaxResults(maxResult);
      List<FHIRListModel> models = query.getResultList();
      return FHIRList.fromArray(models);
  }

  @Override
  public List<FHIRList> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from FHIRListModel a", FHIRListModel.class);
      List<FHIRListModel> models = query.getResultList();
      return FHIRList.fromArray(models);
  }

  @Override
  @Transactional
  public FHIRList create(FHIRList e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new FHIRListModel(e));
      return e;
  }

  @Transactional
  public FHIRList update(FHIRList e) {
      final EntityManager em = entityManagerProvider.get();
      FHIRListModel model = em.merge(new FHIRListModel(e));
      return new FHIRList(model);
  }

  @Override
  @Transactional
  public void delete(FHIRList e) {
      final EntityManager em = entityManagerProvider.get();
      final FHIRListModel removed = em.find(FHIRListModel.class, e.getId());
      em.remove(removed);
  }
}