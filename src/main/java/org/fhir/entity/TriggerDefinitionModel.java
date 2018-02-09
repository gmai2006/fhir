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

/**
* "A description of a triggering event."
*/
@Entity
@Table(name="triggerdefinition")
public class TriggerDefinitionModel  {
  /**
  * Description: "The type of triggering event."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "The name of the event (if this is a named-event trigger)."
  */
  @javax.persistence.Basic
  @Column(name="\"eventName\"")
  private String eventName;

  /**
  * Description: "The timing of the event (if this is a period trigger)."
  * Actual type: Timing
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"eventTimingTiming\"", length = 16777215)
  private String eventTimingTiming;

  /**
  * Description: "The timing of the event (if this is a period trigger)."
  */
  @javax.persistence.Basic
  @Column(name="\"eventtimingreference_id\"")
  private String eventtimingreference_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`eventtimingreference_id`", insertable=false, updatable=false)
  private ReferenceModel eventTimingReference;

  /**
  * Description: "The timing of the event (if this is a period trigger)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1]))?)?")
  @javax.persistence.Basic
  @Column(name="\"eventTimingDate\"")
  private String eventTimingDate;

  /**
  * Description: "The timing of the event (if this is a period trigger)."
  */
  @javax.validation.constraints.Pattern(regexp="-?[0-9]{4}(-(0[1-9]|1[0-2])(-(0[0-9]|[1-2][0-9]|3[0-1])(T([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?(Z|(\\+|-)((0[0-9]|1[0-3]):[0-5][0-9]|14:00)))?)?)?")
  @javax.persistence.Basic
  @Column(name="\"eventTimingDateTime\"")
  private String eventTimingDateTime;

  /**
  * Description: "The triggering data of the event (if this is a data trigger)."
  */
  @javax.persistence.Basic
  @Column(name="\"eventdata_id\"")
  private String eventdata_id;

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`eventdata_id`", insertable=false, updatable=false)
  private DataRequirementModel eventData;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public TriggerDefinitionModel() {
  }

  public TriggerDefinitionModel(TriggerDefinition o) {
    this.id = o.getId();
      this.type = o.getType();

      this.eventName = o.getEventName();

      this.eventTimingTiming = Timing.toJson(o.getEventTimingTiming());
      if (null != o.getEventTimingReference()) {
      	this.eventtimingreference_id = "eventTimingReference" + this.getId();
        this.eventTimingReference = new ReferenceModel(o.getEventTimingReference());
        this.eventTimingReference.setId(this.eventtimingreference_id);
        this.eventTimingReference.parent_id = this.eventTimingReference.getId();
      }

      this.eventTimingDate = o.getEventTimingDate();

      this.eventTimingDateTime = o.getEventTimingDateTime();

      if (null != o.getEventData()) {
      	this.eventdata_id = "eventData" + this.getId();
        this.eventData = new DataRequirementModel(o.getEventData());
        this.eventData.setId(this.eventdata_id);
        this.eventData.parent_id = this.eventData.getId();
      }

      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setEventName( String value) {
    this.eventName = value;
  }
  public String getEventName() {
    return this.eventName;
  }
  public void setEventTimingTiming( String value) {
    this.eventTimingTiming = value;
  }
  public String getEventTimingTiming() {
    return this.eventTimingTiming;
  }
  public void setEventTimingReference( ReferenceModel value) {
    this.eventTimingReference = value;
  }
  public ReferenceModel getEventTimingReference() {
    return this.eventTimingReference;
  }
  public void setEventTimingDate( String value) {
    this.eventTimingDate = value;
  }
  public String getEventTimingDate() {
    return this.eventTimingDate;
  }
  public void setEventTimingDateTime( String value) {
    this.eventTimingDateTime = value;
  }
  public String getEventTimingDateTime() {
    return this.eventTimingDateTime;
  }
  public void setEventData( DataRequirementModel value) {
    this.eventData = value;
  }
  public DataRequirementModel getEventData() {
    return this.eventData;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("eventName" + "[" + String.valueOf(this.eventName) + "]\n"); 
     builder.append("eventTimingTiming" + "[" + String.valueOf(this.eventTimingTiming) + "]\n"); 
     builder.append("eventTimingReference" + "[" + String.valueOf(this.eventTimingReference) + "]\n"); 
     builder.append("eventTimingDate" + "[" + String.valueOf(this.eventTimingDate) + "]\n"); 
     builder.append("eventTimingDateTime" + "[" + String.valueOf(this.eventTimingDateTime) + "]\n"); 
     builder.append("eventData" + "[" + String.valueOf(this.eventData) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}