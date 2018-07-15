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
import java.util.logging.Logger;
import org.fhir.utils.QueryBuilder;
import org.fhir.pojo.Observation;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public interface ObservationDao {
  public Observation find(String id);

  public List<Observation> select(int maxResult);

  public List<Observation> selectAll();
  public Observation create(Observation e);

  public Observation update(Observation e);
  public void delete(String id);

  public List<Observation> findByField(QueryBuilder queryBuilder);

  public List<Observation> findByBasedOn(QueryBuilder queryBuilder);
  public List<Observation> findByCategory(QueryBuilder queryBuilder);
  public List<Observation> findByCode(QueryBuilder queryBuilder);
  public List<Observation> findBySubject(QueryBuilder queryBuilder);
  public List<Observation> findByContext(QueryBuilder queryBuilder);
  public List<Observation> findByPerformer(QueryBuilder queryBuilder);
  public List<Observation> findByValueQuantity(QueryBuilder queryBuilder);
  public List<Observation> findByValueCodeableConcept(QueryBuilder queryBuilder);
  public List<Observation> findByDataAbsentReason(QueryBuilder queryBuilder);
  public List<Observation> findByInterpretation(QueryBuilder queryBuilder);
  public List<Observation> findByBodySite(QueryBuilder queryBuilder);
  public List<Observation> findByMethod(QueryBuilder queryBuilder);
  public List<Observation> findBySpecimen(QueryBuilder queryBuilder);
  public List<Observation> findByDevice(QueryBuilder queryBuilder);
  public List<Observation> findByReferenceRange(QueryBuilder queryBuilder);
  public List<Observation> findByRelated(QueryBuilder queryBuilder);
  public List<Observation> findByComponent(QueryBuilder queryBuilder);
  public List<Observation> findByText(QueryBuilder queryBuilder);
  public List<Observation> findByMeta(QueryBuilder queryBuilder);
}