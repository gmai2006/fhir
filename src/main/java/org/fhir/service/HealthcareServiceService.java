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
import org.fhir.pojo.HealthcareService;

public interface HealthcareServiceService {
	public HealthcareService find(String id);
  public List<HealthcareService> select(int maxResult);
  public List<HealthcareService> selectAll();
  public HealthcareService create(HealthcareService bean);
  public HealthcareService update(HealthcareService bean);
  public void delete(HealthcareService bean);
  public List<HealthcareService> findByField(QueryBuilder queryBuilder);
  public List<HealthcareService> findByProvidedBy(QueryBuilder queryBuilder);
  public List<HealthcareService> findByCategory(QueryBuilder queryBuilder);
  public List<HealthcareService> findByType(QueryBuilder queryBuilder);
  public List<HealthcareService> findBySpecialty(QueryBuilder queryBuilder);
  public List<HealthcareService> findByLocation(QueryBuilder queryBuilder);
  public List<HealthcareService> findByCoverageArea(QueryBuilder queryBuilder);
  public List<HealthcareService> findByServiceProvisionCode(QueryBuilder queryBuilder);
  public List<HealthcareService> findByEligibility(QueryBuilder queryBuilder);
  public List<HealthcareService> findByCharacteristic(QueryBuilder queryBuilder);
  public List<HealthcareService> findByReferralMethod(QueryBuilder queryBuilder);
  public List<HealthcareService> findByAvailableTime(QueryBuilder queryBuilder);
  public List<HealthcareService> findByNotAvailable(QueryBuilder queryBuilder);
  public List<HealthcareService> findByEndpoint(QueryBuilder queryBuilder);
  public List<HealthcareService> findByText(QueryBuilder queryBuilder);
  public List<HealthcareService> findByMeta(QueryBuilder queryBuilder);


}