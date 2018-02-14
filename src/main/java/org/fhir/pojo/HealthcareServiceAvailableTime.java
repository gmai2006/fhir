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
import org.fhir.entity.HealthcareServiceAvailableTimeModel;
import com.google.gson.GsonBuilder;

/**
* "The details of a healthcare service available at a location."
*/
public class HealthcareServiceAvailableTime  {
  /**
  * Description: "Indicates which days of the week are available between the start and end Times."
  */
  private java.util.List<String> daysOfWeek = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for daysOfWeek"
  */
  private transient java.util.List<Element> _daysOfWeek = new java.util.ArrayList<>();

  /**
  * Description: "Is this always available? (hence times are irrelevant) e.g. 24 hour service."
  */
  private Boolean allDay;

  /**
  * Description: "Extensions for allDay"
  */
  private transient Element _allDay;

  /**
  * Description: "The opening time of day. Note: If the AllDay flag is set, then this time is ignored."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String availableStartTime;

  /**
  * Description: "Extensions for availableStartTime"
  */
  private transient Element _availableStartTime;

  /**
  * Description: "The closing time of day. Note: If the AllDay flag is set, then this time is ignored."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  private String availableEndTime;

  /**
  * Description: "Extensions for availableEndTime"
  */
  private transient Element _availableEndTime;

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
  @javax.validation.constraints.NotNull
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

  public HealthcareServiceAvailableTime() {
  }

  public HealthcareServiceAvailableTime(HealthcareServiceAvailableTimeModel o) {
    this.id = o.getId();
    if (o.getDaysOfWeek() != null) {
    	this.daysOfWeek = org.fhir.utils.JsonUtils.json2Array(o.getDaysOfWeek());
    }
    if (null != o.getAllDay()) {
      this.allDay = o.getAllDay();
    }
    if (null != o.getAvailableStartTime()) {
      this.availableStartTime = o.getAvailableStartTime();
    }
    if (null != o.getAvailableEndTime()) {
      this.availableEndTime = o.getAvailableEndTime();
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setDaysOfWeek( java.util.List<String> value) {
    this.daysOfWeek = DaysOfWeekEnum.fromCode(value);
  }
  public java.util.List<String> getDaysOfWeek() {
    return this.daysOfWeek;
  }
  public void set_daysOfWeek( java.util.List<Element> value) {
    this._daysOfWeek = value;
  }
  public java.util.List<Element> get_daysOfWeek() {
    return this._daysOfWeek;
  }
  public void setAllDay( Boolean value) {
    this.allDay = value;
  }
  public Boolean getAllDay() {
    return this.allDay;
  }
  public void set_allDay( Element value) {
    this._allDay = value;
  }
  public Element get_allDay() {
    return this._allDay;
  }
  public void setAvailableStartTime( String value) {
    this.availableStartTime = value;
  }
  public String getAvailableStartTime() {
    return this.availableStartTime;
  }
  public void set_availableStartTime( Element value) {
    this._availableStartTime = value;
  }
  public Element get_availableStartTime() {
    return this._availableStartTime;
  }
  public void setAvailableEndTime( String value) {
    this.availableEndTime = value;
  }
  public String getAvailableEndTime() {
    return this.availableEndTime;
  }
  public void set_availableEndTime( Element value) {
    this._availableEndTime = value;
  }
  public Element get_availableEndTime() {
    return this._availableEndTime;
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
    builder.append("[HealthcareServiceAvailableTime]:" + "\n");
     if(this.daysOfWeek != null) builder.append("daysOfWeek" + "->" + this.daysOfWeek.toString() + "\n"); 
     if(this._daysOfWeek != null) builder.append("_daysOfWeek" + "->" + this._daysOfWeek.toString() + "\n"); 
     if(this.allDay != null) builder.append("allDay" + "->" + this.allDay.toString() + "\n"); 
     if(this._allDay != null) builder.append("_allDay" + "->" + this._allDay.toString() + "\n"); 
     if(this.availableStartTime != null) builder.append("availableStartTime" + "->" + this.availableStartTime.toString() + "\n"); 
     if(this._availableStartTime != null) builder.append("_availableStartTime" + "->" + this._availableStartTime.toString() + "\n"); 
     if(this.availableEndTime != null) builder.append("availableEndTime" + "->" + this.availableEndTime.toString() + "\n"); 
     if(this._availableEndTime != null) builder.append("_availableEndTime" + "->" + this._availableEndTime.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }

  public enum DaysOfWeekEnum {
  	mon,
  	tue,
  	wed,
  	thu,
  	fri,
  	sat,
  	sun,
  	UNKNOWN;
  	public static java.util.List<String> fromCode(java.util.List<String> strVal) {
  	  		java.util.List<String> result = new java.util.ArrayList<>();
  	  		for (String s : strVal) {
  	  			switch (s) {
  		  			case "mon" : { result.add(mon.toString()); }
  		  			case "tue" : { result.add(tue.toString()); }
  		  			case "wed" : { result.add(wed.toString()); }
  		  			case "thu" : { result.add(thu.toString()); }
  		  			case "fri" : { result.add(fri.toString()); }
  		  			case "sat" : { result.add(sat.toString()); }
  		  			case "sun" : { result.add(sun.toString()); }
  		  			default:
  		  				result.add(UNKNOWN.toString());
  	  			}
  	  		}
  	  		return result;
  	  	}
  }

}