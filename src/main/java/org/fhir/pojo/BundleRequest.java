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
import org.fhir.entity.BundleRequestModel;
import com.google.gson.GsonBuilder;

/**
* "A container for a collection of resources."
*/
public class BundleRequest  {
  /**
  * Description: "The HTTP verb for this entry in either a change history, or a transaction/ transaction response."
  */
  private String method;

  /**
  * Description: "Extensions for method"
  */
  private transient Element _method;

  /**
  * Description: "The URL for this entry, relative to the root (the address to which the request is posted)."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "If the ETag values match, return a 304 Not Modified status. See the API documentation for [\"Conditional Read\"](http.html#cread)."
  */
  private String ifNoneMatch;

  /**
  * Description: "Extensions for ifNoneMatch"
  */
  private transient Element _ifNoneMatch;

  /**
  * Description: "Only perform the operation if the last updated date matches. See the API documentation for [\"Conditional Read\"](http.html#cread)."
  */
  private String ifModifiedSince;

  /**
  * Description: "Extensions for ifModifiedSince"
  */
  private transient Element _ifModifiedSince;

  /**
  * Description: "Only perform the operation if the Etag value matches. For more information, see the API section [\"Managing Resource Contention\"](http.html#concurrency)."
  */
  private String ifMatch;

  /**
  * Description: "Extensions for ifMatch"
  */
  private transient Element _ifMatch;

  /**
  * Description: "Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\"Conditional Create\"](http.html#ccreate). This is just the query portion of the URL - what follows the \"?\" (not including the \"?\")."
  */
  private String ifNoneExist;

  /**
  * Description: "Extensions for ifNoneExist"
  */
  private transient Element _ifNoneExist;

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

  public BundleRequest() {
  }

  public BundleRequest(BundleRequestModel o) {
    this.id = o.getId();
      if (null != o.getMethod()) {
        this.method = new String(o.getMethod());
      }

      if (null != o.getUrl()) {
        this.url = new String(o.getUrl());
      }

      if (null != o.getIfNoneMatch()) {
        this.ifNoneMatch = new String(o.getIfNoneMatch());
      }

      if (null != o.getIfModifiedSince()) {
        this.ifModifiedSince = new String(o.getIfModifiedSince());
      }

      if (null != o.getIfMatch()) {
        this.ifMatch = new String(o.getIfMatch());
      }

      if (null != o.getIfNoneExist()) {
        this.ifNoneExist = new String(o.getIfNoneExist());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setMethod( String value) {
    this.method = MethodEnum.fromCode(value);
  }
  public String getMethod() {
    return this.method;
  }
  public void set_method( Element value) {
    this._method = value;
  }
  public Element get_method() {
    return this._method;
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
  public void setIfNoneMatch( String value) {
    this.ifNoneMatch = value;
  }
  public String getIfNoneMatch() {
    return this.ifNoneMatch;
  }
  public void set_ifNoneMatch( Element value) {
    this._ifNoneMatch = value;
  }
  public Element get_ifNoneMatch() {
    return this._ifNoneMatch;
  }
  public void setIfModifiedSince( String value) {
    this.ifModifiedSince = value;
  }
  public String getIfModifiedSince() {
    return this.ifModifiedSince;
  }
  public void set_ifModifiedSince( Element value) {
    this._ifModifiedSince = value;
  }
  public Element get_ifModifiedSince() {
    return this._ifModifiedSince;
  }
  public void setIfMatch( String value) {
    this.ifMatch = value;
  }
  public String getIfMatch() {
    return this.ifMatch;
  }
  public void set_ifMatch( Element value) {
    this._ifMatch = value;
  }
  public Element get_ifMatch() {
    return this._ifMatch;
  }
  public void setIfNoneExist( String value) {
    this.ifNoneExist = value;
  }
  public String getIfNoneExist() {
    return this.ifNoneExist;
  }
  public void set_ifNoneExist( Element value) {
    this._ifNoneExist = value;
  }
  public Element get_ifNoneExist() {
    return this._ifNoneExist;
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
     builder.append("method" + "[" + String.valueOf(this.method) + "]\n"); 
     builder.append("_method" + "[" + String.valueOf(this._method) + "]\n"); 
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("_url" + "[" + String.valueOf(this._url) + "]\n"); 
     builder.append("ifNoneMatch" + "[" + String.valueOf(this.ifNoneMatch) + "]\n"); 
     builder.append("_ifNoneMatch" + "[" + String.valueOf(this._ifNoneMatch) + "]\n"); 
     builder.append("ifModifiedSince" + "[" + String.valueOf(this.ifModifiedSince) + "]\n"); 
     builder.append("_ifModifiedSince" + "[" + String.valueOf(this._ifModifiedSince) + "]\n"); 
     builder.append("ifMatch" + "[" + String.valueOf(this.ifMatch) + "]\n"); 
     builder.append("_ifMatch" + "[" + String.valueOf(this._ifMatch) + "]\n"); 
     builder.append("ifNoneExist" + "[" + String.valueOf(this.ifNoneExist) + "]\n"); 
     builder.append("_ifNoneExist" + "[" + String.valueOf(this._ifNoneExist) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum MethodEnum {
  	GET,
  	POST,
  	PUT,
  	DELETE,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "GET" : { return GET.toString(); }
  			case "POST" : { return POST.toString(); }
  			case "PUT" : { return PUT.toString(); }
  			case "DELETE" : { return DELETE.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<BundleRequest> fromArray(java.util.List<BundleRequestModel> list) {
    return (java.util.List<BundleRequest>)list.stream()
      .map(model -> new BundleRequest(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<BundleRequestModel> toModelArray(java.util.List<BundleRequest> list) {
    return (java.util.List<BundleRequestModel>)list.stream()
      .map(model -> new BundleRequestModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static BundleRequest fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, BundleRequest.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(BundleRequest o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<BundleRequest> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}