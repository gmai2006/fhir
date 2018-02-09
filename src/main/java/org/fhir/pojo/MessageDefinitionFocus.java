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
import org.fhir.entity.MessageDefinitionFocusModel;
import com.google.gson.GsonBuilder;

/**
* "Defines the characteristics of a message that can be shared between systems, including the type of event that initiates the message, the content to be transmitted and what response(s), if any, are permitted."
*/
public class MessageDefinitionFocus  {
  /**
  * Description: "The kind of resource that must be the focus for this message."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String code;

  /**
  * Description: "Extensions for code"
  */
  private transient Element _code;

  /**
  * Description: "A profile that reflects constraints for the focal resource (and potentially for related resources)."
  */
  private Reference profile;

  /**
  * Description: "Identifies the minimum number of resources of this type that must be pointed to by a message in order for it to be valid against this MessageDefinition."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float min;

  /**
  * Description: "Extensions for min"
  */
  private transient Element _min;

  /**
  * Description: "Identifies the maximum number of resources of this type that must be pointed to by a message in order for it to be valid against this MessageDefinition."
  */
  private String max;

  /**
  * Description: "Extensions for max"
  */
  private transient Element _max;

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

  public MessageDefinitionFocus() {
  }

  public MessageDefinitionFocus(MessageDefinitionFocusModel o) {
    this.id = o.getId();
      if (null != o.getCode()) {
        this.code = new String(o.getCode());
      }

      if (null != o.getProfile()) {
        this.profile = new Reference(o.getProfile());
        this.profile.setId(this.getId());
      }

      if (null != o.getMin()) {
        this.min = new Float(o.getMin());
      }

      if (null != o.getMax()) {
        this.max = new String(o.getMax());
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
  public void setProfile( Reference value) {
    this.profile = value;
  }
  public Reference getProfile() {
    return this.profile;
  }
  public void setMin( Float value) {
    this.min = value;
  }
  public Float getMin() {
    return this.min;
  }
  public void set_min( Element value) {
    this._min = value;
  }
  public Element get_min() {
    return this._min;
  }
  public void setMax( String value) {
    this.max = value;
  }
  public String getMax() {
    return this.max;
  }
  public void set_max( Element value) {
    this._max = value;
  }
  public Element get_max() {
    return this._max;
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
     builder.append("profile" + "[" + String.valueOf(this.profile) + "]\n"); 
     builder.append("min" + "[" + String.valueOf(this.min) + "]\n"); 
     builder.append("_min" + "[" + String.valueOf(this._min) + "]\n"); 
     builder.append("max" + "[" + String.valueOf(this.max) + "]\n"); 
     builder.append("_max" + "[" + String.valueOf(this._max) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<MessageDefinitionFocus> fromArray(java.util.List<MessageDefinitionFocusModel> list) {
    return (java.util.List<MessageDefinitionFocus>)list.stream()
      .map(model -> new MessageDefinitionFocus(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MessageDefinitionFocusModel> toModelArray(java.util.List<MessageDefinitionFocus> list) {
    return (java.util.List<MessageDefinitionFocusModel>)list.stream()
      .map(model -> new MessageDefinitionFocusModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MessageDefinitionFocus fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MessageDefinitionFocus.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MessageDefinitionFocus o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MessageDefinitionFocus> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}