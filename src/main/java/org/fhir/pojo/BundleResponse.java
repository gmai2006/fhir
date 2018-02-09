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
import org.fhir.entity.BundleResponseModel;
import com.google.gson.GsonBuilder;

/**
* "A container for a collection of resources."
*/
public class BundleResponse  {
  /**
  * Description: "The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code."
  */
  private String status;

  /**
  * Description: "Extensions for status"
  */
  private transient Element _status;

  /**
  * Description: "The location header created by processing this operation."
  */
  private String location;

  /**
  * Description: "Extensions for location"
  */
  private transient Element _location;

  /**
  * Description: "The etag for the resource, it the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency))."
  */
  private String etag;

  /**
  * Description: "Extensions for etag"
  */
  private transient Element _etag;

  /**
  * Description: "The date/time that the resource was modified on the server."
  */
  private String lastModified;

  /**
  * Description: "Extensions for lastModified"
  */
  private transient Element _lastModified;

  /**
  * Description: "An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction."
  */
  private ResourceList outcome;

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

  public BundleResponse() {
  }

  public BundleResponse(BundleResponseModel o) {
    this.id = o.getId();
      if (null != o.getStatus()) {
        this.status = new String(o.getStatus());
      }

      if (null != o.getLocation()) {
        this.location = new String(o.getLocation());
      }

      if (null != o.getEtag()) {
        this.etag = new String(o.getEtag());
      }

      if (null != o.getLastModified()) {
        this.lastModified = new String(o.getLastModified());
      }

      this.outcome = ResourceList.fromJson(o.getOutcome());
      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setStatus( String value) {
    this.status = value;
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
  public void setLocation( String value) {
    this.location = value;
  }
  public String getLocation() {
    return this.location;
  }
  public void set_location( Element value) {
    this._location = value;
  }
  public Element get_location() {
    return this._location;
  }
  public void setEtag( String value) {
    this.etag = value;
  }
  public String getEtag() {
    return this.etag;
  }
  public void set_etag( Element value) {
    this._etag = value;
  }
  public Element get_etag() {
    return this._etag;
  }
  public void setLastModified( String value) {
    this.lastModified = value;
  }
  public String getLastModified() {
    return this.lastModified;
  }
  public void set_lastModified( Element value) {
    this._lastModified = value;
  }
  public Element get_lastModified() {
    return this._lastModified;
  }
  public void setOutcome( ResourceList value) {
    this.outcome = value;
  }
  public ResourceList getOutcome() {
    return this.outcome;
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
     builder.append("status" + "[" + String.valueOf(this.status) + "]\n"); 
     builder.append("_status" + "[" + String.valueOf(this._status) + "]\n"); 
     builder.append("location" + "[" + String.valueOf(this.location) + "]\n"); 
     builder.append("_location" + "[" + String.valueOf(this._location) + "]\n"); 
     builder.append("etag" + "[" + String.valueOf(this.etag) + "]\n"); 
     builder.append("_etag" + "[" + String.valueOf(this._etag) + "]\n"); 
     builder.append("lastModified" + "[" + String.valueOf(this.lastModified) + "]\n"); 
     builder.append("_lastModified" + "[" + String.valueOf(this._lastModified) + "]\n"); 
     builder.append("outcome" + "[" + String.valueOf(this.outcome) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<BundleResponse> fromArray(java.util.List<BundleResponseModel> list) {
    return (java.util.List<BundleResponse>)list.stream()
      .map(model -> new BundleResponse(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<BundleResponseModel> toModelArray(java.util.List<BundleResponse> list) {
    return (java.util.List<BundleResponseModel>)list.stream()
      .map(model -> new BundleResponseModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static BundleResponse fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, BundleResponse.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(BundleResponse o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<BundleResponse> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}