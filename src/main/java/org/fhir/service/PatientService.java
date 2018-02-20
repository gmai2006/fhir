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
import org.fhir.pojo.Patient;

public interface PatientService {
	public Patient find(String id);
  public List<Patient> select(int maxResult);
  public List<Patient> selectAll();
  public Patient create(Patient bean);
  public Patient update(Patient bean);
  public void delete(Patient bean);
  public List<Patient> findByField(QueryBuilder queryBuilder);
  public List<Patient> findByAddress(QueryBuilder queryBuilder);
  public List<Patient> findByMaritalStatus(QueryBuilder queryBuilder);
  public List<Patient> findByContact(QueryBuilder queryBuilder);
  public List<Patient> findByAnimal(QueryBuilder queryBuilder);
  public List<Patient> findByCommunication(QueryBuilder queryBuilder);
  public List<Patient> findByGeneralPractitioner(QueryBuilder queryBuilder);
  public List<Patient> findByManagingOrganization(QueryBuilder queryBuilder);
  public List<Patient> findByLink(QueryBuilder queryBuilder);
  public List<Patient> findByText(QueryBuilder queryBuilder);
  public List<Patient> findByMeta(QueryBuilder queryBuilder);


}