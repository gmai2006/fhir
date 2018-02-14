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
/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
@Entity
@Table(name="contract")
public class ContractModel  implements Serializable {
	private static final long serialVersionUID = 151857669660828743L;
  /**
  * Description: "This is a Contract resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "Unique identifier for this Contract."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"identifier\"", length = 16777215)
  private String identifier;

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"status\"")
  private String status;

  /**
  * Description: "When this  Contract was issued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"issued\"")
  private String issued;

  /**
  * Description: "Relevant time or time-period when this Contract is applicable."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"applies\"", length = 16777215)
  private String applies;

  /**
  * Description: "The target entity impacted by or of interest to parties to the agreement."
  */
  @javax.persistence.Basic
  @Column(name="\"subject_id\"")
  private String subject_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subject_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subject;

  /**
  * Description: "The matter of concern in the context of this agreement."
  */
  @javax.persistence.Basic
  @Column(name="\"topic_id\"")
  private String topic_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="topic_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> topic;

  /**
  * Description: "A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies."
  */
  @javax.persistence.Basic
  @Column(name="\"authority_id\"")
  private String authority_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="authority_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> authority;

  /**
  * Description: "Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources."
  */
  @javax.persistence.Basic
  @Column(name="\"domain_id\"")
  private String domain_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="domain_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> domain;

