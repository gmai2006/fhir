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
import org.fhir.entity.ProcedureFocalDeviceModel;
import com.google.gson.GsonBuilder;

/**
* "An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy."
*/
public class ProcedureFocalDevice  {
  /**
  * Description: "The kind of change that happened to the device during the procedure."
  */
  private CodeableConcept action;

  /**
  * Description: "The device that was manipulated (changed) during the procedure."
  */
  @javax.validation.constraints.NotNull
  private Reference manipulated;

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

  public ProcedureFocalDevice() {
  }

  public ProcedureFocalDevice(ProcedureFocalDeviceModel o) {
    this.id = o.getId();
      this.action = CodeableConcept.fromJson(o.getAction());
      if (null != o.getManipulated()) {
        this.manipulated = new Reference(o.getManipulated());
        this.manipulated.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setAction( CodeableConcept value) {
    this.action = value;
  }
  public CodeableConcept getAction() {
    return this.action;
  }
  public void setManipulated( Reference value) {
    this.manipulated = value;
  }
  public Reference getManipulated() {
    return this.manipulated;
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
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("manipulated" + "[" + String.valueOf(this.manipulated) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ProcedureFocalDevice> fromArray(java.util.List<ProcedureFocalDeviceModel> list) {
    return (java.util.List<ProcedureFocalDevice>)list.stream()
      .map(model -> new ProcedureFocalDevice(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ProcedureFocalDeviceModel> toModelArray(java.util.List<ProcedureFocalDevice> list) {
    return (java.util.List<ProcedureFocalDeviceModel>)list.stream()
      .map(model -> new ProcedureFocalDeviceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ProcedureFocalDevice fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ProcedureFocalDevice.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ProcedureFocalDevice o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ProcedureFocalDevice> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}