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

import org.fhir.entity.ProvenanceEntityModel;
import org.fhir.pojo.ProvenanceEntity;

public class ProvenanceEntityDaoImpl implements ProvenanceEntityDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ProvenanceEntityDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ProvenanceEntity find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ProvenanceEntityModel model = em.find(ProvenanceEntityModel.class, id);
    if (null == model) return null;
    return new ProvenanceEntity(model);
  }

  @Override
  public List<ProvenanceEntity> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProvenanceEntityModel a", ProvenanceEntityModel.class).setMaxResults(maxResult);
      List<ProvenanceEntityModel> models = query.getResultList();
      return ProvenanceEntity.fromArray(models);
  }

  @Override
  public List<ProvenanceEntity> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProvenanceEntityModel a", ProvenanceEntityModel.class);
      List<ProvenanceEntityModel> models = query.getResultList();
      return ProvenanceEntity.fromArray(models);
  }

  @Override
  @Transactional
  public ProvenanceEntity create(ProvenanceEntity e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ProvenanceEntityModel(e));
      return e;
  }

  @Transactional
  public ProvenanceEntity update(ProvenanceEntity e) {
      final EntityManager em = entityManagerProvider.get();
      ProvenanceEntityModel model = em.merge(new ProvenanceEntityModel(e));
      return new ProvenanceEntity(model);
  }

  @Override
  @Transactional
  public void delete(ProvenanceEntity e) {
      final EntityManager em = entityManagerProvider.get();
      final ProvenanceEntityModel removed = em.find(ProvenanceEntityModel.class, e.getId());
      em.remove(removed);
  }
}