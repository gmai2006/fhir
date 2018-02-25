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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A record of a device being used by a patient where the record is the result of a report from the patient or another clinician."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class DeviceUseStatement  extends DomainResource  {
  /**
  * Description: "This is a DeviceUseStatement resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "An external identifier for this statement such as an IRI."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "A code representing the patient or other source's judgment about the state of the device used that this statement is about.  Generally this will be active or completed."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The patient who used the device."
  */
  @javax.validation.constraints.NotNull
  protected Reference subject;

  /**
  * Description: "The time period over which the device was used."
  */
  protected Period whenUsed;

  /**
  * Description: "How often the device was used."
  */
  protected Timing timingTiming;

  /**
  * Description: "How often the device was used."
  */
  protected Period timingPeriod;

  /**
  * Description: "How often the device was used."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String timingDateTime;

  /**
  * Description: "Extensions for timingDateTime"
  */
  protected transient Element _timingDateTime;

  /**
  * Description: "The time at which the statement was made/recorded."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  protected String recordedOn;

  /**
  * Description: "Extensions for recordedOn"
  */
  protected transient Element _recordedOn;

  /**
  * Description: "Who reported the device was being used by the patient."
  */
  protected Reference source;

  /**
  * Description: "The details of the device used."
  */
  @javax.validation.constraints.NotNull
  protected Reference device;

  /**
  * Description: "Reason or justification for the use of the device."
  */
  protected java.util.List<CodeableConcept> indication;

  /**
  * Description: "Indicates the site on the subject's body where the device was used ( i.e. the target site)."
  */
  protected CodeableConcept bodySite;

  /**
  * Description: "Details about the device statement that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement."
  */
  protected java.util.List<Annotation> note;

  public DeviceUseStatement() {
  }

  public DeviceUseStatement(DeviceUseStatementModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getSubject() && !o.getSubject().isEmpty()) {
      this.subject = new Reference(o.getSubject().get(0));
    }
    this.whenUsed = PeriodHelper.fromJson(o.getWhenUsed());
    this.timingTiming = TimingHelper.fromJson(o.getTimingTiming());
    this.timingPeriod = PeriodHelper.fromJson(o.getTimingPeriod());
    if (null != o.getTimingDateTime()) {
      this.timingDateTime = o.getTimingDateTime();
    }
    if (null != o.getRecordedOn()) {
      this.recordedOn = o.getRecordedOn();
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
      this.source = new Reference(o.getSource().get(0));
    }
    if (null != o.getDevice() && !o.getDevice().isEmpty()) {
      this.device = new Reference(o.getDevice().get(0));
    }
    if (null != o.getIndication() && !o.getIndication().isEmpty()) {
    	this.indication = CodeableConceptHelper.fromArray2Array(o.getIndication());
    }
    if (null != o.getBodySite() && !o.getBodySite().isEmpty()) {
      this.bodySite = new CodeableConcept(o.getBodySite().get(0));
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[DeviceUseStatement]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.subject != null) builder.append("subject" + "->" + this.subject.toString() + "\n"); 
     if(this.whenUsed != null) builder.append("whenUsed" + "->" + this.whenUsed.toString() + "\n"); 
     if(this.timingTiming != null) builder.append("timingTiming" + "->" + this.timingTiming.toString() + "\n"); 
     if(this.timingPeriod != null) builder.append("timingPeriod" + "->" + this.timingPeriod.toString() + "\n"); 
     if(this.timingDateTime != null) builder.append("timingDateTime" + "->" + this.timingDateTime.toString() + "\n"); 
     if(this._timingDateTime != null) builder.append("_timingDateTime" + "->" + this._timingDateTime.toString() + "\n"); 
     if(this.recordedOn != null) builder.append("recordedOn" + "->" + this.recordedOn.toString() + "\n"); 
     if(this._recordedOn != null) builder.append("_recordedOn" + "->" + this._recordedOn.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this.device != null) builder.append("device" + "->" + this.device.toString() + "\n"); 
     if(this.indication != null) builder.append("indication" + "->" + this.indication.toString() + "\n"); 
     if(this.bodySite != null) builder.append("bodySite" + "->" + this.bodySite.toString() + "\n"); 
     if(this.note != null) builder.append("note" + "->" + this.note.toString() + "\n"); ;
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

}