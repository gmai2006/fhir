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
import org.fhir.pojo.Practitioner;
/**
 * Auto generated from the FHIR specification
 * generated on 07/12/2018
 */
public interface PractitionerDao {
  public Practitioner find(String id);

  public List<Practitioner> select(int maxResult);

  public List<Practitioner> selectAll();
  public Practitioner create(Practitioner e);

  public Practitioner update(Practitioner e);
  public void delete(String id);

  public List<Practitioner> findByField(QueryBuilder queryBuilder);

  public List<Practitioner> findByAddress(QueryBuilder queryBuilder);
  public List<Practitioner> findByQualification(QueryBuilder queryBuilder);
  public List<Practitioner> findByCommunication(QueryBuilder queryBuilder);
  public List<Practitioner> findByText(QueryBuilder queryBuilder);
  public List<Practitioner> findByMeta(QueryBuilder queryBuilder);
}