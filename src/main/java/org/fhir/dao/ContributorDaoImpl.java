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

import org.fhir.entity.ContributorModel;
import org.fhir.pojo.Contributor;

public class ContributorDaoImpl implements ContributorDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ContributorDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Contributor find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ContributorModel model = em.find(ContributorModel.class, id);
    if (null == model) return null;
    return new Contributor(model);
  }

  @Override
  public List<Contributor> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContributorModel a", ContributorModel.class).setMaxResults(maxResult);
      List<ContributorModel> models = query.getResultList();
      return Contributor.fromArray(models);
  }

  @Override
  public List<Contributor> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ContributorModel a", ContributorModel.class);
      List<ContributorModel> models = query.getResultList();
      return Contributor.fromArray(models);
  }

  @Override
  @Transactional
  public Contributor create(Contributor e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ContributorModel(e));
      return e;
  }

  @Transactional
  public Contributor update(Contributor e) {
      final EntityManager em = entityManagerProvider.get();
      ContributorModel model = em.merge(new ContributorModel(e));
      return new Contributor(model);
  }

  @Override
  @Transactional
  public void delete(Contributor e) {
      final EntityManager em = entityManagerProvider.get();
      final ContributorModel removed = em.find(ContributorModel.class, e.getId());
      em.remove(removed);
  }
}