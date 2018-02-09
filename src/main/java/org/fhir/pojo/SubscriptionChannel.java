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
import org.fhir.entity.SubscriptionChannelModel;
import com.google.gson.GsonBuilder;

/**
* "The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action."
*/
public class SubscriptionChannel  {
  /**
  * Description: "The type of channel to send notifications on."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "The uri that describes the actual end-point to send messages to."
  */
  private String endpoint;

  /**
  * Description: "Extensions for endpoint"
  */
  private transient Element _endpoint;

  /**
  * Description: "The mime type to send the payload in - either application/fhir+xml, or application/fhir+json. If the payload is not present, then there is no payload in the notification, just a notification."
  */
  private String payload;

  /**
  * Description: "Extensions for payload"
  */
  private transient Element _payload;

  /**
  * Description: "Additional headers / information to send as part of the notification."
  */
  private java.util.List<String> header = new java.util.ArrayList<>();

  /**
  * Description: "Extensions for header"
  */
  private transient java.util.List<Element> _header = new java.util.ArrayList<>();

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

  public SubscriptionChannel() {
  }

  public SubscriptionChannel(SubscriptionChannelModel o) {
    this.id = o.getId();
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getEndpoint()) {
        this.endpoint = new String(o.getEndpoint());
      }

      if (null != o.getPayload()) {
        this.payload = new String(o.getPayload());
      }

      this.header = org.fhir.utils.JsonUtils.json2Array(o.getHeader());

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setEndpoint( String value) {
    this.endpoint = value;
  }
  public String getEndpoint() {
    return this.endpoint;
  }
  public void set_endpoint( Element value) {
    this._endpoint = value;
  }
  public Element get_endpoint() {
    return this._endpoint;
  }
  public void setPayload( String value) {
    this.payload = value;
  }
  public String getPayload() {
    return this.payload;
  }
  public void set_payload( Element value) {
    this._payload = value;
  }
  public Element get_payload() {
    return this._payload;
  }
  public void setHeader( java.util.List<String> value) {
    this.header = value;
  }
  public java.util.List<String> getHeader() {
    return this.header;
  }
  public void set_header( java.util.List<Element> value) {
    this._header = value;
  }
  public java.util.List<Element> get_header() {
    return this._header;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("endpoint" + "[" + String.valueOf(this.endpoint) + "]\n"); 
     builder.append("_endpoint" + "[" + String.valueOf(this._endpoint) + "]\n"); 
     builder.append("payload" + "[" + String.valueOf(this.payload) + "]\n"); 
     builder.append("_payload" + "[" + String.valueOf(this._payload) + "]\n"); 
     builder.append("header" + "[" + String.valueOf(this.header) + "]\n"); 
     builder.append("_header" + "[" + String.valueOf(this._header) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	resthook,
  	websocket,
  	email,
  	sms,
  	message,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "resthook" : { return resthook.toString(); }
  			case "websocket" : { return websocket.toString(); }
  			case "email" : { return email.toString(); }
  			case "sms" : { return sms.toString(); }
  			case "message" : { return message.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<SubscriptionChannel> fromArray(java.util.List<SubscriptionChannelModel> list) {
    return (java.util.List<SubscriptionChannel>)list.stream()
      .map(model -> new SubscriptionChannel(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<SubscriptionChannelModel> toModelArray(java.util.List<SubscriptionChannel> list) {
    return (java.util.List<SubscriptionChannelModel>)list.stream()
      .map(model -> new SubscriptionChannelModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static SubscriptionChannel fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, SubscriptionChannel.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(SubscriptionChannel o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<SubscriptionChannel> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}