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
import org.fhir.pojo.Measure;

public interface MeasureService {
	public Measure find(String id);
  public List<Measure> select(int maxResult);
  public List<Measure> selectAll();
  public Measure create(Measure bean);
  public Measure update(Measure bean);
  public void delete(Measure bean);
  public List<Measure> findByField(QueryBuilder queryBuilder);
  public List<Measure> findByUseContext(QueryBuilder queryBuilder);
  public List<Measure> findByJurisdiction(QueryBuilder queryBuilder);
  public List<Measure> findByTopic(QueryBuilder queryBuilder);
  public List<Measure> findByContributor(QueryBuilder queryBuilder);
  public List<Measure> findByContact(QueryBuilder queryBuilder);
  public List<Measure> findByRelatedArtifact(QueryBuilder queryBuilder);
  public List<Measure> findByLibrary(QueryBuilder queryBuilder);
  public List<Measure> findByScoring(QueryBuilder queryBuilder);
  public List<Measure> findByCompositeScoring(QueryBuilder queryBuilder);
  public List<Measure> findByType(QueryBuilder queryBuilder);
  public List<Measure> findByGroup(QueryBuilder queryBuilder);
  public List<Measure> findBySupplementalData(QueryBuilder queryBuilder);
  public List<Measure> findByText(QueryBuilder queryBuilder);
  public List<Measure> findByMeta(QueryBuilder queryBuilder);


}