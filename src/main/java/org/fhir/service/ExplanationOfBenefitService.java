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
import org.fhir.pojo.ExplanationOfBenefit;

public interface ExplanationOfBenefitService {
	public ExplanationOfBenefit find(String id);
  public List<ExplanationOfBenefit> select(int maxResult);
  public List<ExplanationOfBenefit> selectAll();
  public ExplanationOfBenefit create(ExplanationOfBenefit bean);
  public ExplanationOfBenefit update(ExplanationOfBenefit bean);
  public void delete(String id);
  public List<ExplanationOfBenefit> findByField(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByType(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findBySubType(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByPatient(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByEnterer(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByInsurer(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByProvider(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByOrganization(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByReferral(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByFacility(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByClaim(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByClaimResponse(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByOutcome(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByRelated(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByPrescription(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByOriginalPrescription(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByPayee(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByInformation(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByCareTeam(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByDiagnosis(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByProcedure(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByInsurance(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByAccident(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByItem(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByAddItem(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByTotalCost(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByUnallocDeductable(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByTotalBenefit(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByPayment(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByForm(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByProcessNote(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByBenefitBalance(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByText(QueryBuilder queryBuilder);
  public List<ExplanationOfBenefit> findByMeta(QueryBuilder queryBuilder);


}