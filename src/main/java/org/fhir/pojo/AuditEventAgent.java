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

  public AuditEventAgent() {
  }

  public AuditEventAgent(AuditEventAgentModel o) {
    this.id = o.getId();
    if (null != o.getReference() && !o.getReference().isEmpty()) {
      this.reference = new Reference(o.getReference().get(0));
    }
    this.userId = IdentifierHelper.fromJson(o.getUserId());
    if (null != o.getAltId()) {
      this.altId = o.getAltId();
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getRequestor()) {
      this.requestor = o.getRequestor();
    }
    if (null != o.getLocation() && !o.getLocation().isEmpty()) {
      this.location = new Reference(o.getLocation().get(0));
    }
    if (o.getPolicy() != null) {
    	this.policy = org.fhir.utils.JsonUtils.json2Array(o.getPolicy());
    }
    this.media = CodingHelper.fromJson(o.getMedia());
    if (null != o.getNetwork() && !o.getNetwork().isEmpty()) {
      this.network = new AuditEventNetwork(o.getNetwork().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[AuditEventAgent]:" + "\n");
     if(this.role != null) builder.append("role" + "->" + this.role.toString() + "\n"); 
     if(this.reference != null) builder.append("reference" + "->" + this.reference.toString() + "\n"); 
     if(this.userId != null) builder.append("userId" + "->" + this.userId.toString() + "\n"); 
     if(this.altId != null) builder.append("altId" + "->" + this.altId.toString() + "\n"); 
     if(this._altId != null) builder.append("_altId" + "->" + this._altId.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.requestor != null) builder.append("requestor" + "->" + this.requestor.toString() + "\n"); 
     if(this._requestor != null) builder.append("_requestor" + "->" + this._requestor.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this.policy != null) builder.append("policy" + "->" + this.policy.toString() + "\n"); 
     if(this._policy != null) builder.append("_policy" + "->" + this._policy.toString() + "\n"); 
     if(this.media != null) builder.append("media" + "->" + this.media.toString() + "\n"); 
     if(this.network != null) builder.append("network" + "->" + this.network.toString() + "\n"); 
     if(this.purposeOfUse != null) builder.append("purposeOfUse" + "->" + this.purposeOfUse.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}