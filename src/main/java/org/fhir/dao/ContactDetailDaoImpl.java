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

import org.fhir.entity.ContactDetailModel;
import org.fhir.pojo.ContactDetail;
import org.fhir.pojo.ContactDetailHelper;

public class ContactDetailDaoImpl implements ContactDetailDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ContactDetailDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ContactDetail find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ContactDetailModel model = em.find(ContactDetailModel.class, id);
    if (null == model) return null;
    return new ContactDetail(model);
  }

  @Override
  public List<ContactDetail> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContactDetailModel a", ContactDetailModel.class).setMaxResults(maxResult);
      List<ContactDetailModel> models = query.getResultList();
      return ContactDetailHelper.fromArray2Array(models);
  }

  @Override
  public List<ContactDetail> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContactDetailModel a", ContactDetailModel.class);
      List<ContactDetailModel> models = query.getResultList();
      return ContactDetailHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public void delete(ContactDetail e) {
      final EntityManager em = entityManagerProvider.get();
      final ContactDetailModel removed = em.find(ContactDetailModel.class, e.getId());
      em.remove(removed);
  }
}