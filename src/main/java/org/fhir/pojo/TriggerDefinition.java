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
import org.fhir.entity.TriggerDefinitionModel;
import com.google.gson.GsonBuilder;

/**
* "A description of a triggering event."
*/
public class TriggerDefinition  {
  /**
  * Description: "The type of triggering event."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "The name of the event (if this is a named-event trigger)."
  */
  private String eventName;

  /**
  * Description: "Extensions for eventName"
  */
  private transient Element _eventName;

  /**
  * Description: "The timing of the event (if this is a period trigger)."
  */
  private Timing eventTimingTiming;

  /**
  * Description: "The timing of the event (if this is a period trigger)."
  */
  private Reference eventTimingReference;

  /**
  * Description: "The timing of the event (if this is a period trigger)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  private String eventTimingDate;

  /**
  * Description: "Extensions for eventTimingDate"
  */
  private transient Element _eventTimingDate;

  /**
  * Description: "The timing of the event (if this is a period trigger)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  private String eventTimingDateTime;

  /**
  * Description: "Extensions for eventTimingDateTime"
  */
  private transient Element _eventTimingDateTime;

  /**
  * Description: "The triggering data of the event (if this is a data trigger)."
  */
  private DataRequirement eventData;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public TriggerDefinition() {
  }

  public TriggerDefinition(TriggerDefinitionModel o) {
    this.id = o.getId();
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getEventName()) {
        this.eventName = new String(o.getEventName());
      }

      this.eventTimingTiming = Timing.fromJson(o.getEventTimingTiming());
      if (null != o.getEventTimingReference()) {
        this.eventTimingReference = new Reference(o.getEventTimingReference());
        this.eventTimingReference.setId(this.getId());
      }

      if (null != o.getEventTimingDate()) {
        this.eventTimingDate = new String(o.getEventTimingDate());
      }

      if (null != o.getEventTimingDateTime()) {
        this.eventTimingDateTime = new String(o.getEventTimingDateTime());
      }

      if (null != o.getEventData()) {
        this.eventData = new DataRequirement(o.getEventData());
        this.eventData.setId(this.getId());
      }

      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setEventName( String value) {
    this.eventName = value;
  }
  public String getEventName() {
    return this.eventName;
  }
  public void set_eventName( Element value) {
    this._eventName = value;
  }
  public Element get_eventName() {
    return this._eventName;
  }
  public void setEventTimingTiming( Timing value) {
    this.eventTimingTiming = value;
  }
  public Timing getEventTimingTiming() {
    return this.eventTimingTiming;
  }
  public void setEventTimingReference( Reference value) {
    this.eventTimingReference = value;
  }
  public Reference getEventTimingReference() {
    return this.eventTimingReference;
  }
  public void setEventTimingDate( String value) {
    this.eventTimingDate = value;
  }
  public String getEventTimingDate() {
    return this.eventTimingDate;
  }
  public void set_eventTimingDate( Element value) {
    this._eventTimingDate = value;
  }
  public Element get_eventTimingDate() {
    return this._eventTimingDate;
  }
  public void setEventTimingDateTime( String value) {
    this.eventTimingDateTime = value;
  }
  public String getEventTimingDateTime() {
    return this.eventTimingDateTime;
  }
  public void set_eventTimingDateTime( Element value) {
    this._eventTimingDateTime = value;
  }
  public Element get_eventTimingDateTime() {
    return this._eventTimingDateTime;
  }
  public void setEventData( DataRequirement value) {
    this.eventData = value;
  }
  public DataRequirement getEventData() {
    return this.eventData;
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
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("eventName" + "[" + String.valueOf(this.eventName) + "]\n"); 
     builder.append("_eventName" + "[" + String.valueOf(this._eventName) + "]\n"); 
     builder.append("eventTimingTiming" + "[" + String.valueOf(this.eventTimingTiming) + "]\n"); 
     builder.append("eventTimingReference" + "[" + String.valueOf(this.eventTimingReference) + "]\n"); 
     builder.append("eventTimingDate" + "[" + String.valueOf(this.eventTimingDate) + "]\n"); 
     builder.append("_eventTimingDate" + "[" + String.valueOf(this._eventTimingDate) + "]\n"); 
     builder.append("eventTimingDateTime" + "[" + String.valueOf(this.eventTimingDateTime) + "]\n"); 
     builder.append("_eventTimingDateTime" + "[" + String.valueOf(this._eventTimingDateTime) + "]\n"); 
     builder.append("eventData" + "[" + String.valueOf(this.eventData) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	namedevent,
  	periodic,
  	dataadded,
  	datamodified,
  	dataremoved,
  	dataaccessed,
  	dataaccessended,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "namedevent" : { return namedevent.toString(); }
  			case "periodic" : { return periodic.toString(); }
  			case "dataadded" : { return dataadded.toString(); }
  			case "datamodified" : { return datamodified.toString(); }
  			case "dataremoved" : { return dataremoved.toString(); }
  			case "dataaccessed" : { return dataaccessed.toString(); }
  			case "dataaccessended" : { return dataaccessended.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<TriggerDefinition> fromArray(java.util.List<TriggerDefinitionModel> list) {
    return (java.util.List<TriggerDefinition>)list.stream()
      .map(model -> new TriggerDefinition(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<TriggerDefinitionModel> toModelArray(java.util.List<TriggerDefinition> list) {
    return (java.util.List<TriggerDefinitionModel>)list.stream()
      .map(model -> new TriggerDefinitionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static TriggerDefinition fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, TriggerDefinition.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(TriggerDefinition o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<TriggerDefinition> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}