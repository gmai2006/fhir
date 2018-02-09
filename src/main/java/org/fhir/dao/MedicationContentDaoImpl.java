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

import org.fhir.entity.MedicationContentModel;
import org.fhir.pojo.MedicationContent;

public class MedicationContentDaoImpl implements MedicationContentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public MedicationContentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public MedicationContent find(String id) {
    final EntityManager em = entityManagerProvider.get();
    MedicationContentModel model = em.find(MedicationContentModel.class, id);
    if (null == model) return null;
    return new MedicationContent(model);
  }

  @Override
  public List<MedicationContent> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationContentModel a", MedicationContentModel.class).setMaxResults(maxResult);
      List<MedicationContentModel> models = query.getResultList();
      return MedicationContent.fromArray(models);
  }

  @Override
  public List<MedicationContent> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from MedicationContentModel a", MedicationContentModel.class);
      List<MedicationContentModel> models = query.getResultList();
      return MedicationContent.fromArray(models);
  }

  @Override
  @Transactional
  public MedicationContent create(MedicationContent e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new MedicationContentModel(e));
      return e;
  }

  @Transactional
  public MedicationContent update(MedicationContent e) {
      final EntityManager em = entityManagerProvider.get();
      MedicationContentModel model = em.merge(new MedicationContentModel(e));
      return new MedicationContent(model);
  }

  @Override
  @Transactional
  public void delete(MedicationContent e) {
      final EntityManager em = entityManagerProvider.get();
      final MedicationContentModel removed = em.find(MedicationContentModel.class, e.getId());
      em.remove(removed);
  }
}