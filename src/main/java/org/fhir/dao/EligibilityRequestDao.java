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
import org.fhir.pojo.EligibilityRequest;

public interface EligibilityRequestDao {
  public EligibilityRequest find(String id);

  public List<EligibilityRequest> select(int maxResult);

  public List<EligibilityRequest> selectAll();
  public EligibilityRequest create(EligibilityRequest e);

  public EligibilityRequest update(EligibilityRequest e);
  public void delete(EligibilityRequest e);

  public List<EligibilityRequest> findByField(QueryBuilder queryBuilder);

  public List<EligibilityRequest> findByPriority(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByPatient(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByEnterer(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByProvider(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByOrganization(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByInsurer(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByFacility(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByCoverage(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByBenefitCategory(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByBenefitSubCategory(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByText(QueryBuilder queryBuilder);
  public List<EligibilityRequest> findByMeta(QueryBuilder queryBuilder);
}