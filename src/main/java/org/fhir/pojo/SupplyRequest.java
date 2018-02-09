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
import com.google.gson.GsonBuilder;

/**
* "A record of a request for a medication, substance or device used in the healthcare setting."
*/
public class SupplyRequest  {
  /**
  * Description: "This is a SupplyRequest resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Unique identifier for this supply request."
  */
  private Identifier identifier;

  /**
  * Description: "Status of the supply request."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Category of supply, e.g.  central, non-stock, etc. This is used to support work flows associated with the supply process."
  */
  private CodeableConcept category;

  /**
  * Description: "Indicates how quickly this SupplyRequest should be addressed with respect to other requests."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String priority;

  /**
  * Description: "Extensions for priority"
  */
  private transient Element _priority;

  /**
  * Description: "The item being requested."
  */
  private SupplyRequestOrderedItem orderedItem;

  /**
  * Description: "When the request should be fulfilled."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String occurrenceDateTime;

  /**
  * Description: "Extensions for occurrenceDateTime"
  */
  private transient Element _occurrenceDateTime;

  /**
  * Description: "When the request should be fulfilled."
  */
  private Period occurrencePeriod;

  /**
  * Description: "When the request should be fulfilled."
  */
  private Timing occurrenceTiming;

  /**
  * Description: "When the request was made."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String authoredOn;

  /**
  * Description: "Extensions for authoredOn"
  */
  private transient Element _authoredOn;

  /**
  * Description: "The individual who initiated the request and has responsibility for its activation."
  */
  private SupplyRequestRequester requester;

  /**
  * Description: "Who is intended to fulfill the request."
  */
  private java.util.List<Reference> supplier = new java.util.ArrayList<>();

  /**
  * Description: "Why the supply item was requested."
  */
  private CodeableConcept reasonCodeableConcept;

  /**
  * Description: "Why the supply item was requested."
  */
  private Reference reasonReference;

  /**
  * Description: "Where the supply is expected to come from."
  */
  private Reference deliverFrom;

  /**
  * Description: "Where the supply is destined to go."
  */
  private Reference deliverTo;

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

  public SupplyRequest() {
  }

  public SupplyRequest(SupplyRequestModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromJson(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.category = CodeableConcept.fromJson(o.getCategory());
      if (null != o.getPriority()) {
        this.priority = new String(o.getPriority());
      }

      if (null != o.getOrderedItem()) {
        this.orderedItem = new SupplyRequestOrderedItem(o.getOrderedItem());
        this.orderedItem.setId(this.getId());
      }

      if (null != o.getOccurrenceDateTime()) {
        this.occurrenceDateTime = new String(o.getOccurrenceDateTime());
      }

      this.occurrencePeriod = Period.fromJson(o.getOccurrencePeriod());
      this.occurrenceTiming = Timing.fromJson(o.getOccurrenceTiming());
      if (null != o.getAuthoredOn()) {
        this.authoredOn = new String(o.getAuthoredOn());
      }

      if (null != o.getRequester()) {
        this.requester = new SupplyRequestRequester(o.getRequester());
        this.requester.setId(this.getId());
      }

      this.supplier = Reference.fromArray(o.getSupplier());

      this.reasonCodeableConcept = CodeableConcept.fromJson(o.getReasonCodeableConcept());
      if (null != o.getReasonReference()) {
        this.reasonReference = new Reference(o.getReasonReference());
        this.reasonReference.setId(this.getId());
      }

      if (null != o.getDeliverFrom()) {
        this.deliverFrom = new Reference(o.getDeliverFrom());
        this.deliverFrom.setId(this.getId());
      }

      if (null != o.getDeliverTo()) {
        this.deliverTo = new Reference(o.getDeliverTo());
        this.deliverTo.setId(this.getId());
      }

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
     builder.append("category" + "[" + String.valueOf(this.category) + "]\n"); 
     builder.append("priority" + "[" + String.valueOf(this.priority) + "]\n"); 
     builder.append("_priority" + "[" + String.valueOf(this._priority) + "]\n"); 
     builder.append("orderedItem" + "[" + String.valueOf(this.orderedItem) + "]\n"); 
     builder.append("occurrenceDateTime" + "[" + String.valueOf(this.occurrenceDateTime) + "]\n"); 
     builder.append("_occurrenceDateTime" + "[" + String.valueOf(this._occurrenceDateTime) + "]\n"); 
     builder.append("occurrencePeriod" + "[" + String.valueOf(this.occurrencePeriod) + "]\n"); 
     builder.append("occurrenceTiming" + "[" + String.valueOf(this.occurrenceTiming) + "]\n"); 
     builder.append("authoredOn" + "[" + String.valueOf(this.authoredOn) + "]\n"); 
     builder.append("_authoredOn" + "[" + String.valueOf(this._authoredOn) + "]\n"); 
     builder.append("requester" + "[" + String.valueOf(this.requester) + "]\n"); 
     builder.append("supplier" + "[" + String.valueOf(this.supplier) + "]\n"); 
     builder.append("reasonCodeableConcept" + "[" + String.valueOf(this.reasonCodeableConcept) + "]\n"); 
     builder.append("reasonReference" + "[" + String.valueOf(this.reasonReference) + "]\n"); 
     builder.append("deliverFrom" + "[" + String.valueOf(this.deliverFrom) + "]\n"); 
     builder.append("deliverTo" + "[" + String.valueOf(this.deliverTo) + "]\n"); 
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

  public static java.util.List<SupplyRequest> fromArray(java.util.List<SupplyRequestModel> list) {
    return (java.util.List<SupplyRequest>)list.stream()
      .map(model -> new SupplyRequest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SupplyRequestModel> toModelArray(java.util.List<SupplyRequest> list) {
    return (java.util.List<SupplyRequestModel>)list.stream()
      .map(model -> new SupplyRequestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static SupplyRequest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SupplyRequest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(SupplyRequest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<SupplyRequest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}