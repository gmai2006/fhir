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
import org.fhir.pojo.RiskAssessment;

public interface RiskAssessmentService {
	public RiskAssessment find(String id);
  public List<RiskAssessment> select(int maxResult);
  public List<RiskAssessment> selectAll();
  public RiskAssessment create(RiskAssessment bean);
  public RiskAssessment update(RiskAssessment bean);
  public void delete(RiskAssessment bean);
  public List<RiskAssessment> findByField(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByBasedOn(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByParent(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByMethod(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByCode(QueryBuilder queryBuilder);
  public List<RiskAssessment> findBySubject(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByContext(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByCondition(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByPerformer(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByReasonCodeableConcept(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByReasonReference(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByBasis(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByPrediction(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByText(QueryBuilder queryBuilder);
  public List<RiskAssessment> findByMeta(QueryBuilder queryBuilder);


}