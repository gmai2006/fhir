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
import org.fhir.entity.SlotModel;
import com.google.gson.GsonBuilder;

/**
* "A slot of time on a schedule that may be available for booking appointments."
*/
public class Slot  {
  /**
  * Description: "This is a Slot resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "External Ids for this item."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A broad categorisation of the service that is to be performed during this appointment."
  */
  private CodeableConcept serviceCategory;

  /**
  * Description: "The type of appointments that can be booked into this slot (ideally this would be an identifiable service - which is at a location, rather than the location itself). If provided then this overrides the value provided on the availability resource."
  */
  private java.util.List<CodeableConcept> serviceType = new java.util.ArrayList<>();

  /**
  * Description: "The specialty of a practitioner that would be required to perform the service requested in this appointment."
  */
  private java.util.List<CodeableConcept> specialty = new java.util.ArrayList<>();

  /**
  * Description: "The style of appointment or patient that may be booked in the slot (not service type)."
  */
  private CodeableConcept appointmentType;

  /**
  * Description: "The schedule resource that this slot defines an interval of status information."
  */
  @javax.validation.constraints.NotNull
  private Reference schedule;

  /**
  * Description: "busy | free | busy-unavailable | busy-tentative | entered-in-error."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Date/Time that the slot is to begin."
  */
  private String start;

  /**
  * Description: "Extensions for start"
  */
  private transient Element _start;

  /**
  * Description: "Date/Time that the slot is to conclude."
  */
  private String end;

  /**
  * Description: "Extensions for end"
  */
  private transient Element _end;

  /**
  * Description: "This slot has already been overbooked, appointments are unlikely to be accepted for this time."
  */
  private Boolean overbooked;

  /**
  * Description: "Extensions for overbooked"
  */
  private transient Element _overbooked;

  /**
  * Description: "Comments on the slot to describe any extended information. Such as custom constraints on the slot."
  */
  private String comment;

  /**
  * Description: "Extensions for comment"
  */
  private transient Element _comment;

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

  public Slot() {
  }

  public Slot(SlotModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      this.serviceCategory = CodeableConcept.fromJson(o.getServiceCategory());
      this.serviceType = CodeableConcept.fromArray(o.getServiceType());
      this.specialty = CodeableConcept.fromArray(o.getSpecialty());
      this.appointmentType = CodeableConcept.fromJson(o.getAppointmentType());
      if (null != o.getSchedule()) {
        this.schedule = new Reference(o.getSchedule());
        this.schedule.setId(this.getId());
      }

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getStart()) {
        this.start = new String(o.getStart());
      }

      if (null != o.getEnd()) {
        this.end = new String(o.getEnd());
      }

      if (null != o.getOverbooked()) {
        this.overbooked = new Boolean(o.getOverbooked());
      }

      if (null != o.getComment()) {
        this.comment = new String(o.getComment());
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
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
  }
  public void setServiceCategory( CodeableConcept value) {
    this.serviceCategory = value;
  }
  public CodeableConcept getServiceCategory() {
    return this.serviceCategory;
  }
  public void setServiceType( java.util.List<CodeableConcept> value) {
    this.serviceType = value;
  }
  public java.util.List<CodeableConcept> getServiceType() {
    return this.serviceType;
  }
  public void setSpecialty( java.util.List<CodeableConcept> value) {
    this.specialty = value;
  }
  public java.util.List<CodeableConcept> getSpecialty() {
    return this.specialty;
  }
  public void setAppointmentType( CodeableConcept value) {
    this.appointmentType = value;
  }
  public CodeableConcept getAppointmentType() {
    return this.appointmentType;
  }
  public void setSchedule( Reference value) {
    this.schedule = value;
  }
  public Reference getSchedule() {
    return this.schedule;
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
  public void setStart( String value) {
    this.start = value;
  }
  public String getStart() {
    return this.start;
  }
  public void set_start( Element value) {
    this._start = value;
  }
  public Element get_start() {
    return this._start;
  }
  public void setEnd( String value) {
    this.end = value;
  }
  public String getEnd() {
    return this.end;
  }
  public void set_end( Element value) {
    this._end = value;
  }
  public Element get_end() {
    return this._end;
  }
  public void setOverbooked( Boolean value) {
    this.overbooked = value;
  }
  public Boolean getOverbooked() {
    return this.overbooked;
  }
  public void set_overbooked( Element value) {
    this._overbooked = value;
  }
  public Element get_overbooked() {
    return this._overbooked;
  }
  public void setComment( String value) {
    this.comment = value;
  }
  public String getComment() {
    return this.comment;
  }
  public void set_comment( Element value) {
    this._comment = value;
  }
  public Element get_comment() {
    return this._comment;
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
     builder.append("serviceCategory" + "[" + String.valueOf(this.serviceCategory) + "]\n"); 
     builder.append("serviceType" + "[" + String.valueOf(this.serviceType) + "]\n"); 
     builder.append("specialty" + "[" + String.valueOf(this.specialty) + "]\n"); 
     builder.append("appointmentType" + "[" + String.valueOf(this.appointmentType) + "]\n"); 
     builder.append("schedule" + "[" + String.valueOf(this.schedule) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("start" + "[" + String.valueOf(this.start) + "]\n"); 
     builder.append("_start" + "[" + String.valueOf(this._start) + "]\n"); 
     builder.append("end" + "[" + String.valueOf(this.end) + "]\n"); 
     builder.append("_end" + "[" + String.valueOf(this._end) + "]\n"); 
     builder.append("overbooked" + "[" + String.valueOf(this.overbooked) + "]\n"); 
     builder.append("_overbooked" + "[" + String.valueOf(this._overbooked) + "]\n"); 
     builder.append("comment" + "[" + String.valueOf(this.comment) + "]\n"); 
     builder.append("_comment" + "[" + String.valueOf(this._comment) + "]\n"); 
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
  	Slot,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Slot" : { return Slot.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	busy,
  	free,
  	busyunavailable,
  	busytentative,
  	enteredinerror,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "busy" : { return busy.toString(); }
  			case "free" : { return free.toString(); }
  			case "busyunavailable" : { return busyunavailable.toString(); }
  			case "busytentative" : { return busytentative.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Slot> fromArray(java.util.List<SlotModel> list) {
    return (java.util.List<Slot>)list.stream()
      .map(model -> new Slot(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SlotModel> toModelArray(java.util.List<Slot> list) {
    return (java.util.List<SlotModel>)list.stream()
      .map(model -> new SlotModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Slot fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Slot.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Slot o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Slot> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}