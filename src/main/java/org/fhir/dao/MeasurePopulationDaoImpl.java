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

import org.fhir.entity.MeasurePopulationModel;
import org.fhir.pojo.MeasurePopulation;

public class MeasurePopulationDaoImpl implements MeasurePopulationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MeasurePopulationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MeasurePopulation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MeasurePopulationModel model = em.find(MeasurePopulationModel.class, id);
    if (null == model) return null;
    return new MeasurePopulation(model);
  }

  @Override
  public List<MeasurePopulation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasurePopulationModel a", MeasurePopulationModel.class).setMaxResults(maxResult);
      List<MeasurePopulationModel> models = query.getResultList();
      return MeasurePopulation.fromArray(models);
  }

  @Override
  public List<MeasurePopulation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MeasurePopulationModel a", MeasurePopulationModel.class);
      List<MeasurePopulationModel> models = query.getResultList();
      return MeasurePopulation.fromArray(models);
  }

  @Override
  @Transactional
  public MeasurePopulation create(MeasurePopulation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MeasurePopulationModel(e));
      return e;
  }

  @Transactional
  public MeasurePopulation update(MeasurePopulation e) {
      final EntityManager em = entityManagerProvider.get();
      MeasurePopulationModel model = em.merge(new MeasurePopulationModel(e));
      return new MeasurePopulation(model);
  }

  @Override
  @Transactional
  public void delete(MeasurePopulation e) {
      final EntityManager em = entityManagerProvider.get();
      final MeasurePopulationModel removed = em.find(MeasurePopulationModel.class, e.getId());
      em.remove(removed);
  }
}