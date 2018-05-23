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
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Procedure;

public interface ProcedureDao {
  public Procedure find(String id);

  public List<Procedure> select(int maxResult);

  public List<Procedure> selectAll();
  public Procedure create(Procedure e);

  public Procedure update(Procedure e);
  public void delete(String id);

  public List<Procedure> findByField(QueryBuilder queryBuilder);

  public List<Procedure> findByDefinition(QueryBuilder queryBuilder);
  public List<Procedure> findByBasedOn(QueryBuilder queryBuilder);
  public List<Procedure> findByPartOf(QueryBuilder queryBuilder);
  public List<Procedure> findByNotDoneReason(QueryBuilder queryBuilder);
  public List<Procedure> findByCategory(QueryBuilder queryBuilder);
  public List<Procedure> findByCode(QueryBuilder queryBuilder);
  public List<Procedure> findBySubject(QueryBuilder queryBuilder);
  public List<Procedure> findByContext(QueryBuilder queryBuilder);
  public List<Procedure> findByPerformer(QueryBuilder queryBuilder);
  public List<Procedure> findByLocation(QueryBuilder queryBuilder);
  public List<Procedure> findByReasonCode(QueryBuilder queryBuilder);
  public List<Procedure> findByReasonReference(QueryBuilder queryBuilder);
  public List<Procedure> findByBodySite(QueryBuilder queryBuilder);
  public List<Procedure> findByOutcome(QueryBuilder queryBuilder);
  public List<Procedure> findByReport(QueryBuilder queryBuilder);
  public List<Procedure> findByComplication(QueryBuilder queryBuilder);
  public List<Procedure> findByComplicationDetail(QueryBuilder queryBuilder);
  public List<Procedure> findByFollowUp(QueryBuilder queryBuilder);
  public List<Procedure> findByFocalDevice(QueryBuilder queryBuilder);
  public List<Procedure> findByUsedReference(QueryBuilder queryBuilder);
  public List<Procedure> findByUsedCode(QueryBuilder queryBuilder);
  public List<Procedure> findByText(QueryBuilder queryBuilder);
  public List<Procedure> findByMeta(QueryBuilder queryBuilder);
}