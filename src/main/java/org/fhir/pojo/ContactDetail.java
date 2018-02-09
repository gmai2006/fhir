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
import org.fhir.entity.ContactDetailModel;
import com.google.gson.GsonBuilder;

/**
* "Specifies contact information for a person or organization."
*/
public class ContactDetail  {
  /**
  * Description: "The name of an individual to contact."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "The contact details for the individual (if a name was provided) or the organization."
  */
  private java.util.List<ContactPoint> telecom = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public ContactDetail() {
  }

  public ContactDetail(ContactDetailModel o) {
    this.id = o.getId();
      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      this.telecom = ContactPoint.fromArray(o.getTelecom());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setTelecom( java.util.List<ContactPoint> value) {
    this.telecom = value;
  }
  public java.util.List<ContactPoint> getTelecom() {
    return this.telecom;
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
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("telecom" + "[" + String.valueOf(this.telecom) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<ContactDetail> fromArray(java.util.List<ContactDetailModel> list) {
    return (java.util.List<ContactDetail>)list.stream()
      .map(model -> new ContactDetail(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ContactDetailModel> toModelArray(java.util.List<ContactDetail> list) {
    return (java.util.List<ContactDetailModel>)list.stream()
      .map(model -> new ContactDetailModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static ContactDetail fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, ContactDetail.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(ContactDetail o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<ContactDetail> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}