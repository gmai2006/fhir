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
import org.fhir.entity.NutritionOrderTextureModel;
import com.google.gson.GsonBuilder;

/**
* "A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident."
*/
public class NutritionOrderTexture  {
  /**
  * Description: "Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed."
  */
  private CodeableConcept modifier;

  /**
  * Description: "The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types."
  */
  private CodeableConcept foodType;

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

  public NutritionOrderTexture() {
  }

  public NutritionOrderTexture(NutritionOrderTextureModel o) {
    this.id = o.getId();
      this.modifier = CodeableConcept.fromJson(o.getModifier());
      this.foodType = CodeableConcept.fromJson(o.getFoodType());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setModifier( CodeableConcept value) {
    this.modifier = value;
  }
  public CodeableConcept getModifier() {
    return this.modifier;
  }
  public void setFoodType( CodeableConcept value) {
    this.foodType = value;
  }
  public CodeableConcept getFoodType() {
    return this.foodType;
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
     builder.append("modifier" + "[" + String.valueOf(this.modifier) + "]\n"); 
     builder.append("foodType" + "[" + String.valueOf(this.foodType) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<NutritionOrderTexture> fromArray(java.util.List<NutritionOrderTextureModel> list) {
    return (java.util.List<NutritionOrderTexture>)list.stream()
      .map(model -> new NutritionOrderTexture(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<NutritionOrderTextureModel> toModelArray(java.util.List<NutritionOrderTexture> list) {
    return (java.util.List<NutritionOrderTextureModel>)list.stream()
      .map(model -> new NutritionOrderTextureModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static NutritionOrderTexture fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, NutritionOrderTexture.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(NutritionOrderTexture o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<NutritionOrderTexture> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}