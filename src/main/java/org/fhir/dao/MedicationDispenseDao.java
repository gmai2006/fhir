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
import java.util.logging.Logger;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.MedicationDispense;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public interface MedicationDispenseDao {
  public MedicationDispense find(String id);

  public List<MedicationDispense> select(int maxResult);

  public List<MedicationDispense> selectAll();
  public MedicationDispense create(MedicationDispense e);

  public MedicationDispense update(MedicationDispense e);
  public void delete(String id);

  public List<MedicationDispense> findByField(QueryBuilder queryBuilder);

  public List<MedicationDispense> findByPartOf(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByCategory(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByMedicationCodeableConcept(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByMedicationReference(QueryBuilder queryBuilder);
  public List<MedicationDispense> findBySubject(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByContext(QueryBuilder queryBuilder);
  public List<MedicationDispense> findBySupportingInformation(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByPerformer(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByAuthorizingPrescription(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByType(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByQuantity(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByDaysSupply(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByDestination(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByReceiver(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByDosageInstruction(QueryBuilder queryBuilder);
  public List<MedicationDispense> findBySubstitution(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByDetectedIssue(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByNotDoneReasonCodeableConcept(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByNotDoneReasonReference(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByEventHistory(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByText(QueryBuilder queryBuilder);
  public List<MedicationDispense> findByMeta(QueryBuilder queryBuilder);
}