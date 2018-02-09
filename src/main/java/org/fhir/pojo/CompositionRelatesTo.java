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
import org.fhir.entity.CompositionRelatesToModel;
import com.google.gson.GsonBuilder;

/**
* "A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained."
*/
public class CompositionRelatesTo  {
  /**
  * Description: "The type of relationship that this composition has with anther composition or document."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "The target composition/document of this relationship."
  */
  private Identifier targetIdentifier;

  /**
  * Description: "The target composition/document of this relationship."
  */
  private Reference targetReference;

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

  public CompositionRelatesTo() {
  }

  public CompositionRelatesTo(CompositionRelatesToModel o) {
    this.id = o.getId();
      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      this.targetIdentifier = Identifier.fromJson(o.getTargetIdentifier());
      if (null != o.getTargetReference()) {
        this.targetReference = new Reference(o.getTargetReference());
        this.targetReference.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCode( String value) {
    this.code = value;
  }
  public String getCode() {
    return this.code;
  }
  public void set_code( Element value) {
    this._code = value;
  }
  public Element get_code() {
    return this._code;
  }
  public void setTargetIdentifier( Identifier value) {
    this.targetIdentifier = value;
  }
  public Identifier getTargetIdentifier() {
    return this.targetIdentifier;
  }
  public void setTargetReference( Reference value) {
    this.targetReference = value;
  }
  public Reference getTargetReference() {
    return this.targetReference;
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
     builder.append("code" + "[" + String.valueOf(this.code) + "]\n"); 
     builder.append("_code" + "[" + String.valueOf(this._code) + "]\n"); 
     builder.append("targetIdentifier" + "[" + String.valueOf(this.targetIdentifier) + "]\n"); 
     builder.append("targetReference" + "[" + String.valueOf(this.targetReference) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<CompositionRelatesTo> fromArray(java.util.List<CompositionRelatesToModel> list) {
    return (java.util.List<CompositionRelatesTo>)list.stream()
      .map(model -> new CompositionRelatesTo(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CompositionRelatesToModel> toModelArray(java.util.List<CompositionRelatesTo> list) {
    return (java.util.List<CompositionRelatesToModel>)list.stream()
      .map(model -> new CompositionRelatesToModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CompositionRelatesTo fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CompositionRelatesTo.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CompositionRelatesTo o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CompositionRelatesTo> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}