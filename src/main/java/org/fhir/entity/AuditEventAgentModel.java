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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
*/
@Entity
@Table(name="auditeventagent")
public class AuditEventAgentModel  implements Serializable {
	private static final long serialVersionUID = 151967883166737458L;
  /**
  * Description: "The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context."
  */
  @javax.persistence.Basic
  @Column(name="\"role_id\"")
  private String role_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="role_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> role;

  /**
  * Description: "Direct reference to a resource that identifies the agent."
  */
  @javax.persistence.Basic
  @Column(name="\"reference_id\"")
  private String reference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reference;

  /**
  * Description: "Unique identifier for the user actively participating in the event."
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="location_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> location;

  /**
  * Description: "The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used."
  */
  @javax.persistence.Basic
  @Column(name="\"policy\"")
  private String policy;

  /**
  * Description: "Type of media involved. Used when the event is about exporting/importing onto media."
  */
  @javax.persistence.Basic
  @Column(name="\"media_id\"")
  private String media_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="media_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> media;

  /**
  * Description: "Logical network location for application activity, if the activity has a network location."
  */
  @javax.persistence.Basic
  @Column(name="\"network_id\"")
  private String network_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="network_id", insertable=false, updatable=false)
  private java.util.List<AuditEventNetworkModel> network;

  /**
  * Description: "The reason (purpose of use), specific to this agent, that was used during the event being recorded."
  */
  @javax.persistence.Basic
  @Column(name="\"purposeofuse_id\"")
  private String purposeofuse_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="purposeofuse_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> purposeOfUse;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
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
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public AuditEventAgentModel() {
  }

  public AuditEventAgentModel(AuditEventAgent o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getRole() && !o.getRole().isEmpty()) {
    	this.role_id = "role" + this.id;
    	this.role = CodeableConceptHelper.toModelFromArray(o.getRole(), this.role_id);
    }
    if (null != o.getReference() ) {
    	this.reference_id = "reference" + this.id;
    	this.reference = ReferenceHelper.toModel(o.getReference(), this.reference_id);
    }
    if (null != o.getUserId()) {
    	this.userId = JsonUtils.toJson(o.getUserId());
    }
    this.altId = o.getAltId();
    this.name = o.getName();
    this.requestor = o.getRequestor();
    if (null != o.getLocation() ) {
    	this.location_id = "location" + this.id;
    	this.location = ReferenceHelper.toModel(o.getLocation(), this.location_id);
    }
    this.policy = org.fhir.utils.JsonUtils.toJson(o.getPolicy());
    if (null != o.getMedia() ) {
    	this.media_id = "media" + this.id;
    	this.media = CodingHelper.toModel(o.getMedia(), this.media_id);
    }
    if (null != o.getNetwork() ) {
    	this.network_id = "network" + this.id;
    	this.network = AuditEventNetworkHelper.toModel(o.getNetwork(), this.network_id);
    }
    if (null != o.getPurposeOfUse() && !o.getPurposeOfUse().isEmpty()) {
    	this.purposeofuse_id = "purposeofuse" + this.id;
    	this.purposeOfUse = CodeableConceptHelper.toModelFromArray(o.getPurposeOfUse(), this.purposeofuse_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CodeableConceptModel> getRole() {
    return this.role;
  }
  public void setRole( java.util.List<CodeableConceptModel> value) {
    this.role = value;
  }
  public java.util.List<ReferenceModel> getReference() {
    return this.reference;
  }
  public void setReference( java.util.List<ReferenceModel> value) {
    this.reference = value;
  }
  public String getUserId() {
    return this.userId;
  }
  public void setUserId( String value) {
    this.userId = value;
  }
  public String getAltId() {
    return this.altId;
  }
  public void setAltId( String value) {
    this.altId = value;
  }
  public String getName() {
    return this.name;
  }
  public void setName( String value) {
    this.name = value;
  }
  public Boolean getRequestor() {
    return this.requestor;
  }
  public void setRequestor( Boolean value) {
    this.requestor = value;
  }
  public java.util.List<ReferenceModel> getLocation() {
    return this.location;
  }
  public void setLocation( java.util.List<ReferenceModel> value) {
    this.location = value;
  }
  public String getPolicy() {
    return this.policy;
  }
  public void setPolicy( String value) {
    this.policy = value;
  }
  public java.util.List<CodingModel> getMedia() {
    return this.media;
  }
  public void setMedia( java.util.List<CodingModel> value) {
    this.media = value;
  }
  public java.util.List<AuditEventNetworkModel> getNetwork() {
    return this.network;
  }
  public void setNetwork( java.util.List<AuditEventNetworkModel> value) {
    this.network = value;
  }
  public java.util.List<CodeableConceptModel> getPurposeOfUse() {
    return this.purposeOfUse;
  }
  public void setPurposeOfUse( java.util.List<CodeableConceptModel> value) {
    this.purposeOfUse = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventAgentModel]:" + "\n");
     builder.append("userId" + "->" + this.userId + "\n"); 
     builder.append("altId" + "->" + this.altId + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("requestor" + "->" + this.requestor + "\n"); 
     builder.append("policy" + "->" + this.policy + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[AuditEventAgentModel]:" + "\n");
     builder.append("role" + "->" + this.role + "\n"); 
     builder.append("reference" + "->" + this.reference + "\n"); 
     builder.append("userId" + "->" + this.userId + "\n"); 
     builder.append("altId" + "->" + this.altId + "\n"); 
     builder.append("name" + "->" + this.name + "\n"); 
     builder.append("requestor" + "->" + this.requestor + "\n"); 
     builder.append("location" + "->" + this.location + "\n"); 
     builder.append("policy" + "->" + this.policy + "\n"); 
     builder.append("media" + "->" + this.media + "\n"); 
     builder.append("network" + "->" + this.network + "\n"); 
     builder.append("purposeOfUse" + "->" + this.purposeOfUse + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}