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
import org.fhir.entity.MedicationRequestSubstitutionModel;
import com.google.gson.GsonBuilder;

/**
* "An order or request for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called \"MedicationRequest\" rather than \"MedicationPrescription\" or \"MedicationOrder\" to generalize the use across inpatient and outpatient settings, including care plans, etc., and to harmonize with workflow patterns."
*/
public class MedicationRequestSubstitution  extends BackboneElement  {
  /**
  * Description: "True if the prescriber allows a different drug to be dispensed from what was prescribed."
  */
  protected Boolean allowed;

  /**
  * Description: "Extensions for allowed"
  */
  protected transient Element _allowed;

  /**
  * Description: "Indicates the reason for the substitution, or why substitution must or must not be performed."
  */
  protected CodeableConcept reason;

  public MedicationRequestSubstitution() {
  }

  public MedicationRequestSubstitution(MedicationRequestSubstitutionModel o) {
    this.id = o.getId();
    if (null != o.getAllowed()) {
      this.allowed = o.getAllowed();
    }
    if (null != o.getReason() && !o.getReason().isEmpty()) {
      this.reason = new CodeableConcept(o.getReason().get(0));
    }
  }

  public void setAllowed( Boolean value) {
    this.allowed = value;
  }
  public Boolean getAllowed() {
    return this.allowed;
  }
  public void set_allowed( Element value) {
    this._allowed = value;
  }
  public Element get_allowed() {
    return this._allowed;
  }
  public void setReason( CodeableConcept value) {
    this.reason = value;
  }
  public CodeableConcept getReason() {
    return this.reason;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationRequestSubstitution]:" + "\n");
     if(this.allowed != null) builder.append("allowed" + "->" + this.allowed.toString() + "\n"); 
     if(this._allowed != null) builder.append("_allowed" + "->" + this._allowed.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); ;
    return builder.toString();
  }


}