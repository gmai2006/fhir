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
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
@Entity
@Table(name="consentexcept")
public class ConsentExceptModel  {
  /**
  * Description: "Action  to take - permit or deny - when the exception conditions are met."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "The timeframe in this exception is valid."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "Who or what is controlled by this Exception. Use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ConsentActor1Model> actor = new java.util.ArrayList<>();

  /**
  * Description: "Actions controlled by this Exception."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"action\"", length = 16777215)
  private String action;

  /**
  * Description: "A set of security labels that define which resources are controlled by this exception. If more than one label is specified, all resources must have all the specified labels."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"securityLabel\"", length = 16777215)
  private String securityLabel;

  /**
  * Description: "The context of the activities a user is taking - why the user is accessing the data - that are controlled by this exception."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"purpose\"", length = 16777215)
  private String purpose;

  /**
  * Description: "The class of information covered by this exception. The type can be a FHIR resource type, a profile on a type, or a CDA document, or some other type that indicates what sort of information the consent relates to."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"FHIRclass\"", length = 16777215)
  private String FHIRclass;

  /**
  * Description: "If this code is found in an instance, then the exception applies."
  * Actual type: Array of Coding-> List<Coding>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"code\"", length = 16777215)
  private String code;

  /**
  * Description: "Clinical or Operational Relevant period of time that bounds the data controlled by this exception."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dataPeriod\"", length = 16777215)
  private String dataPeriod;

  /**
  * Description: "The resources controlled by this exception, if specific resources are referenced."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ConsentData1Model> data = new java.util.ArrayList<>();

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

  public ConsentExceptModel() {
  }

  public ConsentExceptModel(ConsentExcept o) {
    this.id = o.getId();
      this.type = o.getType();

      this.period = Period.toJson(o.getPeriod());
      this.actor = ConsentActor1.toModelArray(o.getActor());

      this.action = CodeableConcept.toJson(o.getAction());
      this.securityLabel = Coding.toJson(o.getSecurityLabel());
      this.purpose = Coding.toJson(o.getPurpose());
      this.FHIRclass = Coding.toJson(o.getFHIRclass());
      this.code = Coding.toJson(o.getCode());
      this.dataPeriod = Period.toJson(o.getDataPeriod());
      this.data = ConsentData1.toModelArray(o.getData());

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setActor( java.util.List<ConsentActor1Model> value) {
    this.actor = value;
  }
  public java.util.List<ConsentActor1Model> getActor() {
    return this.actor;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setSecurityLabel( String value) {
    this.securityLabel = value;
  }
  public String getSecurityLabel() {
    return this.securityLabel;
  }
  public void setPurpose( String value) {
    this.purpose = value;
  }
  public String getPurpose() {
    return this.purpose;
  }
  public void setFHIRclass( String value) {
    this.FHIRclass = value;
  }
  public String getFHIRclass() {
    return this.FHIRclass;
  }
  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void setDataPeriod( String value) {
    this.dataPeriod = value;
  }
  public String getDataPeriod() {
    return this.dataPeriod;
  }
  public void setData( java.util.List<ConsentData1Model> value) {
    this.data = value;
  }
  public java.util.List<ConsentData1Model> getData() {
    return this.data;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("actor" + "[" + String.valueOf(this.actor) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("securityLabel" + "[" + String.valueOf(this.securityLabel) + "]\n"); 
     builder.append("purpose" + "[" + String.valueOf(this.purpose) + "]\n"); 
     builder.append("FHIRclass" + "[" + String.valueOf(this.FHIRclass) + "]\n"); 
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("dataPeriod" + "[" + String.valueOf(this.dataPeriod) + "]\n"); 
     builder.append("data" + "[" + String.valueOf(this.data) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}