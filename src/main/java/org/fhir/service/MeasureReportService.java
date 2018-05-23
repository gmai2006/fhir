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
import org.fhir.pojo.MeasureReport;

public interface MeasureReportService {
	public MeasureReport find(String id);
  public List<MeasureReport> select(int maxResult);
  public List<MeasureReport> selectAll();
  public MeasureReport create(MeasureReport bean);
  public MeasureReport update(MeasureReport bean);
  public void delete(String id);
  public List<MeasureReport> findByField(QueryBuilder queryBuilder);
  public List<MeasureReport> findByMeasure(QueryBuilder queryBuilder);
  public List<MeasureReport> findByPatient(QueryBuilder queryBuilder);
  public List<MeasureReport> findByReportingOrganization(QueryBuilder queryBuilder);
  public List<MeasureReport> findByGroup(QueryBuilder queryBuilder);
  public List<MeasureReport> findByEvaluatedResources(QueryBuilder queryBuilder);
  public List<MeasureReport> findByText(QueryBuilder queryBuilder);
  public List<MeasureReport> findByMeta(QueryBuilder queryBuilder);


}