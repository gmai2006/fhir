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

import org.fhir.entity.BinaryModel;
import org.fhir.pojo.Binary;
import org.fhir.pojo.BinaryHelper;

public class BinaryDaoImpl implements BinaryDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public BinaryDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Binary find(String id) {
    final EntityManager em = entityManagerProvider.get();
    BinaryModel model = em.find(BinaryModel.class, id);
    if (null == model) return null;
    return new Binary(model);
  }

  @Override
  public List<Binary> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BinaryModel a", BinaryModel.class).setMaxResults(maxResult);
      List<BinaryModel> models = query.getResultList();
      return BinaryHelper.fromArray2Array(models);
  }

  @Override
  public List<Binary> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from BinaryModel a", BinaryModel.class);
      List<BinaryModel> models = query.getResultList();
      return BinaryHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Binary create(Binary e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new BinaryModel(e));
      return e;
  }

  @Transactional
  public Binary update(Binary e) {
      final EntityManager em = entityManagerProvider.get();
      BinaryModel model = em.merge(new BinaryModel(e));
      return new Binary(model);
  }
  @Override
  @Transactional
  public void delete(Binary e) {
      final EntityManager em = entityManagerProvider.get();
      final BinaryModel removed = em.find(BinaryModel.class, e.getId());
      em.remove(removed);
  }
}