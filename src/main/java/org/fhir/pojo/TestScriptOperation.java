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
import com.google.gson.GsonBuilder;
import com.fasterxml.jackson.annotation.JsonInclude;
/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
* generated on 07/14/2018
*/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TestScriptOperation  extends BackboneElement  {
  /**
  * Description: "Server interaction or operation type."
  */
  protected Coding type;

  /**
  * Description: "The type of the resource.  See http://build.fhir.org/resourcelist.html."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  protected String resource;

  /**
  * Description: "Extensions for resource"
  */
  protected transient Element _resource;

  /**
  * Description: "The label would be used for tracking/logging purposes by test engines."
  */
  protected String label;

  /**
  * Description: "Extensions for label"
  */
  protected transient Element _label;

  /**
  * Description: "The description would be used by test engines for tracking and reporting purposes."
  */
  protected String description;

  /**
  * Description: "Extensions for description"
  */
  protected transient Element _description;

  /**
  * Description: "The content-type or mime-type to use for RESTful operation in the 'Accept' header."
  */
  protected String accept;

  /**
  * Description: "Extensions for accept"
  */
  protected transient Element _accept;

  /**
  * Description: "The content-type or mime-type to use for RESTful operation in the 'Content-Type' header."
  */
  protected String contentType;

  /**
  * Description: "Extensions for contentType"
  */
  protected transient Element _contentType;

  /**
  * Description: "The server where the request message is destined for.  Must be one of the server numbers listed in TestScript.destination section."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float destination;

  /**
  * Description: "Extensions for destination"
  */
  protected transient Element _destination;

  /**
  * Description: "Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths."
  */
  protected Boolean encodeRequestUrl;

  /**
  * Description: "Extensions for encodeRequestUrl"
  */
  protected transient Element _encodeRequestUrl;

  /**
  * Description: "The server where the request message originates from.  Must be one of the server numbers listed in TestScript.origin section."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  protected Float origin;

  /**
  * Description: "Extensions for origin"
  */
  protected transient Element _origin;

  /**
  * Description: "Path plus parameters after [type].  Used to set parts of the request URL explicitly."
  */
  protected String params;

  /**
  * Description: "Extensions for params"
  */
  protected transient Element _params;

  /**
  * Description: "Header elements would be used to set HTTP headers."
  */
  protected java.util.List<TestScriptRequestHeader> requestHeader;

  /**
  * Description: "The fixture id (maybe new) to map to the request."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String requestId;

  /**
  * Description: "Extensions for requestId"
  */
  protected transient Element _requestId;

  /**
  * Description: "The fixture id (maybe new) to map to the response."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String responseId;

  /**
  * Description: "Extensions for responseId"
  */
  protected transient Element _responseId;

  /**
  * Description: "The id of the fixture used as the body of a PUT or POST request."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String sourceId;

  /**
  * Description: "Extensions for sourceId"
  */
  protected transient Element _sourceId;

  /**
  * Description: "Id of fixture used for extracting the [id],  [type], and [vid] for GET requests."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  protected String targetId;

  /**
  * Description: "Extensions for targetId"
  */
  protected transient Element _targetId;

  /**
  * Description: "Complete request URL."
  */
  protected String url;

  /**
  * Description: "Extensions for url"
  */
  protected transient Element _url;

  public TestScriptOperation() {}

  public void setType( Coding value) {
    this.type = value;
  }
  public Coding getType() {
    return this.type;
  }
  public void setResource( String value) {
    this.resource = value;
  }
  public String getResource() {
    return this.resource;
  }
  public void set_resource( Element value) {
    this._resource = value;
  }
  public Element get_resource() {
    return this._resource;
  }
  public void setLabel( String value) {
    this.label = value;
  }
  public String getLabel() {
    return this.label;
  }
  public void set_label( Element value) {
    this._label = value;
  }
  public Element get_label() {
    return this._label;
  }
  public void setDescription( String value) {
    this.description = value;
  }
  public String getDescription() {
    return this.description;
  }
  public void set_description( Element value) {
    this._description = value;
  }
  public Element get_description() {
    return this._description;
  }
  public void setAccept( String value) {
    this.accept = AcceptEnum.fromCode(value);
  }
  public String getAccept() {
    return this.accept;
  }
  public void set_accept( Element value) {
    this._accept = value;
  }
  public Element get_accept() {
    return this._accept;
  }
  public void setContentType( String value) {
    this.contentType = ContentTypeEnum.fromCode(value);
  }
  public String getContentType() {
    return this.contentType;
  }
  public void set_contentType( Element value) {
    this._contentType = value;
  }
  public Element get_contentType() {
    return this._contentType;
  }
  public void setDestination( Float value) {
    this.destination = value;
  }
  public Float getDestination() {
    return this.destination;
  }
  public void set_destination( Element value) {
    this._destination = value;
  }
  public Element get_destination() {
    return this._destination;
  }
  public void setEncodeRequestUrl( Boolean value) {
    this.encodeRequestUrl = value;
  }
  public Boolean getEncodeRequestUrl() {
    return this.encodeRequestUrl;
  }
  public void set_encodeRequestUrl( Element value) {
    this._encodeRequestUrl = value;
  }
  public Element get_encodeRequestUrl() {
    return this._encodeRequestUrl;
  }
  public void setOrigin( Float value) {
    this.origin = value;
  }
  public Float getOrigin() {
    return this.origin;
  }
  public void set_origin( Element value) {
    this._origin = value;
  }
  public Element get_origin() {
    return this._origin;
  }
  public void setParams( String value) {
    this.params = value;
  }
  public String getParams() {
    return this.params;
  }
  public void set_params( Element value) {
    this._params = value;
  }
  public Element get_params() {
    return this._params;
  }
  public void setRequestHeader( java.util.List<TestScriptRequestHeader> value) {
    this.requestHeader = value;
  }
  public java.util.List<TestScriptRequestHeader> getRequestHeader() {
    return this.requestHeader;
  }
  public void setRequestId( String value) {
    this.requestId = value;
  }
  public String getRequestId() {
    return this.requestId;
  }
  public void set_requestId( Element value) {
    this._requestId = value;
  }
  public Element get_requestId() {
    return this._requestId;
  }
  public void setResponseId( String value) {
    this.responseId = value;
  }
  public String getResponseId() {
    return this.responseId;
  }
  public void set_responseId( Element value) {
    this._responseId = value;
  }
  public Element get_responseId() {
    return this._responseId;
  }
  public void setSourceId( String value) {
    this.sourceId = value;
  }
  public String getSourceId() {
    return this.sourceId;
  }
  public void set_sourceId( Element value) {
    this._sourceId = value;
  }
  public Element get_sourceId() {
    return this._sourceId;
  }
  public void setTargetId( String value) {
    this.targetId = value;
  }
  public String getTargetId() {
    return this.targetId;
  }
  public void set_targetId( Element value) {
    this._targetId = value;
  }
  public Element get_targetId() {
    return this._targetId;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[TestScriptOperation]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); 
     if(this._resource != null) builder.append("_resource" + "->" + this._resource.toString() + "\n"); 
     if(this.label != null) builder.append("label" + "->" + this.label.toString() + "\n"); 
     if(this._label != null) builder.append("_label" + "->" + this._label.toString() + "\n"); 
     if(this.description != null) builder.append("description" + "->" + this.description.toString() + "\n"); 
     if(this._description != null) builder.append("_description" + "->" + this._description.toString() + "\n"); 
     if(this.accept != null) builder.append("accept" + "->" + this.accept.toString() + "\n"); 
     if(this._accept != null) builder.append("_accept" + "->" + this._accept.toString() + "\n"); 
     if(this.contentType != null) builder.append("contentType" + "->" + this.contentType.toString() + "\n"); 
     if(this._contentType != null) builder.append("_contentType" + "->" + this._contentType.toString() + "\n"); 
     if(this.destination != null) builder.append("destination" + "->" + this.destination.toString() + "\n"); 
     if(this._destination != null) builder.append("_destination" + "->" + this._destination.toString() + "\n"); 
     if(this.encodeRequestUrl != null) builder.append("encodeRequestUrl" + "->" + this.encodeRequestUrl.toString() + "\n"); 
     if(this._encodeRequestUrl != null) builder.append("_encodeRequestUrl" + "->" + this._encodeRequestUrl.toString() + "\n"); 
     if(this.origin != null) builder.append("origin" + "->" + this.origin.toString() + "\n"); 
     if(this._origin != null) builder.append("_origin" + "->" + this._origin.toString() + "\n"); 
     if(this.params != null) builder.append("params" + "->" + this.params.toString() + "\n"); 
     if(this._params != null) builder.append("_params" + "->" + this._params.toString() + "\n"); 
     if(this.requestHeader != null) builder.append("requestHeader" + "->" + this.requestHeader.toString() + "\n"); 
     if(this.requestId != null) builder.append("requestId" + "->" + this.requestId.toString() + "\n"); 
     if(this._requestId != null) builder.append("_requestId" + "->" + this._requestId.toString() + "\n"); 
     if(this.responseId != null) builder.append("responseId" + "->" + this.responseId.toString() + "\n"); 
     if(this._responseId != null) builder.append("_responseId" + "->" + this._responseId.toString() + "\n"); 
     if(this.sourceId != null) builder.append("sourceId" + "->" + this.sourceId.toString() + "\n"); 
     if(this._sourceId != null) builder.append("_sourceId" + "->" + this._sourceId.toString() + "\n"); 
     if(this.targetId != null) builder.append("targetId" + "->" + this.targetId.toString() + "\n"); 
     if(this._targetId != null) builder.append("_targetId" + "->" + this._targetId.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); ;
    return builder.toString();
  }

  /**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum AcceptEnum {
  	xml,
  	json,
  	ttl,
  	none,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "xml" : { return xml.toString(); }
  			case "json" : { return json.toString(); }
  			case "ttl" : { return ttl.toString(); }
  			case "none" : { return none.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }/**
   * Auto generated from the FHIR specification
   * generated on 07/14/2018
   */
  public enum ContentTypeEnum {
  	xml,
  	json,
  	ttl,
  	none,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "xml" : { return xml.toString(); }
  			case "json" : { return json.toString(); }
  			case "ttl" : { return ttl.toString(); }
  			case "none" : { return none.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }
}