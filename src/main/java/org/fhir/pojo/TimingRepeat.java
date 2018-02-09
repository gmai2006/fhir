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
import org.fhir.entity.TimingRepeatModel;
import com.google.gson.GsonBuilder;

/**
* "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out."
*/
public class TimingRepeat  {
  /**
  * Description: "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule."
  */
  private Duration boundsDuration;

  /**
  * Description: "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule."
  */
  private Range boundsRange;

  /**
  * Description: "Either a duration for the length of the timing schedule, a range of possible length, or outer bounds for start and/or end limits of the timing schedule."
  */
  private Period boundsPeriod;

  /**
  * Description: "A total count of the desired number of repetitions."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float count;

  /**
  * Description: "Extensions for count"
  */
  private transient Element _count;

  /**
  * Description: "A maximum value for the count of the desired repetitions (e.g. do something 6-8 times)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float countMax;

  /**
  * Description: "Extensions for countMax"
  */
  private transient Element _countMax;

  /**
  * Description: "How long this thing happens for when it happens."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float duration;

  /**
  * Description: "Extensions for duration"
  */
  private transient Element _duration;

  /**
  * Description: "The upper limit of how long this thing happens for when it happens."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float durationMax;

  /**
  * Description: "Extensions for durationMax"
  */
  private transient Element _durationMax;

  /**
  * Description: "The units of time for the duration, in UCUM units."
  */
  private String durationUnit;

  /**
  * Description: "Extensions for durationUnit"
  */
  private transient Element _durationUnit;

  /**
  * Description: "The number of times to repeat the action within the specified period / period range (i.e. both period and periodMax provided)."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float frequency;

  /**
  * Description: "Extensions for frequency"
  */
  private transient Element _frequency;

  /**
  * Description: "If present, indicates that the frequency is a range - so to repeat between [frequency] and [frequencyMax] times within the period or period range."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float frequencyMax;

  /**
  * Description: "Extensions for frequencyMax"
  */
  private transient Element _frequencyMax;

  /**
  * Description: "Indicates the duration of time over which repetitions are to occur; e.g. to express \"3 times per day\", 3 would be the frequency and \"1 day\" would be the period."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float period;

  /**
  * Description: "Extensions for period"
  */
  private transient Element _period;

  /**
  * Description: "If present, indicates that the period is a range from [period] to [periodMax], allowing expressing concepts such as \"do this once every 3-5 days."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))(\\.[0-9]+)?")
  private Float periodMax;

  /**
  * Description: "Extensions for periodMax"
  */
  private transient Element _periodMax;

  /**
  * Description: "The units of time for the period in UCUM units."
  */
  private String periodUnit;

  /**
  * Description: "Extensions for periodUnit"
  */
  private transient Element _periodUnit;

  /**
  * Description: "If one or more days of week is provided, then the action happens only on the specified day(s)."
  */
  private java.util.List<String> dayOfWeek = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for dayOfWeek"
  */
  private transient java.util.List<Element> _dayOfWeek = new java.util.ArrayList<>();

  /**
  * Description: "Specified time of day for action to take place."
  */
  private java.util.List<String> timeOfDay = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for timeOfDay"
  */
  private transient java.util.List<Element> _timeOfDay = new java.util.ArrayList<>();

  /**
  * Description: "Real world events that the occurrence of the event should be tied to."
  */
  private java.util.List<String> when = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for when"
  */
  private transient java.util.List<Element> _when = new java.util.ArrayList<>();

  /**
  * Description: "The number of minutes from the event. If the event code does not indicate whether the minutes is before or after the event, then the offset is assumed to be after the event."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float offset;

  /**
  * Description: "Extensions for offset"
  */
  private transient Element _offset;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
   derived from BackboneElement
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public TimingRepeat() {
  }

