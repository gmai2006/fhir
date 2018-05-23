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
* "Related artifacts such as additional documentation, justification, or bibliographic references."
*/
@Entity
@Table(name="relatedartifact")
public class RelatedArtifactModel  implements Serializable {
	private static final long serialVersionUID = 151967883216670436L;
  /**
  * Description: "The type of relationship to the related artifact."
  */
  @javax.persistence.Basic
  @Column(name="\"type\"")
  private String type;

  /**
  * Description: "A brief description of the document or knowledge resource being referenced, suitable for display to a consumer."
  */
  @javax.persistence.Basic
  @Column(name="\"display\"")
  private String display;

  /**
  * Description: "A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format."
  */
  @javax.persistence.Basic
  @Column(name="\"citation\"")
  private String citation;

  /**
  * Description: "A url for the artifact that can be followed to access the actual content."
  */
  @javax.persistence.Basic
  @Column(name="\"url\"")
  private String url;

  /**
  * Description: "The document being referenced, represented as an attachment. This is exclusive with the resource element."
  * Actual type: String;
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"document\"", length = 16777215)
  private String document;

  /**
  * Description: "The related resource, such as a library, value set, profile, or other knowledge resource."
  */
  @javax.persistence.Basic
  @Column(name="\"resource_id\"")
  private String resource_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"db_container_id\"", referencedColumnName="resource_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> resource;

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
  @Column(name="\"db_container_id\"")
  private String db_container_id;

  public RelatedArtifactModel() {
  }

  public RelatedArtifactModel(RelatedArtifact o, String containerId) {
  	this.db_container_id = containerId;
  	if (null == this.id) {
  		this.id = String.valueOf(System.nanoTime() + org.fhir.utils.EntityUtils.generateRandomString(10));
  	}
    this.type = o.getType();
    this.display = o.getDisplay();
    this.citation = o.getCitation();
    this.url = o.getUrl();
    if (null != o.getDocument()) {
    	this.document = JsonUtils.toJson(o.getDocument());
    }
    if (null != o.getResource() ) {
    	this.resource_id = "resource" + this.id;
    	this.resource = ReferenceHelper.toModel(o.getResource(), this.resource_id);
    }
    if (null != o.getExtension()) {
    	this.extension = JsonUtils.toJson(o.getExtension());
    }
  }

  public String getType() {
    return this.type;
  }
  public void setType( String value) {
    this.type = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getCitation() {
    return this.citation;
  }
  public void setCitation( String value) {
    this.citation = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getDocument() {
    return this.document;
  }
  public void setDocument( String value) {
    this.document = value;
  }
  public java.util.List<ReferenceModel> getResource() {
    return this.resource;
  }
  public void setResource( java.util.List<ReferenceModel> value) {
    this.resource = value;
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
  public String getDb_container_id() {
    return this.db_container_id;
  }
  public void setDb_container_id( String value) {
    this.db_container_id = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RelatedArtifactModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("citation" + "->" + this.citation + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("document" + "->" + this.document + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[RelatedArtifactModel]:" + "\n");
     builder.append("type" + "->" + this.type + "\n"); 
     builder.append("display" + "->" + this.display + "\n"); 
     builder.append("citation" + "->" + this.citation + "\n"); 
     builder.append("url" + "->" + this.url + "\n"); 
     builder.append("document" + "->" + this.document + "\n"); 
     builder.append("resource" + "->" + this.resource + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("extension" + "->" + this.extension + "\n"); 
     builder.append("db_container_id" + "->" + this.db_container_id + "\n"); ;
    return builder.toString();
  }
}