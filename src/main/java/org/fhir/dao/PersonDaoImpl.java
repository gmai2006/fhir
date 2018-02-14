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

import org.fhir.entity.PersonModel;
import org.fhir.pojo.Person;
import org.fhir.pojo.PersonHelper;

public class PersonDaoImpl implements PersonDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public PersonDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Person find(String id) {
    final EntityManager em = entityManagerProvider.get();
    PersonModel model = em.find(PersonModel.class, id);
    if (null == model) return null;
    return new Person(model);
  }

  @Override
  public List<Person> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PersonModel a", PersonModel.class).setMaxResults(maxResult);
      List<PersonModel> models = query.getResultList();
      return PersonHelper.fromArray2Array(models);
  }

  @Override
  public List<Person> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from PersonModel a", PersonModel.class);
      List<PersonModel> models = query.getResultList();
      return PersonHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Person create(Person e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new PersonModel(e));
      return e;
  }

  @Transactional
  public Person update(Person e) {
      final EntityManager em = entityManagerProvider.get();
      PersonModel model = em.merge(new PersonModel(e));
      return new Person(model);
  }
  @Override
  @Transactional
  public void delete(Person e) {
      final EntityManager em = entityManagerProvider.get();
      final PersonModel removed = em.find(PersonModel.class, e.getId());
      em.remove(removed);
  }
}