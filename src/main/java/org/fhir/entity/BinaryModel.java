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
* "A binary resource can contain any content, whether text, image, pdf, zip archive, etc."
*/
@Entity
@Table(name="fhirbinary")
public class BinaryModel  implements Serializable {
	private static final long serialVersionUID = 151910893711547890L;
  /**
  * Description: "This is a Binary resource"
  */
  @javax.validation.constraints.NotNull
  @javax.persistence.Basic
  @Column(name="\"resourceType\"")
  private String resourceType;

  /**
  * Description: "MimeType of the binary content represented as a standard MimeType (BCP 13)."
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"contentType\"")
  private String contentType;

  /**
  * Description: "Treat this binary as if it was this other resource for access control purposes."
  */
  @javax.persistence.Basic
  @Column(name="\"securitycontext_id\"")
  private String securitycontext_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="securitycontext_id", insertable=false, updatable=false)
  private java.util.List<ReferenceModel> securityContext;

  /**
  * Description: "The actual content, base64 encoded."
  */
  @javax.persistence.Basic
  @Column(name="\"content\"")
  private String content;

  /**
  * Description: "The logical id of the resource, as used in the URL for the resource. Once assigned, this value never changes."
   derived from Resource
  */
  @javax.validation.constraints.NotNull
  @javax.validation.constraints.Pattern(regexp="[A-Za-z0-9\\-\\.]{1,64}")
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "The metadata about the resource. This is content that is maintained by the infrastructure. Changes to the content may not always be associated with version changes to the resource."
   derived from Resource
  */
  @javax.persistence.Basic
  @Column(name="\"meta_id\"")
  private String meta_id;

  @javax.persistence.OneToMany(cascade = javax.persistence.CascadeType.ALL)
  @javax.persistence.JoinColumn(name = "\"parent_id\"", referencedColumnName="meta_id", insertable=false, updatable=false)
  private java.util.List<MetaModel> meta;

  /**
  * Description: "A reference to a set of rules that were followed when the resource was constructed, and which must be understood when processing the content."
   derived from Resource
  */
  @javax.persistence.Basic
  @Column(name="\"implicitRules\"")
  private String implicitRules;

  /**
  * Description: "The base language in which the resource is written."
   derived from Resource
  */
  @javax.validation.constraints.Pattern(regexp="[^\\s]+([\\s]?[^\\s]+)*")
  @javax.persistence.Basic
  @Column(name="\"language\"")
  private String language;

  public BinaryModel() {
  }

  public BinaryModel(Binary o) {
  	this.id = o.getId();
    this.resourceType = o.getResourceType();
    this.contentType = o.getContentType();
    if (null != o.getSecurityContext() ) {
    	this.securitycontext_id = "securitycontext" + this.id;
    	this.securityContext = ReferenceHelper.toModel(o.getSecurityContext(), this.securitycontext_id);
    }
    this.content = o.getContent();
    if (null != o.getMeta() ) {
    	this.meta_id = "meta" + this.id;
    	this.meta = MetaHelper.toModel(o.getMeta(), this.meta_id);
    }
    this.implicitRules = o.getImplicitRules();
    this.language = o.getLanguage();
  }

  public String getResourceType() {
    return this.resourceType;
  }
  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getContentType() {
    return this.contentType;
  }
  public void setContentType( String value) {
    this.contentType = value;
  }
  public java.util.List<ReferenceModel> getSecurityContext() {
    return this.securityContext;
  }
  public void setSecurityContext( java.util.List<ReferenceModel> value) {
    this.securityContext = value;
  }
  public String getContent() {
    return this.content;
  }
  public void setContent( String value) {
    this.content = value;
  }
  public String getId() {
    return this.id;
  }
  public void setId( String value) {
    this.id = value;
  }
  public java.util.List<MetaModel> getMeta() {
    return this.meta;
  }
  public void setMeta( java.util.List<MetaModel> value) {
    this.meta = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setLanguage( String value) {
    this.language = value;
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BinaryModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("contentType" + "->" + this.contentType + "\n"); 
     builder.append("content" + "->" + this.content + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }

  public String debug() {
    StringBuilder builder = new StringBuilder();
    builder.append("[BinaryModel]:" + "\n");
     builder.append("resourceType" + "->" + this.resourceType + "\n"); 
     builder.append("contentType" + "->" + this.contentType + "\n"); 
     builder.append("securityContext" + "->" + this.securityContext + "\n"); 
     builder.append("content" + "->" + this.content + "\n"); 
     builder.append("id" + "->" + this.id + "\n"); 
     builder.append("meta" + "->" + this.meta + "\n"); 
     builder.append("implicitRules" + "->" + this.implicitRules + "\n"); 
     builder.append("language" + "->" + this.language + "\n"); ;
    return builder.toString();
  }
}