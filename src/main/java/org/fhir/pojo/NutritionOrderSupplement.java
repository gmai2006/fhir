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
import org.fhir.entity.NutritionOrderSupplementModel;
import com.google.gson.GsonBuilder;

/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
public class NutritionOrderSupplement  {
  /**
  * Description: "The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement."
  */
  private CodeableConcept type;

  /**
  * Description: "The product or brand name of the nutritional supplement such as \"Acme Protein Shake\"."
  */
  private String productName;

  /**
  * Description: "Extensions for productName"
  */
  private transient Element _productName;

  /**
  * Description: "The time period and frequency at which the supplement(s) should be given.  The supplement should be given for the combination of all schedules if more than one schedule is present."
  */
  private java.util.List<Timing> schedule = new java.util.ArrayList<>();

  /**
  * Description: "The amount of the nutritional supplement to be given."
  */
  private Quantity quantity;

  /**
  * Description: "Free text or additional instructions or information pertaining to the oral supplement."
  */
  private String instruction;

  /**
  * Description: "Extensions for instruction"
  */
  private transient Element _instruction;

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

  public NutritionOrderSupplement() {
  }

  public NutritionOrderSupplement(NutritionOrderSupplementModel o) {
    this.id = o.getId();
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getProductName()) {
      this.productName = o.getProductName();
    }
    this.quantity = QuantityHelper.fromJson(o.getQuantity());
    if (null != o.getInstruction()) {
      this.instruction = o.getInstruction();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setProductName( String value) {
    this.productName = value;
  }
  public String getProductName() {
    return this.productName;
  }
  public void set_productName( Element value) {
    this._productName = value;
  }
  public Element get_productName() {
    return this._productName;
  }
  public void setSchedule( java.util.List<Timing> value) {
    this.schedule = value;
  }
  public java.util.List<Timing> getSchedule() {
    return this.schedule;
  }
  public void setQuantity( Quantity value) {
    this.quantity = value;
  }
  public Quantity getQuantity() {
    return this.quantity;
  }
  public void setInstruction( String value) {
    this.instruction = value;
  }
  public String getInstruction() {
    return this.instruction;
  }
  public void set_instruction( Element value) {
    this._instruction = value;
  }
  public Element get_instruction() {
    return this._instruction;
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
    builder.append("[NutritionOrderSupplement]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.productName != null) builder.append("productName" + "->" + this.productName.toString() + "\n"); 
     if(this._productName != null) builder.append("_productName" + "->" + this._productName.toString() + "\n"); 
     if(this.schedule != null) builder.append("schedule" + "->" + this.schedule.toString() + "\n"); 
     if(this.quantity != null) builder.append("quantity" + "->" + this.quantity.toString() + "\n"); 
     if(this.instruction != null) builder.append("instruction" + "->" + this.instruction.toString() + "\n"); 
     if(this._instruction != null) builder.append("_instruction" + "->" + this._instruction.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}