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

import org.fhir.entity.ProcedureModel;
import org.fhir.pojo.Procedure;

public class ProcedureDaoImpl implements ProcedureDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ProcedureDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Procedure find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ProcedureModel model = em.find(ProcedureModel.class, id);
    if (null == model) return null;
    return new Procedure(model);
  }

  @Override
  public List<Procedure> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProcedureModel a", ProcedureModel.class).setMaxResults(maxResult);
      List<ProcedureModel> models = query.getResultList();
      return Procedure.fromArray(models);
  }

  @Override
  public List<Procedure> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProcedureModel a", ProcedureModel.class);
      List<ProcedureModel> models = query.getResultList();
      return Procedure.fromArray(models);
  }

  @Override
  @Transactional
  public Procedure create(Procedure e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ProcedureModel(e));
      return e;
  }

  @Transactional
  public Procedure update(Procedure e) {
      final EntityManager em = entityManagerProvider.get();
      ProcedureModel model = em.merge(new ProcedureModel(e));
      return new Procedure(model);
  }

  @Override
  @Transactional
  public void delete(Procedure e) {
      final EntityManager em = entityManagerProvider.get();
      final ProcedureModel removed = em.find(ProcedureModel.class, e.getId());
      em.remove(removed);
  }
}