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
import org.fhir.entity.PatientContactModel;
import com.google.gson.GsonBuilder;

/**
* "Demographics and other administrative information about an individual or animal receiving care or other health-related services."
*/
public class PatientContact  {
  /**
  * Description: "The nature of the relationship between the patient and the contact person."
  */
  private java.util.List<CodeableConcept> relationship = new java.util.ArrayList<>();

  /**
  * Description: "A name associated with the contact person."
  */
  private HumanName name;

  /**
  * Description: "A contact detail for the person, e.g. a telephone number or an email address."
  */
  private java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "Address for the contact person."
  */
  private Address address;

  /**
  * Description: "Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes."
  */
  private String gender;

  /**
  * Description: "Extensions for gender"
  */
  private transient Element _gender;

  /**
  * Description: "Organization on behalf of which the contact is acting or for which the contact is working."
  */
  private Reference organization;

  /**
  * Description: "The period during which this contact person or organization is valid to be contacted relating to this patient."
  */
  private Period period;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public PatientContact() {
  }

  public PatientContact(PatientContactModel o) {
    this.id = o.getId();
      this.relationship = CodeableConcept.fromArray(o.getRelationship());
      this.name = HumanName.fromJson(o.getName());
      this.telecom = ContactPoint.fromArray(o.getTelecom());
      this.address = Address.fromJson(o.getAddress());
      if (null != o.getGender()) {
        this.gender = new String(o.getGender());
      }

      if (null != o.getOrganization()) {
        this.organization = new Reference(o.getOrganization());
        this.organization.setId(this.getId());
      }

      this.period = Period.fromJson(o.getPeriod());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setRelationship( java.util.List<CodeableConcept> value) {
    this.relationship = value;
  }
  public java.util.List<CodeableConcept> getRelationship() {
    return this.relationship;
  }
  public void setName( HumanName value) {
    this.name = value;
  }
  public HumanName getName() {
    return this.name;
  }
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
  }
  public void setAddress( Address value) {
    this.address = value;
  }
  public Address getAddress() {
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
  public void setOrganization( Reference value) {
    this.organization = value;
  }
  public Reference getOrganization() {
    return this.organization;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
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
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("relationship" + "[" + String.valueOf(this.relationship) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
     builder.append("address" + "[" + String.valueOf(this.address) + "]\n"); 
     builder.append("gender" + "[" + String.valueOf(this.gender) + "]\n"); 
     builder.append("_gender" + "[" + String.valueOf(this._gender) + "]\n"); 
     builder.append("organization" + "[" + String.valueOf(this.organization) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
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

  public static java.util.List<PatientContact> fromArray(java.util.List<PatientContactModel> list) {
    return (java.util.List<PatientContact>)list.stream()
      .map(model -> new PatientContact(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<PatientContactModel> toModelArray(java.util.List<PatientContact> list) {
    return (java.util.List<PatientContactModel>)list.stream()
      .map(model -> new PatientContactModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static PatientContact fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, PatientContact.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(PatientContact o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<PatientContact> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}