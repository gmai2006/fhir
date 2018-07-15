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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class SubscriptionChannel  extends BackboneElement  {
  /**
  * Description: "The type of channel to send notifications on."
  */
  protected String type;

  /**
  * Description: "Extensions for type"
  */
  protected transient Element _type;

  /**
  * Description: "The uri that describes the actual end-point to send messages to."
  */
  protected String endpoint;

  /**
  * Description: "Extensions for endpoint"
  */
  protected transient Element _endpoint;

  /**
  * Description: "The mime type to send the payload in - either application/fhir+xml, or application/fhir+json. If the payload is not present, then there is no payload in the notification, just a notification."
  */
  protected String payload;

  /**
  * Description: "Extensions for payload"
  */
  protected transient Element _payload;

  /**
  * Description: "Additional headers / information to send as part of the notification."
  */
  protected java.util.List<String> header;

  /**
  * Description: "Extensions for header"
  */
  protected transient java.util.List<Element> _header;

  public SubscriptionChannel() {
  }

  public SubscriptionChannel(SubscriptionChannelModel o) {
    this.id = o.getId();
    if (null != o.getType()) {
      this.type = o.getType();
    }
    if (null != o.getEndpoint()) {
      this.endpoint = o.getEndpoint();
    }
    if (null != o.getPayload()) {
      this.payload = o.getPayload();
    }
    if (o.getHeader() != null) {
    	this.header = org.fhir.utils.JsonUtils.json2Array(o.getHeader());
    }
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[SubscriptionChannel]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.endpoint != null) builder.append("endpoint" + "->" + this.endpoint.toString() + "\n"); 
     if(this._endpoint != null) builder.append("_endpoint" + "->" + this._endpoint.toString() + "\n"); 
     if(this.payload != null) builder.append("payload" + "->" + this.payload.toString() + "\n"); 
     if(this._payload != null) builder.append("_payload" + "->" + this._payload.toString() + "\n"); 
     if(this.header != null) builder.append("header" + "->" + this.header.toString() + "\n"); 
     if(this._header != null) builder.append("_header" + "->" + this._header.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
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

}