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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "This resource provides the adjudication details from the processing of a Claim resource."
*/
@Entity
@Table(name="claimresponseinsurance")
public class ClaimResponseInsuranceModel  implements Serializable {
	private static final long serialVersionUID = 151873631153183957L;
  /**
  * Description: "A service line item."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated."
  */
  @javax.persistence.Basic
  @Column(name="\"focal\"")
  private Boolean focal;

  /**
  * Description: "Reference to the program or plan identification, underwriter or payor."
  */
  @javax.persistence.Basic
  @Column(name="\"coverage_id\"")
  private String coverage_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="coverage_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> coverage;

  /**
  * Description: "The contract number of a business agreement which describes the terms and conditions."
  */
  @javax.persistence.Basic
  @Column(name="\"businessArrangement\"")
  private String businessArrangement;

  /**
  * Description: "A list of references from the Insurer to which these services pertain."
  */
  @javax.persistence.Basic
  @Column(name="\"preAuthRef\"")
  private String preAuthRef;

  /**
  * Description: "The Coverages adjudication details."
  */
  @javax.persistence.Basic
  @Column(name="\"claimresponse_id\"")
  private String claimresponse_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="claimresponse_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> claimResponse;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public ClaimResponseInsuranceModel() {
  }

  public ClaimResponseInsuranceModel(ClaimResponseInsurance o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.sequence = o.getSequence();
    this.focal = o.getFocal();
    if (null != o.getCoverage() ) {
    	this.coverage_id = "coverage" + this.parent_id;
    	this.coverage = ReferenceHelper.toModel(o.getCoverage(), this.coverage_id);
    }
    this.businessArrangement = o.getBusinessArrangement();
    this.preAuthRef = org.fhir.utils.JsonUtils.write2String(o.getPreAuthRef());
    if (null != o.getClaimResponse() ) {
    	this.claimresponse_id = "claimresponse" + this.parent_id;
    	this.claimResponse = ReferenceHelper.toModel(o.getClaimResponse(), this.claimresponse_id);
    }
  }

  public Float getSequence() {
    return this.sequence;
  }
  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Boolean getFocal() {
    return this.focal;
  }
  public void setFocal( Boolean value) {
    this.focal = value;
  }
  public java.util.List<ReferenceModel> getCoverage() {
    return this.coverage;
  }
  public void setCoverage( java.util.List<ReferenceModel> value) {
    this.coverage = value;
  }
  public String getBusinessArrangement() {
    return this.businessArrangement;
  }
  public void setBusinessArrangement( String value) {
    this.businessArrangement = value;
  }
  public String getPreAuthRef() {
    return this.preAuthRef;
  }
  public void setPreAuthRef( String value) {
    this.preAuthRef = value;
  }
  public java.util.List<ReferenceModel> getClaimResponse() {
    return this.claimResponse;
  }
  public void setClaimResponse( java.util.List<ReferenceModel> value) {
    this.claimResponse = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseInsuranceModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("focal" + "->" + this.focal + "\n"); 
     builder.append("businessArrangement" + "->" + this.businessArrangement + "\n"); 
     builder.append("preAuthRef" + "->" + this.preAuthRef + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimResponseInsuranceModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("focal" + "->" + this.focal + "\n"); 
     builder.append("coverage" + "->" + this.coverage + "\n"); 
     builder.append("businessArrangement" + "->" + this.businessArrangement + "\n"); 
     builder.append("preAuthRef" + "->" + this.preAuthRef + "\n"); 
     builder.append("claimResponse" + "->" + this.claimResponse + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}