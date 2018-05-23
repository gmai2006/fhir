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
import org.fhir.pojo.Specimen;

public interface SpecimenDao {
  public Specimen find(String id);

  public List<Specimen> select(int maxResult);

  public List<Specimen> selectAll();
  public Specimen create(Specimen e);

  public Specimen update(Specimen e);
  public void delete(String id);

  public List<Specimen> findByField(QueryBuilder queryBuilder);

  public List<Specimen> findByType(QueryBuilder queryBuilder);
  public List<Specimen> findBySubject(QueryBuilder queryBuilder);
  public List<Specimen> findByParent(QueryBuilder queryBuilder);
  public List<Specimen> findByRequest(QueryBuilder queryBuilder);
  public List<Specimen> findByCollection(QueryBuilder queryBuilder);
  public List<Specimen> findByProcessing(QueryBuilder queryBuilder);
  public List<Specimen> findByContainer(QueryBuilder queryBuilder);
  public List<Specimen> findByText(QueryBuilder queryBuilder);
  public List<Specimen> findByMeta(QueryBuilder queryBuilder);
}