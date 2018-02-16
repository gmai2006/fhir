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
import org.fhir.entity.ContractModel;
import com.google.gson.GsonBuilder;

/**
* "A formal agreement between parties regarding the conduct of business, exchange of information or other matters."
*/
public class Contract  extends DomainResource  {
  /**
  * Description: "This is a Contract resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Unique identifier for this Contract."
  */
  protected Identifier identifier;

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "When this  Contract was issued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String issued;

  /**
  * Description: "Extensions for issued"
  */
  protected transient Element _issued;

  /**
  * Description: "Relevant time or time-period when this Contract is applicable."
  */
  protected Period applies;

  /**
  * Description: "The target entity impacted by or of interest to parties to the agreement."
  */
  protected java.util.List<Reference> subject = new java.util.ArrayList<>();

  /**
  * Description: "The matter of concern in the context of this agreement."
  */
  protected java.util.List<Reference> topic = new java.util.ArrayList<>();

  /**
  * Description: "A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies."
  */
  protected java.util.List<Reference> authority = new java.util.ArrayList<>();

  /**
  * Description: "Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources."
  */
  protected java.util.List<Reference> domain = new java.util.ArrayList<>();

  /**
  * Description: "Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc."
  */
  protected CodeableConcept type;

  /**
  * Description: "More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent."
  */
  protected java.util.List<CodeableConcept> subType = new java.util.ArrayList<>();

  /**
  * Description: "Action stipulated by this Contract."
  */
  protected java.util.List<CodeableConcept> action = new java.util.ArrayList<>();

  /**
  * Description: "Reason for action stipulated by this Contract."
  */
  protected java.util.List<CodeableConcept> actionReason = new java.util.ArrayList<>();

  /**
  * Description: "The type of decision made by a grantor with respect to an offer made by a grantee."
  */
  protected CodeableConcept decisionType;

  /**
  * Description: "The minimal content derived from the basal information source at a specific stage in its lifecycle."
  */
  protected CodeableConcept contentDerivative;

  /**
  * Description: "A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels."
  */
  protected java.util.List<Coding> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place."
  */
  protected java.util.List<ContractAgent> agent = new java.util.ArrayList<>();

  /**
  * Description: "Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness."
  */
  protected java.util.List<ContractSigner> signer = new java.util.ArrayList<>();

  /**
  * Description: "Contract Valued Item List."
  */
  protected java.util.List<ContractValuedItem> valuedItem = new java.util.ArrayList<>();

  /**
  * Description: "One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups."
  */
  protected java.util.List<ContractTerm> term = new java.util.ArrayList<>();

  /**
  * Description: "Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \"source of truth\" and which would be the basis for legal action related to enforcement of this Contract."
  */
  protected Attachment bindingAttachment;

  /**
  * Description: "Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \"source of truth\" and which would be the basis for legal action related to enforcement of this Contract."
  */
  protected Reference bindingReference;

  /**
  * Description: "The \"patient friendly language\" versionof the Contract in whole or in parts. \"Patient friendly language\" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement."
  */
  protected java.util.List<ContractFriendly> friendly = new java.util.ArrayList<>();

  /**
  * Description: "List of Legal expressions or representations of this Contract."
  */
  protected java.util.List<ContractLegal> legal = new java.util.ArrayList<>();

  /**
  * Description: "List of Computable Policy Rule Language Representations of this Contract."
  */
  protected java.util.List<ContractRule> rule = new java.util.ArrayList<>();

  public Contract() {
  }

