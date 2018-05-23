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
import org.fhir.pojo.DiagnosticReport;

public interface DiagnosticReportService {
	public DiagnosticReport find(String id);
  public List<DiagnosticReport> select(int maxResult);
  public List<DiagnosticReport> selectAll();
  public DiagnosticReport create(DiagnosticReport bean);
  public DiagnosticReport update(DiagnosticReport bean);
  public void delete(String id);
  public List<DiagnosticReport> findByField(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByBasedOn(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByCategory(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByCode(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findBySubject(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByContext(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByPerformer(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findBySpecimen(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByResult(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByImagingStudy(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByImage(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByCodedDiagnosis(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByText(QueryBuilder queryBuilder);
  public List<DiagnosticReport> findByMeta(QueryBuilder queryBuilder);


}