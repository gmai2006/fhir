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

import org.fhir.entity.ReferenceModel;
import org.fhir.pojo.Reference;

public class ReferenceDaoImpl implements ReferenceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ReferenceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Reference find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ReferenceModel model = em.find(ReferenceModel.class, id);
    if (null == model) return null;
    return new Reference(model);
  }

  @Override
  public List<Reference> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ReferenceModel a", ReferenceModel.class).setMaxResults(maxResult);
      List<ReferenceModel> models = query.getResultList();
      return Reference.fromArray(models);
  }

  @Override
  public List<Reference> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ReferenceModel a", ReferenceModel.class);
      List<ReferenceModel> models = query.getResultList();
      return Reference.fromArray(models);
  }

  @Override
  @Transactional
  public Reference create(Reference e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ReferenceModel(e));
      return e;
  }

  @Transactional
  public Reference update(Reference e) {
      final EntityManager em = entityManagerProvider.get();
      ReferenceModel model = em.merge(new ReferenceModel(e));
      return new Reference(model);
  }

  @Override
  @Transactional
  public void delete(Reference e) {
      final EntityManager em = entityManagerProvider.get();
      final ReferenceModel removed = em.find(ReferenceModel.class, e.getId());
      em.remove(removed);
  }
}