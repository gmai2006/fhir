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
import org.fhir.pojo.ProcedureRequest;

public interface ProcedureRequestDao {
  public ProcedureRequest find(String id);

  public List<ProcedureRequest> select(int maxResult);

  public List<ProcedureRequest> selectAll();
  public ProcedureRequest create(ProcedureRequest e);

  public ProcedureRequest update(ProcedureRequest e);
  public void delete(ProcedureRequest e);

  public List<ProcedureRequest> findByField(QueryBuilder queryBuilder);

  public List<ProcedureRequest> findByDefinition(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByBasedOn(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByReplaces(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByCategory(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByCode(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findBySubject(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByContext(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByAsNeededCodeableConcept(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByRequester(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByPerformerType(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByPerformer(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByReasonCode(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByReasonReference(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findBySupportingInfo(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findBySpecimen(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByBodySite(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByRelevantHistory(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByText(QueryBuilder queryBuilder);
  public List<ProcedureRequest> findByMeta(QueryBuilder queryBuilder);
}