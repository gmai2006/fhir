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
import org.fhir.pojo.NutritionOrder;

public interface NutritionOrderService {
	public NutritionOrder find(String id);
  public List<NutritionOrder> select(int maxResult);
  public List<NutritionOrder> selectAll();
  public NutritionOrder create(NutritionOrder bean);
  public NutritionOrder update(NutritionOrder bean);
  public void delete(String id);
  public List<NutritionOrder> findByField(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByPatient(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByEncounter(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByOrderer(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByAllergyIntolerance(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByFoodPreferenceModifier(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByExcludeFoodModifier(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByOralDiet(QueryBuilder queryBuilder);
  public List<NutritionOrder> findBySupplement(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByEnteralFormula(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByText(QueryBuilder queryBuilder);
  public List<NutritionOrder> findByMeta(QueryBuilder queryBuilder);


}