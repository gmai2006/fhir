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

/**
* "Financial instrument which may be used to reimburse or pay for health care products and services."
*/
@Entity
@Table(name="coverage")
public class CoverageModel  {
  /**
  * Description: "This is a Coverage resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatination of the Coverage.SubscriberID and the Coverage.dependant."
  * Actual type: Array of Identifier-> List<Identifier>
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
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"type\"", length = 16777215)
  private String type;

  /**
  * Description: "The party who 'owns' the insurance policy,  may be an individual, corporation or the subscriber's employer."
  */
  @javax.persistence.Basic
  @Column(name="\"policyholder_id\"")
  private String policyholder_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`policyholder_id`", insertable=false, updatable=false)
  private ReferenceModel policyHolder;

  /**
  * Description: "The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due."
  */
  @javax.persistence.Basic
  @Column(name="\"subscriber_id\"")
  private String subscriber_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`subscriber_id`", insertable=false, updatable=false)
  private ReferenceModel subscriber;

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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`beneficiary_id`", insertable=false, updatable=false)
  private ReferenceModel beneficiary;

  /**
  * Description: "The relationship of beneficiary (patient) to the subscriber."
  * Actual type: CodeableConcept
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"relationship\"", length = 16777215)
  private String relationship;

  /**
  * Description: "Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force."
  * Actual type: Period
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"period\"", length = 16777215)
  private String period;

  /**
  * Description: "The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. May provide multiple identifiers such as insurance company identifier or business identifier (BIN number)."
  */
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> payor = new java.util.ArrayList<>();

  /**
  * Description: "A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan."
  */
  @javax.persistence.Basic
  @Column(name="\"grouping_id\"")
  private String grouping_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`grouping_id`", insertable=false, updatable=false)
  private CoverageGroupingModel grouping;

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
  @javax.persistence.OneToMany
  @javax.persistence.JoinColumn(name = "parent_id", referencedColumnName="id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> contract = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  @javax.persistence.Basic
  @Column(name="\"text_id\"")
  private String text_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`text_id`", insertable=false, updatable=false)
  private NarrativeModel text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  * Actual type: Array of ResourceList-> List<ResourceList>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"contained\"", length = 16777215)
  private String contained;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  * Actual type: Array of Extension-> List<Extension>
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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

      this.identifier = Identifier.toJson(o.getIdentifier());
      this.status = o.getStatus();

      this.type = CodeableConcept.toJson(o.getType());
      if (null != o.getPolicyHolder()) {
      	this.policyholder_id = "policyHolder" + this.getId();
        this.policyHolder = new ReferenceModel(o.getPolicyHolder());
        this.policyHolder.setId(this.policyholder_id);
        this.policyHolder.parent_id = this.policyHolder.getId();
      }

      if (null != o.getSubscriber()) {
      	this.subscriber_id = "subscriber" + this.getId();
        this.subscriber = new ReferenceModel(o.getSubscriber());
        this.subscriber.setId(this.subscriber_id);
        this.subscriber.parent_id = this.subscriber.getId();
      }

      this.subscriberId = o.getSubscriberId();

      if (null != o.getBeneficiary()) {
      	this.beneficiary_id = "beneficiary" + this.getId();
        this.beneficiary = new ReferenceModel(o.getBeneficiary());
        this.beneficiary.setId(this.beneficiary_id);
        this.beneficiary.parent_id = this.beneficiary.getId();
      }

      this.relationship = CodeableConcept.toJson(o.getRelationship());
      this.period = Period.toJson(o.getPeriod());
      this.payor = Reference.toModelArray(o.getPayor());

      if (null != o.getGrouping()) {
      	this.grouping_id = "grouping" + this.getId();
        this.grouping = new CoverageGroupingModel(o.getGrouping());
        this.grouping.setId(this.grouping_id);
        this.grouping.parent_id = this.grouping.getId();
      }

      this.dependent = o.getDependent();

