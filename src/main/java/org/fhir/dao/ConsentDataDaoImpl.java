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

import org.fhir.entity.ConsentDataModel;
import org.fhir.pojo.ConsentData;

public class ConsentDataDaoImpl implements ConsentDataDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConsentDataDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ConsentData find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConsentDataModel model = em.find(ConsentDataModel.class, id);
    if (null == model) return null;
    return new ConsentData(model);
  }

  @Override
  public List<ConsentData> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConsentDataModel a", ConsentDataModel.class).setMaxResults(maxResult);
      List<ConsentDataModel> models = query.getResultList();
      return ConsentData.fromArray(models);
  }

  @Override
  public List<ConsentData> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConsentDataModel a", ConsentDataModel.class);
      List<ConsentDataModel> models = query.getResultList();
      return ConsentData.fromArray(models);
  }

  @Override
  @Transactional
  public ConsentData create(ConsentData e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConsentDataModel(e));
      return e;
  }

  @Transactional
  public ConsentData update(ConsentData e) {
      final EntityManager em = entityManagerProvider.get();
      ConsentDataModel model = em.merge(new ConsentDataModel(e));
      return new ConsentData(model);
  }

  @Override
  @Transactional
  public void delete(ConsentData e) {
      final EntityManager em = entityManagerProvider.get();
      final ConsentDataModel removed = em.find(ConsentDataModel.class, e.getId());
      em.remove(removed);
  }
}