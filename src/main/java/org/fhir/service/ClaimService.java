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
import org.fhir.pojo.Claim;

public interface ClaimService {
	public Claim find(String id);
  public List<Claim> select(int maxResult);
  public List<Claim> selectAll();
  public Claim create(Claim bean);
  public Claim update(Claim bean);
  public void delete(String id);
  public List<Claim> findByField(QueryBuilder queryBuilder);
  public List<Claim> findByType(QueryBuilder queryBuilder);
  public List<Claim> findBySubType(QueryBuilder queryBuilder);
  public List<Claim> findByPatient(QueryBuilder queryBuilder);
  public List<Claim> findByEnterer(QueryBuilder queryBuilder);
  public List<Claim> findByInsurer(QueryBuilder queryBuilder);
  public List<Claim> findByProvider(QueryBuilder queryBuilder);
  public List<Claim> findByOrganization(QueryBuilder queryBuilder);
  public List<Claim> findByPriority(QueryBuilder queryBuilder);
  public List<Claim> findByFundsReserve(QueryBuilder queryBuilder);
  public List<Claim> findByRelated(QueryBuilder queryBuilder);
  public List<Claim> findByPrescription(QueryBuilder queryBuilder);
  public List<Claim> findByOriginalPrescription(QueryBuilder queryBuilder);
  public List<Claim> findByPayee(QueryBuilder queryBuilder);
  public List<Claim> findByReferral(QueryBuilder queryBuilder);
  public List<Claim> findByFacility(QueryBuilder queryBuilder);
  public List<Claim> findByCareTeam(QueryBuilder queryBuilder);
  public List<Claim> findByInformation(QueryBuilder queryBuilder);
  public List<Claim> findByDiagnosis(QueryBuilder queryBuilder);
  public List<Claim> findByProcedure(QueryBuilder queryBuilder);
  public List<Claim> findByInsurance(QueryBuilder queryBuilder);
  public List<Claim> findByAccident(QueryBuilder queryBuilder);
  public List<Claim> findByItem(QueryBuilder queryBuilder);
  public List<Claim> findByTotal(QueryBuilder queryBuilder);
  public List<Claim> findByText(QueryBuilder queryBuilder);
  public List<Claim> findByMeta(QueryBuilder queryBuilder);


}