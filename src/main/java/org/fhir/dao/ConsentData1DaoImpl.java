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

import org.fhir.entity.ConsentData1Model;
import org.fhir.pojo.ConsentData1;

public class ConsentData1DaoImpl implements ConsentData1Dao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConsentData1DaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ConsentData1 find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConsentData1Model model = em.find(ConsentData1Model.class, id);
    if (null == model) return null;
    return new ConsentData1(model);
  }

  @Override
  public List<ConsentData1> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConsentData1Model a", ConsentData1Model.class).setMaxResults(maxResult);
      List<ConsentData1Model> models = query.getResultList();
      return ConsentData1.fromArray(models);
  }

  @Override
  public List<ConsentData1> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConsentData1Model a", ConsentData1Model.class);
      List<ConsentData1Model> models = query.getResultList();
      return ConsentData1.fromArray(models);
  }

  @Override
  @Transactional
  public ConsentData1 create(ConsentData1 e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConsentData1Model(e));
      return e;
  }

  @Transactional
  public ConsentData1 update(ConsentData1 e) {
      final EntityManager em = entityManagerProvider.get();
      ConsentData1Model model = em.merge(new ConsentData1Model(e));
      return new ConsentData1(model);
  }

  @Override
  @Transactional
  public void delete(ConsentData1 e) {
      final EntityManager em = entityManagerProvider.get();
      final ConsentData1Model removed = em.find(ConsentData1Model.class, e.getId());
      em.remove(removed);
  }
}