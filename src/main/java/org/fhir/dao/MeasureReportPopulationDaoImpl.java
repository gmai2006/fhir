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

import org.fhir.entity.MeasureReportPopulationModel;
import org.fhir.pojo.MeasureReportPopulation;

public class MeasureReportPopulationDaoImpl implements MeasureReportPopulationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MeasureReportPopulationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MeasureReportPopulation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MeasureReportPopulationModel model = em.find(MeasureReportPopulationModel.class, id);
    if (null == model) return null;
    return new MeasureReportPopulation(model);
  }

  @Override
  public List<MeasureReportPopulation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasureReportPopulationModel a", MeasureReportPopulationModel.class).setMaxResults(maxResult);
      List<MeasureReportPopulationModel> models = query.getResultList();
      return MeasureReportPopulation.fromArray(models);
  }

  @Override
  public List<MeasureReportPopulation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasureReportPopulationModel a", MeasureReportPopulationModel.class);
      List<MeasureReportPopulationModel> models = query.getResultList();
      return MeasureReportPopulation.fromArray(models);
  }

  @Override
  @Transactional
  public MeasureReportPopulation create(MeasureReportPopulation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MeasureReportPopulationModel(e));
      return e;
  }

  @Transactional
  public MeasureReportPopulation update(MeasureReportPopulation e) {
      final EntityManager em = entityManagerProvider.get();
      MeasureReportPopulationModel model = em.merge(new MeasureReportPopulationModel(e));
      return new MeasureReportPopulation(model);
  }

  @Override
  @Transactional
  public void delete(MeasureReportPopulation e) {
      final EntityManager em = entityManagerProvider.get();
      final MeasureReportPopulationModel removed = em.find(MeasureReportPopulationModel.class, e.getId());
      em.remove(removed);
  }
}