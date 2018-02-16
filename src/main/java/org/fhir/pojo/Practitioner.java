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
import org.fhir.entity.PractitionerModel;
import com.google.gson.GsonBuilder;

/**
* "A person who is directly or indirectly involved in the provisioning of healthcare."
*/
public class Practitioner  extends DomainResource  {
  /**
  * Description: "This is a Practitioner resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An identifier that applies to this person in this role."
  */
  protected java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "Whether this practitioner's record is in active use."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "The name(s) associated with the practitioner."
  */
  protected java.util.List<HumanName> name = new java.util.ArrayList<>();

  /**
  * Description: "A contact detail for the practitioner, e.g. a telephone number or an email address."
  */
  protected java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "Address(es) of the practitioner that are not role specific (typically home address). \rWork addresses are not typically entered in this property as they are usually role dependent."
  */
  protected java.util.List<Address> address = new java.util.ArrayList<>();

  /**
  * Description: "Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes."
  */
  protected String gender;

  /**
  * Description: "Extensions for gender"
  */
  protected transient Element _gender;

  /**
  * Description: "The date of birth for the practitioner."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String birthDate;

  /**
  * Description: "Extensions for birthDate"
  */
  protected transient Element _birthDate;

  /**
  * Description: "Image of the person."
  */
  protected java.util.List<Attachment> photo = new java.util.ArrayList<>();

  /**
  * Description: "Qualifications obtained by training and certification."
  */
  protected java.util.List<PractitionerQualification> qualification = new java.util.ArrayList<>();

  /**
  * Description: "A language the practitioner is able to use in patient communication."
  */
  protected java.util.List<CodeableConcept> communication = new java.util.ArrayList<>();

  public Practitioner() {
  }

  public Practitioner(PractitionerModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getActive()) {
      this.active = o.getActive();
    }
    if (null != o.getAddress() && !o.getAddress().isEmpty()) {
    	this.address = AddressHelper.fromArray2Array(o.getAddress());
    }
    if (null != o.getGender()) {
      this.gender = o.getGender();
    }
    if (null != o.getBirthDate()) {
      this.birthDate = o.getBirthDate();
    }
    if (null != o.getQualification() && !o.getQualification().isEmpty()) {
    	this.qualification = PractitionerQualificationHelper.fromArray2Array(o.getQualification());
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
  public void setAddress( java.util.List<Address> value) {
    this.address = value;
  }
  public java.util.List<Address> getAddress() {
    return this.address;
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
  public void setPhoto( java.util.List<Attachment> value) {
    this.photo = value;
  }
  public java.util.List<Attachment> getPhoto() {
    return this.photo;
  }
  public void setQualification( java.util.List<PractitionerQualification> value) {
    this.qualification = value;
  }
  public java.util.List<PractitionerQualification> getQualification() {
    return this.qualification;
  }
  public void setCommunication( java.util.List<CodeableConcept> value) {
    this.communication = value;
  }
  public java.util.List<CodeableConcept> getCommunication() {
    return this.communication;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Practitioner]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this.gender != null) builder.append("gender" + "->" + this.gender.toString() + "\n"); 
     if(this._gender != null) builder.append("_gender" + "->" + this._gender.toString() + "\n"); 
     if(this.birthDate != null) builder.append("birthDate" + "->" + this.birthDate.toString() + "\n"); 
     if(this._birthDate != null) builder.append("_birthDate" + "->" + this._birthDate.toString() + "\n"); 
     if(this.photo != null) builder.append("photo" + "->" + this.photo.toString() + "\n"); 
     if(this.qualification != null) builder.append("qualification" + "->" + this.qualification.toString() + "\n"); 
     if(this.communication != null) builder.append("communication" + "->" + this.communication.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Practitioner,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Practitioner" : { return Practitioner.toString(); }
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