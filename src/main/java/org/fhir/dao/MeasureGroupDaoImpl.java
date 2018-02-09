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

import org.fhir.entity.MeasureGroupModel;
import org.fhir.pojo.MeasureGroup;

public class MeasureGroupDaoImpl implements MeasureGroupDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MeasureGroupDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MeasureGroup find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MeasureGroupModel model = em.find(MeasureGroupModel.class, id);
    if (null == model) return null;
    return new MeasureGroup(model);
  }

  @Override
  public List<MeasureGroup> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasureGroupModel a", MeasureGroupModel.class).setMaxResults(maxResult);
      List<MeasureGroupModel> models = query.getResultList();
      return MeasureGroup.fromArray(models);
  }

  @Override
  public List<MeasureGroup> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasureGroupModel a", MeasureGroupModel.class);
      List<MeasureGroupModel> models = query.getResultList();
      return MeasureGroup.fromArray(models);
  }

  @Override
  @Transactional
  public MeasureGroup create(MeasureGroup e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MeasureGroupModel(e));
      return e;
  }

  @Transactional
  public MeasureGroup update(MeasureGroup e) {
      final EntityManager em = entityManagerProvider.get();
      MeasureGroupModel model = em.merge(new MeasureGroupModel(e));
      return new MeasureGroup(model);
  }

  @Override
  @Transactional
  public void delete(MeasureGroup e) {
      final EntityManager em = entityManagerProvider.get();
      final MeasureGroupModel removed = em.find(MeasureGroupModel.class, e.getId());
      em.remove(removed);
  }
}