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
import org.fhir.pojo.EpisodeOfCare;

public interface EpisodeOfCareService {
	public EpisodeOfCare find(String id);
  public List<EpisodeOfCare> select(int maxResult);
  public List<EpisodeOfCare> selectAll();
  public EpisodeOfCare create(EpisodeOfCare bean);
  public EpisodeOfCare update(EpisodeOfCare bean);
  public void delete(String id);
  public List<EpisodeOfCare> findByField(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByStatusHistory(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByType(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByDiagnosis(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByPatient(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByManagingOrganization(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByReferralRequest(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByCareManager(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByTeam(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByAccount(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByText(QueryBuilder queryBuilder);
  public List<EpisodeOfCare> findByMeta(QueryBuilder queryBuilder);


}