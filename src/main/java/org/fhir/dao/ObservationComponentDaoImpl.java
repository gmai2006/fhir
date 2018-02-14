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

import org.fhir.entity.ObservationComponentModel;
import org.fhir.pojo.ObservationComponent;
import org.fhir.pojo.ObservationComponentHelper;

public class ObservationComponentDaoImpl implements ObservationComponentDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ObservationComponentDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ObservationComponent find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ObservationComponentModel model = em.find(ObservationComponentModel.class, id);
    if (null == model) return null;
    return new ObservationComponent(model);
  }

  @Override
  public List<ObservationComponent> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ObservationComponentModel a", ObservationComponentModel.class).setMaxResults(maxResult);
      List<ObservationComponentModel> models = query.getResultList();
      return ObservationComponentHelper.fromArray2Array(models);
  }

  @Override
  public List<ObservationComponent> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ObservationComponentModel a", ObservationComponentModel.class);
      List<ObservationComponentModel> models = query.getResultList();
      return ObservationComponentHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(ObservationComponent e) {
      final EntityManager em = entityManagerProvider.get();
      final ObservationComponentModel removed = em.find(ObservationComponentModel.class, e.getId());
      em.remove(removed);
  }
}