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
import org.fhir.entity.DeviceUseStatementModel;
import com.google.gson.GsonBuilder;

/**
* "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician."
*/
public class DeviceUseStatement  {
  /**
  * Description: "This is a DeviceUseStatement resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "An external identifier for this statement such as an IRI."
  */
  private java.util.List<Identifier> identifier = new java.util.ArrayList<>();

  /**
  * Description: "A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The patient who used the device."
  */
  @javax.validation.constraints.NotNull
  private Reference subject;

  /**
  * Description: "The time period over which the device was used."
  */
  private Period whenUsed;

  /**
  * Description: "How often the device was used."
  */
  private Timing timingTiming;

  /**
  * Description: "How often the device was used."
  */
  private Period timingPeriod;

  /**
  * Description: "How often the device was used."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String timingDateTime;

  /**
  * Description: "Extensions for timingDateTime"
  */
  private transient Element _timingDateTime;

  /**
  * Description: "The time at which the statement was made/recorded."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String recordedOn;

  /**
  * Description: "Extensions for recordedOn"
  */
  private transient Element _recordedOn;

  /**
  * Description: "Who reported the device was being used by the patient."
  */
  private Reference source;

  /**
  * Description: "The details of the device used."
  */
  @javax.validation.constraints.NotNull
  private Reference device;

  /**
  * Description: "Reason or justification for the use of the device."
  */
  private java.util.List<CodeableConcept> indication = new java.util.ArrayList<>();

  /**
  * Description: "Indicates the site on the subject's body where the device was used ( i.e. the target site)."
  */
  private CodeableConcept bodySite;

  /**
  * Description: "Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement."
  */
  private java.util.List<Annotation> note = new java.util.ArrayList<>();

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

  public DeviceUseStatement() {
  }

  public DeviceUseStatement(DeviceUseStatementModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      this.identifier = Identifier.fromArray(o.getIdentifier());
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getSubject()) {
        this.subject = new Reference(o.getSubject());
        this.subject.setId(this.getId());
      }

      this.whenUsed = Period.fromJson(o.getWhenUsed());
      this.timingTiming = Timing.fromJson(o.getTimingTiming());
      this.timingPeriod = Period.fromJson(o.getTimingPeriod());
      if (null != o.getTimingDateTime()) {
        this.timingDateTime = new String(o.getTimingDateTime());
      }

      if (null != o.getRecordedOn()) {
        this.recordedOn = new String(o.getRecordedOn());
      }

      if (null != o.getSource()) {
        this.source = new Reference(o.getSource());
        this.source.setId(this.getId());
      }

      if (null != o.getDevice()) {
        this.device = new Reference(o.getDevice());
        this.device.setId(this.getId());
      }

      this.indication = CodeableConcept.fromArray(o.getIndication());
      this.bodySite = CodeableConcept.fromJson(o.getBodySite());
      this.note = Annotation.fromArray(o.getNote());
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
  public void setSubject( Reference value) {
    this.subject = value;
  }
  public Reference getSubject() {
    return this.subject;
  }
  public void setWhenUsed( Period value) {
    this.whenUsed = value;
  }
  public Period getWhenUsed() {
    return this.whenUsed;
  }
  public void setTimingTiming( Timing value) {
    this.timingTiming = value;
  }
  public Timing getTimingTiming() {
    return this.timingTiming;
  }
  public void setTimingPeriod( Period value) {
    this.timingPeriod = value;
  }
  public Period getTimingPeriod() {
    return this.timingPeriod;
  }
  public void setTimingDateTime( String value) {
    this.timingDateTime = value;
  }
  public String getTimingDateTime() {
    return this.timingDateTime;
  }
  public void set_timingDateTime( Element value) {
    this._timingDateTime = value;
  }
  public Element get_timingDateTime() {
    return this._timingDateTime;
  }
  public void setRecordedOn( String value) {
    this.recordedOn = value;
  }
  public String getRecordedOn() {
    return this.recordedOn;
  }
  public void set_recordedOn( Element value) {
    this._recordedOn = value;
  }
  public Element get_recordedOn() {
    return this._recordedOn;
  }
  public void setSource( Reference value) {
    this.source = value;
  }
  public Reference getSource() {
    return this.source;
  }
  public void setDevice( Reference value) {
    this.device = value;
  }
  public Reference getDevice() {
    return this.device;
  }
  public void setIndication( java.util.List<CodeableConcept> value) {
    this.indication = value;
  }
  public java.util.List<CodeableConcept> getIndication() {
    return this.indication;
  }
  public void setBodySite( CodeableConcept value) {
    this.bodySite = value;
  }
  public CodeableConcept getBodySite() {
    return this.bodySite;
  }
  public void setNote( java.util.List<Annotation> value) {
    this.note = value;
  }
  public java.util.List<Annotation> getNote() {
    return this.note;
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
     builder.append("subject" + "[" + String.valueOf(this.subject) + "]\n"); 
     builder.append("whenUsed" + "[" + String.valueOf(this.whenUsed) + "]\n"); 
     builder.append("timingTiming" + "[" + String.valueOf(this.timingTiming) + "]\n"); 
     builder.append("timingPeriod" + "[" + String.valueOf(this.timingPeriod) + "]\n"); 
     builder.append("timingDateTime" + "[" + String.valueOf(this.timingDateTime) + "]\n"); 
     builder.append("_timingDateTime" + "[" + String.valueOf(this._timingDateTime) + "]\n"); 
     builder.append("recordedOn" + "[" + String.valueOf(this.recordedOn) + "]\n"); 
     builder.append("_recordedOn" + "[" + String.valueOf(this._recordedOn) + "]\n"); 
     builder.append("source" + "[" + String.valueOf(this.source) + "]\n"); 
     builder.append("device" + "[" + String.valueOf(this.device) + "]\n"); 
     builder.append("indication" + "[" + String.valueOf(this.indication) + "]\n"); 
     builder.append("bodySite" + "[" + String.valueOf(this.bodySite) + "]\n"); 
     builder.append("note" + "[" + String.valueOf(this.note) + "]\n"); 
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
  	DeviceUseStatement,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "DeviceUseStatement" : { return DeviceUseStatement.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	completed,
  	enteredinerror,
  	intended,
  	stopped,
  	onhold,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "completed" : { return completed.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "intended" : { return intended.toString(); }
  			case "stopped" : { return stopped.toString(); }
  			case "onhold" : { return onhold.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<DeviceUseStatement> fromArray(java.util.List<DeviceUseStatementModel> list) {
    return (java.util.List<DeviceUseStatement>)list.stream()
      .map(model -> new DeviceUseStatement(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<DeviceUseStatementModel> toModelArray(java.util.List<DeviceUseStatement> list) {
    return (java.util.List<DeviceUseStatementModel>)list.stream()
      .map(model -> new DeviceUseStatementModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static DeviceUseStatement fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, DeviceUseStatement.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(DeviceUseStatement o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<DeviceUseStatement> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}