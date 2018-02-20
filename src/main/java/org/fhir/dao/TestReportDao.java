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
import org.fhir.pojo.TestReport;

public interface TestReportDao {
  public TestReport find(String id);

  public List<TestReport> select(int maxResult);

  public List<TestReport> selectAll();
  public TestReport create(TestReport e);

  public TestReport update(TestReport e);
  public void delete(TestReport e);

  public List<TestReport> findByField(QueryBuilder queryBuilder);

  public List<TestReport> findByTestScript(QueryBuilder queryBuilder);
  public List<TestReport> findByParticipant(QueryBuilder queryBuilder);
  public List<TestReport> findBySetup(QueryBuilder queryBuilder);
  public List<TestReport> findByTest(QueryBuilder queryBuilder);
  public List<TestReport> findByTeardown(QueryBuilder queryBuilder);
  public List<TestReport> findByText(QueryBuilder queryBuilder);
  public List<TestReport> findByMeta(QueryBuilder queryBuilder);
}