  /**
  * Description: "Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"subType\"", length = 16777215)
  private String subType;

  /**
  * Description: "Action stipulated by this Contract."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"action\"", length = 16777215)
  private String action;

  /**
  * Description: "Reason for action stipulated by this Contract."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"actionReason\"", length = 16777215)
  private String actionReason;

  /**
  * Description: "The type of decision made by a grantor with respect to an offer made by a grantee."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"decisionType\"", length = 16777215)
  private String decisionType;

  /**
  * Description: "The minimal content derived from the basal information source at a specific stage in its lifecycle."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contentDerivative\"", length = 16777215)
  private String contentDerivative;

  /**
  * Description: "A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"securityLabel\"", length = 16777215)
  private String securityLabel;

  /**
  * Description: "An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place."
  */
  @javax.persistence.Basic
  @Column(name="\"agent_id\"")
  private String agent_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="agent_id", insertable=false, updatable=false)
  private java.util.List<ContractAgentModel> agent;

  /**
  * Description: "Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness."
  */
  @javax.persistence.Basic
  @Column(name="\"signer_id\"")
  private String signer_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="signer_id", insertable=false, updatable=false)
  private java.util.List<ContractSignerModel> signer;

  /**
  * Description: "Contract Valued Item List."
  */
  @javax.persistence.Basic
  @Column(name="\"valueditem_id\"")
  private String valueditem_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="valueditem_id", insertable=false, updatable=false)
  private java.util.List<ContractValuedItemModel> valuedItem;

  /**
  * Description: "One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups."
  */
  @javax.persistence.Basic
  @Column(name="\"term_id\"")
  private String term_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="term_id", insertable=false, updatable=false)
  private java.util.List<ContractTermModel> term;

  /**
  * Description: "Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \"source of truth\" and which would be the basis for legal action related to enforcement of this Contract."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"bindingAttachment\"", length = 16777215)
  private String bindingAttachment;

  /**
  * Description: "Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \"source of truth\" and which would be the basis for legal action related to enforcement of this Contract."
  */
  @javax.persistence.Basic
  @Column(name="\"bindingreference_id\"")
  private String bindingreference_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="bindingreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> bindingReference;

  /**
  * Description: "The \"patient friendly language\" versionof the Contract in whole or in parts. \"Patient friendly language\" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement."
  */
  @javax.persistence.Basic
  @Column(name="\"friendly_id\"")
  private String friendly_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="friendly_id", insertable=false, updatable=false)
  private java.util.List<ContractFriendlyModel> friendly;

  /**
  * Description: "List of Legal expressions or representations of this Contract."
  */
  @javax.persistence.Basic
  @Column(name="\"legal_id\"")
  private String legal_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="legal_id", insertable=false, updatable=false)
  private java.util.List<ContractLegalModel> legal;

  /**
  * Description: "List of Computable Policy Rule Language Representations of this Contract."
  */
  @javax.persistence.Basic
  @Column(name="\"rule_id\"")
  private String rule_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="rule_id", insertable=false, updatable=false)
  private java.util.List<ContractRuleModel> rule;

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

  public ContractModel() {
  }

  public ContractModel(Contract o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.identifier = IdentifierHelper.toJson(o.getIdentifier());
    this.status = o.getStatus();
    this.issued = o.getIssued();
    this.applies = PeriodHelper.toJson(o.getApplies());
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
    	this.subject_id = "subject" + this.id;
    	this.subject = ReferenceHelper.toModelFromArray(o.getSubject(), this.subject_id);
    }
    if (null != o.getTopic() && !o.getTopic().isEmpty()) {
    	this.topic_id = "topic" + this.id;
    	this.topic = ReferenceHelper.toModelFromArray(o.getTopic(), this.topic_id);
    }
    if (null != o.getAuthority() && !o.getAuthority().isEmpty()) {
    	this.authority_id = "authority" + this.id;
    	this.authority = ReferenceHelper.toModelFromArray(o.getAuthority(), this.authority_id);
    }
    if (null != o.getDomain() && !o.getDomain().isEmpty()) {
    	this.domain_id = "domain" + this.id;
    	this.domain = ReferenceHelper.toModelFromArray(o.getDomain(), this.domain_id);
    }
    this.type = CodeableConceptHelper.toJson(o.getType());
    this.decisionType = CodeableConceptHelper.toJson(o.getDecisionType());
    this.contentDerivative = CodeableConceptHelper.toJson(o.getContentDerivative());
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent_id = "agent" + this.id;
    	this.agent = ContractAgentHelper.toModelFromArray(o.getAgent(), this.agent_id);
    }
    if (null != o.getSigner() && !o.getSigner().isEmpty()) {
    	this.signer_id = "signer" + this.id;
    	this.signer = ContractSignerHelper.toModelFromArray(o.getSigner(), this.signer_id);
    }
    if (null != o.getValuedItem() && !o.getValuedItem().isEmpty()) {
    	this.valueditem_id = "valueditem" + this.id;
    	this.valuedItem = ContractValuedItemHelper.toModelFromArray(o.getValuedItem(), this.valueditem_id);
    }
    if (null != o.getTerm() && !o.getTerm().isEmpty()) {
    	this.term_id = "term" + this.id;
    	this.term = ContractTermHelper.toModelFromArray(o.getTerm(), this.term_id);
    }
    this.bindingAttachment = AttachmentHelper.toJson(o.getBindingAttachment());
    if (null != o.getBindingReference() ) {
    	this.bindingreference_id = "bindingreference" + this.id;
    	this.bindingReference = ReferenceHelper.toModel(o.getBindingReference(), this.bindingreference_id);
    }
    if (null != o.getFriendly() && !o.getFriendly().isEmpty()) {
    	this.friendly_id = "friendly" + this.id;
    	this.friendly = ContractFriendlyHelper.toModelFromArray(o.getFriendly(), this.friendly_id);
    }
    if (null != o.getLegal() && !o.getLegal().isEmpty()) {
    	this.legal_id = "legal" + this.id;
    	this.legal = ContractLegalHelper.toModelFromArray(o.getLegal(), this.legal_id);
    }
    if (null != o.getRule() && !o.getRule().isEmpty()) {
    	this.rule_id = "rule" + this.id;
    	this.rule = ContractRuleHelper.toModelFromArray(o.getRule(), this.rule_id);
    }
    if (null != o.getText() ) {
    	this.text_id = "text" + this.id;
    	this.text = NarrativeHelper.toModel(o.getText(), this.text_id);
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
  public String getIssued() {
    return this.issued;
  }
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getApplies() {
    return this.applies;
  }
  public void setApplies( String value) {
    this.applies = value;
  }
  public java.util.List<ReferenceModel> getSubject() {
    return this.subject;
  }
  public void setSubject( java.util.List<ReferenceModel> value) {
    this.subject = value;
  }
  public java.util.List<ReferenceModel> getTopic() {
    return this.topic;
  }
  public void setTopic( java.util.List<ReferenceModel> value) {
    this.topic = value;
  }
  public java.util.List<ReferenceModel> getAuthority() {
    return this.authority;
  }
  public void setAuthority( java.util.List<ReferenceModel> value) {
    this.authority = value;
  }
  public java.util.List<ReferenceModel> getDomain() {
    return this.domain;
  }
  public void setDomain( java.util.List<ReferenceModel> value) {
    this.domain = value;
  }
  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getSubType() {
    return this.subType;
  }
  public void setSubType( String value) {
    this.subType = value;
  }
  public String getAction() {
    return this.action;
  }
  public void setAction( String value) {
    this.action = value;
  }
  public String getActionReason() {
    return this.actionReason;
  }
  public void setActionReason( String value) {
    this.actionReason = value;
  }
  public String getDecisionType() {
    return this.decisionType;
  }
  public void setDecisionType( String value) {
    this.decisionType = value;
  }
  public String getContentDerivative() {
    return this.contentDerivative;
  }
  public void setContentDerivative( String value) {
    this.contentDerivative = value;
  }
  public String getSecurityLabel() {
    return this.securityLabel;
  }
  public void setSecurityLabel( String value) {
    this.securityLabel = value;
  }
  public java.util.List<ContractAgentModel> getAgent() {
    return this.agent;
  }
  public void setAgent( java.util.List<ContractAgentModel> value) {
    this.agent = value;
  }
  public java.util.List<ContractSignerModel> getSigner() {
    return this.signer;
  }
  public void setSigner( java.util.List<ContractSignerModel> value) {
    this.signer = value;
  }
  public java.util.List<ContractValuedItemModel> getValuedItem() {
    return this.valuedItem;
  }
  public void setValuedItem( java.util.List<ContractValuedItemModel> value) {
    this.valuedItem = value;
  }
  public java.util.List<ContractTermModel> getTerm() {
    return this.term;
  }
  public void setTerm( java.util.List<ContractTermModel> value) {
    this.term = value;
  }
  public String getBindingAttachment() {
    return this.bindingAttachment;
  }
  public void setBindingAttachment( String value) {
    this.bindingAttachment = value;
  }
  public java.util.List<ReferenceModel> getBindingReference() {
    return this.bindingReference;
  }
  public void setBindingReference( java.util.List<ReferenceModel> value) {
    this.bindingReference = value;
  }
  public java.util.List<ContractFriendlyModel> getFriendly() {
    return this.friendly;
  }
  public void setFriendly( java.util.List<ContractFriendlyModel> value) {
    this.friendly = value;
  }
  public java.util.List<ContractLegalModel> getLegal() {
    return this.legal;
  }
  public void setLegal( java.util.List<ContractLegalModel> value) {
    this.legal = value;
  }
  public java.util.List<ContractRuleModel> getRule() {
    return this.rule;
  }
  public void setRule( java.util.List<ContractRuleModel> value) {
    this.rule = value;
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
    builder.append("[ContractModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("applies" + "->" + this.applies + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("subType" + "->" + this.subType + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("actionReason" + "->" + this.actionReason + "\n"); 
     builder.append("decisionType" + "->" + this.decisionType + "\n"); 
     builder.append("contentDerivative" + "->" + this.contentDerivative + "\n"); 
     builder.append("securityLabel" + "->" + this.securityLabel + "\n"); 
     builder.append("bindingAttachment" + "->" + this.bindingAttachment + "\n"); 
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
    builder.append("[ContractModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("issued" + "->" + this.issued + "\n"); 
     builder.append("applies" + "->" + this.applies + "\n"); 
     builder.append("subject" + "->" + this.subject + "\n"); 
     builder.append("topic" + "->" + this.topic + "\n"); 
     builder.append("authority" + "->" + this.authority + "\n"); 
     builder.append("domain" + "->" + this.domain + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("subType" + "->" + this.subType + "\n"); 
     builder.append("action" + "->" + this.action + "\n"); 
     builder.append("actionReason" + "->" + this.actionReason + "\n"); 
     builder.append("decisionType" + "->" + this.decisionType + "\n"); 
     builder.append("contentDerivative" + "->" + this.contentDerivative + "\n"); 
     builder.append("securityLabel" + "->" + this.securityLabel + "\n"); 
     builder.append("agent" + "->" + this.agent + "\n"); 
     builder.append("signer" + "->" + this.signer + "\n"); 
     builder.append("valuedItem" + "->" + this.valuedItem + "\n"); 
     builder.append("term" + "->" + this.term + "\n"); 
     builder.append("bindingAttachment" + "->" + this.bindingAttachment + "\n"); 
     builder.append("bindingReference" + "->" + this.bindingReference + "\n"); 
     builder.append("friendly" + "->" + this.friendly + "\n"); 
     builder.append("legal" + "->" + this.legal + "\n"); 
     builder.append("rule" + "->" + this.rule + "\n"); 
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