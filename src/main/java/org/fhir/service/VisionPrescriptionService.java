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
import org.fhir.pojo.VisionPrescription;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public interface VisionPrescriptionService {
	public VisionPrescription find(String id);
  public List<VisionPrescription> select(int maxResult);
  public List<VisionPrescription> selectAll();
  public VisionPrescription create(VisionPrescription bean);
  public VisionPrescription update(VisionPrescription bean);
  public void delete(String id);
  public List<VisionPrescription> findByField(QueryBuilder queryBuilder);
  public List<VisionPrescription> findByPatient(QueryBuilder queryBuilder);
  public List<VisionPrescription> findByEncounter(QueryBuilder queryBuilder);
  public List<VisionPrescription> findByPrescriber(QueryBuilder queryBuilder);
  public List<VisionPrescription> findByReasonCodeableConcept(QueryBuilder queryBuilder);
  public List<VisionPrescription> findByReasonReference(QueryBuilder queryBuilder);
  public List<VisionPrescription> findByDispense(QueryBuilder queryBuilder);
  public List<VisionPrescription> findByText(QueryBuilder queryBuilder);
  public List<VisionPrescription> findByMeta(QueryBuilder queryBuilder);


}