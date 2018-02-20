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
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
@Entity
@Table(name="capabilitystatementmessaging")
public class CapabilityStatementMessagingModel  implements Serializable {
	private static final long serialVersionUID = 151910893699911117L;
  /**
  * Description: "An endpoint (network accessible address) to which messages and/or replies are to be sent."
  */
  @javax.persistence.Basic
  @Column(name="\"endpoint_id\"")
  private String endpoint_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="endpoint_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementEndpointModel> endpoint;

  /**
  * Description: "Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  @javax.persistence.Basic
  @Column(name="\"reliableCache\"")
  private Float reliableCache;

  /**
  * Description: "Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the capability statement.  For example, the process for becoming an authorized messaging exchange partner."
  */
  @javax.persistence.Basic
  @Column(name="\"documentation\"")
  private String documentation;

  /**
  * Description: "References to message definitions for messages this system can send or receive."
  */
  @javax.persistence.Basic
  @Column(name="\"supportedmessage_id\"")
  private String supportedmessage_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="supportedmessage_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementSupportedMessageModel> supportedMessage;

  /**
  * Description: "A description of the solution's support for an event at this end-point."
  */
  @javax.persistence.Basic
  @Column(name="\"event_id\"")
  private String event_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="event_id", insertable=false, updatable=false)
  private java.util.List<CapabilityStatementEventModel> event;

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
  @Column(name="\"parent_id\"")
  private String parent_id;

  public CapabilityStatementMessagingModel() {
  }

  public CapabilityStatementMessagingModel(CapabilityStatementMessaging o, String parentId) {
  	this.parent_id = parentId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint_id = "endpoint" + this.parent_id;
    	this.endpoint = CapabilityStatementEndpointHelper.toModelFromArray(o.getEndpoint(), this.endpoint_id);
    }
    this.reliableCache = o.getReliableCache();
    this.documentation = o.getDocumentation();
    if (null != o.getSupportedMessage() && !o.getSupportedMessage().isEmpty()) {
    	this.supportedmessage_id = "supportedmessage" + this.parent_id;
    	this.supportedMessage = CapabilityStatementSupportedMessageHelper.toModelFromArray(o.getSupportedMessage(), this.supportedmessage_id);
    }
    if (null != o.getEvent() && !o.getEvent().isEmpty()) {
    	this.event_id = "event" + this.parent_id;
    	this.event = CapabilityStatementEventHelper.toModelFromArray(o.getEvent(), this.event_id);
    }
    if (null != o.getModifierExtension()) {
    	this.modifierExtension = JsonUtils.toJson(o.getModifierExtension());
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public java.util.List<CapabilityStatementEndpointModel> getEndpoint() {
    return this.endpoint;
  }
  public void setEndpoint( java.util.List<CapabilityStatementEndpointModel> value) {
    this.endpoint = value;
  }
  public Float getReliableCache() {
    return this.reliableCache;
  }
  public void setReliableCache( Float value) {
    this.reliableCache = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public java.util.List<CapabilityStatementSupportedMessageModel> getSupportedMessage() {
    return this.supportedMessage;
  }
  public void setSupportedMessage( java.util.List<CapabilityStatementSupportedMessageModel> value) {
    this.supportedMessage = value;
  }
  public java.util.List<CapabilityStatementEventModel> getEvent() {
    return this.event;
  }
  public void setEvent( java.util.List<CapabilityStatementEventModel> value) {
    this.event = value;
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
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementMessagingModel]:" + "\n");
     builder.append("reliableCache" + "->" + this.reliableCache + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[CapabilityStatementMessagingModel]:" + "\n");
     builder.append("endpoint" + "->" + this.endpoint + "\n"); 
     builder.append("reliableCache" + "->" + this.reliableCache + "\n"); 
     builder.append("documentation" + "->" + this.documentation + "\n"); 
     builder.append("supportedMessage" + "->" + this.supportedMessage + "\n"); 
     builder.append("event" + "->" + this.event + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}