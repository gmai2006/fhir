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
import org.fhir.pojo.ExpansionProfileDesignation1;

public interface ExpansionProfileDesignation1Service {
	public ExpansionProfileDesignation1 find(String id);
  public List<ExpansionProfileDesignation1> select(int maxResult);
  public List<ExpansionProfileDesignation1> selectAll();
  public ExpansionProfileDesignation1 create(ExpansionProfileDesignation1 bean);
  public ExpansionProfileDesignation1 update(ExpansionProfileDesignation1 bean);
  public void delete(ExpansionProfileDesignation1 bean);
}