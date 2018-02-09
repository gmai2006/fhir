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

import org.fhir.entity.ConsentModel;
import org.fhir.pojo.Consent;

public class ConsentDaoImpl implements ConsentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ConsentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Consent find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ConsentModel model = em.find(ConsentModel.class, id);
    if (null == model) return null;
    return new Consent(model);
  }

  @Override
  public List<Consent> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConsentModel a", ConsentModel.class).setMaxResults(maxResult);
      List<ConsentModel> models = query.getResultList();
      return Consent.fromArray(models);
  }

  @Override
  public List<Consent> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ConsentModel a", ConsentModel.class);
      List<ConsentModel> models = query.getResultList();
      return Consent.fromArray(models);
  }

  @Override
  @Transactional
  public Consent create(Consent e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ConsentModel(e));
      return e;
  }

  @Transactional
  public Consent update(Consent e) {
      final EntityManager em = entityManagerProvider.get();
      ConsentModel model = em.merge(new ConsentModel(e));
      return new Consent(model);
  }

  @Override
  @Transactional
  public void delete(Consent e) {
      final EntityManager em = entityManagerProvider.get();
      final ConsentModel removed = em.find(ConsentModel.class, e.getId());
      em.remove(removed);
  }
}