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
import org.fhir.entity.SupplyRequestModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of a request for a medication, substance or device used in the healthcare setting."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SupplyRequest  extends DomainResource  {
  /**
  * Description: "This is a SupplyRequest resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Unique identifier for this supply request."
  */
  protected Identifier identifier;

  /**
  * Description: "Status of the supply request."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process."
  */
  protected CodeableConcept category;

  /**
  * Description: "Indicates how quickly this SupplyRequest should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String priority;

  /**
  * Description: "Extensions for priority"
  */
  protected transient Element _priority;

  /**
  * Description: "The item being requested."
  */
  protected SupplyRequestOrderedItem orderedItem;

  /**
  * Description: "When the request should be fulfilled."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  protected transient Element _occurrenceDateTime;

  /**
  * Description: "When the request should be fulfilled."
  */
  protected Period occurrencePeriod;

  /**
  * Description: "When the request should be fulfilled."
  */
  protected Timing occurrenceTiming;

  /**
  * Description: "When the request was made."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  protected transient Element _authoredOn;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  protected SupplyRequestRequester requester;

  /**
  * Description: "Who is intended to fulfill the request."
  */
  protected java.util.List<Reference> supplier;

  /**
  * Description: "Why the supply item was requested."
  */
  protected CodeableConcept reasonCodeableConcept;

  /**
  * Description: "Why the supply item was requested."
  */
  protected Reference reasonReference;

  /**
  * Description: "Where the supply is expected to come from."
  */
  protected Reference deliverFrom;

  /**
  * Description: "Where the supply is destined to go."
  */
  protected Reference deliverTo;

  public SupplyRequest() {
  }

  public SupplyRequest(SupplyRequestModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getCategory() && !o.getCategory().isEmpty()) {
      this.category = new CodeableConcept(o.getCategory().get(0));
    }
    if (null != o.getPriority()) {
      this.priority = o.getPriority();
    }
    if (null != o.getOrderedItem() && !o.getOrderedItem().isEmpty()) {
      this.orderedItem = new SupplyRequestOrderedItem(o.getOrderedItem().get(0));
    }
    if (null != o.getOccurrenceDateTime()) {
      this.occurrenceDateTime = o.getOccurrenceDateTime();
    }
    this.occurrencePeriod = PeriodHelper.fromJson(o.getOccurrencePeriod());
    this.occurrenceTiming = TimingHelper.fromJson(o.getOccurrenceTiming());
    if (null != o.getAuthoredOn()) {
      this.authoredOn = o.getAuthoredOn();
    }
    if (null != o.getRequester() && !o.getRequester().isEmpty()) {
      this.requester = new SupplyRequestRequester(o.getRequester().get(0));
    }
    if (null != o.getSupplier() && !o.getSupplier().isEmpty()) {
    	this.supplier = ReferenceHelper.fromArray2Array(o.getSupplier());
    }
    if (null != o.getReasonCodeableConcept() && !o.getReasonCodeableConcept().isEmpty()) {
      this.reasonCodeableConcept = new CodeableConcept(o.getReasonCodeableConcept().get(0));
    }
    if (null != o.getReasonReference() && !o.getReasonReference().isEmpty()) {
      this.reasonReference = new Reference(o.getReasonReference().get(0));
    }
    if (null != o.getDeliverFrom() && !o.getDeliverFrom().isEmpty()) {
      this.deliverFrom = new Reference(o.getDeliverFrom().get(0));
    }
    if (null != o.getDeliverTo() && !o.getDeliverTo().isEmpty()) {
      this.deliverTo = new Reference(o.getDeliverTo().get(0));
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
    this.status = StatusEnum.fromCode(value);
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
  public void setCategory( CodeableConcept value) {
    this.category = value;
  }
  public CodeableConcept getCategory() {
    return this.category;
  }
  public void setPriority( String value) {
    this.priority = value;
  }
  public String getPriority() {
    return this.priority;
  }
  public void set_priority( Element value) {
    this._priority = value;
  }
  public Element get_priority() {
    return this._priority;
  }
  public void setOrderedItem( SupplyRequestOrderedItem value) {
    this.orderedItem = value;
  }
  public SupplyRequestOrderedItem getOrderedItem() {
    return this.orderedItem;
  }
  public void setOccurrenceDateTime( String value) {
    this.occurrenceDateTime = value;
  }
  public String getOccurrenceDateTime() {
    return this.occurrenceDateTime;
  }
  public void set_occurrenceDateTime( Element value) {
    this._occurrenceDateTime = value;
  }
  public Element get_occurrenceDateTime() {
    return this._occurrenceDateTime;
  }
  public void setOccurrencePeriod( Period value) {
    this.occurrencePeriod = value;
  }
  public Period getOccurrencePeriod() {
    return this.occurrencePeriod;
  }
  public void setOccurrenceTiming( Timing value) {
    this.occurrenceTiming = value;
  }
  public Timing getOccurrenceTiming() {
    return this.occurrenceTiming;
  }
  public void setAuthoredOn( String value) {
    this.authoredOn = value;
  }
  public String getAuthoredOn() {
    return this.authoredOn;
  }
  public void set_authoredOn( Element value) {
    this._authoredOn = value;
  }
  public Element get_authoredOn() {
    return this._authoredOn;
  }
  public void setRequester( SupplyRequestRequester value) {
    this.requester = value;
  }
  public SupplyRequestRequester getRequester() {
    return this.requester;
  }
  public void setSupplier( java.util.List<Reference> value) {
    this.supplier = value;
  }
  public java.util.List<Reference> getSupplier() {
    return this.supplier;
  }
  public void setReasonCodeableConcept( CodeableConcept value) {
    this.reasonCodeableConcept = value;
  }
  public CodeableConcept getReasonCodeableConcept() {
    return this.reasonCodeableConcept;
  }
  public void setReasonReference( Reference value) {
    this.reasonReference = value;
  }
  public Reference getReasonReference() {
    return this.reasonReference;
  }
  public void setDeliverFrom( Reference value) {
    this.deliverFrom = value;
  }
  public Reference getDeliverFrom() {
    return this.deliverFrom;
  }
  public void setDeliverTo( Reference value) {
    this.deliverTo = value;
  }
  public Reference getDeliverTo() {
    return this.deliverTo;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SupplyRequest]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.category != null) builder.append("category" + "->" + this.category.toString() + "\n"); 
     if(this.priority != null) builder.append("priority" + "->" + this.priority.toString() + "\n"); 
     if(this._priority != null) builder.append("_priority" + "->" + this._priority.toString() + "\n"); 
     if(this.orderedItem != null) builder.append("orderedItem" + "->" + this.orderedItem.toString() + "\n"); 
     if(this.occurrenceDateTime != null) builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime.toString() + "\n"); 
     if(this._occurrenceDateTime != null) builder.append("_occurrenceDateTime" + "->" + this._occurrenceDateTime.toString() + "\n"); 
     if(this.occurrencePeriod != null) builder.append("occurrencePeriod" + "->" + this.occurrencePeriod.toString() + "\n"); 
     if(this.occurrenceTiming != null) builder.append("occurrenceTiming" + "->" + this.occurrenceTiming.toString() + "\n"); 
     if(this.authoredOn != null) builder.append("authoredOn" + "->" + this.authoredOn.toString() + "\n"); 
     if(this._authoredOn != null) builder.append("_authoredOn" + "->" + this._authoredOn.toString() + "\n"); 
     if(this.requester != null) builder.append("requester" + "->" + this.requester.toString() + "\n"); 
     if(this.supplier != null) builder.append("supplier" + "->" + this.supplier.toString() + "\n"); 
     if(this.reasonCodeableConcept != null) builder.append("reasonCodeableConcept" + "->" + this.reasonCodeableConcept.toString() + "\n"); 
     if(this.reasonReference != null) builder.append("reasonReference" + "->" + this.reasonReference.toString() + "\n"); 
     if(this.deliverFrom != null) builder.append("deliverFrom" + "->" + this.deliverFrom.toString() + "\n"); 
     if(this.deliverTo != null) builder.append("deliverTo" + "->" + this.deliverTo.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ResourceTypeEnum {
  	SupplyRequest,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "SupplyRequest" : { return SupplyRequest.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum StatusEnum {
  	draft,
  	active,
  	suspended,
  	cancelled,
  	completed,
  	enteredinerror,
  	unknown,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "draft" : { return draft.toString(); }
  			case "active" : { return active.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "cancelled" : { return cancelled.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "unknown" : { return unknown.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}