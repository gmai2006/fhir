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
package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc."
*/
@Entity
@Table(name="deviceudi")
public class DeviceUdiModel  implements Serializable {
	private static final long serialVersionUID = 151967883189873187L;
  /**
  * Description: "The device identifier (DI) is a mandatory, fixed portion of a UDI that identifies the labeler and the specific version or model of a device."
  */
  @javax.persistence.Basic
  @Column(name="\"deviceIdentifier\"")
  private String deviceIdentifier;

  /**
  * Description: "Name of device as used in labeling or catalog."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "The identity of the authoritative source for UDI generation within a  jurisdiction.  All UDIs are globally unique within a single namespace. with the appropriate repository uri as the system.  For example,  UDIs of devices managed in the U.S. by the FDA, the value is  http://hl7.org/fhir/NamingSystem/fda-udi."
  */
  @javax.persistence.Basic
  @Column(name="\"jurisdiction\"")
  private String jurisdiction;

  /**
  * Description: "The full UDI carrier as the human readable form (HRF) representation of the barcode string as printed on the packaging of the device."
  */
  @javax.persistence.Basic
  @Column(name="\"carrierHRF\"")
  private String carrierHRF;

  /**
  * Description: "The full UDI carrier of the Automatic Identification and Data Capture (AIDC) technology representation of the barcode string as printed on the packaging of the device - E.g a barcode or RFID.   Because of limitations on character sets in XML and the need to round-trip JSON data through XML, AIDC Formats *SHALL* be base64 encoded."
  */
  @javax.persistence.Basic
  @Column(name="\"carrierAIDC\"")
  private String carrierAIDC;

  /**
  * Description: "Organization that is charged with issuing UDIs for devices.  For example, the US FDA issuers include :\n1) GS1: \nhttp://hl7.org/fhir/NamingSystem/gs1-di, \n2) HIBCC:\nhttp://hl7.org/fhir/NamingSystem/hibcc-dI, \n3) ICCBBA for blood containers:\nhttp://hl7.org/fhir/NamingSystem/iccbba-blood-di, \n4) ICCBA for other devices:\nhttp://hl7.org/fhir/NamingSystem/iccbba-other-di."
  */
  @javax.persistence.Basic
  @Column(name="\"issuer\"")
  private String issuer;

  /**
  * Description: "A coded entry to indicate how the data was entered."
  */
  @javax.persistence.Basic
  @Column(name="\"entryType\"")
  private String entryType;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public DeviceUdiModel() {
  }

  public DeviceUdiModel(DeviceUdi o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.deviceIdentifier = o.getDeviceIdentifier();
    this.name = o.getName();
    this.jurisdiction = o.getJurisdiction();
    this.carrierHRF = o.getCarrierHRF();
    this.carrierAIDC = o.getCarrierAIDC();
    this.issuer = o.getIssuer();
    this.entryType = o.getEntryType();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getDeviceIdentifier() {
    return this.deviceIdentifier;
  }
  public void setDeviceIdentifier( String value) {
    this.deviceIdentifier = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getJurisdiction() {
    return this.jurisdiction;
  }
  public void setJurisdiction( String value) {
    this.jurisdiction = value;
  }
  public String getCarrierHRF() {
    return this.carrierHRF;
  }
  public void setCarrierHRF( String value) {
    this.carrierHRF = value;
  }
  public String getCarrierAIDC() {
    return this.carrierAIDC;
  }
  public void setCarrierAIDC( String value) {
    this.carrierAIDC = value;
  }
  public String getIssuer() {
    return this.issuer;
  }
  public void setIssuer( String value) {
    this.issuer = value;
  }
  public String getEntryType() {
    return this.entryType;
  }
  public void setEntryType( String value) {
    this.entryType = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceUdiModel]:" + "\n");
     builder.append("deviceIdentifier" + "->" + this.deviceIdentifier + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("jurisdiction" + "->" + this.jurisdiction + "\n"); 
     builder.append("carrierHRF" + "->" + this.carrierHRF + "\n"); 
     builder.append("carrierAIDC" + "->" + this.carrierAIDC + "\n"); 
     builder.append("issuer" + "->" + this.issuer + "\n"); 
     builder.append("entryType" + "->" + this.entryType + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceUdiModel]:" + "\n");
     builder.append("deviceIdentifier" + "->" + this.deviceIdentifier + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("jurisdiction" + "->" + this.jurisdiction + "\n"); 
     builder.append("carrierHRF" + "->" + this.carrierHRF + "\n"); 
     builder.append("carrierAIDC" + "->" + this.carrierAIDC + "\n"); 
     builder.append("issuer" + "->" + this.issuer + "\n"); 
     builder.append("entryType" + "->" + this.entryType + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}