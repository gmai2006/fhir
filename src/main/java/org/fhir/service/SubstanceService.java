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
import org.fhir.pojo.Substance;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public interface SubstanceService {
	public Substance find(String id);
  public List<Substance> select(int maxResult);
  public List<Substance> selectAll();
  public Substance create(Substance bean);
  public Substance update(Substance bean);
  public void delete(String id);
  public List<Substance> findByField(QueryBuilder queryBuilder);
  public List<Substance> findByCategory(QueryBuilder queryBuilder);
  public List<Substance> findByCode(QueryBuilder queryBuilder);
  public List<Substance> findByInstance(QueryBuilder queryBuilder);
  public List<Substance> findByIngredient(QueryBuilder queryBuilder);
  public List<Substance> findByText(QueryBuilder queryBuilder);
  public List<Substance> findByMeta(QueryBuilder queryBuilder);


}