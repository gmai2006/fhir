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

import org.fhir.entity.ResearchSubjectModel;
import org.fhir.pojo.ResearchSubject;

public class ResearchSubjectDaoImpl implements ResearchSubjectDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ResearchSubjectDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ResearchSubject find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ResearchSubjectModel model = em.find(ResearchSubjectModel.class, id);
    if (null == model) return null;
    return new ResearchSubject(model);
  }

  @Override
  public List<ResearchSubject> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResearchSubjectModel a", ResearchSubjectModel.class).setMaxResults(maxResult);
      List<ResearchSubjectModel> models = query.getResultList();
      return ResearchSubject.fromArray(models);
  }

  @Override
  public List<ResearchSubject> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ResearchSubjectModel a", ResearchSubjectModel.class);
      List<ResearchSubjectModel> models = query.getResultList();
      return ResearchSubject.fromArray(models);
  }

  @Override
  @Transactional
  public ResearchSubject create(ResearchSubject e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ResearchSubjectModel(e));
      return e;
  }

  @Transactional
  public ResearchSubject update(ResearchSubject e) {
      final EntityManager em = entityManagerProvider.get();
      ResearchSubjectModel model = em.merge(new ResearchSubjectModel(e));
      return new ResearchSubject(model);
  }

  @Override
  @Transactional
  public void delete(ResearchSubject e) {
      final EntityManager em = entityManagerProvider.get();
      final ResearchSubjectModel removed = em.find(ResearchSubjectModel.class, e.getId());
      em.remove(removed);
  }
}