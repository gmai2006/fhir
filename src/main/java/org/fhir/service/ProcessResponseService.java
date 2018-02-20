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
import org.fhir.pojo.ProcessResponse;

public interface ProcessResponseService {
	public ProcessResponse find(String id);
  public List<ProcessResponse> select(int maxResult);
  public List<ProcessResponse> selectAll();
  public ProcessResponse create(ProcessResponse bean);
  public ProcessResponse update(ProcessResponse bean);
  public void delete(ProcessResponse bean);
  public List<ProcessResponse> findByField(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByOrganization(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByRequest(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByOutcome(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByRequestProvider(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByRequestOrganization(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByForm(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByProcessNote(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByError(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByCommunicationRequest(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByText(QueryBuilder queryBuilder);
  public List<ProcessResponse> findByMeta(QueryBuilder queryBuilder);


}