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

  public DeviceComponentProductionSpecification() {
  }

  public DeviceComponentProductionSpecification(DeviceComponentProductionSpecificationModel o) {
    this.id = o.getId();
    this.specType = CodeableConceptHelper.fromJson(o.getSpecType());
    this.componentId = IdentifierHelper.fromJson(o.getComponentId());
    if (null != o.getProductionSpec()) {
      this.productionSpec = o.getProductionSpec();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[DeviceComponentProductionSpecification]:" + "\n");
     if(this.specType != null) builder.append("specType" + "->" + this.specType.toString() + "\n"); 
     if(this.componentId != null) builder.append("componentId" + "->" + this.componentId.toString() + "\n"); 
     if(this.productionSpec != null) builder.append("productionSpec" + "->" + this.productionSpec.toString() + "\n"); 
     if(this._productionSpec != null) builder.append("_productionSpec" + "->" + this._productionSpec.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}