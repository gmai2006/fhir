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
import org.fhir.pojo.MessageHeader;

public interface MessageHeaderDao {
  public MessageHeader find(String id);

  public List<MessageHeader> select(int maxResult);

  public List<MessageHeader> selectAll();
  public MessageHeader create(MessageHeader e);

  public MessageHeader update(MessageHeader e);
  public void delete(MessageHeader e);

  public List<MessageHeader> findByField(QueryBuilder queryBuilder);

  public List<MessageHeader> findByAuthor(QueryBuilder queryBuilder);
  public List<MessageHeader> findByDestination(QueryBuilder queryBuilder);
  public List<MessageHeader> findByEnterer(QueryBuilder queryBuilder);
  public List<MessageHeader> findByFocus(QueryBuilder queryBuilder);
  public List<MessageHeader> findByReceiver(QueryBuilder queryBuilder);
  public List<MessageHeader> findByResponsible(QueryBuilder queryBuilder);
  public List<MessageHeader> findBySender(QueryBuilder queryBuilder);
  public List<MessageHeader> findBySource(QueryBuilder queryBuilder);
}