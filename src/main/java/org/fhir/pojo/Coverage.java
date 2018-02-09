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
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.type = CodeableConcept.fromJson(o.getType());
      if (null != o.getPolicyHolder()) {
        this.policyHolder = new Reference(o.getPolicyHolder());
        this.policyHolder.setId(this.getId());
      }

      if (null != o.getSubscriber()) {
        this.subscriber = new Reference(o.getSubscriber());
        this.subscriber.setId(this.getId());
      }

      if (null != o.getSubscriberId()) {
        this.subscriberId = new String(o.getSubscriberId());
      }

      if (null != o.getBeneficiary()) {
        this.beneficiary = new Reference(o.getBeneficiary());
        this.beneficiary.setId(this.getId());
      }

      this.relationship = CodeableConcept.fromJson(o.getRelationship());
      this.period = Period.fromJson(o.getPeriod());
      this.payor = Reference.fromArray(o.getPayor());

      if (null != o.getGrouping()) {
        this.grouping = new CoverageGrouping(o.getGrouping());
        this.grouping.setId(this.getId());
      }

      if (null != o.getDependent()) {
        this.dependent = new String(o.getDependent());
      }

      if (null != o.getSequence()) {
        this.sequence = new String(o.getSequence());
      }

      if (null != o.getOrder()) {
        this.order = new Float(o.getOrder());
      }

      if (null != o.getNetwork()) {
        this.network = new String(o.getNetwork());
      }

      this.contract = Reference.fromArray(o.getContract());

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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("identifier" + "[" + String.valueOf(this.identifier) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("policyHolder" + "[" + String.valueOf(this.policyHolder) + "]\n"); 
     builder.append("subscriber" + "[" + String.valueOf(this.subscriber) + "]\n"); 
     builder.append("subscriberId" + "[" + String.valueOf(this.subscriberId) + "]\n"); 
     builder.append("_subscriberId" + "[" + String.valueOf(this._subscriberId) + "]\n"); 
     builder.append("beneficiary" + "[" + String.valueOf(this.beneficiary) + "]\n"); 
     builder.append("relationship" + "[" + String.valueOf(this.relationship) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("payor" + "[" + String.valueOf(this.payor) + "]\n"); 
     builder.append("grouping" + "[" + String.valueOf(this.grouping) + "]\n"); 
     builder.append("dependent" + "[" + String.valueOf(this.dependent) + "]\n"); 
     builder.append("_dependent" + "[" + String.valueOf(this._dependent) + "]\n"); 
     builder.append("sequence" + "[" + String.valueOf(this.sequence) + "]\n"); 
     builder.append("_sequence" + "[" + String.valueOf(this._sequence) + "]\n"); 
     builder.append("order" + "[" + String.valueOf(this.order) + "]\n"); 
     builder.append("_order" + "[" + String.valueOf(this._order) + "]\n"); 
     builder.append("network" + "[" + String.valueOf(this.network) + "]\n"); 
     builder.append("_network" + "[" + String.valueOf(this._network) + "]\n"); 
     builder.append("contract" + "[" + String.valueOf(this.contract) + "]\n"); 
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

  public static java.util.List<Coverage> fromArray(java.util.List<CoverageModel> list) {
    return (java.util.List<Coverage>)list.stream()
      .map(model -> new Coverage(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<CoverageModel> toModelArray(java.util.List<Coverage> list) {
    return (java.util.List<CoverageModel>)list.stream()
      .map(model -> new CoverageModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Coverage fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Coverage.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Coverage o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Coverage> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}