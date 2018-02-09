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

import org.fhir.entity.MeasureReportGroupModel;
import org.fhir.pojo.MeasureReportGroup;

public class MeasureReportGroupDaoImpl implements MeasureReportGroupDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MeasureReportGroupDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MeasureReportGroup find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MeasureReportGroupModel model = em.find(MeasureReportGroupModel.class, id);
    if (null == model) return null;
    return new MeasureReportGroup(model);
  }

  @Override
  public List<MeasureReportGroup> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasureReportGroupModel a", MeasureReportGroupModel.class).setMaxResults(maxResult);
      List<MeasureReportGroupModel> models = query.getResultList();
      return MeasureReportGroup.fromArray(models);
  }

  @Override
  public List<MeasureReportGroup> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasureReportGroupModel a", MeasureReportGroupModel.class);
      List<MeasureReportGroupModel> models = query.getResultList();
      return MeasureReportGroup.fromArray(models);
  }

  @Override
  @Transactional
  public MeasureReportGroup create(MeasureReportGroup e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MeasureReportGroupModel(e));
      return e;
  }

  @Transactional
  public MeasureReportGroup update(MeasureReportGroup e) {
      final EntityManager em = entityManagerProvider.get();
      MeasureReportGroupModel model = em.merge(new MeasureReportGroupModel(e));
      return new MeasureReportGroup(model);
  }

  @Override
  @Transactional
  public void delete(MeasureReportGroup e) {
      final EntityManager em = entityManagerProvider.get();
      final MeasureReportGroupModel removed = em.find(MeasureReportGroupModel.class, e.getId());
      em.remove(removed);
  }
}