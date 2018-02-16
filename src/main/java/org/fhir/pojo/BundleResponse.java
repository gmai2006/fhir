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
public class BundleResponse  extends BackboneElement  {
  /**
  * Description: "The status code returned by processing this entry. The status SHALL start with a 3 digit HTTP code (e.g. 404) and may contain the standard HTTP description associated with the status code."
  */
  protected String status;

  /**
  * Description: "Extensions for status"
  */
  protected transient Element _status;

  /**
  * Description: "The location header created by processing this operation."
  */
  protected String location;

  /**
  * Description: "Extensions for location"
  */
  protected transient Element _location;

  /**
  * Description: "The etag for the resource, it the operation for the entry produced a versioned resource (see [Resource Metadata and Versioning](http.html#versioning) and [Managing Resource Contention](http.html#concurrency))."
  */
  protected String etag;

  /**
  * Description: "Extensions for etag"
  */
  protected transient Element _etag;

  /**
  * Description: "The date/time that the resource was modified on the server."
  */
  protected String lastModified;

  /**
  * Description: "Extensions for lastModified"
  */
  protected transient Element _lastModified;

  /**
  * Description: "An OperationOutcome containing hints and warnings produced as part of processing this entry in a batch or transaction."
  */
  protected ResourceList outcome;

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
     if(this.outcome != null) builder.append("outcome" + "->" + this.outcome.toString() + "\n"); ;
    return builder.toString();
  }


}