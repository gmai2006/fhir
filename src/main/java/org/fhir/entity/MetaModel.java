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
* "The metadata about a resource. This is content in the resource that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
*/
@Entity
@Table(name="meta")
public class MetaModel  implements Serializable {
	private static final long serialVersionUID = 151857669675461255L;
  /**
  * Description: "The version specific identifier, as it appears in the version portion of the URL. This values changes when the resource is created, updated, or deleted."
  */
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Basic
  @Column(name="\"versionId\"")
  private String versionId;

  /**
  * Description: "When the resource last changed - e.g. when the version changed."
  */
  @javax.persistence.Basic
  @Column(name="\"lastUpdated\"")
  private String lastUpdated;

  /**
  * Description: "A list of profiles (references to [[[StructureDefinition]]] resources) that this resource claims to conform to. The URL is a reference to [[[StructureDefinition.url]]]."
  */
  @javax.persistence.Basic
  @Column(name="\"profile\"")
  private String profile;

  /**
  * Description: "Security labels applied to this resource. These tags connect specific resources to the overall security policy and infrastructure."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"security\"", length = 16777215)
  private String security;

  /**
  * Description: "Tags applied to this resource. Tags are intended to be used to identify and relate resources to process and workflow, and applications are not required to consider the tags when interpreting the meaning of a resource."
  * Actual type: List<String>;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"tag\"", length = 16777215)
  private String tag;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
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

  public MetaModel() {
  }

  public MetaModel(Meta o, String parentId) {
  	this.parent_id = parentId;
  	this.id = String.valueOf(System.currentTimeMillis() + org.fhir.utils.EntityUtils.generateRandom());
    this.versionId = o.getVersionId();
    this.lastUpdated = o.getLastUpdated();
    this.profile = org.fhir.utils.JsonUtils.write2String(o.getProfile());
  }

  public String getVersionId() {
    return this.versionId;
  }
  public void setVersionId( String value) {
    this.versionId = value;
  }
  public String getLastUpdated() {
    return this.lastUpdated;
  }
  public void setLastUpdated( String value) {
    this.lastUpdated = value;
  }
  public String getProfile() {
    return this.profile;
  }
  public void setProfile( String value) {
    this.profile = value;
  }
  public String getSecurity() {
    return this.security;
  }
  public void setSecurity( String value) {
    this.security = value;
  }
  public String getTag() {
    return this.tag;
  }
  public void setTag( String value) {
    this.tag = value;
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
    builder.append("[MetaModel]:" + "\n");
     builder.append("versionId" + "->" + this.versionId + "\n"); 
     builder.append("lastUpdated" + "->" + this.lastUpdated + "\n"); 
     builder.append("profile" + "->" + this.profile + "\n"); 
     builder.append("security" + "->" + this.security + "\n"); 
     builder.append("tag" + "->" + this.tag + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[MetaModel]:" + "\n");
     builder.append("versionId" + "->" + this.versionId + "\n"); 
     builder.append("lastUpdated" + "->" + this.lastUpdated + "\n"); 
     builder.append("profile" + "->" + this.profile + "\n"); 
     builder.append("security" + "->" + this.security + "\n"); 
     builder.append("tag" + "->" + this.tag + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("parent_id" + "->" + this.parent_id + "\n"); ;
    return builder.toString();
  }
}