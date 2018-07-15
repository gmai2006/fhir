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
import org.fhir.pojo.ChargeItem;
/**
 * Auto generated from the FHIR specification
 * generated on 07/14/2018
 */
public interface ChargeItemService {
	public ChargeItem find(String id);
  public List<ChargeItem> select(int maxResult);
  public List<ChargeItem> selectAll();
  public ChargeItem create(ChargeItem bean);
  public ChargeItem update(ChargeItem bean);
  public void delete(String id);
  public List<ChargeItem> findByField(QueryBuilder queryBuilder);
  public List<ChargeItem> findByPartOf(QueryBuilder queryBuilder);
  public List<ChargeItem> findByCode(QueryBuilder queryBuilder);
  public List<ChargeItem> findBySubject(QueryBuilder queryBuilder);
  public List<ChargeItem> findByContext(QueryBuilder queryBuilder);
  public List<ChargeItem> findByParticipant(QueryBuilder queryBuilder);
  public List<ChargeItem> findByPerformingOrganization(QueryBuilder queryBuilder);
  public List<ChargeItem> findByRequestingOrganization(QueryBuilder queryBuilder);
  public List<ChargeItem> findByQuantity(QueryBuilder queryBuilder);
  public List<ChargeItem> findByBodysite(QueryBuilder queryBuilder);
  public List<ChargeItem> findByPriceOverride(QueryBuilder queryBuilder);
  public List<ChargeItem> findByEnterer(QueryBuilder queryBuilder);
  public List<ChargeItem> findByReason(QueryBuilder queryBuilder);
  public List<ChargeItem> findByService(QueryBuilder queryBuilder);
  public List<ChargeItem> findByAccount(QueryBuilder queryBuilder);
  public List<ChargeItem> findBySupportingInformation(QueryBuilder queryBuilder);
  public List<ChargeItem> findByText(QueryBuilder queryBuilder);
  public List<ChargeItem> findByMeta(QueryBuilder queryBuilder);


}