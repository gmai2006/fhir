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
public class Patient  extends DomainResource  {
  /**
  * Description: "This is a Patient resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An identifier for this patient."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Whether this patient record is in active use."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "A name associated with the individual."
  */
  protected java.util.List<HumanName> name = new java.util.ArrayList<>();

  /**
  * Description: "A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted."
  */
  protected java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes."
  */
  protected String gender;

  /**
  * Description: "Extensions for gender"
  */
  protected transient Element _gender;

  /**
  * Description: "The date of birth for the individual."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String birthDate;

  /**
  * Description: "Extensions for birthDate"
  */
  protected transient Element _birthDate;

  /**
  * Description: "Indicates if the individual is deceased or not."
  */
  protected Boolean deceasedBoolean;

  /**
  * Description: "Extensions for deceasedBoolean"
  */
  protected transient Element _deceasedBoolean;

  /**
  * Description: "Indicates if the individual is deceased or not."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String deceasedDateTime;

  /**
  * Description: "Extensions for deceasedDateTime"
  */
  protected transient Element _deceasedDateTime;

  /**
  * Description: "Addresses for the individual."
  */
  protected java.util.List<Address> address = new java.util.ArrayList<>();

  /**
  * Description: "This field contains a patient's most recent marital (civil) status."
  */
  protected CodeableConcept maritalStatus;

  /**
  * Description: "Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer)."
  */
  protected Boolean multipleBirthBoolean;

  /**
  * Description: "Extensions for multipleBirthBoolean"
  */
  protected transient Element _multipleBirthBoolean;

  /**
  * Description: "Indicates whether the patient is part of a multiple (bool) or indicates the actual birth order (integer)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float multipleBirthInteger;

  /**
  * Description: "Extensions for multipleBirthInteger"
  */
  protected transient Element _multipleBirthInteger;

  /**
  * Description: "Image of the patient."
  */
  protected java.util.List<Attachment> photo = new java.util.ArrayList<>();

  /**
  * Description: "A contact party (e.g. guardian, partner, friend) for the patient."
  */
  protected java.util.List<PatientContact> contact = new java.util.ArrayList<>();

  /**
  * Description: "This patient is known to be an animal."
  */
  protected PatientAnimal animal;

  /**
  * Description: "Languages which may be used to communicate with the patient about his or her health."
  */
  protected java.util.List<PatientCommunication> communication = new java.util.ArrayList<>();

  /**
  * Description: "Patient's nominated care provider."
  */
  protected java.util.List<Reference> generalPractitioner = new java.util.ArrayList<>();

  /**
  * Description: "Organization that is the custodian of the patient record."
  */
  protected Reference managingOrganization;

  /**
  * Description: "Link to another patient resource that concerns the same actual patient."
  */
  protected java.util.List<PatientLink> link = new java.util.ArrayList<>();

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
    if (null != o.getAddress() && !o.getAddress().isEmpty()) {
    	this.address = AddressHelper.fromArray2Array(o.getAddress());
    }
    if (null != o.getMaritalStatus() && !o.getMaritalStatus().isEmpty()) {
      this.maritalStatus = new CodeableConcept(o.getMaritalStatus().get(0));
    }
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
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); ;
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