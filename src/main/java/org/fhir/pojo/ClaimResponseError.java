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
public class ClaimResponseError  extends BackboneElement  {
  /**
  * Description: "The sequence number of the line item submitted which contains the error. This value is omitted when the error is elsewhere."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float sequenceLinkId;

  /**
  * Description: "Extensions for sequenceLinkId"
  */
  protected transient Element _sequenceLinkId;

  /**
  * Description: "The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float detailSequenceLinkId;

  /**
  * Description: "Extensions for detailSequenceLinkId"
  */
  protected transient Element _detailSequenceLinkId;

  /**
  * Description: "The sequence number of the addition within the line item submitted which contains the error. This value is omitted when the error is not related to an Addition."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float subdetailSequenceLinkId;

  /**
  * Description: "Extensions for subdetailSequenceLinkId"
  */
  protected transient Element _subdetailSequenceLinkId;

  /**
  * Description: "An error code,from a specified code system, which details why the claim could not be adjudicated."
  */
  @javax.validation.constraints.NotNull
  protected CodeableConcept code;

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
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); ;
    return builder.toString();
  }


}