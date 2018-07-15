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
public class TestScriptRuleset1  extends BackboneElement  {
  /**
  * Description: "The TestScript.ruleset id value this assert will evaluate."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String rulesetId;

  /**
  * Description: "Extensions for rulesetId"
  */
  protected transient Element _rulesetId;

  /**
  * Description: "The referenced rule within the external ruleset template."
  */
  protected java.util.List<TestScriptRule3> rule;

  public TestScriptRuleset1() {}

  public void setRulesetId( String value) {
    this.rulesetId = value;
  }
  public String getRulesetId() {
    return this.rulesetId;
  }
  public void set_rulesetId( Element value) {
    this._rulesetId = value;
  }
  public Element get_rulesetId() {
    return this._rulesetId;
  }
  public void setRule( java.util.List<TestScriptRule3> value) {
    this.rule = value;
  }
  public java.util.List<TestScriptRule3> getRule() {
    return this.rule;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptRuleset1]:" + "\n");
     if(this.rulesetId != null) builder.append("rulesetId" + "->" + this.rulesetId.toString() + "\n"); 
     if(this._rulesetId != null) builder.append("_rulesetId" + "->" + this._rulesetId.toString() + "\n"); 
     if(this.rule != null) builder.append("rule" + "->" + this.rule.toString() + "\n"); ;
    return builder.toString();
  }

}