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

import org.fhir.entity.CodeSystemModel;
import org.fhir.pojo.CodeSystem;
import org.fhir.pojo.CodeSystemHelper;

public class CodeSystemDaoImpl implements CodeSystemDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CodeSystemDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CodeSystem find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CodeSystemModel model = em.find(CodeSystemModel.class, id);
    if (null == model) return null;
    return new CodeSystem(model);
  }

  @Override
  public List<CodeSystem> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CodeSystemModel a", CodeSystemModel.class).setMaxResults(maxResult);
      List<CodeSystemModel> models = query.getResultList();
      return CodeSystemHelper.fromArray2Array(models);
  }

  @Override
  public List<CodeSystem> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CodeSystemModel a", CodeSystemModel.class);
      List<CodeSystemModel> models = query.getResultList();
      return CodeSystemHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public CodeSystem create(CodeSystem e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CodeSystemModel(e));
      return e;
  }

  @Transactional
  public CodeSystem update(CodeSystem e) {
      final EntityManager em = entityManagerProvider.get();
      CodeSystemModel model = em.merge(new CodeSystemModel(e));
      return new CodeSystem(model);
  }
  @Override
  @Transactional
  public void delete(CodeSystem e) {
      final EntityManager em = entityManagerProvider.get();
      final CodeSystemModel removed = em.find(CodeSystemModel.class, e.getId());
      em.remove(removed);
  }
}