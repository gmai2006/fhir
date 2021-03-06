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
* "A group of related requests that can be used to capture intended activities that have inter-dependencies such as \"give this medication after that one\"."
* generated on 07/14/2018
*/
@Entity
@Table(name="requestgrouprelatedaction")
public class RequestGroupRelatedActionModel  implements Serializable {
	private static final long serialVersionUID = 153159210174412429L;
  /**
  * Description: "The element id of the action this is related to."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"actionId\"")
  private String actionId;

  /**
  * Description: "The relationship of this action to the related action."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"relationship\"")
  private String relationship;

  /**
  * Description: "A duration or range of durations to apply to the relationship. For example, 30-60 minutes before."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"offsetDuration\"", length = 16777215)
  private String offsetDuration;

  /**
  * Description: "A duration or range of durations to apply to the relationship. For example, 30-60 minutes before."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"offsetRange\"", length = 16777215)
  private String offsetRange;

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

  public RequestGroupRelatedActionModel() {
  }

  public RequestGroupRelatedActionModel(RequestGroupRelatedAction o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.actionId = o.getActionId();
    this.relationship = o.getRelationship();
    if (null != o.getOffsetDuration()) {
    	this.offsetDuration = JsonUtils.toJson(o.getOffsetDuration());
    }
    if (null != o.getOffsetRange()) {
    	this.offsetRange = JsonUtils.toJson(o.getOffsetRange());
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getActionId() {
    return this.actionId;
  }
  public void setActionId( String value) {
    this.actionId = value;
  }
  public String getRelationship() {
    return this.relationship;
  }
  public void setRelationship( String value) {
    this.relationship = value;
  }
  public String getOffsetDuration() {
    return this.offsetDuration;
  }
  public void setOffsetDuration( String value) {
    this.offsetDuration = value;
  }
  public String getOffsetRange() {
    return this.offsetRange;
  }
  public void setOffsetRange( String value) {
    this.offsetRange = value;
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
    builder.append("[RequestGroupRelatedActionModel]:" + "\n");
     builder.append("actionId" + "->" + this.actionId + "\n"); 
     builder.append("relationship" + "->" + this.relationship + "\n"); 
     builder.append("offsetDuration" + "->" + this.offsetDuration + "\n"); 
     builder.append("offsetRange" + "->" + this.offsetRange + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RequestGroupRelatedActionModel]:" + "\n");
     builder.append("actionId" + "->" + this.actionId + "\n"); 
     builder.append("relationship" + "->" + this.relationship + "\n"); 
     builder.append("offsetDuration" + "->" + this.offsetDuration + "\n"); 
     builder.append("offsetRange" + "->" + this.offsetRange + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}