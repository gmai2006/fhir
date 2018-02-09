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
import org.fhir.entity.SubscriptionModel;
import com.google.gson.GsonBuilder;

/**
* "The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action."
*/
public class Subscription  {
  /**
  * Description: "This is a Subscription resource"
  */
  @javax.validation.constraints.NotNull
  private String resourceType;

  /**
  * Description: "The status of the subscription, which marks the server state for managing the subscription."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting."
  */
  private java.util.List<ContactPoint> contact = new java.util.ArrayList<>();

  /**
  * Description: "The time for the server to turn the subscription off."
  */
  private String end;

  /**
  * Description: "Extensions for end"
  */
  private transient Element _end;

  /**
  * Description: "A description of why this subscription is defined."
  */
  private String reason;

  /**
  * Description: "Extensions for reason"
  */
  private transient Element _reason;

  /**
  * Description: "The rules that the server should use to determine when to generate notifications for this subscription."
  */
  private String criteria;

  /**
  * Description: "Extensions for criteria"
  */
  private transient Element _criteria;

  /**
  * Description: "A record of the last error that occurred when the server processed a notification."
  */
  private String error;

  /**
  * Description: "Extensions for error"
  */
  private transient Element _error;

  /**
  * Description: "Details where to send notifications when resources are received that meet the criteria."
  */
  @javax.validation.constraints.NotNull
  private SubscriptionChannel channel;

  /**
  * Description: "A tag to add to any resource that matches the criteria, after the subscription is processed."
  */
  private java.util.List<Coding> tag = new java.util.ArrayList<>();

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

  public Subscription() {
  }

  public Subscription(SubscriptionModel o) {
    this.id = o.getId();
      if (null != o.getResourceType()) {
        this.resourceType = new String(o.getResourceType());
      }

      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      this.contact = ContactPoint.fromArray(o.getContact());
      if (null != o.getEnd()) {
        this.end = new String(o.getEnd());
      }

      if (null != o.getReason()) {
        this.reason = new String(o.getReason());
      }

      if (null != o.getCriteria()) {
        this.criteria = new String(o.getCriteria());
      }

      if (null != o.getError()) {
        this.error = new String(o.getError());
      }

      if (null != o.getChannel()) {
        this.channel = new SubscriptionChannel(o.getChannel());
        this.channel.setId(this.getId());
      }

      this.tag = Coding.fromArray(o.getTag());
      if (null != o.getText()) {
        this.text = new Narrative(o.getText());
        this.text.setId(this.getId());
      }

      this.contained = ResourceList.fromArray(o.getContained());
      this.extension = Extension.fromArray(o.getExtension());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      if (null != o.getMeta()) {
        this.meta = new Meta(o.getMeta());
        this.meta.setId(this.getId());
      }

      if (null != o.getImplicitRules()) {
        this.implicitRules = new String(o.getImplicitRules());
      }

      if (null != o.getLanguage()) {
        this.language = new String(o.getLanguage());
      }

  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setStatus( String value) {
    this.status = StatusEnum.fromCode(value);
  }
  public String getStatus() {
    return this.status;
  }
  public void set_status( Element value) {
    this._status = value;
  }
  public Element get_status() {
    return this._status;
  }
  public void setContact( java.util.List<ContactPoint> value) {
    this.contact = value;
  }
  public java.util.List<ContactPoint> getContact() {
    return this.contact;
  }
  public void setEnd( String value) {
    this.end = value;
  }
  public String getEnd() {
    return this.end;
  }
  public void set_end( Element value) {
    this._end = value;
  }
  public Element get_end() {
    return this._end;
  }
  public void setReason( String value) {
    this.reason = value;
  }
  public String getReason() {
    return this.reason;
  }
  public void set_reason( Element value) {
    this._reason = value;
  }
  public Element get_reason() {
    return this._reason;
  }
  public void setCriteria( String value) {
    this.criteria = value;
  }
  public String getCriteria() {
    return this.criteria;
  }
  public void set_criteria( Element value) {
    this._criteria = value;
  }
  public Element get_criteria() {
    return this._criteria;
  }
  public void setError( String value) {
    this.error = value;
  }
  public String getError() {
    return this.error;
  }
  public void set_error( Element value) {
    this._error = value;
  }
  public Element get_error() {
    return this._error;
  }
  public void setChannel( SubscriptionChannel value) {
    this.channel = value;
  }
  public SubscriptionChannel getChannel() {
    return this.channel;
  }
  public void setTag( java.util.List<Coding> value) {
    this.tag = value;
  }
  public java.util.List<Coding> getTag() {
    return this.tag;
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
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("contact" + "[" + String.valueOf(this.contact) + "]\n"); 
     builder.append("end" + "[" + String.valueOf(this.end) + "]\n"); 
     builder.append("_end" + "[" + String.valueOf(this._end) + "]\n"); 
     builder.append("reason" + "[" + String.valueOf(this.reason) + "]\n"); 
     builder.append("_reason" + "[" + String.valueOf(this._reason) + "]\n"); 
     builder.append("criteria" + "[" + String.valueOf(this.criteria) + "]\n"); 
     builder.append("_criteria" + "[" + String.valueOf(this._criteria) + "]\n"); 
     builder.append("error" + "[" + String.valueOf(this.error) + "]\n"); 
     builder.append("_error" + "[" + String.valueOf(this._error) + "]\n"); 
     builder.append("channel" + "[" + String.valueOf(this.channel) + "]\n"); 
     builder.append("tag" + "[" + String.valueOf(this.tag) + "]\n"); 
     builder.append("text" + "[" + String.valueOf(this.text) + "]\n"); 
     builder.append("contained" + "[" + String.valueOf(this.contained) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("_implicitRules" + "[" + String.valueOf(this._implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("_language" + "[" + String.valueOf(this._language) + "]\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Subscription,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Subscription" : { return Subscription.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	requested,
  	active,
  	error,
  	off,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "requested" : { return requested.toString(); }
  			case "active" : { return active.toString(); }
  			case "error" : { return error.toString(); }
  			case "off" : { return off.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<Subscription> fromArray(java.util.List<SubscriptionModel> list) {
    return (java.util.List<Subscription>)list.stream()
      .map(model -> new Subscription(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SubscriptionModel> toModelArray(java.util.List<Subscription> list) {
    return (java.util.List<SubscriptionModel>)list.stream()
      .map(model -> new SubscriptionModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static Subscription fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, Subscription.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(Subscription o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<Subscription> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}