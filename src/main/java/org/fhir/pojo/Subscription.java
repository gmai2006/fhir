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
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Subscription  extends DomainResource  {
  /**
  * Description: "This is a Subscription resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "The status of the subscription, which marks the server state for managing the subscription."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting."
  */
  protected java.util.List<ContactPoint> contact;

  /**
  * Description: "The time for the server to turn the subscription off."
  */
  protected String end;

  /**
  * Description: "Extensions for end"
  */
  protected transient Element _end;

  /**
  * Description: "A description of why this subscription is defined."
  */
  protected String reason;

  /**
  * Description: "Extensions for reason"
  */
  protected transient Element _reason;

  /**
  * Description: "The rules that the server should use to determine when to generate notifications for this subscription."
  */
  protected String criteria;

  /**
  * Description: "Extensions for criteria"
  */
  protected transient Element _criteria;

  /**
  * Description: "A record of the last error that occurred when the server processed a notification."
  */
  protected String error;

  /**
  * Description: "Extensions for error"
  */
  protected transient Element _error;

  /**
  * Description: "Details where to send notifications when resources are received that meet the criteria."
  */
  @javax.validation.constraints.NotNull
  protected SubscriptionChannel channel;

  /**
  * Description: "A tag to add to any resource that matches the criteria, after the subscription is processed."
  */
  protected java.util.List<Coding> tag;

  public Subscription() {
  }

  public Subscription(SubscriptionModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getEnd()) {
      this.end = o.getEnd();
    }
    if (null != o.getReason()) {
      this.reason = o.getReason();
    }
    if (null != o.getCriteria()) {
      this.criteria = o.getCriteria();
    }
    if (null != o.getError()) {
      this.error = o.getError();
    }
    if (null != o.getChannel() && !o.getChannel().isEmpty()) {
      this.channel = new SubscriptionChannel(o.getChannel().get(0));
    }
    if (null != o.getTag() && !o.getTag().isEmpty()) {
    	this.tag = CodingHelper.fromArray2Array(o.getTag());
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

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[Subscription]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.end != null) builder.append("end" + "->" + this.end.toString() + "\n"); 
     if(this._end != null) builder.append("_end" + "->" + this._end.toString() + "\n"); 
     if(this.reason != null) builder.append("reason" + "->" + this.reason.toString() + "\n"); 
     if(this._reason != null) builder.append("_reason" + "->" + this._reason.toString() + "\n"); 
     if(this.criteria != null) builder.append("criteria" + "->" + this.criteria.toString() + "\n"); 
     if(this._criteria != null) builder.append("_criteria" + "->" + this._criteria.toString() + "\n"); 
     if(this.error != null) builder.append("error" + "->" + this.error.toString() + "\n"); 
     if(this._error != null) builder.append("_error" + "->" + this._error.toString() + "\n"); 
     if(this.channel != null) builder.append("channel" + "->" + this.channel.toString() + "\n"); 
     if(this.tag != null) builder.append("tag" + "->" + this.tag.toString() + "\n"); ;
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

}