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

import org.fhir.entity.AccountModel;
import org.fhir.pojo.Account;
import org.fhir.pojo.AccountHelper;
import org.fhir.utils.QueryBuilder;

public class AccountDaoImpl implements AccountDao {
    private final Provider<EntityManager> entityManagerProvider;

  @Inject
  public AccountDaoImpl (final Provider<EntityManager> entityManagerProvider) {
    requireNonNull(entityManagerProvider);

    this.entityManagerProvider = entityManagerProvider;
  }

  @Override
  public Account find(String id) {
    final EntityManager em = entityManagerProvider.get();
    AccountModel model = em.find(AccountModel.class, id);
    if (null == model) return null;
    return new Account(model);
  }

  @Override
  public List<Account> select(int maxResult) {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AccountModel a", AccountModel.class).setMaxResults(maxResult);
      List<AccountModel> models = query.getResultList();
      return AccountHelper.fromArray2Array(models);
  }

  @Override
  public List<Account> selectAll() {
      final EntityManager em = entityManagerProvider.get();
      Query query = em.createQuery("select a from AccountModel a", AccountModel.class);
      List<AccountModel> models = query.getResultList();
      return AccountHelper.fromArray2Array(models);
  }

  @Override
  @Transactional
  public Account create(Account e) {
      final EntityManager em = entityManagerProvider.get();
      em.persist(new AccountModel(e));
      return e;
  }

  @Transactional
  public Account update(Account e) {
      final EntityManager em = entityManagerProvider.get();
      AccountModel model = em.merge(new AccountModel(e));
      return new Account(model);
  }
  @Override
  @Transactional
  public void delete(Account e) {
      final EntityManager em = entityManagerProvider.get();
      final AccountModel removed = em.find(AccountModel.class, e.getId());
      em.remove(removed);
  }

  @Override
  public List<Account> findByBalance(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AccountModel a, Money b where a.balance_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Account> findByOwner(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AccountModel a, Reference b where a.owner_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }
  @Override
  public List<Account> findBySubject(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AccountModel a, Reference b where a.subject_id=b.parent_id " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  @Override
  public List<Account> findByField(QueryBuilder queryBuilder) {
  	final EntityManager em = entityManagerProvider.get();
  	final String queryStr = "select a from AccountModel a " + queryBuilder.getWhereClause();
    return findByQuery(queryBuilder, queryStr);
  }

  private List<Account> findByQuery(QueryBuilder queryBuilder, String queryStr) {
  	final EntityManager em = entityManagerProvider.get();
    Query query = em.createQuery(queryStr, AccountModel.class);
    java.util.Map<String, Object> params = queryBuilder.getParams();
    params.keySet()
      .stream()
      .forEach(key -> query.setParameter(key, params.get(key)));

    List<AccountModel> models = query.getResultList();
    return AccountHelper.fromArray2Array(models);
  }
}