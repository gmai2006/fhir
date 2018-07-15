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
* "This resource allows for the definition of various types of plans as a sharable, consumable, and executable artifact. The resource is general enough to support the description of a broad range of clinical artifacts such as clinical decision support rules, order sets and protocols."
* generated on 07/14/2018
*/
@Entity
@Table(name="plandefinitiontarget")
public class PlanDefinitionTargetModel  implements Serializable {
	private static final long serialVersionUID = 153159210214923985L;
  /**
  * Description: "The parameter whose value is to be tracked, e.g. body weigth, blood pressure, or hemoglobin A1c level."
  */
  @javax.persistence.Basic
  @Column(name="\"measure_id\"")
  private String measure_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="measure_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> measure;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  */
  @javax.persistence.Basic
  @Column(name="\"detailquantity_id\"")
  private String detailquantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="detailquantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> detailQuantity;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"detailRange\"", length = 16777215)
  private String detailRange;

  /**
  * Description: "The target value of the measure to be achieved to signify fulfillment of the goal, e.g. 150 pounds or 7.0%. Either the high or low or both values of the range can be specified. Whan a low value is missing, it indicates that the goal is achieved at any value at or below the high value. Similarly, if the high value is missing, it indicates that the goal is achieved at any value at or above the low value."
  */
  @javax.persistence.Basic
  @Column(name="\"detailcodeableconcept_id\"")
  private String detailcodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="detailcodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> detailCodeableConcept;

  /**
  * Description: "Indicates the timeframe after the start of the goal in which the goal should be met."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"due\"", length = 16777215)
  private String due;

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

  public PlanDefinitionTargetModel() {
  }

  public PlanDefinitionTargetModel(PlanDefinitionTarget o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getMeasure() ) {
    	this.measure_id = "measure" + this.id;
    	this.measure = CodeableConceptHelper.toModel(o.getMeasure(), this.measure_id);
    }
    if (null != o.getDetailQuantity() ) {
    	this.detailquantity_id = "detailquantity" + this.id;
    	this.detailQuantity = QuantityHelper.toModel(o.getDetailQuantity(), this.detailquantity_id);
    }
    if (null != o.getDetailRange()) {
    	this.detailRange = JsonUtils.toJson(o.getDetailRange());
    }
    if (null != o.getDetailCodeableConcept() ) {
    	this.detailcodeableconcept_id = "detailcodeableconcept" + this.id;
    	this.detailCodeableConcept = CodeableConceptHelper.toModel(o.getDetailCodeableConcept(), this.detailcodeableconcept_id);
    }
    if (null != o.getDue()) {
    	this.due = JsonUtils.toJson(o.getDue());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getMeasure() {
    return this.measure;
  }
  public void setMeasure( java.util.List<CodeableConceptModel> value) {
    this.measure = value;
  }
  public java.util.List<QuantityModel> getDetailQuantity() {
    return this.detailQuantity;
  }
  public void setDetailQuantity( java.util.List<QuantityModel> value) {
    this.detailQuantity = value;
  }
  public String getDetailRange() {
    return this.detailRange;
  }
  public void setDetailRange( String value) {
    this.detailRange = value;
  }
  public java.util.List<CodeableConceptModel> getDetailCodeableConcept() {
    return this.detailCodeableConcept;
  }
  public void setDetailCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.detailCodeableConcept = value;
  }
  public String getDue() {
    return this.due;
  }
  public void setDue( String value) {
    this.due = value;
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
    builder.append("[PlanDefinitionTargetModel]:" + "\n");
     builder.append("detailRange" + "->" + this.detailRange + "\n"); 
     builder.append("due" + "->" + this.due + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PlanDefinitionTargetModel]:" + "\n");
     builder.append("detailRange" + "->" + this.detailRange + "\n"); 
     builder.append("due" + "->" + this.due + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}