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
import org.fhir.pojo.AuditEvent;

public interface AuditEventDao {
  public AuditEvent find(String id);

  public List<AuditEvent> select(int maxResult);

  public List<AuditEvent> selectAll();
  public AuditEvent create(AuditEvent e);

  public AuditEvent update(AuditEvent e);
  public void delete(AuditEvent e);

  public List<AuditEvent> findByField(QueryBuilder queryBuilder);

  public List<AuditEvent> findByAgent(QueryBuilder queryBuilder);
  public List<AuditEvent> findByEntity(QueryBuilder queryBuilder);
  public List<AuditEvent> findBySource(QueryBuilder queryBuilder);
}