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
import org.fhir.pojo.FHIRList;

public interface FHIRListDao {
  public FHIRList find(String id);

  public List<FHIRList> select(int maxResult);

  public List<FHIRList> selectAll();
  public FHIRList create(FHIRList e);

  public FHIRList update(FHIRList e);
  public void delete(String id);

  public List<FHIRList> findByField(QueryBuilder queryBuilder);

  public List<FHIRList> findByCode(QueryBuilder queryBuilder);
  public List<FHIRList> findBySubject(QueryBuilder queryBuilder);
  public List<FHIRList> findByEncounter(QueryBuilder queryBuilder);
  public List<FHIRList> findBySource(QueryBuilder queryBuilder);
  public List<FHIRList> findByOrderedBy(QueryBuilder queryBuilder);
  public List<FHIRList> findByEntry(QueryBuilder queryBuilder);
  public List<FHIRList> findByEmptyReason(QueryBuilder queryBuilder);
  public List<FHIRList> findByText(QueryBuilder queryBuilder);
  public List<FHIRList> findByMeta(QueryBuilder queryBuilder);
}