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
import com.google.gson.GsonBuilder;

/**
* "The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle."
*/
public class MessageHeader  {
  /**
  * Description: "This is a MessageHeader resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value \"http://hl7.org/fhir/message-events\"."
  */
  @javax.validation.constraints.NotNull
  private Coding event;

  /**
  * Description: "The destination application which the message is intended for."
  */
  private java.util.List<MessageHeaderDestination> destination = new java.util.ArrayList<>();

  /**
  * Description: "Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient."
  */
  private Reference receiver;

  /**
  * Description: "Identifies the sending system to allow the use of a trust relationship."
  */
  private Reference sender;

  /**
  * Description: "The time that the message was sent."
  */
  private String timestamp;

  /**
  * Description: "Extensions for timestamp"
  */
  private transient Element _timestamp;

  /**
  * Description: "The person or device that performed the data entry leading to this message. When there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions."
  */
  private Reference enterer;

  /**
  * Description: "The logical author of the message - the person or device that decided the described event should happen. When there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions."
  */
  private Reference author;

  /**
  * Description: "The source application from which this message originated."
  */
  @javax.validation.constraints.NotNull
  private MessageHeaderSource source;

  /**
  * Description: "The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party."
  */
  private Reference responsible;

  /**
  * Description: "Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message."
  */
  private CodeableConcept reason;

  /**
  * Description: "Information about the message that this message is a response to.  Only present if this message is a response."
  */
  private MessageHeaderResponse response;

  /**
  * Description: "The actual data of the message - a reference to the root/focus class of the event."
  */
  private java.util.List<Reference> focus = new java.util.ArrayList<>();

  /**
  * Description: "A human-readable narrative that contains a summary of the resource, and may be used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative. Resource definitions may define what content should be represented in the narrative to ensure clinical safety."
   derived from DomainResource
  */
  private Narrative text;

  /**
  * Description: "These resources do not have an independent existence apart from the resource that contains them - they cannot be identified independently, and nor can they have their own independent transaction scope."
   derived from DomainResource
  */
  private java.util.List<ResourceList> contained = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from DomainResource
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the resource, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from DomainResource
  */
  private java.util.List<Extension> modifierExtension = new java.util.ArrayList<>();

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
   derived from DomainResource
  */
  private Meta meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
   derived from DomainResource
  */
  private String implicitRules;

  /**
  * Description: "Extensions for implicitRules"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
   derived from DomainResource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String language;

  /**
  * Description: "Extensions for language"
   derived from Resource
   derived from DomainResource
  */
  private transient Element _language;

  public MessageHeader() {
  }

  public MessageHeader(MessageHeaderModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    this.event = CodingHelper.fromJson(o.getEvent());
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
    this.reason = CodeableConceptHelper.fromJson(o.getReason());
    if (null != o.getResponse() && !o.getResponse().isEmpty()) {
      this.response = new MessageHeaderResponse(o.getResponse().get(0));
    }
    if (null != o.getFocus() && !o.getFocus().isEmpty()) {
    	this.focus = ReferenceHelper.fromArray2Array(o.getFocus());
    }
    if (null != o.getText() && !o.getText().isEmpty()) {
      this.text = new Narrative(o.getText().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
    if (null != o.getMeta() && !o.getMeta().isEmpty()) {
      this.meta = new Meta(o.getMeta().get(0));
    }
    if (null != o.getImplicitRules()) {
      this.implicitRules = o.getImplicitRules();
    }
    if (null != o.getLanguage()) {
      this.language = o.getLanguage();
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
  public void setText( Narrative value) {
    this.text = value;
  }
  public Narrative getText() {
    return this.text;
  }
  public void setContained( java.util.List<ResourceList> value) {
    this.contained = value;
  }
  public java.util.List<ResourceList> getContained() {
    return this.contained;
  }
  public void setExtension( java.util.List<Extension> value) {
    this.extension = value;
  }
  public java.util.List<Extension> getExtension() {
    return this.extension;
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
  public void setMeta( Meta value) {
    this.meta = value;
  }
  public Meta getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void set_implicitRules( Element value) {
    this._implicitRules = value;
  }
  public Element get_implicitRules() {
    return this._implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void set_language( Element value) {
    this._language = value;
  }
  public Element get_language() {
    return this._language;
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
     if(this.focus != null) builder.append("focus" + "->" + this.focus.toString() + "\n"); 
     if(this.text != null) builder.append("text" + "->" + this.text.toString() + "\n"); 
     if(this.contained != null) builder.append("contained" + "->" + this.contained.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.meta != null) builder.append("meta" + "->" + this.meta.toString() + "\n"); 
     if(this.implicitRules != null) builder.append("implicitRules" + "->" + this.implicitRules.toString() + "\n"); 
     if(this._implicitRules != null) builder.append("_implicitRules" + "->" + this._implicitRules.toString() + "\n"); 
     if(this.language != null) builder.append("language" + "->" + this.language.toString() + "\n"); 
     if(this._language != null) builder.append("_language" + "->" + this._language.toString() + "\n"); ;
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