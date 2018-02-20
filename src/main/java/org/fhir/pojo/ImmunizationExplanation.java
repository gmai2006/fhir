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
import org.fhir.entity.ImmunizationExplanationModel;
import com.google.gson.GsonBuilder;

/**
* "Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed."
*/
public class ImmunizationExplanation  extends BackboneElement  {
  /**
  * Description: "Reasons why a vaccine was administered."
  */
  protected java.util.List<CodeableConcept> reason = new java.util.ArrayList<>();

  /**
  * Description: "Reason why a vaccine was not administered."
  */
  protected java.util.List<CodeableConcept> reasonNotGiven = new java.util.ArrayList<>();

  public ImmunizationExplanation() {
  }

  public ImmunizationExplanation(ImmunizationExplanationModel o) {
    this.id = o.getId();
    if (null != o.getReason() && !o.getReason().isEmpty()) {
    	this.reason = CodeableConceptHelper.fromArray2Array(o.getReason());
    }
    if (null != o.getReasonNotGiven() && !o.getReasonNotGiven().isEmpty()) {
    	this.reasonNotGiven = CodeableConceptHelper.fromArray2Array(o.getReasonNotGiven());
    }
  }

  public void setReason( java.util.List<CodeableConcept> value) {
    this.reason = value;
  }
  public java.util.List<CodeableConcept> getReason() {
    return this.reason;
  }
  public void setReasonNotGiven( java.util.List<CodeableConcept> value) {
    this.reasonNotGiven = value;
  }
  public java.util.List<CodeableConcept> getReasonNotGiven() {
    return this.reasonNotGiven;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ImmunizationExplanation]:" + "\n");
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.reasonNotGiven != null) builder.append("reasonNotGiven" + "->" + this.reasonNotGiven.toString() + "\n"); ;
    return builder.toString();
  }


}