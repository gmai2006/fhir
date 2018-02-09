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

import org.fhir.entity.GroupMemberModel;
import org.fhir.pojo.GroupMember;

public class GroupMemberDaoImpl implements GroupMemberDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public GroupMemberDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public GroupMember find(String id) {
    final EntityManager em = entityManagerProvider.get();
    GroupMemberModel model = em.find(GroupMemberModel.class, id);
    if (null == model) return null;
    return new GroupMember(model);
  }

  @Override
  public List<GroupMember> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GroupMemberModel a", GroupMemberModel.class).setMaxResults(maxResult);
      List<GroupMemberModel> models = query.getResultList();
      return GroupMember.fromArray(models);
  }

  @Override
  public List<GroupMember> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from GroupMemberModel a", GroupMemberModel.class);
      List<GroupMemberModel> models = query.getResultList();
      return GroupMember.fromArray(models);
  }

  @Override
  @Transactional
  public GroupMember create(GroupMember e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new GroupMemberModel(e));
      return e;
  }

  @Transactional
  public GroupMember update(GroupMember e) {
      final EntityManager em = entityManagerProvider.get();
      GroupMemberModel model = em.merge(new GroupMemberModel(e));
      return new GroupMember(model);
  }

  @Override
  @Transactional
  public void delete(GroupMember e) {
      final EntityManager em = entityManagerProvider.get();
      final GroupMemberModel removed = em.find(GroupMemberModel.class, e.getId());
      em.remove(removed);
  }
}