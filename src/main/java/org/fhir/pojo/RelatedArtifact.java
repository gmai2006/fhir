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
  @javax.validation.constraints.NotNull
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
      this.type = o.getType();
    }
    if (null != o.getDisplay()) {
      this.display = o.getDisplay();
    }
    if (null != o.getCitation()) {
      this.citation = o.getCitation();
    }
    if (null != o.getUrl()) {
      this.url = o.getUrl();
    }
    this.document = AttachmentHelper.fromJson(o.getDocument());
    if (null != o.getResource() && !o.getResource().isEmpty()) {
      this.resource = new Reference(o.getResource().get(0));
    }
    if (null != o.getId()) {
      this.id = o.getId();
    }
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
    builder.append("[RelatedArtifact]:" + "\n");
     if(this.type != null) builder.append("type" + "->" + this.type.toString() + "\n"); 
     if(this._type != null) builder.append("_type" + "->" + this._type.toString() + "\n"); 
     if(this.display != null) builder.append("display" + "->" + this.display.toString() + "\n"); 
     if(this._display != null) builder.append("_display" + "->" + this._display.toString() + "\n"); 
     if(this.citation != null) builder.append("citation" + "->" + this.citation.toString() + "\n"); 
     if(this._citation != null) builder.append("_citation" + "->" + this._citation.toString() + "\n"); 
     if(this.url != null) builder.append("url" + "->" + this.url.toString() + "\n"); 
     if(this._url != null) builder.append("_url" + "->" + this._url.toString() + "\n"); 
     if(this.document != null) builder.append("document" + "->" + this.document.toString() + "\n"); 
     if(this.resource != null) builder.append("resource" + "->" + this.resource.toString() + "\n"); 
     if(this.id != null) builder.append("id" + "->" + this.id.toString() + "\n"); 
     if(this._id != null) builder.append("_id" + "->" + this._id.toString() + "\n"); 
     if(this.extension != null) builder.append("extension" + "->" + this.extension.toString() + "\n"); ;
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

}