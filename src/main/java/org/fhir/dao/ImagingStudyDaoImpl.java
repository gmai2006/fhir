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

import org.fhir.entity.ImagingStudyModel;
import org.fhir.pojo.ImagingStudy;
import org.fhir.pojo.ImagingStudyHelper;

public class ImagingStudyDaoImpl implements ImagingStudyDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImagingStudyDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImagingStudy find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImagingStudyModel model = em.find(ImagingStudyModel.class, id);
    if (null == model) return null;
    return new ImagingStudy(model);
  }

  @Override
  public List<ImagingStudy> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImagingStudyModel a", ImagingStudyModel.class).setMaxResults(maxResult);
      List<ImagingStudyModel> models = query.getResultList();
      return ImagingStudyHelper.fromArray2Array(models);
  }

  @Override
  public List<ImagingStudy> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImagingStudyModel a", ImagingStudyModel.class);
      List<ImagingStudyModel> models = query.getResultList();
      return ImagingStudyHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public ImagingStudy create(ImagingStudy e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImagingStudyModel(e));
      return e;
  }

  @Transactional
  public ImagingStudy update(ImagingStudy e) {
      final EntityManager em = entityManagerProvider.get();
      ImagingStudyModel model = em.merge(new ImagingStudyModel(e));
      return new ImagingStudy(model);
  }
  @Override
  @Transactional
  public void delete(ImagingStudy e) {
      final EntityManager em = entityManagerProvider.get();
      final ImagingStudyModel removed = em.find(ImagingStudyModel.class, e.getId());
      em.remove(removed);
  }
}