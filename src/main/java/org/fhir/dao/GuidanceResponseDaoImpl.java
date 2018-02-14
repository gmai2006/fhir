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

import org.fhir.entity.GuidanceResponseModel;
import org.fhir.pojo.GuidanceResponse;
import org.fhir.pojo.GuidanceResponseHelper;

public class GuidanceResponseDaoImpl implements GuidanceResponseDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public GuidanceResponseDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public GuidanceResponse find(String id) {
    final EntityManager em = entityManagerProvider.get();
    GuidanceResponseModel model = em.find(GuidanceResponseModel.class, id);
    if (null == model) return null;
    return new GuidanceResponse(model);
  }

  @Override
  public List<GuidanceResponse> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GuidanceResponseModel a", GuidanceResponseModel.class).setMaxResults(maxResult);
      List<GuidanceResponseModel> models = query.getResultList();
      return GuidanceResponseHelper.fromArray2Array(models);
  }

  @Override
  public List<GuidanceResponse> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GuidanceResponseModel a", GuidanceResponseModel.class);
      List<GuidanceResponseModel> models = query.getResultList();
      return GuidanceResponseHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public GuidanceResponse create(GuidanceResponse e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new GuidanceResponseModel(e));
      return e;
  }

  @Transactional
  public GuidanceResponse update(GuidanceResponse e) {
      final EntityManager em = entityManagerProvider.get();
      GuidanceResponseModel model = em.merge(new GuidanceResponseModel(e));
      return new GuidanceResponse(model);
  }
  @Override
  @Transactional
  public void delete(GuidanceResponse e) {
      final EntityManager em = entityManagerProvider.get();
      final GuidanceResponseModel removed = em.find(GuidanceResponseModel.class, e.getId());
      em.remove(removed);
  }
}