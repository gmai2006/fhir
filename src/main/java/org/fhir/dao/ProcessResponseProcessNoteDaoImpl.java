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

import org.fhir.entity.ProcessResponseProcessNoteModel;
import org.fhir.pojo.ProcessResponseProcessNote;

public class ProcessResponseProcessNoteDaoImpl implements ProcessResponseProcessNoteDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public ProcessResponseProcessNoteDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public ProcessResponseProcessNote find(String id) {
    final EntityManager em = entityManagerProvider.get();
    ProcessResponseProcessNoteModel model = em.find(ProcessResponseProcessNoteModel.class, id);
    if (null == model) return null;
    return new ProcessResponseProcessNote(model);
  }

  @Override
  public List<ProcessResponseProcessNote> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProcessResponseProcessNoteModel a", ProcessResponseProcessNoteModel.class).setMaxResults(maxResult);
      List<ProcessResponseProcessNoteModel> models = query.getResultList();
      return ProcessResponseProcessNote.fromArray(models);
  }

  @Override
  public List<ProcessResponseProcessNote> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from ProcessResponseProcessNoteModel a", ProcessResponseProcessNoteModel.class);
      List<ProcessResponseProcessNoteModel> models = query.getResultList();
      return ProcessResponseProcessNote.fromArray(models);
  }

  @Override
  @Transactional
  public ProcessResponseProcessNote create(ProcessResponseProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new ProcessResponseProcessNoteModel(e));
      return e;
  }

  @Transactional
  public ProcessResponseProcessNote update(ProcessResponseProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      ProcessResponseProcessNoteModel model = em.merge(new ProcessResponseProcessNoteModel(e));
      return new ProcessResponseProcessNote(model);
  }

  @Override
  @Transactional
  public void delete(ProcessResponseProcessNote e) {
      final EntityManager em = entityManagerProvider.get();
      final ProcessResponseProcessNoteModel removed = em.find(ProcessResponseProcessNoteModel.class, e.getId());
      em.remove(removed);
  }
}