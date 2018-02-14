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

import org.fhir.entity.QuestionnaireModel;
import org.fhir.pojo.Questionnaire;
import org.fhir.pojo.QuestionnaireHelper;

public class QuestionnaireDaoImpl implements QuestionnaireDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public QuestionnaireDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Questionnaire find(String id) {
    final EntityManager em = entityManagerProvider.get();
    QuestionnaireModel model = em.find(QuestionnaireModel.class, id);
    if (null == model) return null;
    return new Questionnaire(model);
  }

  @Override
  public List<Questionnaire> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from QuestionnaireModel a", QuestionnaireModel.class).setMaxResults(maxResult);
      List<QuestionnaireModel> models = query.getResultList();
      return QuestionnaireHelper.fromArray2Array(models);
  }

  @Override
  public List<Questionnaire> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from QuestionnaireModel a", QuestionnaireModel.class);
      List<QuestionnaireModel> models = query.getResultList();
      return QuestionnaireHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Questionnaire create(Questionnaire e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new QuestionnaireModel(e));
      return e;
  }

  @Transactional
  public Questionnaire update(Questionnaire e) {
      final EntityManager em = entityManagerProvider.get();
      QuestionnaireModel model = em.merge(new QuestionnaireModel(e));
      return new Questionnaire(model);
  }
  @Override
  @Transactional
  public void delete(Questionnaire e) {
      final EntityManager em = entityManagerProvider.get();
      final QuestionnaireModel removed = em.find(QuestionnaireModel.class, e.getId());
      em.remove(removed);
  }
}