  public TimingRepeat(TimingRepeatModel o) {
    this.id = o.getId();
      this.boundsDuration = Duration.fromJson(o.getBoundsDuration());
      this.boundsRange = Range.fromJson(o.getBoundsRange());
      this.boundsPeriod = Period.fromJson(o.getBoundsPeriod());
      if (null != o.getCount()) {
        this.count = new Float(o.getCount());
      }

      if (null != o.getCountMax()) {
        this.countMax = new Float(o.getCountMax());
      }

      if (null != o.getDuration()) {
        this.duration = new Float(o.getDuration());
      }

      if (null != o.getDurationMax()) {
        this.durationMax = new Float(o.getDurationMax());
      }

      if (null != o.getDurationUnit()) {
        this.durationUnit = new String(o.getDurationUnit());
      }

      if (null != o.getFrequency()) {
        this.frequency = new Float(o.getFrequency());
      }

      if (null != o.getFrequencyMax()) {
        this.frequencyMax = new Float(o.getFrequencyMax());
      }

      if (null != o.getPeriod()) {
        this.period = new Float(o.getPeriod());
      }

      if (null != o.getPeriodMax()) {
        this.periodMax = new Float(o.getPeriodMax());
      }

      if (null != o.getPeriodUnit()) {
        this.periodUnit = new String(o.getPeriodUnit());
      }

      this.dayOfWeek = org.fhir.utils.JsonUtils.json2Array(o.getDayOfWeek());

      this.timeOfDay = org.fhir.utils.JsonUtils.json2Array(o.getTimeOfDay());

      this.when = org.fhir.utils.JsonUtils.json2Array(o.getWhen());

      if (null != o.getOffset()) {
        this.offset = new Float(o.getOffset());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setBoundsDuration( Duration value) {
    this.boundsDuration = value;
  }
  public Duration getBoundsDuration() {
    return this.boundsDuration;
  }
  public void setBoundsRange( Range value) {
    this.boundsRange = value;
  }
  public Range getBoundsRange() {
    return this.boundsRange;
  }
  public void setBoundsPeriod( Period value) {
    this.boundsPeriod = value;
  }
  public Period getBoundsPeriod() {
    return this.boundsPeriod;
  }
  public void setCount( Float value) {
    this.count = value;
  }
  public Float getCount() {
    return this.count;
  }
  public void set_count( Element value) {
    this._count = value;
  }
  public Element get_count() {
    return this._count;
  }
  public void setCountMax( Float value) {
    this.countMax = value;
  }
  public Float getCountMax() {
    return this.countMax;
  }
  public void set_countMax( Element value) {
    this._countMax = value;
  }
  public Element get_countMax() {
    return this._countMax;
  }
  public void setDuration( Float value) {
    this.duration = value;
  }
  public Float getDuration() {
    return this.duration;
  }
  public void set_duration( Element value) {
    this._duration = value;
  }
  public Element get_duration() {
    return this._duration;
  }
  public void setDurationMax( Float value) {
    this.durationMax = value;
  }
  public Float getDurationMax() {
    return this.durationMax;
  }
  public void set_durationMax( Element value) {
    this._durationMax = value;
  }
  public Element get_durationMax() {
    return this._durationMax;
  }
  public void setDurationUnit( String value) {
    this.durationUnit = DurationUnitEnum.fromCode(value);
  }
  public String getDurationUnit() {
    return this.durationUnit;
  }
  public void set_durationUnit( Element value) {
    this._durationUnit = value;
  }
  public Element get_durationUnit() {
    return this._durationUnit;
  }
  public void setFrequency( Float value) {
    this.frequency = value;
  }
  public Float getFrequency() {
    return this.frequency;
  }
  public void set_frequency( Element value) {
    this._frequency = value;
  }
  public Element get_frequency() {
    return this._frequency;
  }
  public void setFrequencyMax( Float value) {
    this.frequencyMax = value;
  }
  public Float getFrequencyMax() {
    return this.frequencyMax;
  }
  public void set_frequencyMax( Element value) {
    this._frequencyMax = value;
  }
  public Element get_frequencyMax() {
    return this._frequencyMax;
  }
  public void setPeriod( Float value) {
    this.period = value;
  }
  public Float getPeriod() {
    return this.period;
  }
  public void set_period( Element value) {
    this._period = value;
  }
  public Element get_period() {
    return this._period;
  }
  public void setPeriodMax( Float value) {
    this.periodMax = value;
  }
  public Float getPeriodMax() {
    return this.periodMax;
  }
  public void set_periodMax( Element value) {
    this._periodMax = value;
  }
  public Element get_periodMax() {
    return this._periodMax;
  }
  public void setPeriodUnit( String value) {
    this.periodUnit = PeriodUnitEnum.fromCode(value);
  }
  public String getPeriodUnit() {
    return this.periodUnit;
  }
  public void set_periodUnit( Element value) {
    this._periodUnit = value;
  }
  public Element get_periodUnit() {
    return this._periodUnit;
  }
  public void setDayOfWeek( java.util.List<String> value) {
    this.dayOfWeek = value;
  }
  public java.util.List<String> getDayOfWeek() {
    return this.dayOfWeek;
  }
  public void set_dayOfWeek( java.util.List<Element> value) {
    this._dayOfWeek = value;
  }
  public java.util.List<Element> get_dayOfWeek() {
    return this._dayOfWeek;
  }
  public void setTimeOfDay( java.util.List<String> value) {
    this.timeOfDay = value;
  }
  public java.util.List<String> getTimeOfDay() {
    return this.timeOfDay;
  }
  public void set_timeOfDay( java.util.List<Element> value) {
    this._timeOfDay = value;
  }
  public java.util.List<Element> get_timeOfDay() {
    return this._timeOfDay;
  }
  public void setWhen( java.util.List<String> value) {
    this.when = WhenEnum.fromCode(value);
  }
  public java.util.List<String> getWhen() {
    return this.when;
  }
  public void set_when( java.util.List<Element> value) {
    this._when = value;
  }
  public java.util.List<Element> get_when() {
    return this._when;
  }
  public void setOffset( Float value) {
    this.offset = value;
  }
  public Float getOffset() {
    return this.offset;
  }
  public void set_offset( Element value) {
    this._offset = value;
  }
  public Element get_offset() {
    return this._offset;
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
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("boundsDuration" + "[" + String.valueOf(this.boundsDuration) + "]\n"); 
     builder.append("boundsRange" + "[" + String.valueOf(this.boundsRange) + "]\n"); 
     builder.append("boundsPeriod" + "[" + String.valueOf(this.boundsPeriod) + "]\n"); 
     builder.append("count" + "[" + String.valueOf(this.count) + "]\n"); 
     builder.append("_count" + "[" + String.valueOf(this._count) + "]\n"); 
     builder.append("countMax" + "[" + String.valueOf(this.countMax) + "]\n"); 
     builder.append("_countMax" + "[" + String.valueOf(this._countMax) + "]\n"); 
     builder.append("duration" + "[" + String.valueOf(this.duration) + "]\n"); 
     builder.append("_duration" + "[" + String.valueOf(this._duration) + "]\n"); 
     builder.append("durationMax" + "[" + String.valueOf(this.durationMax) + "]\n"); 
     builder.append("_durationMax" + "[" + String.valueOf(this._durationMax) + "]\n"); 
     builder.append("durationUnit" + "[" + String.valueOf(this.durationUnit) + "]\n"); 
     builder.append("_durationUnit" + "[" + String.valueOf(this._durationUnit) + "]\n"); 
     builder.append("frequency" + "[" + String.valueOf(this.frequency) + "]\n"); 
     builder.append("_frequency" + "[" + String.valueOf(this._frequency) + "]\n"); 
     builder.append("frequencyMax" + "[" + String.valueOf(this.frequencyMax) + "]\n"); 
     builder.append("_frequencyMax" + "[" + String.valueOf(this._frequencyMax) + "]\n"); 
     builder.append("period" + "[" + String.valueOf(this.period) + "]\n"); 
     builder.append("_period" + "[" + String.valueOf(this._period) + "]\n"); 
     builder.append("periodMax" + "[" + String.valueOf(this.periodMax) + "]\n"); 
     builder.append("_periodMax" + "[" + String.valueOf(this._periodMax) + "]\n"); 
     builder.append("periodUnit" + "[" + String.valueOf(this.periodUnit) + "]\n"); 
     builder.append("_periodUnit" + "[" + String.valueOf(this._periodUnit) + "]\n"); 
     builder.append("dayOfWeek" + "[" + String.valueOf(this.dayOfWeek) + "]\n"); 
     builder.append("_dayOfWeek" + "[" + String.valueOf(this._dayOfWeek) + "]\n"); 
     builder.append("timeOfDay" + "[" + String.valueOf(this.timeOfDay) + "]\n"); 
     builder.append("_timeOfDay" + "[" + String.valueOf(this._timeOfDay) + "]\n"); 
     builder.append("when" + "[" + String.valueOf(this.when) + "]\n"); 
     builder.append("_when" + "[" + String.valueOf(this._when) + "]\n"); 
     builder.append("offset" + "[" + String.valueOf(this.offset) + "]\n"); 
     builder.append("_offset" + "[" + String.valueOf(this._offset) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum DurationUnitEnum {
  	s,
  	min,
  	h,
  	d,
  	wk,
  	mo,
  	a,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "s" : { return s.toString(); }
  			case "min" : { return min.toString(); }
  			case "h" : { return h.toString(); }
  			case "d" : { return d.toString(); }
  			case "wk" : { return wk.toString(); }
  			case "mo" : { return mo.toString(); }
  			case "a" : { return a.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum PeriodUnitEnum {
  	s,
  	min,
  	h,
  	d,
  	wk,
  	mo,
  	a,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "s" : { return s.toString(); }
  			case "min" : { return min.toString(); }
  			case "h" : { return h.toString(); }
  			case "d" : { return d.toString(); }
  			case "wk" : { return wk.toString(); }
  			case "mo" : { return mo.toString(); }
  			case "a" : { return a.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum WhenEnum {
  	MORN,
  	AFT,
  	EVE,
  	NIGHT,
  	PHS,
  	HS,
  	WAKE,
  	C,
  	CM,
  	CD,
  	CV,
  	AC,
  	ACM,
  	ACD,
  	ACV,
  	PC,
  	PCM,
  	PCD,
  	PCV,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "MORN" : { result.add(MORN.toString()); }
  		  			case "AFT" : { result.add(AFT.toString()); }
  		  			case "EVE" : { result.add(EVE.toString()); }
  		  			case "NIGHT" : { result.add(NIGHT.toString()); }
  		  			case "PHS" : { result.add(PHS.toString()); }
  		  			case "HS" : { result.add(HS.toString()); }
  		  			case "WAKE" : { result.add(WAKE.toString()); }
  		  			case "C" : { result.add(C.toString()); }
  		  			case "CM" : { result.add(CM.toString()); }
  		  			case "CD" : { result.add(CD.toString()); }
  		  			case "CV" : { result.add(CV.toString()); }
  		  			case "AC" : { result.add(AC.toString()); }
  		  			case "ACM" : { result.add(ACM.toString()); }
  		  			case "ACD" : { result.add(ACD.toString()); }
  		  			case "ACV" : { result.add(ACV.toString()); }
  		  			case "PC" : { result.add(PC.toString()); }
  		  			case "PCM" : { result.add(PCM.toString()); }
  		  			case "PCD" : { result.add(PCD.toString()); }
  		  			case "PCV" : { result.add(PCV.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }

  public static java.util.List<TimingRepeat> fromArray(java.util.List<TimingRepeatModel> list) {
    return (java.util.List<TimingRepeat>)list.stream()
      .map(model -> new TimingRepeat(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<TimingRepeatModel> toModelArray(java.util.List<TimingRepeat> list) {
    return (java.util.List<TimingRepeatModel>)list.stream()
      .map(model -> new TimingRepeatModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static TimingRepeat fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, TimingRepeat.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(TimingRepeat o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<TimingRepeat> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}