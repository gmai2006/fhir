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
import org.fhir.pojo.GuidanceResponse;

public interface GuidanceResponseService {
	public GuidanceResponse find(String id);
  public List<GuidanceResponse> select(int maxResult);
  public List<GuidanceResponse> selectAll();
  public GuidanceResponse create(GuidanceResponse bean);
  public GuidanceResponse update(GuidanceResponse bean);
  public void delete(GuidanceResponse bean);
  public List<GuidanceResponse> findByField(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByModule(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findBySubject(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByContext(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByPerformer(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByReasonCodeableConcept(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByReasonReference(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByEvaluationMessage(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByOutputParameters(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByResult(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByDataRequirement(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByText(QueryBuilder queryBuilder);
  public List<GuidanceResponse> findByMeta(QueryBuilder queryBuilder);


}