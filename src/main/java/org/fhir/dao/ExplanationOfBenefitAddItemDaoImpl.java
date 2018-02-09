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

import org.fhir.entity.ExplanationOfBenefitAddItemModel;
import org.fhir.pojo.ExplanationOfBenefitAddItem;

public class ExplanationOfBenefitAddItemDaoImpl implements ExplanationOfBenefitAddItemDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExplanationOfBenefitAddItemDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExplanationOfBenefitAddItem find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExplanationOfBenefitAddItemModel model = em.find(ExplanationOfBenefitAddItemModel.class, id);
    if (null == model) return null;
    return new ExplanationOfBenefitAddItem(model);
  }

  @Override
  public List<ExplanationOfBenefitAddItem> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitAddItemModel a", ExplanationOfBenefitAddItemModel.class).setMaxResults(maxResult);
      List<ExplanationOfBenefitAddItemModel> models = query.getResultList();
      return ExplanationOfBenefitAddItem.fromArray(models);
  }

  @Override
  public List<ExplanationOfBenefitAddItem> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExplanationOfBenefitAddItemModel a", ExplanationOfBenefitAddItemModel.class);
      List<ExplanationOfBenefitAddItemModel> models = query.getResultList();
      return ExplanationOfBenefitAddItem.fromArray(models);
  }

  @Override
  @Transactional
  public ExplanationOfBenefitAddItem create(ExplanationOfBenefitAddItem e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExplanationOfBenefitAddItemModel(e));
      return e;
  }

  @Transactional
  public ExplanationOfBenefitAddItem update(ExplanationOfBenefitAddItem e) {
      final EntityManager em = entityManagerProvider.get();
      ExplanationOfBenefitAddItemModel model = em.merge(new ExplanationOfBenefitAddItemModel(e));
      return new ExplanationOfBenefitAddItem(model);
  }

  @Override
  @Transactional
  public void delete(ExplanationOfBenefitAddItem e) {
      final EntityManager em = entityManagerProvider.get();
      final ExplanationOfBenefitAddItemModel removed = em.find(ExplanationOfBenefitAddItemModel.class, e.getId());
      em.remove(removed);
  }
}