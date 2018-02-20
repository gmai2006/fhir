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
import org.fhir.entity.SupplyDeliveryModel;
import com.google.gson.GsonBuilder;

/**
* "Record of delivery of what is supplied."
*/
public class SupplyDelivery  extends DomainResource  {
  /**
  * Description: "This is a SupplyDelivery resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier assigned by the dispensing facility when the item(s) is dispensed."
  */
  protected Identifier identifier;

  /**
  * Description: "A plan, proposal or order that is fulfilled in whole or in part by this event."
  */
  protected java.util.List<Reference> basedOn = new java.util.ArrayList<>();

  /**
  * Description: "A larger event of which this particular event is a component or step."
  */
  protected java.util.List<Reference> partOf = new java.util.ArrayList<>();

  /**
  * Description: "A code specifying the state of the dispense event."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A link to a resource representing the person whom the delivered item is for."
  */
  protected Reference patient;

  /**
  * Description: "Indicates the type of dispensing event that is performed. Examples include: Trial Fill, Completion of Trial, Partial Fill, Emergency Fill, Samples, etc."
  */
  protected CodeableConcept type;

  /**
  * Description: "The item that is being delivered or has been supplied."
  */
  protected SupplyDeliverySuppliedItem suppliedItem;

  /**
  * Description: "The date or time(s) the activity occurred."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  protected transient Element _occurrenceDateTime;

  /**
  * Description: "The date or time(s) the activity occurred."
  */
  protected Period occurrencePeriod;

  /**
  * Description: "The date or time(s) the activity occurred."
  */
  protected Timing occurrenceTiming;

  /**
  * Description: "The individual responsible for dispensing the medication, supplier or device."
  */
  protected Reference supplier;

  /**
  * Description: "Identification of the facility/location where the Supply was shipped to, as part of the dispense event."
  */
  protected Reference destination;

  /**
  * Description: "Identifies the person who picked up the Supply."
  */
  protected java.util.List<Reference> receiver = new java.util.ArrayList<>();

  public SupplyDelivery() {
  }

  public SupplyDelivery(SupplyDeliveryModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.identifier = IdentifierHelper.fromJson(o.getIdentifier());
    if (null != o.getBasedOn() && !o.getBasedOn().isEmpty()) {
    	this.basedOn = ReferenceHelper.fromArray2Array(o.getBasedOn());
    }
    if (null != o.getPartOf() && !o.getPartOf().isEmpty()) {
    	this.partOf = ReferenceHelper.fromArray2Array(o.getPartOf());
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getPatient() && !o.getPatient().isEmpty()) {
      this.patient = new Reference(o.getPatient().get(0));
    }
    if (null != o.getType() && !o.getType().isEmpty()) {
      this.type = new CodeableConcept(o.getType().get(0));
    }
    if (null != o.getSuppliedItem() && !o.getSuppliedItem().isEmpty()) {
      this.suppliedItem = new SupplyDeliverySuppliedItem(o.getSuppliedItem().get(0));
    }
    if (null != o.getOccurrenceDateTime()) {
      this.occurrenceDateTime = o.getOccurrenceDateTime();
    }
    this.occurrencePeriod = PeriodHelper.fromJson(o.getOccurrencePeriod());
    this.occurrenceTiming = TimingHelper.fromJson(o.getOccurrenceTiming());
    if (null != o.getSupplier() && !o.getSupplier().isEmpty()) {
      this.supplier = new Reference(o.getSupplier().get(0));
    }
    if (null != o.getDestination() && !o.getDestination().isEmpty()) {
      this.destination = new Reference(o.getDestination().get(0));
    }
    if (null != o.getReceiver() && !o.getReceiver().isEmpty()) {
    	this.receiver = ReferenceHelper.fromArray2Array(o.getReceiver());
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
  public void setBasedOn( java.util.List<Reference> value) {
    this.basedOn = value;
  }
  public java.util.List<Reference> getBasedOn() {
    return this.basedOn;
  }
  public void setPartOf( java.util.List<Reference> value) {
    this.partOf = value;
  }
  public java.util.List<Reference> getPartOf() {
    return this.partOf;
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
  public void setPatient( Reference value) {
    this.patient = value;
  }
  public Reference getPatient() {
    return this.patient;
  }
  public void setType( CodeableConcept value) {
    this.type = value;
  }
  public CodeableConcept getType() {
    return this.type;
  }
  public void setSuppliedItem( SupplyDeliverySuppliedItem value) {
    this.suppliedItem = value;
  }
  public SupplyDeliverySuppliedItem getSuppliedItem() {
    return this.suppliedItem;
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
  public void setSupplier( Reference value) {
    this.supplier = value;
  }
  public Reference getSupplier() {
    return this.supplier;
  }
  public void setDestination( Reference value) {
    this.destination = value;
  }
  public Reference getDestination() {
    return this.destination;
  }
  public void setReceiver( java.util.List<Reference> value) {
    this.receiver = value;
  }
  public java.util.List<Reference> getReceiver() {
    return this.receiver;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SupplyDelivery]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.basedOn != null) builder.append("basedOn" + "->" + this.basedOn.toString() + "\n"); 
     if(this.partOf != null) builder.append("partOf" + "->" + this.partOf.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.patient != null) builder.append("patient" + "->" + this.patient.toString() + "\n"); 
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.suppliedItem != null) builder.append("suppliedItem" + "->" + this.suppliedItem.toString() + "\n"); 
     if(this.occurrenceDateTime != null) builder.append("occurrenceDateTime" + "->" + this.occurrenceDateTime.toString() + "\n"); 
     if(this._occurrenceDateTime != null) builder.append("_occurrenceDateTime" + "->" + this._occurrenceDateTime.toString() + "\n"); 
     if(this.occurrencePeriod != null) builder.append("occurrencePeriod" + "->" + this.occurrencePeriod.toString() + "\n"); 
     if(this.occurrenceTiming != null) builder.append("occurrenceTiming" + "->" + this.occurrenceTiming.toString() + "\n"); 
     if(this.supplier != null) builder.append("supplier" + "->" + this.supplier.toString() + "\n"); 
     if(this.destination != null) builder.append("destination" + "->" + this.destination.toString() + "\n"); 
     if(this.receiver != null) builder.append("receiver" + "->" + this.receiver.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	SupplyDelivery,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "SupplyDelivery" : { return SupplyDelivery.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	inprogress,
  	completed,
  	abandoned,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "inprogress" : { return inprogress.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "abandoned" : { return abandoned.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}