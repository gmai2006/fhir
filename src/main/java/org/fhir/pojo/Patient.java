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
import org.fhir.entity.PatientModel;
import com.google.gson.GsonBuilder;

/**
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
*/
public class Patient  {
  /**
  * Description: "This is a Patient resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "An identifier for this patient."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Whether this patient record is in active use."
  */
  private Boolean active;

  /**
  * Description: "Extensions for active"
  */
  private transient Element _active;

  /**
  * Description: "A name associated with the individual."
  */
  private java.util.List<HumanName> name = new java.util.ArrayList<>();

  /**
  * Description: "A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted."
  */
  private java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes."
  */
  private String gender;

  /**
  * Description: "Extensions for gender"
  */
  private transient Element _gender;

  /**
  * Description: "The date of birth for the individual."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String birthDate;

  /**
  * Description: "Extensions for birthDate"
  */
  private transient Element _birthDate;

  /**
  * Description: "Indicates if the individual is deceased or not."
  */
  private Boolean deceasedBoolean;

  /**
  * Description: "Extensions for deceasedBoolean"
  */
  private transient Element _deceasedBoolean;

  /**
  * Description: "Indicates if the individual is deceased or not."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String deceasedDateTime;

  /**
  * Description: "Extensions for deceasedDateTime"
  */
  private transient Element _deceasedDateTime;

  /**
  * Description: "Addresses for the individual."
  */
  private java.util.List<Address> address = new java.util.ArrayList<>();

  /**
  * Description: "This field contains a patient's most recent marital (civil) status."
  */
  private CodeableConcept maritalStatus;

  /**
  * Description: "Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer)."
  */
  private Boolean multipleBirthBoolean;

  /**
  * Description: "Extensions for multipleBirthBoolean"
  */
  private transient Element _multipleBirthBoolean;

  /**
  * Description: "Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float multipleBirthInteger;

  /**
  * Description: "Extensions for multipleBirthInteger"
  */
  private transient Element _multipleBirthInteger;

  /**
  * Description: "Image of the patient."
  */
  private java.util.List<Attachment> photo = new java.util.ArrayList<>();

  /**
  * Description: "A contact party (e.g. guardian, partner, friend) for the patient."
  */
  private java.util.List<PatientContact> contact = new java.util.ArrayList<>();

  /**
  * Description: "This patient is known to be an animal."
  */
  private PatientAnimal animal;

  /**
  * Description: "Languages which may be used to communicate with the patient about his or her health."
  */
  private java.util.List<PatientCommunication> communication = new java.util.ArrayList<>();

  /**
  * Description: "Patient's nominated care provider."
  */
  private java.util.List<Reference> generalPractitioner = new java.util.ArrayList<>();

  /**
  * Description: "Organization that is the custodian of the patient record."
  */
  private Reference managingOrganization;

  /**
  * Description: "Link to another patient resource that concerns the same actual patient."
  */
  private java.util.List<PatientLink> link = new java.util.ArrayList<>();

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

  public Patient() {
  }

  public Patient(PatientModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getActive()) {
        this.active = new Boolean(o.getActive());
      }

      this.name = HumanName.fromArray(o.getName());
      this.telecom = ContactPoint.fromArray(o.getTelecom());
      if (null != o.getGender()) {
        this.gender = new String(o.getGender());
      }

      if (null != o.getBirthDate()) {
        this.birthDate = new String(o.getBirthDate());
      }

      if (null != o.getDeceasedBoolean()) {
        this.deceasedBoolean = new Boolean(o.getDeceasedBoolean());
      }

      if (null != o.getDeceasedDateTime()) {
        this.deceasedDateTime = new String(o.getDeceasedDateTime());
      }

      this.address = Address.fromArray(o.getAddress());
      this.maritalStatus = CodeableConcept.fromJson(o.getMaritalStatus());
      if (null != o.getMultipleBirthBoolean()) {
        this.multipleBirthBoolean = new Boolean(o.getMultipleBirthBoolean());
      }

      if (null != o.getMultipleBirthInteger()) {
        this.multipleBirthInteger = new Float(o.getMultipleBirthInteger());
      }

      this.photo = Attachment.fromArray(o.getPhoto());
      this.contact = PatientContact.fromArray(o.getContact());

      if (null != o.getAnimal()) {
        this.animal = new PatientAnimal(o.getAnimal());
        this.animal.setId(this.getId());
      }

      this.communication = PatientCommunication.fromArray(o.getCommunication());

      this.generalPractitioner = Reference.fromArray(o.getGeneralPractitioner());

      if (null != o.getManagingOrganization()) {
        this.managingOrganization = new Reference(o.getManagingOrganization());
        this.managingOrganization.setId(this.getId());
      }

