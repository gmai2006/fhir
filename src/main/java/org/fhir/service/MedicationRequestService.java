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
import org.fhir.pojo.MedicationRequest;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public interface MedicationRequestService {
	public MedicationRequest find(String id);
  public List<MedicationRequest> select(int maxResult);
  public List<MedicationRequest> selectAll();
  public MedicationRequest create(MedicationRequest bean);
  public MedicationRequest update(MedicationRequest bean);
  public void delete(String id);
  public List<MedicationRequest> findByField(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByDefinition(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByBasedOn(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByCategory(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByMedicationCodeableConcept(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByMedicationReference(QueryBuilder queryBuilder);
  public List<MedicationRequest> findBySubject(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByContext(QueryBuilder queryBuilder);
  public List<MedicationRequest> findBySupportingInformation(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByRequester(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByRecorder(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByReasonCode(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByReasonReference(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByDosageInstruction(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByDispenseRequest(QueryBuilder queryBuilder);
  public List<MedicationRequest> findBySubstitution(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByPriorPrescription(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByDetectedIssue(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByEventHistory(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByText(QueryBuilder queryBuilder);
  public List<MedicationRequest> findByMeta(QueryBuilder queryBuilder);


}