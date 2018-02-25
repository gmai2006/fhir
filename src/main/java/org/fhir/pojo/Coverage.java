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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "Financial instrument which may be used to reimburse or pay for health care products and services."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Coverage  extends DomainResource  {
  /**
  * Description: "This is a Coverage resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Certificate number, Personal Health Number or Case ID. May be constructed as the concatination of the Coverage.SubscriberID and the Coverage.dependant."
  */
  protected java.util.List<Identifier> identifier;

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
  * Description: "The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health or payment by an individual or organization."
  */
  protected CodeableConcept type;

  /**
  * Description: "The party who 'owns' the insurance policy,  may be an individual, corporation or the subscriber's employer."
  */
  protected Reference policyHolder;

  /**
  * Description: "The party who has signed-up for or 'owns' the contractual relationship to the policy or to whom the benefit of the policy for services rendered to them or their family is due."
  */
  protected Reference subscriber;

  /**
  * Description: "The insurer assigned ID for the Subscriber."
  */
  protected String subscriberId;

  /**
  * Description: "Extensions for subscriberId"
  */
  protected transient Element _subscriberId;

  /**
  * Description: "The party who benefits from the insurance coverage., the patient when services are provided."
  */
  protected Reference beneficiary;

  /**
  * Description: "The relationship of beneficiary (patient) to the subscriber."
  */
  protected CodeableConcept relationship;

  /**
  * Description: "Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force."
  */
  protected Period period;

  /**
  * Description: "The program or plan underwriter or payor including both insurance and non-insurance agreements, such as patient-pay agreements. May provide multiple identifiers such as insurance company identifier or business identifier (BIN number)."
  */
  protected java.util.List<Reference> payor;

  /**
  * Description: "A suite of underwrite specific classifiers, for example may be used to identify a class of coverage or employer group, Policy, Plan."
  */
  protected CoverageGrouping grouping;

  /**
  * Description: "A unique identifier for a dependent under the coverage."
  */
  protected String dependent;

  /**
  * Description: "Extensions for dependent"
  */
  protected transient Element _dependent;

  /**
  * Description: "An optional counter for a particular instance of the identified coverage which increments upon each renewal."
  */
  protected String sequence;

  /**
  * Description: "Extensions for sequence"
  */
  protected transient Element _sequence;

  /**
  * Description: "The order of applicability of this coverage relative to other coverages which are currently inforce. Note, there may be gaps in the numbering and this does not imply primary, secondard etc. as the specific positioning of coverages depends upon the episode of care."
  */
  @javax.validation.constraints.Pattern(regexp="[1-9][0-9]*")
  protected Float order;

  /**
  * Description: "Extensions for order"
  */
  protected transient Element _order;

  /**
  * Description: "The insurer-specific identifier for the insurer-defined network of providers to which the beneficiary may seek treatment which will be covered at the 'in-network' rate, otherwise 'out of network' terms and conditions apply."
  */
  protected String network;

  /**
  * Description: "Extensions for network"
  */
  protected transient Element _network;

  /**
  * Description: "The policy(s) which constitute this insurance coverage."
  */
  protected java.util.List<Reference> contract;

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
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
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
    if (null != o.getRelationship() && !o.getRelationship().isEmpty()) {
      this.relationship = new CodeableConcept(o.getRelationship().get(0));
    }
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
     if(this.contract != null) builder.append("contract" + "->" + this.contract.toString() + "\n"); ;
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