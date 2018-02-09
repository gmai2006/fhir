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

/**
* "A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery."
*/
@Entity
@Table(name="claiminformation")
public class ClaimInformationModel  {
  /**
  * Description: "Sequence of the information element which serves to provide a link."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private Float sequence;

  /**
  * Description: "The general class of the information supplied: information; exception; accident, employment; onset, etc."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"category\"", length = 16777215)
  private String category;

  /**
  * Description: "System and code pertaining to the specific information regarding special conditions relating to the setting, treatment or patient  for which care is sought which may influence the adjudication."
  * Actual type: CodeableConcept
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
  * Actual type: Period
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
  * Actual type: Quantity
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"valueQuantity\"", length = 16777215)
  private String valueQuantity;

  /**
  * Description: "Additional data or information such as resources, documents, images etc. including references to the data or the actual inclusion of the data."
  * Actual type: Attachment
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`valuereference_id`", insertable=false, updatable=false)
  private ReferenceModel valueReference;

  /**
  * Description: "For example, provides the reason for: the additional stay, or missing tooth or any other situation where a reason code is required in addition to the content."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"reason\"", length = 16777215)
  private String reason;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
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
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public ClaimInformationModel() {
  }

  public ClaimInformationModel(ClaimInformation o) {
    this.id = o.getId();
      this.sequence = o.getSequence();

      this.category = CodeableConcept.toJson(o.getCategory());
      this.code = CodeableConcept.toJson(o.getCode());
      this.timingDate = o.getTimingDate();

      this.timingPeriod = Period.toJson(o.getTimingPeriod());
      this.valueString = o.getValueString();

      this.valueQuantity = Quantity.toJson(o.getValueQuantity());
      this.valueAttachment = Attachment.toJson(o.getValueAttachment());
      if (null != o.getValueReference()) {
      	this.valuereference_id = "valueReference" + this.getId();
        this.valueReference = new ReferenceModel(o.getValueReference());
        this.valueReference.setId(this.valuereference_id);
        this.valueReference.parent_id = this.valueReference.getId();
      }

      this.reason = CodeableConcept.toJson(o.getReason());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setSequence( Float value) {
    this.sequence = value;
  }
  public Float getSequence() {
    return this.sequence;
  }
  public void setCategory( String value) {
    this.category = value;
  }
  public String getCategory() {
    return this.category;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setTimingDate( String value) {
    this.timingDate = value;
  }
  public String getTimingDate() {
    return this.timingDate;
  }
  public void setTimingPeriod( String value) {
    this.timingPeriod = value;
  }
  public String getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setValueString( String value) {
    this.valueString = value;
  }
  public String getValueString() {
    return this.valueString;
  }
  public void setValueQuantity( String value) {
    this.valueQuantity = value;
  }
  public String getValueQuantity() {
    return this.valueQuantity;
  }
  public void setValueAttachment( String value) {
    this.valueAttachment = value;
  }
  public String getValueAttachment() {
    return this.valueAttachment;
  }
  public void setValueReference( ReferenceModel value) {
    this.valueReference = value;
  }
  public ReferenceModel getValueReference() {
    return this.valueReference;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("timingDate" + "[" + String.valueOf(this.timingDate) + "]\n"); 
     builder.append("timingPeriod" + "[" + String.valueOf(this.timingPeriod) + "]\n"); 
     builder.append("valueString" + "[" + String.valueOf(this.valueString) + "]\n"); 
     builder.append("valueQuantity" + "[" + String.valueOf(this.valueQuantity) + "]\n"); 
     builder.append("valueAttachment" + "[" + String.valueOf(this.valueAttachment) + "]\n"); 
     builder.append("valueReference" + "[" + String.valueOf(this.valueReference) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}