      this.link = PatientLink.fromArray(o.getLink());

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
  public void setActive( Boolean value) {
    this.active = value;
  }
  public Boolean getActive() {
    return this.active;
  }
  public void set_active( Element value) {
    this._active = value;
  }
  public Element get_active() {
    return this._active;
  }
  public void setName( java.util.List<HumanName> value) {
    this.name = value;
  }
  public java.util.List<HumanName> getName() {
    return this.name;
  }
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
  }
  public void setGender( String value) {
    this.gender = GenderEnum.fromCode(value);
  }
  public String getGender() {
    return this.gender;
  }
  public void set_gender( Element value) {
    this._gender = value;
  }
  public Element get_gender() {
    return this._gender;
  }
  public void setBirthDate( String value) {
    this.birthDate = value;
  }
  public String getBirthDate() {
    return this.birthDate;
  }
  public void set_birthDate( Element value) {
    this._birthDate = value;
  }
  public Element get_birthDate() {
    return this._birthDate;
  }
  public void setDeceasedBoolean( Boolean value) {
    this.deceasedBoolean = value;
  }
  public Boolean getDeceasedBoolean() {
    return this.deceasedBoolean;
  }
  public void set_deceasedBoolean( Element value) {
    this._deceasedBoolean = value;
  }
  public Element get_deceasedBoolean() {
    return this._deceasedBoolean;
  }
  public void setDeceasedDateTime( String value) {
    this.deceasedDateTime = value;
  }
  public String getDeceasedDateTime() {
    return this.deceasedDateTime;
  }
  public void set_deceasedDateTime( Element value) {
    this._deceasedDateTime = value;
  }
  public Element get_deceasedDateTime() {
    return this._deceasedDateTime;
  }
  public void setAddress( java.util.List<Address> value) {
    this.address = value;
  }
  public java.util.List<Address> getAddress() {
    return this.address;
  }
  public void setMaritalStatus( CodeableConcept value) {
    this.maritalStatus = value;
  }
  public CodeableConcept getMaritalStatus() {
    return this.maritalStatus;
  }
  public void setMultipleBirthBoolean( Boolean value) {
    this.multipleBirthBoolean = value;
  }
  public Boolean getMultipleBirthBoolean() {
    return this.multipleBirthBoolean;
  }
  public void set_multipleBirthBoolean( Element value) {
    this._multipleBirthBoolean = value;
  }
  public Element get_multipleBirthBoolean() {
    return this._multipleBirthBoolean;
  }
  public void setMultipleBirthInteger( Float value) {
    this.multipleBirthInteger = value;
  }
  public Float getMultipleBirthInteger() {
    return this.multipleBirthInteger;
  }
  public void set_multipleBirthInteger( Element value) {
    this._multipleBirthInteger = value;
  }
  public Element get_multipleBirthInteger() {
    return this._multipleBirthInteger;
  }
  public void setPhoto( java.util.List<Attachment> value) {
    this.photo = value;
  }
  public java.util.List<Attachment> getPhoto() {
    return this.photo;
  }
  public void setContact( java.util.List<PatientContact> value) {
    this.contact = value;
  }
  public java.util.List<PatientContact> getContact() {
    return this.contact;
  }
  public void setAnimal( PatientAnimal value) {
    this.animal = value;
  }
  public PatientAnimal getAnimal() {
    return this.animal;
  }
  public void setCommunication( java.util.List<PatientCommunication> value) {
    this.communication = value;
  }
  public java.util.List<PatientCommunication> getCommunication() {
    return this.communication;
  }
  public void setGeneralPractitioner( java.util.List<Reference> value) {
    this.generalPractitioner = value;
  }
  public java.util.List<Reference> getGeneralPractitioner() {
    return this.generalPractitioner;
  }
  public void setManagingOrganization( Reference value) {
    this.managingOrganization = value;
  }
  public Reference getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setLink( java.util.List<PatientLink> value) {
    this.link = value;
  }
  public java.util.List<PatientLink> getLink() {
    return this.link;
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
     builder.append("active" + "[" + String.valueOf(this.active) + "]\n"); 
     builder.append("_active" + "[" + String.valueOf(this._active) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
     builder.append("gender" + "[" + String.valueOf(this.gender) + "]\n"); 
     builder.append("_gender" + "[" + String.valueOf(this._gender) + "]\n"); 
     builder.append("birthDate" + "[" + String.valueOf(this.birthDate) + "]\n"); 
     builder.append("_birthDate" + "[" + String.valueOf(this._birthDate) + "]\n"); 
     builder.append("deceasedBoolean" + "[" + String.valueOf(this.deceasedBoolean) + "]\n"); 
     builder.append("_deceasedBoolean" + "[" + String.valueOf(this._deceasedBoolean) + "]\n"); 
     builder.append("deceasedDateTime" + "[" + String.valueOf(this.deceasedDateTime) + "]\n"); 
     builder.append("_deceasedDateTime" + "[" + String.valueOf(this._deceasedDateTime) + "]\n"); 
     builder.append("address" + "[" + String.valueOf(this.address) + "]\n"); 
     builder.append("maritalStatus" + "[" + String.valueOf(this.maritalStatus) + "]\n"); 
     builder.append("multipleBirthBoolean" + "[" + String.valueOf(this.multipleBirthBoolean) + "]\n"); 
     builder.append("_multipleBirthBoolean" + "[" + String.valueOf(this._multipleBirthBoolean) + "]\n"); 
     builder.append("multipleBirthInteger" + "[" + String.valueOf(this.multipleBirthInteger) + "]\n"); 
     builder.append("_multipleBirthInteger" + "[" + String.valueOf(this._multipleBirthInteger) + "]\n"); 
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
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Patient,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Patient" : { return Patient.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum GenderEnum {
  	male,
  	female,
  	other,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "male" : { return male.toString(); }
  			case "female" : { return female.toString(); }
  			case "other" : { return other.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Patient> fromArray(java.util.List<PatientModel> list) {
    return (java.util.List<Patient>)list.stream()
      .map(model -> new Patient(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<PatientModel> toModelArray(java.util.List<Patient> list) {
    return (java.util.List<PatientModel>)list.stream()
      .map(model -> new PatientModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Patient fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Patient.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Patient o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Patient> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}