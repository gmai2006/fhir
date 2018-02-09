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

import org.fhir.entity.PersonLinkModel;
import org.fhir.pojo.PersonLink;

public class PersonLinkDaoImpl implements PersonLinkDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PersonLinkDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public PersonLink find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PersonLinkModel model = em.find(PersonLinkModel.class, id);
    if (null == model) return null;
    return new PersonLink(model);
  }

  @Override
  public List<PersonLink> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PersonLinkModel a", PersonLinkModel.class).setMaxResults(maxResult);
      List<PersonLinkModel> models = query.getResultList();
      return PersonLink.fromArray(models);
  }

  @Override
  public List<PersonLink> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PersonLinkModel a", PersonLinkModel.class);
      List<PersonLinkModel> models = query.getResultList();
      return PersonLink.fromArray(models);
  }

  @Override
  @Transactional
  public PersonLink create(PersonLink e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PersonLinkModel(e));
      return e;
  }

  @Transactional
  public PersonLink update(PersonLink e) {
      final EntityManager em = entityManagerProvider.get();
      PersonLinkModel model = em.merge(new PersonLinkModel(e));
      return new PersonLink(model);
  }

  @Override
  @Transactional
  public void delete(PersonLink e) {
      final EntityManager em = entityManagerProvider.get();
      final PersonLinkModel removed = em.find(PersonLinkModel.class, e.getId());
      em.remove(removed);
  }
}