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
* "A sample to be used for analysis."
*/
@Entity
@Table(name="specimencontainer")
public class SpecimenContainerModel  implements Serializable {
	private static final long serialVersionUID = 151857669699933259L;
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
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The capacity (volume or other measure) the container may contain."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"capacity\"", length = 16777215)
  private String capacity;

  /**
  * Description: "The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"specimenQuantity\"", length = 16777215)
  private String specimenQuantity;

  /**
  * Description: "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"additiveCodeableConcept\"", length = 16777215)
  private String additiveCodeableConcept;

  /**
  * Description: "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA."
  */
  @javax.persistence.Basic
  @Column(name="\"additivereference_id\"")
  private String additivereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="additivereference_id", insertable=false, updatable=false)
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
  @Column(name="\"parent_id\"")
  private String parent_id;

  public SpecimenContainerModel() {
  }

  public SpecimenContainerModel(SpecimenContainer o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.description = o.getDescription();
    this.type = CodeableConceptHelper.toJson(o.getType());
    this.capacity = QuantityHelper.toJson(o.getCapacity());
    this.specimenQuantity = QuantityHelper.toJson(o.getSpecimenQuantity());
    this.additiveCodeableConcept = CodeableConceptHelper.toJson(o.getAdditiveCodeableConcept());
    if (null != o.getAdditiveReference() ) {
    	this.additivereference_id = "additivereference" + this.parent_id;
    	this.additiveReference = ReferenceHelper.toModel(o.getAdditiveReference(), this.additivereference_id);
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
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getCapacity() {
    return this.capacity;
  }
  public void setCapacity( String value) {
    this.capacity = value;
  }
  public String getSpecimenQuantity() {
    return this.specimenQuantity;
  }
  public void setSpecimenQuantity( String value) {
    this.specimenQuantity = value;
  }
  public String getAdditiveCodeableConcept() {
    return this.additiveCodeableConcept;
  }
  public void setAdditiveCodeableConcept( String value) {
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
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SpecimenContainerModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("capacity" + "->" + this.capacity + "\n"); 
     builder.append("specimenQuantity" + "->" + this.specimenQuantity + "\n"); 
     builder.append("additiveCodeableConcept" + "->" + this.additiveCodeableConcept + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SpecimenContainerModel]:" + "\n");
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("capacity" + "->" + this.capacity + "\n"); 
     builder.append("specimenQuantity" + "->" + this.specimenQuantity + "\n"); 
     builder.append("additiveCodeableConcept" + "->" + this.additiveCodeableConcept + "\n"); 
     builder.append("additiveReference" + "->" + this.additiveReference + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}