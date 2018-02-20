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
* "A record of a healthcare consumer’s policy choices, which permits or denies identified recipient(s) or recipient role(s) to perform one or more actions within a given policy context, for specific purposes and periods of time."
*/
@Entity
@Table(name="consent")
public class ConsentModel  implements Serializable {
	private static final long serialVersionUID = 151910893730033192L;
  /**
  * Description: "This is a Consent resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Unique identifier for this copy of the Consent Statement."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "Indicates the current state of this consent."
  */
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "A classification of the type of consents found in the statement. This element supports indexing and retrieval of consent statements."
  */
  @javax.persistence.Basic
  @Column(name="\"category_id\"")
  private String category_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="category_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> category;

  /**
  * Description: "The patient/healthcare consumer to whom this consent applies."
  */
  @javax.persistence.Basic
  @Column(name="\"patient_id\"")
  private String patient_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="patient_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> patient;

  /**
  * Description: "Relevant time or time-period when this Consent is applicable."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "When this  Consent was issued / created / indexed."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"dateTime\"")
  private String dateTime;

  /**
  * Description: "Either the Grantor, which is the entity responsible for granting the rights listed in a Consent Directive or the Grantee, which is the entity responsible for complying with the Consent Directive, including any obligations or limitations on authorizations and enforcement of prohibitions."
  */
  @javax.persistence.Basic
  @Column(name="\"consentingparty_id\"")
  private String consentingparty_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="consentingparty_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> consentingParty;

