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
import org.fhir.entity.ClaimResponseErrorModel;
import com.google.gson.GsonBuilder;

/**
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
public class ClaimResponseError  {
  /**
  * Description: "The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float sequenceLinkId;

  /**
  * Description: "Extensions for sequenceLinkId"
  */
  private transient Element _sequenceLinkId;

  /**
  * Description: "The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float detailSequenceLinkId;

  /**
  * Description: "Extensions for detailSequenceLinkId"
  */
  private transient Element _detailSequenceLinkId;

  /**
  * Description: "The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float subdetailSequenceLinkId;

  /**
  * Description: "Extensions for subdetailSequenceLinkId"
  */
  private transient Element _subdetailSequenceLinkId;

  /**
  * Description: "An error code,from a specified code system, which details why the claim could not be adjudicated."
  */
  @javax.validation.constraints.NotNull
  private CodeableConcept code;

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

  public ClaimResponseError() {
  }

  public ClaimResponseError(ClaimResponseErrorModel o) {
    this.id = o.getId();
    if (null != o.getSequenceLinkId()) {
      this.sequenceLinkId = o.getSequenceLinkId();
    }
    if (null != o.getDetailSequenceLinkId()) {
      this.detailSequenceLinkId = o.getDetailSequenceLinkId();
    }
    if (null != o.getSubdetailSequenceLinkId()) {
      this.subdetailSequenceLinkId = o.getSubdetailSequenceLinkId();
    }
    this.code = CodeableConceptHelper.fromJson(o.getCode());
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setSequenceLinkId( Float value) {
    this.sequenceLinkId = value;
  }
  public Float getSequenceLinkId() {
    return this.sequenceLinkId;
  }
  public void set_sequenceLinkId( Element value) {
    this._sequenceLinkId = value;
  }
  public Element get_sequenceLinkId() {
    return this._sequenceLinkId;
  }
  public void setDetailSequenceLinkId( Float value) {
    this.detailSequenceLinkId = value;
  }
  public Float getDetailSequenceLinkId() {
    return this.detailSequenceLinkId;
  }
  public void set_detailSequenceLinkId( Element value) {
    this._detailSequenceLinkId = value;
  }
  public Element get_detailSequenceLinkId() {
    return this._detailSequenceLinkId;
  }
  public void setSubdetailSequenceLinkId( Float value) {
    this.subdetailSequenceLinkId = value;
  }
  public Float getSubdetailSequenceLinkId() {
    return this.subdetailSequenceLinkId;
  }
  public void set_subdetailSequenceLinkId( Element value) {
    this._subdetailSequenceLinkId = value;
  }
  public Element get_subdetailSequenceLinkId() {
    return this._subdetailSequenceLinkId;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
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
    builder.append("[ClaimResponseError]:" + "\n");
     if(this.sequenceLinkId != null) builder.append("sequenceLinkId" + "->" + this.sequenceLinkId.toString() + "\n"); 
     if(this._sequenceLinkId != null) builder.append("_sequenceLinkId" + "->" + this._sequenceLinkId.toString() + "\n"); 
     if(this.detailSequenceLinkId != null) builder.append("detailSequenceLinkId" + "->" + this.detailSequenceLinkId.toString() + "\n"); 
     if(this._detailSequenceLinkId != null) builder.append("_detailSequenceLinkId" + "->" + this._detailSequenceLinkId.toString() + "\n"); 
     if(this.subdetailSequenceLinkId != null) builder.append("subdetailSequenceLinkId" + "->" + this.subdetailSequenceLinkId.toString() + "\n"); 
     if(this._subdetailSequenceLinkId != null) builder.append("_subdetailSequenceLinkId" + "->" + this._subdetailSequenceLinkId.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}