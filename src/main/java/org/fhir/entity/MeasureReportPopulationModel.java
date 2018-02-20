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
* "The MeasureReport resource contains the results of evaluating a measure."
*/
@Entity
@Table(name="measurereportpopulation")
public class MeasureReportPopulationModel  implements Serializable {
	private static final long serialVersionUID = 151910893739218941L;
  /**
  * Description: "The identifier of the population being reported, as defined by the population element of the measure."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The type of the population."
  */
  @javax.persistence.Basic
  @Column(name="\"code_id\"")
  private String code_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="code_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> code;

  /**
  * Description: "The number of members of the population."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"count\"")
  private Float count;

  /**
  * Description: "This element refers to a List of patient level MeasureReport resources, one for each patient in this population."
  */
  @javax.persistence.Basic
  @Column(name="\"patients_id\"")
  private String patients_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="patients_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patients;

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

  public MeasureReportPopulationModel() {
  }

  public MeasureReportPopulationModel(MeasureReportPopulation o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getCode() ) {
    	this.code_id = "code" + this.parent_id;
    	this.code = CodeableConceptHelper.toModel(o.getCode(), this.code_id);
    }
    this.count = o.getCount();
    if (null != o.getPatients() ) {
    	this.patients_id = "patients" + this.parent_id;
    	this.patients = ReferenceHelper.toModel(o.getPatients(), this.patients_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public java.util.List<CodeableConceptModel> getCode() {
    return this.code;
  }
  public void setCode( java.util.List<CodeableConceptModel> value) {
    this.code = value;
  }
  public Float getCount() {
    return this.count;
  }
  public void setCount( Float value) {
    this.count = value;
  }
  public java.util.List<ReferenceModel> getPatients() {
    return this.patients;
  }
  public void setPatients( java.util.List<ReferenceModel> value) {
    this.patients = value;
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
    builder.append("[MeasureReportPopulationModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("count" + "->" + this.count + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MeasureReportPopulationModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("code" + "->" + this.code + "\n"); 
     builder.append("count" + "->" + this.count + "\n"); 
     builder.append("patients" + "->" + this.patients + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}