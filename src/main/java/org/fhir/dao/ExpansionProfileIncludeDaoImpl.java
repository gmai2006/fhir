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

import org.fhir.entity.ExpansionProfileIncludeModel;
import org.fhir.pojo.ExpansionProfileInclude;

public class ExpansionProfileIncludeDaoImpl implements ExpansionProfileIncludeDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ExpansionProfileIncludeDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ExpansionProfileInclude find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ExpansionProfileIncludeModel model = em.find(ExpansionProfileIncludeModel.class, id);
    if (null == model) return null;
    return new ExpansionProfileInclude(model);
  }

  @Override
  public List<ExpansionProfileInclude> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExpansionProfileIncludeModel a", ExpansionProfileIncludeModel.class).setMaxResults(maxResult);
      List<ExpansionProfileIncludeModel> models = query.getResultList();
      return ExpansionProfileInclude.fromArray(models);
  }

  @Override
  public List<ExpansionProfileInclude> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ExpansionProfileIncludeModel a", ExpansionProfileIncludeModel.class);
      List<ExpansionProfileIncludeModel> models = query.getResultList();
      return ExpansionProfileInclude.fromArray(models);
  }

  @Override
  @Transactional
  public ExpansionProfileInclude create(ExpansionProfileInclude e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ExpansionProfileIncludeModel(e));
      return e;
  }

  @Transactional
  public ExpansionProfileInclude update(ExpansionProfileInclude e) {
      final EntityManager em = entityManagerProvider.get();
      ExpansionProfileIncludeModel model = em.merge(new ExpansionProfileIncludeModel(e));
      return new ExpansionProfileInclude(model);
  }

  @Override
  @Transactional
  public void delete(ExpansionProfileInclude e) {
      final EntityManager em = entityManagerProvider.get();
      final ExpansionProfileIncludeModel removed = em.find(ExpansionProfileIncludeModel.class, e.getId());
      em.remove(removed);
  }
}