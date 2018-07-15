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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class AuditEventAgent  extends BackboneElement  {
  /**
  * Description: "The security role that the user was acting under, that come from local codes defined by the access control security system (e.g. RBAC, ABAC) used in the local context."
  */
  protected java.util.List<CodeableConcept> role;

  /**
  * Description: "Direct reference to a resource that identifies the agent."
  */
  protected Reference reference;

  /**
  * Description: "Unique identifier for the user actively participating in the event."
  */
  protected Identifier userId;

  /**
  * Description: "Alternative agent Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available."
  */
  protected String altId;

  /**
  * Description: "Extensions for altId"
  */
  protected transient Element _altId;

  /**
  * Description: "Human-meaningful name for the agent."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "Indicator that the user is or is not the requestor, or initiator, for the event being audited."
  */
  protected Boolean requestor;

  /**
  * Description: "Extensions for requestor"
  */
  protected transient Element _requestor;

  /**
  * Description: "Where the event occurred."
  */
  protected Reference location;

  /**
  * Description: "The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used."
  */
  protected java.util.List<String> policy;

  /**
  * Description: "Extensions for policy"
  */
  protected transient java.util.List<Element> _policy;

  /**
  * Description: "Type of media involved. Used when the event is about exporting/importing onto media."
  */
  protected Coding media;

  /**
  * Description: "Logical network location for application activity, if the activity has a network location."
  */
  protected AuditEventNetwork network;

  /**
  * Description: "The reason (purpose of use), specific to this agent, that was used during the event being recorded."
  */
  protected java.util.List<CodeableConcept> purposeOfUse;

  public AuditEventAgent() {
  }

  public AuditEventAgent(AuditEventAgentModel o) {
    this.id = o.getId();
    if (null != o.getRole() && !o.getRole().isEmpty()) {
    	this.role = CodeableConceptHelper.fromArray2Array(o.getRole());
    }
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
    if (null != o.getMedia() && !o.getMedia().isEmpty()) {
      this.media = new Coding(o.getMedia().get(0));
    }
    if (null != o.getNetwork() && !o.getNetwork().isEmpty()) {
      this.network = new AuditEventNetwork(o.getNetwork().get(0));
    }
    if (null != o.getPurposeOfUse() && !o.getPurposeOfUse().isEmpty()) {
    	this.purposeOfUse = CodeableConceptHelper.fromArray2Array(o.getPurposeOfUse());
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
     if(this.purposeOfUse != null) builder.append("purposeOfUse" + "->" + this.purposeOfUse.toString() + "\n"); ;
    return builder.toString();
  }


}