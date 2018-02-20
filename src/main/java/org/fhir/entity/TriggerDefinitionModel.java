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
* "A description of a triggering event."
*/
@Entity
@Table(name="triggerdefinition")
public class TriggerDefinitionModel  implements Serializable {
	private static final long serialVersionUID = 151910893742489120L;
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
  * Actual type: String;
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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="eventtimingreference_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> eventTimingReference;

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

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="eventdata_id", insertable=false, updatable=false)
  private java.util.List<DataRequirementModel> eventData;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
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

  public TriggerDefinitionModel() {
  }

  public TriggerDefinitionModel(TriggerDefinition o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.type = o.getType();
    this.eventName = o.getEventName();
    if (null != o.getEventTimingTiming()) {
    	this.eventTimingTiming = JsonUtils.toJson(o.getEventTimingTiming());
    }
    if (null != o.getEventTimingReference() ) {
    	this.eventtimingreference_id = "eventtimingreference" + this.parent_id;
    	this.eventTimingReference = ReferenceHelper.toModel(o.getEventTimingReference(), this.eventtimingreference_id);
    }
    this.eventTimingDate = o.getEventTimingDate();
    this.eventTimingDateTime = o.getEventTimingDateTime();
    if (null != o.getEventData() ) {
    	this.eventdata_id = "eventdata" + this.parent_id;
    	this.eventData = DataRequirementHelper.toModel(o.getEventData(), this.eventdata_id);
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getEventName() {
    return this.eventName;
  }
  public void setEventName( String value) {
    this.eventName = value;
  }
  public String getEventTimingTiming() {
    return this.eventTimingTiming;
  }
  public void setEventTimingTiming( String value) {
    this.eventTimingTiming = value;
  }
  public java.util.List<ReferenceModel> getEventTimingReference() {
    return this.eventTimingReference;
  }
  public void setEventTimingReference( java.util.List<ReferenceModel> value) {
    this.eventTimingReference = value;
  }
  public String getEventTimingDate() {
    return this.eventTimingDate;
  }
  public void setEventTimingDate( String value) {
    this.eventTimingDate = value;
  }
  public String getEventTimingDateTime() {
    return this.eventTimingDateTime;
  }
  public void setEventTimingDateTime( String value) {
    this.eventTimingDateTime = value;
  }
  public java.util.List<DataRequirementModel> getEventData() {
    return this.eventData;
  }
  public void setEventData( java.util.List<DataRequirementModel> value) {
    this.eventData = value;
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
    builder.append("[TriggerDefinitionModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("eventName" + "->" + this.eventName + "\n"); 
     builder.append("eventTimingTiming" + "->" + this.eventTimingTiming + "\n"); 
     builder.append("eventTimingDate" + "->" + this.eventTimingDate + "\n"); 
     builder.append("eventTimingDateTime" + "->" + this.eventTimingDateTime + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TriggerDefinitionModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("eventName" + "->" + this.eventName + "\n"); 
     builder.append("eventTimingTiming" + "->" + this.eventTimingTiming + "\n"); 
     builder.append("eventTimingReference" + "->" + this.eventTimingReference + "\n"); 
     builder.append("eventTimingDate" + "->" + this.eventTimingDate + "\n"); 
     builder.append("eventTimingDateTime" + "->" + this.eventTimingDateTime + "\n"); 
     builder.append("eventData" + "->" + this.eventData + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}