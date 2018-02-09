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
import com.google.gson.GsonBuilder;

/**
* "This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc."
*/
public class Device  {
  /**
  * Description: "This is a Device resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Unique instance identifiers assigned to a device by manufacturers other organizations or owners."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "[Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package."
  */
  private DeviceUdi udi;

  /**
  * Description: "Status of the Device availability."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Code or identifier to identify a kind of device."
  */
  private CodeableConcept type;

  /**
  * Description: "Lot number assigned by the manufacturer."
  */
  private String lotNumber;

  /**
  * Description: "Extensions for lotNumber"
  */
  private transient Element _lotNumber;

  /**
  * Description: "A name of the manufacturer."
  */
  private String manufacturer;

  /**
  * Description: "Extensions for manufacturer"
  */
  private transient Element _manufacturer;

  /**
  * Description: "The date and time when the device was manufactured."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String manufactureDate;

  /**
  * Description: "Extensions for manufactureDate"
  */
  private transient Element _manufactureDate;

  /**
  * Description: "The date and time beyond which this device is no longer valid or should not be used (if applicable)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String expirationDate;

  /**
  * Description: "Extensions for expirationDate"
  */
  private transient Element _expirationDate;

  /**
  * Description: "The \"model\" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type."
  */
  private String model;

  /**
  * Description: "Extensions for model"
  */
  private transient Element _model;

  /**
  * Description: "The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "Patient information, If the device is affixed to a person."
  */
  private Reference patient;

  /**
  * Description: "An organization that is responsible for the provision and ongoing maintenance of the device."
  */
  private Reference owner;

  /**
  * Description: "Contact details for an organization or a particular human that is responsible for the device."
  */
  private java.util.List<ContactPoint> contact = new java.util.ArrayList<>();

  /**
  * Description: "The place where the device can be found."
  */
  private Reference location;

  /**
  * Description: "A network address on which the device may be contacted directly."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "Descriptive information, usage information or implantation information that is not captured in an existing element."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

  /**
  * Description: "Provides additional safety characteristics about a medical device.  For example devices containing latex."
  */
  private java.util.List<CodeableConcept> safety = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public Device() {
  }

  public Device(DeviceModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getUdi()) {
        this.udi = new DeviceUdi(o.getUdi());
        this.udi.setId(this.getId());
      }

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      if (null != o.getLotNumber()) {
        this.lotNumber = new String(o.getLotNumber());
      }

      if (null != o.getManufacturer()) {
        this.manufacturer = new String(o.getManufacturer());
      }

      if (null != o.getManufactureDate()) {
        this.manufactureDate = new String(o.getManufactureDate());
      }

      if (null != o.getExpirationDate()) {
        this.expirationDate = new String(o.getExpirationDate());
      }

      if (null != o.getModel()) {
        this.model = new String(o.getModel());
      }

      if (null != o.getVersion()) {
        this.version = new String(o.getVersion());
      }

      if (null != o.getPatient()) {
        this.patient = new Reference(o.getPatient());
        this.patient.setId(this.getId());
      }

      if (null != o.getOwner()) {
        this.owner = new Reference(o.getOwner());
        this.owner.setId(this.getId());
      }

      this.contact = ContactPoint.fromArray(o.getContact());
      if (null != o.getLocation()) {
        this.location = new Reference(o.getLocation());
        this.location.setId(this.getId());
      }

      if (null != o.getUrl()) {
        this.url = new String(o.getUrl());
      }

      this.note = Annotation.fromArray(o.getNote());
      this.safety = CodeableConcept.fromArray(o.getSafety());
      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("udi" + "[" + String.valueOf(this.udi) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("lotNumber" + "[" + String.valueOf(this.lotNumber) + "]\n"); 
     builder.append("_lotNumber" + "[" + String.valueOf(this._lotNumber) + "]\n"); 
     builder.append("manufacturer" + "[" + String.valueOf(this.manufacturer) + "]\n"); 
     builder.append("_manufacturer" + "[" + String.valueOf(this._manufacturer) + "]\n"); 
     builder.append("manufactureDate" + "[" + String.valueOf(this.manufactureDate) + "]\n"); 
     builder.append("_manufactureDate" + "[" + String.valueOf(this._manufactureDate) + "]\n"); 
     builder.append("expirationDate" + "[" + String.valueOf(this.expirationDate) + "]\n"); 
     builder.append("_expirationDate" + "[" + String.valueOf(this._expirationDate) + "]\n"); 
     builder.append("model" + "[" + String.valueOf(this.model) + "]\n"); 
     builder.append("_model" + "[" + String.valueOf(this._model) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("_version" + "[" + String.valueOf(this._version) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("owner" + "[" + String.valueOf(this.owner) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("_url" + "[" + String.valueOf(this._url) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("safety" + "[" + String.valueOf(this.safety) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<Device> fromArray(java.util.List<DeviceModel> list) {
    return (java.util.List<Device>)list.stream()
      .map(model -> new Device(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DeviceModel> toModelArray(java.util.List<Device> list) {
    return (java.util.List<DeviceModel>)list.stream()
      .map(model -> new DeviceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Device fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Device.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Device o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Device> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}