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
import org.fhir.entity.OrganizationContactModel;
import com.google.gson.GsonBuilder;

/**
* "A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc."
*/
public class OrganizationContact  {
  /**
  * Description: "Indicates a purpose for which the contact can be reached."
  */
  private CodeableConcept purpose;

  /**
  * Description: "A name associated with the contact."
  */
  private HumanName name;

  /**
  * Description: "A contact detail (e.g. a telephone number or an email address) by which the party may be contacted."
  */
  private java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "Visiting or postal addresses for the contact."
  */
  private Address address;

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

  public OrganizationContact() {
  }

  public OrganizationContact(OrganizationContactModel o) {
    this.id = o.getId();
      this.purpose = CodeableConcept.fromJson(o.getPurpose());
      this.name = HumanName.fromJson(o.getName());
      this.telecom = ContactPoint.fromArray(o.getTelecom());
      this.address = Address.fromJson(o.getAddress());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setPurpose( CodeableConcept value) {
    this.purpose = value;
  }
  public CodeableConcept getPurpose() {
    return this.purpose;
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
     builder.append("purpose" + "[" + String.valueOf(this.purpose) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
     builder.append("address" + "[" + String.valueOf(this.address) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<OrganizationContact> fromArray(java.util.List<OrganizationContactModel> list) {
    return (java.util.List<OrganizationContact>)list.stream()
      .map(model -> new OrganizationContact(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<OrganizationContactModel> toModelArray(java.util.List<OrganizationContact> list) {
    return (java.util.List<OrganizationContactModel>)list.stream()
      .map(model -> new OrganizationContactModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static OrganizationContact fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, OrganizationContact.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(OrganizationContact o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<OrganizationContact> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}