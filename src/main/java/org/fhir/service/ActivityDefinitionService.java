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
import org.fhir.pojo.ActivityDefinition;

public interface ActivityDefinitionService {
	public ActivityDefinition find(String id);
  public List<ActivityDefinition> select(int maxResult);
  public List<ActivityDefinition> selectAll();
  public ActivityDefinition create(ActivityDefinition bean);
  public ActivityDefinition update(ActivityDefinition bean);
  public void delete(ActivityDefinition bean);
  public List<ActivityDefinition> findByField(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByUseContext(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByJurisdiction(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByTopic(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByContributor(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByContact(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByRelatedArtifact(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByLibrary(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByCode(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByLocation(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByParticipant(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByProductReference(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByProductCodeableConcept(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByQuantity(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByDosage(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByBodySite(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByTransform(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByDynamicValue(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByText(QueryBuilder queryBuilder);
  public List<ActivityDefinition> findByMeta(QueryBuilder queryBuilder);


}