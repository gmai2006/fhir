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
* "Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions."
* generated on 07/14/2018
*/
@Entity
@Table(name="careplanactivity")
public class CarePlanActivityModel  implements Serializable {
	private static final long serialVersionUID = 153159210205264762L;
  /**
  * Description: "Identifies the outcome at the point when the status of the activity is assessed.  For example, the outcome of an education activity could be patient understands (or not)."
  */
  @javax.persistence.Basic
  @Column(name="\"outcomecodeableconcept_id\"")
  private String outcomecodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="outcomecodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> outcomeCodeableConcept;

  /**
  * Description: "Details of the outcome or action resulting from the activity.  The reference to an \"event\" resource, such as Procedure or Encounter or Observation, is the result/outcome of the activity itself.  The activity can be conveyed using CarePlan.activity.detail OR using the CarePlan.activity.reference (a reference to a “request” resource)."
  */
  @javax.persistence.Basic
  @Column(name="\"outcomereference_id\"")
  private String outcomereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="outcomereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> outcomeReference;

  /**
  * Description: "Notes about the adherence/status/progress of the activity."
  * Actual type: List<String>;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reference;

  /**
  * Description: "A simple summary of a planned activity suitable for a general care plan system (e.g. form driven) that doesn't know about specific resources such as procedure etc."
  */
  @javax.persistence.Basic
  @Column(name="\"detail_id\"")
  private String detail_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="detail_id", insertable=false, updatable=false)
  private java.util.List<CarePlanDetailModel> detail;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public CarePlanActivityModel() {
  }

  public CarePlanActivityModel(CarePlanActivity o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getOutcomeCodeableConcept() && !o.getOutcomeCodeableConcept().isEmpty()) {
    	this.outcomecodeableconcept_id = "outcomecodeableconcept" + this.id;
    	this.outcomeCodeableConcept = CodeableConceptHelper.toModelFromArray(o.getOutcomeCodeableConcept(), this.outcomecodeableconcept_id);
    }
    if (null != o.getOutcomeReference() && !o.getOutcomeReference().isEmpty()) {
    	this.outcomereference_id = "outcomereference" + this.id;
    	this.outcomeReference = ReferenceHelper.toModelFromArray(o.getOutcomeReference(), this.outcomereference_id);
    }
    if (null != o.getProgress()) {
    	this.progress = JsonUtils.toJson(o.getProgress());
    }
    if (null != o.getReference() ) {
    	this.reference_id = "reference" + this.id;
    	this.reference = ReferenceHelper.toModel(o.getReference(), this.reference_id);
    }
    if (null != o.getDetail() ) {
    	this.detail_id = "detail" + this.id;
    	this.detail = CarePlanDetailHelper.toModel(o.getDetail(), this.detail_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getOutcomeCodeableConcept() {
    return this.outcomeCodeableConcept;
  }
  public void setOutcomeCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.outcomeCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getOutcomeReference() {
    return this.outcomeReference;
  }
  public void setOutcomeReference( java.util.List<ReferenceModel> value) {
    this.outcomeReference = value;
  }
  public String getProgress() {
    return this.progress;
  }
  public void setProgress( String value) {
    this.progress = value;
  }
  public java.util.List<ReferenceModel> getReference() {
    return this.reference;
  }
  public void setReference( java.util.List<ReferenceModel> value) {
    this.reference = value;
  }
  public java.util.List<CarePlanDetailModel> getDetail() {
    return this.detail;
  }
  public void setDetail( java.util.List<CarePlanDetailModel> value) {
    this.detail = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CarePlanActivityModel]:" + "\n");
     builder.append("progress" + "->" + this.progress + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CarePlanActivityModel]:" + "\n");
     builder.append("progress" + "->" + this.progress + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}