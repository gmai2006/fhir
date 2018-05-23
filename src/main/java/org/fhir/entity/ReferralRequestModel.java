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
* "Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization."
*/
@Entity
@Table(name="referralrequest")
public class ReferralRequestModel  implements Serializable {
	private static final long serialVersionUID = 151967883198654141L;
  /**
  * Description: "This is a ReferralRequest resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Business identifier that uniquely identifies the referral/care transfer request instance."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "A protocol, guideline, orderset or other definition that is adhered to in whole or in part by this request."
  */
  @javax.persistence.Basic
  @Column(name="\"definition_id\"")
  private String definition_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="definition_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> definition;

  /**
  * Description: "Indicates any plans, proposals or orders that this request is intended to satisfy - in whole or in part."
  */
  @javax.persistence.Basic
  @Column(name="\"basedon_id\"")
  private String basedon_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="basedon_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> basedOn;

  /**
  * Description: "Completed or terminated request(s) whose function is taken by this new request."
  */
  @javax.persistence.Basic
  @Column(name="\"replaces_id\"")
  private String replaces_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="replaces_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> replaces;

  /**
  * Description: "The business identifier of the logical \"grouping\" request/order that this referral is a part of."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"groupIdentifier\"", length = 16777215)
  private String groupIdentifier;

  /**
  * Description: "The status of the authorization/intention reflected by the referral request record."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "Distinguishes the \"level\" of authorization/demand implicit in this request."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"intent\"")
  private String intent;

  /**
  * Description: "An indication of the type of referral (or where applicable the type of transfer of care) request."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "An indication of the urgency of referral (or where applicable the type of transfer of care) request."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"priority\"")
  private String priority;

  /**
  * Description: "The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion."
  */
  @javax.persistence.Basic
  @Column(name="\"servicerequested_id\"")
  private String servicerequested_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="servicerequested_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> serviceRequested;

  /**
  * Description: "The patient who is the subject of a referral or transfer of care request."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The encounter at which the request for referral or transfer of care is initiated."
  */
  @javax.persistence.Basic
  @Column(name="\"context_id\"")
  private String context_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="context_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> context;

  /**
  * Description: "The period of time within which the services identified in the referral/transfer of care is specified or required to occur."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"occurrenceDateTime\"")
  private String occurrenceDateTime;

  /**
  * Description: "The period of time within which the services identified in the referral/transfer of care is specified or required to occur."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"occurrencePeriod\"", length = 16777215)
  private String occurrencePeriod;

  /**
  * Description: "Date/DateTime of creation for draft requests and date of activation for active requests."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"authoredOn\"")
  private String authoredOn;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  @javax.persistence.Basic
  @Column(name="\"requester_id\"")
  private String requester_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="requester_id", insertable=false, updatable=false)
  private java.util.List<ReferralRequestRequesterModel> requester;

  /**
  * Description: "Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology."
  */
  @javax.persistence.Basic
  @Column(name="\"specialty_id\"")
  private String specialty_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="specialty_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> specialty;

  /**
  * Description: "The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request."
  */
  @javax.persistence.Basic
  @Column(name="\"recipient_id\"")
  private String recipient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="recipient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> recipient;

  /**
  * Description: "Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management."
  */
  @javax.persistence.Basic
  @Column(name="\"reasoncode_id\"")
  private String reasoncode_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reasoncode_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> reasonCode;

  /**
  * Description: "Indicates another resource whose existence justifies this request."
  */
  @javax.persistence.Basic
  @Column(name="\"reasonreference_id\"")
  private String reasonreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="reasonreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> reasonReference;

  /**
  * Description: "The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary."
  */
  @javax.persistence.Basic
  @Column(name="\"description\"")
  private String description;

  /**
  * Description: "Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan."
  */
  @javax.persistence.Basic
  @Column(name="\"supportinginfo_id\"")
  private String supportinginfo_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="supportinginfo_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> supportingInfo;

  /**
  * Description: "Comments made about the referral request by any of the participants."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"note\"", length = 16777215)
  private String note;

  /**
  * Description: "Links to Provenance records for past versions of this resource or fulfilling request or event resources that identify key state transitions or updates that are likely to be relevant to a user looking at the current version of the resource."
  */
  @javax.persistence.Basic
  @Column(name="\"relevanthistory_id\"")
  private String relevanthistory_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="relevanthistory_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> relevantHistory;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
  private java.util.List<NarrativeModel> text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public ReferralRequestModel() {
  }

