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

import org.fhir.entity.ClaimSubDetailModel;
import org.fhir.pojo.ClaimSubDetail;

public class ClaimSubDetailDaoImpl implements ClaimSubDetailDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimSubDetailDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimSubDetail find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimSubDetailModel model = em.find(ClaimSubDetailModel.class, id);
    if (null == model) return null;
    return new ClaimSubDetail(model);
  }

  @Override
  public List<ClaimSubDetail> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimSubDetailModel a", ClaimSubDetailModel.class).setMaxResults(maxResult);
      List<ClaimSubDetailModel> models = query.getResultList();
      return ClaimSubDetail.fromArray(models);
  }

  @Override
  public List<ClaimSubDetail> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimSubDetailModel a", ClaimSubDetailModel.class);
      List<ClaimSubDetailModel> models = query.getResultList();
      return ClaimSubDetail.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimSubDetail create(ClaimSubDetail e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimSubDetailModel(e));
      return e;
  }

  @Transactional
  public ClaimSubDetail update(ClaimSubDetail e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimSubDetailModel model = em.merge(new ClaimSubDetailModel(e));
      return new ClaimSubDetail(model);
  }

  @Override
  @Transactional
  public void delete(ClaimSubDetail e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimSubDetailModel removed = em.find(ClaimSubDetailModel.class, e.getId());
      em.remove(removed);
  }
}