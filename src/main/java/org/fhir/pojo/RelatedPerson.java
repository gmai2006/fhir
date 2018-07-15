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
import org.fhir.entity.RelatedPersonModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class RelatedPerson  extends DomainResource  {
  /**
  * Description: "This is a RelatedPerson resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier for a person within a particular scope."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "Whether this related person record is in active use."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "The patient this person is related to."
  */
  @javax.validation.constraints.NotNull
  protected Reference patient;

  /**
  * Description: "The nature of the relationship between a patient and the related person."
  */
  protected CodeableConcept relationship;

  /**
  * Description: "A name associated with the person."
  */
  protected java.util.List<HumanName> name;

  /**
  * Description: "A contact detail for the person, e.g. a telephone number or an email address."
  */
  protected java.util.List<ContactPoint> telecom;

  /**
  * Description: "Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes."
  */
  protected String gender;

  /**
  * Description: "Extensions for gender"
  */
  protected transient Element _gender;

  /**
  * Description: "The date on which the related person was born."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String birthDate;

  /**
  * Description: "Extensions for birthDate"
  */
  protected transient Element _birthDate;

  /**
  * Description: "Address where the related person can be contacted or visited."
  */
  protected java.util.List<Address> address;

  /**
  * Description: "Image of the person."
  */
  protected java.util.List<Attachment> photo;

  /**
  * Description: "The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown."
  */
  protected Period period;

  public RelatedPerson() {
  }

  public RelatedPerson(RelatedPersonModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
    }
    if (null != o.getActive()) {
      this.active = o.getActive();
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getRelationship() && !o.getRelationship().isEmpty()) {
      this.relationship = new CodeableConcept(o.getRelationship().get(0));
    }
    if (o.getName() != null) {
    	this.name = org.fhir.utils.JsonUtils.json2Array(o.getName());
    }
    if (o.getTelecom() != null) {
    	this.telecom = org.fhir.utils.JsonUtils.json2Array(o.getTelecom());
    }
    if (null != o.getGender()) {
      this.gender = o.getGender();
    }
    if (null != o.getBirthDate()) {
      this.birthDate = o.getBirthDate();
    }
    if (null != o.getAddress() && !o.getAddress().isEmpty()) {
    	this.address = AddressHelper.fromArray2Array(o.getAddress());
    }
    if (o.getPhoto() != null) {
    	this.photo = org.fhir.utils.JsonUtils.json2Array(o.getPhoto());
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
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
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setRelationship( CodeableConcept value) {
    this.relationship = value;
  }
  public CodeableConcept getRelationship() {
    return this.relationship;
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
  public void setAddress( java.util.List<Address> value) {
    this.address = value;
  }
  public java.util.List<Address> getAddress() {
    return this.address;
  }
  public void setPhoto( java.util.List<Attachment> value) {
    this.photo = value;
  }
  public java.util.List<Attachment> getPhoto() {
    return this.photo;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RelatedPerson]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.relationship != null) builder.append("relationship" + "->" + this.relationship.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.gender != null) builder.append("gender" + "->" + this.gender.toString() + "\n"); 
     if(this._gender != null) builder.append("_gender" + "->" + this._gender.toString() + "\n"); 
     if(this.birthDate != null) builder.append("birthDate" + "->" + this.birthDate.toString() + "\n"); 
     if(this._birthDate != null) builder.append("_birthDate" + "->" + this._birthDate.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this.photo != null) builder.append("photo" + "->" + this.photo.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	RelatedPerson,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "RelatedPerson" : { return RelatedPerson.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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