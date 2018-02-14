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

import org.fhir.entity.EncounterHospitalizationModel;
import org.fhir.pojo.EncounterHospitalization;
import org.fhir.pojo.EncounterHospitalizationHelper;

public class EncounterHospitalizationDaoImpl implements EncounterHospitalizationDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public EncounterHospitalizationDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public EncounterHospitalization find(String id) {
    final EntityManager em = entityManagerProvider.get();
    EncounterHospitalizationModel model = em.find(EncounterHospitalizationModel.class, id);
    if (null == model) return null;
    return new EncounterHospitalization(model);
  }

  @Override
  public List<EncounterHospitalization> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EncounterHospitalizationModel a", EncounterHospitalizationModel.class).setMaxResults(maxResult);
      List<EncounterHospitalizationModel> models = query.getResultList();
      return EncounterHospitalizationHelper.fromArray2Array(models);
  }

  @Override
  public List<EncounterHospitalization> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from EncounterHospitalizationModel a", EncounterHospitalizationModel.class);
      List<EncounterHospitalizationModel> models = query.getResultList();
      return EncounterHospitalizationHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(EncounterHospitalization e) {
      final EntityManager em = entityManagerProvider.get();
      final EncounterHospitalizationModel removed = em.find(EncounterHospitalizationModel.class, e.getId());
      em.remove(removed);
  }
}