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

import org.fhir.entity.OperationDefinitionModel;
import org.fhir.pojo.OperationDefinition;

public class OperationDefinitionDaoImpl implements OperationDefinitionDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public OperationDefinitionDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public OperationDefinition find(String id) {
    final EntityManager em = entityManagerProvider.get();
    OperationDefinitionModel model = em.find(OperationDefinitionModel.class, id);
    if (null == model) return null;
    return new OperationDefinition(model);
  }

  @Override
  public List<OperationDefinition> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OperationDefinitionModel a", OperationDefinitionModel.class).setMaxResults(maxResult);
      List<OperationDefinitionModel> models = query.getResultList();
      return OperationDefinition.fromArray(models);
  }

  @Override
  public List<OperationDefinition> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OperationDefinitionModel a", OperationDefinitionModel.class);
      List<OperationDefinitionModel> models = query.getResultList();
      return OperationDefinition.fromArray(models);
  }

  @Override
  @Transactional
  public OperationDefinition create(OperationDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new OperationDefinitionModel(e));
      return e;
  }

  @Transactional
  public OperationDefinition update(OperationDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      OperationDefinitionModel model = em.merge(new OperationDefinitionModel(e));
      return new OperationDefinition(model);
  }

  @Override
  @Transactional
  public void delete(OperationDefinition e) {
      final EntityManager em = entityManagerProvider.get();
      final OperationDefinitionModel removed = em.find(OperationDefinitionModel.class, e.getId());
      em.remove(removed);
  }
}