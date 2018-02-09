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
import org.fhir.entity.OperationDefinitionBindingModel;
import com.google.gson.GsonBuilder;

/**
* "A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction)."
*/
public class OperationDefinitionBinding  {
  /**
  * Description: "Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances."
  */
  private String strength;

  /**
  * Description: "Extensions for strength"
  */
  private transient Element _strength;

  /**
  * Description: "Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used."
  */
  private String valueSetUri;

  /**
  * Description: "Extensions for valueSetUri"
  */
  private transient Element _valueSetUri;

  /**
  * Description: "Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used."
  */
  private Reference valueSetReference;

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

  public OperationDefinitionBinding() {
  }

  public OperationDefinitionBinding(OperationDefinitionBindingModel o) {
    this.id = o.getId();
      if (null != o.getStrength()) {
        this.strength = new String(o.getStrength());
      }

      if (null != o.getValueSetUri()) {
        this.valueSetUri = new String(o.getValueSetUri());
      }

      if (null != o.getValueSetReference()) {
        this.valueSetReference = new Reference(o.getValueSetReference());
        this.valueSetReference.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setStrength( String value) {
    this.strength = StrengthEnum.fromCode(value);
  }
  public String getStrength() {
    return this.strength;
  }
  public void set_strength( Element value) {
    this._strength = value;
  }
  public Element get_strength() {
    return this._strength;
  }
  public void setValueSetUri( String value) {
    this.valueSetUri = value;
  }
  public String getValueSetUri() {
    return this.valueSetUri;
  }
  public void set_valueSetUri( Element value) {
    this._valueSetUri = value;
  }
  public Element get_valueSetUri() {
    return this._valueSetUri;
  }
  public void setValueSetReference( Reference value) {
    this.valueSetReference = value;
  }
  public Reference getValueSetReference() {
    return this.valueSetReference;
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
     builder.append("strength" + "[" + String.valueOf(this.strength) + "]\n"); 
     builder.append("_strength" + "[" + String.valueOf(this._strength) + "]\n"); 
     builder.append("valueSetUri" + "[" + String.valueOf(this.valueSetUri) + "]\n"); 
     builder.append("_valueSetUri" + "[" + String.valueOf(this._valueSetUri) + "]\n"); 
     builder.append("valueSetReference" + "[" + String.valueOf(this.valueSetReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum StrengthEnum {
  	required,
  	extensible,
  	preferred,
  	example,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "required" : { return required.toString(); }
  			case "extensible" : { return extensible.toString(); }
  			case "preferred" : { return preferred.toString(); }
  			case "example" : { return example.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<OperationDefinitionBinding> fromArray(java.util.List<OperationDefinitionBindingModel> list) {
    return (java.util.List<OperationDefinitionBinding>)list.stream()
      .map(model -> new OperationDefinitionBinding(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<OperationDefinitionBindingModel> toModelArray(java.util.List<OperationDefinitionBinding> list) {
    return (java.util.List<OperationDefinitionBindingModel>)list.stream()
      .map(model -> new OperationDefinitionBindingModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static OperationDefinitionBinding fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, OperationDefinitionBinding.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(OperationDefinitionBinding o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<OperationDefinitionBinding> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}