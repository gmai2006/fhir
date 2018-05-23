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
* "A sample to be used for analysis."
*/
@Entity
@Table(name="specimenprocessing")
public class SpecimenProcessingModel  implements Serializable {
	private static final long serialVersionUID = 151967883224542794L;
  /**
  * Description: "Textual description of procedure."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "A coded value specifying the procedure used to process the specimen."
  */
  @javax.persistence.Basic
  @Column(name="\"procedure_id\"")
  private String procedure_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="procedure_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> procedure;

  /**
  * Description: "Material used in the processing step."
  */
  @javax.persistence.Basic
  @Column(name="\"additive_id\"")
  private String additive_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="additive_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> additive;

  /**
  * Description: "A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"timeDateTime\"")
  private String timeDateTime;

  /**
  * Description: "A record of the time or period when the specimen processing occurred.  For example the time of sample fixation or the period of time the sample was in formalin."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"timePeriod\"", length = 16777215)
  private String timePeriod;

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

  public SpecimenProcessingModel() {
  }

  public SpecimenProcessingModel(SpecimenProcessing o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.description = o.getDescription();
    if (null != o.getProcedure() ) {
    	this.procedure_id = "procedure" + this.id;
    	this.procedure = CodeableConceptHelper.toModel(o.getProcedure(), this.procedure_id);
    }
    if (null != o.getAdditive() && !o.getAdditive().isEmpty()) {
    	this.additive_id = "additive" + this.id;
    	this.additive = ReferenceHelper.toModelFromArray(o.getAdditive(), this.additive_id);
    }
    this.timeDateTime = o.getTimeDateTime();
    if (null != o.getTimePeriod()) {
    	this.timePeriod = JsonUtils.toJson(o.getTimePeriod());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<CodeableConceptModel> getProcedure() {
    return this.procedure;
  }
  public void setProcedure( java.util.List<CodeableConceptModel> value) {
    this.procedure = value;
  }
  public java.util.List<ReferenceModel> getAdditive() {
    return this.additive;
  }
  public void setAdditive( java.util.List<ReferenceModel> value) {
    this.additive = value;
  }
  public String getTimeDateTime() {
    return this.timeDateTime;
  }
  public void setTimeDateTime( String value) {
    this.timeDateTime = value;
  }
  public String getTimePeriod() {
    return this.timePeriod;
  }
  public void setTimePeriod( String value) {
    this.timePeriod = value;
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
    builder.append("[SpecimenProcessingModel]:" + "\n");
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("timeDateTime" + "->" + this.timeDateTime + "\n"); 
     builder.append("timePeriod" + "->" + this.timePeriod + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SpecimenProcessingModel]:" + "\n");
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("procedure" + "->" + this.procedure + "\n"); 
     builder.append("additive" + "->" + this.additive + "\n"); 
     builder.append("timeDateTime" + "->" + this.timeDateTime + "\n"); 
     builder.append("timePeriod" + "->" + this.timePeriod + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}