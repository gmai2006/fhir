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
      this.link = BundleLink.fromArray(o.getLink());

      if (null != o.getFullUrl()) {
        this.fullUrl = new String(o.getFullUrl());
      }

      this.resource = ResourceList.fromJson(o.getResource());
      if (null != o.getSearch()) {
        this.search = new BundleSearch(o.getSearch());
        this.search.setId(this.getId());
      }

      if (null != o.getRequest()) {
        this.request = new BundleRequest(o.getRequest());
        this.request.setId(this.getId());
      }

      if (null != o.getResponse()) {
        this.response = new BundleResponse(o.getResponse());
        this.response.setId(this.getId());
      }

      this.modifierExtension = Extension.fromArray(o.getModifierExtension());
      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
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
     builder.append("link" + "[" + String.valueOf(this.link) + "]\n"); 
     builder.append("fullUrl" + "[" + String.valueOf(this.fullUrl) + "]\n"); 
     builder.append("_fullUrl" + "[" + String.valueOf(this._fullUrl) + "]\n"); 
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("search" + "[" + String.valueOf(this.search) + "]\n"); 
     builder.append("request" + "[" + String.valueOf(this.request) + "]\n"); 
     builder.append("response" + "[" + String.valueOf(this.response) + "]\n"); 
     builder.append("modifierExtension" + "[" + String.valueOf(this.modifierExtension) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }


  public static java.util.List<BundleEntry> fromArray(java.util.List<BundleEntryModel> list) {
    return (java.util.List<BundleEntry>)list.stream()
      .map(model -> new BundleEntry(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<BundleEntryModel> toModelArray(java.util.List<BundleEntry> list) {
    return (java.util.List<BundleEntryModel>)list.stream()
      .map(model -> new BundleEntryModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static BundleEntry fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, BundleEntry.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(BundleEntry o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<BundleEntry> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}