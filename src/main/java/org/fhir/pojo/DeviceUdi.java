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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceUdi  extends BackboneElement  {
  /**
  * Description: "The device identifier (DI) is a mandatory, fixed portion of a UDI that identifies the labeler and the specific version or model of a device."
  */
  protected String deviceIdentifier;

  /**
  * Description: "Extensions for deviceIdentifier"
  */
  protected transient Element _deviceIdentifier;

  /**
  * Description: "Name of device as used in labeling or catalog."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The identity of the authoritative source for UDI generation within a  jurisdiction.  All UDIs are globally unique within a single namespace. with the appropriate repository uri as the system.  For example,  UDIs of devices managed in the U.S. by the FDA, the value is  http://hl7.org/fhir/NamingSystem/fda-udi."
  */
  protected String jurisdiction;

  /**
  * Description: "Extensions for jurisdiction"
  */
  protected transient Element _jurisdiction;

  /**
  * Description: "The full UDI carrier as the human readable form (HRF) representation of the barcode string as printed on the packaging of the device."
  */
  protected String carrierHRF;

  /**
  * Description: "Extensions for carrierHRF"
  */
  protected transient Element _carrierHRF;

  /**
  * Description: "The full UDI carrier of the Automatic Identification and Data Capture (AIDC) technology representation of the barcode string as printed on the packaging of the device - E.g a barcode or RFID.   Because of limitations on character sets in XML and the need to round-trip JSON data through XML, AIDC Formats *SHALL* be base64 encoded."
  */
  protected String carrierAIDC;

  /**
  * Description: "Extensions for carrierAIDC"
  */
  protected transient Element _carrierAIDC;

  /**
  * Description: "Organization that is charged with issuing UDIs for devices.  For example, the US FDA issuers include :\n1) GS1: \nhttp://hl7.org/fhir/NamingSystem/gs1-di, \n2) HIBCC:\nhttp://hl7.org/fhir/NamingSystem/hibcc-dI, \n3) ICCBBA for blood containers:\nhttp://hl7.org/fhir/NamingSystem/iccbba-blood-di, \n4) ICCBA for other devices:\nhttp://hl7.org/fhir/NamingSystem/iccbba-other-di."
  */
  protected String issuer;

  /**
  * Description: "Extensions for issuer"
  */
  protected transient Element _issuer;

  /**
  * Description: "A coded entry to indicate how the data was entered."
  */
  protected String entryType;

  /**
  * Description: "Extensions for entryType"
  */
  protected transient Element _entryType;

  public DeviceUdi() {
  }

  public DeviceUdi(DeviceUdiModel o) {
    this.id = o.getId();
    if (null != o.getDeviceIdentifier()) {
      this.deviceIdentifier = o.getDeviceIdentifier();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getJurisdiction()) {
      this.jurisdiction = o.getJurisdiction();
    }
    if (null != o.getCarrierHRF()) {
      this.carrierHRF = o.getCarrierHRF();
    }
    if (null != o.getCarrierAIDC()) {
      this.carrierAIDC = o.getCarrierAIDC();
    }
    if (null != o.getIssuer()) {
      this.issuer = o.getIssuer();
    }
    if (null != o.getEntryType()) {
      this.entryType = o.getEntryType();
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceUdi]:" + "\n");
     if(this.deviceIdentifier != null) builder.append("deviceIdentifier" + "->" + this.deviceIdentifier.toString() + "\n"); 
     if(this._deviceIdentifier != null) builder.append("_deviceIdentifier" + "->" + this._deviceIdentifier.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.jurisdiction != null) builder.append("jurisdiction" + "->" + this.jurisdiction.toString() + "\n"); 
     if(this._jurisdiction != null) builder.append("_jurisdiction" + "->" + this._jurisdiction.toString() + "\n"); 
     if(this.carrierHRF != null) builder.append("carrierHRF" + "->" + this.carrierHRF.toString() + "\n"); 
     if(this._carrierHRF != null) builder.append("_carrierHRF" + "->" + this._carrierHRF.toString() + "\n"); 
     if(this.carrierAIDC != null) builder.append("carrierAIDC" + "->" + this.carrierAIDC.toString() + "\n"); 
     if(this._carrierAIDC != null) builder.append("_carrierAIDC" + "->" + this._carrierAIDC.toString() + "\n"); 
     if(this.issuer != null) builder.append("issuer" + "->" + this.issuer.toString() + "\n"); 
     if(this._issuer != null) builder.append("_issuer" + "->" + this._issuer.toString() + "\n"); 
     if(this.entryType != null) builder.append("entryType" + "->" + this.entryType.toString() + "\n"); 
     if(this._entryType != null) builder.append("_entryType" + "->" + this._entryType.toString() + "\n"); ;
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

}