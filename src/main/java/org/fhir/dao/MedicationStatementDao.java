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
import org.fhir.pojo.MedicationStatement;

public interface MedicationStatementDao {
  public MedicationStatement find(String id);

  public List<MedicationStatement> select(int maxResult);

  public List<MedicationStatement> selectAll();
  public MedicationStatement create(MedicationStatement e);

  public MedicationStatement update(MedicationStatement e);
  public void delete(String id);

  public List<MedicationStatement> findByField(QueryBuilder queryBuilder);

  public List<MedicationStatement> findByBasedOn(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByPartOf(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByContext(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByCategory(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByMedicationCodeableConcept(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByMedicationReference(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByInformationSource(QueryBuilder queryBuilder);
  public List<MedicationStatement> findBySubject(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByDerivedFrom(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByReasonNotTaken(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByReasonCode(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByReasonReference(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByDosage(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByText(QueryBuilder queryBuilder);
  public List<MedicationStatement> findByMeta(QueryBuilder queryBuilder);
}