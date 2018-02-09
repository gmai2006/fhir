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

import org.fhir.entity.ClaimResponsePaymentModel;
import org.fhir.pojo.ClaimResponsePayment;

public class ClaimResponsePaymentDaoImpl implements ClaimResponsePaymentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimResponsePaymentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimResponsePayment find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimResponsePaymentModel model = em.find(ClaimResponsePaymentModel.class, id);
    if (null == model) return null;
    return new ClaimResponsePayment(model);
  }

  @Override
  public List<ClaimResponsePayment> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimResponsePaymentModel a", ClaimResponsePaymentModel.class).setMaxResults(maxResult);
      List<ClaimResponsePaymentModel> models = query.getResultList();
      return ClaimResponsePayment.fromArray(models);
  }

  @Override
  public List<ClaimResponsePayment> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimResponsePaymentModel a", ClaimResponsePaymentModel.class);
      List<ClaimResponsePaymentModel> models = query.getResultList();
      return ClaimResponsePayment.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimResponsePayment create(ClaimResponsePayment e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimResponsePaymentModel(e));
      return e;
  }

  @Transactional
  public ClaimResponsePayment update(ClaimResponsePayment e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimResponsePaymentModel model = em.merge(new ClaimResponsePaymentModel(e));
      return new ClaimResponsePayment(model);
  }

  @Override
  @Transactional
  public void delete(ClaimResponsePayment e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimResponsePaymentModel removed = em.find(ClaimResponsePaymentModel.class, e.getId());
      em.remove(removed);
  }
}