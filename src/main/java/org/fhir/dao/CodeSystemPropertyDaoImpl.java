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

import org.fhir.entity.CodeSystemPropertyModel;
import org.fhir.pojo.CodeSystemProperty;

public class CodeSystemPropertyDaoImpl implements CodeSystemPropertyDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CodeSystemPropertyDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CodeSystemProperty find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CodeSystemPropertyModel model = em.find(CodeSystemPropertyModel.class, id);
    if (null == model) return null;
    return new CodeSystemProperty(model);
  }

  @Override
  public List<CodeSystemProperty> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CodeSystemPropertyModel a", CodeSystemPropertyModel.class).setMaxResults(maxResult);
      List<CodeSystemPropertyModel> models = query.getResultList();
      return CodeSystemProperty.fromArray(models);
  }

  @Override
  public List<CodeSystemProperty> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CodeSystemPropertyModel a", CodeSystemPropertyModel.class);
      List<CodeSystemPropertyModel> models = query.getResultList();
      return CodeSystemProperty.fromArray(models);
  }

  @Override
  @Transactional
  public CodeSystemProperty create(CodeSystemProperty e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CodeSystemPropertyModel(e));
      return e;
  }

  @Transactional
  public CodeSystemProperty update(CodeSystemProperty e) {
      final EntityManager em = entityManagerProvider.get();
      CodeSystemPropertyModel model = em.merge(new CodeSystemPropertyModel(e));
      return new CodeSystemProperty(model);
  }

  @Override
  @Transactional
  public void delete(CodeSystemProperty e) {
      final EntityManager em = entityManagerProvider.get();
      final CodeSystemPropertyModel removed = em.find(CodeSystemPropertyModel.class, e.getId());
      em.remove(removed);
  }
}