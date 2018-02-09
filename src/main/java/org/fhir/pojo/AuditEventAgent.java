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
import org.fhir.entity.AuditEventAgentModel;
import com.google.gson.GsonBuilder;

/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
public class AuditEventAgent  {
  /**
  * Description: "The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context."
  */
  private java.util.List<CodeableConcept> role = new java.util.ArrayList<>();

  /**
  * Description: "Direct reference to a resource that identifies the agent."
  */
  private Reference reference;

  /**
  * Description: "Unique identifier for the user actively participating in the event."
  */
  private Identifier userId;

  /**
  * Description: "Alternative agent Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available."
  */
  private String altId;

  /**
  * Description: "Extensions for altId"
  */
  private transient Element _altId;

  /**
  * Description: "Human-meaningful name for the agent."
  */
  private String name;

  /**
  * Description: "Extensions for name"
  */
  private transient Element _name;

  /**
  * Description: "Indicator that the user is or is not the requestor, or initiator, for the event being audited."
  */
  private Boolean requestor;

  /**
  * Description: "Extensions for requestor"
  */
  private transient Element _requestor;

  /**
  * Description: "Where the event occurred."
  */
  private Reference location;

  /**
  * Description: "The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used."
  */
  private java.util.List<String> policy = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for policy"
  */
  private transient java.util.List<Element> _policy = new java.util.ArrayList<>();

  /**
  * Description: "Type of media involved. Used when the event is about exporting/importing onto media."
  */
  private Coding media;

  /**
  * Description: "Logical network location for application activity, if the activity has a network location."
  */
  private AuditEventNetwork network;

  /**
  * Description: "The reason (purpose of use), specific to this agent, that was used during the event being recorded."
  */
  private java.util.List<CodeableConcept> purposeOfUse = new java.util.ArrayList<>();

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

  public AuditEventAgent() {
  }

  public AuditEventAgent(AuditEventAgentModel o) {
    this.id = o.getId();
      this.role = CodeableConcept.fromArray(o.getRole());
      if (null != o.getReference()) {
        this.reference = new Reference(o.getReference());
        this.reference.setId(this.getId());
      }

      this.userId = Identifier.fromJson(o.getUserId());
      if (null != o.getAltId()) {
        this.altId = new String(o.getAltId());
      }

      if (null != o.getName()) {
        this.name = new String(o.getName());
      }

      if (null != o.getRequestor()) {
        this.requestor = new Boolean(o.getRequestor());
      }

      if (null != o.getLocation()) {
        this.location = new Reference(o.getLocation());
        this.location.setId(this.getId());
      }

      this.policy = org.fhir.utils.JsonUtils.json2Array(o.getPolicy());

      this.media = Coding.fromJson(o.getMedia());
      if (null != o.getNetwork()) {
        this.network = new AuditEventNetwork(o.getNetwork());
        this.network.setId(this.getId());
      }

      this.purposeOfUse = CodeableConcept.fromArray(o.getPurposeOfUse());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setRole( java.util.List<CodeableConcept> value) {
    this.role = value;
  }
  public java.util.List<CodeableConcept> getRole() {
    return this.role;
  }
  public void setReference( Reference value) {
    this.reference = value;
  }
  public Reference getReference() {
    return this.reference;
  }
  public void setUserId( Identifier value) {
    this.userId = value;
  }
  public Identifier getUserId() {
    return this.userId;
  }
  public void setAltId( String value) {
    this.altId = value;
  }
  public String getAltId() {
    return this.altId;
  }
  public void set_altId( Element value) {
    this._altId = value;
  }
  public Element get_altId() {
    return this._altId;
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
  public void setRequestor( Boolean value) {
    this.requestor = value;
  }
  public Boolean getRequestor() {
    return this.requestor;
  }
  public void set_requestor( Element value) {
    this._requestor = value;
  }
  public Element get_requestor() {
    return this._requestor;
  }
  public void setLocation( Reference value) {
    this.location = value;
  }
  public Reference getLocation() {
    return this.location;
  }
  public void setPolicy( java.util.List<String> value) {
    this.policy = value;
  }
  public java.util.List<String> getPolicy() {
    return this.policy;
  }
  public void set_policy( java.util.List<Element> value) {
    this._policy = value;
  }
  public java.util.List<Element> get_policy() {
    return this._policy;
  }
  public void setMedia( Coding value) {
    this.media = value;
  }
  public Coding getMedia() {
    return this.media;
  }
  public void setNetwork( AuditEventNetwork value) {
    this.network = value;
  }
  public AuditEventNetwork getNetwork() {
    return this.network;
  }
  public void setPurposeOfUse( java.util.List<CodeableConcept> value) {
    this.purposeOfUse = value;
  }
  public java.util.List<CodeableConcept> getPurposeOfUse() {
    return this.purposeOfUse;
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
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("userId" + "[" + String.valueOf(this.userId) + "]\n"); 
     builder.append("altId" + "[" + String.valueOf(this.altId) + "]\n"); 
     builder.append("_altId" + "[" + String.valueOf(this._altId) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("_name" + "[" + String.valueOf(this._name) + "]\n"); 
     builder.append("requestor" + "[" + String.valueOf(this.requestor) + "]\n"); 
     builder.append("_requestor" + "[" + String.valueOf(this._requestor) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("policy" + "[" + String.valueOf(this.policy) + "]\n"); 
     builder.append("_policy" + "[" + String.valueOf(this._policy) + "]\n"); 
     builder.append("media" + "[" + String.valueOf(this.media) + "]\n"); 
     builder.append("network" + "[" + String.valueOf(this.network) + "]\n"); 
     builder.append("purposeOfUse" + "[" + String.valueOf(this.purposeOfUse) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<AuditEventAgent> fromArray(java.util.List<AuditEventAgentModel> list) {
    return (java.util.List<AuditEventAgent>)list.stream()
      .map(model -> new AuditEventAgent(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AuditEventAgentModel> toModelArray(java.util.List<AuditEventAgent> list) {
    return (java.util.List<AuditEventAgentModel>)list.stream()
      .map(model -> new AuditEventAgentModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static AuditEventAgent fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, AuditEventAgent.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(AuditEventAgent o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<AuditEventAgent> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}