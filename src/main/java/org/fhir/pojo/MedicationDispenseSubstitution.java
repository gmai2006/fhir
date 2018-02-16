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
import org.fhir.entity.MedicationDispenseSubstitutionModel;
import com.google.gson.GsonBuilder;

/**
* "Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order."
*/
public class MedicationDispenseSubstitution  extends BackboneElement  {
  /**
  * Description: "True if the dispenser dispensed a different drug or product from what was prescribed."
  */
  protected Boolean wasSubstituted;

  /**
  * Description: "Extensions for wasSubstituted"
  */
  protected transient Element _wasSubstituted;

  /**
  * Description: "A code signifying whether a different drug was dispensed from what was prescribed."
  */
  protected CodeableConcept type;

  /**
  * Description: "Indicates the reason for the substitution of (or lack of substitution) from what was prescribed."
  */
  protected java.util.List<CodeableConcept> reason = new java.util.ArrayList<>();

  /**
  * Description: "The person or organization that has primary responsibility for the substitution."
  */
  protected java.util.List<Reference> responsibleParty = new java.util.ArrayList<>();

  public MedicationDispenseSubstitution() {
  }

  public MedicationDispenseSubstitution(MedicationDispenseSubstitutionModel o) {
    this.id = o.getId();
    if (null != o.getWasSubstituted()) {
      this.wasSubstituted = o.getWasSubstituted();
    }
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getResponsibleParty() && !o.getResponsibleParty().isEmpty()) {
    	this.responsibleParty = ReferenceHelper.fromArray2Array(o.getResponsibleParty());
    }
  }

  public void setWasSubstituted( Boolean value) {
    this.wasSubstituted = value;
  }
  public Boolean getWasSubstituted() {
    return this.wasSubstituted;
  }
  public void set_wasSubstituted( Element value) {
    this._wasSubstituted = value;
  }
  public Element get_wasSubstituted() {
    return this._wasSubstituted;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setReason( java.util.List<CodeableConcept> value) {
    this.reason = value;
  }
  public java.util.List<CodeableConcept> getReason() {
    return this.reason;
  }
  public void setResponsibleParty( java.util.List<Reference> value) {
    this.responsibleParty = value;
  }
  public java.util.List<Reference> getResponsibleParty() {
    return this.responsibleParty;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MedicationDispenseSubstitution]:" + "\n");
     if(this.wasSubstituted != null) builder.append("wasSubstituted" + "->" + this.wasSubstituted.toString() + "\n"); 
     if(this._wasSubstituted != null) builder.append("_wasSubstituted" + "->" + this._wasSubstituted.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.responsibleParty != null) builder.append("responsibleParty" + "->" + this.responsibleParty.toString() + "\n"); ;
    return builder.toString();
  }


}