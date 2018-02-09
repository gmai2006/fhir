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

import org.fhir.entity.AuditEventDetailModel;
import org.fhir.pojo.AuditEventDetail;

public class AuditEventDetailDaoImpl implements AuditEventDetailDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AuditEventDetailDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public AuditEventDetail find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AuditEventDetailModel model = em.find(AuditEventDetailModel.class, id);
    if (null == model) return null;
    return new AuditEventDetail(model);
  }

  @Override
  public List<AuditEventDetail> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AuditEventDetailModel a", AuditEventDetailModel.class).setMaxResults(maxResult);
      List<AuditEventDetailModel> models = query.getResultList();
      return AuditEventDetail.fromArray(models);
  }

  @Override
  public List<AuditEventDetail> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AuditEventDetailModel a", AuditEventDetailModel.class);
      List<AuditEventDetailModel> models = query.getResultList();
      return AuditEventDetail.fromArray(models);
  }

  @Override
  @Transactional
  public AuditEventDetail create(AuditEventDetail e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AuditEventDetailModel(e));
      return e;
  }

  @Transactional
  public AuditEventDetail update(AuditEventDetail e) {
      final EntityManager em = entityManagerProvider.get();
      AuditEventDetailModel model = em.merge(new AuditEventDetailModel(e));
      return new AuditEventDetail(model);
  }

  @Override
  @Transactional
  public void delete(AuditEventDetail e) {
      final EntityManager em = entityManagerProvider.get();
      final AuditEventDetailModel removed = em.find(AuditEventDetailModel.class, e.getId());
      em.remove(removed);
  }
}