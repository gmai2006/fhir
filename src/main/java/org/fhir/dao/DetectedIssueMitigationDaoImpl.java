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

import org.fhir.entity.DetectedIssueMitigationModel;
import org.fhir.pojo.DetectedIssueMitigation;

public class DetectedIssueMitigationDaoImpl implements DetectedIssueMitigationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public DetectedIssueMitigationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public DetectedIssueMitigation find(String id) {
    final EntityManager em = entityManagerProvider.get();
    DetectedIssueMitigationModel model = em.find(DetectedIssueMitigationModel.class, id);
    if (null == model) return null;
    return new DetectedIssueMitigation(model);
  }

  @Override
  public List<DetectedIssueMitigation> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DetectedIssueMitigationModel a", DetectedIssueMitigationModel.class).setMaxResults(maxResult);
      List<DetectedIssueMitigationModel> models = query.getResultList();
      return DetectedIssueMitigation.fromArray(models);
  }

  @Override
  public List<DetectedIssueMitigation> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from DetectedIssueMitigationModel a", DetectedIssueMitigationModel.class);
      List<DetectedIssueMitigationModel> models = query.getResultList();
      return DetectedIssueMitigation.fromArray(models);
  }

  @Override
  @Transactional
  public DetectedIssueMitigation create(DetectedIssueMitigation e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new DetectedIssueMitigationModel(e));
      return e;
  }

  @Transactional
  public DetectedIssueMitigation update(DetectedIssueMitigation e) {
      final EntityManager em = entityManagerProvider.get();
      DetectedIssueMitigationModel model = em.merge(new DetectedIssueMitigationModel(e));
      return new DetectedIssueMitigation(model);
  }

  @Override
  @Transactional
  public void delete(DetectedIssueMitigation e) {
      final EntityManager em = entityManagerProvider.get();
      final DetectedIssueMitigationModel removed = em.find(DetectedIssueMitigationModel.class, e.getId());
      em.remove(removed);
  }
}