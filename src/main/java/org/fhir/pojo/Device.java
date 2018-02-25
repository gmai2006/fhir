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
import org.fhir.entity.DeviceModel;
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
public class Device  extends DomainResource  {
  /**
  * Description: "This is a Device resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Unique instance identifiers assigned to a device by manufacturers other organizations or owners."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "[Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package."
  */
  protected DeviceUdi udi;

  /**
  * Description: "Status of the Device availability."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Code or identifier to identify a kind of device."
  */
  protected CodeableConcept type;

  /**
  * Description: "Lot number assigned by the manufacturer."
  */
  protected String lotNumber;

  /**
  * Description: "Extensions for lotNumber"
  */
  protected transient Element _lotNumber;

  /**
  * Description: "A name of the manufacturer."
  */
  protected String manufacturer;

  /**
  * Description: "Extensions for manufacturer"
  */
  protected transient Element _manufacturer;

  /**
  * Description: "The date and time when the device was manufactured."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String manufactureDate;

  /**
  * Description: "Extensions for manufactureDate"
  */
  protected transient Element _manufactureDate;

  /**
  * Description: "The date and time beyond which this device is no longer valid or should not be used (if applicable)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String expirationDate;

  /**
  * Description: "Extensions for expirationDate"
  */
  protected transient Element _expirationDate;

  /**
  * Description: "The \"model\" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type."
  */
  protected String model;

  /**
  * Description: "Extensions for model"
  */
  protected transient Element _model;

  /**
  * Description: "The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware."
  */
  protected String version;

  /**
  * Description: "Extensions for version"
  */
  protected transient Element _version;

  /**
  * Description: "Patient information, If the device is affixed to a person."
  */
  protected Reference patient;

  /**
  * Description: "An organization that is responsible for the provision and ongoing maintenance of the device."
  */
  protected Reference owner;

  /**
  * Description: "Contact details for an organization or a particular human that is responsible for the device."
  */
  protected java.util.List<ContactPoint> contact;

  /**
  * Description: "The place where the device can be found."
  */
  protected Reference location;

  /**
  * Description: "A network address on which the device may be contacted directly."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  /**
  * Description: "Descriptive information, usage information or implantation information that is not captured in an existing element."
  */
  protected java.util.List<Annotation> note;

  /**
  * Description: "Provides additional safety characteristics about a medical device.  For example devices containing latex."
  */
  protected java.util.List<CodeableConcept> safety;

  public Device() {
  }

  public Device(DeviceModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getUdi() && !o.getUdi().isEmpty()) {
      this.udi = new DeviceUdi(o.getUdi().get(0));
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getLotNumber()) {
      this.lotNumber = o.getLotNumber();
    }
    if (null != o.getManufacturer()) {
      this.manufacturer = o.getManufacturer();
    }
    if (null != o.getManufactureDate()) {
      this.manufactureDate = o.getManufactureDate();
    }
    if (null != o.getExpirationDate()) {
      this.expirationDate = o.getExpirationDate();
    }
    if (null != o.getModel()) {
      this.model = o.getModel();
    }
    if (null != o.getVersion()) {
      this.version = o.getVersion();
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getOwner() && !o.getOwner().isEmpty()) {
      this.owner = new Reference(o.getOwner().get(0));
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
      this.location = new Reference(o.getLocation().get(0));
    }
    if (null != o.getUrl()) {
      this.url = o.getUrl();
    }
    if (null != o.getSafety() && !o.getSafety().isEmpty()) {
    	this.safety = CodeableConceptHelper.fromArray2Array(o.getSafety());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setUdi( DeviceUdi value) {
    this.udi = value;
  }
  public DeviceUdi getUdi() {
    return this.udi;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setLotNumber( String value) {
    this.lotNumber = value;
  }
  public String getLotNumber() {
    return this.lotNumber;
  }
  public void set_lotNumber( Element value) {
    this._lotNumber = value;
  }
  public Element get_lotNumber() {
    return this._lotNumber;
  }
  public void setManufacturer( String value) {
    this.manufacturer = value;
  }
  public String getManufacturer() {
    return this.manufacturer;
  }
  public void set_manufacturer( Element value) {
    this._manufacturer = value;
  }
  public Element get_manufacturer() {
    return this._manufacturer;
  }
  public void setManufactureDate( String value) {
    this.manufactureDate = value;
  }
  public String getManufactureDate() {
    return this.manufactureDate;
  }
  public void set_manufactureDate( Element value) {
    this._manufactureDate = value;
  }
  public Element get_manufactureDate() {
    return this._manufactureDate;
  }
  public void setExpirationDate( String value) {
    this.expirationDate = value;
  }
  public String getExpirationDate() {
    return this.expirationDate;
  }
  public void set_expirationDate( Element value) {
    this._expirationDate = value;
  }
  public Element get_expirationDate() {
    return this._expirationDate;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getModel() {
    return this.model;
  }
  public void set_model( Element value) {
    this._model = value;
  }
  public Element get_model() {
    return this._model;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void set_version( Element value) {
    this._version = value;
  }
  public Element get_version() {
    return this._version;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setOwner( Reference value) {
    this.owner = value;
  }
  public Reference getOwner() {
    return this.owner;
  }
  public void setContact( java.util.List<ContactPoint> value) {
    this.contact = value;
  }
  public java.util.List<ContactPoint> getContact() {
    return this.contact;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
  }
  public void setSafety( java.util.List<CodeableConcept> value) {
    this.safety = value;
  }
  public java.util.List<CodeableConcept> getSafety() {
    return this.safety;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Device]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.udi != null) builder.append("udi" + "->" + this.udi.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.lotNumber != null) builder.append("lotNumber" + "->" + this.lotNumber.toString() + "\n"); 
     if(this._lotNumber != null) builder.append("_lotNumber" + "->" + this._lotNumber.toString() + "\n"); 
     if(this.manufacturer != null) builder.append("manufacturer" + "->" + this.manufacturer.toString() + "\n"); 
     if(this._manufacturer != null) builder.append("_manufacturer" + "->" + this._manufacturer.toString() + "\n"); 
     if(this.manufactureDate != null) builder.append("manufactureDate" + "->" + this.manufactureDate.toString() + "\n"); 
     if(this._manufactureDate != null) builder.append("_manufactureDate" + "->" + this._manufactureDate.toString() + "\n"); 
     if(this.expirationDate != null) builder.append("expirationDate" + "->" + this.expirationDate.toString() + "\n"); 
     if(this._expirationDate != null) builder.append("_expirationDate" + "->" + this._expirationDate.toString() + "\n"); 
     if(this.model != null) builder.append("model" + "->" + this.model.toString() + "\n"); 
     if(this._model != null) builder.append("_model" + "->" + this._model.toString() + "\n"); 
     if(this.version != null) builder.append("version" + "->" + this.version.toString() + "\n"); 
     if(this._version != null) builder.append("_version" + "->" + this._version.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.owner != null) builder.append("owner" + "->" + this.owner.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); 
     if(this.safety != null) builder.append("safety" + "->" + this.safety.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Device,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Device" : { return Device.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	inactive,
  	enteredinerror,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "inactive" : { return inactive.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}