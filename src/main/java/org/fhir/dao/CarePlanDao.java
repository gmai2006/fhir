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
import org.fhir.pojo.CarePlan;

public interface CarePlanDao {
  public CarePlan find(String id);

  public List<CarePlan> select(int maxResult);

  public List<CarePlan> selectAll();
  public CarePlan create(CarePlan e);

  public CarePlan update(CarePlan e);
  public void delete(String id);

  public List<CarePlan> findByField(QueryBuilder queryBuilder);

  public List<CarePlan> findByDefinition(QueryBuilder queryBuilder);
  public List<CarePlan> findByBasedOn(QueryBuilder queryBuilder);
  public List<CarePlan> findByReplaces(QueryBuilder queryBuilder);
  public List<CarePlan> findByPartOf(QueryBuilder queryBuilder);
  public List<CarePlan> findByCategory(QueryBuilder queryBuilder);
  public List<CarePlan> findBySubject(QueryBuilder queryBuilder);
  public List<CarePlan> findByContext(QueryBuilder queryBuilder);
  public List<CarePlan> findByAuthor(QueryBuilder queryBuilder);
  public List<CarePlan> findByCareTeam(QueryBuilder queryBuilder);
  public List<CarePlan> findByAddresses(QueryBuilder queryBuilder);
  public List<CarePlan> findBySupportingInfo(QueryBuilder queryBuilder);
  public List<CarePlan> findByGoal(QueryBuilder queryBuilder);
  public List<CarePlan> findByActivity(QueryBuilder queryBuilder);
  public List<CarePlan> findByText(QueryBuilder queryBuilder);
  public List<CarePlan> findByMeta(QueryBuilder queryBuilder);
}