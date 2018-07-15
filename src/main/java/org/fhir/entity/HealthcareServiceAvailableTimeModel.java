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
* "The details of a healthcare service available at a location."
* generated on 07/14/2018
*/
@Entity
@Table(name="healthcareserviceavailabletime")
public class HealthcareServiceAvailableTimeModel  implements Serializable {
	private static final long serialVersionUID = 153159210221033312L;
  /**
  * Description: "Indicates which days of the week are available between the start and end Times."
  */
  @javax.persistence.Basic
  @Column(name="\"daysOfWeek\"")
  private String daysOfWeek;

  /**
  * Description: "Is this always available? (hence times are irrelevant) e.g. 24 hour service."
  */
  @javax.persistence.Basic
  @Column(name="\"allDay\"")
  private Boolean allDay;

  /**
  * Description: "The opening time of day. Note: If the AllDay flag is set, then this time is ignored."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"availableStartTime\"")
  private String availableStartTime;

  /**
  * Description: "The closing time of day. Note: If the AllDay flag is set, then this time is ignored."
  */
  @javax.validation.constraints.Pattern(regexp="([01][0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9](\\.[0-9]+)?")
  @javax.persistence.Basic
  @Column(name="\"availableEndTime\"")
  private String availableEndTime;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public HealthcareServiceAvailableTimeModel() {
  }

  public HealthcareServiceAvailableTimeModel(HealthcareServiceAvailableTime o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.daysOfWeek = org.fhir.utils.JsonUtils.toJson(o.getDaysOfWeek());
    this.allDay = o.getAllDay();
    this.availableStartTime = o.getAvailableStartTime();
    this.availableEndTime = o.getAvailableEndTime();
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getDaysOfWeek() {
    return this.daysOfWeek;
  }
  public void setDaysOfWeek( String value) {
    this.daysOfWeek = value;
  }
  public Boolean getAllDay() {
    return this.allDay;
  }
  public void setAllDay( Boolean value) {
    this.allDay = value;
  }
  public String getAvailableStartTime() {
    return this.availableStartTime;
  }
  public void setAvailableStartTime( String value) {
    this.availableStartTime = value;
  }
  public String getAvailableEndTime() {
    return this.availableEndTime;
  }
  public void setAvailableEndTime( String value) {
    this.availableEndTime = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[HealthcareServiceAvailableTimeModel]:" + "\n");
     builder.append("daysOfWeek" + "->" + this.daysOfWeek + "\n"); 
     builder.append("allDay" + "->" + this.allDay + "\n"); 
     builder.append("availableStartTime" + "->" + this.availableStartTime + "\n"); 
     builder.append("availableEndTime" + "->" + this.availableEndTime + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[HealthcareServiceAvailableTimeModel]:" + "\n");
     builder.append("daysOfWeek" + "->" + this.daysOfWeek + "\n"); 
     builder.append("allDay" + "->" + this.allDay + "\n"); 
     builder.append("availableStartTime" + "->" + this.availableStartTime + "\n"); 
     builder.append("availableEndTime" + "->" + this.availableEndTime + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}