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
import org.fhir.entity.DeviceComponentProductionSpecificationModel;
import com.google.gson.GsonBuilder;

/**
* "The characteristics, operational status and capabilities of a medical-related component of a medical device."
*/
public class DeviceComponentProductionSpecification  {
  /**
  * Description: "The specification type, such as, serial number, part number, hardware revision, software revision, etc."
  */
  private CodeableConcept specType;

  /**
  * Description: "The internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacturer can make use of."
  */
  private Identifier componentId;

  /**
  * Description: "The printable string defining the component."
  */
  private String productionSpec;

  /**
  * Description: "Extensions for productionSpec"
  */
  private transient Element _productionSpec;

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

  public DeviceComponentProductionSpecification() {
  }

  public DeviceComponentProductionSpecification(DeviceComponentProductionSpecificationModel o) {
    this.id = o.getId();
      this.specType = CodeableConcept.fromJson(o.getSpecType());
      this.componentId = Identifier.fromJson(o.getComponentId());
      if (null != o.getProductionSpec()) {
        this.productionSpec = new String(o.getProductionSpec());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setSpecType( CodeableConcept value) {
    this.specType = value;
  }
  public CodeableConcept getSpecType() {
    return this.specType;
  }
  public void setComponentId( Identifier value) {
    this.componentId = value;
  }
  public Identifier getComponentId() {
    return this.componentId;
  }
  public void setProductionSpec( String value) {
    this.productionSpec = value;
  }
  public String getProductionSpec() {
    return this.productionSpec;
  }
  public void set_productionSpec( Element value) {
    this._productionSpec = value;
  }
  public Element get_productionSpec() {
    return this._productionSpec;
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
     builder.append("specType" + "[" + String.valueOf(this.specType) + "]\n"); 
     builder.append("componentId" + "[" + String.valueOf(this.componentId) + "]\n"); 
     builder.append("productionSpec" + "[" + String.valueOf(this.productionSpec) + "]\n"); 
     builder.append("_productionSpec" + "[" + String.valueOf(this._productionSpec) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<DeviceComponentProductionSpecification> fromArray(java.util.List<DeviceComponentProductionSpecificationModel> list) {
    return (java.util.List<DeviceComponentProductionSpecification>)list.stream()
      .map(model -> new DeviceComponentProductionSpecification(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DeviceComponentProductionSpecificationModel> toModelArray(java.util.List<DeviceComponentProductionSpecification> list) {
    return (java.util.List<DeviceComponentProductionSpecificationModel>)list.stream()
      .map(model -> new DeviceComponentProductionSpecificationModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DeviceComponentProductionSpecification fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DeviceComponentProductionSpecification.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DeviceComponentProductionSpecification o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DeviceComponentProductionSpecification> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}