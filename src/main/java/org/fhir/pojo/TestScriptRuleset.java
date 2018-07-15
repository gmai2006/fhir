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
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestScriptRuleset  extends BackboneElement  {
  /**
  * Description: "Reference to the resource (containing the contents of the ruleset needed for assertions)."
  */
  @javax.validation.constraints.NotNull
  protected Reference resource;

  /**
  * Description: "The referenced rule within the external ruleset template."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<TestScriptRule1> rule;

  public TestScriptRuleset() {}

  public void setResource( Reference value) {
    this.resource = value;
  }
  public Reference getResource() {
    return this.resource;
  }
  public void setRule( java.util.List<TestScriptRule1> value) {
    this.rule = value;
  }
  public java.util.List<TestScriptRule1> getRule() {
    return this.rule;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptRuleset]:" + "\n");
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); 
     if(this.rule != null) builder.append("rule" + "->" + this.rule.toString() + "\n"); ;
    return builder.toString();
  }

}