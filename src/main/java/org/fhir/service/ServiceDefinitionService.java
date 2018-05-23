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
import org.fhir.pojo.ServiceDefinition;

public interface ServiceDefinitionService {
	public ServiceDefinition find(String id);
  public List<ServiceDefinition> select(int maxResult);
  public List<ServiceDefinition> selectAll();
  public ServiceDefinition create(ServiceDefinition bean);
  public ServiceDefinition update(ServiceDefinition bean);
  public void delete(String id);
  public List<ServiceDefinition> findByField(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByUseContext(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByJurisdiction(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByTopic(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByContributor(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByContact(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByRelatedArtifact(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByTrigger(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByDataRequirement(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByOperationDefinition(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByText(QueryBuilder queryBuilder);
  public List<ServiceDefinition> findByMeta(QueryBuilder queryBuilder);


}