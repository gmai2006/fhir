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

import org.fhir.entity.PractitionerModel;
import org.fhir.pojo.Practitioner;

public class PractitionerDaoImpl implements PractitionerDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PractitionerDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Practitioner find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PractitionerModel model = em.find(PractitionerModel.class, id);
    if (null == model) return null;
    return new Practitioner(model);
  }

  @Override
  public List<Practitioner> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PractitionerModel a", PractitionerModel.class).setMaxResults(maxResult);
      List<PractitionerModel> models = query.getResultList();
      return Practitioner.fromArray(models);
  }

  @Override
  public List<Practitioner> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PractitionerModel a", PractitionerModel.class);
      List<PractitionerModel> models = query.getResultList();
      return Practitioner.fromArray(models);
  }

  @Override
  @Transactional
  public Practitioner create(Practitioner e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PractitionerModel(e));
      return e;
  }

  @Transactional
  public Practitioner update(Practitioner e) {
      final EntityManager em = entityManagerProvider.get();
      PractitionerModel model = em.merge(new PractitionerModel(e));
      return new Practitioner(model);
  }

  @Override
  @Transactional
  public void delete(Practitioner e) {
      final EntityManager em = entityManagerProvider.get();
      final PractitionerModel removed = em.find(PractitionerModel.class, e.getId());
      em.remove(removed);
  }
}