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

import org.fhir.entity.ClaimCareTeamModel;
import org.fhir.pojo.ClaimCareTeam;

public class ClaimCareTeamDaoImpl implements ClaimCareTeamDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimCareTeamDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimCareTeam find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimCareTeamModel model = em.find(ClaimCareTeamModel.class, id);
    if (null == model) return null;
    return new ClaimCareTeam(model);
  }

  @Override
  public List<ClaimCareTeam> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimCareTeamModel a", ClaimCareTeamModel.class).setMaxResults(maxResult);
      List<ClaimCareTeamModel> models = query.getResultList();
      return ClaimCareTeam.fromArray(models);
  }

  @Override
  public List<ClaimCareTeam> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimCareTeamModel a", ClaimCareTeamModel.class);
      List<ClaimCareTeamModel> models = query.getResultList();
      return ClaimCareTeam.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimCareTeam create(ClaimCareTeam e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimCareTeamModel(e));
      return e;
  }

  @Transactional
  public ClaimCareTeam update(ClaimCareTeam e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimCareTeamModel model = em.merge(new ClaimCareTeamModel(e));
      return new ClaimCareTeam(model);
  }

  @Override
  @Transactional
  public void delete(ClaimCareTeam e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimCareTeamModel removed = em.find(ClaimCareTeamModel.class, e.getId());
      em.remove(removed);
  }
}