  /**
  * Description: "Who or what is controlled by this consent. Use group to identify a set of actors by some property they share (e.g. 'admitting officers')."
  */
  @javax.persistence.Basic
  @Column(name="\"actor_id\"")
  private String actor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="actor_id", insertable=false, updatable=false)
  private java.util.List<ConsentActorModel> actor;

  /**
  * Description: "Actions controlled by this consent."
  */
  @javax.persistence.Basic
  @Column(name="\"action_id\"")
  private String action_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="action_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> action;

  /**
  * Description: "The organization that manages the consent, and the framework within which it is executed."
  */
  @javax.persistence.Basic
  @Column(name="\"organization_id\"")
  private String organization_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="organization_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> organization;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"sourceAttachment\"", length = 16777215)
  private String sourceAttachment;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"sourceIdentifier\"", length = 16777215)
  private String sourceIdentifier;

  /**
  * Description: "The source on which this consent statement is based. The source might be a scanned original paper form, or a reference to a consent that links back to such a source, a reference to a document repository (e.g. XDS) that stores the original consent document."
  */
  @javax.persistence.Basic
  @Column(name="\"sourcereference_id\"")
  private String sourcereference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="sourcereference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> sourceReference;

  /**
  * Description: "The references to the policies that are included in this consent scope. Policies may be organizational, but are often defined jurisdictionally, or in law."
  */
  @javax.persistence.Basic
  @Column(name="\"policy_id\"")
  private String policy_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="policy_id", insertable=false, updatable=false)
  private java.util.List<ConsentPolicyModel> policy;

  /**
  * Description: "A referece to the specific computable policy."
  */
  @javax.persistence.Basic
  @Column(name="\"policyRule\"")
  private String policyRule;

  /**
  * Description: "A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels."
  */
  @javax.persistence.Basic
  @Column(name="\"securitylabel_id\"")
  private String securitylabel_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="securitylabel_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> securityLabel;

  /**
  * Description: "The context of the activities a user is taking - why the user is accessing the data - that are controlled by this consent."
  */
  @javax.persistence.Basic
  @Column(name="\"purpose_id\"")
  private String purpose_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="purpose_id", insertable=false, updatable=false)
  private java.util.List<CodingModel> purpose;

  /**
  * Description: "Clinical or Operational Relevant period of time that bounds the data controlled by this consent."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"dataPeriod\"", length = 16777215)
  private String dataPeriod;

  /**
  * Description: "The resources controlled by this consent, if specific resources are referenced."
  */
  @javax.persistence.Basic
  @Column(name="\"data_id\"")
  private String data_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="data_id", insertable=false, updatable=false)
  private java.util.List<ConsentDataModel> data;

  /**
  * Description: "An exception to the base policy of this consent. An exception can be an addition or removal of access permissions."
  */
  @javax.persistence.Basic
  @Column(name="\"except_id\"")
  private String except_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="except_id", insertable=false, updatable=false)
  private java.util.List<ConsentExceptModel> except;

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="text_id", insertable=false, updatable=false)
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
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
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

  public ConsentModel() {
  }

  public ConsentModel(Consent o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
    	this.category_id = "category" + this.id;
    	this.category = CodeableConceptHelper.toModelFromArray(o.getCategory(), this.category_id);
    }
    if (null != o.getPatient() ) {
    	this.patient_id = "patient" + this.id;
    	this.patient = ReferenceHelper.toModel(o.getPatient(), this.patient_id);
    }
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    this.dateTime = o.getDateTime();
    if (null != o.getConsentingParty() && !o.getConsentingParty().isEmpty()) {
    	this.consentingparty_id = "consentingparty" + this.id;
    	this.consentingParty = ReferenceHelper.toModelFromArray(o.getConsentingParty(), this.consentingparty_id);
    }
    if (null != o.getActor() && !o.getActor().isEmpty()) {
    	this.actor_id = "actor" + this.id;
    	this.actor = ConsentActorHelper.toModelFromArray(o.getActor(), this.actor_id);
    }
    if (null != o.getAction() && !o.getAction().isEmpty()) {
    	this.action_id = "action" + this.id;
    	this.action = CodeableConceptHelper.toModelFromArray(o.getAction(), this.action_id);
    }
    if (null != o.getOrganization() && !o.getOrganization().isEmpty()) {
    	this.organization_id = "organization" + this.id;
    	this.organization = ReferenceHelper.toModelFromArray(o.getOrganization(), this.organization_id);
    }
    if (null != o.getSourceAttachment()) {
    	this.sourceAttachment = JsonUtils.toJson(o.getSourceAttachment());
    }
    if (null != o.getSourceIdentifier()) {
    	this.sourceIdentifier = JsonUtils.toJson(o.getSourceIdentifier());
    }
    if (null != o.getSourceReference() ) {
    	this.sourcereference_id = "sourcereference" + this.id;
    	this.sourceReference = ReferenceHelper.toModel(o.getSourceReference(), this.sourcereference_id);
    }
    if (null != o.getPolicy() && !o.getPolicy().isEmpty()) {
    	this.policy_id = "policy" + this.id;
    	this.policy = ConsentPolicyHelper.toModelFromArray(o.getPolicy(), this.policy_id);
    }
    this.policyRule = o.getPolicyRule();
    if (null != o.getSecurityLabel() && !o.getSecurityLabel().isEmpty()) {
    	this.securitylabel_id = "securitylabel" + this.id;
    	this.securityLabel = CodingHelper.toModelFromArray(o.getSecurityLabel(), this.securitylabel_id);
    }
    if (null != o.getPurpose() && !o.getPurpose().isEmpty()) {
    	this.purpose_id = "purpose" + this.id;
    	this.purpose = CodingHelper.toModelFromArray(o.getPurpose(), this.purpose_id);
    }
    if (null != o.getDataPeriod()) {
    	this.dataPeriod = JsonUtils.toJson(o.getDataPeriod());
    }
    if (null != o.getData() && !o.getData().isEmpty()) {
    	this.data_id = "data" + this.id;
    	this.data = ConsentDataHelper.toModelFromArray(o.getData(), this.data_id);
    }
    if (null != o.getExcept() && !o.getExcept().isEmpty()) {
    	this.except_id = "except" + this.id;
    	this.except = ConsentExceptHelper.toModelFromArray(o.getExcept(), this.except_id);
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
  public String getStatus() {
    return this.status;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public java.util.List<CodeableConceptModel> getCategory() {
    return this.category;
  }
  public void setCategory( java.util.List<CodeableConceptModel> value) {
    this.category = value;
  }
  public java.util.List<ReferenceModel> getPatient() {
    return this.patient;
  }
  public void setPatient( java.util.List<ReferenceModel> value) {
    this.patient = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getDateTime() {
    return this.dateTime;
  }
  public void setDateTime( String value) {
    this.dateTime = value;
  }
  public java.util.List<ReferenceModel> getConsentingParty() {
    return this.consentingParty;
  }
  public void setConsentingParty( java.util.List<ReferenceModel> value) {
    this.consentingParty = value;
  }
  public java.util.List<ConsentActorModel> getActor() {
    return this.actor;
  }
  public void setActor( java.util.List<ConsentActorModel> value) {
    this.actor = value;
  }
  public java.util.List<CodeableConceptModel> getAction() {
    return this.action;
  }
  public void setAction( java.util.List<CodeableConceptModel> value) {
    this.action = value;
  }
  public java.util.List<ReferenceModel> getOrganization() {
    return this.organization;
  }
  public void setOrganization( java.util.List<ReferenceModel> value) {
    this.organization = value;
  }
  public String getSourceAttachment() {
    return this.sourceAttachment;
  }
  public void setSourceAttachment( String value) {
    this.sourceAttachment = value;
  }
  public String getSourceIdentifier() {
    return this.sourceIdentifier;
  }
  public void setSourceIdentifier( String value) {
    this.sourceIdentifier = value;
  }
  public java.util.List<ReferenceModel> getSourceReference() {
    return this.sourceReference;
  }
  public void setSourceReference( java.util.List<ReferenceModel> value) {
    this.sourceReference = value;
  }
  public java.util.List<ConsentPolicyModel> getPolicy() {
    return this.policy;
  }
  public void setPolicy( java.util.List<ConsentPolicyModel> value) {
    this.policy = value;
  }
  public String getPolicyRule() {
    return this.policyRule;
  }
  public void setPolicyRule( String value) {
    this.policyRule = value;
  }
  public java.util.List<CodingModel> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setSecurityLabel( java.util.List<CodingModel> value) {
    this.securityLabel = value;
  }
  public java.util.List<CodingModel> getPurpose() {
    return this.purpose;
  }
  public void setPurpose( java.util.List<CodingModel> value) {
    this.purpose = value;
  }
  public String getDataPeriod() {
    return this.dataPeriod;
  }
  public void setDataPeriod( String value) {
    this.dataPeriod = value;
  }
  public java.util.List<ConsentDataModel> getData() {
    return this.data;
  }
  public void setData( java.util.List<ConsentDataModel> value) {
    this.data = value;
  }
  public java.util.List<ConsentExceptModel> getExcept() {
    return this.except;
  }
  public void setExcept( java.util.List<ConsentExceptModel> value) {
    this.except = value;
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
    builder.append("[ConsentModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("dateTime" + "->" + this.dateTime + "\n"); 
     builder.append("sourceAttachment" + "->" + this.sourceAttachment + "\n"); 
     builder.append("sourceIdentifier" + "->" + this.sourceIdentifier + "\n"); 
     builder.append("policyRule" + "->" + this.policyRule + "\n"); 
     builder.append("dataPeriod" + "->" + this.dataPeriod + "\n"); 
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
    builder.append("[ConsentModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("category" + "->" + this.category + "\n"); 
     builder.append("patient" + "->" + this.patient + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("dateTime" + "->" + this.dateTime + "\n"); 
     builder.append("consentingParty" + "->" + this.consentingParty + "\n"); 
     builder.append("actor" + "->" + this.actor + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("organization" + "->" + this.organization + "\n"); 
     builder.append("sourceAttachment" + "->" + this.sourceAttachment + "\n"); 
     builder.append("sourceIdentifier" + "->" + this.sourceIdentifier + "\n"); 
     builder.append("sourceReference" + "->" + this.sourceReference + "\n"); 
     builder.append("policy" + "->" + this.policy + "\n"); 
     builder.append("policyRule" + "->" + this.policyRule + "\n"); 
     builder.append("securityLabel" + "->" + this.securityLabel + "\n"); 
     builder.append("purpose" + "->" + this.purpose + "\n"); 
     builder.append("dataPeriod" + "->" + this.dataPeriod + "\n"); 
     builder.append("data" + "->" + this.data + "\n"); 
     builder.append("except" + "->" + this.except + "\n"); 
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