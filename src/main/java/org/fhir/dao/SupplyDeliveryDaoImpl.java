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

import org.fhir.entity.SupplyDeliveryModel;
import org.fhir.pojo.SupplyDelivery;
import org.fhir.pojo.SupplyDeliveryHelper;

public class SupplyDeliveryDaoImpl implements SupplyDeliveryDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public SupplyDeliveryDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public SupplyDelivery find(String id) {
    final EntityManager em = entityManagerProvider.get();
    SupplyDeliveryModel model = em.find(SupplyDeliveryModel.class, id);
    if (null == model) return null;
    return new SupplyDelivery(model);
  }

  @Override
  public List<SupplyDelivery> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SupplyDeliveryModel a", SupplyDeliveryModel.class).setMaxResults(maxResult);
      List<SupplyDeliveryModel> models = query.getResultList();
      return SupplyDeliveryHelper.fromArray2Array(models);
  }

  @Override
  public List<SupplyDelivery> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from SupplyDeliveryModel a", SupplyDeliveryModel.class);
      List<SupplyDeliveryModel> models = query.getResultList();
      return SupplyDeliveryHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public SupplyDelivery create(SupplyDelivery e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new SupplyDeliveryModel(e));
      return e;
  }

  @Transactional
  public SupplyDelivery update(SupplyDelivery e) {
      final EntityManager em = entityManagerProvider.get();
      SupplyDeliveryModel model = em.merge(new SupplyDeliveryModel(e));
      return new SupplyDelivery(model);
  }
  @Override
  @Transactional
  public void delete(SupplyDelivery e) {
      final EntityManager em = entityManagerProvider.get();
      final SupplyDeliveryModel removed = em.find(SupplyDeliveryModel.class, e.getId());
      em.remove(removed);
  }
}