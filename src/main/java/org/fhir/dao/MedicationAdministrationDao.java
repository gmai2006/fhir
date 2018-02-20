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
import org.fhir.pojo.MedicationAdministration;

public interface MedicationAdministrationDao {
  public MedicationAdministration find(String id);

  public List<MedicationAdministration> select(int maxResult);

  public List<MedicationAdministration> selectAll();
  public MedicationAdministration create(MedicationAdministration e);

  public MedicationAdministration update(MedicationAdministration e);
  public void delete(MedicationAdministration e);

  public List<MedicationAdministration> findByField(QueryBuilder queryBuilder);

  public List<MedicationAdministration> findByDefinition(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByPartOf(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByCategory(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByMedicationCodeableConcept(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByMedicationReference(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findBySubject(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByContext(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findBySupportingInformation(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByPerformer(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByReasonNotGiven(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByReasonCode(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByReasonReference(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByPrescription(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByDevice(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByDosage(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByEventHistory(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByText(QueryBuilder queryBuilder);
  public List<MedicationAdministration> findByMeta(QueryBuilder queryBuilder);
}