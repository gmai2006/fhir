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
import org.fhir.pojo.ClinicalImpression;

public interface ClinicalImpressionService {
	public ClinicalImpression find(String id);
  public List<ClinicalImpression> select(int maxResult);
  public List<ClinicalImpression> selectAll();
  public ClinicalImpression create(ClinicalImpression bean);
  public ClinicalImpression update(ClinicalImpression bean);
  public void delete(ClinicalImpression bean);
  public List<ClinicalImpression> findByField(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByCode(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findBySubject(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByContext(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByAssessor(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByPrevious(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByProblem(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByInvestigation(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByFinding(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByPrognosisCodeableConcept(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByPrognosisReference(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByAction(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByText(QueryBuilder queryBuilder);
  public List<ClinicalImpression> findByMeta(QueryBuilder queryBuilder);


}