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

/**
* "A structured set of tests against a FHIR server implementation to determine compliance against the FHIR specification."
*/
public class TestScriptOperation  {
  /**
  * Description: "Server interaction or operation type."
  */
  private Coding type;

  /**
  * Description: "The type of the resource.  See http://build.fhir.org/resourcelist.html."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  private String resource;

  /**
  * Description: "Extensions for resource"
  */
  private transient Element _resource;

  /**
  * Description: "The label would be used for tracking/logging purposes by test engines."
  */
  private String label;

  /**
  * Description: "Extensions for label"
  */
  private transient Element _label;

  /**
  * Description: "The description would be used by test engines for tracking and reporting purposes."
  */
  private String description;

  /**
  * Description: "Extensions for description"
  */
  private transient Element _description;

  /**
  * Description: "The content-type or mime-type to use for RESTful operation in the 'Accept' header."
  */
  private String accept;

  /**
  * Description: "Extensions for accept"
  */
  private transient Element _accept;

  /**
  * Description: "The content-type or mime-type to use for RESTful operation in the 'Content-Type' header."
  */
  private String contentType;

  /**
  * Description: "Extensions for contentType"
  */
  private transient Element _contentType;

  /**
  * Description: "The server where the request message is destined for.  Must be one of the server numbers listed in TestScript.destination section."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float destination;

  /**
  * Description: "Extensions for destination"
  */
  private transient Element _destination;

  /**
  * Description: "Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths."
  */
  private Boolean encodeRequestUrl;

  /**
  * Description: "Extensions for encodeRequestUrl"
  */
  private transient Element _encodeRequestUrl;

  /**
  * Description: "The server where the request message originates from.  Must be one of the server numbers listed in TestScript.origin section."
  */
  @javax.validation.constraints.Pattern(regexp="-?([0]|([1-9][0-9]*))")
  private Float origin;

  /**
  * Description: "Extensions for origin"
  */
  private transient Element _origin;

  /**
  * Description: "Path plus parameters after [type].  Used to set parts of the request URL explicitly."
  */
  private String params;

  /**
  * Description: "Extensions for params"
  */
  private transient Element _params;

  /**
  * Description: "Header elements would be used to set HTTP headers."
  */
  private java.util.List<TestScriptRequestHeader> requestHeader = new java.util.ArrayList<>();

  /**
  * Description: "The fixture id (maybe new) to map to the request."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String requestId;

  /**
  * Description: "Extensions for requestId"
  */
  private transient Element _requestId;

  /**
  * Description: "The fixture id (maybe new) to map to the response."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String responseId;

  /**
  * Description: "Extensions for responseId"
  */
  private transient Element _responseId;

  /**
  * Description: "The id of the fixture used as the body of a PUT or POST request."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String sourceId;

  /**
  * Description: "Extensions for sourceId"
  */
  private transient Element _sourceId;

  /**
  * Description: "Id of fixture used for extracting the [id],  [type], and [vid] for GET requests."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  private String targetId;

  /**
  * Description: "Extensions for targetId"
  */
  private transient Element _targetId;

  /**
  * Description: "Complete request URL."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

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
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("_resource" + "[" + String.valueOf(this._resource) + "]\n"); 
     builder.append("label" + "[" + String.valueOf(this.label) + "]\n"); 
     builder.append("_label" + "[" + String.valueOf(this._label) + "]\n"); 
     builder.append("description" + "[" + String.valueOf(this.description) + "]\n"); 
     builder.append("_description" + "[" + String.valueOf(this._description) + "]\n"); 
     builder.append("accept" + "[" + String.valueOf(this.accept) + "]\n"); 
     builder.append("_accept" + "[" + String.valueOf(this._accept) + "]\n"); 
     builder.append("contentType" + "[" + String.valueOf(this.contentType) + "]\n"); 
     builder.append("_contentType" + "[" + String.valueOf(this._contentType) + "]\n"); 
     builder.append("destination" + "[" + String.valueOf(this.destination) + "]\n"); 
     builder.append("_destination" + "[" + String.valueOf(this._destination) + "]\n"); 
     builder.append("encodeRequestUrl" + "[" + String.valueOf(this.encodeRequestUrl) + "]\n"); 
     builder.append("_encodeRequestUrl" + "[" + String.valueOf(this._encodeRequestUrl) + "]\n"); 
     builder.append("origin" + "[" + String.valueOf(this.origin) + "]\n"); 
     builder.append("_origin" + "[" + String.valueOf(this._origin) + "]\n"); 
     builder.append("params" + "[" + String.valueOf(this.params) + "]\n"); 
     builder.append("_params" + "[" + String.valueOf(this._params) + "]\n"); 
     builder.append("requestHeader" + "[" + String.valueOf(this.requestHeader) + "]\n"); 
     builder.append("requestId" + "[" + String.valueOf(this.requestId) + "]\n"); 
     builder.append("_requestId" + "[" + String.valueOf(this._requestId) + "]\n"); 
     builder.append("responseId" + "[" + String.valueOf(this.responseId) + "]\n"); 
     builder.append("_responseId" + "[" + String.valueOf(this._responseId) + "]\n"); 
     builder.append("sourceId" + "[" + String.valueOf(this.sourceId) + "]\n"); 
     builder.append("_sourceId" + "[" + String.valueOf(this._sourceId) + "]\n"); 
     builder.append("targetId" + "[" + String.valueOf(this.targetId) + "]\n"); 
     builder.append("_targetId" + "[" + String.valueOf(this._targetId) + "]\n"); 
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("_url" + "[" + String.valueOf(this._url) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public static TestScriptOperation fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, TestScriptOperation.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(TestScriptOperation o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<TestScriptOperation> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

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
  }public enum ContentTypeEnum {
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