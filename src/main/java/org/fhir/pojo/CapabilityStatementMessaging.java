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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "A Capability Statement documents a set of capabilities (behaviors) of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class CapabilityStatementMessaging  extends BackboneElement  {
  /**
  * Description: "An endpoint (network accessible address) to which messages and/or replies are to be sent."
  */
  protected java.util.List<CapabilityStatementEndpoint> endpoint;

  /**
  * Description: "Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)."
  */
  @javax.validation.constraints.Pattern(regexp="[0]|([1-9][0-9]*)")
  protected Float reliableCache;

  /**
  * Description: "Extensions for reliableCache"
  */
  protected transient Element _reliableCache;

  /**
  * Description: "Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the capability statement.  For example, the process for becoming an authorized messaging exchange partner."
  */
  protected String documentation;

  /**
  * Description: "Extensions for documentation"
  */
  protected transient Element _documentation;

  /**
  * Description: "References to message definitions for messages this system can send or receive."
  */
  protected java.util.List<CapabilityStatementSupportedMessage> supportedMessage;

  /**
  * Description: "A description of the solution's support for an event at this end-point."
  */
  protected java.util.List<CapabilityStatementEvent> event;

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
     if(this.event != null) builder.append("event" + "->" + this.event.toString() + "\n"); ;
    return builder.toString();
  }


}