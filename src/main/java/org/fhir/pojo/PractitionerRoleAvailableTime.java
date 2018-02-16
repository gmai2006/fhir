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
import org.fhir.entity.PractitionerRoleAvailableTimeModel;
import com.google.gson.GsonBuilder;

/**
* "A specific set of Roles/Locations/specialties/services that a practitioner may perform at an organization for a period of time."
*/
public class PractitionerRoleAvailableTime  extends BackboneElement  {
  /**
  * Description: "Indicates which days of the week are available between the start and end Times."
  */
  protected java.util.List<String> daysOfWeek = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for daysOfWeek"
  */
  protected transient java.util.List<Element> _daysOfWeek = new java.util.ArrayList<>();

  /**
  * Description: "Is this always available? (hence times are irrelevant) e.g. 24 hour service."
  */
  protected Boolean allDay;

  /**
  * Description: "Extensions for allDay"
  */
  protected transient Element _allDay;

  /**
  * Description: "The opening time of day. Note: If the AllDay flag is set, then this time is ignored."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  protected String availableStartTime;

  /**
  * Description: "Extensions for availableStartTime"
  */
  protected transient Element _availableStartTime;

  /**
  * Description: "The closing time of day. Note: If the AllDay flag is set, then this time is ignored."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  protected String availableEndTime;

  /**
  * Description: "Extensions for availableEndTime"
  */
  protected transient Element _availableEndTime;

  public PractitionerRoleAvailableTime() {
  }

  public PractitionerRoleAvailableTime(PractitionerRoleAvailableTimeModel o) {
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
  }

  public void setDaysOfWeek( java.util.List<String> value) {
    this.daysOfWeek = value;
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[PractitionerRoleAvailableTime]:" + "\n");
     if(this.daysOfWeek != null) builder.append("daysOfWeek" + "->" + this.daysOfWeek.toString() + "\n"); 
     if(this._daysOfWeek != null) builder.append("_daysOfWeek" + "->" + this._daysOfWeek.toString() + "\n"); 
     if(this.allDay != null) builder.append("allDay" + "->" + this.allDay.toString() + "\n"); 
     if(this._allDay != null) builder.append("_allDay" + "->" + this._allDay.toString() + "\n"); 
     if(this.availableStartTime != null) builder.append("availableStartTime" + "->" + this.availableStartTime.toString() + "\n"); 
     if(this._availableStartTime != null) builder.append("_availableStartTime" + "->" + this._availableStartTime.toString() + "\n"); 
     if(this.availableEndTime != null) builder.append("availableEndTime" + "->" + this.availableEndTime.toString() + "\n"); 
     if(this._availableEndTime != null) builder.append("_availableEndTime" + "->" + this._availableEndTime.toString() + "\n"); ;
    return builder.toString();
  }


}