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
  @javax.validation.constraints.NotNull
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
      this.status = o.getStatus();
    }
    if (null != o.getLocation()) {
      this.location = o.getLocation();
    }
    if (null != o.getEtag()) {
      this.etag = o.getEtag();
    }
    if (null != o.getLastModified()) {
      this.lastModified = o.getLastModified();
    }
    this.outcome = ResourceListHelper.fromJson(o.getOutcome());
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[BundleResponse]:" + "\n");
     if(this.status != null) builder.append("status" + "->" + this.status.toString() + "\n"); 
     if(this._status != null) builder.append("_status" + "->" + this._status.toString() + "\n"); 
     if(this.location != null) builder.append("location" + "->" + this.location.toString() + "\n"); 
     if(this._location != null) builder.append("_location" + "->" + this._location.toString() + "\n"); 
     if(this.etag != null) builder.append("etag" + "->" + this.etag.toString() + "\n"); 
     if(this._etag != null) builder.append("_etag" + "->" + this._etag.toString() + "\n"); 
     if(this.lastModified != null) builder.append("lastModified" + "->" + this.lastModified.toString() + "\n"); 
     if(this._lastModified != null) builder.append("_lastModified" + "->" + this._lastModified.toString() + "\n"); 
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}