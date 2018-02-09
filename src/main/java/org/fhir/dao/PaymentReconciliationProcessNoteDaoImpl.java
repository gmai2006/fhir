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

import org.fhir.entity.PaymentReconciliationProcessNoteModel;
import org.fhir.pojo.PaymentReconciliationProcessNote;

public class PaymentReconciliationProcessNoteDaoImpl implements PaymentReconciliationProcessNoteDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PaymentReconciliationProcessNoteDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PaymentReconciliationProcessNote find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PaymentReconciliationProcessNoteModel model = em.find(PaymentReconciliationProcessNoteModel.class, id);
    if (null == model) return null;
    return new PaymentReconciliationProcessNote(model);
  }

  @Override
  public List<PaymentReconciliationProcessNote> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PaymentReconciliationProcessNoteModel a", PaymentReconciliationProcessNoteModel.class).setMaxResults(maxResult);
      List<PaymentReconciliationProcessNoteModel> models = query.getResultList();
      return PaymentReconciliationProcessNote.fromArray(models);
  }

  @Override
  public List<PaymentReconciliationProcessNote> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PaymentReconciliationProcessNoteModel a", PaymentReconciliationProcessNoteModel.class);
      List<PaymentReconciliationProcessNoteModel> models = query.getResultList();
      return PaymentReconciliationProcessNote.fromArray(models);
  }

  @Override
  @Transactional
  public PaymentReconciliationProcessNote create(PaymentReconciliationProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PaymentReconciliationProcessNoteModel(e));
      return e;
  }

  @Transactional
  public PaymentReconciliationProcessNote update(PaymentReconciliationProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      PaymentReconciliationProcessNoteModel model = em.merge(new PaymentReconciliationProcessNoteModel(e));
      return new PaymentReconciliationProcessNote(model);
  }

  @Override
  @Transactional
  public void delete(PaymentReconciliationProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      final PaymentReconciliationProcessNoteModel removed = em.find(PaymentReconciliationProcessNoteModel.class, e.getId());
      em.remove(removed);
  }
}