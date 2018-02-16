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
import org.fhir.utils.JsonUtils;
/**
* "A container for a collection of resources."
*/
@Entity
@Table(name="bundlerequest")
public class BundleRequestModel  implements Serializable {
	private static final long serialVersionUID = 151873631159719914L;
  /**
  * Description: "The HTTP verb for this entry in either a change history, or a transaction/ transaction response."
  */
  @javax.persistence.Basic
  @Column(name="\"method\"")
  private String method;

  /**
  * Description: "The URL for this entry, relative to the root (the address to which the request is posted)."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "If the ETag values match, return a 304 Not Modified status. See the API documentation for [\"Conditional Read\"](http.html#cread)."
  */
  @javax.persistence.Basic
  @Column(name="\"ifNoneMatch\"")
  private String ifNoneMatch;

  /**
  * Description: "Only perform the operation if the last updated date matches. See the API documentation for [\"Conditional Read\"](http.html#cread)."
  */
  @javax.persistence.Basic
  @Column(name="\"ifModifiedSince\"")
  private String ifModifiedSince;

  /**
  * Description: "Only perform the operation if the Etag value matches. For more information, see the API section [\"Managing Resource Contention\"](http.html#concurrency)."
  */
  @javax.persistence.Basic
  @Column(name="\"ifMatch\"")
  private String ifMatch;

  /**
  * Description: "Instruct the server not to perform the create if a specified resource already exists. For further information, see the API documentation for [\"Conditional Create\"](http.html#ccreate). This is just the query portion of the URL - what follows the \"?\" (not including the \"?\")."
  */
  @javax.persistence.Basic
  @Column(name="\"ifNoneExist\"")
  private String ifNoneExist;

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

  public BundleRequestModel() {
  }

  public BundleRequestModel(BundleRequest o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.method = o.getMethod();
    this.url = o.getUrl();
    this.ifNoneMatch = o.getIfNoneMatch();
    this.ifModifiedSince = o.getIfModifiedSince();
    this.ifMatch = o.getIfMatch();
    this.ifNoneExist = o.getIfNoneExist();
  }

  public String getMethod() {
    return this.method;
  }
  public void setMethod( String value) {
    this.method = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getIfNoneMatch() {
    return this.ifNoneMatch;
  }
  public void setIfNoneMatch( String value) {
    this.ifNoneMatch = value;
  }
  public String getIfModifiedSince() {
    return this.ifModifiedSince;
  }
  public void setIfModifiedSince( String value) {
    this.ifModifiedSince = value;
  }
  public String getIfMatch() {
    return this.ifMatch;
  }
  public void setIfMatch( String value) {
    this.ifMatch = value;
  }
  public String getIfNoneExist() {
    return this.ifNoneExist;
  }
  public void setIfNoneExist( String value) {
    this.ifNoneExist = value;
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
    builder.append("[BundleRequestModel]:" + "\n");
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("ifNoneMatch" + "->" + this.ifNoneMatch + "\n"); 
     builder.append("ifModifiedSince" + "->" + this.ifModifiedSince + "\n"); 
     builder.append("ifMatch" + "->" + this.ifMatch + "\n"); 
     builder.append("ifNoneExist" + "->" + this.ifNoneExist + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BundleRequestModel]:" + "\n");
     builder.append("method" + "->" + this.method + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("ifNoneMatch" + "->" + this.ifNoneMatch + "\n"); 
     builder.append("ifModifiedSince" + "->" + this.ifModifiedSince + "\n"); 
     builder.append("ifMatch" + "->" + this.ifMatch + "\n"); 
     builder.append("ifNoneExist" + "->" + this.ifNoneExist + "\n"); 
     builder.append("modifierExtension" + "->" + this.modifierExtension + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}