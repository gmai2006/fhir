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

import org.fhir.entity.OperationDefinitionOverloadModel;
import org.fhir.pojo.OperationDefinitionOverload;

public class OperationDefinitionOverloadDaoImpl implements OperationDefinitionOverloadDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public OperationDefinitionOverloadDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public OperationDefinitionOverload find(String id) {
    final EntityManager em = entityManagerProvider.get();
    OperationDefinitionOverloadModel model = em.find(OperationDefinitionOverloadModel.class, id);
    if (null == model) return null;
    return new OperationDefinitionOverload(model);
  }

  @Override
  public List<OperationDefinitionOverload> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OperationDefinitionOverloadModel a", OperationDefinitionOverloadModel.class).setMaxResults(maxResult);
      List<OperationDefinitionOverloadModel> models = query.getResultList();
      return OperationDefinitionOverload.fromArray(models);
  }

  @Override
  public List<OperationDefinitionOverload> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OperationDefinitionOverloadModel a", OperationDefinitionOverloadModel.class);
      List<OperationDefinitionOverloadModel> models = query.getResultList();
      return OperationDefinitionOverload.fromArray(models);
  }

  @Override
  @Transactional
  public OperationDefinitionOverload create(OperationDefinitionOverload e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new OperationDefinitionOverloadModel(e));
      return e;
  }

  @Transactional
  public OperationDefinitionOverload update(OperationDefinitionOverload e) {
      final EntityManager em = entityManagerProvider.get();
      OperationDefinitionOverloadModel model = em.merge(new OperationDefinitionOverloadModel(e));
      return new OperationDefinitionOverload(model);
  }

  @Override
  @Transactional
  public void delete(OperationDefinitionOverload e) {
      final EntityManager em = entityManagerProvider.get();
      final OperationDefinitionOverloadModel removed = em.find(OperationDefinitionOverloadModel.class, e.getId());
      em.remove(removed);
  }
}