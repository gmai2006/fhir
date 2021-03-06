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
* generated on 07/14/2018
*/
@Entity
@Table(name="specimencontainer")
public class SpecimenContainerModel  implements Serializable {
	private static final long serialVersionUID = 153159210211667457L;
  /**
  * Description: "Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Textual description of the container."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "The type of container associated with the specimen (e.g. slide, aliquot, etc.)."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "The capacity (volume or other measure) the container may contain."
  */
  @javax.persistence.Basic
  @Column(name="\"capacity_id\"")
  private String capacity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="capacity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> capacity;

  /**
  * Description: "The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type."
  */
  @javax.persistence.Basic
  @Column(name="\"specimenquantity_id\"")
  private String specimenquantity_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="specimenquantity_id", insertable=false, updatable=false)
  private java.util.List<QuantityModel> specimenQuantity;

  /**
  * Description: "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA."
  */
  @javax.persistence.Basic
  @Column(name="\"additivecodeableconcept_id\"")
  private String additivecodeableconcept_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="additivecodeableconcept_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> additiveCodeableConcept;

  /**
  * Description: "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA."
  */
  @javax.persistence.Basic
  @Column(name="\"additivereference_id\"")
  private String additivereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="additivereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> additiveReference;

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

  public SpecimenContainerModel() {
  }

  public SpecimenContainerModel(SpecimenContainer o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.description = o.getDescription();
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getCapacity() ) {
    	this.capacity_id = "capacity" + this.id;
    	this.capacity = QuantityHelper.toModel(o.getCapacity(), this.capacity_id);
    }
    if (null != o.getSpecimenQuantity() ) {
    	this.specimenquantity_id = "specimenquantity" + this.id;
    	this.specimenQuantity = QuantityHelper.toModel(o.getSpecimenQuantity(), this.specimenquantity_id);
    }
    if (null != o.getAdditiveCodeableConcept() ) {
    	this.additivecodeableconcept_id = "additivecodeableconcept" + this.id;
    	this.additiveCodeableConcept = CodeableConceptHelper.toModel(o.getAdditiveCodeableConcept(), this.additivecodeableconcept_id);
    }
    if (null != o.getAdditiveReference() ) {
    	this.additivereference_id = "additivereference" + this.id;
    	this.additiveReference = ReferenceHelper.toModel(o.getAdditiveReference(), this.additivereference_id);
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
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<QuantityModel> getCapacity() {
    return this.capacity;
  }
  public void setCapacity( java.util.List<QuantityModel> value) {
    this.capacity = value;
  }
  public java.util.List<QuantityModel> getSpecimenQuantity() {
    return this.specimenQuantity;
  }
  public void setSpecimenQuantity( java.util.List<QuantityModel> value) {
    this.specimenQuantity = value;
  }
  public java.util.List<CodeableConceptModel> getAdditiveCodeableConcept() {
    return this.additiveCodeableConcept;
  }
  public void setAdditiveCodeableConcept( java.util.List<CodeableConceptModel> value) {
    this.additiveCodeableConcept = value;
  }
  public java.util.List<ReferenceModel> getAdditiveReference() {
    return this.additiveReference;
  }
  public void setAdditiveReference( java.util.List<ReferenceModel> value) {
    this.additiveReference = value;
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
    builder.append("[SpecimenContainerModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SpecimenContainerModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}