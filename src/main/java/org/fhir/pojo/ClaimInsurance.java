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
import org.fhir.entity.ClaimInsuranceModel;
import com.google.gson.GsonBuilder;

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
public class ClaimInsurance  {
  /**
  * Description: "Sequence of coverage which serves to provide a link and convey coordination of benefit order."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "A flag to indicate that this Coverage is the focus for adjudication. The Coverage against which the claim is to be adjudicated."
  */
  private Boolean focal;

  /**
  * Description: "Extensions for focal"
  */
  private transient Element _focal;

  /**
  * Description: "Reference to the program or plan identification, underwriter or payor."
  */
  @javax.validation.constraints.NotNull
  private Reference coverage;

  /**
  * Description: "The contract number of a business agreement which describes the terms and conditions."
  */
  private String businessArrangement;

  /**
  * Description: "Extensions for businessArrangement"
  */
  private transient Element _businessArrangement;

  /**
  * Description: "A list of references from the Insurer to which these services pertain."
  */
  private java.util.List<String> preAuthRef = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for preAuthRef"
  */
  private transient java.util.List<Element> _preAuthRef = new java.util.ArrayList<>();

  /**
  * Description: "The Coverages adjudication details."
  */
  private Reference claimResponse;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public ClaimInsurance() {
  }

  public ClaimInsurance(ClaimInsuranceModel o) {
    this.id = o.getId();
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    if (null != o.getFocal()) {
      this.focal = o.getFocal();
    }
    if (null != o.getCoverage() && !o.getCoverage().isEmpty()) {
      this.coverage = new Reference(o.getCoverage().get(0));
    }
    if (null != o.getBusinessArrangement()) {
      this.businessArrangement = o.getBusinessArrangement();
    }
    if (o.getPreAuthRef() != null) {
    	this.preAuthRef = org.fhir.utils.JsonUtils.json2Array(o.getPreAuthRef());
    }
    if (null != o.getClaimResponse() && !o.getClaimResponse().isEmpty()) {
      this.claimResponse = new Reference(o.getClaimResponse().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
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
  public void setFocal( Boolean value) {
    this.focal = value;
  }
  public Boolean getFocal() {
    return this.focal;
  }
  public void set_focal( Element value) {
    this._focal = value;
  }
  public Element get_focal() {
    return this._focal;
  }
  public void setCoverage( Reference value) {
    this.coverage = value;
  }
  public Reference getCoverage() {
    return this.coverage;
  }
  public void setBusinessArrangement( String value) {
    this.businessArrangement = value;
  }
  public String getBusinessArrangement() {
    return this.businessArrangement;
  }
  public void set_businessArrangement( Element value) {
    this._businessArrangement = value;
  }
  public Element get_businessArrangement() {
    return this._businessArrangement;
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
  public void setClaimResponse( Reference value) {
    this.claimResponse = value;
  }
  public Reference getClaimResponse() {
    return this.claimResponse;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimInsurance]:" + "\n");
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.focal != null) builder.append("focal" + "->" + this.focal.toString() + "\n"); 
     if(this._focal != null) builder.append("_focal" + "->" + this._focal.toString() + "\n"); 
     if(this.coverage != null) builder.append("coverage" + "->" + this.coverage.toString() + "\n"); 
     if(this.businessArrangement != null) builder.append("businessArrangement" + "->" + this.businessArrangement.toString() + "\n"); 
     if(this._businessArrangement != null) builder.append("_businessArrangement" + "->" + this._businessArrangement.toString() + "\n"); 
     if(this.preAuthRef != null) builder.append("preAuthRef" + "->" + this.preAuthRef.toString() + "\n"); 
     if(this._preAuthRef != null) builder.append("_preAuthRef" + "->" + this._preAuthRef.toString() + "\n"); 
     if(this.claimResponse != null) builder.append("claimResponse" + "->" + this.claimResponse.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}