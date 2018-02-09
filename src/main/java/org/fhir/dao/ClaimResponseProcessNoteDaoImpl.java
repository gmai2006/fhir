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

import org.fhir.entity.ClaimResponseProcessNoteModel;
import org.fhir.pojo.ClaimResponseProcessNote;

public class ClaimResponseProcessNoteDaoImpl implements ClaimResponseProcessNoteDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ClaimResponseProcessNoteDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ClaimResponseProcessNote find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ClaimResponseProcessNoteModel model = em.find(ClaimResponseProcessNoteModel.class, id);
    if (null == model) return null;
    return new ClaimResponseProcessNote(model);
  }

  @Override
  public List<ClaimResponseProcessNote> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimResponseProcessNoteModel a", ClaimResponseProcessNoteModel.class).setMaxResults(maxResult);
      List<ClaimResponseProcessNoteModel> models = query.getResultList();
      return ClaimResponseProcessNote.fromArray(models);
  }

  @Override
  public List<ClaimResponseProcessNote> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ClaimResponseProcessNoteModel a", ClaimResponseProcessNoteModel.class);
      List<ClaimResponseProcessNoteModel> models = query.getResultList();
      return ClaimResponseProcessNote.fromArray(models);
  }

  @Override
  @Transactional
  public ClaimResponseProcessNote create(ClaimResponseProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ClaimResponseProcessNoteModel(e));
      return e;
  }

  @Transactional
  public ClaimResponseProcessNote update(ClaimResponseProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      ClaimResponseProcessNoteModel model = em.merge(new ClaimResponseProcessNoteModel(e));
      return new ClaimResponseProcessNote(model);
  }

  @Override
  @Transactional
  public void delete(ClaimResponseProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      final ClaimResponseProcessNoteModel removed = em.find(ClaimResponseProcessNoteModel.class, e.getId());
      em.remove(removed);
  }
}