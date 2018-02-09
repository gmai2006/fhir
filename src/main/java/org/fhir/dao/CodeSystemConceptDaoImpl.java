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

import org.fhir.entity.CodeSystemConceptModel;
import org.fhir.pojo.CodeSystemConcept;

public class CodeSystemConceptDaoImpl implements CodeSystemConceptDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CodeSystemConceptDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CodeSystemConcept find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CodeSystemConceptModel model = em.find(CodeSystemConceptModel.class, id);
    if (null == model) return null;
    return new CodeSystemConcept(model);
  }

  @Override
  public List<CodeSystemConcept> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CodeSystemConceptModel a", CodeSystemConceptModel.class).setMaxResults(maxResult);
      List<CodeSystemConceptModel> models = query.getResultList();
      return CodeSystemConcept.fromArray(models);
  }

  @Override
  public List<CodeSystemConcept> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CodeSystemConceptModel a", CodeSystemConceptModel.class);
      List<CodeSystemConceptModel> models = query.getResultList();
      return CodeSystemConcept.fromArray(models);
  }

  @Override
  @Transactional
  public CodeSystemConcept create(CodeSystemConcept e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CodeSystemConceptModel(e));
      return e;
  }

  @Transactional
  public CodeSystemConcept update(CodeSystemConcept e) {
      final EntityManager em = entityManagerProvider.get();
      CodeSystemConceptModel model = em.merge(new CodeSystemConceptModel(e));
      return new CodeSystemConcept(model);
  }

  @Override
  @Transactional
  public void delete(CodeSystemConcept e) {
      final EntityManager em = entityManagerProvider.get();
      final CodeSystemConceptModel removed = em.find(CodeSystemConceptModel.class, e.getId());
      em.remove(removed);
  }
}