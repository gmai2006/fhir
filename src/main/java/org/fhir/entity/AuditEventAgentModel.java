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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;

/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
@Entity
@Table(name="auditeventagent")
public class AuditEventAgentModel  {
  /**
  * Description: "The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"role\"", length = 16777215)
  private String role;

  /**
  * Description: "Direct reference to a resource that identifies the agent."
  */
  @javax.persistence.Basic
  @Column(name="\"reference_id\"")
  private String reference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`reference_id`", insertable=false, updatable=false)
  private ReferenceModel reference;

  /**
  * Description: "Unique identifier for the user actively participating in the event."
  * Actual type: Identifier
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"userId\"", length = 16777215)
  private String userId;

  /**
  * Description: "Alternative agent Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available."
  */
  @javax.persistence.Basic
  @Column(name="\"altId\"")
  private String altId;

  /**
  * Description: "Human-meaningful name for the agent."
  */
  @javax.persistence.Basic
  @Column(name="\"name\"")
  private String name;

  /**
  * Description: "Indicator that the user is or is not the requestor, or initiator, for the event being audited."
  */
  @javax.persistence.Basic
  @Column(name="\"requestor\"")
  private Boolean requestor;

  /**
  * Description: "Where the event occurred."
  */
  @javax.persistence.Basic
  @Column(name="\"location_id\"")
  private String location_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`location_id`", insertable=false, updatable=false)
  private ReferenceModel location;

  /**
  * Description: "The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used."
  * Actual type: Array of string-> List<string>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"policy\"", length = 16777215)
  private String policy;

  /**
  * Description: "Type of media involved. Used when the event is about exporting/importing onto media."
  * Actual type: Coding
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"media\"", length = 16777215)
  private String media;

  /**
  * Description: "Logical network location for application activity, if the activity has a network location."
  */
  @javax.persistence.Basic
  @Column(name="\"network_id\"")
  private String network_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`network_id`", insertable=false, updatable=false)
  private AuditEventNetworkModel network;

  /**
  * Description: "The reason (purpose of use), specific to this agent, that was used during the event being recorded."
  * Actual type: Array of CodeableConcept-> List<CodeableConcept>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"purposeOfUse\"", length = 16777215)
  private String purposeOfUse;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public AuditEventAgentModel() {
  }

  public AuditEventAgentModel(AuditEventAgent o) {
    this.id = o.getId();
      this.role = CodeableConcept.toJson(o.getRole());
      if (null != o.getReference()) {
      	this.reference_id = "reference" + this.getId();
        this.reference = new ReferenceModel(o.getReference());
        this.reference.setId(this.reference_id);
        this.reference.parent_id = this.reference.getId();
      }

      this.userId = Identifier.toJson(o.getUserId());
      this.altId = o.getAltId();

      this.name = o.getName();

      this.requestor = o.getRequestor();

      if (null != o.getLocation()) {
      	this.location_id = "location" + this.getId();
        this.location = new ReferenceModel(o.getLocation());
        this.location.setId(this.location_id);
        this.location.parent_id = this.location.getId();
      }

      this.policy = org.fhir.utils.JsonUtils.write2String(o.getPolicy());

      this.media = Coding.toJson(o.getMedia());
      if (null != o.getNetwork()) {
      	this.network_id = "network" + this.getId();
        this.network = new AuditEventNetworkModel(o.getNetwork());
        this.network.setId(this.network_id);
        this.network.parent_id = this.network.getId();
      }

      this.purposeOfUse = CodeableConcept.toJson(o.getPurposeOfUse());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setRole( String value) {
    this.role = value;
  }
  public String getRole() {
    return this.role;
  }
  public void setReference( ReferenceModel value) {
    this.reference = value;
  }
  public ReferenceModel getReference() {
    return this.reference;
  }
  public void setUserId( String value) {
    this.userId = value;
  }
  public String getUserId() {
    return this.userId;
  }
  public void setAltId( String value) {
    this.altId = value;
  }
  public String getAltId() {
    return this.altId;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void setRequestor( Boolean value) {
    this.requestor = value;
  }
  public Boolean getRequestor() {
    return this.requestor;
  }
  public void setLocation( ReferenceModel value) {
    this.location = value;
  }
  public ReferenceModel getLocation() {
    return this.location;
  }
  public void setPolicy( String value) {
    this.policy = value;
  }
  public String getPolicy() {
    return this.policy;
  }
  public void setMedia( String value) {
    this.media = value;
  }
  public String getMedia() {
    return this.media;
  }
  public void setNetwork( AuditEventNetworkModel value) {
    this.network = value;
  }
  public AuditEventNetworkModel getNetwork() {
    return this.network;
  }
  public void setPurposeOfUse( String value) {
    this.purposeOfUse = value;
  }
  public String getPurposeOfUse() {
    return this.purposeOfUse;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("role" + "[" + String.valueOf(this.role) + "]\n"); 
     builder.append("reference" + "[" + String.valueOf(this.reference) + "]\n"); 
     builder.append("userId" + "[" + String.valueOf(this.userId) + "]\n"); 
     builder.append("altId" + "[" + String.valueOf(this.altId) + "]\n"); 
     builder.append("name" + "[" + String.valueOf(this.name) + "]\n"); 
     builder.append("requestor" + "[" + String.valueOf(this.requestor) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("policy" + "[" + String.valueOf(this.policy) + "]\n"); 
     builder.append("media" + "[" + String.valueOf(this.media) + "]\n"); 
     builder.append("network" + "[" + String.valueOf(this.network) + "]\n"); 
     builder.append("purposeOfUse" + "[" + String.valueOf(this.purposeOfUse) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}