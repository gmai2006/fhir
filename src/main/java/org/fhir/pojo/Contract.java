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
public class Contract  {
  /**
  * Description: "This is a Contract resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Unique identifier for this Contract."
  */
  private Identifier identifier;

  /**
  * Description: "The status of the resource instance."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "When this  Contract was issued."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String issued;

  /**
  * Description: "Extensions for issued"
  */
  private transient Element _issued;

  /**
  * Description: "Relevant time or time-period when this Contract is applicable."
  */
  private Period applies;

  /**
  * Description: "The target entity impacted by or of interest to parties to the agreement."
  */
  private java.util.List<Reference> subject = new java.util.ArrayList<>();

  /**
  * Description: "The matter of concern in the context of this agreement."
  */
  private java.util.List<Reference> topic = new java.util.ArrayList<>();

  /**
  * Description: "A formally or informally recognized grouping of people, principals, organizations, or jurisdictions formed for the purpose of achieving some form of collective action such as the promulgation, administration and enforcement of contracts and policies."
  */
  private java.util.List<Reference> authority = new java.util.ArrayList<>();

  /**
  * Description: "Recognized governance framework or system operating with a circumscribed scope in accordance with specified principles, policies, processes or procedures for managing rights, actions, or behaviors of parties or principals relative to resources."
  */
  private java.util.List<Reference> domain = new java.util.ArrayList<>();

  /**
  * Description: "Type of Contract such as an insurance policy, real estate contract, a will, power of attorny, Privacy or Security policy , trust framework agreement, etc."
  */
  private CodeableConcept type;

  /**
  * Description: "More specific type or specialization of an overarching or more general contract such as auto insurance, home owner  insurance, prenupial agreement, Advanced-Directive, or privacy consent."
  */
  private java.util.List<CodeableConcept> subType = new java.util.ArrayList<>();

  /**
  * Description: "Action stipulated by this Contract."
  */
  private java.util.List<CodeableConcept> action = new java.util.ArrayList<>();

  /**
  * Description: "Reason for action stipulated by this Contract."
  */
  private java.util.List<CodeableConcept> actionReason = new java.util.ArrayList<>();

  /**
  * Description: "The type of decision made by a grantor with respect to an offer made by a grantee."
  */
  private CodeableConcept decisionType;

  /**
  * Description: "The minimal content derived from the basal information source at a specific stage in its lifecycle."
  */
  private CodeableConcept contentDerivative;

  /**
  * Description: "A set of security labels that define which resources are controlled by this consent. If more than one label is specified, all resources must have all the specified labels."
  */
  private java.util.List<Coding> securityLabel = new java.util.ArrayList<>();

  /**
  * Description: "An actor taking a role in an activity for which it can be assigned some degree of responsibility for the activity taking place."
  */
  private java.util.List<ContractAgent> agent = new java.util.ArrayList<>();

  /**
  * Description: "Parties with legal standing in the Contract, including the principal parties, the grantor(s) and grantee(s), which are any person or organization bound by the contract, and any ancillary parties, which facilitate the execution of the contract such as a notary or witness."
  */
  private java.util.List<ContractSigner> signer = new java.util.ArrayList<>();

  /**
  * Description: "Contract Valued Item List."
  */
  private java.util.List<ContractValuedItem> valuedItem = new java.util.ArrayList<>();

  /**
  * Description: "One or more Contract Provisions, which may be related and conveyed as a group, and may contain nested groups."
  */
  private java.util.List<ContractTerm> term = new java.util.ArrayList<>();

  /**
  * Description: "Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \"source of truth\" and which would be the basis for legal action related to enforcement of this Contract."
  */
  private Attachment bindingAttachment;

  /**
  * Description: "Legally binding Contract: This is the signed and legally recognized representation of the Contract, which is considered the \"source of truth\" and which would be the basis for legal action related to enforcement of this Contract."
  */
  private Reference bindingReference;

  /**
  * Description: "The \"patient friendly language\" versionof the Contract in whole or in parts. \"Patient friendly language\" means the representation of the Contract and Contract Provisions in a manner that is readily accessible and understandable by a layperson in accordance with best practices for communication styles that ensure that those agreeing to or signing the Contract understand the roles, actions, obligations, responsibilities, and implication of the agreement."
  */
  private java.util.List<ContractFriendly> friendly = new java.util.ArrayList<>();

