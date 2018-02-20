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
import org.fhir.pojo.CodeSystem;

public interface CodeSystemDao {
  public CodeSystem find(String id);

  public List<CodeSystem> select(int maxResult);

  public List<CodeSystem> selectAll();
  public CodeSystem create(CodeSystem e);

  public CodeSystem update(CodeSystem e);
  public void delete(CodeSystem e);

  public List<CodeSystem> findByField(QueryBuilder queryBuilder);

  public List<CodeSystem> findByContact(QueryBuilder queryBuilder);
  public List<CodeSystem> findByUseContext(QueryBuilder queryBuilder);
  public List<CodeSystem> findByJurisdiction(QueryBuilder queryBuilder);
  public List<CodeSystem> findByFilter(QueryBuilder queryBuilder);
  public List<CodeSystem> findByProperty(QueryBuilder queryBuilder);
  public List<CodeSystem> findByConcept(QueryBuilder queryBuilder);
  public List<CodeSystem> findByText(QueryBuilder queryBuilder);
  public List<CodeSystem> findByMeta(QueryBuilder queryBuilder);
}