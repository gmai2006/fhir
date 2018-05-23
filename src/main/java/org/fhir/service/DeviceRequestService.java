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
import org.fhir.pojo.DeviceRequest;

public interface DeviceRequestService {
	public DeviceRequest find(String id);
  public List<DeviceRequest> select(int maxResult);
  public List<DeviceRequest> selectAll();
  public DeviceRequest create(DeviceRequest bean);
  public DeviceRequest update(DeviceRequest bean);
  public void delete(String id);
  public List<DeviceRequest> findByField(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByDefinition(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByBasedOn(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByPriorRequest(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByIntent(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByCodeReference(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByCodeCodeableConcept(QueryBuilder queryBuilder);
  public List<DeviceRequest> findBySubject(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByContext(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByRequester(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByPerformerType(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByPerformer(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByReasonCode(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByReasonReference(QueryBuilder queryBuilder);
  public List<DeviceRequest> findBySupportingInfo(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByRelevantHistory(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByText(QueryBuilder queryBuilder);
  public List<DeviceRequest> findByMeta(QueryBuilder queryBuilder);


}