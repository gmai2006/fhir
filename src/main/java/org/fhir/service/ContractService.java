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

package org.fhir.service;
import java.util.List;

import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Contract;

public interface ContractService {
	public Contract find(String id);
  public List<Contract> select(int maxResult);
  public List<Contract> selectAll();
  public Contract create(Contract bean);
  public Contract update(Contract bean);
  public void delete(String id);
  public List<Contract> findByField(QueryBuilder queryBuilder);
  public List<Contract> findBySubject(QueryBuilder queryBuilder);
  public List<Contract> findByTopic(QueryBuilder queryBuilder);
  public List<Contract> findByAuthority(QueryBuilder queryBuilder);
  public List<Contract> findByDomain(QueryBuilder queryBuilder);
  public List<Contract> findByType(QueryBuilder queryBuilder);
  public List<Contract> findBySubType(QueryBuilder queryBuilder);
  public List<Contract> findByAction(QueryBuilder queryBuilder);
  public List<Contract> findByActionReason(QueryBuilder queryBuilder);
  public List<Contract> findByDecisionType(QueryBuilder queryBuilder);
  public List<Contract> findByContentDerivative(QueryBuilder queryBuilder);
  public List<Contract> findBySecurityLabel(QueryBuilder queryBuilder);
  public List<Contract> findByAgent(QueryBuilder queryBuilder);
  public List<Contract> findBySigner(QueryBuilder queryBuilder);
  public List<Contract> findByValuedItem(QueryBuilder queryBuilder);
  public List<Contract> findByTerm(QueryBuilder queryBuilder);
  public List<Contract> findByBindingReference(QueryBuilder queryBuilder);
  public List<Contract> findByFriendly(QueryBuilder queryBuilder);
  public List<Contract> findByLegal(QueryBuilder queryBuilder);
  public List<Contract> findByRule(QueryBuilder queryBuilder);
  public List<Contract> findByText(QueryBuilder queryBuilder);
  public List<Contract> findByMeta(QueryBuilder queryBuilder);


}