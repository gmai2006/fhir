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
import org.fhir.entity.MessageHeaderSourceModel;
import com.google.gson.GsonBuilder;

/**
* "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
*/
public class MessageHeaderSource  {
  /**
  * Description: "Human-readable name for the source system."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "May include configuration or other information useful in debugging."
  */
  private String software;

  /**
  * Description: "Extensions for software"
  */
  private transient Element _software;

  /**
  * Description: "Can convey versions of multiple systems in situations where a message passes through multiple hands."
  */
  private String version;

  /**
  * Description: "Extensions for version"
  */
  private transient Element _version;

  /**
  * Description: "An e-mail, phone, website or other contact point to use to resolve issues with message communications."
  */
  private ContactPoint contact;

  /**
  * Description: "Identifies the routing target to send acknowledgements to."
  */
  private String endpoint;

  /**
  * Description: "Extensions for endpoint"
  */
  private transient Element _endpoint;

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

  public MessageHeaderSource() {
  }

  public MessageHeaderSource(MessageHeaderSourceModel o) {
    this.id = o.getId();
      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getSoftware()) {
        this.software = new String(o.getSoftware());
      }

      if (null != o.getVersion()) {
        this.version = new String(o.getVersion());
      }

      this.contact = ContactPoint.fromJson(o.getContact());
      if (null != o.getEndpoint()) {
        this.endpoint = new String(o.getEndpoint());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
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
  public void setSoftware( String value) {
    this.software = value;
  }
  public String getSoftware() {
    return this.software;
  }
  public void set_software( Element value) {
    this._software = value;
  }
  public Element get_software() {
    return this._software;
  }
  public void setVersion( String value) {
    this.version = value;
  }
  public String getVersion() {
    return this.version;
  }
  public void set_version( Element value) {
    this._version = value;
  }
  public Element get_version() {
    return this._version;
  }
  public void setContact( ContactPoint value) {
    this.contact = value;
  }
  public ContactPoint getContact() {
    return this.contact;
  }
  public void setEndpoint( String value) {
    this.endpoint = value;
  }
  public String getEndpoint() {
    return this.endpoint;
  }
  public void set_endpoint( Element value) {
    this._endpoint = value;
  }
  public Element get_endpoint() {
    return this._endpoint;
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
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("software" + "[" + String.valueOf(this.software) + "]\n"); 
     builder.append("_software" + "[" + String.valueOf(this._software) + "]\n"); 
     builder.append("version" + "[" + String.valueOf(this.version) + "]\n"); 
     builder.append("_version" + "[" + String.valueOf(this._version) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("_endpoint" + "[" + String.valueOf(this._endpoint) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<MessageHeaderSource> fromArray(java.util.List<MessageHeaderSourceModel> list) {
    return (java.util.List<MessageHeaderSource>)list.stream()
      .map(model -> new MessageHeaderSource(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<MessageHeaderSourceModel> toModelArray(java.util.List<MessageHeaderSource> list) {
    return (java.util.List<MessageHeaderSourceModel>)list.stream()
      .map(model -> new MessageHeaderSourceModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static MessageHeaderSource fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, MessageHeaderSource.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(MessageHeaderSource o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<MessageHeaderSource> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}