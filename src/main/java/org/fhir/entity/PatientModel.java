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
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
*/
@Entity
@Table(name="patient")
public class PatientModel  {
  /**
  * Description: "This is a Patient resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "An identifier for this patient."
  * Actual type: Array of Identifier-> List<Identifier>
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
  * Actual type: Array of HumanName-> List<HumanName>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"name\"", length = 16777215)
  private String name;

  /**
  * Description: "A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted."
  * Actual type: Array of ContactPoint-> List<ContactPoint>
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
  * Actual type: Array of Address-> List<Address>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"address\"", length = 16777215)
  private String address;

  /**
  * Description: "This field contains a patient's most recent marital (civil) status."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"maritalStatus\"", length = 16777215)
  private String maritalStatus;

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
  * Actual type: Array of Attachment-> List<Attachment>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"photo\"", length = 16777215)
  private String photo;

  /**
  * Description: "A contact party (e.g. guardian, partner, friend) for the patient."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PatientContactModel> contact = new java.util.ArrayList<>();

  /**
  * Description: "This patient is known to be an animal."
  */
  @javax.persistence.Basic
  @Column(name="\"animal_id\"")
  private String animal_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`animal_id`", insertable=false, updatable=false)
  private PatientAnimalModel animal;

  /**
  * Description: "Languages which may be used to communicate with the patient about his or her health."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PatientCommunicationModel> communication = new java.util.ArrayList<>();

  /**
  * Description: "Patient's nominated care provider."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> generalPractitioner = new java.util.ArrayList<>();

  /**
  * Description: "Organization that is the custodian of the patient record."
  */
  @javax.persistence.Basic
  @Column(name="\"managingorganization_id\"")
  private String managingorganization_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`managingorganization_id`", insertable=false, updatable=false)
  private ReferenceModel managingOrganization;

  /**
  * Description: "Link to another patient resource that concerns the same actual patient."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<PatientLinkModel> link = new java.util.ArrayList<>();

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


  public PatientModel() {
  }

  public PatientModel(Patient o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.active = o.getActive();

      this.name = HumanName.toJson(o.getName());
      this.telecom = ContactPoint.toJson(o.getTelecom());
      this.gender = o.getGender();

      this.birthDate = o.getBirthDate();

      this.deceasedBoolean = o.getDeceasedBoolean();

      this.deceasedDateTime = o.getDeceasedDateTime();

      this.address = Address.toJson(o.getAddress());
      this.maritalStatus = CodeableConcept.toJson(o.getMaritalStatus());
      this.multipleBirthBoolean = o.getMultipleBirthBoolean();

      this.multipleBirthInteger = o.getMultipleBirthInteger();

      this.photo = Attachment.toJson(o.getPhoto());
      this.contact = PatientContact.toModelArray(o.getContact());

      if (null != o.getAnimal()) {
      	this.animal_id = "animal" + this.getId();
        this.animal = new PatientAnimalModel(o.getAnimal());
        this.animal.setId(this.animal_id);
        this.animal.parent_id = this.animal.getId();
      }

      this.communication = PatientCommunication.toModelArray(o.getCommunication());

      this.generalPractitioner = Reference.toModelArray(o.getGeneralPractitioner());

      if (null != o.getManagingOrganization()) {
      	this.managingorganization_id = "managingOrganization" + this.getId();
        this.managingOrganization = new ReferenceModel(o.getManagingOrganization());
        this.managingOrganization.setId(this.managingorganization_id);
        this.managingOrganization.parent_id = this.managingOrganization.getId();
      }

      this.link = PatientLink.toModelArray(o.getLink());

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
  public void setActive( Boolean value) {
    this.active = value;
  }
  public Boolean getActive() {
    return this.active;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setTelecom( String value) {
    this.telecom = value;
  }
  public String getTelecom() {
    return this.telecom;
  }
  public void setGender( String value) {
    this.gender = value;
  }
  public String getGender() {
    return this.gender;
  }
  public void setBirthDate( String value) {
    this.birthDate = value;
  }
  public String getBirthDate() {
    return this.birthDate;
  }
  public void setDeceasedBoolean( Boolean value) {
    this.deceasedBoolean = value;
  }
  public Boolean getDeceasedBoolean() {
    return this.deceasedBoolean;
  }
  public void setDeceasedDateTime( String value) {
    this.deceasedDateTime = value;
  }
  public String getDeceasedDateTime() {
    return this.deceasedDateTime;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void setMaritalStatus( String value) {
    this.maritalStatus = value;
  }
  public String getMaritalStatus() {
    return this.maritalStatus;
  }
  public void setMultipleBirthBoolean( Boolean value) {
    this.multipleBirthBoolean = value;
  }
  public Boolean getMultipleBirthBoolean() {
    return this.multipleBirthBoolean;
  }
  public void setMultipleBirthInteger( Float value) {
    this.multipleBirthInteger = value;
  }
  public Float getMultipleBirthInteger() {
    return this.multipleBirthInteger;
  }
  public void setPhoto( String value) {
    this.photo = value;
  }
  public String getPhoto() {
    return this.photo;
  }
  public void setContact( java.util.List<PatientContactModel> value) {
    this.contact = value;
  }
  public java.util.List<PatientContactModel> getContact() {
    return this.contact;
  }
  public void setAnimal( PatientAnimalModel value) {
    this.animal = value;
  }
  public PatientAnimalModel getAnimal() {
    return this.animal;
  }
  public void setCommunication( java.util.List<PatientCommunicationModel> value) {
    this.communication = value;
  }
  public java.util.List<PatientCommunicationModel> getCommunication() {
    return this.communication;
  }
  public void setGeneralPractitioner( java.util.List<ReferenceModel> value) {
    this.generalPractitioner = value;
  }
  public java.util.List<ReferenceModel> getGeneralPractitioner() {
    return this.generalPractitioner;
  }
  public void setManagingOrganization( ReferenceModel value) {
    this.managingOrganization = value;
  }
  public ReferenceModel getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setLink( java.util.List<PatientLinkModel> value) {
    this.link = value;
  }
  public java.util.List<PatientLinkModel> getLink() {
    return this.link;
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
     builder.append("active" + "[" + String.valueOf(this.active) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
     builder.append("gender" + "[" + String.valueOf(this.gender) + "]\n"); 
     builder.append("birthDate" + "[" + String.valueOf(this.birthDate) + "]\n"); 
     builder.append("deceasedBoolean" + "[" + String.valueOf(this.deceasedBoolean) + "]\n"); 
     builder.append("deceasedDateTime" + "[" + String.valueOf(this.deceasedDateTime) + "]\n"); 
     builder.append("address" + "[" + String.valueOf(this.address) + "]\n"); 
     builder.append("maritalStatus" + "[" + String.valueOf(this.maritalStatus) + "]\n"); 
     builder.append("multipleBirthBoolean" + "[" + String.valueOf(this.multipleBirthBoolean) + "]\n"); 
     builder.append("multipleBirthInteger" + "[" + String.valueOf(this.multipleBirthInteger) + "]\n"); 
     builder.append("photo" + "[" + String.valueOf(this.photo) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("animal" + "[" + String.valueOf(this.animal) + "]\n"); 
     builder.append("communication" + "[" + String.valueOf(this.communication) + "]\n"); 
     builder.append("generalPractitioner" + "[" + String.valueOf(this.generalPractitioner) + "]\n"); 
     builder.append("managingOrganization" + "[" + String.valueOf(this.managingOrganization) + "]\n"); 
     builder.append("link" + "[" + String.valueOf(this.link) + "]\n"); 
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