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

package org.fhir.pojo;
import com.google.gson.GsonBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestScriptSetup  extends BackboneElement  {
  /**
  * Description: "Action would contain either an operation or an assertion."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<TestScriptAction> action;

  public TestScriptSetup() {}

  public void setAction( java.util.List<TestScriptAction> value) {
    this.action = value;
  }
  public java.util.List<TestScriptAction> getAction() {
    return this.action;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptSetup]:" + "\n");
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); ;
    return builder.toString();
  }

}