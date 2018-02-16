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

/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
*/
public class TestScriptRule1  extends BackboneElement  {
  /**
  * Description: "Id of the referenced rule within the external ruleset template."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String ruleId;

  /**
  * Description: "Extensions for ruleId"
  */
  protected transient Element _ruleId;

  /**
  * Description: "Each rule template can take one or more parameters for rule evaluation."
  */
  protected java.util.List<TestScriptParam1> param = new java.util.ArrayList<>();

  public TestScriptRule1() {}

  public void setRuleId( String value) {
    this.ruleId = value;
  }
  public String getRuleId() {
    return this.ruleId;
  }
  public void set_ruleId( Element value) {
    this._ruleId = value;
  }
  public Element get_ruleId() {
    return this._ruleId;
  }
  public void setParam( java.util.List<TestScriptParam1> value) {
    this.param = value;
  }
  public java.util.List<TestScriptParam1> getParam() {
    return this.param;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptRule1]:" + "\n");
     if(this.ruleId != null) builder.append("ruleId" + "->" + this.ruleId.toString() + "\n"); 
     if(this._ruleId != null) builder.append("_ruleId" + "->" + this._ruleId.toString() + "\n"); 
     if(this.param != null) builder.append("param" + "->" + this.param.toString() + "\n"); ;
    return builder.toString();
  }

}