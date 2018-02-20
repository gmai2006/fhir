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
import org.fhir.pojo.Media;

public interface MediaService {
	public Media find(String id);
  public List<Media> select(int maxResult);
  public List<Media> selectAll();
  public Media create(Media bean);
  public Media update(Media bean);
  public void delete(Media bean);
  public List<Media> findByField(QueryBuilder queryBuilder);
  public List<Media> findByBasedOn(QueryBuilder queryBuilder);
  public List<Media> findBySubtype(QueryBuilder queryBuilder);
  public List<Media> findByView(QueryBuilder queryBuilder);
  public List<Media> findBySubject(QueryBuilder queryBuilder);
  public List<Media> findByContext(QueryBuilder queryBuilder);
  public List<Media> findByOperator(QueryBuilder queryBuilder);
  public List<Media> findByReasonCode(QueryBuilder queryBuilder);
  public List<Media> findByBodySite(QueryBuilder queryBuilder);
  public List<Media> findByDevice(QueryBuilder queryBuilder);
  public List<Media> findByText(QueryBuilder queryBuilder);
  public List<Media> findByMeta(QueryBuilder queryBuilder);


}