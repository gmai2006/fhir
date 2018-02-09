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

import org.fhir.entity.CapabilityStatementCertificateModel;
import org.fhir.pojo.CapabilityStatementCertificate;

public class CapabilityStatementCertificateDaoImpl implements CapabilityStatementCertificateDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public CapabilityStatementCertificateDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public CapabilityStatementCertificate find(String id) {
    final EntityManager em = entityManagerProvider.get();
    CapabilityStatementCertificateModel model = em.find(CapabilityStatementCertificateModel.class, id);
    if (null == model) return null;
    return new CapabilityStatementCertificate(model);
  }

  @Override
  public List<CapabilityStatementCertificate> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementCertificateModel a", CapabilityStatementCertificateModel.class).setMaxResults(maxResult);
      List<CapabilityStatementCertificateModel> models = query.getResultList();
      return CapabilityStatementCertificate.fromArray(models);
  }

  @Override
  public List<CapabilityStatementCertificate> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from CapabilityStatementCertificateModel a", CapabilityStatementCertificateModel.class);
      List<CapabilityStatementCertificateModel> models = query.getResultList();
      return CapabilityStatementCertificate.fromArray(models);
  }

  @Override
  @Transactional
  public CapabilityStatementCertificate create(CapabilityStatementCertificate e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new CapabilityStatementCertificateModel(e));
      return e;
  }

  @Transactional
  public CapabilityStatementCertificate update(CapabilityStatementCertificate e) {
      final EntityManager em = entityManagerProvider.get();
      CapabilityStatementCertificateModel model = em.merge(new CapabilityStatementCertificateModel(e));
      return new CapabilityStatementCertificate(model);
  }

  @Override
  @Transactional
  public void delete(CapabilityStatementCertificate e) {
      final EntityManager em = entityManagerProvider.get();
      final CapabilityStatementCertificateModel removed = em.find(CapabilityStatementCertificateModel.class, e.getId());
      em.remove(removed);
  }
}