  public Contract(ContractModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getIssued()) {
      this.issued = o.getIssued();
    }
    this.applies = PeriodHelper.fromJson(o.getApplies());
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
    	this.subject = ReferenceHelper.fromArray2Array(o.getSubject());
    }
    if (null != o.getTopic() && !o.getTopic().isEmpty()) {
    	this.topic = ReferenceHelper.fromArray2Array(o.getTopic());
    }
    if (null != o.getAuthority() && !o.getAuthority().isEmpty()) {
    	this.authority = ReferenceHelper.fromArray2Array(o.getAuthority());
    }
    if (null != o.getDomain() && !o.getDomain().isEmpty()) {
    	this.domain = ReferenceHelper.fromArray2Array(o.getDomain());
    }
    this.type = CodeableConceptHelper.fromJson(o.getType());
    this.decisionType = CodeableConceptHelper.fromJson(o.getDecisionType());
    this.contentDerivative = CodeableConceptHelper.fromJson(o.getContentDerivative());
    if (null != o.getAgent() && !o.getAgent().isEmpty()) {
    	this.agent = ContractAgentHelper.fromArray2Array(o.getAgent());
    }
    if (null != o.getSigner() && !o.getSigner().isEmpty()) {
    	this.signer = ContractSignerHelper.fromArray2Array(o.getSigner());
    }
    if (null != o.getValuedItem() && !o.getValuedItem().isEmpty()) {
    	this.valuedItem = ContractValuedItemHelper.fromArray2Array(o.getValuedItem());
    }
    if (null != o.getTerm() && !o.getTerm().isEmpty()) {
    	this.term = ContractTermHelper.fromArray2Array(o.getTerm());
    }
    this.bindingAttachment = AttachmentHelper.fromJson(o.getBindingAttachment());
    if (null != o.getBindingReference() && !o.getBindingReference().isEmpty()) {
      this.bindingReference = new Reference(o.getBindingReference().get(0));
    }
    if (null != o.getFriendly() && !o.getFriendly().isEmpty()) {
    	this.friendly = ContractFriendlyHelper.fromArray2Array(o.getFriendly());
    }
    if (null != o.getLegal() && !o.getLegal().isEmpty()) {
    	this.legal = ContractLegalHelper.fromArray2Array(o.getLegal());
    }
    if (null != o.getRule() && !o.getRule().isEmpty()) {
    	this.rule = ContractRuleHelper.fromArray2Array(o.getRule());
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
    this.status = value;
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
  public void setIssued( String value) {
    this.issued = value;
  }
  public String getIssued() {
    return this.issued;
  }
  public void set_issued( Element value) {
    this._issued = value;
  }
  public Element get_issued() {
    return this._issued;
  }
  public void setApplies( Period value) {
    this.applies = value;
  }
  public Period getApplies() {
    return this.applies;
  }
  public void setSubject( java.util.List<Reference> value) {
    this.subject = value;
  }
  public java.util.List<Reference> getSubject() {
    return this.subject;
  }
  public void setTopic( java.util.List<Reference> value) {
    this.topic = value;
  }
  public java.util.List<Reference> getTopic() {
    return this.topic;
  }
  public void setAuthority( java.util.List<Reference> value) {
    this.authority = value;
  }
  public java.util.List<Reference> getAuthority() {
    return this.authority;
  }
  public void setDomain( java.util.List<Reference> value) {
    this.domain = value;
  }
  public java.util.List<Reference> getDomain() {
    return this.domain;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setSubType( java.util.List<CodeableConcept> value) {
    this.subType = value;
  }
  public java.util.List<CodeableConcept> getSubType() {
    return this.subType;
  }
  public void setAction( java.util.List<CodeableConcept> value) {
    this.action = value;
  }
  public java.util.List<CodeableConcept> getAction() {
    return this.action;
  }
  public void setActionReason( java.util.List<CodeableConcept> value) {
    this.actionReason = value;
  }
  public java.util.List<CodeableConcept> getActionReason() {
    return this.actionReason;
  }
  public void setDecisionType( CodeableConcept value) {
    this.decisionType = value;
  }
  public CodeableConcept getDecisionType() {
    return this.decisionType;
  }
  public void setContentDerivative( CodeableConcept value) {
    this.contentDerivative = value;
  }
  public CodeableConcept getContentDerivative() {
    return this.contentDerivative;
  }
  public void setSecurityLabel( java.util.List<Coding> value) {
    this.securityLabel = value;
  }
  public java.util.List<Coding> getSecurityLabel() {
    return this.securityLabel;
  }
  public void setAgent( java.util.List<ContractAgent> value) {
    this.agent = value;
  }
  public java.util.List<ContractAgent> getAgent() {
    return this.agent;
  }
  public void setSigner( java.util.List<ContractSigner> value) {
    this.signer = value;
  }
  public java.util.List<ContractSigner> getSigner() {
    return this.signer;
  }
  public void setValuedItem( java.util.List<ContractValuedItem> value) {
    this.valuedItem = value;
  }
  public java.util.List<ContractValuedItem> getValuedItem() {
    return this.valuedItem;
  }
  public void setTerm( java.util.List<ContractTerm> value) {
    this.term = value;
  }
  public java.util.List<ContractTerm> getTerm() {
    return this.term;
  }
  public void setBindingAttachment( Attachment value) {
    this.bindingAttachment = value;
  }
  public Attachment getBindingAttachment() {
    return this.bindingAttachment;
  }
  public void setBindingReference( Reference value) {
    this.bindingReference = value;
  }
  public Reference getBindingReference() {
    return this.bindingReference;
  }
  public void setFriendly( java.util.List<ContractFriendly> value) {
    this.friendly = value;
  }
  public java.util.List<ContractFriendly> getFriendly() {
    return this.friendly;
  }
  public void setLegal( java.util.List<ContractLegal> value) {
    this.legal = value;
  }
  public java.util.List<ContractLegal> getLegal() {
    return this.legal;
  }
  public void setRule( java.util.List<ContractRule> value) {
    this.rule = value;
  }
  public java.util.List<ContractRule> getRule() {
    return this.rule;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Contract]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.issued != null) builder.append("issued" + "->" + this.issued.toString() + "\n"); 
     if(this._issued != null) builder.append("_issued" + "->" + this._issued.toString() + "\n"); 
     if(this.applies != null) builder.append("applies" + "->" + this.applies.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.topic != null) builder.append("topic" + "->" + this.topic.toString() + "\n"); 
     if(this.authority != null) builder.append("authority" + "->" + this.authority.toString() + "\n"); 
     if(this.domain != null) builder.append("domain" + "->" + this.domain.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.subType != null) builder.append("subType" + "->" + this.subType.toString() + "\n"); 
     if(this.action != null) builder.append("action" + "->" + this.action.toString() + "\n"); 
     if(this.actionReason != null) builder.append("actionReason" + "->" + this.actionReason.toString() + "\n"); 
     if(this.decisionType != null) builder.append("decisionType" + "->" + this.decisionType.toString() + "\n"); 
     if(this.contentDerivative != null) builder.append("contentDerivative" + "->" + this.contentDerivative.toString() + "\n"); 
     if(this.securityLabel != null) builder.append("securityLabel" + "->" + this.securityLabel.toString() + "\n"); 
     if(this.agent != null) builder.append("agent" + "->" + this.agent.toString() + "\n"); 
     if(this.signer != null) builder.append("signer" + "->" + this.signer.toString() + "\n"); 
     if(this.valuedItem != null) builder.append("valuedItem" + "->" + this.valuedItem.toString() + "\n"); 
     if(this.term != null) builder.append("term" + "->" + this.term.toString() + "\n"); 
     if(this.bindingAttachment != null) builder.append("bindingAttachment" + "->" + this.bindingAttachment.toString() + "\n"); 
     if(this.bindingReference != null) builder.append("bindingReference" + "->" + this.bindingReference.toString() + "\n"); 
     if(this.friendly != null) builder.append("friendly" + "->" + this.friendly.toString() + "\n"); 
     if(this.legal != null) builder.append("legal" + "->" + this.legal.toString() + "\n"); 
     if(this.rule != null) builder.append("rule" + "->" + this.rule.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Contract,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Contract" : { return Contract.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}