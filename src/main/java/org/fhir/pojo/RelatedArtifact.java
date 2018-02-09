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
import org.fhir.entity.RelatedArtifactModel;
import com.google.gson.GsonBuilder;

/**
* "Related artifacts such as additional documentation, justification, or bibliographic references."
*/
public class RelatedArtifact  {
  /**
  * Description: "The type of relationship to the related artifact."
  */
  private String type;

  /**
  * Description: "Extensions for type"
  */
  private transient Element _type;

  /**
  * Description: "A brief description of the document or knowledge resource being referenced, suitable for display to a consumer."
  */
  private String display;

  /**
  * Description: "Extensions for display"
  */
  private transient Element _display;

  /**
  * Description: "A bibliographic citation for the related artifact. This text SHOULD be formatted according to an accepted citation format."
  */
  private String citation;

  /**
  * Description: "Extensions for citation"
  */
  private transient Element _citation;

  /**
  * Description: "A url for the artifact that can be followed to access the actual content."
  */
  private String url;

  /**
  * Description: "Extensions for url"
  */
  private transient Element _url;

  /**
  * Description: "The document being referenced, represented as an attachment. This is exclusive with the resource element."
  */
  private Attachment document;

  /**
  * Description: "The related resource, such as a library, value set, profile, or other knowledge resource."
  */
  private Reference resource;

  /**
  * Description: "unique id for the element within a resource (for internal references). This may be any string value that does not contain spaces."
   derived from Element
  */
  private String id;

  /**
  * Description: "Extensions for id"
   derived from Element
  */
  private transient Element _id;

  /**
  * Description: "May be used to represent additional information that is not part of the basic definition of the element. In order to make the use of extensions safe and manageable, there is a strict set of governance  applied to the definition and use of extensions. Though any implementer is allowed to define an extension, there is a set of requirements that SHALL be met as part of the definition of the extension."
   derived from Element
  */
  private java.util.List<Extension> extension = new java.util.ArrayList<>();

  public RelatedArtifact() {
  }

  public RelatedArtifact(RelatedArtifactModel o) {
    this.id = o.getId();
      if (null != o.getType()) {
        this.type = new String(o.getType());
      }

      if (null != o.getDisplay()) {
        this.display = new String(o.getDisplay());
      }

      if (null != o.getCitation()) {
        this.citation = new String(o.getCitation());
      }

      if (null != o.getUrl()) {
        this.url = new String(o.getUrl());
      }

      this.document = Attachment.fromJson(o.getDocument());
      if (null != o.getResource()) {
        this.resource = new Reference(o.getResource());
        this.resource.setId(this.getId());
      }

      if (null != o.getId()) {
        this.id = new String(o.getId());
      }

      this.extension = Extension.fromArray(o.getExtension());
  }

  public void setType( String value) {
    this.type = TypeEnum.fromCode(value);
  }
  public String getType() {
    return this.type;
  }
  public void set_type( Element value) {
    this._type = value;
  }
  public Element get_type() {
    return this._type;
  }
  public void setDisplay( String value) {
    this.display = value;
  }
  public String getDisplay() {
    return this.display;
  }
  public void set_display( Element value) {
    this._display = value;
  }
  public Element get_display() {
    return this._display;
  }
  public void setCitation( String value) {
    this.citation = value;
  }
  public String getCitation() {
    return this.citation;
  }
  public void set_citation( Element value) {
    this._citation = value;
  }
  public Element get_citation() {
    return this._citation;
  }
  public void setUrl( String value) {
    this.url = value;
  }
  public String getUrl() {
    return this.url;
  }
  public void set_url( Element value) {
    this._url = value;
  }
  public Element get_url() {
    return this._url;
  }
  public void setDocument( Attachment value) {
    this.document = value;
  }
  public Attachment getDocument() {
    return this.document;
  }
  public void setResource( Reference value) {
    this.resource = value;
  }
  public Reference getResource() {
    return this.resource;
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
     builder.append("type" + "[" + String.valueOf(this.type) + "]\n"); 
     builder.append("_type" + "[" + String.valueOf(this._type) + "]\n"); 
     builder.append("display" + "[" + String.valueOf(this.display) + "]\n"); 
     builder.append("_display" + "[" + String.valueOf(this._display) + "]\n"); 
     builder.append("citation" + "[" + String.valueOf(this.citation) + "]\n"); 
     builder.append("_citation" + "[" + String.valueOf(this._citation) + "]\n"); 
     builder.append("url" + "[" + String.valueOf(this.url) + "]\n"); 
     builder.append("_url" + "[" + String.valueOf(this._url) + "]\n"); 
     builder.append("document" + "[" + String.valueOf(this.document) + "]\n"); 
     builder.append("resource" + "[" + String.valueOf(this.resource) + "]\n"); 
     builder.append("id" + "[" + String.valueOf(this.id) + "]\n"); 
     builder.append("_id" + "[" + String.valueOf(this._id) + "]\n"); 
     builder.append("extension" + "[" + String.valueOf(this.extension) + "]\n"); ;
    return builder.toString();
  }

  public enum TypeEnum {
  	documentation,
  	justification,
  	citation,
  	predecessor,
  	successor,
  	derivedfrom,
  	dependson,
  	composedof,
  	UNKNOWN;
  	public static String fromCode(String strVal) {
  		switch (strVal) {
  			case "documentation" : { return documentation.toString(); }
  			case "justification" : { return justification.toString(); }
  			case "citation" : { return citation.toString(); }
  			case "predecessor" : { return predecessor.toString(); }
  			case "successor" : { return successor.toString(); }
  			case "derivedfrom" : { return derivedfrom.toString(); }
  			case "dependson" : { return dependson.toString(); }
  			case "composedof" : { return composedof.toString(); }
  			default:
  			throw new IllegalArgumentException("Unknown resource type ["+ strVal + "]");
  		}
  	}
  }

  public static java.util.List<RelatedArtifact> fromArray(java.util.List<RelatedArtifactModel> list) {
    return (java.util.List<RelatedArtifact>)list.stream()
      .map(model -> new RelatedArtifact(model))
      .collect(java.util.stream.Collectors.toList());
  }

  public static java.util.List<RelatedArtifactModel> toModelArray(java.util.List<RelatedArtifact> list) {
    return (java.util.List<RelatedArtifactModel>)list.stream()
      .map(model -> new RelatedArtifactModel(model))
      .collect(java.util.stream.Collectors.toList());
  }


  public static RelatedArtifact fromJson(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, RelatedArtifact.class);
  }

  public static java.util.List fromArray(String json) {
    if (null == json) return null;
    return new GsonBuilder().create().fromJson(json, java.util.List.class);
  }

  public static String toJson(RelatedArtifact o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }

  public static String toJson(java.util.List<RelatedArtifact> o) {
    if (null == o) return null;
    return new GsonBuilder().create().toJson(o);
  }
}