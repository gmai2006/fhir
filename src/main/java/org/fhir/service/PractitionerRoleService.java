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
import org.fhir.pojo.PractitionerRole;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public interface PractitionerRoleService {
	public PractitionerRole find(String id);
  public List<PractitionerRole> select(int maxResult);
  public List<PractitionerRole> selectAll();
  public PractitionerRole create(PractitionerRole bean);
  public PractitionerRole update(PractitionerRole bean);
  public void delete(String id);
  public List<PractitionerRole> findByField(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByPractitioner(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByOrganization(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByCode(QueryBuilder queryBuilder);
  public List<PractitionerRole> findBySpecialty(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByLocation(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByHealthcareService(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByAvailableTime(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByNotAvailable(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByEndpoint(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByText(QueryBuilder queryBuilder);
  public List<PractitionerRole> findByMeta(QueryBuilder queryBuilder);


}