  /**
  * Description: "List of Legal expressions or representations of this Contract."
  */
  private java.util.List<ContractLegal> legal = new java.util.ArrayList<>();

  /**
  * Description: "List of Computable Policy Rule Language Representations of this Contract."
  */
  private java.util.List<ContractRule> rule = new java.util.ArrayList<>();

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

  public Contract() {
  }

  public Contract(ContractModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getIssued()) {
        this.issued = new String(o.getIssued());
      }

      this.applies = Period.fromJson(o.getApplies());
      this.subject = Reference.fromArray(o.getSubject());

      this.topic = Reference.fromArray(o.getTopic());

      this.authority = Reference.fromArray(o.getAuthority());

      this.domain = Reference.fromArray(o.getDomain());

      this.type = CodeableConcept.fromJson(o.getType());
      this.subType = CodeableConcept.fromArray(o.getSubType());
      this.action = CodeableConcept.fromArray(o.getAction());
      this.actionReason = CodeableConcept.fromArray(o.getActionReason());
      this.decisionType = CodeableConcept.fromJson(o.getDecisionType());
      this.contentDerivative = CodeableConcept.fromJson(o.getContentDerivative());
      this.securityLabel = Coding.fromArray(o.getSecurityLabel());
      this.agent = ContractAgent.fromArray(o.getAgent());

      this.signer = ContractSigner.fromArray(o.getSigner());

      this.valuedItem = ContractValuedItem.fromArray(o.getValuedItem());

      this.term = ContractTerm.fromArray(o.getTerm());

      this.bindingAttachment = Attachment.fromJson(o.getBindingAttachment());
      if (null != o.getBindingReference()) {
        this.bindingReference = new Reference(o.getBindingReference());
        this.bindingReference.setId(this.getId());
      }

      this.friendly = ContractFriendly.fromArray(o.getFriendly());

      this.legal = ContractLegal.fromArray(o.getLegal());

      this.rule = ContractRule.fromArray(o.getRule());

      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("issued" + "[" + String.valueOf(this.issued) + "]\n"); 
     builder.append("_issued" + "[" + String.valueOf(this._issued) + "]\n"); 
     builder.append("applies" + "[" + String.valueOf(this.applies) + "]\n"); 
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("topic" + "[" + String.valueOf(this.topic) + "]\n"); 
     builder.append("authority" + "[" + String.valueOf(this.authority) + "]\n"); 
     builder.append("domain" + "[" + String.valueOf(this.domain) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("subType" + "[" + String.valueOf(this.subType) + "]\n"); 
     builder.append("action" + "[" + String.valueOf(this.action) + "]\n"); 
     builder.append("actionReason" + "[" + String.valueOf(this.actionReason) + "]\n"); 
     builder.append("decisionType" + "[" + String.valueOf(this.decisionType) + "]\n"); 
     builder.append("contentDerivative" + "[" + String.valueOf(this.contentDerivative) + "]\n"); 
     builder.append("securityLabel" + "[" + String.valueOf(this.securityLabel) + "]\n"); 
     builder.append("agent" + "[" + String.valueOf(this.agent) + "]\n"); 
     builder.append("signer" + "[" + String.valueOf(this.signer) + "]\n"); 
     builder.append("valuedItem" + "[" + String.valueOf(this.valuedItem) + "]\n"); 
     builder.append("term" + "[" + String.valueOf(this.term) + "]\n"); 
     builder.append("bindingAttachment" + "[" + String.valueOf(this.bindingAttachment) + "]\n"); 
     builder.append("bindingReference" + "[" + String.valueOf(this.bindingReference) + "]\n"); 
     builder.append("friendly" + "[" + String.valueOf(this.friendly) + "]\n"); 
     builder.append("legal" + "[" + String.valueOf(this.legal) + "]\n"); 
     builder.append("rule" + "[" + String.valueOf(this.rule) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
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

  public static java.util.List<Contract> fromArray(java.util.List<ContractModel> list) {
    return (java.util.List<Contract>)list.stream()
      .map(model -> new Contract(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<ContractModel> toModelArray(java.util.List<Contract> list) {
    return (java.util.List<ContractModel>)list.stream()
      .map(model -> new ContractModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Contract fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Contract.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Contract o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Contract> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}