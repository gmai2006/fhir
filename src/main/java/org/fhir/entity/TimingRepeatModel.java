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
import java.io.Serializable;
import org.fhir.utils.JsonUtils;
/**
* "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out."
*/
@Entity
@Table(name="timingrepeat")
public class TimingRepeatModel  implements Serializable {
	private static final long serialVersionUID = 151873631194110946L;
  /**
  * Description: "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"boundsDuration\"", length = 16777215)
  private String boundsDuration;

  /**
  * Description: "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"boundsRange\"", length = 16777215)
  private String boundsRange;

  /**
  * Description: "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"boundsPeriod\"", length = 16777215)
  private String boundsPeriod;

  /**
  * Description: "A total count of the desired number of repetitions."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"count\"")
  private Float count;

  /**
  * Description: "A maximum value for the count of the desired repetitions (e.g. do something 6-8 times)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"countMax\"")
  private Float countMax;

  /**
  * Description: "How long this thing happens for when it happens."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"duration\"")
  private Float duration;

  /**
  * Description: "The upper limit of how long this thing happens for when it happens."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"durationMax\"")
  private Float durationMax;

  /**
  * Description: "The units of time for the duration, in UCUM units."
  */
  @javax.persistence.Basic
  @Column(name="\"durationUnit\"")
  private String durationUnit;

  /**
  * Description: "The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"frequency\"")
  private Float frequency;

  /**
  * Description: "If present, indicates that the frequency is a range - so to repeat between [frequency] and [frequencyMax] times within the period or period range."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  @javax.persistence.Basic
  @Column(name="\"frequencyMax\"")
  private Float frequencyMax;

  /**
  * Description: "Indicates the duration of time over which repetitions are to occur; e.g. to express \"3 times per day\", 3 would be the frequency and \"1 day\" would be the period."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"period\"")
  private Float period;

  /**
  * Description: "If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \"do this once every 3-5 days."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"periodMax\"")
  private Float periodMax;

  /**
  * Description: "The units of time for the period in UCUM units."
  */
  @javax.persistence.Basic
  @Column(name="\"periodUnit\"")
  private String periodUnit;

  /**
  * Description: "If one or more days of week is provided, then the action happens only on the specified day(s)."
  */
  @javax.persistence.Basic
  @Column(name="\"dayOfWeek\"")
  private String dayOfWeek;

  /**
  * Description: "Specified time of day for action to take place."
  */
  @javax.persistence.Basic
  @Column(name="\"timeOfDay\"")
  private String timeOfDay;

  /**
  * Description: "Real world events that the occurrence of the event should be tied to."
  */
  @javax.persistence.Basic
  @Column(name="\"when\"")
  private String when;

