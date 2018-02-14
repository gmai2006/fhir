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
import org.fhir.entity.CapabilityStatementMessagingModel;
import com.google.gson.GsonBuilder;

/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
*/
public class CapabilityStatementMessaging  {
  /**
  * Description: "An endpoint (network accessible address) to which messages and/or replies are to be sent."
  */
  private java.util.List<CapabilityStatementEndpoint> endpoint = new java.util.ArrayList<>();

  /**
  * Description: "Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  private Float reliableCache;

  /**
  * Description: "Extensions for reliableCache"
  */
  private transient Element _reliableCache;

  /**
  * Description: "Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the capability statement.  For example, the process for becoming an authorized messaging exchange partner."
  */
  private String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  private transient Element _documentation;

  /**
  * Description: "References to message definitions for messages this system can send or receive."
  */
  private java.util.List<CapabilityStatementSupportedMessage> supportedMessage = new java.util.ArrayList<>();

  /**
  * Description: "A description of the solution's support for an event at this end-point."
  */
  private java.util.List<CapabilityStatementEvent> event = new java.util.ArrayList<>();

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

  public CapabilityStatementMessaging() {
  }

  public CapabilityStatementMessaging(CapabilityStatementMessagingModel o) {
    this.id = o.getId();
    if (null != o.getEndpoint() && !o.getEndpoint().isEmpty()) {
    	this.endpoint = CapabilityStatementEndpointHelper.fromArray2Array(o.getEndpoint());
    }
    if (null != o.getReliableCache()) {
      this.reliableCache = o.getReliableCache();
    }
    if (null != o.getDocumentation()) {
      this.documentation = o.getDocumentation();
    }
    if (null != o.getSupportedMessage() && !o.getSupportedMessage().isEmpty()) {
    	this.supportedMessage = CapabilityStatementSupportedMessageHelper.fromArray2Array(o.getSupportedMessage());
    }
    if (null != o.getEvent() && !o.getEvent().isEmpty()) {
    	this.event = CapabilityStatementEventHelper.fromArray2Array(o.getEvent());
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setEndpoint( java.util.List<CapabilityStatementEndpoint> value) {
    this.endpoint = value;
  }
  public java.util.List<CapabilityStatementEndpoint> getEndpoint() {
    return this.endpoint;
  }
  public void setReliableCache( Float value) {
    this.reliableCache = value;
  }
  public Float getReliableCache() {
    return this.reliableCache;
  }
  public void set_reliableCache( Element value) {
    this._reliableCache = value;
  }
  public Element get_reliableCache() {
    return this._reliableCache;
  }
  public void setDocumentation( String value) {
    this.documentation = value;
  }
  public String getDocumentation() {
    return this.documentation;
  }
  public void set_documentation( Element value) {
    this._documentation = value;
  }
  public Element get_documentation() {
    return this._documentation;
  }
  public void setSupportedMessage( java.util.List<CapabilityStatementSupportedMessage> value) {
    this.supportedMessage = value;
  }
  public java.util.List<CapabilityStatementSupportedMessage> getSupportedMessage() {
    return this.supportedMessage;
  }
  public void setEvent( java.util.List<CapabilityStatementEvent> value) {
    this.event = value;
  }
  public java.util.List<CapabilityStatementEvent> getEvent() {
    return this.event;
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
    builder.append("[CapabilityStatementMessaging]:" + "\n");
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); 
     if(this.reliableCache != null) builder.append("reliableCache" + "->" + this.reliableCache.toString() + "\n"); 
     if(this._reliableCache != null) builder.append("_reliableCache" + "->" + this._reliableCache.toString() + "\n"); 
     if(this.documentation != null) builder.append("documentation" + "->" + this.documentation.toString() + "\n"); 
     if(this._documentation != null) builder.append("_documentation" + "->" + this._documentation.toString() + "\n"); 
     if(this.supportedMessage != null) builder.append("supportedMessage" + "->" + this.supportedMessage.toString() + "\n"); 
     if(this.event != null) builder.append("event" + "->" + this.event.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}