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

import org.fhir.entity.ImagingManifestModel;
import org.fhir.pojo.ImagingManifest;

public class ImagingManifestDaoImpl implements ImagingManifestDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImagingManifestDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImagingManifest find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImagingManifestModel model = em.find(ImagingManifestModel.class, id);
    if (null == model) return null;
    return new ImagingManifest(model);
  }

  @Override
  public List<ImagingManifest> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImagingManifestModel a", ImagingManifestModel.class).setMaxResults(maxResult);
      List<ImagingManifestModel> models = query.getResultList();
      return ImagingManifest.fromArray(models);
  }

  @Override
  public List<ImagingManifest> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImagingManifestModel a", ImagingManifestModel.class);
      List<ImagingManifestModel> models = query.getResultList();
      return ImagingManifest.fromArray(models);
  }

  @Override
  @Transactional
  public ImagingManifest create(ImagingManifest e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImagingManifestModel(e));
      return e;
  }

  @Transactional
  public ImagingManifest update(ImagingManifest e) {
      final EntityManager em = entityManagerProvider.get();
      ImagingManifestModel model = em.merge(new ImagingManifestModel(e));
      return new ImagingManifest(model);
  }

  @Override
  @Transactional
  public void delete(ImagingManifest e) {
      final EntityManager em = entityManagerProvider.get();
      final ImagingManifestModel removed = em.find(ImagingManifestModel.class, e.getId());
      em.remove(removed);
  }
}