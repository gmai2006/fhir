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
import org.fhir.entity.BundleEntryModel;
import com.google.gson.GsonBuilder;

/**
* "A container for a collection of resources."
*/
public class BundleEntry  {
  /**
  * Description: "A series of links that provide context to this entry."
  */
  private java.util.List<BundleLink> link = new java.util.ArrayList<>();

  /**
  * Description: "The Absolute URL for the resource.  The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: \n* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)\n* Results from operations might involve resources that are not identified."
  */
  private String fullUrl;

  /**
  * Description: "Extensions for fullUrl"
  */
  private transient Element _fullUrl;

  /**
  * Description: "The Resources for the entry."
  */
  private ResourceList resource;

  /**
  * Description: "Information about the search process that lead to the creation of this entry."
  */
  private BundleSearch search;

  /**
  * Description: "Additional information about how this entry should be processed as part of a transaction."
  */
  private BundleRequest request;

  /**
  * Description: "Additional information about how this entry should be processed as part of a transaction."
  */
  private BundleResponse response;

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

  public BundleEntry() {
  }

  public BundleEntry(BundleEntryModel o) {
    this.id = o.getId();
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link = BundleLinkHelper.fromArray2Array(o.getLink());
    }
    if (null != o.getFullUrl()) {
      this.fullUrl = o.getFullUrl();
    }
    this.resource = ResourceListHelper.fromJson(o.getResource());
    if (null != o.getSearch() && !o.getSearch().isEmpty()) {
      this.search = new BundleSearch(o.getSearch().get(0));
    }
    if (null != o.getRequest() && !o.getRequest().isEmpty()) {
      this.request = new BundleRequest(o.getRequest().get(0));
    }
    if (null != o.getResponse() && !o.getResponse().isEmpty()) {
      this.response = new BundleResponse(o.getResponse().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
  }

  public void setLink( java.util.List<BundleLink> value) {
    this.link = value;
  }
  public java.util.List<BundleLink> getLink() {
    return this.link;
  }
  public void setFullUrl( String value) {
    this.fullUrl = value;
  }
  public String getFullUrl() {
    return this.fullUrl;
  }
  public void set_fullUrl( Element value) {
    this._fullUrl = value;
  }
  public Element get_fullUrl() {
    return this._fullUrl;
  }
  public void setResource( ResourceList value) {
    this.resource = value;
  }
  public ResourceList getResource() {
    return this.resource;
  }
  public void setSearch( BundleSearch value) {
    this.search = value;
  }
  public BundleSearch getSearch() {
    return this.search;
  }
  public void setRequest( BundleRequest value) {
    this.request = value;
  }
  public BundleRequest getRequest() {
    return this.request;
  }
  public void setResponse( BundleResponse value) {
    this.response = value;
  }
  public BundleResponse getResponse() {
    return this.response;
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
    builder.append("[BundleEntry]:" + "\n");
     if(this.link != null) builder.append("link" + "->" + this.link.toString() + "\n"); 
     if(this.fullUrl != null) builder.append("fullUrl" + "->" + this.fullUrl.toString() + "\n"); 
     if(this._fullUrl != null) builder.append("_fullUrl" + "->" + this._fullUrl.toString() + "\n"); 
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); 
     if(this.search != null) builder.append("search" + "->" + this.search.toString() + "\n"); 
     if(this.request != null) builder.append("request" + "->" + this.request.toString() + "\n"); 
     if(this.response != null) builder.append("response" + "->" + this.response.toString() + "\n"); 
     if(this.modifierExtension != null) builder.append("modifierExtension" + "->" + this.modifierExtension.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
    return builder.toString();
  }


}