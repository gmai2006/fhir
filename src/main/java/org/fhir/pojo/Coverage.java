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
import org.fhir.entity.CoverageModel;
import com.google.gson.GsonBuilder;

/**
* "Financial instrument which may be used to reimburse or pay for health care products and services."
*/
public class Coverage  {
  /**
  * Description: "This is a Coverage resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatination of the Coverage.SubscriberID and the Coverage.dependant."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

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
  * Description: "The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization."
  */
  private CodeableConcept type;

  /**
  * Description: "The party who 'owns' the insurance policy,  may be an individual, corporation or the subscriber's employer."
  */
  private Reference policyHolder;

  /**
  * Description: "The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due."
  */
  private Reference subscriber;

  /**
  * Description: "The insurer assigned ID for the Subscriber."
  */
  private String subscriberId;

  /**
  * Description: "Extensions for subscriberId"
  */
  private transient Element _subscriberId;

  /**
  * Description: "The party who benefits from the insurance coverage., the patient when services are provided."
  */
  private Reference beneficiary;

  /**
  * Description: "The relationship of beneficiary (patient) to the subscriber."
  */
  private CodeableConcept relationship;

  /**
  * Description: "Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force."
  */
  private Period period;

  /**
  * Description: "The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. May provide multiple identifiers such as insurance company identifier or business identifier (BIN number)."
  */
  private java.util.List<Reference> payor = new java.util.ArrayList<>();

  /**
  * Description: "A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan."
  */
  private CoverageGrouping grouping;

  /**
  * Description: "A unique identifier for a dependent under the coverage."
  */
  private String dependent;

  /**
  * Description: "Extensions for dependent"
  */
  private transient Element _dependent;

  /**
  * Description: "An optional counter for a particular instance of the identified coverage which increments upon each renewal."
  */
  private String sequence;

  /**
  * Description: "Extensions for sequence"
  */
  private transient Element _sequence;

  /**
  * Description: "The order of applicability of this coverage relative to other coverages which are currently inforce. Note, there may be gaps in the numbering and this does not imply primary, secondard etc. as the specific positioning of coverages depends upon the episode of care."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  private Float order;

  /**
  * Description: "Extensions for order"
  */
  private transient Element _order;

  /**
  * Description: "The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply."
  */
  private String network;

  /**
  * Description: "Extensions for network"
  */
  private transient Element _network;

  /**
  * Description: "The policy(s) which constitute this insurance coverage."
  */
  private java.util.List<Reference> contract = new java.util.ArrayList<>();

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

  public Coverage() {
  }

