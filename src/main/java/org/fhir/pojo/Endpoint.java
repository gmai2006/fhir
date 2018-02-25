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
import org.fhir.entity.EndpointModel;
import com.fasterxml.jackson.annotation.JsonInclude;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
/**
* "The technical details of an endpoint that can be used for electronic services, such as for web services providing XDS.b or a REST endpoint for another FHIR server. This may include any security context information."
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Endpoint  extends DomainResource  {
  /**
  * Description: "This is a Endpoint resource"
  */
  @javax.validation.constraints.NotNull
  protected String resourceType;

  /**
  * Description: "Identifier for the organization that is used to identify the endpoint across multiple disparate systems."
  */
  protected java.util.List<Identifier> identifier;

  /**
  * Description: "active | suspended | error | off | test."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "A coded value that represents the technical details of the usage of this endpoint, such as what WSDLs should be used in what way. (e.g. XDS.b/DICOM/cds-hook)."
  */
  @javax.validation.constraints.NotNull
  protected Coding connectionType;

  /**
  * Description: "A friendly name that this endpoint can be referred to with."
  */
  protected String name;

  /**
  * Description: "Extensions for name"
  */
  protected transient Element _name;

  /**
  * Description: "The organization that manages this endpoint (even if technically another organisation is hosting this in the cloud, it is the organisation associated with the data)."
  */
  protected Reference managingOrganization;

  /**
  * Description: "Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting."
  */
  protected java.util.List<ContactPoint> contact;

  /**
  * Description: "The interval during which the endpoint is expected to be operational."
  */
  protected Period period;

  /**
  * Description: "The payload type describes the acceptable content that can be communicated on the endpoint."
  */
  @javax.validation.constraints.NotNull
  protected java.util.List<CodeableConcept> payloadType;

  /**
  * Description: "The mime type to send the payload in - e.g. application/fhir+xml, application/fhir+json. If the mime type is not specified, then the sender could send any content (including no content depending on the connectionType)."
  */
  protected java.util.List<String> payloadMimeType;

  /**
  * Description: "Extensions for payloadMimeType"
  */
  protected transient java.util.List<Element> _payloadMimeType;

  /**
  * Description: "The uri that describes the actual end-point to connect to."
  */
  protected String address;

  /**
  * Description: "Extensions for address"
  */
  protected transient Element _address;

  /**
  * Description: "Additional headers / information to send as part of the notification."
  */
  protected java.util.List<String> header;

  /**
  * Description: "Extensions for header"
  */
  protected transient java.util.List<Element> _header;

  public Endpoint() {
  }

  public Endpoint(EndpointModel o) {
    this.id = o.getId();
    if (null != o.getResourceType()) {
      this.resourceType = o.getResourceType();
    }
    if (null != o.getStatus()) {
      this.status = o.getStatus();
    }
    if (null != o.getConnectionType() && !o.getConnectionType().isEmpty()) {
      this.connectionType = new Coding(o.getConnectionType().get(0));
    }
    if (null != o.getName()) {
      this.name = o.getName();
    }
    if (null != o.getManagingOrganization() && !o.getManagingOrganization().isEmpty()) {
      this.managingOrganization = new Reference(o.getManagingOrganization().get(0));
    }
    this.period = PeriodHelper.fromJson(o.getPeriod());
    if (null != o.getPayloadType() && !o.getPayloadType().isEmpty()) {
    	this.payloadType = CodeableConceptHelper.fromArray2Array(o.getPayloadType());
    }
    if (o.getPayloadMimeType() != null) {
    	this.payloadMimeType = org.fhir.utils.JsonUtils.json2Array(o.getPayloadMimeType());
    }
    if (null != o.getAddress()) {
      this.address = o.getAddress();
    }
    if (o.getHeader() != null) {
    	this.header = org.fhir.utils.JsonUtils.json2Array(o.getHeader());
    }
  }

  public void setResourceType( String value) {
    this.resourceType = ResourceTypeEnum.fromCode(value);
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setIdentifier( java.util.List<Identifier> value) {
    this.identifier = value;
  }
  public java.util.List<Identifier> getIdentifier() {
    return this.identifier;
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
  public void setConnectionType( Coding value) {
    this.connectionType = value;
  }
  public Coding getConnectionType() {
    return this.connectionType;
  }
  public void setName( String value) {
    this.name = value;
  }
  public String getName() {
    return this.name;
  }
  public void set_name( Element value) {
    this._name = value;
  }
  public Element get_name() {
    return this._name;
  }
  public void setManagingOrganization( Reference value) {
    this.managingOrganization = value;
  }
  public Reference getManagingOrganization() {
    return this.managingOrganization;
  }
  public void setContact( java.util.List<ContactPoint> value) {
    this.contact = value;
  }
  public java.util.List<ContactPoint> getContact() {
    return this.contact;
  }
  public void setPeriod( Period value) {
    this.period = value;
  }
  public Period getPeriod() {
    return this.period;
  }
  public void setPayloadType( java.util.List<CodeableConcept> value) {
    this.payloadType = value;
  }
  public java.util.List<CodeableConcept> getPayloadType() {
    return this.payloadType;
  }
  public void setPayloadMimeType( java.util.List<String> value) {
    this.payloadMimeType = value;
  }
  public java.util.List<String> getPayloadMimeType() {
    return this.payloadMimeType;
  }
  public void set_payloadMimeType( java.util.List<Element> value) {
    this._payloadMimeType = value;
  }
  public java.util.List<Element> get_payloadMimeType() {
    return this._payloadMimeType;
  }
  public void setAddress( String value) {
    this.address = value;
  }
  public String getAddress() {
    return this.address;
  }
  public void set_address( Element value) {
    this._address = value;
  }
  public Element get_address() {
    return this._address;
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
    builder.append("[Endpoint]:" + "\n");
     if(this.resourceType != null) builder.append("resourceType" + "->" + this.resourceType.toString() + "\n"); 
     if(this.identifier != null) builder.append("identifier" + "->" + this.identifier.toString() + "\n"); 
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.connectionType != null) builder.append("connectionType" + "->" + this.connectionType.toString() + "\n"); 
     if(this.name != null) builder.append("name" + "->" + this.name.toString() + "\n"); 
     if(this._name != null) builder.append("_name" + "->" + this._name.toString() + "\n"); 
     if(this.managingOrganization != null) builder.append("managingOrganization" + "->" + this.managingOrganization.toString() + "\n"); 
     if(this.contact != null) builder.append("contact" + "->" + this.contact.toString() + "\n"); 
     if(this.period != null) builder.append("period" + "->" + this.period.toString() + "\n"); 
     if(this.payloadType != null) builder.append("payloadType" + "->" + this.payloadType.toString() + "\n"); 
     if(this.payloadMimeType != null) builder.append("payloadMimeType" + "->" + this.payloadMimeType.toString() + "\n"); 
     if(this._payloadMimeType != null) builder.append("_payloadMimeType" + "->" + this._payloadMimeType.toString() + "\n"); 
     if(this.address != null) builder.append("address" + "->" + this.address.toString() + "\n"); 
     if(this._address != null) builder.append("_address" + "->" + this._address.toString() + "\n"); 
     if(this.header != null) builder.append("header" + "->" + this.header.toString() + "\n"); 
     if(this._header != null) builder.append("_header" + "->" + this._header.toString() + "\n"); ;
    return builder.toString();
  }

  public enum ResourceTypeEnum {
  	Endpoint,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "Endpoint" : { return Endpoint.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public enum StatusEnum {
  	active,
  	suspended,
  	error,
  	off,
  	enteredinerror,
  	test,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "active" : { return active.toString(); }
  			case "suspended" : { return suspended.toString(); }
  			case "error" : { return error.toString(); }
  			case "off" : { return off.toString(); }
  			case "enteredinerror" : { return enteredinerror.toString(); }
  			case "test" : { return test.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

}