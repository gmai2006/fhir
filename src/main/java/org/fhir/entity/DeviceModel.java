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

/**
* "This resource identifies an instance or a type of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices include durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc."
*/
@Entity
@Table(name="device")
public class DeviceModel  {
  /**
  * Description: "This is a Device resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Unique instance identifiers assigned to a device by manufacturers other organizations or owners."
  * Actual type: Array of Identifier-> List<Identifier>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "[Unique device identifier (UDI)](device.html#5.11.3.2.2) assigned to device label or package."
  */
  @javax.persistence.Basic
  @Column(name="\"udi_id\"")
  private String udi_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`udi_id`", insertable=false, updatable=false)
  private DeviceUdiModel udi;

  /**
  * Description: "Status of the Device availability."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Code or identifier to identify a kind of device."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "Lot number assigned by the manufacturer."
  */
  @javax.persistence.Basic
  @Column(name="\"lotNumber\"")
  private String lotNumber;

  /**
  * Description: "A name of the manufacturer."
  */
  @javax.persistence.Basic
  @Column(name="\"manufacturer\"")
  private String manufacturer;

  /**
  * Description: "The date and time when the device was manufactured."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"manufactureDate\"")
  private String manufactureDate;

  /**
  * Description: "The date and time beyond which this device is no longer valid or should not be used (if applicable)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"expirationDate\"")
  private String expirationDate;

  /**
  * Description: "The \"model\" is an identifier assigned by the manufacturer to identify the product by its type. This number is shared by the all devices sold as the same type."
  */
  @javax.persistence.Basic
  @Column(name="\"model\"")
  private String model;

  /**
  * Description: "The version of the device, if the device has multiple releases under the same model, or if the device is software or carries firmware."
  */
  @javax.persistence.Basic
  @Column(name="\"version\"")
  private String version;

  /**
  * Description: "Patient information, If the device is affixed to a person."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`patient_id`", insertable=false, updatable=false)
  private ReferenceModel patient;

  /**
  * Description: "An organization that is responsible for the provision and ongoing maintenance of the device."
  */
  @javax.persistence.Basic
  @Column(name="\"owner_id\"")
  private String owner_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`owner_id`", insertable=false, updatable=false)
  private ReferenceModel owner;

  /**
  * Description: "Contact details for an organization or a particular human that is responsible for the device."
  * Actual type: Array of ContactPoint-> List<ContactPoint>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contact\"", length = 16777215)
  private String contact;

  /**
  * Description: "The place where the device can be found."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`location_id`", insertable=false, updatable=false)
  private ReferenceModel location;

  /**
  * Description: "A network address on which the device may be contacted directly."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "Descriptive information, usage information or implantation information that is not captured in an existing element."
  * Actual type: Array of Annotation-> List<Annotation>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Provides additional safety characteristics about a medical device.  For example devices containing latex."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"safety\"", length = 16777215)
  private String safety;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;


  public DeviceModel() {
  }

  public DeviceModel(Device o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      if (null != o.getUdi()) {
      	this.udi_id = "udi" + this.getId();
        this.udi = new DeviceUdiModel(o.getUdi());
        this.udi.setId(this.udi_id);
        this.udi.parent_id = this.udi.getId();
      }

      this.status = o.getStatus();

      this.type = CodeableConcept.toJson(o.getType());
      this.lotNumber = o.getLotNumber();

      this.manufacturer = o.getManufacturer();

      this.manufactureDate = o.getManufactureDate();

      this.expirationDate = o.getExpirationDate();

      this.model = o.getModel();

      this.version = o.getVersion();

      if (null != o.getPatient()) {
      	this.patient_id = "patient" + this.getId();
        this.patient = new ReferenceModel(o.getPatient());
        this.patient.setId(this.patient_id);
        this.patient.parent_id = this.patient.getId();
      }

      if (null != o.getOwner()) {
      	this.owner_id = "owner" + this.getId();
        this.owner = new ReferenceModel(o.getOwner());
        this.owner.setId(this.owner_id);
        this.owner.parent_id = this.owner.getId();
      }

      this.contact = ContactPoint.toJson(o.getContact());
      if (null != o.getLocation()) {
      	this.location_id = "location" + this.getId();
        this.location = new ReferenceModel(o.getLocation());
        this.location.setId(this.location_id);
        this.location.parent_id = this.location.getId();
      }

      this.url = o.getUrl();

      this.note = Annotation.toJson(o.getNote());
      this.safety = CodeableConcept.toJson(o.getSafety());
      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setUdi( DeviceUdiModel value) {
    this.udi = value;
  }
  public DeviceUdiModel getUdi() {
    return this.udi;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setLotNumber( String value) {
    this.lotNumber = value;
  }
  public String getLotNumber() {
    return this.lotNumber;
  }
  public void setManufacturer( String value) {
    this.manufacturer = value;
  }
  public String getManufacturer() {
    return this.manufacturer;
  }
  public void setManufactureDate( String value) {
    this.manufactureDate = value;
  }
  public String getManufactureDate() {
    return this.manufactureDate;
  }
  public void setExpirationDate( String value) {
    this.expirationDate = value;
  }
  public String getExpirationDate() {
    return this.expirationDate;
  }
  public void setModel( String value) {
    this.model = value;
  }
  public String getModel() {
    return this.model;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void setPatient( ReferenceModel value) {
    this.patient = value;
  }
  public ReferenceModel getPatient() {
    return this.patient;
  }
  public void setOwner( ReferenceModel value) {
    this.owner = value;
  }
  public ReferenceModel getOwner() {
    return this.owner;
  }
  public void setContact( String value) {
    this.contact = value;
  }
  public String getContact() {
    return this.contact;
  }
  public void setLocation( ReferenceModel value) {
    this.location = value;
  }
  public ReferenceModel getLocation() {
    return this.location;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setSafety( String value) {
    this.safety = value;
  }
  public String getSafety() {
    return this.safety;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("udi" + "[" + String.valueOf(this.udi) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("lotNumber" + "[" + String.valueOf(this.lotNumber) + "]\n"); 
     builder.append("manufacturer" + "[" + String.valueOf(this.manufacturer) + "]\n"); 
     builder.append("manufactureDate" + "[" + String.valueOf(this.manufactureDate) + "]\n"); 
     builder.append("expirationDate" + "[" + String.valueOf(this.expirationDate) + "]\n"); 
     builder.append("model" + "[" + String.valueOf(this.model) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("patient" + "[" + String.valueOf(this.patient) + "]\n"); 
     builder.append("owner" + "[" + String.valueOf(this.owner) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
     builder.append("safety" + "[" + String.valueOf(this.safety) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}