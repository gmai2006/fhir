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

import org.fhir.entity.OrganizationContactModel;
import org.fhir.pojo.OrganizationContact;

public class OrganizationContactDaoImpl implements OrganizationContactDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public OrganizationContactDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public OrganizationContact find(String id) {
    final EntityManager em = entityManagerProvider.get();
    OrganizationContactModel model = em.find(OrganizationContactModel.class, id);
    if (null == model) return null;
    return new OrganizationContact(model);
  }

  @Override
  public List<OrganizationContact> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OrganizationContactModel a", OrganizationContactModel.class).setMaxResults(maxResult);
      List<OrganizationContactModel> models = query.getResultList();
      return OrganizationContact.fromArray(models);
  }

  @Override
  public List<OrganizationContact> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from OrganizationContactModel a", OrganizationContactModel.class);
      List<OrganizationContactModel> models = query.getResultList();
      return OrganizationContact.fromArray(models);
  }

  @Override
  @Transactional
  public OrganizationContact create(OrganizationContact e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new OrganizationContactModel(e));
      return e;
  }

  @Transactional
  public OrganizationContact update(OrganizationContact e) {
      final EntityManager em = entityManagerProvider.get();
      OrganizationContactModel model = em.merge(new OrganizationContactModel(e));
      return new OrganizationContact(model);
  }

  @Override
  @Transactional
  public void delete(OrganizationContact e) {
      final EntityManager em = entityManagerProvider.get();
      final OrganizationContactModel removed = em.find(OrganizationContactModel.class, e.getId());
      em.remove(removed);
  }
}