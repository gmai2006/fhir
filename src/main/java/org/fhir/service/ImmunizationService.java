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
import org.fhir.pojo.Immunization;

public interface ImmunizationService {
	public Immunization find(String id);
  public List<Immunization> select(int maxResult);
  public List<Immunization> selectAll();
  public Immunization create(Immunization bean);
  public Immunization update(Immunization bean);
  public void delete(Immunization bean);
  public List<Immunization> findByField(QueryBuilder queryBuilder);
  public List<Immunization> findByVaccineCode(QueryBuilder queryBuilder);
  public List<Immunization> findByPatient(QueryBuilder queryBuilder);
  public List<Immunization> findByEncounter(QueryBuilder queryBuilder);
  public List<Immunization> findByReportOrigin(QueryBuilder queryBuilder);
  public List<Immunization> findByLocation(QueryBuilder queryBuilder);
  public List<Immunization> findByManufacturer(QueryBuilder queryBuilder);
  public List<Immunization> findBySite(QueryBuilder queryBuilder);
  public List<Immunization> findByRoute(QueryBuilder queryBuilder);
  public List<Immunization> findByDoseQuantity(QueryBuilder queryBuilder);
  public List<Immunization> findByPractitioner(QueryBuilder queryBuilder);
  public List<Immunization> findByExplanation(QueryBuilder queryBuilder);
  public List<Immunization> findByReaction(QueryBuilder queryBuilder);
  public List<Immunization> findByVaccinationProtocol(QueryBuilder queryBuilder);
  public List<Immunization> findByText(QueryBuilder queryBuilder);
  public List<Immunization> findByMeta(QueryBuilder queryBuilder);


}