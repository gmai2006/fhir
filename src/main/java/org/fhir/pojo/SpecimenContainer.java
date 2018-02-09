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
      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      this.capacity = Quantity.fromJson(o.getCapacity());
      this.specimenQuantity = Quantity.fromJson(o.getSpecimenQuantity());
      this.additiveCodeableConcept = CodeableConcept.fromJson(o.getAdditiveCodeableConcept());
      if (null != o.getAdditiveReference()) {
        this.additiveReference = new Reference(o.getAdditiveReference());
        this.additiveReference.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("capacity" + "[" + String.valueOf(this.capacity) + "]\n"); 
     builder.append("specimenQuantity" + "[" + String.valueOf(this.specimenQuantity) + "]\n"); 
     builder.append("additiveCodeableConcept" + "[" + String.valueOf(this.additiveCodeableConcept) + "]\n"); 
     builder.append("additiveReference" + "[" + String.valueOf(this.additiveReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<SpecimenContainer> fromArray(java.util.List<SpecimenContainerModel> list) {
    return (java.util.List<SpecimenContainer>)list.stream()
      .map(model -> new SpecimenContainer(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SpecimenContainerModel> toModelArray(java.util.List<SpecimenContainer> list) {
    return (java.util.List<SpecimenContainerModel>)list.stream()
      .map(model -> new SpecimenContainerModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static SpecimenContainer fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SpecimenContainer.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(SpecimenContainer o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<SpecimenContainer> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}