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
import org.fhir.pojo.ReferralRequest;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public interface ReferralRequestDao {
  public ReferralRequest find(String id);

  public List<ReferralRequest> select(int maxResult);

  public List<ReferralRequest> selectAll();
  public ReferralRequest create(ReferralRequest e);

  public ReferralRequest update(ReferralRequest e);
  public void delete(String id);

  public List<ReferralRequest> findByField(QueryBuilder queryBuilder);

  public List<ReferralRequest> findByDefinition(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByBasedOn(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByReplaces(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByType(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByServiceRequested(QueryBuilder queryBuilder);
  public List<ReferralRequest> findBySubject(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByContext(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByRequester(QueryBuilder queryBuilder);
  public List<ReferralRequest> findBySpecialty(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByRecipient(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByReasonCode(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByReasonReference(QueryBuilder queryBuilder);
  public List<ReferralRequest> findBySupportingInfo(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByRelevantHistory(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByText(QueryBuilder queryBuilder);
  public List<ReferralRequest> findByMeta(QueryBuilder queryBuilder);
}