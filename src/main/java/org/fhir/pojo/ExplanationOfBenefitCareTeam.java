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
import org.fhir.entity.ExplanationOfBenefitCareTeamModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitCareTeam  extends BackboneElement  {
  /**
  * Description: "Sequence of careteam which serves to order and provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  protected transient Element _sequence;

  /**
  * Description: "The members of the team who provided the overall service."
  */
  @javax.validation.constraints.NotNull
  protected Reference provider;

  /**
  * Description: "The practitioner who is billing and responsible for the claimed services rendered to the patient."
  */
  protected Boolean responsible;

  /**
  * Description: "Extensions for responsible"
  */
  protected transient Element _responsible;

  /**
  * Description: "The lead, assisting or supervising practitioner and their discipline if a multidisiplinary team."
  */
  protected CodeableConcept role;

  /**
  * Description: "The qualification which is applicable for this service."
  */
  protected CodeableConcept qualification;

  public ExplanationOfBenefitCareTeam() {
  }

  public ExplanationOfBenefitCareTeam(ExplanationOfBenefitCareTeamModel o) {
    this.id = o.getId();
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    if (null != o.getProvider() && !o.getProvider().isEmpty()) {
      this.provider = new Reference(o.getProvider().get(0));
    }
    if (null != o.getResponsible()) {
      this.responsible = o.getResponsible();
    }
    if (null != o.getRole() && !o.getRole().isEmpty()) {
      this.role = new CodeableConcept(o.getRole().get(0));
    }
    if (null != o.getQualification() && !o.getQualification().isEmpty()) {
      this.qualification = new CodeableConcept(o.getQualification().get(0));
    }
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
  }
  public void setProvider( Reference value) {
    this.provider = value;
  }
  public Reference getProvider() {
    return this.provider;
  }
  public void setResponsible( Boolean value) {
    this.responsible = value;
  }
  public Boolean getResponsible() {
    return this.responsible;
  }
  public void set_responsible( Element value) {
    this._responsible = value;
  }
  public Element get_responsible() {
    return this._responsible;
  }
  public void setRole( CodeableConcept value) {
    this.role = value;
  }
  public CodeableConcept getRole() {
    return this.role;
  }
  public void setQualification( CodeableConcept value) {
    this.qualification = value;
  }
  public CodeableConcept getQualification() {
    return this.qualification;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitCareTeam]:" + "\n");
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.provider != null) builder.append("provider" + "->" + this.provider.toString() + "\n"); 
     if(this.responsible != null) builder.append("responsible" + "->" + this.responsible.toString() + "\n"); 
     if(this._responsible != null) builder.append("_responsible" + "->" + this._responsible.toString() + "\n"); 
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this.qualification != null) builder.append("qualification" + "->" + this.qualification.toString() + "\n"); ;
    return builder.toString();
  }


}