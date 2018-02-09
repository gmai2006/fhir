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
import org.fhir.entity.AppointmentParticipantModel;
import com.google.gson.GsonBuilder;

/**
* "A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s)."
*/
public class AppointmentParticipant  {
  /**
  * Description: "Role of participant in the appointment."
  */
  private java.util.List<CodeableConcept> type = new java.util.ArrayList<>();

  /**
  * Description: "A Person, Location/HealthcareService or Device that is participating in the appointment."
  */
  private Reference actor;

  /**
  * Description: "Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present."
  */
  private String required;

  /**
  * Description: "Extensions for required"
  */
  private transient Element _required;

  /**
  * Description: "Participation status of the actor."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

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

  public AppointmentParticipant() {
  }

  public AppointmentParticipant(AppointmentParticipantModel o) {
    this.id = o.getId();
      this.type = CodeableConcept.fromArray(o.getType());
      if (null != o.getActor()) {
        this.actor = new Reference(o.getActor());
        this.actor.setId(this.getId());
      }

      if (null != o.getRequired()) {
        this.required = new String(o.getRequired());
      }

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( java.util.List<CodeableConcept> value) {
    this.type = value;
  }
  public java.util.List<CodeableConcept> getType() {
    return this.type;
  }
  public void setActor( Reference value) {
    this.actor = value;
  }
  public Reference getActor() {
    return this.actor;
  }
  public void setRequired( String value) {
    this.required = RequiredEnum.fromCode(value);
  }
  public String getRequired() {
    return this.required;
  }
  public void set_required( Element value) {
    this._required = value;
  }
  public Element get_required() {
    return this._required;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("actor" + "[" + String.valueOf(this.actor) + "]\n"); 
     builder.append("required" + "[" + String.valueOf(this.required) + "]\n"); 
     builder.append("_required" + "[" + String.valueOf(this._required) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum RequiredEnum {
  	required,
  	optional,
  	informationonly,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "required" : { return required.toString(); }
  			case "optional" : { return optional.toString(); }
  			case "informationonly" : { return informationonly.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	accepted,
  	declined,
  	tentative,
  	needsaction,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "accepted" : { return accepted.toString(); }
  			case "declined" : { return declined.toString(); }
  			case "tentative" : { return tentative.toString(); }
  			case "needsaction" : { return needsaction.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<AppointmentParticipant> fromArray(java.util.List<AppointmentParticipantModel> list) {
    return (java.util.List<AppointmentParticipant>)list.stream()
      .map(model -> new AppointmentParticipant(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<AppointmentParticipantModel> toModelArray(java.util.List<AppointmentParticipant> list) {
    return (java.util.List<AppointmentParticipantModel>)list.stream()
      .map(model -> new AppointmentParticipantModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static AppointmentParticipant fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, AppointmentParticipant.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(AppointmentParticipant o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<AppointmentParticipant> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}