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
import org.fhir.entity.ExplanationOfBenefitRelatedModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided."
*/
public class ExplanationOfBenefitRelated  extends BackboneElement  {
  /**
  * Description: "Other claims which are related to this claim such as prior claim versions or for related services."
  */
  protected Reference claim;

  /**
  * Description: "For example prior or umbrella."
  */
  protected CodeableConcept relationship;

  /**
  * Description: "An alternate organizational reference to the case or file to which this particular claim pertains - eg Property/Casualy insurer claim # or Workers Compensation case # ."
  */
  protected Identifier reference;

  public ExplanationOfBenefitRelated() {
  }

  public ExplanationOfBenefitRelated(ExplanationOfBenefitRelatedModel o) {
    this.id = o.getId();
    if (null != o.getClaim() && !o.getClaim().isEmpty()) {
      this.claim = new Reference(o.getClaim().get(0));
    }
    this.relationship = CodeableConceptHelper.fromJson(o.getRelationship());
    this.reference = IdentifierHelper.fromJson(o.getReference());
  }

  public void setClaim( Reference value) {
    this.claim = value;
  }
  public Reference getClaim() {
    return this.claim;
  }
  public void setRelationship( CodeableConcept value) {
    this.relationship = value;
  }
  public CodeableConcept getRelationship() {
    return this.relationship;
  }
  public void setReference( Identifier value) {
    this.reference = value;
  }
  public Identifier getReference() {
    return this.reference;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ExplanationOfBenefitRelated]:" + "\n");
     if(this.claim != null) builder.append("claim" + "->" + this.claim.toString() + "\n"); 
     if(this.relationship != null) builder.append("relationship" + "->" + this.relationship.toString() + "\n"); 
     if(this.reference != null) builder.append("reference" + "->" + this.reference.toString() + "\n"); ;
    return builder.toString();
  }


}