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

package org.fhir.pojo;
import org.fhir.entity.SpecimenContainerModel;
import com.google.gson.GsonBuilder;

/**
* "A sample to be used for analysis."
*/
public class SpecimenContainer  {
  /**
  * Description: "Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Textual description of the container."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The type of container associated with the specimen (e.g. slide, aliquot, etc.)."
  */
  private CodeableConcept type;

  /**
  * Description: "The capacity (volume or other measure) the container may contain."
  */
  private Quantity capacity;

  /**
  * Description: "The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type."
  */
  private Quantity specimenQuantity;

  /**
  * Description: "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA."
  */
  private CodeableConcept additiveCodeableConcept;

  /**
  * Description: "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA."
  */
  private Reference additiveReference;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public SpecimenContainer() {
  }

  public SpecimenContainer(SpecimenContainerModel o) {
    this.id = o.getId();
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    this.type = CodeableConceptHelper.fromJson(o.getType());
    this.capacity = QuantityHelper.fromJson(o.getCapacity());
    this.specimenQuantity = QuantityHelper.fromJson(o.getSpecimenQuantity());
    this.additiveCodeableConcept = CodeableConceptHelper.fromJson(o.getAdditiveCodeableConcept());
    if (null != o.getAdditiveReference() && !o.getAdditiveReference().isEmpty()) {
      this.additiveReference = new Reference(o.getAdditiveReference().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setCapacity( Quantity value) {
    this.capacity = value;
  }
  public Quantity getCapacity() {
    return this.capacity;
  }
  public void setSpecimenQuantity( Quantity value) {
    this.specimenQuantity = value;
  }
  public Quantity getSpecimenQuantity() {
    return this.specimenQuantity;
  }
  public void setAdditiveCodeableConcept( CodeableConcept value) {
    this.additiveCodeableConcept = value;
  }
  public CodeableConcept getAdditiveCodeableConcept() {
    return this.additiveCodeableConcept;
  }
  public void setAdditiveReference( Reference value) {
    this.additiveReference = value;
  }
  public Reference getAdditiveReference() {
    return this.additiveReference;
  }
  public void setModifierExtension( java.util.List<Extension> value) {
    this.modifierExtension = value;
  }
  public java.util.List<Extension> getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void set_id( Element value) {
    this._id = value;
  }
  public Element get_id() {
    return this._id;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SpecimenContainer]:" + "\n");
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.capacity != null) builder.append("capacity" + "->" + this.capacity.toString() + "\n"); 
     if(this.specimenQuantity != null) builder.append("specimenQuantity" + "->" + this.specimenQuantity.toString() + "\n"); 
     if(this.additiveCodeableConcept != null) builder.append("additiveCodeableConcept" + "->" + this.additiveCodeableConcept.toString() + "\n"); 
     if(this.additiveReference != null) builder.append("additiveReference" + "->" + this.additiveReference.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}