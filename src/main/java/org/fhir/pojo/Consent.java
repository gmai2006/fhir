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
import org.fhir.entity.ConsentModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Consent  extends DomainResource  {
  /**
  * Description: "This is a Consent resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Unique identifier for this copy of the Consent Statement."
  */
  protected Identifier identifier;

  /**
  * Description: "Indicates the current state of this consent."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements."
  */
  protected java.util.List<CodeableConcept> category;

  /**
  * Description: "The patient/healthcare consumer to whom this consent applies."
  */
  @javax.validation.constraints.NotNull
  protected Reference patient;

  /**
  * Description: "Relevant time or time-period when this Consent is applicable."
  */
  protected Period period;

  /**
  * Description: "When this  Consent was issued / created / indexed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String dateTime;

  /**
  * Description: "Extensions for dateTime"
  */
  protected transient Element _dateTime;

  /**
  * Description: "Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions."
  */
  protected java.util.List<Reference> consentingParty;

  /**
  * Description: "Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  protected java.util.List<ConsentActor> actor;

  /**
  * Description: "Actions controlled by this consent."
  */
  protected java.util.List<CodeableConcept> action;

  /**
  * Description: "The organization that manages the consent, and the framework within which it is executed."
  */
  protected java.util.List<Reference> organization;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  */
  protected Attachment sourceAttachment;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  */
  protected Identifier sourceIdentifier;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  */
  protected Reference sourceReference;

  /**
  * Description: "The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law."
  */
  protected java.util.List<ConsentPolicy> policy;

  /**
  * Description: "A referece to the specific computable policy."
  */
  protected String policyRule;

  /**
  * Description: "Extensions for policyRule"
  */
  protected transient Element _policyRule;

  /**
  * Description: "A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels."
  */
  protected java.util.List<Coding> securityLabel;

  /**
  * Description: "The context of the activities a user is taking - why the user is accessing the data - that are controlled by this consent."
  */
  protected java.util.List<Coding> purpose;

  /**
  * Description: "Clinical or Operational Relevant period of time that bounds the data controlled by this consent."
  */
  protected Period dataPeriod;

  /**
  * Description: "The resources controlled by this consent, if specific resources are referenced."
  */
  protected java.util.List<ConsentData> data;

  /**
  * Description: "An exception to the base policy of this consent. An exception can be an addition or removal of access permissions."
  */
  protected java.util.List<ConsentExcept> except;

  public Consent() {
  }

  public Consent(ConsentModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category = CodeableConceptHelper.fromArray2Array(o.getCategory());
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getDateTime()) {
      this.dateTime = o.getDateTime();
    }
    if (null != o.getConsentingParty() && !o.getConsentingParty().isEmpty()) {
    	this.consentingParty = ReferenceHelper.fromArray2Array(o.getConsentingParty());
    }
    if (null != o.getActor() && !o.getActor().isEmpty()) {
    	this.actor = ConsentActorHelper.fromArray2Array(o.getActor());
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action = CodeableConceptHelper.fromArray2Array(o.getAction());
    }
    if (null != o.getOrganization() && !o.getOrganization().isEmpty()) {
    	this.organization = ReferenceHelper.fromArray2Array(o.getOrganization());
    }
    this.sourceAttachment = AttachmentHelper.fromJson(o.getSourceAttachment());
    this.sourceIdentifier = IdentifierHelper.fromJson(o.getSourceIdentifier());
    if (null != o.getSourceReference() && !o.getSourceReference().isEmpty()) {
      this.sourceReference = new Reference(o.getSourceReference().get(0));
    }
    if (null != o.getPolicy() && !o.getPolicy().isEmpty()) {
    	this.policy = ConsentPolicyHelper.fromArray2Array(o.getPolicy());
    }
    if (null != o.getPolicyRule()) {
      this.policyRule = o.getPolicyRule();
    }
    if (null != o.getSecurityLabel() && !o.getSecurityLabel().isEmpty()) {
    	this.securityLabel = CodingHelper.fromArray2Array(o.getSecurityLabel());
    }
    if (null != o.getPurpose() && !o.getPurpose().isEmpty()) {
    	this.purpose = CodingHelper.fromArray2Array(o.getPurpose());
    }
    this.dataPeriod = PeriodHelper.fromJson(o.getDataPeriod());
    if (null != o.getData() && !o.getData().isEmpty()) {
    	this.data = ConsentDataHelper.fromArray2Array(o.getData());
    }
    if (null != o.getExcept() && !o.getExcept().isEmpty()) {
    	this.except = ConsentExceptHelper.fromArray2Array(o.getExcept());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( Identifier value) {
    this.identifier = value;
  }
  public Identifier getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setCategory( java.util.List<CodeableConcept> value) {
    this.category = value;
  }
  public java.util.List<CodeableConcept> getCategory() {
    return this.category;
  }
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setDateTime( String value) {
    this.dateTime = value;
  }
  public String getDateTime() {
    return this.dateTime;
  }
  public void set_dateTime( Element value) {
    this._dateTime = value;
  }
  public Element get_dateTime() {
    return this._dateTime;
  }
  public void setConsentingParty( java.util.List<Reference> value) {
    this.consentingParty = value;
  }
  public java.util.List<Reference> getConsentingParty() {
    return this.consentingParty;
  }
  public void setActor( java.util.List<ConsentActor> value) {
    this.actor = value;
  }
  public java.util.List<ConsentActor> getActor() {
    return this.actor;
  }
  public void setAction( java.util.List<CodeableConcept> value) {
    this.action = value;
  }
  public java.util.List<CodeableConcept> getAction() {
    return this.action;
  }
  public void setOrganization( java.util.List<Reference> value) {
    this.organization = value;
  }
  public java.util.List<Reference> getOrganization() {
    return this.organization;
  }
  public void setSourceAttachment( Attachment value) {
    this.sourceAttachment = value;
  }
  public Attachment getSourceAttachment() {
    return this.sourceAttachment;
  }
  public void setSourceIdentifier( Identifier value) {
    this.sourceIdentifier = value;
  }
  public Identifier getSourceIdentifier() {
    return this.sourceIdentifier;
  }
  public void setSourceReference( Reference value) {
    this.sourceReference = value;
  }
  public Reference getSourceReference() {
    return this.sourceReference;
  }
  public void setPolicy( java.util.List<ConsentPolicy> value) {
    this.policy = value;
  }
  public java.util.List<ConsentPolicy> getPolicy() {
    return this.policy;
  }
  public void setPolicyRule( String value) {
    this.policyRule = value;
  }
  public String getPolicyRule() {
    return this.policyRule;
  }
  public void set_policyRule( Element value) {
    this._policyRule = value;
  }
  public Element get_policyRule() {
    return this._policyRule;
  }
  public void setSecurityLabel( java.util.List<Coding> value) {
    this.securityLabel = value;
  }
  public java.util.List<Coding> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setPurpose( java.util.List<Coding> value) {
    this.purpose = value;
  }
  public java.util.List<Coding> getPurpose() {
    return this.purpose;
  }
  public void setDataPeriod( Period value) {
    this.dataPeriod = value;
  }
  public Period getDataPeriod() {
    return this.dataPeriod;
  }
  public void setData( java.util.List<ConsentData> value) {
    this.data = value;
  }
  public java.util.List<ConsentData> getData() {
    return this.data;
  }
  public void setExcept( java.util.List<ConsentExcept> value) {
    this.except = value;
  }
  public java.util.List<ConsentExcept> getExcept() {
    return this.except;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Consent]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.dateTime != null) builder.append("dateTime" + "->" + this.dateTime.toString() + "\n"); 
     if(this._dateTime != null) builder.append("_dateTime" + "->" + this._dateTime.toString() + "\n"); 
     if(this.consentingParty != null) builder.append("consentingParty" + "->" + this.consentingParty.toString() + "\n"); 
     if(this.actor != null) builder.append("actor" + "->" + this.actor.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this.organization != null) builder.append("organization" + "->" + this.organization.toString() + "\n"); 
     if(this.sourceAttachment != null) builder.append("sourceAttachment" + "->" + this.sourceAttachment.toString() + "\n"); 
     if(this.sourceIdentifier != null) builder.append("sourceIdentifier" + "->" + this.sourceIdentifier.toString() + "\n"); 
     if(this.sourceReference != null) builder.append("sourceReference" + "->" + this.sourceReference.toString() + "\n"); 
     if(this.policy != null) builder.append("policy" + "->" + this.policy.toString() + "\n"); 
     if(this.policyRule != null) builder.append("policyRule" + "->" + this.policyRule.toString() + "\n"); 
     if(this._policyRule != null) builder.append("_policyRule" + "->" + this._policyRule.toString() + "\n"); 
     if(this.securityLabel != null) builder.append("securityLabel" + "->" + this.securityLabel.toString() + "\n"); 
     if(this.purpose != null) builder.append("purpose" + "->" + this.purpose.toString() + "\n"); 
     if(this.dataPeriod != null) builder.append("dataPeriod" + "->" + this.dataPeriod.toString() + "\n"); 
     if(this.data != null) builder.append("data" + "->" + this.data.toString() + "\n"); 
     if(this.except != null) builder.append("except" + "->" + this.except.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	Consent,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Consent" : { return Consent.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StatusEnum {
  	draft,
  	proposed,
  	active,
  	rejected,
  	inactive,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "proposed" : { return proposed.toString(); }
  			case "active" : { return active.toString(); }
  			case "rejected" : { return rejected.toString(); }
  			case "inactive" : { return inactive.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}