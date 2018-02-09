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
* "Related artifacts such as additional documentation, justification, or bibliographic references."
*/
@Entity
@Table(name="relatedartifact")
public class RelatedArtifactModel  {
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
  * Actual type: Attachment
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

  @javax.persistence.OneToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.LAZY)
  @javax.persistence.JoinColumn(name = "`resource_id`", insertable=false, updatable=false)
  private ReferenceModel resource;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  @javax.persistence.Id
  @Column(name="\"id\"")
  private String id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  * Actual type: Array of Extension-> List<Extension>
  * Store this type as a string in db
  */
  @javax.persistence.Basic
  @Column(name="\"extension\"", length = 16777215)
  private String extension;

  @javax.persistence.Basic
  @javax.validation.constraints.NotNull
  String parent_id;

  public RelatedArtifactModel() {
  }

  public RelatedArtifactModel(RelatedArtifact o) {
    this.id = o.getId();
      this.type = o.getType();

      this.display = o.getDisplay();

      this.citation = o.getCitation();

      this.url = o.getUrl();

      this.document = Attachment.toJson(o.getDocument());
      if (null != o.getResource()) {
      	this.resource_id = "resource" + this.getId();
        this.resource = new ReferenceModel(o.getResource());
        this.resource.setId(this.resource_id);
        this.resource.parent_id = this.resource.getId();
      }

      this.id = o.getId();

      this.extension = Extension.toJson(o.getExtension());
  }

  public void setType( String value) {
    this.type = value;
  }
  public String getType() {
    return this.type;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void setCitation( String value) {
    this.citation = value;
  }
  public String getCitation() {
    return this.citation;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void setDocument( String value) {
    this.document = value;
  }
  public String getDocument() {
    return this.document;
  }
  public void setResource( ReferenceModel value) {
    this.resource = value;
  }
  public ReferenceModel getResource() {
    return this.resource;
  }
  public void setId( String value) {
    this.id = value;
  }
  public String getId() {
    return this.id;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("display" + "[" + String.valueOf(this.display) + "]\n"); 
     builder.append("citation" + "[" + String.valueOf(this.citation) + "]\n"); 
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("document" + "[" + String.valueOf(this.document) + "]\n"); 
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }
}