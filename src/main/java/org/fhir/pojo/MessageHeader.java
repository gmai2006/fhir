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
import org.fhir.entity.MessageHeaderModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class MessageHeader  extends DomainResource  {
  /**
  * Description: "This is a MessageHeader resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value \"http://hl7.org/fhir/message-events\"."
  */
  @javax.validation.constraints.NotNull
  protected Coding event;

  /**
  * Description: "The destination application which the message is intended for."
  */
  protected java.util.List<MessageHeaderDestination> destination;

  /**
  * Description: "Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient."
  */
  protected Reference receiver;

  /**
  * Description: "Identifies the sending system to allow the use of a trust relationship."
  */
  protected Reference sender;

  /**
  * Description: "The time that the message was sent."
  */
  protected String timestamp;

  /**
  * Description: "Extensions for timestamp"
  */
  protected transient Element _timestamp;

  /**
  * Description: "The person or device that performed the data entry leading to this message. When there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions."
  */
  protected Reference enterer;

  /**
  * Description: "The logical author of the message - the person or device that decided the described event should happen. When there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions."
  */
  protected Reference author;

  /**
  * Description: "The source application from which this message originated."
  */
  @javax.validation.constraints.NotNull
  protected MessageHeaderSource source;

  /**
  * Description: "The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party."
  */
  protected Reference responsible;

  /**
  * Description: "Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message."
  */
  protected CodeableConcept reason;

  /**
  * Description: "Information about the message that this message is a response to.  Only present if this message is a response."
  */
  protected MessageHeaderResponse response;

  /**
  * Description: "The actual data of the message - a reference to the root/focus class of the event."
  */
  protected java.util.List<Reference> focus;

  public MessageHeader() {
  }

  public MessageHeader(MessageHeaderModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getEvent() && !o.getEvent().isEmpty()) {
      this.event = new Coding(o.getEvent().get(0));
    }
    if (null != o.getDestination() && !o.getDestination().isEmpty()) {
    	this.destination = MessageHeaderDestinationHelper.fromArray2Array(o.getDestination());
    }
    if (null != o.getReceiver() && !o.getReceiver().isEmpty()) {
      this.receiver = new Reference(o.getReceiver().get(0));
    }
    if (null != o.getSender() && !o.getSender().isEmpty()) {
      this.sender = new Reference(o.getSender().get(0));
    }
    if (null != o.getTimestamp()) {
      this.timestamp = o.getTimestamp();
    }
    if (null != o.getEnterer() && !o.getEnterer().isEmpty()) {
      this.enterer = new Reference(o.getEnterer().get(0));
    }
    if (null != o.getAuthor() && !o.getAuthor().isEmpty()) {
      this.author = new Reference(o.getAuthor().get(0));
    }
    if (null != o.getSource() && !o.getSource().isEmpty()) {
      this.source = new MessageHeaderSource(o.getSource().get(0));
    }
    if (null != o.getResponsible() && !o.getResponsible().isEmpty()) {
      this.responsible = new Reference(o.getResponsible().get(0));
    }
    if (null != o.getReason() && !o.getReason().isEmpty()) {
      this.reason = new CodeableConcept(o.getReason().get(0));
    }
    if (null != o.getResponse() && !o.getResponse().isEmpty()) {
      this.response = new MessageHeaderResponse(o.getResponse().get(0));
    }
    if (null != o.getFocus() && !o.getFocus().isEmpty()) {
    	this.focus = ReferenceHelper.fromArray2Array(o.getFocus());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setEvent( Coding value) {
    this.event = value;
  }
  public Coding getEvent() {
    return this.event;
  }
  public void setDestination( java.util.List<MessageHeaderDestination> value) {
    this.destination = value;
  }
  public java.util.List<MessageHeaderDestination> getDestination() {
    return this.destination;
  }
  public void setReceiver( Reference value) {
    this.receiver = value;
  }
  public Reference getReceiver() {
    return this.receiver;
  }
  public void setSender( Reference value) {
    this.sender = value;
  }
  public Reference getSender() {
    return this.sender;
  }
  public void setTimestamp( String value) {
    this.timestamp = value;
  }
  public String getTimestamp() {
    return this.timestamp;
  }
  public void set_timestamp( Element value) {
    this._timestamp = value;
  }
  public Element get_timestamp() {
    return this._timestamp;
  }
  public void setEnterer( Reference value) {
    this.enterer = value;
  }
  public Reference getEnterer() {
    return this.enterer;
  }
  public void setAuthor( Reference value) {
    this.author = value;
  }
  public Reference getAuthor() {
    return this.author;
  }
  public void setSource( MessageHeaderSource value) {
    this.source = value;
  }
  public MessageHeaderSource getSource() {
    return this.source;
  }
  public void setResponsible( Reference value) {
    this.responsible = value;
  }
  public Reference getResponsible() {
    return this.responsible;
  }
  public void setReason( CodeableConcept value) {
    this.reason = value;
  }
  public CodeableConcept getReason() {
    return this.reason;
  }
  public void setResponse( MessageHeaderResponse value) {
    this.response = value;
  }
  public MessageHeaderResponse getResponse() {
    return this.response;
  }
  public void setFocus( java.util.List<Reference> value) {
    this.focus = value;
  }
  public java.util.List<Reference> getFocus() {
    return this.focus;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MessageHeader]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.event != null) builder.append("event" + "->" + this.event.toString() + "\n"); 
     if(this.destination != null) builder.append("destination" + "->" + this.destination.toString() + "\n"); 
     if(this.receiver != null) builder.append("receiver" + "->" + this.receiver.toString() + "\n"); 
     if(this.sender != null) builder.append("sender" + "->" + this.sender.toString() + "\n"); 
     if(this.timestamp != null) builder.append("timestamp" + "->" + this.timestamp.toString() + "\n"); 
     if(this._timestamp != null) builder.append("_timestamp" + "->" + this._timestamp.toString() + "\n"); 
     if(this.enterer != null) builder.append("enterer" + "->" + this.enterer.toString() + "\n"); 
     if(this.author != null) builder.append("author" + "->" + this.author.toString() + "\n"); 
     if(this.source != null) builder.append("source" + "->" + this.source.toString() + "\n"); 
     if(this.responsible != null) builder.append("responsible" + "->" + this.responsible.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this.response != null) builder.append("response" + "->" + this.response.toString() + "\n"); 
     if(this.focus != null) builder.append("focus" + "->" + this.focus.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	MessageHeader,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "MessageHeader" : { return MessageHeader.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}