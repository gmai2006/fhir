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

import org.fhir.entity.StructureMapTargetModel;
import org.fhir.pojo.StructureMapTarget;
import org.fhir.pojo.StructureMapTargetHelper;

public class StructureMapTargetDaoImpl implements StructureMapTargetDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public StructureMapTargetDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public StructureMapTarget find(String id) {
    final EntityManager em = entityManagerProvider.get();
    StructureMapTargetModel model = em.find(StructureMapTargetModel.class, id);
    if (null == model) return null;
    return new StructureMapTarget(model);
  }

  @Override
  public List<StructureMapTarget> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from StructureMapTargetModel a", StructureMapTargetModel.class).setMaxResults(maxResult);
      List<StructureMapTargetModel> models = query.getResultList();
      return StructureMapTargetHelper.fromArray2Array(models);
  }

  @Override
  public List<StructureMapTarget> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from StructureMapTargetModel a", StructureMapTargetModel.class);
      List<StructureMapTargetModel> models = query.getResultList();
      return StructureMapTargetHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(StructureMapTarget e) {
      final EntityManager em = entityManagerProvider.get();
      final StructureMapTargetModel removed = em.find(StructureMapTargetModel.class, e.getId());
      em.remove(removed);
  }
}