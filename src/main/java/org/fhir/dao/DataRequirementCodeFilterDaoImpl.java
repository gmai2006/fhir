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

import org.fhir.entity.DataRequirementCodeFilterModel;
import org.fhir.pojo.DataRequirementCodeFilter;

public class DataRequirementCodeFilterDaoImpl implements DataRequirementCodeFilterDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DataRequirementCodeFilterDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DataRequirementCodeFilter find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DataRequirementCodeFilterModel model = em.find(DataRequirementCodeFilterModel.class, id);
    if (null == model) return null;
    return new DataRequirementCodeFilter(model);
  }

  @Override
  public List<DataRequirementCodeFilter> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DataRequirementCodeFilterModel a", DataRequirementCodeFilterModel.class).setMaxResults(maxResult);
      List<DataRequirementCodeFilterModel> models = query.getResultList();
      return DataRequirementCodeFilter.fromArray(models);
  }

  @Override
  public List<DataRequirementCodeFilter> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DataRequirementCodeFilterModel a", DataRequirementCodeFilterModel.class);
      List<DataRequirementCodeFilterModel> models = query.getResultList();
      return DataRequirementCodeFilter.fromArray(models);
  }

  @Override
  @Transactional
  public DataRequirementCodeFilter create(DataRequirementCodeFilter e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DataRequirementCodeFilterModel(e));
      return e;
  }

  @Transactional
  public DataRequirementCodeFilter update(DataRequirementCodeFilter e) {
      final EntityManager em = entityManagerProvider.get();
      DataRequirementCodeFilterModel model = em.merge(new DataRequirementCodeFilterModel(e));
      return new DataRequirementCodeFilter(model);
  }

  @Override
  @Transactional
  public void delete(DataRequirementCodeFilter e) {
      final EntityManager em = entityManagerProvider.get();
      final DataRequirementCodeFilterModel removed = em.find(DataRequirementCodeFilterModel.class, e.getId());
      em.remove(removed);
  }
}