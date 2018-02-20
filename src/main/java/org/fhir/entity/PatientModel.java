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
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
*/
@Entity
@Table(name="patient")
public class PatientModel  implements Serializable {
	private static final long serialVersionUID = 151910893745481614L;
  /**
  * Description: "This is a Patient resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An identifier for this patient."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Whether this patient record is in active use."
  */
  @javax.persistence.Basic
  @Column(name="\"active\"")
  private Boolean active;

  /**
  * Description: "A name associated with the individual."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"name\"", length = 16777215)
  private String name;

  /**
  * Description: "A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"telecom\"", length = 16777215)
  private String telecom;

  /**
  * Description: "Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes."
  */
  @javax.persistence.Basic
  @Column(name="\"gender\"")
  private String gender;

  /**
  * Description: "The date of birth for the individual."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"birthDate\"")
  private String birthDate;

  /**
  * Description: "Indicates if the individual is deceased or not."
  */
  @javax.persistence.Basic
  @Column(name="\"deceasedBoolean\"")
  private Boolean deceasedBoolean;

  /**
  * Description: "Indicates if the individual is deceased or not."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"deceasedDateTime\"")
  private String deceasedDateTime;

  /**
  * Description: "Addresses for the individual."
  */
  @javax.persistence.Basic
  @Column(name="\"address_id\"")
  private String address_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="address_id", insertable=false, updatable=false)
  private java.util.List<AddressModel> address;

  /**
  * Description: "This field contains a patient's most recent marital (civil) status."
  */
  @javax.persistence.Basic
  @Column(name="\"maritalstatus_id\"")
  private String maritalstatus_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="maritalstatus_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> maritalStatus;

  /**
  * Description: "Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer)."
  */
  @javax.persistence.Basic
  @Column(name="\"multipleBirthBoolean\"")
  private Boolean multipleBirthBoolean;

  /**
  * Description: "Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"multipleBirthInteger\"")
  private Float multipleBirthInteger;

  /**
  * Description: "Image of the patient."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"photo\"", length = 16777215)
  private String photo;

  /**
  * Description: "A contact party (e.g. guardian, partner, friend) for the patient."
  */
  @javax.persistence.Basic
  @Column(name="\"contact_id\"")
  private String contact_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="contact_id", insertable=false, updatable=false)
  private java.util.List<PatientContactModel> contact;

  /**
  * Description: "This patient is known to be an animal."
  */
  @javax.persistence.Basic
  @Column(name="\"animal_id\"")
  private String animal_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="animal_id", insertable=false, updatable=false)
  private java.util.List<PatientAnimalModel> animal;

  /**
  * Description: "Languages which may be used to communicate with the patient about his or her health."
  */
  @javax.persistence.Basic
  @Column(name="\"communication_id\"")
  private String communication_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="communication_id", insertable=false, updatable=false)
  private java.util.List<PatientCommunicationModel> communication;

  /**
  * Description: "Patient's nominated care provider."
  */
  @javax.persistence.Basic
  @Column(name="\"generalpractitioner_id\"")
  private String generalpractitioner_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="generalpractitioner_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> generalPractitioner;

  /**
  * Description: "Organization that is the custodian of the patient record."
  */
  @javax.persistence.Basic
  @Column(name="\"managingorganization_id\"")
  private String managingorganization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="managingorganization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> managingOrganization;

  /**
  * Description: "Link to another patient resource that concerns the same actual patient."
  */
  @javax.persistence.Basic
  @Column(name="\"link_id\"")
  private String link_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="link_id", insertable=false, updatable=false)
  private java.util.List<PatientLinkModel> link;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

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

  public PatientModel() {
  }

  public PatientModel(Patient o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.active = o.getActive();
    if (null != o.getName()) {
    	this.name = JsonUtils.toJson(o.getName());
    }
    if (null != o.getTelecom()) {
    	this.telecom = JsonUtils.toJson(o.getTelecom());
    }
    this.gender = o.getGender();
    this.birthDate = o.getBirthDate();
    this.deceasedBoolean = o.getDeceasedBoolean();
    this.deceasedDateTime = o.getDeceasedDateTime();
    if (null != o.getAddress() && !o.getAddress().isEmpty()) {
    	this.address_id = "address" + this.id;
    	this.address = AddressHelper.toModelFromArray(o.getAddress(), this.address_id);
    }
    if (null != o.getMaritalStatus() ) {
    	this.maritalstatus_id = "maritalstatus" + this.id;
    	this.maritalStatus = CodeableConceptHelper.toModel(o.getMaritalStatus(), this.maritalstatus_id);
    }
    this.multipleBirthBoolean = o.getMultipleBirthBoolean();
    this.multipleBirthInteger = o.getMultipleBirthInteger();
    if (null != o.getPhoto()) {
    	this.photo = JsonUtils.toJson(o.getPhoto());
    }
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact_id = "contact" + this.id;
    	this.contact = PatientContactHelper.toModelFromArray(o.getContact(), this.contact_id);
    }
    if (null != o.getAnimal() ) {
    	this.animal_id = "animal" + this.id;
    	this.animal = PatientAnimalHelper.toModel(o.getAnimal(), this.animal_id);
    }
    if (null != o.getCommunication() && !o.getCommunication().isEmpty()) {
    	this.communication_id = "communication" + this.id;
    	this.communication = PatientCommunicationHelper.toModelFromArray(o.getCommunication(), this.communication_id);
    }
    if (null != o.getGeneralPractitioner() && !o.getGeneralPractitioner().isEmpty()) {
    	this.generalpractitioner_id = "generalpractitioner" + this.id;
    	this.generalPractitioner = ReferenceHelper.toModelFromArray(o.getGeneralPractitioner(), this.generalpractitioner_id);
    }
    if (null != o.getManagingOrganization() ) {
    	this.managingorganization_id = "managingorganization" + this.id;
    	this.managingOrganization = ReferenceHelper.toModel(o.getManagingOrganization(), this.managingorganization_id);
    }
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link_id = "link" + this.id;
    	this.link = PatientLinkHelper.toModelFromArray(o.getLink(), this.link_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public Boolean getActive() {
    return this.active;
  }
  public void setActive( Boolean value) {
    this.active = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getTelecom() {
    return this.telecom;
  }
  public void setTelecom( String value) {
    this.telecom = value;
  }
  public String getGender() {
    return this.gender;
  }
  public void setGender( String value) {
    this.gender = value;
  }
  public String getBirthDate() {
    return this.birthDate;
  }
  public void setBirthDate( String value) {
    this.birthDate = value;
  }
  public Boolean getDeceasedBoolean() {
    return this.deceasedBoolean;
  }
  public void setDeceasedBoolean( Boolean value) {
    this.deceasedBoolean = value;
  }
  public String getDeceasedDateTime() {
    return this.deceasedDateTime;
  }
  public void setDeceasedDateTime( String value) {
    this.deceasedDateTime = value;
  }
  public java.util.List<AddressModel> getAddress() {
    return this.address;
  }
  public void setAddress( java.util.List<AddressModel> value) {
    this.address = value;
  }
  public java.util.List<CodeableConceptModel> getMaritalStatus() {
    return this.maritalStatus;
  }
  public void setMaritalStatus( java.util.List<CodeableConceptModel> value) {
    this.maritalStatus = value;
  }
  public Boolean getMultipleBirthBoolean() {
    return this.multipleBirthBoolean;
  }
  public void setMultipleBirthBoolean( Boolean value) {
    this.multipleBirthBoolean = value;
  }
  public Float getMultipleBirthInteger() {
    return this.multipleBirthInteger;
  }
  public void setMultipleBirthInteger( Float value) {
    this.multipleBirthInteger = value;
  }
  public String getPhoto() {
    return this.photo;
  }
  public void setPhoto( String value) {
    this.photo = value;
  }
  public java.util.List<PatientContactModel> getContact() {
    return this.contact;
  }
  public void setContact( java.util.List<PatientContactModel> value) {
    this.contact = value;
  }
  public java.util.List<PatientAnimalModel> getAnimal() {
    return this.animal;
  }
  public void setAnimal( java.util.List<PatientAnimalModel> value) {
    this.animal = value;
  }
  public java.util.List<PatientCommunicationModel> getCommunication() {
    return this.communication;
  }
  public void setCommunication( java.util.List<PatientCommunicationModel> value) {
    this.communication = value;
  }
  public java.util.List<ReferenceModel> getGeneralPractitioner() {
    return this.generalPractitioner;
  }
  public void setGeneralPractitioner( java.util.List<ReferenceModel> value) {
    this.generalPractitioner = value;
  }
  public java.util.List<ReferenceModel> getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setManagingOrganization( java.util.List<ReferenceModel> value) {
    this.managingOrganization = value;
  }
  public java.util.List<PatientLinkModel> getLink() {
    return this.link;
  }
  public void setLink( java.util.List<PatientLinkModel> value) {
    this.link = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PatientModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("active" + "->" + this.active + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("telecom" + "->" + this.telecom + "\n"); 
     builder.append("gender" + "->" + this.gender + "\n"); 
     builder.append("birthDate" + "->" + this.birthDate + "\n"); 
     builder.append("deceasedBoolean" + "->" + this.deceasedBoolean + "\n"); 
     builder.append("deceasedDateTime" + "->" + this.deceasedDateTime + "\n"); 
     builder.append("multipleBirthBoolean" + "->" + this.multipleBirthBoolean + "\n"); 
     builder.append("multipleBirthInteger" + "->" + this.multipleBirthInteger + "\n"); 
     builder.append("photo" + "->" + this.photo + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PatientModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("active" + "->" + this.active + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("telecom" + "->" + this.telecom + "\n"); 
     builder.append("gender" + "->" + this.gender + "\n"); 
     builder.append("birthDate" + "->" + this.birthDate + "\n"); 
     builder.append("deceasedBoolean" + "->" + this.deceasedBoolean + "\n"); 
     builder.append("deceasedDateTime" + "->" + this.deceasedDateTime + "\n"); 
     builder.append("address" + "->" + this.address + "\n"); 
     builder.append("maritalStatus" + "->" + this.maritalStatus + "\n"); 
     builder.append("multipleBirthBoolean" + "->" + this.multipleBirthBoolean + "\n"); 
     builder.append("multipleBirthInteger" + "->" + this.multipleBirthInteger + "\n"); 
     builder.append("photo" + "->" + this.photo + "\n"); 
     builder.append("contact" + "->" + this.contact + "\n"); 
     builder.append("animal" + "->" + this.animal + "\n"); 
     builder.append("communication" + "->" + this.communication + "\n"); 
     builder.append("generalPractitioner" + "->" + this.generalPractitioner + "\n"); 
     builder.append("managingOrganization" + "->" + this.managingOrganization + "\n"); 
     builder.append("link" + "->" + this.link + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}