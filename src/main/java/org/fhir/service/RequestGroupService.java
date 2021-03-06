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
import org.fhir.pojo.RequestGroup;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public interface RequestGroupService {
	public RequestGroup find(String id);
  public List<RequestGroup> select(int maxResult);
  public List<RequestGroup> selectAll();
  public RequestGroup create(RequestGroup bean);
  public RequestGroup update(RequestGroup bean);
  public void delete(String id);
  public List<RequestGroup> findByField(QueryBuilder queryBuilder);
  public List<RequestGroup> findByDefinition(QueryBuilder queryBuilder);
  public List<RequestGroup> findByBasedOn(QueryBuilder queryBuilder);
  public List<RequestGroup> findByReplaces(QueryBuilder queryBuilder);
  public List<RequestGroup> findBySubject(QueryBuilder queryBuilder);
  public List<RequestGroup> findByContext(QueryBuilder queryBuilder);
  public List<RequestGroup> findByAuthor(QueryBuilder queryBuilder);
  public List<RequestGroup> findByReasonCodeableConcept(QueryBuilder queryBuilder);
  public List<RequestGroup> findByReasonReference(QueryBuilder queryBuilder);
  public List<RequestGroup> findByAction(QueryBuilder queryBuilder);
  public List<RequestGroup> findByText(QueryBuilder queryBuilder);
  public List<RequestGroup> findByMeta(QueryBuilder queryBuilder);


}