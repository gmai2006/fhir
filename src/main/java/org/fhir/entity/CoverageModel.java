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
* "Financial instrument which may be used to reimburse or pay for health care products and services."
*/
@Entity
@Table(name="coverage")
public class CoverageModel  implements Serializable {
	private static final long serialVersionUID = 151910893695087314L;
  /**
  * Description: "This is a Coverage resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatination of the Coverage.SubscriberID and the Coverage.dependant."
  * Actual type: List<String>;
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
  * Description: "The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization."
  */
  @javax.persistence.Basic
  @Column(name="\"type_id\"")
  private String type_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="type_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> type;

  /**
  * Description: "The party who 'owns' the insurance policy,  may be an individual, corporation or the subscriber's employer."
  */
  @javax.persistence.Basic
  @Column(name="\"policyholder_id\"")
  private String policyholder_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="policyholder_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> policyHolder;

  /**
  * Description: "The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due."
  */
  @javax.persistence.Basic
  @Column(name="\"subscriber_id\"")
  private String subscriber_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="subscriber_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> subscriber;

  /**
  * Description: "The insurer assigned ID for the Subscriber."
  */
  @javax.persistence.Basic
  @Column(name="\"subscriberId\"")
  private String subscriberId;

  /**
  * Description: "The party who benefits from the insurance coverage., the patient when services are provided."
  */
  @javax.persistence.Basic
  @Column(name="\"beneficiary_id\"")
  private String beneficiary_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="beneficiary_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> beneficiary;

