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
import org.fhir.pojo.Flag;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public interface FlagDao {
  public Flag find(String id);

  public List<Flag> select(int maxResult);

  public List<Flag> selectAll();
  public Flag create(Flag e);

  public Flag update(Flag e);
  public void delete(String id);

  public List<Flag> findByField(QueryBuilder queryBuilder);

  public List<Flag> findByCategory(QueryBuilder queryBuilder);
  public List<Flag> findByCode(QueryBuilder queryBuilder);
  public List<Flag> findBySubject(QueryBuilder queryBuilder);
  public List<Flag> findByEncounter(QueryBuilder queryBuilder);
  public List<Flag> findByAuthor(QueryBuilder queryBuilder);
  public List<Flag> findByText(QueryBuilder queryBuilder);
  public List<Flag> findByMeta(QueryBuilder queryBuilder);
}