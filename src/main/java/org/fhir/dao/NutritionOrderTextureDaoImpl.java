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

import org.fhir.entity.NutritionOrderTextureModel;
import org.fhir.pojo.NutritionOrderTexture;

public class NutritionOrderTextureDaoImpl implements NutritionOrderTextureDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public NutritionOrderTextureDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public NutritionOrderTexture find(String id) {
    final EntityManager em = entityManagerProvider.get();
    NutritionOrderTextureModel model = em.find(NutritionOrderTextureModel.class, id);
    if (null == model) return null;
    return new NutritionOrderTexture(model);
  }

  @Override
  public List<NutritionOrderTexture> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderTextureModel a", NutritionOrderTextureModel.class).setMaxResults(maxResult);
      List<NutritionOrderTextureModel> models = query.getResultList();
      return NutritionOrderTexture.fromArray(models);
  }

  @Override
  public List<NutritionOrderTexture> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from NutritionOrderTextureModel a", NutritionOrderTextureModel.class);
      List<NutritionOrderTextureModel> models = query.getResultList();
      return NutritionOrderTexture.fromArray(models);
  }

  @Override
  @Transactional
  public NutritionOrderTexture create(NutritionOrderTexture e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new NutritionOrderTextureModel(e));
      return e;
  }

  @Transactional
  public NutritionOrderTexture update(NutritionOrderTexture e) {
      final EntityManager em = entityManagerProvider.get();
      NutritionOrderTextureModel model = em.merge(new NutritionOrderTextureModel(e));
      return new NutritionOrderTexture(model);
  }

  @Override
  @Transactional
  public void delete(NutritionOrderTexture e) {
      final EntityManager em = entityManagerProvider.get();
      final NutritionOrderTextureModel removed = em.find(NutritionOrderTextureModel.class, e.getId());
      em.remove(removed);
  }
}