  /**
  * Description: "The number of minutes from the event. If the event code does not indicate whether the minutes is before or after the event, then the offset is assumed to be after the event."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"offset\"")
  private Float offset;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public TimingRepeatModel() {
  }

  public TimingRepeatModel(TimingRepeat o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.boundsDuration = JsonUtils.toJson(o.getBoundsDuration());
    this.boundsRange = JsonUtils.toJson(o.getBoundsRange());
    this.boundsPeriod = JsonUtils.toJson(o.getBoundsPeriod());
    this.count = o.getCount();
    this.countMax = o.getCountMax();
    this.duration = o.getDuration();
    this.durationMax = o.getDurationMax();
    this.durationUnit = o.getDurationUnit();
    this.frequency = o.getFrequency();
    this.frequencyMax = o.getFrequencyMax();
    this.period = o.getPeriod();
    this.periodMax = o.getPeriodMax();
    this.periodUnit = o.getPeriodUnit();
    this.dayOfWeek = org.fhir.utils.JsonUtils.write2String(o.getDayOfWeek());
    this.timeOfDay = org.fhir.utils.JsonUtils.write2String(o.getTimeOfDay());
    this.when = org.fhir.utils.JsonUtils.write2String(o.getWhen());
    this.offset = o.getOffset();
  }

  public String getBoundsDuration() {
    return this.boundsDuration;
  }
  public void setBoundsDuration( String value) {
    this.boundsDuration = value;
  }
  public String getBoundsRange() {
    return this.boundsRange;
  }
  public void setBoundsRange( String value) {
    this.boundsRange = value;
  }
  public String getBoundsPeriod() {
    return this.boundsPeriod;
  }
  public void setBoundsPeriod( String value) {
    this.boundsPeriod = value;
  }
  public Float getCount() {
    return this.count;
  }
  public void setCount( Float value) {
    this.count = value;
  }
  public Float getCountMax() {
    return this.countMax;
  }
  public void setCountMax( Float value) {
    this.countMax = value;
  }
  public Float getDuration() {
    return this.duration;
  }
  public void setDuration( Float value) {
    this.duration = value;
  }
  public Float getDurationMax() {
    return this.durationMax;
  }
  public void setDurationMax( Float value) {
    this.durationMax = value;
  }
  public String getDurationUnit() {
    return this.durationUnit;
  }
  public void setDurationUnit( String value) {
    this.durationUnit = value;
  }
  public Float getFrequency() {
    return this.frequency;
  }
  public void setFrequency( Float value) {
    this.frequency = value;
  }
  public Float getFrequencyMax() {
    return this.frequencyMax;
  }
  public void setFrequencyMax( Float value) {
    this.frequencyMax = value;
  }
  public Float getPeriod() {
    return this.period;
  }
  public void setPeriod( Float value) {
    this.period = value;
  }
  public Float getPeriodMax() {
    return this.periodMax;
  }
  public void setPeriodMax( Float value) {
    this.periodMax = value;
  }
  public String getPeriodUnit() {
    return this.periodUnit;
  }
  public void setPeriodUnit( String value) {
    this.periodUnit = value;
  }
  public String getDayOfWeek() {
    return this.dayOfWeek;
  }
  public void setDayOfWeek( String value) {
    this.dayOfWeek = value;
  }
  public String getTimeOfDay() {
    return this.timeOfDay;
  }
  public void setTimeOfDay( String value) {
    this.timeOfDay = value;
  }
  public String getWhen() {
    return this.when;
  }
  public void setWhen( String value) {
    this.when = value;
  }
  public Float getOffset() {
    return this.offset;
  }
  public void setOffset( Float value) {
    this.offset = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TimingRepeatModel]:" + "\n");
     builder.append("boundsDuration" + "->" + this.boundsDuration + "\n"); 
     builder.append("boundsRange" + "->" + this.boundsRange + "\n"); 
     builder.append("boundsPeriod" + "->" + this.boundsPeriod + "\n"); 
     builder.append("count" + "->" + this.count + "\n"); 
     builder.append("countMax" + "->" + this.countMax + "\n"); 
     builder.append("duration" + "->" + this.duration + "\n"); 
     builder.append("durationMax" + "->" + this.durationMax + "\n"); 
     builder.append("durationUnit" + "->" + this.durationUnit + "\n"); 
     builder.append("frequency" + "->" + this.frequency + "\n"); 
     builder.append("frequencyMax" + "->" + this.frequencyMax + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("periodMax" + "->" + this.periodMax + "\n"); 
     builder.append("periodUnit" + "->" + this.periodUnit + "\n"); 
     builder.append("dayOfWeek" + "->" + this.dayOfWeek + "\n"); 
     builder.append("timeOfDay" + "->" + this.timeOfDay + "\n"); 
     builder.append("when" + "->" + this.when + "\n"); 
     builder.append("offset" + "->" + this.offset + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TimingRepeatModel]:" + "\n");
     builder.append("boundsDuration" + "->" + this.boundsDuration + "\n"); 
     builder.append("boundsRange" + "->" + this.boundsRange + "\n"); 
     builder.append("boundsPeriod" + "->" + this.boundsPeriod + "\n"); 
     builder.append("count" + "->" + this.count + "\n"); 
     builder.append("countMax" + "->" + this.countMax + "\n"); 
     builder.append("duration" + "->" + this.duration + "\n"); 
     builder.append("durationMax" + "->" + this.durationMax + "\n"); 
     builder.append("durationUnit" + "->" + this.durationUnit + "\n"); 
     builder.append("frequency" + "->" + this.frequency + "\n"); 
     builder.append("frequencyMax" + "->" + this.frequencyMax + "\n"); 
     builder.append("period" + "->" + this.period + "\n"); 
     builder.append("periodMax" + "->" + this.periodMax + "\n"); 
     builder.append("periodUnit" + "->" + this.periodUnit + "\n"); 
     builder.append("dayOfWeek" + "->" + this.dayOfWeek + "\n"); 
     builder.append("timeOfDay" + "->" + this.timeOfDay + "\n"); 
     builder.append("when" + "->" + this.when + "\n"); 
     builder.append("offset" + "->" + this.offset + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}