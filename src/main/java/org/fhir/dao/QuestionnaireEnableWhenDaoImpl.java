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

import org.fhir.entity.QuestionnaireEnableWhenModel;
import org.fhir.pojo.QuestionnaireEnableWhen;

public class QuestionnaireEnableWhenDaoImpl implements QuestionnaireEnableWhenDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public QuestionnaireEnableWhenDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public QuestionnaireEnableWhen find(String id) {
    final EntityManager em = entityManagerProvider.get();
    QuestionnaireEnableWhenModel model = em.find(QuestionnaireEnableWhenModel.class, id);
    if (null == model) return null;
    return new QuestionnaireEnableWhen(model);
  }

  @Override
  public List<QuestionnaireEnableWhen> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from QuestionnaireEnableWhenModel a", QuestionnaireEnableWhenModel.class).setMaxResults(maxResult);
      List<QuestionnaireEnableWhenModel> models = query.getResultList();
      return QuestionnaireEnableWhen.fromArray(models);
  }

  @Override
  public List<QuestionnaireEnableWhen> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from QuestionnaireEnableWhenModel a", QuestionnaireEnableWhenModel.class);
      List<QuestionnaireEnableWhenModel> models = query.getResultList();
      return QuestionnaireEnableWhen.fromArray(models);
  }

  @Override
  @Transactional
  public QuestionnaireEnableWhen create(QuestionnaireEnableWhen e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new QuestionnaireEnableWhenModel(e));
      return e;
  }

  @Transactional
  public QuestionnaireEnableWhen update(QuestionnaireEnableWhen e) {
      final EntityManager em = entityManagerProvider.get();
      QuestionnaireEnableWhenModel model = em.merge(new QuestionnaireEnableWhenModel(e));
      return new QuestionnaireEnableWhen(model);
  }

  @Override
  @Transactional
  public void delete(QuestionnaireEnableWhen e) {
      final EntityManager em = entityManagerProvider.get();
      final QuestionnaireEnableWhenModel removed = em.find(QuestionnaireEnableWhenModel.class, e.getId());
      em.remove(removed);
  }
}