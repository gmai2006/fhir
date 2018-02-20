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
public class SpecimenContainer  extends BackboneElement  {
  /**
  * Description: "Id for container. There may be multiple; a manufacturer's bar code, lab assigned identifier, etc. The container ID may differ from the specimen id in some circumstances."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Textual description of the container."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The type of container associated with the specimen (e.g. slide, aliquot, etc.)."
  */
  protected CodeableConcept type;

  /**
  * Description: "The capacity (volume or other measure) the container may contain."
  */
  protected Quantity capacity;

  /**
  * Description: "The quantity of specimen in the container; may be volume, dimensions, or other appropriate measurements, depending on the specimen type."
  */
  protected Quantity specimenQuantity;

  /**
  * Description: "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA."
  */
  protected CodeableConcept additiveCodeableConcept;

  /**
  * Description: "Introduced substance to preserve, maintain or enhance the specimen. Examples: Formalin, Citrate, EDTA."
  */
  protected Reference additiveReference;

  public SpecimenContainer() {
  }

  public SpecimenContainer(SpecimenContainerModel o) {
    this.id = o.getId();
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getCapacity() && !o.getCapacity().isEmpty()) {
      this.capacity = new Quantity(o.getCapacity().get(0));
    }
    if (null != o.getSpecimenQuantity() && !o.getSpecimenQuantity().isEmpty()) {
      this.specimenQuantity = new Quantity(o.getSpecimenQuantity().get(0));
    }
    if (null != o.getAdditiveCodeableConcept() && !o.getAdditiveCodeableConcept().isEmpty()) {
      this.additiveCodeableConcept = new CodeableConcept(o.getAdditiveCodeableConcept().get(0));
    }
    if (null != o.getAdditiveReference() && !o.getAdditiveReference().isEmpty()) {
      this.additiveReference = new Reference(o.getAdditiveReference().get(0));
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
     if(this.additiveReference != null) builder.append("additiveReference" + "->" + this.additiveReference.toString() + "\n"); ;
    return builder.toString();
  }


}