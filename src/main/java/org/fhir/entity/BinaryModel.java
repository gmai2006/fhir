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

/**
* "A binary resource can contain any content, whether text, image, pdf, zip archive, etc."
*/
@Entity
@Table(name="fhirbinary")
public class BinaryModel  {
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`securitycontext_id`", insertable=false, updatable=false)
  private ReferenceModel securityContext;

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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`meta_id`", insertable=false, updatable=false)
  private MetaModel meta;

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

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
   derived from Resource
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;


  public BinaryModel() {
  }

  public BinaryModel(Binary o) {
    this.id = o.getId();
      this.resourceType = o.getResourceType();

      this.contentType = o.getContentType();

      if (null != o.getSecurityContext()) {
      	this.securitycontext_id = "securityContext" + this.getId();
        this.securityContext = new ReferenceModel(o.getSecurityContext());
        this.securityContext.setId(this.securitycontext_id);
        this.securityContext.parent_id = this.securityContext.getId();
      }

      this.content = o.getContent();

      this.id = o.getId();

      if (null != o.getMeta()) {
      	this.meta_id = "meta" + this.getId();
        this.meta = new MetaModel(o.getMeta());
        this.meta.setId(this.meta_id);
        this.meta.parent_id = this.meta.getId();
      }

      this.implicitRules = o.getImplicitRules();

      this.language = o.getLanguage();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setResourceType( String value) {
    this.resourceType = value;
  }
  public String getResourceType() {
    return this.resourceType;
  }
  public void setContentType( String value) {
    this.contentType = value;
  }
  public String getContentType() {
    return this.contentType;
  }
  public void setSecurityContext( ReferenceModel value) {
    this.securityContext = value;
  }
  public ReferenceModel getSecurityContext() {
    return this.securityContext;
  }
  public void setContent( String value) {
    this.content = value;
  }
  public String getContent() {
    return this.content;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
  }
  public void setMeta( MetaModel value) {
    this.meta = value;
  }
  public MetaModel getMeta() {
    return this.meta;
  }
  public void setImplicitRules( String value) {
    this.implicitRules = value;
  }
  public String getImplicitRules() {
    return this.implicitRules;
  }
  public void setLanguage( String value) {
    this.language = value;
  }
  public String getLanguage() {
    return this.language;
  }
  public void setExtension( String value) {
    this.extension = value;
  }
  public String getExtension() {
    return this.extension;
  }


  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
     builder.append("resourceType" + "[" + String.valueOf(this.resourceType) + "]\n"); 
     builder.append("contentType" + "[" + String.valueOf(this.contentType) + "]\n"); 
     builder.append("securityContext" + "[" + String.valueOf(this.securityContext) + "]\n"); 
     builder.append("content" + "[" + String.valueOf(this.content) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("meta" + "[" + String.valueOf(this.meta) + "]\n"); 
     builder.append("implicitRules" + "[" + String.valueOf(this.implicitRules) + "]\n"); 
     builder.append("language" + "[" + String.valueOf(this.language) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}