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
import org.fhir.pojo.Person;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public interface PersonService {
	public Person find(String id);
  public List<Person> select(int maxResult);
  public List<Person> selectAll();
  public Person create(Person bean);
  public Person update(Person bean);
  public void delete(String id);
  public List<Person> findByField(QueryBuilder queryBuilder);
  public List<Person> findByAddress(QueryBuilder queryBuilder);
  public List<Person> findByManagingOrganization(QueryBuilder queryBuilder);
  public List<Person> findByLink(QueryBuilder queryBuilder);
  public List<Person> findByText(QueryBuilder queryBuilder);
  public List<Person> findByMeta(QueryBuilder queryBuilder);


}