      this.sequence = o.getSequence();

      this.order = o.getOrder();

      this.network = o.getNetwork();

      this.contract = Reference.toModelArray(o.getContract());

      if (null != o.getText()) {
      	this.text_id = "text" + this.getId();
        this.text = new NarrativeModel(o.getText());
        this.text.setId(this.text_id);
        this.text.parent_id = this.text.getId();
      }

      this.contained = ResourceList.toJson(o.getContained());
      this.extension = Extension.toJson(o.getExtension());
      this.modifierExtension = Extension.toJson(o.getModifierExtension());
      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( String value) {
    this.identifier = value;
  }
  public String getIdentifier() {
    return this.identifier;
  }
  public void setStatus( String value) {
    this.status = value;
  }
  public String getStatus() {
    return this.status;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setPolicyHolder( ReferenceModel value) {
    this.policyHolder = value;
  }
  public ReferenceModel getPolicyHolder() {
    return this.policyHolder;
  }
  public void setSubscriber( ReferenceModel value) {
    this.subscriber = value;
  }
  public ReferenceModel getSubscriber() {
    return this.subscriber;
  }
  public void setSubscriberId( String value) {
    this.subscriberId = value;
  }
  public String getSubscriberId() {
    return this.subscriberId;
  }
  public void setBeneficiary( ReferenceModel value) {
    this.beneficiary = value;
  }
  public ReferenceModel getBeneficiary() {
    return this.beneficiary;
  }
  public void setRelationship( String value) {
    this.relationship = value;
  }
  public String getRelationship() {
    return this.relationship;
  }
  public void setPeriod( String value) {
    this.period = value;
  }
  public String getPeriod() {
    return this.period;
  }
  public void setPayor( java.util.List<ReferenceModel> value) {
    this.payor = value;
  }
  public java.util.List<ReferenceModel> getPayor() {
    return this.payor;
  }
  public void setGrouping( CoverageGroupingModel value) {
    this.grouping = value;
  }
  public CoverageGroupingModel getGrouping() {
    return this.grouping;
  }
  public void setDependent( String value) {
    this.dependent = value;
  }
  public String getDependent() {
    return this.dependent;
  }
  public void setSequence( String value) {
    this.sequence = value;
  }
  public String getSequence() {
    return this.sequence;
  }
  public void setOrder( Float value) {
    this.order = value;
  }
  public Float getOrder() {
    return this.order;
  }
  public void setNetwork( String value) {
    this.network = value;
  }
  public String getNetwork() {
    return this.network;
  }
  public void setContract( java.util.List<ReferenceModel> value) {
    this.contract = value;
  }
  public java.util.List<ReferenceModel> getContract() {
    return this.contract;
  }
  public void setText( NarrativeModel value) {
    this.text = value;
  }
  public NarrativeModel getText() {
    return this.text;
  }
  public void setContained( String value) {
    this.contained = value;
  }
  public String getContained() {
    return this.contained;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("policyHolder" + "[" + String.valueOf(this.policyHolder) + "]\n"); 
     builder.append("subscriber" + "[" + String.valueOf(this.subscriber) + "]\n"); 
     builder.append("subscriberId" + "[" + String.valueOf(this.subscriberId) + "]\n"); 
     builder.append("beneficiary" + "[" + String.valueOf(this.beneficiary) + "]\n"); 
     builder.append("relationship" + "[" + String.valueOf(this.relationship) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("payor" + "[" + String.valueOf(this.payor) + "]\n"); 
     builder.append("grouping" + "[" + String.valueOf(this.grouping) + "]\n"); 
     builder.append("dependent" + "[" + String.valueOf(this.dependent) + "]\n"); 
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("order" + "[" + String.valueOf(this.order) + "]\n"); 
     builder.append("network" + "[" + String.valueOf(this.network) + "]\n"); 
     builder.append("contract" + "[" + String.valueOf(this.contract) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); ;
    return builder.toString();
  }
}