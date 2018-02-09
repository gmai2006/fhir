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
import org.fhir.entity.CapabilityStatementSecurityModel;
import com.google.gson.GsonBuilder;

/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
public class CapabilityStatementSecurity  {
  /**
  * Description: "Server adds CORS headers when responding to requests - this enables javascript applications to use the server."
  */
  private Boolean cors;

  /**
  * Description: "Extensions for cors"
  */
  private transient Element _cors;

  /**
  * Description: "Types of security services that are supported/required by the system."
  */
  private java.util.List<CodeableConcept> service = new java.util.ArrayList<>();

  /**
  * Description: "General description of how security works."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "Certificates associated with security profiles."
  */
  private java.util.List<CapabilityStatementCertificate> certificate = new java.util.ArrayList<>();

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

  public CapabilityStatementSecurity() {
  }

  public CapabilityStatementSecurity(CapabilityStatementSecurityModel o) {
    this.id = o.getId();
      if (null != o.getCors()) {
        this.cors = new Boolean(o.getCors());
      }

      this.service = CodeableConcept.fromArray(o.getService());
      if (null != o.getDescription()) {
        this.description = new String(o.getDescription());
      }

      this.certificate = CapabilityStatementCertificate.fromArray(o.getCertificate());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setCors( Boolean value) {
    this.cors = value;
  }
  public Boolean getCors() {
    return this.cors;
  }
  public void set_cors( Element value) {
    this._cors = value;
  }
  public Element get_cors() {
    return this._cors;
  }
  public void setService( java.util.List<CodeableConcept> value) {
    this.service = value;
  }
  public java.util.List<CodeableConcept> getService() {
    return this.service;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setCertificate( java.util.List<CapabilityStatementCertificate> value) {
    this.certificate = value;
  }
  public java.util.List<CapabilityStatementCertificate> getCertificate() {
    return this.certificate;
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
     builder.append("cors" + "[" + String.valueOf(this.cors) + "]\n"); 
     builder.append("_cors" + "[" + String.valueOf(this._cors) + "]\n"); 
     builder.append("service" + "[" + String.valueOf(this.service) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("certificate" + "[" + String.valueOf(this.certificate) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<CapabilityStatementSecurity> fromArray(java.util.List<CapabilityStatementSecurityModel> list) {
    return (java.util.List<CapabilityStatementSecurity>)list.stream()
      .map(model -> new CapabilityStatementSecurity(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CapabilityStatementSecurityModel> toModelArray(java.util.List<CapabilityStatementSecurity> list) {
    return (java.util.List<CapabilityStatementSecurityModel>)list.stream()
      .map(model -> new CapabilityStatementSecurityModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static CapabilityStatementSecurity fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, CapabilityStatementSecurity.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(CapabilityStatementSecurity o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<CapabilityStatementSecurity> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}