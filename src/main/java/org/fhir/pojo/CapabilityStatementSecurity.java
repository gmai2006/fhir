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
  @javax.validation.constraints.NotNull
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
      this.cors = o.getCors();
    }
    if (null != o.getDescription()) {
      this.description = o.getDescription();
    }
    if (null != o.getCertificate() && !o.getCertificate().isEmpty()) {
    	this.certificate = CapabilityStatementCertificateHelper.fromArray2Array(o.getCertificate());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[CapabilityStatementSecurity]:" + "\n");
     if(this.cors != null) builder.append("cors" + "->" + this.cors.toString() + "\n"); 
     if(this._cors != null) builder.append("_cors" + "->" + this._cors.toString() + "\n"); 
     if(this.service != null) builder.append("service" + "->" + this.service.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.certificate != null) builder.append("certificate" + "->" + this.certificate.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}