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
import com.google.gson.GsonBuilder;

/**
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
public class Consent  {
  /**
  * Description: "This is a Consent resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Unique identifier for this copy of the Consent Statement."
  */
  private Identifier identifier;

  /**
  * Description: "Indicates the current state of this consent."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements."
  */
  private java.util.List<CodeableConcept> category = new java.util.ArrayList<>();

  /**
  * Description: "The patient/healthcare consumer to whom this consent applies."
  */
  @javax.validation.constraints.NotNull
  private Reference patient;

  /**
  * Description: "Relevant time or time-period when this Consent is applicable."
  */
  private Period period;

  /**
  * Description: "When this  Consent was issued / created / indexed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String dateTime;

  /**
  * Description: "Extensions for dateTime"
  */
  private transient Element _dateTime;

  /**
  * Description: "Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions."
  */
  private java.util.List<Reference> consentingParty = new java.util.ArrayList<>();

  /**
  * Description: "Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  private java.util.List<ConsentActor> actor = new java.util.ArrayList<>();

  /**
  * Description: "Actions controlled by this consent."
  */
  private java.util.List<CodeableConcept> action = new java.util.ArrayList<>();

  /**
  * Description: "The organization that manages the consent, and the framework within which it is executed."
  */
  private java.util.List<Reference> organization = new java.util.ArrayList<>();

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  */
  private Attachment sourceAttachment;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  */
  private Identifier sourceIdentifier;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  */
  private Reference sourceReference;

  /**
  * Description: "The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law."
  */
  private java.util.List<ConsentPolicy> policy = new java.util.ArrayList<>();

  /**
  * Description: "A referece to the specific computable policy."
  */
  private String policyRule;

  /**
  * Description: "Extensions for policyRule"
  */
  private transient Element _policyRule;

  /**
  * Description: "A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels."
  */
  private java.util.List<Coding> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "The context of the activities a user is taking - why the user is accessing the data - that are controlled by this consent."
  */
  private java.util.List<Coding> purpose = new java.util.ArrayList<>();

  /**
  * Description: "Clinical or Operational Relevant period of time that bounds the data controlled by this consent."
  */
  private Period dataPeriod;

  /**
  * Description: "The resources controlled by this consent, if specific resources are referenced."
  */
  private java.util.List<ConsentData> data = new java.util.ArrayList<>();

  /**
  * Description: "An exception to the base policy of this consent. An exception can be an addition or removal of access permissions."
  */
  private java.util.List<ConsentExcept> except = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

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
    this.dataPeriod = PeriodHelper.fromJson(o.getDataPeriod());
    if (null != o.getData() && !o.getData().isEmpty()) {
    	this.data = ConsentDataHelper.fromArray2Array(o.getData());
    }
    if (null != o.getExcept() && !o.getExcept().isEmpty()) {
    	this.except = ConsentExceptHelper.fromArray2Array(o.getExcept());
    }
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
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
     if(this.except != null) builder.append("except" + "->" + this.except.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
    return builder.toString();
  }

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