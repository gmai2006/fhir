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
import org.fhir.entity.PersonModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Demographics and administrative information about a person independent of a specific health-related context."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Person  extends DomainResource  {
  /**
  * Description: "This is a Person resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier for a person within a particular scope."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "A name associated with the person."
  */
  protected java.util.List<HumanName> name;

  /**
  * Description: "A contact detail for the person, e.g. a telephone number or an email address."
  */
  protected java.util.List<ContactPoint> telecom;

  /**
  * Description: "Administrative Gender."
  */
  protected String gender;

  /**
  * Description: "Extensions for gender"
  */
  protected transient Element _gender;

  /**
  * Description: "The birth date for the person."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  protected String birthDate;

  /**
  * Description: "Extensions for birthDate"
  */
  protected transient Element _birthDate;

  /**
  * Description: "One or more addresses for the person."
  */
  protected java.util.List<Address> address;

  /**
  * Description: "An image that can be displayed as a thumbnail of the person to enhance the identification of the individual."
  */
  protected Attachment photo;

  /**
  * Description: "The organization that is the custodian of the person record."
  */
  protected Reference managingOrganization;

  /**
  * Description: "Whether this person's record is in active use."
  */
  protected Boolean active;

  /**
  * Description: "Extensions for active"
  */
  protected transient Element _active;

  /**
  * Description: "Link to a resource that concerns the same actual person."
  */
  protected java.util.List<PersonLink> link;

  public Person() {
  }

  public Person(PersonModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (o.getIdentifier() != null) {
    	this.identifier = org.fhir.utils.JsonUtils.json2Array(o.getIdentifier());
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
    this.photo = AttachmentHelper.fromJson(o.getPhoto());
    if (null != o.getManagingOrganization() && !o.getManagingOrganization().isEmpty()) {
      this.managingOrganization = new Reference(o.getManagingOrganization().get(0));
    }
    if (null != o.getActive()) {
      this.active = o.getActive();
    }
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link = PersonLinkHelper.fromArray2Array(o.getLink());
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
  public void setPhoto( Attachment value) {
    this.photo = value;
  }
  public Attachment getPhoto() {
    return this.photo;
  }
  public void setManagingOrganization( Reference value) {
    this.managingOrganization = value;
  }
  public Reference getManagingOrganization() {
    return this.managingOrganization;
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
  public void setLink( java.util.List<PersonLink> value) {
    this.link = value;
  }
  public java.util.List<PersonLink> getLink() {
    return this.link;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Person]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this.telecom != null) builder.append("telecom" + "->" + this.telecom.toString() + "\n"); 
     if(this.gender != null) builder.append("gender" + "->" + this.gender.toString() + "\n"); 
     if(this._gender != null) builder.append("_gender" + "->" + this._gender.toString() + "\n"); 
     if(this.birthDate != null) builder.append("birthDate" + "->" + this.birthDate.toString() + "\n"); 
     if(this._birthDate != null) builder.append("_birthDate" + "->" + this._birthDate.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this.photo != null) builder.append("photo" + "->" + this.photo.toString() + "\n"); 
     if(this.managingOrganization != null) builder.append("managingOrganization" + "->" + this.managingOrganization.toString() + "\n"); 
     if(this.active != null) builder.append("active" + "->" + this.active.toString() + "\n"); 
     if(this._active != null) builder.append("_active" + "->" + this._active.toString() + "\n"); 
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	Person,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Person" : { return Person.toString(); }
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