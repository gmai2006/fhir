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
public class DeviceComponentProductionSpecification  extends BackboneElement  {
  /**
  * Description: "The specification type, such as, serial number, part number, hardware revision, software revision, etc."
  */
  protected CodeableConcept specType;

  /**
  * Description: "The internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacturer can make use of."
  */
  protected Identifier componentId;

  /**
  * Description: "The printable string defining the component."
  */
  protected String productionSpec;

  /**
  * Description: "Extensions for productionSpec"
  */
  protected transient Element _productionSpec;

  public DeviceComponentProductionSpecification() {
  }

  public DeviceComponentProductionSpecification(DeviceComponentProductionSpecificationModel o) {
    this.id = o.getId();
    this.specType = CodeableConceptHelper.fromJson(o.getSpecType());
    this.componentId = IdentifierHelper.fromJson(o.getComponentId());
    if (null != o.getProductionSpec()) {
      this.productionSpec = o.getProductionSpec();
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceComponentProductionSpecification]:" + "\n");
     if(this.specType != null) builder.append("specType" + "->" + this.specType.toString() + "\n"); 
     if(this.componentId != null) builder.append("componentId" + "->" + this.componentId.toString() + "\n"); 
     if(this.productionSpec != null) builder.append("productionSpec" + "->" + this.productionSpec.toString() + "\n"); 
     if(this._productionSpec != null) builder.append("_productionSpec" + "->" + this._productionSpec.toString() + "\n"); ;
    return builder.toString();
  }


}