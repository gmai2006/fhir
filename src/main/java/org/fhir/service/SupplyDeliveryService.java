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
import org.fhir.pojo.SupplyDelivery;

public interface SupplyDeliveryService {
	public SupplyDelivery find(String id);
  public List<SupplyDelivery> select(int maxResult);
  public List<SupplyDelivery> selectAll();
  public SupplyDelivery create(SupplyDelivery bean);
  public SupplyDelivery update(SupplyDelivery bean);
  public void delete(SupplyDelivery bean);
  public List<SupplyDelivery> findByField(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findByBasedOn(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findByPartOf(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findByPatient(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findByType(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findBySuppliedItem(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findBySupplier(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findByDestination(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findByReceiver(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findByText(QueryBuilder queryBuilder);
  public List<SupplyDelivery> findByMeta(QueryBuilder queryBuilder);


}