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

import org.fhir.entity.ClaimDetailModel;
import org.fhir.pojo.ClaimDetail;

public class ClaimDetailDaoImpl implements ClaimDetailDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimDetailDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimDetail find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimDetailModel model = em.find(ClaimDetailModel.class, id);
    if (null == model) return null;
    return new ClaimDetail(model);
  }

  @Override
  public List<ClaimDetail> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimDetailModel a", ClaimDetailModel.class).setMaxResults(maxResult);
      List<ClaimDetailModel> models = query.getResultList();
      return ClaimDetail.fromArray(models);
  }

  @Override
  public List<ClaimDetail> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimDetailModel a", ClaimDetailModel.class);
      List<ClaimDetailModel> models = query.getResultList();
      return ClaimDetail.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimDetail create(ClaimDetail e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimDetailModel(e));
      return e;
  }

  @Transactional
  public ClaimDetail update(ClaimDetail e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimDetailModel model = em.merge(new ClaimDetailModel(e));
      return new ClaimDetail(model);
  }

  @Override
  @Transactional
  public void delete(ClaimDetail e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimDetailModel removed = em.find(ClaimDetailModel.class, e.getId());
      em.remove(removed);
  }
}