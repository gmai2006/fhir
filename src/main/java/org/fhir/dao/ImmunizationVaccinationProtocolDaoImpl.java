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

import org.fhir.entity.ImmunizationVaccinationProtocolModel;
import org.fhir.pojo.ImmunizationVaccinationProtocol;

public class ImmunizationVaccinationProtocolDaoImpl implements ImmunizationVaccinationProtocolDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ImmunizationVaccinationProtocolDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ImmunizationVaccinationProtocol find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ImmunizationVaccinationProtocolModel model = em.find(ImmunizationVaccinationProtocolModel.class, id);
    if (null == model) return null;
    return new ImmunizationVaccinationProtocol(model);
  }

  @Override
  public List<ImmunizationVaccinationProtocol> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationVaccinationProtocolModel a", ImmunizationVaccinationProtocolModel.class).setMaxResults(maxResult);
      List<ImmunizationVaccinationProtocolModel> models = query.getResultList();
      return ImmunizationVaccinationProtocol.fromArray(models);
  }

  @Override
  public List<ImmunizationVaccinationProtocol> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ImmunizationVaccinationProtocolModel a", ImmunizationVaccinationProtocolModel.class);
      List<ImmunizationVaccinationProtocolModel> models = query.getResultList();
      return ImmunizationVaccinationProtocol.fromArray(models);
  }

  @Override
  @Transactional
  public ImmunizationVaccinationProtocol create(ImmunizationVaccinationProtocol e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ImmunizationVaccinationProtocolModel(e));
      return e;
  }

  @Transactional
  public ImmunizationVaccinationProtocol update(ImmunizationVaccinationProtocol e) {
      final EntityManager em = entityManagerProvider.get();
      ImmunizationVaccinationProtocolModel model = em.merge(new ImmunizationVaccinationProtocolModel(e));
      return new ImmunizationVaccinationProtocol(model);
  }

  @Override
  @Transactional
  public void delete(ImmunizationVaccinationProtocol e) {
      final EntityManager em = entityManagerProvider.get();
      final ImmunizationVaccinationProtocolModel removed = em.find(ImmunizationVaccinationProtocolModel.class, e.getId());
      em.remove(removed);
  }
}