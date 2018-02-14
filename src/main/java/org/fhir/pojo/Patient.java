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
  @javax.validation.constraints.NotNull
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
      this.resourceType = o.getResourceType();
    }
    if (null != o.getActive()) {
      this.active = o.getActive();
    }
    if (null != o.getGender()) {
      this.gender = o.getGender();
    }
    if (null != o.getBirthDate()) {
      this.birthDate = o.getBirthDate();
    }
    if (null != o.getDeceasedBoolean()) {
      this.deceasedBoolean = o.getDeceasedBoolean();
    }
    if (null != o.getDeceasedDateTime()) {
      this.deceasedDateTime = o.getDeceasedDateTime();
    }
    this.maritalStatus = CodeableConceptHelper.fromJson(o.getMaritalStatus());
    if (null != o.getMultipleBirthBoolean()) {
      this.multipleBirthBoolean = o.getMultipleBirthBoolean();
    }
    if (null != o.getMultipleBirthInteger()) {
      this.multipleBirthInteger = o.getMultipleBirthInteger();
    }
    if (null != o.getContact() && !o.getContact().isEmpty()) {
    	this.contact = PatientContactHelper.fromArray2Array(o.getContact());
    }
    if (null != o.getAnimal() && !o.getAnimal().isEmpty()) {
      this.animal = new PatientAnimal(o.getAnimal().get(0));
    }
    if (null != o.getCommunication() && !o.getCommunication().isEmpty()) {
    	this.communication = PatientCommunicationHelper.fromArray2Array(o.getCommunication());
    }
    if (null != o.getGeneralPractitioner() && !o.getGeneralPractitioner().isEmpty()) {
    	this.generalPractitioner = ReferenceHelper.fromArray2Array(o.getGeneralPractitioner());
    }
    if (null != o.getManagingOrganization() && !o.getManagingOrganization().isEmpty()) {
      this.managingOrganization = new Reference(o.getManagingOrganization().get(0));
    }
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link = PatientLinkHelper.fromArray2Array(o.getLink());
    }
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
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
    builder.append("[Patient]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.gender != null) builder.append("gender" + "->" + this.gender.toString() + "\n"); 
     if(this._gender != null) builder.append("_gender" + "->" + this._gender.toString() + "\n"); 
     if(this.birthDate != null) builder.append("birthDate" + "->" + this.birthDate.toString() + "\n"); 
     if(this._birthDate != null) builder.append("_birthDate" + "->" + this._birthDate.toString() + "\n"); 
     if(this.deceasedBoolean != null) builder.append("deceasedBoolean" + "->" + this.deceasedBoolean.toString() + "\n"); 
     if(this._deceasedBoolean != null) builder.append("_deceasedBoolean" + "->" + this._deceasedBoolean.toString() + "\n"); 
     if(this.deceasedDateTime != null) builder.append("deceasedDateTime" + "->" + this.deceasedDateTime.toString() + "\n"); 
     if(this._deceasedDateTime != null) builder.append("_deceasedDateTime" + "->" + this._deceasedDateTime.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this.maritalStatus != null) builder.append("maritalStatus" + "->" + this.maritalStatus.toString() + "\n"); 
     if(this.multipleBirthBoolean != null) builder.append("multipleBirthBoolean" + "->" + this.multipleBirthBoolean.toString() + "\n"); 
     if(this._multipleBirthBoolean != null) builder.append("_multipleBirthBoolean" + "->" + this._multipleBirthBoolean.toString() + "\n"); 
     if(this.multipleBirthInteger != null) builder.append("multipleBirthInteger" + "->" + this.multipleBirthInteger.toString() + "\n"); 
     if(this._multipleBirthInteger != null) builder.append("_multipleBirthInteger" + "->" + this._multipleBirthInteger.toString() + "\n"); 
     if(this.photo != null) builder.append("photo" + "->" + this.photo.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.animal != null) builder.append("animal" + "->" + this.animal.toString() + "\n"); 
     if(this.communication != null) builder.append("communication" + "->" + this.communication.toString() + "\n"); 
     if(this.generalPractitioner != null) builder.append("generalPractitioner" + "->" + this.generalPractitioner.toString() + "\n"); 
     if(this.managingOrganization != null) builder.append("managingOrganization" + "->" + this.managingOrganization.toString() + "\n"); 
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
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

}