  /**
  * Description: "The relationship of beneficiary (patient) to the subscriber."
  */
  @javax.persistence.Basic
  @Column(name="\"relationship_id\"")
  private String relationship_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="relationship_id", insertable=false, updatable=false)
  private java.util.List<CodeableConceptModel> relationship;

  /**
  * Description: "Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. May provide multiple identifiers such as insurance company identifier or business identifier (BIN number)."
  */
  @javax.persistence.Basic
  @Column(name="\"payor_id\"")
  private String payor_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="payor_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> payor;

  /**
  * Description: "A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan."
  */
  @javax.persistence.Basic
  @Column(name="\"grouping_id\"")
  private String grouping_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="grouping_id", insertable=false, updatable=false)
  private java.util.List<CoverageGroupingModel> grouping;

  /**
  * Description: "A unique identifier for a dependent under the coverage."
  */
  @javax.persistence.Basic
  @Column(name="\"dependent\"")
  private String dependent;

  /**
  * Description: "An optional counter for a particular instance of the identified coverage which increments upon each renewal."
  */
  @javax.persistence.Basic
  @Column(name="\"sequence\"")
  private String sequence;

  /**
  * Description: "The order of applicability of this coverage relative to other coverages which are currently inforce. Note, there may be gaps in the numbering and this does not imply primary, secondard etc. as the specific positioning of coverages depends upon the episode of care."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  @javax.persistence.Basic
  @Column(name="\"order\"")
  private Float order;

  /**
  * Description: "The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply."
  */
  @javax.persistence.Basic
  @Column(name="\"network\"")
  private String network;

  /**
  * Description: "The policy(s) which constitute this insurance coverage."
  */
  @javax.persistence.Basic
  @Column(name="\"contract_id\"")
  private String contract_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="contract_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> contract;

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

  public CoverageModel() {
  }

  public CoverageModel(Coverage o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    if (null != o.getIdentifier()) {
    	this.identifier = JsonUtils.toJson(o.getIdentifier());
    }
    this.status = o.getStatus();
    if (null != o.getType() ) {
    	this.type_id = "type" + this.id;
    	this.type = CodeableConceptHelper.toModel(o.getType(), this.type_id);
    }
    if (null != o.getPolicyHolder() ) {
    	this.policyholder_id = "policyholder" + this.id;
    	this.policyHolder = ReferenceHelper.toModel(o.getPolicyHolder(), this.policyholder_id);
    }
    if (null != o.getSubscriber() ) {
    	this.subscriber_id = "subscriber" + this.id;
    	this.subscriber = ReferenceHelper.toModel(o.getSubscriber(), this.subscriber_id);
    }
    this.subscriberId = o.getSubscriberId();
    if (null != o.getBeneficiary() ) {
    	this.beneficiary_id = "beneficiary" + this.id;
    	this.beneficiary = ReferenceHelper.toModel(o.getBeneficiary(), this.beneficiary_id);
    }
    if (null != o.getRelationship() ) {
    	this.relationship_id = "relationship" + this.id;
    	this.relationship = CodeableConceptHelper.toModel(o.getRelationship(), this.relationship_id);
    }
    if (null != o.getPeriod()) {
    	this.period = JsonUtils.toJson(o.getPeriod());
    }
    if (null != o.getPayor() && !o.getPayor().isEmpty()) {
    	this.payor_id = "payor" + this.id;
    	this.payor = ReferenceHelper.toModelFromArray(o.getPayor(), this.payor_id);
    }
    if (null != o.getGrouping() ) {
    	this.grouping_id = "grouping" + this.id;
    	this.grouping = CoverageGroupingHelper.toModel(o.getGrouping(), this.grouping_id);
    }
    this.dependent = o.getDependent();
    this.sequence = o.getSequence();
    this.order = o.getOrder();
    this.network = o.getNetwork();
    if (null != o.getContract() && !o.getContract().isEmpty()) {
    	this.contract_id = "contract" + this.id;
    	this.contract = ReferenceHelper.toModelFromArray(o.getContract(), this.contract_id);
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
  public java.util.List<CodeableConceptModel> getType() {
    return this.type;
  }
  public void setType( java.util.List<CodeableConceptModel> value) {
    this.type = value;
  }
  public java.util.List<ReferenceModel> getPolicyHolder() {
    return this.policyHolder;
  }
  public void setPolicyHolder( java.util.List<ReferenceModel> value) {
    this.policyHolder = value;
  }
  public java.util.List<ReferenceModel> getSubscriber() {
    return this.subscriber;
  }
  public void setSubscriber( java.util.List<ReferenceModel> value) {
    this.subscriber = value;
  }
  public String getSubscriberId() {
    return this.subscriberId;
  }
  public void setSubscriberId( String value) {
    this.subscriberId = value;
  }
  public java.util.List<ReferenceModel> getBeneficiary() {
    return this.beneficiary;
  }
  public void setBeneficiary( java.util.List<ReferenceModel> value) {
    this.beneficiary = value;
  }
  public java.util.List<CodeableConceptModel> getRelationship() {
    return this.relationship;
  }
  public void setRelationship( java.util.List<CodeableConceptModel> value) {
    this.relationship = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public java.util.List<ReferenceModel> getPayor() {
    return this.payor;
  }
  public void setPayor( java.util.List<ReferenceModel> value) {
    this.payor = value;
  }
  public java.util.List<CoverageGroupingModel> getGrouping() {
    return this.grouping;
  }
  public void setGrouping( java.util.List<CoverageGroupingModel> value) {
    this.grouping = value;
  }
  public String getDependent() {
    return this.dependent;
  }
  public void setDependent( String value) {
    this.dependent = value;
  }
  public String getSequence() {
    return this.sequence;
  }
  public void setSequence( String value) {
    this.sequence = value;
  }
  public Float getOrder() {
    return this.order;
  }
  public void setOrder( Float value) {
    this.order = value;
  }
  public String getNetwork() {
    return this.network;
  }
  public void setNetwork( String value) {
    this.network = value;
  }
  public java.util.List<ReferenceModel> getContract() {
    return this.contract;
  }
  public void setContract( java.util.List<ReferenceModel> value) {
    this.contract = value;
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
    builder.append("[CoverageModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("subscriberId" + "->" + this.subscriberId + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("dependent" + "->" + this.dependent + "\n"); 
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("order" + "->" + this.order + "\n"); 
     builder.append("network" + "->" + this.network + "\n"); 
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
    builder.append("[CoverageModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("identifier" + "->" + this.identifier + "\n"); 
     builder.append("status" + "->" + this.status + "\n"); 
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("policyHolder" + "->" + this.policyHolder + "\n"); 
     builder.append("subscriber" + "->" + this.subscriber + "\n"); 
     builder.append("subscriberId" + "->" + this.subscriberId + "\n"); 
     builder.append("beneficiary" + "->" + this.beneficiary + "\n"); 
     builder.append("relationship" + "->" + this.relationship + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("payor" + "->" + this.payor + "\n"); 
     builder.append("grouping" + "->" + this.grouping + "\n"); 
     builder.append("dependent" + "->" + this.dependent + "\n"); 
     builder.append("sequence" + "->" + this.sequence + "\n"); 
     builder.append("order" + "->" + this.order + "\n"); 
     builder.append("network" + "->" + this.network + "\n"); 
     builder.append("contract" + "->" + this.contract + "\n"); 
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