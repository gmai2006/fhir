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
import org.fhir.pojo.PaymentReconciliation;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public interface PaymentReconciliationService {
	public PaymentReconciliation find(String id);
  public List<PaymentReconciliation> select(int maxResult);
  public List<PaymentReconciliation> selectAll();
  public PaymentReconciliation create(PaymentReconciliation bean);
  public PaymentReconciliation update(PaymentReconciliation bean);
  public void delete(String id);
  public List<PaymentReconciliation> findByField(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByOrganization(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByRequest(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByOutcome(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByRequestProvider(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByRequestOrganization(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByDetail(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByForm(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByTotal(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByProcessNote(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByText(QueryBuilder queryBuilder);
  public List<PaymentReconciliation> findByMeta(QueryBuilder queryBuilder);


}