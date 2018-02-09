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
public class PractitionerRoleAvailableTime  {
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

  public PractitionerRoleAvailableTime() {
  }

  public PractitionerRoleAvailableTime(PractitionerRoleAvailableTimeModel o) {
    this.id = o.getId();
      this.daysOfWeek = org.fhir.utils.JsonUtils.json2Array(o.getDaysOfWeek());

      if (null != o.getAllDay()) {
        this.allDay = new Boolean(o.getAllDay());
      }

      if (null != o.getAvailableStartTime()) {
        this.availableStartTime = new String(o.getAvailableStartTime());
      }

      if (null != o.getAvailableEndTime()) {
        this.availableEndTime = new String(o.getAvailableEndTime());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("daysOfWeek" + "[" + String.valueOf(this.daysOfWeek) + "]\n"); 
     builder.append("_daysOfWeek" + "[" + String.valueOf(this._daysOfWeek) + "]\n"); 
     builder.append("allDay" + "[" + String.valueOf(this.allDay) + "]\n"); 
     builder.append("_allDay" + "[" + String.valueOf(this._allDay) + "]\n"); 
     builder.append("availableStartTime" + "[" + String.valueOf(this.availableStartTime) + "]\n"); 
     builder.append("_availableStartTime" + "[" + String.valueOf(this._availableStartTime) + "]\n"); 
     builder.append("availableEndTime" + "[" + String.valueOf(this.availableEndTime) + "]\n"); 
     builder.append("_availableEndTime" + "[" + String.valueOf(this._availableEndTime) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<PractitionerRoleAvailableTime> fromArray(java.util.List<PractitionerRoleAvailableTimeModel> list) {
    return (java.util.List<PractitionerRoleAvailableTime>)list.stream()
      .map(model -> new PractitionerRoleAvailableTime(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<PractitionerRoleAvailableTimeModel> toModelArray(java.util.List<PractitionerRoleAvailableTime> list) {
    return (java.util.List<PractitionerRoleAvailableTimeModel>)list.stream()
      .map(model -> new PractitionerRoleAvailableTimeModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static PractitionerRoleAvailableTime fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, PractitionerRoleAvailableTime.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(PractitionerRoleAvailableTime o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<PractitionerRoleAvailableTime> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}