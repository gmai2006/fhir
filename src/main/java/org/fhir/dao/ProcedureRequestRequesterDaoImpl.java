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

import org.fhir.entity.ProcedureRequestRequesterModel;
import org.fhir.pojo.ProcedureRequestRequester;

public class ProcedureRequestRequesterDaoImpl implements ProcedureRequestRequesterDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ProcedureRequestRequesterDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ProcedureRequestRequester find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ProcedureRequestRequesterModel model = em.find(ProcedureRequestRequesterModel.class, id);
    if (null == model) return null;
    return new ProcedureRequestRequester(model);
  }

  @Override
  public List<ProcedureRequestRequester> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProcedureRequestRequesterModel a", ProcedureRequestRequesterModel.class).setMaxResults(maxResult);
      List<ProcedureRequestRequesterModel> models = query.getResultList();
      return ProcedureRequestRequester.fromArray(models);
  }

  @Override
  public List<ProcedureRequestRequester> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProcedureRequestRequesterModel a", ProcedureRequestRequesterModel.class);
      List<ProcedureRequestRequesterModel> models = query.getResultList();
      return ProcedureRequestRequester.fromArray(models);
  }

  @Override
  @Transactional
  public ProcedureRequestRequester create(ProcedureRequestRequester e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ProcedureRequestRequesterModel(e));
      return e;
  }

  @Transactional
  public ProcedureRequestRequester update(ProcedureRequestRequester e) {
      final EntityManager em = entityManagerProvider.get();
      ProcedureRequestRequesterModel model = em.merge(new ProcedureRequestRequesterModel(e));
      return new ProcedureRequestRequester(model);
  }

  @Override
  @Transactional
  public void delete(ProcedureRequestRequester e) {
      final EntityManager em = entityManagerProvider.get();
      final ProcedureRequestRequesterModel removed = em.find(ProcedureRequestRequesterModel.class, e.getId());
      em.remove(removed);
  }
}