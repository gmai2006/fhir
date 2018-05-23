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
import java.util.List;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.ClaimResponse;

public interface ClaimResponseDao {
  public ClaimResponse find(String id);

  public List<ClaimResponse> select(int maxResult);

  public List<ClaimResponse> selectAll();
  public ClaimResponse create(ClaimResponse e);

  public ClaimResponse update(ClaimResponse e);
  public void delete(String id);

  public List<ClaimResponse> findByField(QueryBuilder queryBuilder);

  public List<ClaimResponse> findByPatient(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByInsurer(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByRequestProvider(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByRequestOrganization(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByRequest(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByOutcome(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByPayeeType(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByItem(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByAddItem(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByError(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByTotalCost(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByUnallocDeductable(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByTotalBenefit(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByPayment(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByReserved(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByForm(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByProcessNote(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByCommunicationRequest(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByInsurance(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByText(QueryBuilder queryBuilder);
  public List<ClaimResponse> findByMeta(QueryBuilder queryBuilder);
}