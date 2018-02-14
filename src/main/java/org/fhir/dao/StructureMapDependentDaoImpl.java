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

import org.fhir.entity.StructureMapDependentModel;
import org.fhir.pojo.StructureMapDependent;
import org.fhir.pojo.StructureMapDependentHelper;

public class StructureMapDependentDaoImpl implements StructureMapDependentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public StructureMapDependentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public StructureMapDependent find(String id) {
    final EntityManager em = entityManagerProvider.get();
    StructureMapDependentModel model = em.find(StructureMapDependentModel.class, id);
    if (null == model) return null;
    return new StructureMapDependent(model);
  }

  @Override
  public List<StructureMapDependent> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from StructureMapDependentModel a", StructureMapDependentModel.class).setMaxResults(maxResult);
      List<StructureMapDependentModel> models = query.getResultList();
      return StructureMapDependentHelper.fromArray2Array(models);
  }

  @Override
  public List<StructureMapDependent> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from StructureMapDependentModel a", StructureMapDependentModel.class);
      List<StructureMapDependentModel> models = query.getResultList();
      return StructureMapDependentHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(StructureMapDependent e) {
      final EntityManager em = entityManagerProvider.get();
      final StructureMapDependentModel removed = em.find(StructureMapDependentModel.class, e.getId());
      em.remove(removed);
  }
}