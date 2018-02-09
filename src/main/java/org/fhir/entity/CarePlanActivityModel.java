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
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
*/
@Entity
@Table(name="careplanactivity")
public class CarePlanActivityModel  {
  /**
  * Description: "Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not)."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"outcomeCodeableConcept\"", length = 16777215)
  private String outcomeCodeableConcept;

  /**
  * Description: "Details of the outcome or action resulting from the activity.  The reference to an \"event\" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> outcomeReference = new java.util.ArrayList<>();

  /**
  * Description: "Notes about the adherence/status/progress of the activity."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"progress\"", length = 16777215)
  private String progress;

  /**
  * Description: "The details of the proposed activity represented in a specific resource."
  */
  @javax.persistence.Basic
  @Column(name="\"reference_id\"")
  private String reference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`reference_id`", insertable=false, updatable=false)
  private ReferenceModel reference;

  /**
  * Description: "A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc."
  */
  @javax.persistence.Basic
  @Column(name="\"detail_id\"")
  private String detail_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`detail_id`", insertable=false, updatable=false)
  private CarePlanDetailModel detail;

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

  public CarePlanActivityModel() {
  }

  public CarePlanActivityModel(CarePlanActivity o) {
    this.id = o.getId();
      this.outcomeCodeableConcept = CodeableConcept.toJson(o.getOutcomeCodeableConcept());
      this.outcomeReference = Reference.toModelArray(o.getOutcomeReference());

      this.progress = Annotation.toJson(o.getProgress());
      if (null != o.getReference()) {
      	this.reference_id = "reference" + this.getId();
        this.reference = new ReferenceModel(o.getReference());
        this.reference.setId(this.reference_id);
        this.reference.parent_id = this.reference.getId();
      }

      if (null != o.getDetail()) {
      	this.detail_id = "detail" + this.getId();
        this.detail = new CarePlanDetailModel(o.getDetail());
        this.detail.setId(this.detail_id);
        this.detail.parent_id = this.detail.getId();
      }

      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setOutcomeCodeableConcept( String value) {
    this.outcomeCodeableConcept = value;
  }
  public String getOutcomeCodeableConcept() {
    return this.outcomeCodeableConcept;
  }
  public void setOutcomeReference( java.util.List<ReferenceModel> value) {
    this.outcomeReference = value;
  }
  public java.util.List<ReferenceModel> getOutcomeReference() {
    return this.outcomeReference;
  }
  public void setProgress( String value) {
    this.progress = value;
  }
  public String getProgress() {
    return this.progress;
  }
  public void setReference( ReferenceModel value) {
    this.reference = value;
  }
  public ReferenceModel getReference() {
    return this.reference;
  }
  public void setDetail( CarePlanDetailModel value) {
    this.detail = value;
  }
  public CarePlanDetailModel getDetail() {
    return this.detail;
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
     builder.append("outcomeCodeableConcept" + "[" + String.valueOf(this.outcomeCodeableConcept) + "]\n"); 
     builder.append("outcomeReference" + "[" + String.valueOf(this.outcomeReference) + "]\n"); 
     builder.append("progress" + "[" + String.valueOf(this.progress) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("detail" + "[" + String.valueOf(this.detail) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}