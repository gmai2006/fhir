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
import org.fhir.pojo.Communication;

public interface CommunicationDao {
  public Communication find(String id);

  public List<Communication> select(int maxResult);

  public List<Communication> selectAll();
  public Communication create(Communication e);

  public Communication update(Communication e);
  public void delete(Communication e);

  public List<Communication> findByField(QueryBuilder queryBuilder);

  public List<Communication> findByDefinition(QueryBuilder queryBuilder);
  public List<Communication> findByBasedOn(QueryBuilder queryBuilder);
  public List<Communication> findByPartOf(QueryBuilder queryBuilder);
  public List<Communication> findByNotDoneReason(QueryBuilder queryBuilder);
  public List<Communication> findByCategory(QueryBuilder queryBuilder);
  public List<Communication> findByMedium(QueryBuilder queryBuilder);
  public List<Communication> findBySubject(QueryBuilder queryBuilder);
  public List<Communication> findByRecipient(QueryBuilder queryBuilder);
  public List<Communication> findByTopic(QueryBuilder queryBuilder);
  public List<Communication> findByContext(QueryBuilder queryBuilder);
  public List<Communication> findBySender(QueryBuilder queryBuilder);
  public List<Communication> findByReasonCode(QueryBuilder queryBuilder);
  public List<Communication> findByReasonReference(QueryBuilder queryBuilder);
  public List<Communication> findByPayload(QueryBuilder queryBuilder);
  public List<Communication> findByText(QueryBuilder queryBuilder);
  public List<Communication> findByMeta(QueryBuilder queryBuilder);
}