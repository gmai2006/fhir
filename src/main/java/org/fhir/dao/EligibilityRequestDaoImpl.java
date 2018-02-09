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

import org.fhir.entity.EligibilityRequestModel;
import org.fhir.pojo.EligibilityRequest;

public class EligibilityRequestDaoImpl implements EligibilityRequestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EligibilityRequestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public EligibilityRequest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EligibilityRequestModel model = em.find(EligibilityRequestModel.class, id);
    if (null == model) return null;
    return new EligibilityRequest(model);
  }

  @Override
  public List<EligibilityRequest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EligibilityRequestModel a", EligibilityRequestModel.class).setMaxResults(maxResult);
      List<EligibilityRequestModel> models = query.getResultList();
      return EligibilityRequest.fromArray(models);
  }

  @Override
  public List<EligibilityRequest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EligibilityRequestModel a", EligibilityRequestModel.class);
      List<EligibilityRequestModel> models = query.getResultList();
      return EligibilityRequest.fromArray(models);
  }

  @Override
  @Transactional
  public EligibilityRequest create(EligibilityRequest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new EligibilityRequestModel(e));
      return e;
  }

  @Transactional
  public EligibilityRequest update(EligibilityRequest e) {
      final EntityManager em = entityManagerProvider.get();
      EligibilityRequestModel model = em.merge(new EligibilityRequestModel(e));
      return new EligibilityRequest(model);
  }

  @Override
  @Transactional
  public void delete(EligibilityRequest e) {
      final EntityManager em = entityManagerProvider.get();
      final EligibilityRequestModel removed = em.find(EligibilityRequestModel.class, e.getId());
      em.remove(removed);
  }
}