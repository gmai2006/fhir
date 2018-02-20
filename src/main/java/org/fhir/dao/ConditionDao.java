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
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Condition;

public interface ConditionDao {
  public Condition find(String id);

  public List<Condition> select(int maxResult);

  public List<Condition> selectAll();
  public Condition create(Condition e);

  public Condition update(Condition e);
  public void delete(Condition e);

  public List<Condition> findByField(QueryBuilder queryBuilder);

  public List<Condition> findByCategory(QueryBuilder queryBuilder);
  public List<Condition> findBySeverity(QueryBuilder queryBuilder);
  public List<Condition> findByCode(QueryBuilder queryBuilder);
  public List<Condition> findByBodySite(QueryBuilder queryBuilder);
  public List<Condition> findBySubject(QueryBuilder queryBuilder);
  public List<Condition> findByContext(QueryBuilder queryBuilder);
  public List<Condition> findByAsserter(QueryBuilder queryBuilder);
  public List<Condition> findByStage(QueryBuilder queryBuilder);
  public List<Condition> findByEvidence(QueryBuilder queryBuilder);
  public List<Condition> findByText(QueryBuilder queryBuilder);
  public List<Condition> findByMeta(QueryBuilder queryBuilder);
}