  public ReferralRequestModel(ReferralRequest o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    if (null != o.getDefinition() && !o.getDefinition().isEmpty()) {
    	this.definition_id = "definition" + this.id;
    	this.definition = ReferenceHelper.toModelFromArray(o.getDefinition(), this.definition_id);
    }
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedon_id = "basedon" + this.id;
    	this.basedOn = ReferenceHelper.toModelFromArray(o.getBasedOn(), this.basedon_id);
    }
    if (null != o.getReplaces() && !o.getReplaces().isEmpty()) {
    	this.replaces_id = "replaces" + this.id;
    	this.replaces = ReferenceHelper.toModelFromArray(o.getReplaces(), this.replaces_id);
    }
    if (null != o.getGroupIdentifier()) {
    	this.groupIdentifier = JsonUtils.toJson(o.getGroupIdentifier());
    }
    this.status = o.getStatus();
    this.intent = o.getIntent();
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    this.priority = o.getPriority();
    if (null != o.getServiceRequested() && !o.getServiceRequested().isEmpty()) {
    	this.servicerequested_id = "servicerequested" + this.id;
    	this.serviceRequested = CodeableConceptHelper.toModelFromArray(o.getServiceRequested(), this.servicerequested_id);
    }
    if (null != o.getSubject() ) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModel(o.getSubject(), this.subject_id);
    }
    if (null != o.getContext() ) {
    	this.context_id = "context" + this.id;
    	this.context = ReferenceHelper.toModel(o.getContext(), this.context_id);
    }
    this.occurrenceDateTime = o.getOccurrenceDateTime();
    if (null != o.getOccurrencePeriod()) {
    	this.occurrencePeriod = JsonUtils.toJson(o.getOccurrencePeriod());
    }
    this.authoredOn = o.getAuthoredOn();
    if (null != o.getRequester() ) {
    	this.requester_id = "requester" + this.id;
    	this.requester = ReferralRequestRequesterHelper.toModel(o.getRequester(), this.requester_id);
    }
    if (null != o.getSpecialty() ) {
    	this.specialty_id = "specialty" + this.id;
    	this.specialty = CodeableConceptHelper.toModel(o.getSpecialty(), this.specialty_id);
    }
    if (null != o.getRecipient() && !o.getRecipient().isEmpty()) {
    	this.recipient_id = "recipient" + this.id;
    	this.recipient = ReferenceHelper.toModelFromArray(o.getRecipient(), this.recipient_id);
    }
    if (null != o.getReasonCode() && !o.getReasonCode().isEmpty()) {
    	this.reasoncode_id = "reasoncode" + this.id;
    	this.reasonCode = CodeableConceptHelper.toModelFromArray(o.getReasonCode(), this.reasoncode_id);
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
    	this.reasonreference_id = "reasonreference" + this.id;
    	this.reasonReference = ReferenceHelper.toModelFromArray(o.getReasonReference(), this.reasonreference_id);
    }
    this.description = o.getDescription();
    if (null != o.getSupportingInfo() && !o.getSupportingInfo().isEmpty()) {
    	this.supportinginfo_id = "supportinginfo" + this.id;
    	this.supportingInfo = ReferenceHelper.toModelFromArray(o.getSupportingInfo(), this.supportinginfo_id);
    }
    if (null != o.getNote()) {
    	this.note = JsonUtils.toJson(o.getNote());
    }
    if (null != o.getRelevantHistory() && !o.getRelevantHistory().isEmpty()) {
    	this.relevanthistory_id = "relevanthistory" + this.id;
    	this.relevantHistory = ReferenceHelper.toModelFromArray(o.getRelevantHistory(), this.relevanthistory_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
    }
    if (null != o.getContained()) {
    	this.contained = JsonUtils.toJson(o.getContained());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public java.util.List<ReferenceModel> getDefinition() {
    return this.definition;
  }
  public void setDefinition( java.util.List<ReferenceModel> value) {
    this.definition = value;
  }
  public java.util.List<ReferenceModel> getBasedOn() {
    return this.basedOn;
  }
  public void setBasedOn( java.util.List<ReferenceModel> value) {
    this.basedOn = value;
  }
  public java.util.List<ReferenceModel> getReplaces() {
    return this.replaces;
  }
  public void setReplaces( java.util.List<ReferenceModel> value) {
    this.replaces = value;
  }
  public String getGroupIdentifier() {
    return this.groupIdentifier;
  }
  public void setGroupIdentifier( String value) {
    this.groupIdentifier = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getIntent() {
    return this.intent;
  }
  public void setIntent( String value) {
    this.intent = value;
  }
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public java.util.List<CodeableConceptModel> getServiceRequested() {
    return this.serviceRequested;
  }
  public void setServiceRequested( java.util.List<CodeableConceptModel> value) {
    this.serviceRequested = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getContext() {
    return this.context;
  }
  public void setContext( java.util.List<ReferenceModel> value) {
    this.context = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrencePeriod( String value) {
    this.occurrencePeriod = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public java.util.List<ReferralRequestRequesterModel> getRequester() {
    return this.requester;
  }
  public void setRequester( java.util.List<ReferralRequestRequesterModel> value) {
    this.requester = value;
  }
  public java.util.List<CodeableConceptModel> getSpecialty() {
    return this.specialty;
  }
  public void setSpecialty( java.util.List<CodeableConceptModel> value) {
    this.specialty = value;
  }
  public java.util.List<ReferenceModel> getRecipient() {
    return this.recipient;
  }
  public void setRecipient( java.util.List<ReferenceModel> value) {
    this.recipient = value;
  }
  public java.util.List<CodeableConceptModel> getReasonCode() {
    return this.reasonCode;
  }
  public void setReasonCode( java.util.List<CodeableConceptModel> value) {
    this.reasonCode = value;
  }
  public java.util.List<ReferenceModel> getReasonReference() {
    return this.reasonReference;
  }
  public void setReasonReference( java.util.List<ReferenceModel> value) {
    this.reasonReference = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public java.util.List<ReferenceModel> getSupportingInfo() {
    return this.supportingInfo;
  }
  public void setSupportingInfo( java.util.List<ReferenceModel> value) {
    this.supportingInfo = value;
  }
  public String getNote() {
    return this.note;
  }
  public void setNote( String value) {
    this.note = value;
  }
  public java.util.List<ReferenceModel> getRelevantHistory() {
    return this.relevantHistory;
  }
  public void setRelevantHistory( java.util.List<ReferenceModel> value) {
    this.relevantHistory = value;
  }
  public java.util.List<NarrativeModel> getText() {
    return this.text;
  }
  public void setText( java.util.List<NarrativeModel> value) {
    this.text = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
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
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ReferralRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("groupIdentifier" + "->" + this.groupIdentifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("intent" + "->" + this.intent + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime + "\n"); 
     builder.append("occurrencePeriod" + "->" + this.occurrencePeriod + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[ReferralRequestModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("definition" + "->" + this.definition + "\n"); 
     builder.append("basedOn" + "->" + this.basedOn + "\n"); 
     builder.append("replaces" + "->" + this.replaces + "\n"); 
     builder.append("groupIdentifier" + "->" + this.groupIdentifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("intent" + "->" + this.intent + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("priority" + "->" + this.priority + "\n"); 
     builder.append("serviceRequested" + "->" + this.serviceRequested + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("context" + "->" + this.context + "\n"); 
     builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime + "\n"); 
     builder.append("occurrencePeriod" + "->" + this.occurrencePeriod + "\n"); 
     builder.append("authoredOn" + "->" + this.authoredOn + "\n"); 
     builder.append("requester" + "->" + this.requester + "\n"); 
     builder.append("specialty" + "->" + this.specialty + "\n"); 
     builder.append("recipient" + "->" + this.recipient + "\n"); 
     builder.append("reasonCode" + "->" + this.reasonCode + "\n"); 
     builder.append("reasonReference" + "->" + this.reasonReference + "\n"); 
     builder.append("description" + "->" + this.description + "\n"); 
     builder.append("supportingInfo" + "->" + this.supportingInfo + "\n"); 
     builder.append("note" + "->" + this.note + "\n"); 
     builder.append("relevantHistory" + "->" + this.relevantHistory + "\n"); 
     builder.append("text" + "->" + this.text + "\n"); 
     builder.append("contained" + "->" + this.contained + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}