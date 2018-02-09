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

import org.fhir.entity.EligibilityResponseModel;
import org.fhir.pojo.EligibilityResponse;

public class EligibilityResponseDaoImpl implements EligibilityResponseDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EligibilityResponseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public EligibilityResponse find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EligibilityResponseModel model = em.find(EligibilityResponseModel.class, id);
    if (null == model) return null;
    return new EligibilityResponse(model);
  }

  @Override
  public List<EligibilityResponse> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EligibilityResponseModel a", EligibilityResponseModel.class).setMaxResults(maxResult);
      List<EligibilityResponseModel> models = query.getResultList();
      return EligibilityResponse.fromArray(models);
  }

  @Override
  public List<EligibilityResponse> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EligibilityResponseModel a", EligibilityResponseModel.class);
      List<EligibilityResponseModel> models = query.getResultList();
      return EligibilityResponse.fromArray(models);
  }

  @Override
  @Transactional
  public EligibilityResponse create(EligibilityResponse e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new EligibilityResponseModel(e));
      return e;
  }

  @Transactional
  public EligibilityResponse update(EligibilityResponse e) {
      final EntityManager em = entityManagerProvider.get();
      EligibilityResponseModel model = em.merge(new EligibilityResponseModel(e));
      return new EligibilityResponse(model);
  }

  @Override
  @Transactional
  public void delete(EligibilityResponse e) {
      final EntityManager em = entityManagerProvider.get();
      final EligibilityResponseModel removed = em.find(EligibilityResponseModel.class, e.getId());
      em.remove(removed);
  }
}