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

import org.fhir.entity.ImagingStudyInstanceModel;
import org.fhir.pojo.ImagingStudyInstance;

public class ImagingStudyInstanceDaoImpl implements ImagingStudyInstanceDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImagingStudyInstanceDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImagingStudyInstance find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImagingStudyInstanceModel model = em.find(ImagingStudyInstanceModel.class, id);
    if (null == model) return null;
    return new ImagingStudyInstance(model);
  }

  @Override
  public List<ImagingStudyInstance> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImagingStudyInstanceModel a", ImagingStudyInstanceModel.class).setMaxResults(maxResult);
      List<ImagingStudyInstanceModel> models = query.getResultList();
      return ImagingStudyInstance.fromArray(models);
  }

  @Override
  public List<ImagingStudyInstance> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImagingStudyInstanceModel a", ImagingStudyInstanceModel.class);
      List<ImagingStudyInstanceModel> models = query.getResultList();
      return ImagingStudyInstance.fromArray(models);
  }

  @Override
  @Transactional
  public ImagingStudyInstance create(ImagingStudyInstance e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImagingStudyInstanceModel(e));
      return e;
  }

  @Transactional
  public ImagingStudyInstance update(ImagingStudyInstance e) {
      final EntityManager em = entityManagerProvider.get();
      ImagingStudyInstanceModel model = em.merge(new ImagingStudyInstanceModel(e));
      return new ImagingStudyInstance(model);
  }

  @Override
  @Transactional
  public void delete(ImagingStudyInstance e) {
      final EntityManager em = entityManagerProvider.get();
      final ImagingStudyInstanceModel removed = em.find(ImagingStudyInstanceModel.class, e.getId());
      em.remove(removed);
  }
}