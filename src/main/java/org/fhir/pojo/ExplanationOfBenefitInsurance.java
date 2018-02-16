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
import org.fhir.entity.ExplanationOfBenefitInsuranceModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitInsurance  extends BackboneElement  {
  /**
  * Description: "Reference to the program or plan identification, underwriter or payor."
  */
  protected Reference coverage;

  /**
  * Description: "A list of references from the Insurer to which these services pertain."
  */
  protected java.util.List<String> preAuthRef = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for preAuthRef"
  */
  protected transient java.util.List<Element> _preAuthRef = new java.util.ArrayList<>();

  public ExplanationOfBenefitInsurance() {
  }

  public ExplanationOfBenefitInsurance(ExplanationOfBenefitInsuranceModel o) {
    this.id = o.getId();
    if (null != o.getCoverage() && !o.getCoverage().isEmpty()) {
      this.coverage = new Reference(o.getCoverage().get(0));
    }
    if (o.getPreAuthRef() != null) {
    	this.preAuthRef = org.fhir.utils.JsonUtils.json2Array(o.getPreAuthRef());
    }
  }

  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
  }
  public void setPreAuthRef( java.util.List<String> value) {
    this.preAuthRef = value;
  }
  public java.util.List<String> getPreAuthRef() {
    return this.preAuthRef;
  }
  public void set_preAuthRef( java.util.List<Element> value) {
    this._preAuthRef = value;
  }
  public java.util.List<Element> get_preAuthRef() {
    return this._preAuthRef;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitInsurance]:" + "\n");
     if(this.coverage != null) builder.append("coverage" + "->" + this.coverage.toString() + "\n"); 
     if(this.preAuthRef != null) builder.append("preAuthRef" + "->" + this.preAuthRef.toString() + "\n"); 
     if(this._preAuthRef != null) builder.append("_preAuthRef" + "->" + this._preAuthRef.toString() + "\n"); ;
    return builder.toString();
  }


}