  public Coverage(CoverageModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    this.type = CodeableConceptHelper.fromJson(o.getType());
    if (null != o.getPolicyHolder() && !o.getPolicyHolder().isEmpty()) {
      this.policyHolder = new Reference(o.getPolicyHolder().get(0));
    }
    if (null != o.getSubscriber() && !o.getSubscriber().isEmpty()) {
      this.subscriber = new Reference(o.getSubscriber().get(0));
    }
    if (null != o.getSubscriberId()) {
      this.subscriberId = o.getSubscriberId();
    }
    if (null != o.getBeneficiary() && !o.getBeneficiary().isEmpty()) {
      this.beneficiary = new Reference(o.getBeneficiary().get(0));
    }
    this.relationship = CodeableConceptHelper.fromJson(o.getRelationship());
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getPayor() && !o.getPayor().isEmpty()) {
    	this.payor = ReferenceHelper.fromArray2Array(o.getPayor());
    }
    if (null != o.getGrouping() && !o.getGrouping().isEmpty()) {
      this.grouping = new CoverageGrouping(o.getGrouping().get(0));
    }
    if (null != o.getDependent()) {
      this.dependent = o.getDependent();
    }
    if (null != o.getSequence()) {
      this.sequence = o.getSequence();
    }
    if (null != o.getOrder()) {
      this.order = o.getOrder();
    }
    if (null != o.getNetwork()) {
      this.network = o.getNetwork();
    }
    if (null != o.getContract() && !o.getContract().isEmpty()) {
    	this.contract = ReferenceHelper.fromArray2Array(o.getContract());
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
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
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
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setPolicyHolder( Reference value) {
    this.policyHolder = value;
  }
  public Reference getPolicyHolder() {
    return this.policyHolder;
  }
  public void setSubscriber( Reference value) {
    this.subscriber = value;
  }
  public Reference getSubscriber() {
    return this.subscriber;
  }
  public void setSubscriberId( String value) {
    this.subscriberId = value;
  }
  public String getSubscriberId() {
    return this.subscriberId;
  }
  public void set_subscriberId( Element value) {
    this._subscriberId = value;
  }
  public Element get_subscriberId() {
    return this._subscriberId;
  }
  public void setBeneficiary( Reference value) {
    this.beneficiary = value;
  }
  public Reference getBeneficiary() {
    return this.beneficiary;
  }
  public void setRelationship( CodeableConcept value) {
    this.relationship = value;
  }
  public CodeableConcept getRelationship() {
    return this.relationship;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setPayor( java.util.List<Reference> value) {
    this.payor = value;
  }
  public java.util.List<Reference> getPayor() {
    return this.payor;
  }
  public void setGrouping( CoverageGrouping value) {
    this.grouping = value;
  }
  public CoverageGrouping getGrouping() {
    return this.grouping;
  }
  public void setDependent( String value) {
    this.dependent = value;
  }
  public String getDependent() {
    return this.dependent;
  }
  public void set_dependent( Element value) {
    this._dependent = value;
  }
  public Element get_dependent() {
    return this._dependent;
  }
  public void setSequence( String value) {
    this.sequence = value;
  }
  public String getSequence() {
    return this.sequence;
  }
  public void set_sequence( Element value) {
    this._sequence = value;
  }
  public Element get_sequence() {
    return this._sequence;
  }
  public void setOrder( Float value) {
    this.order = value;
  }
  public Float getOrder() {
    return this.order;
  }
  public void set_order( Element value) {
    this._order = value;
  }
  public Element get_order() {
    return this._order;
  }
  public void setNetwork( String value) {
    this.network = value;
  }
  public String getNetwork() {
    return this.network;
  }
  public void set_network( Element value) {
    this._network = value;
  }
  public Element get_network() {
    return this._network;
  }
  public void setContract( java.util.List<Reference> value) {
    this.contract = value;
  }
  public java.util.List<Reference> getContract() {
    return this.contract;
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
    builder.append("[Coverage]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.policyHolder != null) builder.append("policyHolder" + "->" + this.policyHolder.toString() + "\n"); 
     if(this.subscriber != null) builder.append("subscriber" + "->" + this.subscriber.toString() + "\n"); 
     if(this.subscriberId != null) builder.append("subscriberId" + "->" + this.subscriberId.toString() + "\n"); 
     if(this._subscriberId != null) builder.append("_subscriberId" + "->" + this._subscriberId.toString() + "\n"); 
     if(this.beneficiary != null) builder.append("beneficiary" + "->" + this.beneficiary.toString() + "\n"); 
     if(this.relationship != null) builder.append("relationship" + "->" + this.relationship.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.payor != null) builder.append("payor" + "->" + this.payor.toString() + "\n"); 
     if(this.grouping != null) builder.append("grouping" + "->" + this.grouping.toString() + "\n"); 
     if(this.dependent != null) builder.append("dependent" + "->" + this.dependent.toString() + "\n"); 
     if(this._dependent != null) builder.append("_dependent" + "->" + this._dependent.toString() + "\n"); 
     if(this.sequence != null) builder.append("sequence" + "->" + this.sequence.toString() + "\n"); 
     if(this._sequence != null) builder.append("_sequence" + "->" + this._sequence.toString() + "\n"); 
     if(this.order != null) builder.append("order" + "->" + this.order.toString() + "\n"); 
     if(this._order != null) builder.append("_order" + "->" + this._order.toString() + "\n"); 
     if(this.network != null) builder.append("network" + "->" + this.network.toString() + "\n"); 
     if(this._network != null) builder.append("_network" + "->" + this._network.toString() + "\n"); 
     if(this.contract != null) builder.append("contract" + "->" + this.contract.toString() + "\n"); 
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
  	Coverage,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Coverage" : { return Coverage.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}