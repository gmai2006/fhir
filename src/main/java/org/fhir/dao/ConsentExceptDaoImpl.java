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

import org.fhir.entity.ConsentExceptModel;
import org.fhir.pojo.ConsentExcept;

public class ConsentExceptDaoImpl implements ConsentExceptDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConsentExceptDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ConsentExcept find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConsentExceptModel model = em.find(ConsentExceptModel.class, id);
    if (null == model) return null;
    return new ConsentExcept(model);
  }

  @Override
  public List<ConsentExcept> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConsentExceptModel a", ConsentExceptModel.class).setMaxResults(maxResult);
      List<ConsentExceptModel> models = query.getResultList();
      return ConsentExcept.fromArray(models);
  }

  @Override
  public List<ConsentExcept> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConsentExceptModel a", ConsentExceptModel.class);
      List<ConsentExceptModel> models = query.getResultList();
      return ConsentExcept.fromArray(models);
  }

  @Override
  @Transactional
  public ConsentExcept create(ConsentExcept e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConsentExceptModel(e));
      return e;
  }

  @Transactional
  public ConsentExcept update(ConsentExcept e) {
      final EntityManager em = entityManagerProvider.get();
      ConsentExceptModel model = em.merge(new ConsentExceptModel(e));
      return new ConsentExcept(model);
  }

  @Override
  @Transactional
  public void delete(ConsentExcept e) {
      final EntityManager em = entityManagerProvider.get();
      final ConsentExceptModel removed = em.find(ConsentExceptModel.class, e.getId());
      em.remove(removed);
  }
}