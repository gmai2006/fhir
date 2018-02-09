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

import org.fhir.entity.ImagingManifestStudyModel;
import org.fhir.pojo.ImagingManifestStudy;

public class ImagingManifestStudyDaoImpl implements ImagingManifestStudyDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImagingManifestStudyDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImagingManifestStudy find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImagingManifestStudyModel model = em.find(ImagingManifestStudyModel.class, id);
    if (null == model) return null;
    return new ImagingManifestStudy(model);
  }

  @Override
  public List<ImagingManifestStudy> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImagingManifestStudyModel a", ImagingManifestStudyModel.class).setMaxResults(maxResult);
      List<ImagingManifestStudyModel> models = query.getResultList();
      return ImagingManifestStudy.fromArray(models);
  }

  @Override
  public List<ImagingManifestStudy> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImagingManifestStudyModel a", ImagingManifestStudyModel.class);
      List<ImagingManifestStudyModel> models = query.getResultList();
      return ImagingManifestStudy.fromArray(models);
  }

  @Override
  @Transactional
  public ImagingManifestStudy create(ImagingManifestStudy e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImagingManifestStudyModel(e));
      return e;
  }

  @Transactional
  public ImagingManifestStudy update(ImagingManifestStudy e) {
      final EntityManager em = entityManagerProvider.get();
      ImagingManifestStudyModel model = em.merge(new ImagingManifestStudyModel(e));
      return new ImagingManifestStudy(model);
  }

  @Override
  @Transactional
  public void delete(ImagingManifestStudy e) {
      final EntityManager em = entityManagerProvider.get();
      final ImagingManifestStudyModel removed = em.find(ImagingManifestStudyModel.class, e.getId());
      em.remove(removed);
  }
}