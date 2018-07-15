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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class ClaimInsurance  extends BackboneElement  {
  /**
  * Description: "Sequence of coverage which serves to provide a link and convey coordination of benefit order."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float sequence;

  /**
  * Description: "Extensions for sequence"
  */
  protected transient Element _sequence;

  /**
  * Description: "A flag to indicate that this Coverage is the focus for adjudication. The Coverage against which the claim is to be adjudicated."
  */
  protected Boolean focal;

  /**
  * Description: "Extensions for focal"
  */
  protected transient Element _focal;

  /**
  * Description: "Reference to the program or plan identification, underwriter or payor."
  */
  @javax.validation.constraints.NotNull
  protected Reference coverage;

  /**
  * Description: "The contract number of a business agreement which describes the terms and conditions."
  */
  protected String businessArrangement;

  /**
  * Description: "Extensions for businessArrangement"
  */
  protected transient Element _businessArrangement;

  /**
  * Description: "A list of references from the Insurer to which these services pertain."
  */
  protected java.util.List<String> preAuthRef;

  /**
  * Description: "Extensions for preAuthRef"
  */
  protected transient java.util.List<Element> _preAuthRef;

  /**
  * Description: "The Coverages adjudication details."
  */
  protected Reference claimResponse;

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
     if(this.claimResponse != null) builder.append("claimResponse" + "->" + this.claimResponse.toString() + "\n"); ;
    return builder.toString();
  }


}