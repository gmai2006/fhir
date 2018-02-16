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
import com.google.gson.GsonBuilder;

/**
* "Specifies an event that may occur multiple times. Timing schedules are used to record when things are planned, expected or requested to occur. The most common usage is in dosage instructions for medications. They are also used when planning care of various kinds, and may be used for reporting the schedule to which past regular activities were carried out."
*/
public class Timing  extends Element  {
  /**
  * Description: "Identifies specific times when the event occurs."
  */
  protected java.util.List<String> event = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for event"
  */
  protected transient java.util.List<Element> _event = new java.util.ArrayList<>();

  /**
  * Description: "A set of rules that describe when the event is scheduled."
  */
  protected TimingRepeat repeat;

  /**
  * Description: "A code for the timing schedule. Some codes such as BID are ubiquitous, but many institutions define their own additional codes. If a code is provided, the code is understood to be a complete statement of whatever is specified in the structured timing data, and either the code or the data may be used to interpret the Timing, with the exception that .repeat.bounds still applies over the code (and is not contained in the code)."
  */
  protected CodeableConcept code;

  public Timing() {}

  public void setEvent( java.util.List<String> value) {
    this.event = value;
  }
  public java.util.List<String> getEvent() {
    return this.event;
  }
  public void set_event( java.util.List<Element> value) {
    this._event = value;
  }
  public java.util.List<Element> get_event() {
    return this._event;
  }
  public void setRepeat( TimingRepeat value) {
    this.repeat = value;
  }
  public TimingRepeat getRepeat() {
    return this.repeat;
  }
  public void setCode( CodeableConcept value) {
    this.code = value;
  }
  public CodeableConcept getCode() {
    return this.code;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Timing]:" + "\n");
     if(this.event != null) builder.append("event" + "->" + this.event.toString() + "\n"); 
     if(this._event != null) builder.append("_event" + "->" + this._event.toString() + "\n"); 
     if(this.repeat != null) builder.append("repeat" + "->" + this.repeat.toString() + "\n"); 
     if(this.code != null) builder.append("code" + "->" + this.code.toString() + "\n"); ;
    return builder.toString();
  }

}