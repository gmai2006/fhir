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

package org.fhir.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import org.fhir.pojo.*;
import java.io.Serializable;
/**
* "A container for a collection of resources."
*/
@Entity
@Table(name="bundleentry")
public class BundleEntryModel  implements Serializable {
	private static final long serialVersionUID = 151857669691489354L;
  /**
  * Description: "A series of links that provide context to this entry."
  */
  @javax.persistence.Basic
  @Column(name="\"link_id\"")
  private String link_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="link_id", insertable=false, updatable=false)
  private java.util.List<BundleLinkModel> link;

  /**
  * Description: "The Absolute URL for the resource.  The fullUrl SHALL not disagree with the id in the resource. The fullUrl is a version independent reference to the resource. The fullUrl element SHALL have a value except that: \n* fullUrl can be empty on a POST (although it does not need to when specifying a temporary id for reference in the bundle)\n* Results from operations might involve resources that are not identified."
  */
  @javax.persistence.Basic
  @Column(name="\"fullUrl\"")
  private String fullUrl;

  /**
  * Description: "The Resources for the entry."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"resource\"", length = 16777215)
  private String resource;

  /**
  * Description: "Information about the search process that lead to the creation of this entry."
  */
  @javax.persistence.Basic
  @Column(name="\"search_id\"")
  private String search_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="search_id", insertable=false, updatable=false)
  private java.util.List<BundleSearchModel> search;

  /**
  * Description: "Additional information about how this entry should be processed as part of a transaction."
  */
  @javax.persistence.Basic
  @Column(name="\"request_id\"")
  private String request_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="request_id", insertable=false, updatable=false)
  private java.util.List<BundleRequestModel> request;

  /**
  * Description: "Additional information about how this entry should be processed as part of a transaction."
  */
  @javax.persistence.Basic
  @Column(name="\"response_id\"")
  private String response_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="response_id", insertable=false, updatable=false)
  private java.util.List<BundleResponseModel> response;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element, and that modifies the understanding of the element that contains it. Usually modifier elements provide negation or qualification. In order to make the use of extensions safe and manageable, there is a strict set of governance applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension. Applications processing a resource are required to check for modifier extensions."
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"modifierExtension\"", length = 16777215)
  private String modifierExtension;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
   derived from BackboneElement
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from BackboneElement
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  /**
  * Description: 
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"parent_id\"")
  private String parent_id;

  public BundleEntryModel() {
  }

  public BundleEntryModel(BundleEntry o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    if (null != o.getLink() && !o.getLink().isEmpty()) {
    	this.link_id = "link" + this.parent_id;
    	this.link = BundleLinkHelper.toModelFromArray(o.getLink(), this.link_id);
    }
    this.fullUrl = o.getFullUrl();
    this.resource = ResourceListHelper.toJson(o.getResource());
    if (null != o.getSearch() ) {
    	this.search_id = "search" + this.parent_id;
    	this.search = BundleSearchHelper.toModel(o.getSearch(), this.search_id);
    }
    if (null != o.getRequest() ) {
    	this.request_id = "request" + this.parent_id;
    	this.request = BundleRequestHelper.toModel(o.getRequest(), this.request_id);
    }
    if (null != o.getResponse() ) {
    	this.response_id = "response" + this.parent_id;
    	this.response = BundleResponseHelper.toModel(o.getResponse(), this.response_id);
    }
  }

  public java.util.List<BundleLinkModel> getLink() {
    return this.link;
  }
  public void setLink( java.util.List<BundleLinkModel> value) {
    this.link = value;
  }
  public String getFullUrl() {
    return this.fullUrl;
  }
  public void setFullUrl( String value) {
    this.fullUrl = value;
  }
  public String getResource() {
    return this.resource;
  }
  public void setResource( String value) {
    this.resource = value;
  }
  public java.util.List<BundleSearchModel> getSearch() {
    return this.search;
  }
  public void setSearch( java.util.List<BundleSearchModel> value) {
    this.search = value;
  }
  public java.util.List<BundleRequestModel> getRequest() {
    return this.request;
  }
  public void setRequest( java.util.List<BundleRequestModel> value) {
    this.request = value;
  }
  public java.util.List<BundleResponseModel> getResponse() {
    return this.response;
  }
  public void setResponse( java.util.List<BundleResponseModel> value) {
    this.response = value;
  }
  public String getModifierExtension() {
    return this.modifierExtension;
  }
  public void setModifierExtension( String value) {
    this.modifierExtension = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getExtension() {
    return this.extension;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getParent_id() {
    return this.parent_id;
  }
  public void setParent_id( String value) {
    this.parent_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BundleEntryModel]:" + "\n");
     builder.append("fullUrl" + "->" + this.fullUrl + "\n"); 
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BundleEntryModel]:" + "\n");
     builder.append("link" + "->" + this.link + "\n"); 
     builder.append("fullUrl" + "->" + this.fullUrl + "\n"); 
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("search" + "->" + this.search + "\n"); 
     builder.append("request" + "->" + this.request + "\n"); 
     builder.append("response" + "->" + this.response + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}