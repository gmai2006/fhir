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
/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
@Entity
@Table(name="claiminformation")
public class ClaimInformationModel  implements Serializable {
	private static final long serialVersionUID = 151857669695333305L;
  /**
  * Description: "Sequence of the information element which serves to provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "The general class of the information supplied: information; exception; accident, employment; onset, etc."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "The date when or period to which this information refers."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"timingDate\"")
  private String timingDate;

  /**
  * Description: "The date when or period to which this information refers."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timingPeriod\"", length = 16777215)
  private String timingPeriod;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  */
  @javax.persistence.Basic
  @Column(name="\"valueString\"")
  private String valueString;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueQuantity\"", length = 16777215)
  private String valueQuantity;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueAttachment\"", length = 16777215)
  private String valueAttachment;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  */
  @javax.persistence.Basic
  @Column(name="\"valuereference_id\"")
  private String valuereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valuereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> valueReference;

  /**
  * Description: "For example, provides the reason for: the additional stay, or missing tooth or any other situation where a reason code is required in addition to the content."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

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

  public ClaimInformationModel() {
  }

  public ClaimInformationModel(ClaimInformation o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.sequence = o.getSequence();
    this.category = CodeableConceptHelper.toJson(o.getCategory());
    this.code = CodeableConceptHelper.toJson(o.getCode());
    this.timingDate = o.getTimingDate();
    this.timingPeriod = PeriodHelper.toJson(o.getTimingPeriod());
    this.valueString = o.getValueString();
    this.valueQuantity = QuantityHelper.toJson(o.getValueQuantity());
    this.valueAttachment = AttachmentHelper.toJson(o.getValueAttachment());
    if (null != o.getValueReference() ) {
    	this.valuereference_id = "valuereference" + this.parent_id;
    	this.valueReference = ReferenceHelper.toModel(o.getValueReference(), this.valuereference_id);
    }
    this.reason = CodeableConceptHelper.toJson(o.getReason());
  }

  public Float getSequence() {
    return this.sequence;
  }
  public void setSequence( Float value) {
    this.sequence = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getTimingDate() {
    return this.timingDate;
  }
  public void setTimingDate( String value) {
    this.timingDate = value;
  }
  public String getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setTimingPeriod( String value) {
    this.timingPeriod = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueQuantity( String value) {
    this.valueQuantity = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public java.util.List<ReferenceModel> getValueReference() {
    return this.valueReference;
  }
  public void setValueReference( java.util.List<ReferenceModel> value) {
    this.valueReference = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setReason( String value) {
    this.reason = value;
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
    builder.append("[ClaimInformationModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("timingDate" + "->" + this.timingDate + "\n"); 
     builder.append("timingPeriod" + "->" + this.timingPeriod + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueQuantity" + "->" + this.valueQuantity + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ClaimInformationModel]:" + "\n");
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("timingDate" + "->" + this.timingDate + "\n"); 
     builder.append("timingPeriod" + "->" + this.timingPeriod + "\n"); 
     builder.append("valueString" + "->" + this.valueString + "\n"); 
     builder.append("valueQuantity" + "->" + this.valueQuantity + "\n"); 
     builder.append("valueAttachment" + "->" + this.valueAttachment + "\n"); 
     builder.append("valueReference" + "->" + this.valueReference + "\n"); 
     builder.append("reason" + "->" + this.reason + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}