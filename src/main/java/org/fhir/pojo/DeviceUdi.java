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
import org.fhir.entity.DeviceUdiModel;
import com.google.gson.GsonBuilder;

/**
* "This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc."
*/
public class DeviceUdi  {
  /**
  * Description: "The device identifier (DI) is a mandatory, fixed portion of a UDI that identifies the labeler and the specific version or model of a device."
  */
  private String deviceIdentifier;

  /**
  * Description: "Extensions for deviceIdentifier"
  */
  private transient Element _deviceIdentifier;

  /**
  * Description: "Name of device as used in labeling or catalog."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "The identity of the authoritative source for UDI generation within a  jurisdiction.  All UDIs are globally unique within a single namespace. with the appropriate repository uri as the system.  For example,  UDIs of devices managed in the U.S. by the FDA, the value is  http://hl7.org/fhir/NamingSystem/fda-udi."
  */
  private String jurisdiction;

  /**
  * Description: "Extensions for jurisdiction"
  */
  private transient Element _jurisdiction;

  /**
  * Description: "The full UDI carrier as the human readable form (HRF) representation of the barcode string as printed on the packaging of the device."
  */
  private String carrierHRF;

  /**
  * Description: "Extensions for carrierHRF"
  */
  private transient Element _carrierHRF;

  /**
  * Description: "The full UDI carrier of the Automatic Identification and Data Capture (AIDC) technology representation of the barcode string as printed on the packaging of the device - E.g a barcode or RFID.   Because of limitations on character sets in XML and the need to round-trip JSON data through XML, AIDC Formats *SHALL* be base64 encoded."
  */
  private String carrierAIDC;

  /**
  * Description: "Extensions for carrierAIDC"
  */
  private transient Element _carrierAIDC;

  /**
  * Description: "Organization that is charged with issuing UDIs for devices.  For example, the US FDA issuers include :\n1) GS1: \nhttp://hl7.org/fhir/NamingSystem/gs1-di, \n2) HIBCC:\nhttp://hl7.org/fhir/NamingSystem/hibcc-dI, \n3) ICCBBA for blood containers:\nhttp://hl7.org/fhir/NamingSystem/iccbba-blood-di, \n4) ICCBA for other devices:\nhttp://hl7.org/fhir/NamingSystem/iccbba-other-di."
  */
  private String issuer;

  /**
  * Description: "Extensions for issuer"
  */
  private transient Element _issuer;

  /**
  * Description: "A coded entry to indicate how the data was entered."
  */
  private String entryType;

  /**
  * Description: "Extensions for entryType"
  */
  private transient Element _entryType;

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

  public DeviceUdi() {
  }

  public DeviceUdi(DeviceUdiModel o) {
    this.id = o.getId();
      if (null != o.getDeviceIdentifier()) {
        this.deviceIdentifier = new String(o.getDeviceIdentifier());
      }

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getJurisdiction()) {
        this.jurisdiction = new String(o.getJurisdiction());
      }

      if (null != o.getCarrierHRF()) {
        this.carrierHRF = new String(o.getCarrierHRF());
      }

      if (null != o.getCarrierAIDC()) {
        this.carrierAIDC = new String(o.getCarrierAIDC());
      }

      if (null != o.getIssuer()) {
        this.issuer = new String(o.getIssuer());
      }

      if (null != o.getEntryType()) {
        this.entryType = new String(o.getEntryType());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setDeviceIdentifier( String value) {
    this.deviceIdentifier = value;
  }
  public String getDeviceIdentifier() {
    return this.deviceIdentifier;
  }
  public void set_deviceIdentifier( Element value) {
    this._deviceIdentifier = value;
  }
  public Element get_deviceIdentifier() {
    return this._deviceIdentifier;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setJurisdiction( String value) {
    this.jurisdiction = value;
  }
  public String getJurisdiction() {
    return this.jurisdiction;
  }
  public void set_jurisdiction( Element value) {
    this._jurisdiction = value;
  }
  public Element get_jurisdiction() {
    return this._jurisdiction;
  }
  public void setCarrierHRF( String value) {
    this.carrierHRF = value;
  }
  public String getCarrierHRF() {
    return this.carrierHRF;
  }
  public void set_carrierHRF( Element value) {
    this._carrierHRF = value;
  }
  public Element get_carrierHRF() {
    return this._carrierHRF;
  }
  public void setCarrierAIDC( String value) {
    this.carrierAIDC = value;
  }
  public String getCarrierAIDC() {
    return this.carrierAIDC;
  }
  public void set_carrierAIDC( Element value) {
    this._carrierAIDC = value;
  }
  public Element get_carrierAIDC() {
    return this._carrierAIDC;
  }
  public void setIssuer( String value) {
    this.issuer = value;
  }
  public String getIssuer() {
    return this.issuer;
  }
  public void set_issuer( Element value) {
    this._issuer = value;
  }
  public Element get_issuer() {
    return this._issuer;
  }
  public void setEntryType( String value) {
    this.entryType = EntryTypeEnum.fromCode(value);
  }
  public String getEntryType() {
    return this.entryType;
  }
  public void set_entryType( Element value) {
    this._entryType = value;
  }
  public Element get_entryType() {
    return this._entryType;
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
     builder.append("deviceIdentifier" + "[" + String.valueOf(this.deviceIdentifier) + "]\n"); 
     builder.append("_deviceIdentifier" + "[" + String.valueOf(this._deviceIdentifier) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("jurisdiction" + "[" + String.valueOf(this.jurisdiction) + "]\n"); 
     builder.append("_jurisdiction" + "[" + String.valueOf(this._jurisdiction) + "]\n"); 
     builder.append("carrierHRF" + "[" + String.valueOf(this.carrierHRF) + "]\n"); 
     builder.append("_carrierHRF" + "[" + String.valueOf(this._carrierHRF) + "]\n"); 
     builder.append("carrierAIDC" + "[" + String.valueOf(this.carrierAIDC) + "]\n"); 
     builder.append("_carrierAIDC" + "[" + String.valueOf(this._carrierAIDC) + "]\n"); 
     builder.append("issuer" + "[" + String.valueOf(this.issuer) + "]\n"); 
     builder.append("_issuer" + "[" + String.valueOf(this._issuer) + "]\n"); 
     builder.append("entryType" + "[" + String.valueOf(this.entryType) + "]\n"); 
     builder.append("_entryType" + "[" + String.valueOf(this._entryType) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum EntryTypeEnum {
  	barcode,
  	rfid,
  	manual,
  	card,
  	selfreported,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "barcode" : { return barcode.toString(); }
  			case "rfid" : { return rfid.toString(); }
  			case "manual" : { return manual.toString(); }
  			case "card" : { return card.toString(); }
  			case "selfreported" : { return selfreported.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<DeviceUdi> fromArray(java.util.List<DeviceUdiModel> list) {
    return (java.util.List<DeviceUdi>)list.stream()
      .map(model -> new DeviceUdi(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DeviceUdiModel> toModelArray(java.util.List<DeviceUdi> list) {
    return (java.util.List<DeviceUdiModel>)list.stream()
      .map(model -> new DeviceUdiModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DeviceUdi fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DeviceUdi.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DeviceUdi o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DeviceUdi> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}