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

package org.fhir.dao;
import java.util.List;
import java.util.logging.Logger;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Task;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public interface TaskDao {
  public Task find(String id);

  public List<Task> select(int maxResult);

  public List<Task> selectAll();
  public Task create(Task e);

  public Task update(Task e);
  public void delete(String id);

  public List<Task> findByField(QueryBuilder queryBuilder);

  public List<Task> findByDefinitionReference(QueryBuilder queryBuilder);
  public List<Task> findByBasedOn(QueryBuilder queryBuilder);
  public List<Task> findByPartOf(QueryBuilder queryBuilder);
  public List<Task> findByStatusReason(QueryBuilder queryBuilder);
  public List<Task> findByBusinessStatus(QueryBuilder queryBuilder);
  public List<Task> findByCode(QueryBuilder queryBuilder);
  public List<Task> findByFocus(QueryBuilder queryBuilder);
  public List<Task> findByFHIRfor(QueryBuilder queryBuilder);
  public List<Task> findByContext(QueryBuilder queryBuilder);
  public List<Task> findByRequester(QueryBuilder queryBuilder);
  public List<Task> findByPerformerType(QueryBuilder queryBuilder);
  public List<Task> findByOwner(QueryBuilder queryBuilder);
  public List<Task> findByReason(QueryBuilder queryBuilder);
  public List<Task> findByRelevantHistory(QueryBuilder queryBuilder);
  public List<Task> findByRestriction(QueryBuilder queryBuilder);
  public List<Task> findByOutput(QueryBuilder queryBuilder);
  public List<Task> findByText(QueryBuilder queryBuilder);
  public List<Task> findByMeta(QueryBuilder queryBuilder);
}